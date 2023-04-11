//轿车类:车牌号、品牌、日租金、型号
public class jiaoCar extends Cars {

    //型号
    private String brand;

    //无参构造方法
    public jiaoCar() {
    }

    //有参构造方法
    public jiaoCar(String id, String type, int dayMoney, String brand) {
        super(id, type, dayMoney);
        this.brand = brand;
    }
    //重写父类计算租金的方法:根据自己的计算租金的规则
    @Override
    public void getMoney(int dayNum) {
        double money=0;
        money=dayNum*this.getDayMoney();
        if (dayNum>150){
            money*=0.7;
        }else if (dayNum>30){
            money*=0.8;
        }else if (dayNum>=7){
            money*=0.9;
        }
        System.out.println("您需要支付的租赁费用是："+money+"元。");
    }

    public jiaoCar(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

