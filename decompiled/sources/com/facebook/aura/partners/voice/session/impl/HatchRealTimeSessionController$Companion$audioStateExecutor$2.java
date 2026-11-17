package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import com.facebook.aura.executors.AuraExecutors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class HatchRealTimeSessionController$Companion$audioStateExecutor$2 extends AbstractC7559F3s implements Function0<ScheduledExecutorService> {
    public static final HatchRealTimeSessionController$Companion$audioStateExecutor$2 INSTANCE = new HatchRealTimeSessionController$Companion$audioStateExecutor$2();

    public HatchRealTimeSessionController$Companion$audioStateExecutor$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ScheduledExecutorService invoke() {
        return AuraExecutors.INSTANCE.newSingleThreadScheduledExecutor("HatchRTAudio", null);
    }
}
