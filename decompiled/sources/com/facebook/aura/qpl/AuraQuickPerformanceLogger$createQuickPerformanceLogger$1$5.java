package com.facebook.aura.qpl;

import X.AbstractC3136BzG;
import X.AbstractC7559F3s;
import android.os.Trace;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraQuickPerformanceLogger$createQuickPerformanceLogger$1$5 extends AbstractC7559F3s implements Function0<Unit> {
    public static final AuraQuickPerformanceLogger$createQuickPerformanceLogger$1$5 INSTANCE = new AuraQuickPerformanceLogger$createQuickPerformanceLogger$1$5();

    public AuraQuickPerformanceLogger$createQuickPerformanceLogger$1$5() {
        super(0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AbstractC3136BzG.A00("transitToMatureStage");
        Trace.endSection();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
