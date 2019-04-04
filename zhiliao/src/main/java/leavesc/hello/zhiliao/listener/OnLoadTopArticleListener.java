package leavesc.hello.zhiliao.listener;

import java.util.List;

import leavesc.hello.zhiliao.bean.TopStories;

/**
 * Created by ZY on 2016/7/30.
 * 加载顶部Banner文章事件监听
 */
public interface OnLoadTopArticleListener {

    void onSuccess(List<TopStories> topStoriesList);

    void onFailure();

}
