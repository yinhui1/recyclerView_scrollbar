package yiyou.yinhui.sh.cn.myapplication;

import android.content.Context;
import android.widget.TextView;


/**
 * 搜索关键字列表界面的适配器
 */

public class SearchKeywordListAdapter<T> extends BaseRecycleAdapter<T> {

    public SearchKeywordListAdapter(Context context) {
        super(context);
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_listview_search_keyword;
    }

    @Override
    protected void bindData(BaseViewHolder holder, int position) {
        TextView textView=(TextView)holder.getView(R.id.tv_name);

        String search_keyWord = (String)mDataList.get(position);
        textView.setText(search_keyWord);
    }

}
