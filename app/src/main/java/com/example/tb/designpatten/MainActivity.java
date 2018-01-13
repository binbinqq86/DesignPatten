package com.example.tb.designpatten;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.tb.designpatten.builder.Director;
import com.example.tb.designpatten.builder.base.Builder;
import com.example.tb.designpatten.builder.subclass.TbBuilder;
import com.example.tb.designpatten.decorator.concretedecorator.DoorDecorator;
import com.example.tb.designpatten.decorator.abstractcomponent.House;
import com.example.tb.designpatten.decorator.concretecomponent.MyHouse;
import com.example.tb.designpatten.decorator.concretedecorator.WindowDecorator;
import com.example.tb.designpatten.factory.abstractfactory.Factory1;
import com.example.tb.designpatten.factory.abstractfactory.Factory2;
import com.example.tb.designpatten.factory.factorymethod.FactoryInChina;
import com.example.tb.designpatten.factory.factorymethod.FactoryInIndia;
import com.example.tb.designpatten.factory.factorymethod.FactoryMethod;
import com.example.tb.designpatten.factory.simplefactory.SimpleFactory;
import com.example.tb.designpatten.observer.concreteobserver.Parent0;
import com.example.tb.designpatten.observer.concreteobserver.Parent1;
import com.example.tb.designpatten.observer.concretesubject.Teacher;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test5();
    }

    public void test5(){
        Builder builder=new TbBuilder();
        Director director=new Director(builder);
        director.construct(6,"欧美","hz");
        Log.e(TAG, "test5: "+builder.create().toString() );
    }

    public void test4(){
        Factory1 factory1=new Factory1();
        factory1.getCpu().printInfo();
        factory1.getMemory().printInfo();

        Factory2 factory2=new Factory2();
        factory2.getCpu().printInfo();
        factory2.getMemory().printInfo();
    }

    public void test3(){
        FactoryMethod factoryMethod=new FactoryInChina();
        factoryMethod.createPhone("mi2");

        factoryMethod=new FactoryInIndia();
        factoryMethod.createPhone("iphone8");
    }
    public void test2(){
        SimpleFactory simpleFactory=new SimpleFactory();
        simpleFactory.createPhone("mi33");
    }

    private void test(){
        Teacher teacher=new Teacher();
        Parent0 p0=new Parent0(teacher);
        Parent1 p1=new Parent1(teacher);
        teacher.sendMessage("通知：五一国际劳动节放假三天。。。");

    }

    public void test1(){
        House house=new MyHouse();
        house=new WindowDecorator(house);
        house=new DoorDecorator(house);
        Log.e("Decorator:",house.getDescription());
    }

}
