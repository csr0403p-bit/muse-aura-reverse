package X;

import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class Hi9 {
    public ArrayList<C9836Gia> A00;
    public final Hi9 A01;
    public final Class<?> A02;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("[ClassStack (self-refs: ");
        ArrayList<C9836Gia> arrayList = this.A00;
        sbA0x.append(arrayList == null ? HatchPriceImpressionEventDataKt.NO_DISCOUNT : String.valueOf(arrayList.size()));
        sbA0x.append(')');
        do {
            sbA0x.append(' ');
            BV6.A18(this.A02, sbA0x);
            this = this.A01;
        } while (this != null);
        return BV5.A0o(sbA0x);
    }

    public Hi9(Hi9 hi9, Class<?> cls) {
        this.A01 = hi9;
        this.A02 = cls;
    }
}
