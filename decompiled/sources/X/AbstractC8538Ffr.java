package X;

import android.view.View;
import java.util.Iterator;

/* renamed from: X.Ffr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8538Ffr {
    public final C8542Ffv A00;

    public final boolean A02() {
        C8542Ffv c8542Ffv = this.A00;
        View view = c8542Ffv.A07.mView;
        Integer numA01 = view != null ? AbstractC8523FfY.A01(view) : null;
        Integer num = c8542Ffv.A00;
        if (numA01 == num) {
            return true;
        }
        Integer num2 = C79.A01;
        return (numA01 == num2 || num == num2) ? false : true;
    }

    public AbstractC8538Ffr(C8542Ffv c8542Ffv) {
        this.A00 = c8542Ffv;
    }

    public static C8542Ffv A00(Iterator it) {
        return ((AbstractC8538Ffr) it.next()).A00;
    }
}
