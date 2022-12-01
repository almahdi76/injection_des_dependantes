package injextion.dao;

public class DaoImpl  implements IDao{
    @Override
    public double getParam() {
        System.out.println(" donnets vient d'une capteur");
        return 7.8;
    }
}
