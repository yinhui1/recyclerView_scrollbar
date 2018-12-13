package yiyou.yinhui.sh.cn.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import yiyou.yinhui.sh.cn.myapplication.fastscroll.views.FastScrollRecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    SearchKeywordListAdapter searchKeywordListAdapter;
    private List<String> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView) findViewById(R.id.recyclerView_search_keyword_result_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setOverScrollMode(View.OVER_SCROLL_NEVER);
        initData();
    }

    private void initData(){
        for (int i=0;i<30;i++){
            list.add("这是第"+i+"条数据");
        }
        searchKeywordListAdapter=new SearchKeywordListAdapter(this);
        recyclerView.setAdapter(searchKeywordListAdapter);
        searchKeywordListAdapter.refreshData(list);
    }
}
