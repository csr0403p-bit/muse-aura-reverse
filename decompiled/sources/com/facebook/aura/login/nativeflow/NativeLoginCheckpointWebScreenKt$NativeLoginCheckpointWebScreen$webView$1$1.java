package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$webView$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ C1BO<G0U<String, Unit>> $currentOnCallback$delegate;
    public final /* synthetic */ AtomicBoolean $terminalEvent;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        if (this.$terminalEvent.compareAndSet(false, true)) {
            C1BO.A0B(this.$currentOnCallback$delegate).invoke(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$webView$1$1(AtomicBoolean atomicBoolean, C1BO<? extends G0U<? super String, Unit>> c1bo) {
        super(1);
        this.$terminalEvent = atomicBoolean;
        this.$currentOnCallback$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
