package android.dudu.com.duduerp;

import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import org.litepal.tablemanager.Connector;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView topBar;
    private TextView tabOrd;
    private TextView tabGoods;
    private TextView tabClient;
    private TextView tabStat;

    private FrameLayout ly_content;

    private FirstFragment f1,f2,f3,f4;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        bindView();
        tabOrd.setSelected(true);
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        if(f1 == null){
            f1 = new FirstFragment("第一个Fragment");
            transaction.add(R.id.fragment_container,f1);
        } else {
            transaction.show(f1);
        }
        transaction.commit();
    }

    //UI组件初始化与事件绑定
    private void bindView(){
        topBar = (TextView)this.findViewById(R.id.txt_top);
        tabOrd = (TextView)this.findViewById(R.id.txt_ord);
        tabGoods = (TextView)this.findViewById(R.id.txt_goods);
        tabClient = (TextView)this.findViewById(R.id.txt_client);
        tabStat = (TextView)this.findViewById(R.id.txt_stat);

        ly_content = (FrameLayout) findViewById(R.id.fragment_container);
        tabOrd.setOnClickListener(this);
        tabGoods.setOnClickListener(this);
        tabClient.setOnClickListener(this);
        tabStat.setOnClickListener(this);
    }

    public void hideAllFragment(FragmentTransaction transaction){
        if(f1!=null){
            transaction.hide(f1);
        }
        if(f2!=null){
            transaction.hide(f2);
        }
        if(f3!=null){
            transaction.hide(f3);
        }
        if(f4!=null){
            transaction.hide(f4);
        }
    }

    public void selected(){
        tabOrd.setSelected(false);
        tabGoods.setSelected(false);
        tabClient.setSelected(false);
        tabStat.setSelected(false);
    }

    @Override
    public void onClick(View v){
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        hideAllFragment(transaction);
        switch (v.getId()){
            case R.id.txt_ord:
                selected();
                tabOrd.setSelected(true);
                if(f1 == null){
                    f1 = new FirstFragment("第一个Fragment");
                    transaction.add(R.id.fragment_container,f1);
                } else {
                    transaction.show(f1);
                }
                break;
            case R.id.txt_goods:
                selected();
                tabGoods.setSelected(true);
                if(f2 == null){
                    f2 = new FirstFragment("第二个Fragment");
                    transaction.add(R.id.fragment_container,f2);
                } else {
                    transaction.show(f2);
                }
                break;
            case R.id.txt_client:
                selected();
                tabClient.setSelected(true);
                if(f3 == null){
                    f3 = new FirstFragment("第三个Fragment");
                    transaction.add(R.id.fragment_container,f3);
                } else {
                    transaction.show(f3);
                }
                break;
            case R.id.txt_stat:
                selected();
                tabStat.setSelected(true);
                if(f4 == null){
                    f4 = new FirstFragment("最后个Fragment");
                    transaction.add(R.id.fragment_container,f4);
                } else {
                    transaction.show(f4);
                }
                break;
        }
        transaction.commit();
    }
}
