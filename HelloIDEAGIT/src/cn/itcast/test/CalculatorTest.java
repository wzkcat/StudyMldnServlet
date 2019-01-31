package cn.itcast.test;
import cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /**
     * 初始化 方法
     * 用于资源申请，所有测试方法在执行之前都会先执行该方法
     */
    @Before
    public void init(){
        System.out.println("init....");
    }

    /**
     * 释放资源方法
     * 在所有测试方法执行完，都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("close...");
    }
    @Test
    public void testAdd(){
        //System.out.println("这里执行了！");
        //1.创建计算器对象
        Calculator c=new Calculator();
        //2.调用add方法
        int result=c.add(1,2);
       // System.out.println(result);
        //3.断言 我断言这个结果是3
        Assert.assertEquals(3,result);
    }
    @Test
    public void testSub(){
        Calculator c=new Calculator();
        int result=c.sub(2,1);
        System.out.println("testSub()...");
        Assert.assertEquals(1,result);
    }


}
