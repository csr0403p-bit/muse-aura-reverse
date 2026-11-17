package com.facebook.aura.network;

import X.AbstractC7559F3s;
import X.C3cG;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraUserAgent$fullUserAgent$1 extends AbstractC7559F3s implements Function0<String> {
    public static final AuraUserAgent$fullUserAgent$1 INSTANCE = new AuraUserAgent$fullUserAgent$1();

    public AuraUserAgent$fullUserAgent$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return AuraUserAgent.INSTANCE.generateUserAgent(C3cG.A06());
    }
}
