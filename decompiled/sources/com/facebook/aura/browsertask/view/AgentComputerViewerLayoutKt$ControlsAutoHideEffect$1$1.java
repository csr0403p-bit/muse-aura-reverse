package com.facebook.aura.browsertask.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$ControlsAutoHideEffect$1$1", f = "AgentComputerViewerLayout.kt", l = {185}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AgentComputerViewerLayoutKt$ControlsAutoHideEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnTimeout$delegate;
    public final /* synthetic */ boolean $paused;
    public final /* synthetic */ long $timeoutMillis;
    public final /* synthetic */ boolean $visible;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AgentComputerViewerLayoutKt$ControlsAutoHideEffect$1$1(boolean z, boolean z2, long j, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super AgentComputerViewerLayoutKt$ControlsAutoHideEffect$1$1> htJ) {
        super(2, htJ);
        this.$visible = z;
        this.$paused = z2;
        this.$timeoutMillis = j;
        this.$currentOnTimeout$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AgentComputerViewerLayoutKt$ControlsAutoHideEffect$1$1(this.$visible, this.$paused, this.$timeoutMillis, this.$currentOnTimeout$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$visible && !this.$paused) {
                long j = this.$timeoutMillis;
                this.label = 1;
                if (C7Bq.A01(j, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        C1BO.A0D(this.$currentOnTimeout$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AgentComputerViewerLayoutKt$ControlsAutoHideEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
