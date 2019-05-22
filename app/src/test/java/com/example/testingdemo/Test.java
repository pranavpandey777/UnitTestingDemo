package com.example.testingdemo;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;

public class Test {

    MainActivity mainActivity;

    @Before

    public  void first(){
        mainActivity=new MainActivity();

    }


    @org.junit.Test
    public void addition(){
        int ans=mainActivity.Addition(2,2);


        Assert.assertThat(ans, CoreMatchers.is(CoreMatchers.equalTo(4)));

    }
}
