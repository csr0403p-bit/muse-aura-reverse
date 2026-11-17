package com.facebook.aura.ui;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C7Bq;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$2$1", f = "HatchSetupAnimationHost.kt", l = {172}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSetupAnimationHostKt$HatchSetupAnimationHost$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Boolean> $isRequested$delegate;
    public final /* synthetic */ MutableState<Boolean> $isWatchdogTripped$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSetupAnimationHostKt$HatchSetupAnimationHost$2$1(C1BO<Boolean> c1bo, MutableState<Boolean> mutableState, HtJ<? super HatchSetupAnimationHostKt$HatchSetupAnimationHost$2$1> htJ) {
        super(2, htJ);
        this.$isRequested$delegate = c1bo;
        this.$isWatchdogTripped$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSetupAnimationHostKt$HatchSetupAnimationHost$2$1(this.$isRequested$delegate, this.$isWatchdogTripped$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!C1BO.A0F(this.$isRequested$delegate)) {
                MutableState.A09(false, this.$isWatchdogTripped$delegate);
                return Unit.INSTANCE;
            }
            this.label = 1;
            if (C7Bq.A01(60000L, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        CFK.A06(HatchSetupAnimationHostKt.TAG, "Setup animation exceeded its visibility ceiling; falling back to inline spinners");
        MutableState.A09(true, this.$isWatchdogTripped$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchSetupAnimationHostKt$HatchSetupAnimationHost$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
