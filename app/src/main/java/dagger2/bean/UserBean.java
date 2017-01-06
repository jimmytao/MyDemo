package dagger2.bean;

import com.orhanobut.logger.Logger;

/**
 * Created by Administrator on 2016/12/6.
 */

public class UserBean {


    public String name;

    public UserBean() {

    }
    public UserBean(String name) {
        this.name = name;
        Logger.d("create a new user");
    }


}
