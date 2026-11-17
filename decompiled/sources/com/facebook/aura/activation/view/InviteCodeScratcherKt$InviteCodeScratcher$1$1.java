package com.facebook.aura.activation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0dx;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.activation.view.InviteCodeScratcherKt$InviteCodeScratcher$1$1", f = "InviteCodeScratcher.kt", l = {134}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class InviteCodeScratcherKt$InviteCodeScratcher$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ boolean $isCodeVisible;
    public final /* synthetic */ boolean $reduceMotion;
    public final /* synthetic */ MutableState<Boolean> $revealFeedbackPending$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteCodeScratcherKt$InviteCodeScratcher$1$1(boolean z, boolean z2, C0dx c0dx, MutableState<Boolean> mutableState, HtJ<? super InviteCodeScratcherKt$InviteCodeScratcher$1$1> htJ) {
        super(2, htJ);
        this.$isCodeVisible = z;
        this.$reduceMotion = z2;
        this.$haptics = c0dx;
        this.$revealFeedbackPending$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new InviteCodeScratcherKt$InviteCodeScratcher$1$1(this.$isCodeVisible, this.$reduceMotion, this.$haptics, this.$revealFeedbackPending$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$isCodeVisible) {
                MutableState<Boolean> mutableState = this.$revealFeedbackPending$delegate;
                int i2 = InviteCodeScratcherKt.COVERAGE_COLUMNS;
                if (MutableState.A0A((MutableState) mutableState)) {
                    if (!this.$reduceMotion) {
                        this.label = 1;
                        if (C7Bq.A01(520L, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$haptics.AXr(AuraHaptics.SUCCESS);
        MutableState<Boolean> mutableState2 = this.$revealFeedbackPending$delegate;
        int i3 = InviteCodeScratcherKt.COVERAGE_COLUMNS;
        MutableState.A09(false, mutableState2);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((InviteCodeScratcherKt$InviteCodeScratcher$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
