package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C3432CNc;
import X.C3433CNd;
import X.EF5;
import com.facebook.aura.executors.AuraExecutors;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchRegistrationAttestor$operations$2 extends AbstractC7559F3s implements Function0<C3432CNc> {
    public static final HatchRegistrationAttestor$operations$2 INSTANCE = new HatchRegistrationAttestor$operations$2();

    public HatchRegistrationAttestor$operations$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C3432CNc invoke() {
        EF5 ef5 = new EF5();
        AuraExecutors auraExecutors = AuraExecutors.INSTANCE;
        return new C3432CNc(new C3433CNd(auraExecutors.newSingleThreadExecutor("HatchRegistrationAttestationOperations"), auraExecutors.newSingleThreadScheduledExecutor("HatchRegistrationAttestationTimeout", null)), ef5);
    }
}
