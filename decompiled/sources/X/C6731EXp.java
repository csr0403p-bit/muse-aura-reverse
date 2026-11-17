package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.EXp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6731EXp extends EY1 {
    public static final Reader A04 = new EXK();
    public static final Object A05 = C3cG.A0T();
    public int A00;
    public int[] A01;
    public Object[] A02;
    public String[] A03;

    public static Object A00(C6731EXp c6731EXp) {
        Object[] objArr = c6731EXp.A02;
        int i = c6731EXp.A00 - 1;
        c6731EXp.A00 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public static String A01(C6731EXp c6731EXp, boolean z) {
        StringBuilder sbA0x = C60O.A0x("$");
        int i = 0;
        while (true) {
            int i2 = c6731EXp.A00;
            if (i >= i2) {
                return sbA0x.toString();
            }
            Object[] objArr = c6731EXp.A02;
            Object obj = objArr[i];
            if (obj instanceof JsonArray) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = c6731EXp.A01[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sbA0x.append('[');
                    sbA0x.append(i3);
                    sbA0x.append(']');
                }
            } else if ((obj instanceof JsonObject) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sbA0x.append('.');
                String str = c6731EXp.A03[i];
                if (str != null) {
                    sbA0x.append(str);
                }
            }
            i++;
        }
    }

    public static void A03(C6731EXp c6731EXp, Object obj) {
        int i = c6731EXp.A00;
        Object[] objArr = c6731EXp.A02;
        if (i == objArr.length) {
            int i2 = i * 2;
            c6731EXp.A02 = Arrays.copyOf(objArr, i2);
            c6731EXp.A01 = Arrays.copyOf(c6731EXp.A01, i2);
            c6731EXp.A03 = (String[]) Arrays.copyOf(c6731EXp.A03, i2);
        }
        Object[] objArr2 = c6731EXp.A02;
        int i3 = c6731EXp.A00;
        c6731EXp.A00 = i3 + 1;
        objArr2[i3] = obj;
    }

    public static void A02(C6731EXp c6731EXp, Integer num) {
        if (c6731EXp.A0R() == num) {
            return;
        }
        String strA00 = EY2.A00(num);
        Integer numA0R = c6731EXp.A0R();
        throw EY1.A07(c6731EXp, strA00, numA0R != null ? EY2.A00(numA0R) : HatchCcvLoggingKt.NO_POSTAL_FIELD);
    }

    @Override // X.EY1
    public final String toString() {
        return FGI.A0M(C3cI.A0Y(this), FGI.A0M(" at path ", A01(this, false)));
    }
}
