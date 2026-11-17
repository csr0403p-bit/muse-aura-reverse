package com.facebook.aura.subscription.repo;

/* loaded from: classes4.dex */
public abstract class SubscriptionStefiPathKt {
    public static final String paymentType(boolean z) {
        return z ? "payment_type=iac" : "payment_type=google_play";
    }
}
