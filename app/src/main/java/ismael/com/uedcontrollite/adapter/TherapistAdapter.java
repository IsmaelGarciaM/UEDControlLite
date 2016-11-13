package ismael.com.uedcontrollite.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import ismael.com.uedcontrollite.R;
import ismael.com.uedcontrollite.model.Therapist;
import ismael.com.uedcontrollite.repositories.TherapistRepository;

/**
 * Created by ismael on 13/11/16.
 */

public class TherapistAdapter extends ArrayAdapter<Therapist> {

    public TherapistAdapter(Context context) {
        super(context, R.layout.item_activity, TherapistRepository.getInstance().subList(0, TherapistRepository.getInstance().size()));
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item = convertView;
        TherapistHolder ch;

        if (item == null) {
            LayoutInflater ltInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            item = ltInflater.inflate(R.layout.item_activity, null);
            ch = new TherapistHolder();
            ch.txvName = (TextView) item.findViewById(R.id.txvInfoActivity);
            item.setTag(ch);
        } else
            ch = (TherapistHolder) item.getTag();

        ch.txvName.setText(getItem(position).toString());

        return item;

    }

    class TherapistHolder {
        TextView txvName;
    }
}
