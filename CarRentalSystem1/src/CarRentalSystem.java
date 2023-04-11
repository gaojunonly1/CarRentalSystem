import java.util.Scanner;
//汽车租赁管理类
public class CarRentalSystem {
    public static void main(String[] args) {

        //1.创建汽车对象集合并赋值（初始化集合，将8辆车存入集合中）
        carBusiness carBusiness = new carBusiness();
        carBusiness.init();

        //2.创建scanner对象
        Scanner sc = new Scanner(System.in);

        //3.定义用户需要输入的信息
        String pingPai=" ";
        String type=" ";
        String seatNum="";

        //4.系统显示和用户输入
        System.out.println("*********欢迎光临秋名山守望者汽车租赁公司*********");
        System.out.println("1、轿车\t2、客车");
        System.out.print("请选择你要租赁的汽车类型：");
        int choseCarType = sc.nextInt();
        //轿车
        if (choseCarType==1){
            System.out.print("请选择你要租赁的汽车品牌：(1、别克\t2、宝马)");
            int carType = sc.nextInt();
            pingPai=(carType==1)?"别克":"宝马";

            if (carType==1){ //别克
                System.out.print("请选择你要租赁的汽车型号：（1、林荫大道\t2、GL8）");
                int brandNum = sc.nextInt();
                type=(brandNum==1)?"林荫大道":"GL8";
            }else if (carType==2){//宝马
                System.out.print("请选择你要租赁的汽车型号：（1、X6\t2、550i）");
                int brandNum = sc.nextInt();
                type=(brandNum==1)?"X6":"550i";
            }else{
                System.out.println("输入错误！请输入正确的汽车品牌。");
            }

        }else if (choseCarType==2){
            //客车
            System.out.print("请选择你要租赁的汽车品牌：（1、金龙\t2、金杯）");
            int carType = sc.nextInt();
            pingPai=(carType==1)?"金龙":"金杯";
            if (carType==1||carType==2){
                System.out.print("请选择你要租赁的汽车座位数：（1、16座\t2、34座）");
                int brandNum = sc.nextInt();
                seatNum=(brandNum==1)?"16座":"34座";
            }else{
                System.out.println("输入错误！请输入正确的汽车品牌。");
            }
        }else{
            System.out.println("输入错误！请选择正确的汽车类型。");
        }

        //5定义父类的对象并调用业务类的查找方法，返回汽车牌号
        Cars moto=carBusiness.find(pingPai, type, seatNum);
        System.out.print("请输入您租赁的天数：");
        int dayNum=sc.nextInt();
        System.out.println("分配给您的汽车牌号是："+moto.getId());

        //6.调用计算总租金的方法，返回汽车租赁的总费用
        moto.getMoney(dayNum);
    }
}