package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C3cI;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$webView$1$3 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnFailure$delegate;
    public final /* synthetic */ AtomicBoolean $terminalEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$webView$1$3(AtomicBoolean atomicBoolean, C1BO<? extends Function0<Unit>> c1bo) {
        super(0);
        this.$terminalEvent = atomicBoolean;
        this.$currentOnFailure$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (C3cI.A1W(this.$terminalEvent)) {
            C1BO.A0D(this.$currentOnFailure$delegate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
