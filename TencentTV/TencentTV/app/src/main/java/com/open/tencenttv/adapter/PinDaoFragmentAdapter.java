package com.open.tencenttv.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.open.tencenttv.R;

import java.util.List;

/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 16/11/3
 * @version:
 * @modifyTime:
 * @modifyAuthor:
 * @description: ****************************************************************************************************************************************************************************
 */
public class PinDaoFragmentAdapter extends BaseAdapter {
    private List<String> mDatas;
    private final LayoutInflater mInflater;
    public PinDaoFragmentAdapter(Context context, List<String> data) {
        mDatas = data;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.adapter_pindao_fragment, parent, false);
            convertView.setTag(new ViewHolder(convertView));
        }
        viewHolder = (ViewHolder) convertView.getTag();
        bindViewData(position, viewHolder);
        return convertView;
    }

    private void bindViewData(int position, ViewHolder viewHolder) {
        String title = mDatas.get(position);
        viewHolder.titleTv.setText(title);
    }

    class ViewHolder {
        View itemView;
        TextView titleTv;

        public ViewHolder(View view) {
            this.itemView = view;
            this.titleTv = (TextView) view.findViewById(R.id.textView);
        }
    }
}