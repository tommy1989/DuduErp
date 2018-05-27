package android.dudu.com.duduerp;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by ASUS on 2018/5/26.
 */

@SuppressLint("ValidFragment")
public class FirstFragment extends Fragment {
    private String context;
    private TextView mTextView;
    public FirstFragment(String context){
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment,container,false);
        mTextView = (TextView)view.findViewById(R.id.txt_content);
        mTextView.setText(context);
        return view;
    }
}
