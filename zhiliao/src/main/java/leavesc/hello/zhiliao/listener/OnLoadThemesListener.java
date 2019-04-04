package leavesc.hello.zhiliao.listener;

import java.util.List;

import leavesc.hello.zhiliao.bean.Others;

/**
 * Created by ZY on 2016/7/28.
 * 加载文章主题列表事件监听
 */
public interface OnLoadThemesListener {

    void onSuccess(List<Others> othersList);

    void onFailure();

}
