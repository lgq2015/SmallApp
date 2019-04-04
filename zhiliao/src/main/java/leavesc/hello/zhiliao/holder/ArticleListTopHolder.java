package leavesc.hello.zhiliao.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import leavesc.hello.zhiliao.R;
import leavesc.hello.zhiliao.view.Banner;

/**
 * Created by ZY on 2016/7/30.
 * 文章顶部Banner
 */
public class ArticleListTopHolder extends RecyclerView.ViewHolder {

    public Banner banner;

    public ArticleListTopHolder(View itemView) {
        super(itemView);
        banner = (Banner) itemView.findViewById(R.id.banner);
    }

}

