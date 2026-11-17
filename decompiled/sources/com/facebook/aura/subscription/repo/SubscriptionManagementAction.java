package com.facebook.aura.subscription.repo;

import X.C06H;
import X.C3cG;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SubscriptionManagementAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SubscriptionManagementAction[] $VALUES;
    public static final SubscriptionManagementAction BUY_TOPUP;
    public static final SubscriptionManagementAction CANCEL;
    public static final SubscriptionManagementAction CHANGE_PLAN;
    public static final SubscriptionManagementAction CLAIM_META_HOME_LINK;
    public static final Companion Companion;
    public static final SubscriptionManagementAction DISMISS;
    public static final SubscriptionManagementAction MANAGE_BILLING;
    public static final SubscriptionManagementAction OPEN_PAYWALL;
    public static final SubscriptionManagementAction OPEN_URL;
    public static final SubscriptionManagementAction PURCHASE;
    public static final SubscriptionManagementAction REACTIVATE;
    public static final SubscriptionManagementAction REDEEM_COMPLIMENTARY;
    public static final SubscriptionManagementAction REFRESH;

    public final class Companion {
        public Companion() {
        }

        public final SubscriptionManagementAction fromServerValue(String str) {
            SubscriptionManagementAction next;
            Iterator<SubscriptionManagementAction> it = SubscriptionManagementAction.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.name().equalsIgnoreCase(str)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        SubscriptionManagementAction subscriptionManagementAction = new SubscriptionManagementAction("OPEN_PAYWALL", 0);
        OPEN_PAYWALL = subscriptionManagementAction;
        SubscriptionManagementAction subscriptionManagementAction2 = new SubscriptionManagementAction("CHANGE_PLAN", 1);
        CHANGE_PLAN = subscriptionManagementAction2;
        SubscriptionManagementAction subscriptionManagementAction3 = new SubscriptionManagementAction("PURCHASE", 2);
        PURCHASE = subscriptionManagementAction3;
        SubscriptionManagementAction subscriptionManagementAction4 = new SubscriptionManagementAction("BUY_TOPUP", 3);
        BUY_TOPUP = subscriptionManagementAction4;
        SubscriptionManagementAction subscriptionManagementAction5 = new SubscriptionManagementAction("MANAGE_BILLING", 4);
        MANAGE_BILLING = subscriptionManagementAction5;
        SubscriptionManagementAction subscriptionManagementAction6 = new SubscriptionManagementAction("CANCEL", 5);
        CANCEL = subscriptionManagementAction6;
        SubscriptionManagementAction subscriptionManagementAction7 = new SubscriptionManagementAction("REACTIVATE", 6);
        REACTIVATE = subscriptionManagementAction7;
        SubscriptionManagementAction subscriptionManagementAction8 = new SubscriptionManagementAction("OPEN_URL", 7);
        OPEN_URL = subscriptionManagementAction8;
        SubscriptionManagementAction subscriptionManagementAction9 = new SubscriptionManagementAction("REFRESH", 8);
        REFRESH = subscriptionManagementAction9;
        SubscriptionManagementAction subscriptionManagementAction10 = new SubscriptionManagementAction("CLAIM_META_HOME_LINK", 9);
        CLAIM_META_HOME_LINK = subscriptionManagementAction10;
        SubscriptionManagementAction subscriptionManagementAction11 = new SubscriptionManagementAction("REDEEM_COMPLIMENTARY", 10);
        REDEEM_COMPLIMENTARY = subscriptionManagementAction11;
        SubscriptionManagementAction subscriptionManagementAction12 = new SubscriptionManagementAction("DISMISS", 11);
        DISMISS = subscriptionManagementAction12;
        SubscriptionManagementAction[] subscriptionManagementActionArr = {subscriptionManagementAction, subscriptionManagementAction2, subscriptionManagementAction3, subscriptionManagementAction4, subscriptionManagementAction5, subscriptionManagementAction6, subscriptionManagementAction7, subscriptionManagementAction8, subscriptionManagementAction9, subscriptionManagementAction10, subscriptionManagementAction11, subscriptionManagementAction12};
        $VALUES = subscriptionManagementActionArr;
        $ENTRIES = C3cG.A0w(subscriptionManagementActionArr);
        Companion = new Companion();
    }

    public static Ey9<SubscriptionManagementAction> getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionManagementAction valueOf(String str) {
        return (SubscriptionManagementAction) Enum.valueOf(SubscriptionManagementAction.class, str);
    }

    public static SubscriptionManagementAction[] values() {
        return (SubscriptionManagementAction[]) $VALUES.clone();
    }

    public SubscriptionManagementAction(String str, int i) {
    }
}
