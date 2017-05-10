package test.bwie.com.jiajianhai20170509.bean;

/**
 * @类的用途:
 * @author:jiajianhai
 * @date:2017/5/9
 */
public class ComicsBean {
    /**
     * info_type : 0
     * can_view : true
     * label_color : #fa6499
     * cover_image_url : http://f2.kkmh.com/image/170220/r4rgj43j5.webp-w640
     * storyboard_cnt : 53
     * created_at : 1487639419
     * title : 第10话  青春期悸动
     * url : http://www.kuaikanmanhua.com/comics/21984
     * likes_count : 640426
     * updated_at : 1487592761
     * selling_kk_currency : 0
     * comments_count : 8735
     * label_text : 恋爱
     * is_free : true
     * push_flag : 1
     * topic : {"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170122/vbcyaje5o.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170118/hoincjblq.webp-w640","update_day":"(每周二更新)","description":"为了离家上学，18岁少女不得不跟青梅竹马展开同居生活，却没想到第一天就被对方壁咚强吻！这难道都是竹马的计划？心跳加速的18岁同居即将开始！【独家/每周二更新  责编：M】\r\n","created_at":1484713197,"title":"18，要不要","update_status":"连载中","updated_at":1484713197,"id":1007,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/default_avatar_image.jpg-w180","grade":1,"nickname":"Aco Momota","reg_type":"author","id":30694394},"label_id":15,"order":400,"comics_count":22}
     * shared_count : 0
     * id : 21984
     * label_text_color : #ffffff
     * serial_no : 0
     * status : published
     * is_liked : false
     */

    private int info_type;
    private boolean can_view;
    private String label_color;
    private String cover_image_url;
    private int storyboard_cnt;
    private int created_at;
    private String title;
    private String url;
    private int likes_count;
    private int updated_at;
    private int selling_kk_currency;
    private int comments_count;
    private String label_text;
    private boolean is_free;
    private int push_flag;
    private TopicBean topic;
    private int shared_count;
    private int id;
    private String label_text_color;
    private int serial_no;
    private String status;
    private boolean is_liked;

    public int getInfo_type() {
        return info_type;
    }

    public void setInfo_type(int info_type) {
        this.info_type = info_type;
    }

    public boolean isCan_view() {
        return can_view;
    }

    public void setCan_view(boolean can_view) {
        this.can_view = can_view;
    }

    public String getLabel_color() {
        return label_color;
    }

    public void setLabel_color(String label_color) {
        this.label_color = label_color;
    }

    public String getCover_image_url() {
        return cover_image_url;
    }

    public void setCover_image_url(String cover_image_url) {
        this.cover_image_url = cover_image_url;
    }

    public int getStoryboard_cnt() {
        return storyboard_cnt;
    }

    public void setStoryboard_cnt(int storyboard_cnt) {
        this.storyboard_cnt = storyboard_cnt;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLikes_count() {
        return likes_count;
    }

    public void setLikes_count(int likes_count) {
        this.likes_count = likes_count;
    }

    public int getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(int updated_at) {
        this.updated_at = updated_at;
    }

    public int getSelling_kk_currency() {
        return selling_kk_currency;
    }

    public void setSelling_kk_currency(int selling_kk_currency) {
        this.selling_kk_currency = selling_kk_currency;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public String getLabel_text() {
        return label_text;
    }

    public void setLabel_text(String label_text) {
        this.label_text = label_text;
    }

    public boolean isIs_free() {
        return is_free;
    }

    public void setIs_free(boolean is_free) {
        this.is_free = is_free;
    }

    public int getPush_flag() {
        return push_flag;
    }

    public void setPush_flag(int push_flag) {
        this.push_flag = push_flag;
    }

    public TopicBean getTopic() {
        return topic;
    }

    public void setTopic(TopicBean topic) {
        this.topic = topic;
    }

    public int getShared_count() {
        return shared_count;
    }

    public void setShared_count(int shared_count) {
        this.shared_count = shared_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel_text_color() {
        return label_text_color;
    }

    public void setLabel_text_color(String label_text_color) {
        this.label_text_color = label_text_color;
    }

    public int getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(int serial_no) {
        this.serial_no = serial_no;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isIs_liked() {
        return is_liked;
    }

    public void setIs_liked(boolean is_liked) {
        this.is_liked = is_liked;
    }
}
