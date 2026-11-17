package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.BQs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2271BQs {
    public static final String A02(BFM bfm, Object[] objArr, int i) {
        C7384Etj.A0Y(objArr, 1);
        BBI bbi = (BBI) bfm;
        Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, bbi);
        Configuration configuration = (Configuration) AKO.A07(AndroidCompositionLocals_androidKt.A00, bbi);
        String strAgV = ((BRn) AKO.A07(BPD.A00, bbi)).AgV(contextA00, i);
        Locale locale = configuration.getLocales().get(0);
        C7384Etj.A0U(locale);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, strAgV, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final String A00(int i, Object[] objArr, BFM bfm, int i2) throws Resources.NotFoundException {
        String quantityString = ((Resources) AKO.A07(AndroidCompositionLocals_androidKt.A04, (BBI) bfm)).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
        C7384Etj.A0U(quantityString);
        return quantityString;
    }

    public static final String A01(BFM bfm, int i) {
        BBI bbi = (BBI) bfm;
        return ((BRn) AKO.A08(BPD.A00, BBI.A04(bbi))).AgV((Context) AKO.A08(AndroidCompositionLocals_androidKt.A01, BBI.A04(bbi)), i);
    }
}
