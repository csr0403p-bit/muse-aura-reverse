package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.aura.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class FZ3 extends BaseAdapter {
    public final int A00;
    public final int A01;
    public final Calendar A02;

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout._name_removed__res_0x7f0d0295, viewGroup, false);
        }
        Calendar calendar = this.A02;
        int i2 = i + this.A01;
        int i3 = this.A00;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string._name_removed__res_0x7f120cfe), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A00;
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        int i2 = this.A00;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.A01;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public FZ3() {
        Calendar calendarA0y = AbstractC7609F5w.A0y();
        this.A02 = calendarA0y;
        this.A00 = calendarA0y.getMaximum(7);
        this.A01 = calendarA0y.getFirstDayOfWeek();
    }
}
