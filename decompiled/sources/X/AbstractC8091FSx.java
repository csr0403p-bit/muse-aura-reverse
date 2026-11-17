package X;

import X.FTV;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;

/* renamed from: X.FSx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8091FSx<VH extends FTV> {
    public final FFM A01 = new FFM();
    public boolean A00 = false;

    public final int A03() {
        return this instanceof C8207FYz ? ((C8207FYz) this).A00.A04.A02 : this instanceof FZ0 ? ((FZ0) this).A02.A01 : ((FFL) this).A03.size();
    }

    public final long A04(int i) {
        if (this instanceof FZ0) {
            Calendar calendarA00 = FZ8.A00(((FZ0) this).A02.A04.A05);
            calendarA00.add(2, i);
            return new Month(calendarA00).A05.getTimeInMillis();
        }
        if (this instanceof FFL) {
            return FFL.A01((FFL) this, i).A01.A04;
        }
        return -1L;
    }
}
