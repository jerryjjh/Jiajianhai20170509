package test.bwie.com.jiajianhai20170509.bean;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/5/9
 */
public class UserBean {
    /**
     * pub_feed : 0
     * avatar_url : http://f2.kkmh.com/default_avatar_image.jpg-w180
     * grade : 1
     * nickname : Aco Momota
     * reg_type : author
     * id : 30694394
     */

    private int pub_feed;
    private String avatar_url;
    private int grade;
    private String nickname;
    private String reg_type;
    private int id;

    public int getPub_feed() {
        return pub_feed;
    }

    public void setPub_feed(int pub_feed) {
        this.pub_feed = pub_feed;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getReg_type() {
        return reg_type;
    }

    public void setReg_type(String reg_type) {
        this.reg_type = reg_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
