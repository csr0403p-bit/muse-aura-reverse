package com.facebook.aura.analytics;

import X.AbstractC7559F3s;
import X.C3350CFz;
import X.DFX;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraLogger$deviceInstance$2 extends AbstractC7559F3s implements Function0<C3350CFz> {
    public static final AuraLogger$deviceInstance$2 INSTANCE = new AuraLogger$deviceInstance$2();

    public AuraLogger$deviceInstance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C3350CFz invoke() {
        return new C3350CFz((DFX) AuraAnalytics.deviceInstance$delegate.getValue());
    }
}
