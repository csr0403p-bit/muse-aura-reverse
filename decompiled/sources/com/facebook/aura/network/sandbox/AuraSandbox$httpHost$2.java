package com.facebook.aura.network.sandbox;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C9X;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraSandbox$httpHost$2 extends AbstractC7559F3s implements Function0<Boolean> {
    public static final AuraSandbox$httpHost$2 INSTANCE = new AuraSandbox$httpHost$2();

    public AuraSandbox$httpHost$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AnonymousClass002.A1X(C9X.A01("xapp.e2e.tokens", false, false)));
    }
}
