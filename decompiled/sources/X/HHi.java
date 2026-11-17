package X;

import com.facebook.systrace.Systrace;

/* loaded from: classes6.dex */
public abstract class HHi {
    public void A00() {
        HHg hHg = (HHg) this;
        long j = hHg.A00;
        String str = hHg.A03;
        HHh hHh = hHg.A01;
        if (Systrace.A09(j)) {
            Systrace.A08(str, hHh.A01, hHh.A00, j);
        }
    }

    public void A01(Object obj, String str) {
        HHh hHh = ((HHg) this).A01;
        String strValueOf = String.valueOf(obj);
        String[] strArr = hHh.A01;
        int length = strArr.length;
        int i = hHh.A00;
        if (length - i < 2) {
            String[] strArr2 = new String[length * 2];
            hHh.A01 = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, i);
        }
        String[] strArr3 = hHh.A01;
        int i2 = hHh.A00;
        int i3 = i2 + 1;
        hHh.A00 = i3;
        strArr3[i2] = str;
        hHh.A00 = i2 + 2;
        strArr3[i3] = strValueOf;
    }
}
