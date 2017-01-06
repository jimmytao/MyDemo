package dagger2.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.orhanobut.logger.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import dagger2.bean.LiBean;
import dagger2.bean.TaoBean;
import dagger2.bean.UserBean;
import dagger2.bean.WangBean;
import dagger2.util.ComponentUtil;
import tao.myapplication.R;

/**
 * Created by tao.
 * <p>
 * Created Time : 2017/1/5 10:05.
 * <p>
 * Description : File in  dagger2.view, Project in MyDemo.
 * <p>
 * Content:
 */

public class DaggerActivity extends AppCompatActivity{

    @Inject
    @Named("C")
    UserBean mUserBean1;

    @Inject
    @Named("B")
    UserBean mUserBean2;

    @Inject
    TaoBean mTaobeBean;

    @Inject
    TaoBean mTaobeBean1;

    @Inject
    LiBean mLiBean;

    @Inject
    LiBean mLiBean1;

    @Inject
    WangBean wangBean;

    @Inject
    WangBean wangBean1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDI();

        initData();
    }

    private void initDI() {

        /*如果DraggerActivityModule只有一个默认的无参构造方法(也就是默认不写构造方法的话)，
        我们是可以不用调用draggerActivityModule方法的，而且此时我们还可以用一个更简单的方式来替代，采用create()方法。
        */
       ComponentUtil.getActivityComponent().inject(this);
    }

    private void initData() {

        Logger.d("BaseActivity的桃子1号"+mTaobeBean);
        Logger.d("BaseActivity的桃子2号"+mTaobeBean1);
        Logger.d("BaseActivity的伟哥"+wangBean);
        Logger.d("BaseActivity的伟哥"+wangBean1);
       /* Logger.d("BaseActivity的超狗蛋"+mUserBean1.name);
        Logger.d("BaseActivity的李狗蛋"+mUserBean2.name);*/

/*
        Intent intent = new Intent(this, DaggerActivity1.class);
        startActivity(intent);*/


    }
}
