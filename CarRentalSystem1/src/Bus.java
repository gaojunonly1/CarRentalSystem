//客车类：车牌号、品牌、日租金、座位数
public class Bus extends Cars {

    //座位数
    private String seatNum;

    //无参构造方法
    public Bus() {
    }

    //带参构造方法
    public Bus(String id, String type, int dayMoney, String seatNum) {
        super(id, type, dayMoney);
        this.seatNum = seatNum;
    }

    //重写父类计算租金的方法:根据自己的计算租金的规则
    @Override
    public void getMoney(int dayNum) {
        double money=0;
        money=dayNum*this.getDayMoney();
        if (dayNum>=150){
            money*=0.6;
        }else if (dayNum>=30){
            money*=0.7;
        }else if (dayNum>=7){
            money*=0.8;
        }else if (dayNum>=3){
            money*=0.9;
        }
        System.out.println("您需要支付的租赁费用是："+money+"元。");
    }


    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }
}
