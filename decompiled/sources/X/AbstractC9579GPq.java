package X;

import com.facebook.aura.perf.HatchNavTTRCSpec;
import java.util.Map;

/* renamed from: X.GPq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9579GPq {
    public static final C9580GPr A00(EnumC9706GeK enumC9706GeK, Integer num, String str) {
        String str2;
        int i;
        String strValueOf = null;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str2 = "The product or subscription is not available for purchase.";
                    break;
                case 2:
                    str2 = "This error occurs when Google Billing experiences an error in their service.";
                    break;
                case 3:
                    str2 = "This error occurs when a network issue prevents the purchase from being processed by Google.";
                    break;
                case 4:
                    str2 = "This error occurs when a recent purchase action is likely pending fulfillment such that the server and local client are not in sync. A user is attempting to re-purchase a product they should already be granted.";
                    break;
                case 5:
                    str2 = "This error may occur when attempting to consume/update a purchase that is not owned by the user. ";
                    break;
                case 6:
                    str2 = "This error occurs when a billing error has occurred. This usually means the user need to update their Play Store/Google Service";
                    break;
                case 7:
                    str2 = "This payment method does not have enough funds. Try another payment method.";
                    break;
                default:
                    str2 = "The user has canceled the purchase to abort the transaction. Payment is not received and no entitlement will be granted.";
                    break;
            }
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        String strName = enumC9706GeK != null ? enumC9706GeK.name() : "";
        if (str == null) {
            str = "";
        }
        String strA0h = FGI.A0h(str2, " Billing Response Code: ", strName, " Debugging Message:", str);
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    i = 4054005;
                    break;
                case 2:
                    i = 4054006;
                    break;
                case 3:
                    i = 4054004;
                    break;
                case 4:
                    i = 4054009;
                    break;
                case 5:
                    i = 4054011;
                    break;
                case 6:
                    i = 4054008;
                    break;
                case 7:
                    i = 4054037;
                    break;
                default:
                    i = 4054001;
                    break;
            }
            strValueOf = String.valueOf(i);
        }
        return new C9580GPr(strValueOf, strA0h);
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;LX/HoG;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>; */
    public static final void A01(InterfaceC10512HoG interfaceC10512HoG, Map map) {
        C7384Etj.A0Y(interfaceC10512HoG, 1);
        EnumC9706GeK enumC9706GeKAJk = interfaceC10512HoG.AJk();
        C9581GPs c9581GPsAJJ = interfaceC10512HoG.AJJ();
        C9580GPr c9580GPrA00 = A00(enumC9706GeKAJk, (c9581GPsAJJ != null ? c9581GPsAJJ.A01 : null) == C79.A01 ? C79.A0Y : HlI.A00(enumC9706GeKAJk), interfaceC10512HoG.AEf());
        map.put(HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, c9580GPrA00.A01);
        map.put("error_code", c9580GPrA00.A00);
    }
}
