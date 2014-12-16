package com.child.manage.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.child.manage.R;
import com.child.manage.entity.kecheng;
import com.child.manage.entity.shipu;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

import java.util.List;

/**
 * author: liuzwei
 * Date: 2014/7/31
 * Time: 14:19
 * 类的功能、说明写在此处.
 */
public class KechengAdapter extends BaseAdapter {
    private ViewHolder holder;
    private List<kecheng> list;
    private Context context;

    private ImageLoadingListener animateFirstListener = new AnimateFirstDisplayListener();

    private OnClickContentItemListener onClickContentItemListener;
    ImageLoader imageLoader = ImageLoader.getInstance();//图片加载类

    public KechengAdapter(List<kecheng> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public void setOnClickContentItemListener(OnClickContentItemListener onClickContentItemListener) {
        this.onClickContentItemListener = onClickContentItemListener;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.kecheng_item, null);
            holder.datetime = (TextView) convertView.findViewById(R.id.datetime);
            holder.onetime = (TextView) convertView.findViewById(R.id.onetime);
            holder.twotime = (TextView) convertView.findViewById(R.id.twotime);
            holder.threetime = (TextView) convertView.findViewById(R.id.threetime);
            holder.fourtime = (TextView) convertView.findViewById(R.id.fourtime);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        final kecheng cell = list.get(position);
        holder.datetime.setText(cell.getDatetime());
        holder.onetime.setText(cell.getOnetime());
        holder.twotime.setText(cell.getTwotime());
        holder.threetime.setText(cell.getThreetime());
        holder.fourtime.setText(cell.getFourtime());

        return convertView;
    }


    class ViewHolder {
        TextView datetime;
        TextView onetime;
        TextView twotime;
        TextView threetime;
        TextView fourtime;
    }

}
