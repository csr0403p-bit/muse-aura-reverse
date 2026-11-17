package com.facebook.aura.subscription.repo;

import X.C06H;
import X.C3cG;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SubscriptionChangeDirection {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SubscriptionChangeDirection[] $VALUES;
    public static final SubscriptionChangeDirection CROSSGRADE;
    public static final Companion Companion;
    public static final SubscriptionChangeDirection DOWNGRADE;
    public static final SubscriptionChangeDirection UNKNOWN;
    public static final SubscriptionChangeDirection UPGRADE;

    static {
        SubscriptionChangeDirection subscriptionChangeDirection = new SubscriptionChangeDirection("UPGRADE", 0);
        UPGRADE = subscriptionChangeDirection;
        SubscriptionChangeDirection subscriptionChangeDirection2 = new SubscriptionChangeDirection(AuraSubscriptionRepositoryJsonKt.PENDING_PLAN_CHANGE_DOWNGRADE, 1);
        DOWNGRADE = subscriptionChangeDirection2;
        SubscriptionChangeDirection subscriptionChangeDirection3 = new SubscriptionChangeDirection("CROSSGRADE", 2);
        CROSSGRADE = subscriptionChangeDirection3;
        SubscriptionChangeDirection subscriptionChangeDirection4 = new SubscriptionChangeDirection("UNKNOWN", 3);
        UNKNOWN = subscriptionChangeDirection4;
        SubscriptionChangeDirection[] subscriptionChangeDirectionArr = {subscriptionChangeDirection, subscriptionChangeDirection2, subscriptionChangeDirection3, subscriptionChangeDirection4};
        $VALUES = subscriptionChangeDirectionArr;
        $ENTRIES = C3cG.A0w(subscriptionChangeDirectionArr);
        Companion = new Companion();
    }

    public static Ey9<SubscriptionChangeDirection> getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionChangeDirection valueOf(String str) {
        return (SubscriptionChangeDirection) Enum.valueOf(SubscriptionChangeDirection.class, str);
    }

    public static SubscriptionChangeDirection[] values() {
        return (SubscriptionChangeDirection[]) $VALUES.clone();
    }

    public final class Companion {
        public final SubscriptionChangeDirection fromServerValue(String str) {
            SubscriptionChangeDirection subscriptionChangeDirection = null;
            if (str == null) {
                return null;
            }
            Iterator<SubscriptionChangeDirection> it = SubscriptionChangeDirection.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SubscriptionChangeDirection next = it.next();
                if (next.name().equalsIgnoreCase(str)) {
                    subscriptionChangeDirection = next;
                    break;
                }
            }
            SubscriptionChangeDirection subscriptionChangeDirection2 = subscriptionChangeDirection;
            return subscriptionChangeDirection2 == null ? SubscriptionChangeDirection.UNKNOWN : subscriptionChangeDirection2;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SubscriptionChangeDirection(String str, int i) {
    }
}
