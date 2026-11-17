package com.facebook.aura.subscription.repo;

import X.AnonymousClass002;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SubscriptionBillingInterval {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SubscriptionBillingInterval[] $VALUES;
    public static final Companion Companion;
    public static final SubscriptionBillingInterval DAY;
    public static final SubscriptionBillingInterval MINUTE;
    public static final SubscriptionBillingInterval MONTH;
    public static final SubscriptionBillingInterval WEEK;
    public static final SubscriptionBillingInterval YEAR;

    static {
        SubscriptionBillingInterval subscriptionBillingInterval = new SubscriptionBillingInterval("MINUTE", 0);
        MINUTE = subscriptionBillingInterval;
        SubscriptionBillingInterval subscriptionBillingInterval2 = new SubscriptionBillingInterval("DAY", 1);
        DAY = subscriptionBillingInterval2;
        SubscriptionBillingInterval subscriptionBillingInterval3 = new SubscriptionBillingInterval("WEEK", 2);
        WEEK = subscriptionBillingInterval3;
        SubscriptionBillingInterval subscriptionBillingInterval4 = new SubscriptionBillingInterval("MONTH", 3);
        MONTH = subscriptionBillingInterval4;
        SubscriptionBillingInterval subscriptionBillingInterval5 = new SubscriptionBillingInterval("YEAR", 4);
        YEAR = subscriptionBillingInterval5;
        SubscriptionBillingInterval[] subscriptionBillingIntervalArr = {subscriptionBillingInterval, subscriptionBillingInterval2, subscriptionBillingInterval3, subscriptionBillingInterval4, subscriptionBillingInterval5};
        $VALUES = subscriptionBillingIntervalArr;
        $ENTRIES = C3cG.A0w(subscriptionBillingIntervalArr);
        Companion = new Companion();
    }

    public static Ey9<SubscriptionBillingInterval> getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionBillingInterval valueOf(String str) {
        return (SubscriptionBillingInterval) Enum.valueOf(SubscriptionBillingInterval.class, str);
    }

    public static SubscriptionBillingInterval[] values() {
        return (SubscriptionBillingInterval[]) $VALUES.clone();
    }

    public final class Companion {
        public final SubscriptionBillingInterval fromServerValue(String str) {
            String strA0l;
            SubscriptionBillingInterval subscriptionBillingInterval = null;
            if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null) {
                return null;
            }
            Locale locale = Locale.ROOT;
            C7384Etj.A0V(locale);
            String upperCase = strA0l.toUpperCase(locale);
            Iterator<SubscriptionBillingInterval> it = SubscriptionBillingInterval.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SubscriptionBillingInterval next = it.next();
                if (next.name().equals(upperCase)) {
                    subscriptionBillingInterval = next;
                    break;
                }
            }
            return subscriptionBillingInterval;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SubscriptionBillingInterval(String str, int i) {
    }
}
