package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C6t6;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$2$1", f = "NativeLoginCheckpointWebScreen.kt", l = {98}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnFailure$delegate;
    public final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    public final /* synthetic */ AtomicBoolean $terminalEvent;
    public final /* synthetic */ C6t6 $webView;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$2$1(AtomicBoolean atomicBoolean, C6t6 c6t6, MutableState<Boolean> mutableState, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$2$1> htJ) {
        super(2, htJ);
        this.$terminalEvent = atomicBoolean;
        this.$webView = c6t6;
        this.$isLoading$delegate = mutableState;
        this.$currentOnFailure$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$2$1(this.$terminalEvent, this.$webView, this.$isLoading$delegate, this.$currentOnFailure$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            this.label = 1;
            if (C7Bq.A01(30000L, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        if (MutableState.A0A((MutableState) this.$isLoading$delegate) && this.$terminalEvent.compareAndSet(false, true)) {
            this.$webView.stopLoading();
            C1BO.A0D(this.$currentOnFailure$delegate);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
