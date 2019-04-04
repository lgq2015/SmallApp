package leavesc.hello.zhiliao.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import leavesc.hello.zhiliao.R;

/**
 * Created by ZY on 2016/7/29.
 * 正在加载
 */
public class ArticleListFooterHolder extends RecyclerView.ViewHolder {

    public TextView footerTitle;

    public ArticleListFooterHolder(View itemView) {
        super(itemView);
        footerTitle = (TextView) itemView.findViewById(R.id.footerTitle);
    }

}
