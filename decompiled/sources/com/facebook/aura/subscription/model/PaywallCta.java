package com.facebook.aura.subscription.model;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PaywallCta {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PaywallCta[] $VALUES;
    public static final PaywallCta CurrentPlan;
    public static final PaywallCta Downgrade;
    public static final PaywallCta PayNow;
    public static final PaywallCta Upgrade;

    static {
        PaywallCta paywallCta = new PaywallCta("PayNow", 0);
        PayNow = paywallCta;
        PaywallCta paywallCta2 = new PaywallCta("Upgrade", 1);
        Upgrade = paywallCta2;
        PaywallCta paywallCta3 = new PaywallCta("Downgrade", 2);
        Downgrade = paywallCta3;
        PaywallCta paywallCta4 = new PaywallCta("CurrentPlan", 3);
        CurrentPlan = paywallCta4;
        PaywallCta[] paywallCtaArr = {paywallCta, paywallCta2, paywallCta3, paywallCta4};
        $VALUES = paywallCtaArr;
        $ENTRIES = C3cG.A0w(paywallCtaArr);
    }

    public static Ey9<PaywallCta> getEntries() {
        return $ENTRIES;
    }

    public static PaywallCta valueOf(String str) {
        return (PaywallCta) Enum.valueOf(PaywallCta.class, str);
    }

    public static PaywallCta[] values() {
        return (PaywallCta[]) $VALUES.clone();
    }

    public PaywallCta(String str, int i) {
    }
}
