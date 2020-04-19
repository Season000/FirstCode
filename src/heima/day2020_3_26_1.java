package heima;

import java.util.Scanner;
//
//考虑这样一个问题， 电话簿中包含有很多联系人， 可以添加、删除联系人，修改联系人的手机号，并统计电话薄中共有多少联系人，设计 电话簿 和 联系人 类，以实现上述功能。以下为详细说明:
//
//        1. 联系人包含以下属性: name(姓名)、tel(电话)、email(邮件)、关系（relation），联系人类中仅有一个构造函数，且实例化一个联系人时需要传入联系人的4个属性信息。
//
//        2. 联系人类中每个属性都有 setter 和 getter 方法
//
//        3. 电话薄中以联系人姓名为索引
//
//        4. 假设一个联系人仅有一个tel, email
//
//        5. 删除电话簿中的联系人时，根据name 搜索删除
//
//        6. 往电话簿中添加，删除联系人时，如果成功，返回true, 否则，返回false
class people{
    private String name;
    private String tel;
    private String email;
    private String relation;

    public people(String name, String tel, String email, String relation) {
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.relation = relation;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public String getRelation() {
        return relation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }
}
public class day2020_3_26_1 {
    public static void main(String[] args) {

    }


}
