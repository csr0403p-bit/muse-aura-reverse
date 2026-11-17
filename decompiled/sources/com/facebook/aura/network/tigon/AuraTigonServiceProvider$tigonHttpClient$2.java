package com.facebook.aura.network.tigon;

import X.AbstractC7559F3s;
import X.DCW;
import X.F0C;
import com.facebook.aura.executors.AuraExecutors;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraTigonServiceProvider$tigonHttpClient$2 extends AbstractC7559F3s implements Function0<DCW> {
    public static final AuraTigonServiceProvider$tigonHttpClient$2 INSTANCE = new AuraTigonServiceProvider$tigonHttpClient$2();

    public AuraTigonServiceProvider$tigonHttpClient$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final DCW invoke() {
        return AuraTigonServiceProvider.INSTANCE.createNoiseEnabledClient("aura_tigon_cache", AuraExecutors.INSTANCE.newSingleThreadScheduledExecutor("AuraTigonServiceProvider", null), F0C.A03(), AuraTigonUnexpectedEventReporter.INSTANCE);
    }
}
