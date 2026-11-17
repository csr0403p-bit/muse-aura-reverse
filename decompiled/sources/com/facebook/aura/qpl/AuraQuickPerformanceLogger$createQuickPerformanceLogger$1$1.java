package com.facebook.aura.qpl;

import X.AbstractC3136BzG;
import X.AbstractC7559F3s;
import X.C4964DIr;
import X.C7384Etj;
import X.CFK;
import X.DHu;
import X.DIA;
import X.DIO;
import X.F18;
import android.os.Trace;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraQuickPerformanceLogger$createQuickPerformanceLogger$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C4964DIr $qplLifecycleController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraQuickPerformanceLogger$createQuickPerformanceLogger$1$1(C4964DIr c4964DIr) {
        super(0);
        this.$qplLifecycleController = c4964DIr;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C4964DIr c4964DIr = this.$qplLifecycleController;
        AbstractC3136BzG.A00("transitToMatureStage");
        try {
            synchronized (c4964DIr) {
                if (!c4964DIr.A00) {
                    try {
                        DIO dio = c4964DIr.A02;
                        dio.A01 = c4964DIr.A04;
                        F18<DIA> f18 = c4964DIr.A03;
                        DHu dHu = c4964DIr.A01;
                        DIA diaAMN = f18.AMN();
                        C7384Etj.A0U(diaAMN);
                        dio.A04(dHu, diaAMN);
                        dHu.A0h();
                        c4964DIr.A00 = true;
                    } catch (Throwable th) {
                        CFK.A08("LightweightQPLLifecycleController", "QPL failed to transit to mature stage", th);
                    }
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
