//汽车类 父类：车牌号、品牌、日租金
public abstract class Cars {

    private  String id;
    private String type;
    private int dayMoney;

    //计算总租金的方法
    public abstract void getMoney(int dayNum);

    //无参构造方法
    public Cars() {
    }

    //带参构造方法
    public Cars(String id, String type, int dayMoney) {
        this.id = id;
        this.type = type;
        this.dayMoney = dayMoney;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDayMoney() {
        return dayMoney;
    }

    public void setDayMoney(int dayMoney) {
        this.dayMoney = dayMoney;
    }
}

