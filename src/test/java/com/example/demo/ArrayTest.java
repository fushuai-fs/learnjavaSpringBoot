package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArrayTest {

    ///使用索引访问用String的split方法得到的数组时，需做最后一个分隔符后有无内容的检查，否则会有抛IndexOutOfBoundsException的风险
    @Test
    public void stringArrayTest(){

        String str = "a,b,c,,";
        String[] ary = str.split(",");
        // 预期大于3，结果是3
        System.out.println(ary.length);
        for(int i=0,j=ary.length;i<j;i++ ){
            System.out.println(ary[i]);
        }
    }
}
