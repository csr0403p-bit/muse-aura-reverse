package X;

import android.text.TextUtils;
import com.facebook.aura.widgets.WidgetComponentsKt;
import com.google.common.base.Ascii;

/* loaded from: classes5.dex */
public final class E1N {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public static E1N A00(String str) {
        C1G.A07(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int iA0G = -1;
        int iA0G2 = -1;
        int iA0G3 = -1;
        int iA0G4 = -1;
        int iA0G5 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                if (iA0G2 == -1 || iA0G3 == -1 || iA0G5 == -1) {
                    return null;
                }
                return new E1N(iA0G, iA0G2, iA0G3, iA0G4, iA0G5, length);
            }
            String lowerCase = Ascii.toLowerCase(BV6.A0r(strArrSplit, i));
            switch (lowerCase.hashCode()) {
                case 100571:
                    iA0G3 = BV7.A0G("end", lowerCase, iA0G3, i);
                    break;
                case 3556653:
                    iA0G5 = BV7.A0G("text", lowerCase, iA0G5, i);
                    break;
                case 102749521:
                    iA0G = BV7.A0G("layer", lowerCase, iA0G, i);
                    break;
                case 109757538:
                    iA0G2 = BV7.A0G(WidgetComponentsKt.START_PATH, lowerCase, iA0G2, i);
                    break;
                case 109780401:
                    iA0G4 = BV7.A0G("style", lowerCase, iA0G4, i);
                    break;
            }
            i++;
        }
    }

    public E1N(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A01 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A04 = i4;
        this.A05 = i5;
        this.A02 = i6;
    }
}
