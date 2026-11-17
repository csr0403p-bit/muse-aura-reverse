package X;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.aura.R;
import com.google.android.material.datepicker.MaterialCalendarGridView;

/* loaded from: classes6.dex */
public final class FZA extends FTV {
    public final TextView A00;
    public final MaterialCalendarGridView A01;

    public FZA(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.A00 = textView;
        AbstractC8060FRo.A0B(textView, true);
        this.A01 = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
