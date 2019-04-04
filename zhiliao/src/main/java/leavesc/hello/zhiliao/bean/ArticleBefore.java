package leavesc.hello.zhiliao.bean;

import java.util.List;

/**
 * Created by ZY on 2016/7/27.
 * 过往文章，链接后缀加上日期即可获取内容
 * 链接：http://news.at.zhihu.com/api/4/news/before/20160728
 */
public class ArticleBefore {

    private String date;

    private List<leavesc.hello.zhiliao.bean.Stories> stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<leavesc.hello.zhiliao.bean.Stories> getStories() {
        return stories;
    }

    public void setStories(List<leavesc.hello.zhiliao.bean.Stories> stories) {
        this.stories = stories;
    }

}
