package com.facebook.aura.startup;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraStartupMetricTracker$asyncRecorder$2 extends AbstractC7559F3s implements Function0<AuraStartupMetricsRecorder> {
    public static final AuraStartupMetricTracker$asyncRecorder$2 INSTANCE = new AuraStartupMetricTracker$asyncRecorder$2();

    public AuraStartupMetricTracker$asyncRecorder$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraStartupMetricsRecorder invoke() {
        return new AuraStartupMetricsRecorder();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ AuraStartupMetricsRecorder invoke() {
        return new AuraStartupMetricsRecorder();
    }
}
