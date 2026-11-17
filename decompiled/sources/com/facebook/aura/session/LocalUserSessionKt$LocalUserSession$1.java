package com.facebook.aura.session;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C3cG;
import X.F60;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class LocalUserSessionKt$LocalUserSession$1 extends AbstractC7559F3s implements Function0<AbstractC3358CGz> {
    public static final LocalUserSessionKt$LocalUserSession$1 INSTANCE = new LocalUserSessionKt$LocalUserSession$1();

    public LocalUserSessionKt$LocalUserSession$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ AbstractC3358CGz invoke() {
        invoke();
        throw F60.createAndThrow();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AbstractC3358CGz invoke() {
        throw C3cG.A0Q("No UserSession provided");
    }
}
