package injextion.presentation;



import injextion.dao.IDao;
import injextion.metier.IMetier;

import java.io.File;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Prancipal {
    public static void main(String[] args) throws Exception {

        Scanner scanner=new Scanner(new File("src/config.txt")) ;

        String classDaoName=scanner.next();
        String classMetierName=scanner.next();
        System.out.println("\n"+classMetierName);

        Class cDao=Class.forName(classDaoName);
        IDao dao=(IDao) cDao.getDeclaredConstructor().newInstance();


        Class cMetier=Class.forName(classMetierName);

        IMetier metier=(IMetier) cMetier.getDeclaredConstructor().newInstance();

        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println("le calcule est ==> "+metier.calcule());



    }
}
