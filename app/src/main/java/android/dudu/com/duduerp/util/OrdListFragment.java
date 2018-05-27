package android.dudu.com.duduerp.util;

import android.dudu.com.duduerp.R;
import android.dudu.com.duduerp.db.Ord;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ASUS on 2018/5/27.
 */

public class OrdListFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ord_list_frag,container,false);
        return view;
    }

    class OrdsAdapter extends RecyclerView.Adapter<OrdsAdapter.ViewHolder>{
        private List<Ord> mOrdsList;
        class ViewHolder extends RecyclerView.ViewHolder{
            TextView newsOrdcontent;
            public ViewHolder(View view){
                super(view);
                newsOrdcontent = (TextView)view.findViewById(R.id.ord_content);
            }
        }

        public OrdsAdapter(List<Ord> ordsList){
            mOrdsList = ordsList;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.ord_item,parent,false);
            final ViewHolder holder = new ViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            Ord ord = mOrdsList.get(position);
            holder.newsOrdcontent.setText('ceshi');
        }

        @Override
        public int getItemCount() {
            return mOrdsList.size();
        }
    }
}
