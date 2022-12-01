package injextion.external;

import injextion.dao.IDao;

public class DaoImplV2  implements IDao {
    @Override
    public double getParam() {
        System.out.println(" donnets vient d'une BD");
        return 6.5;
    }
}
