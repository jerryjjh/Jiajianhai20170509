package test.bwie.com.jiajianhai20170509.bean;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/5/9
 */
public class TopicBean {
    /**
     * discover_image_url :
     * vertical_image_url : http://f2.kkmh.com/image/170122/vbcyaje5o.webp-w320
     * cover_image_url : http://f2.kkmh.com/image/170118/hoincjblq.webp-w640
     * update_day : (每周二更新)
     * description : 为了离家上学，18岁少女不得不跟青梅竹马展开同居生活，却没想到第一天就被对方壁咚强吻！这难道都是竹马的计划？心跳加速的18岁同居即将开始！【独家/每周二更新  责编：M】

     * created_at : 1484713197
     * title : 18，要不要
     * update_status : 连载中
     * updated_at : 1484713197
     * id : 1007
     * user : {"pub_feed":0,"avatar_url":"http://f2.kkmh.com/default_avatar_image.jpg-w180","grade":1,"nickname":"Aco Momota","reg_type":"author","id":30694394}
     * label_id : 15
     * order : 400
     * comics_count : 22
     */

    private String discover_image_url;
    private String vertical_image_url;
    private String cover_image_url;
    private String update_day;
    private String description;
    private int created_at;
    private String title;
    private String update_status;
    private int updated_at;
    private int id;
    private UserBean user;
    private int label_id;
    private int order;
    private int comics_count;

    public String getDiscover_image_url() {
        return discover_image_url;
    }

    public void setDiscover_image_url(String discover_image_url) {
        this.discover_image_url = discover_image_url;
    }

    public String getVertical_image_url() {
        return vertical_image_url;
    }

    public void setVertical_image_url(String vertical_image_url) {
        this.vertical_image_url = vertical_image_url;
    }

    public String getCover_image_url() {
        return cover_image_url;
    }

    public void setCover_image_url(String cover_image_url) {
        this.cover_image_url = cover_image_url;
    }

    public String getUpdate_day() {
        return update_day;
    }

    public void setUpdate_day(String update_day) {
        this.update_day = update_day;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreated_at() {
        return created_at;
    }

    public void setCreated_at(int created_at) {
        this.created_at = created_at;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdate_status() {
        return update_status;
    }

    public void setUpdate_status(String update_status) {
        this.update_status = update_status;
    }

    public int getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(int updated_at) {
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public int getLabel_id() {
        return label_id;
    }

    public void setLabel_id(int label_id) {
        this.label_id = label_id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getComics_count() {
        return comics_count;
    }

    public void setComics_count(int comics_count) {
        this.comics_count = comics_count;
    }
}
