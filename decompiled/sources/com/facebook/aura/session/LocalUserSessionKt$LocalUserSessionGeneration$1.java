package com.facebook.aura.session;

import X.AbstractC7559F3s;
import X.C3cG;
import X.F60;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class LocalUserSessionKt$LocalUserSessionGeneration$1 extends AbstractC7559F3s implements Function0<Long> {
    public static final LocalUserSessionKt$LocalUserSessionGeneration$1 INSTANCE = new LocalUserSessionKt$LocalUserSessionGeneration$1();

    public LocalUserSessionKt$LocalUserSessionGeneration$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Long invoke() {
        invoke();
        throw F60.createAndThrow();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        throw C3cG.A0Q("No UserSession generation provided");
    }
}
