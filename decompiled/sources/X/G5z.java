package X;

import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryJsonKt;

/* loaded from: classes6.dex */
public abstract class G5z extends Enum<G5z> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "IMMEDIATE_WITH_TIME_PRORATION";
            case 2:
                return "IMMEDIATE_AND_CHARGE_PRORATED_PRICE";
            case 3:
                return "IMMEDIATE_WITHOUT_PRORATION";
            case 4:
                return AuraSubscriptionRepositoryJsonKt.PENDING_PLAN_CHANGE_DEFERRED;
            case 5:
                return "IMMEDIATE_AND_CHARGE_FULL_PRICE";
            default:
                return "UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY";
        }
    }
}
