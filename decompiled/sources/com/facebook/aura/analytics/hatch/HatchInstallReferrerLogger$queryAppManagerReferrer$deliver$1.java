package com.facebook.aura.analytics.hatch;

import X.AbstractC7559F3s;
import X.C3cI;
import X.G0U;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchInstallReferrerLogger$queryAppManagerReferrer$deliver$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ AtomicBoolean $delivered;
    public final /* synthetic */ G0U<String, Unit> $onResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInstallReferrerLogger$queryAppManagerReferrer$deliver$1(AtomicBoolean atomicBoolean, G0U<? super String, Unit> g0u) {
        super(1);
        this.$delivered = atomicBoolean;
        this.$onResult = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        if (C3cI.A1W(this.$delivered)) {
            this.$onResult.invoke(str);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
