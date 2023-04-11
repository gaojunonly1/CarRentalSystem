import java.util.LinkedList;

//汽车业务类
public class carBusiness {

    //1.创建LinkedList集合并赋值
    public   LinkedList<Cars> carsList = new LinkedList();
    public void init(){
        carsList.add(new jiaoCar("京NY28588","宝马",800,"X6"));
        carsList.add(new jiaoCar("京CNY3284","宝马",600,"550i"));
        carsList.add(new jiaoCar("京NT37465","别克",300,"林荫大道"));
        carsList.add(new jiaoCar("京NT96968","别克",600,"GL8"));
        carsList.add(new Bus("京6566754","金杯",800,"16座"));
        carsList.add(new Bus("京8696997","金龙",800,"16座"));
        carsList.add(new Bus("京9696996","金杯",1500,"34座"));
        carsList.add(new Bus("京8696998","金龙",1500,"34座"));
    }

    //2.查找租赁汽车的方法
    public Cars find(String pingPai,String type,String seatNum) {
        Cars moto=null;
        for(Cars mymoto:carsList) {
            if(mymoto instanceof jiaoCar) {
                jiaoCar cat=(jiaoCar)mymoto;
                //轿车
                if(cat.getType().equals(pingPai)&&cat.getBrand().equals(type)) {
                    moto=cat;
                    break;
                }
            }else if(mymoto instanceof Bus) {
                Bus bus=(Bus)mymoto;
                //客车
                if(bus.getType().equals(pingPai)&&bus.getSeatNum()==(seatNum)) {
                    moto=bus;
                    break;
                }
            }
        }
        return moto;
    }
}

