package X;

import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModelKt;

/* renamed from: X.Hoi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10519Hoi extends Enum<AbstractC10519Hoi> {
    public final String serverValue;

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "APPLE";
            case 2:
                return "BILLING";
            case 3:
                return "EXTERNAL_PROVIDER_STRIPE";
            case 4:
                return "FB";
            case 5:
                return AuraSubscriptionUsageViewModelKt.GOOGLE_PURCHASE_PLATFORM;
            case 6:
                return C8j2.A00(54);
            case 7:
                return "OC";
            case 8:
                return "UNKNOWN";
            default:
                return "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
        }
    }
}
