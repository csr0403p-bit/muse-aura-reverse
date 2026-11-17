package com.facebook.aura.subscription.repo;

import X.AGI;
import X.AHD;
import X.BFI;
import X.C3cG;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class AuraSubscriptionRepositoryJsonKt {
    public static final String CHANGE_ACTION_CANCEL = "cancel";
    public static final String CHANGE_ACTION_REACTIVATE = "reactivate";
    public static final String COMPLIMENTARY_SUBSCRIPTION_TYPE = "COMPLIMENTARY";
    public static final String DEPLETED_QUOTA_STATUS = "DEPLETED";
    public static final String NO_REQUIRED_PARAM = "";
    public static final String PENDING_PLAN_CHANGE_DOWNGRADE = "DOWNGRADE";
    public static final String PROVISIONING_STATUS = "PROVISIONING";
    public static final String TAG = "AuraSubscriptionRepositoryJson";
    public static final String PENDING_PLAN_CHANGE_DEFERRED = "DEFERRED";
    public static final Set<String> SETTLED_CHANGE_STATUSES = BFI.A0H(new String[]{"COMPLETED", "CANCELED", PENDING_PLAN_CHANGE_DEFERRED, "NO_OP"});

    public static final SubscriptionManagementActions withoutComplimentaryRedeem(SubscriptionManagementActions subscriptionManagementActions) {
        AHD<SubscriptionManagementCta> ahd = subscriptionManagementActions.rows;
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : ahd) {
            if (((SubscriptionManagementCta) obj).action != SubscriptionManagementAction.REDEEM_COMPLIMENTARY) {
                arrayListA0h.add(obj);
            }
        }
        AHD ahdA07 = AGI.A07(arrayListA0h);
        SubscriptionManagementCta subscriptionManagementCta = subscriptionManagementActions.primaryCta;
        if (subscriptionManagementCta == null || subscriptionManagementCta.action == SubscriptionManagementAction.REDEEM_COMPLIMENTARY) {
            subscriptionManagementCta = null;
        }
        return new SubscriptionManagementActions(ahdA07, subscriptionManagementCta);
    }
}
