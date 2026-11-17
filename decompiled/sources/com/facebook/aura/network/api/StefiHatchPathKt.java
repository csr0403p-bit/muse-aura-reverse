package com.facebook.aura.network.api;

/* loaded from: classes4.dex */
public abstract class StefiHatchPathKt {
    public static final String paymentType(boolean z) {
        return z ? "payment_type=iac" : "payment_type=google_play";
    }
}
