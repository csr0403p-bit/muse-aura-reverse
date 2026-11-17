package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class I0Y implements View.OnClickListener {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public I0Y(C8254Faa c8254Faa) {
        this.$t = 1;
        this.A01 = c8254Faa;
        Context context = c8254Faa.A09.getContext();
        CharSequence charSequence = c8254Faa.A0C;
        C8268Faq c8268Faq = new C8268Faq();
        c8268Faq.A02 = 4096;
        c8268Faq.A01 = 4096;
        c8268Faq.A04 = null;
        c8268Faq.A05 = null;
        c8268Faq.A09 = false;
        c8268Faq.A0A = false;
        c8268Faq.A00 = 16;
        c8268Faq.A03 = context;
        c8268Faq.A07 = charSequence;
        this.A00 = c8268Faq;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar;
        int iA1W;
        Function0<Unit> function0;
        switch (this.$t) {
            case 0:
                ((AbstractC8280Fb4) this.A01).A00();
                return;
            case 1:
                C8254Faa c8254Faa = (C8254Faa) this.A01;
                Window.Callback callback = c8254Faa.A07;
                if (callback == null || !c8254Faa.A0D) {
                    return;
                }
                callback.onMenuItemSelected(0, (C8268Faq) this.A00);
                return;
            case 2:
                if (!HuJ.A00((Context) this.A00) || (function0 = ((C7983FOa) this.A01).A03) == null) {
                    return;
                }
                function0.invoke();
                return;
            case 3:
                materialCalendar = (MaterialCalendar) this.A00;
                iA1W = ((LinearLayoutManager) materialCalendar.A02.A0H).A1W() + 1;
                if (iA1W >= materialCalendar.A02.A0F.A03()) {
                    return;
                }
                break;
            default:
                materialCalendar = (MaterialCalendar) this.A00;
                iA1W = ((LinearLayoutManager) materialCalendar.A02.A0H).A1X() - 1;
                if (iA1W < 0) {
                    return;
                }
                break;
        }
        Calendar calendarA00 = FZ8.A00(((FZ0) this.A01).A02.A04.A05);
        calendarA00.add(2, iA1W);
        materialCalendar.A00(new Month(calendarA00));
    }

    public I0Y(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj2;
    }
}
