package com.facebook.aura.subscription.repo;

import X.C06H;
import X.C3cG;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class SubscriptionConfirmationIcon {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SubscriptionConfirmationIcon[] $VALUES;
    public static final SubscriptionConfirmationIcon CONFIDENTIAL_VM;
    public static final Companion Companion;
    public static final SubscriptionConfirmationIcon TOKENS;

    public final class Companion {
        public final SubscriptionConfirmationIcon fromServerValue(String str) {
            SubscriptionConfirmationIcon next;
            Iterator<SubscriptionConfirmationIcon> it = SubscriptionConfirmationIcon.getEntries().iterator();
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

        public Companion() {
        }
    }

    static {
        SubscriptionConfirmationIcon subscriptionConfirmationIcon = new SubscriptionConfirmationIcon("CONFIDENTIAL_VM", 0);
        CONFIDENTIAL_VM = subscriptionConfirmationIcon;
        SubscriptionConfirmationIcon subscriptionConfirmationIcon2 = new SubscriptionConfirmationIcon("TOKENS", 1);
        TOKENS = subscriptionConfirmationIcon2;
        SubscriptionConfirmationIcon[] subscriptionConfirmationIconArr = {subscriptionConfirmationIcon, subscriptionConfirmationIcon2};
        $VALUES = subscriptionConfirmationIconArr;
        $ENTRIES = C3cG.A0w(subscriptionConfirmationIconArr);
        Companion = new Companion();
    }

    public static Ey9<SubscriptionConfirmationIcon> getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionConfirmationIcon valueOf(String str) {
        return (SubscriptionConfirmationIcon) Enum.valueOf(SubscriptionConfirmationIcon.class, str);
    }

    public static SubscriptionConfirmationIcon[] values() {
        return (SubscriptionConfirmationIcon[]) $VALUES.clone();
    }

    public SubscriptionConfirmationIcon(String str, int i) {
    }
}
