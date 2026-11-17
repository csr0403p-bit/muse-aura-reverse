package X;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.963, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class AnonymousClass963 {
    public static final String A00(BFM bfm, C9Tm c9Tm) {
        String strA0w;
        bfm.AgE(-768201044);
        Float f = c9Tm.A02;
        if (f == null) {
            AnonymousClass002.A19(bfm);
            return null;
        }
        Integer num = c9Tm.A05;
        if (num == null) {
            bfm.AgE(-1891396969);
            Locale locale = AKO.A02(AndroidCompositionLocals_androidKt.A00, (BBI) bfm).get(0);
            C7384Etj.A0U(locale);
            strA0w = String.format(locale, "%.1f", Arrays.copyOf(new Object[]{f}, 1));
        } else {
            bfm.AgE(-1891327870);
            strA0w = AnonymousClass006.A0w(bfm, f, num, R.string._name_removed__res_0x7f120e5f);
        }
        BBI.A0R(C3cG.A07(bfm), false);
        return strA0w;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0286  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.BFM r52, X.BRg r53, X.AnonymousClass965 r54, X.C8ni r55, X.C9Tm r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass963.A01(X.BFM, X.BRg, X.965, X.8ni, X.9Tm, int, int):void");
    }
}
