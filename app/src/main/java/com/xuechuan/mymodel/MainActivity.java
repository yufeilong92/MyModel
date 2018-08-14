package com.xuechuan.mymodel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.xuechuan.mymodel.迭代.Impl.NameRepository;
import com.xuechuan.mymodel.迭代.IteratorA;
import com.xuechuan.mymodel.代理.ProxyImage;
import com.xuechuan.mymodel.桥接.ACircle;
import com.xuechuan.mymodel.桥接.DrawAPIImpl.GreenCircle;
import com.xuechuan.mymodel.桥接.DrawAPIImpl.RedCircle;
import com.xuechuan.mymodel.FFactory.AbstractFactory;
import com.xuechuan.mymodel.抽象工厂.ColorFactory;
import com.xuechuan.mymodel.抽象工厂.ShapeFactory;
import com.xuechuan.mymodel.解释.JSFactoty;
import com.xuechuan.mymodel.解释.OrExpression;
import com.xuechuan.mymodel.解释.TerminalExpression;
import com.xuechuan.mymodel.命令.Broker;
import com.xuechuan.mymodel.命令.BuyStock;
import com.xuechuan.mymodel.命令.RunStock;
import com.xuechuan.mymodel.命令.SellStock;
import com.xuechuan.mymodel.命令.Stock;
import com.xuechuan.mymodel.组合.Employee;
import com.xuechuan.mymodel.责任.AbstractLogger;
import com.xuechuan.mymodel.责任.ChainPatternDemo;
import com.xuechuan.mymodel.装饰.ZSimpl.CircleB;
import com.xuechuan.mymodel.装饰.ZSimpl.RectangleB;
import com.xuechuan.mymodel.装饰.ZSimpl.RedShapeDecorator;
import com.xuechuan.mymodel.原型.Shape;
import com.xuechuan.mymodel.原型.WeigthColor;
import com.xuechuan.mymodel.原型.Circle;
import com.xuechuan.mymodel.原型.Rectangle;
import com.xuechuan.mymodel.原型.Square;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mButton;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;
    private Button mButton8;
    private Button mButton9;
    private Button mButton10;
    private Button mButton11;
    private Button mButton12;
    private Button mButton13;
    private Button mButton14;
    private Button mButton15;
    private Button mButton16;
    private Button mButton17;
    private Button mButton18;
    private Button mButton19;
    private Button mButton20;
    private Button mButton21;
    private Button mButton22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();

    }

    private void initData() {

    }

    private void initView() {
        mButton = (Button) findViewById(R.id.button);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton3 = (Button) findViewById(R.id.button3);
        mButton4 = (Button) findViewById(R.id.button4);
        mButton5 = (Button) findViewById(R.id.button5);

        mButton.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
        mButton6 = (Button) findViewById(R.id.button6);
        mButton6.setOnClickListener(this);
        mButton7 = (Button) findViewById(R.id.button7);
        mButton7.setOnClickListener(this);
        mButton8 = (Button) findViewById(R.id.button8);
        mButton8.setOnClickListener(this);
        mButton9 = (Button) findViewById(R.id.button9);
        mButton9.setOnClickListener(this);
        mButton10 = (Button) findViewById(R.id.button10);
        mButton10.setOnClickListener(this);
        mButton11 = (Button) findViewById(R.id.button11);
        mButton11.setOnClickListener(this);
        mButton12 = (Button) findViewById(R.id.button12);
        mButton12.setOnClickListener(this);
        mButton13 = (Button) findViewById(R.id.button13);
        mButton13.setOnClickListener(this);
        mButton14 = (Button) findViewById(R.id.button14);
        mButton14.setOnClickListener(this);
        mButton15 = (Button) findViewById(R.id.button15);
        mButton15.setOnClickListener(this);
        mButton16 = (Button) findViewById(R.id.button16);
        mButton16.setOnClickListener(this);
        mButton17 = (Button) findViewById(R.id.button17);
        mButton17.setOnClickListener(this);
        mButton18 = (Button) findViewById(R.id.button18);
        mButton18.setOnClickListener(this);
        mButton19 = (Button) findViewById(R.id.button19);
        mButton19.setOnClickListener(this);
        mButton20 = (Button) findViewById(R.id.button20);
        mButton20.setOnClickListener(this);
        mButton21 = (Button) findViewById(R.id.button21);
        mButton21.setOnClickListener(this);
        mButton22 = (Button) findViewById(R.id.button22);
        mButton22.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Shape cirle = getShape("Circle");
                cirle.draw();
                break;
            case R.id.button2:
                Shape cirle1 = getShape("Rectangle");
                cirle1.draw();
                break;
            case R.id.button3:
                Shape cirle2 = getShape("Square");
                cirle2.draw();
                break;
            case R.id.button4:
                AbstractFactory color = getFactory("color");
                WeigthColor red = color.getColor("red");
                red.fill();
                WeigthColor green = color.getColor("green");
                green.fill();
                WeigthColor blue = color.getColor("blue");
                blue.fill();
                break;
            case R.id.button5:
                AbstractFactory shape = getFactory("shape");
                Shape circle = shape.getShape("circle");
                circle.draw();
                Shape square = shape.getShape("square");
                square.draw();
                Shape rectangle = shape.getShape("rectangle");
                rectangle.draw();
                break;
            case R.id.button6:
                ACircle circle1 = new ACircle(new GreenCircle(), 10, 20, 10);
                circle1.draw();
                ACircle circle2 = new ACircle(new RedCircle(), 10, 10, 10);
                circle2.draw();
                break;
            case R.id.button7:
                zhFactory();
                break;
            case R.id.button8:
                ZSfactory();
                break;
            case R.id.button9:
                Difactory();
                break;
            case R.id.button10:
                ZRfactory();
                break;
            case R.id.button11:
                MlFactory();
                break;
            case R.id.button12:
                JSfactoty();
                break;
            case R.id.button13:
                Ddfactory();
                break;
            case R.id.button14:
                break;
            case R.id.button15:
                break;
            case R.id.button16:
                break;
            case R.id.button17:
                break;
            case R.id.button18:
                break;
            case R.id.button19:
                break;
            case R.id.button20:
                break;
            case R.id.button21:
                break;
            case R.id.button22:
                break;
        }
    }

    private void Ddfactory() {
        NameRepository repository= new NameRepository();
        for (IteratorA iter= repository.getInterator();iter.hasNext();){
            String next = (String) iter.next();
            Log.e(TAG, "迭代模式== "+next );
        }
    }

    private JSFactoty JSfactoty() {
        TerminalExpression robert = new TerminalExpression("Robert");
        TerminalExpression john = new TerminalExpression("john");
        return new OrExpression(robert, john);
    }

    private void MlFactory() {
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        Broker broker = new Broker();
        SellStock sellStock = new SellStock(stock);
        RunStock runStock = new RunStock(stock);
        broker.takerOrder(buyStock);
        broker.takerOrder(sellStock);
        broker.takerOrder(runStock);
        broker.placeOrders();

    }

    private void ZRfactory() {
        AbstractLogger logger = ChainPatternDemo.getChainOfLoggers();
//        logger.logMessage(AbstractLogger.INFO,"infom错误");
        logger.logMessage(AbstractLogger.ERROR, "error错误");
//        logger.logMessage(AbstractLogger.DEBUG,"debug错误");
    }

    private void Difactory() {
        ProxyImage text = new ProxyImage("text");
        text.dispaly();
    }

    private void ZSfactory() {
        CircleB circleB = new CircleB();
        RedShapeDecorator decorator = new RedShapeDecorator(new CircleB());
        RedShapeDecorator shapeDecorator = new RedShapeDecorator(new RectangleB());
        decorator.draw();
        shapeDecorator.draw();
    }

    public Shape getShape(String shapetype) {
        if (shapetype == null || shapetype.equals("")) return null;
        if (shapetype.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapetype.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapetype.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }

    public AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("shape"))
            return new ShapeFactory();
        if (factory.equalsIgnoreCase("color"))
            return new ColorFactory();
        return null;
    }

    private void zhFactory() {
        Employee ceo = new Employee("小米", "CEO", 3000);

        Employee headSales = new Employee("小马哥", "HeadSales", 2000);

        Employee xiao = new Employee("小值", "xiao", 1000);

        Employee a1 = new Employee("小明", "A", 800);
        Employee a2 = new Employee("小狗", "A", 800);

        ceo.add(headSales);
        ceo.add(xiao);
        xiao.add(a1);
        xiao.add(a2);

        List<Employee> employees = ceo.getSuboridnates();
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            Log.e(TAG, "ceo 下面员工: " + employee.toString());
            List<Employee> suboridnates = employee.getSuboridnates();
            if (suboridnates != null && !suboridnates.isEmpty()) {
                for (int k = 0; k < suboridnates.size(); k++) {
                    Employee employee1 = suboridnates.get(k);
                    Log.e(TAG, employee.toString() + "下面的员工 " + employee1.toString());
                }
            }
        }
    }
}
