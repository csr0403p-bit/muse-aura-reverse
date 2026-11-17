package X;

import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import java.util.Map;

/* renamed from: X.Hkp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10476Hkp {
    public static String A00(FDW fdw) {
        int i;
        int i2 = fdw.A05;
        if (AnonymousClass002.A1Q(i2, 13647)) {
            i = 40;
        } else {
            if (i2 != 13784) {
                throw C60O.A0i("screen should be an instance of BloksScreenData or BloksScreenV2Data");
            }
            i = 45;
        }
        String strA0F = fdw.A0F(i);
        return strA0F != null ? strA0F : HatchPriceImpressionEventDataKt.NO_DISCOUNT;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FDW;LX/F6D;I)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>; */
    public static Map A01(F6D f6d, FDW fdw, int i) {
        HsM hsMA0D;
        Map map;
        return (fdw == null || (hsMA0D = fdw.A0D(i)) == null || (map = (Map) AbstractC7691FAk.A00(f6d, Hj6.A02, hsMA0D)) == null) ? BV4.A0u() : map;
    }
}
