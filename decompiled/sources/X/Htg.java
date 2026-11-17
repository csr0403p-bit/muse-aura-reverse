package X;

import com.facebook.aura.pairs.PairsPendingLevelStoreKt;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class Htg {
    public static final Map A00(HoL hoL, Integer num) {
        String str;
        Object objA0K;
        HxG hxG;
        C7384Etj.A0Y(hoL, 1);
        switch (num.intValue()) {
            case 0:
                str = "resolved_sync";
                break;
            case 1:
                str = "resolved_async";
                break;
            case 2:
                str = "failed";
                break;
            default:
                str = PairsPendingLevelStoreKt.STATE_PENDING;
                break;
        }
        HxE hxEA0r = C3cG.A0r("resolution_type", str);
        Hr8 hr8 = hoL instanceof FAY ? ((FAY) hoL).A00 : hoL.A00;
        HxE hxEA0r2 = C3cG.A0r("response_summary", AnonymousClass007.A0d("annotations", hr8.A00, C3cG.A0r("points", hr8.A01)));
        if (!(hoL instanceof Hnp) || (hxG = ((Hnp) hoL).A00) == null) {
            objA0K = C9jH.A00;
        } else {
            C0924AIa c0924AIa = new C0924AIa();
            Integer num2 = hxG.A00;
            if (num2 != null) {
                c0924AIa.put("errorCode", num2);
            }
            String str2 = hxG.A01;
            if (str2 != null) {
                c0924AIa.put("errorMessage", str2);
            }
            objA0K = AIW.A0K(c0924AIa);
        }
        return C3cH.A0m("error_info", objA0K, hxEA0r, hxEA0r2);
    }
}
