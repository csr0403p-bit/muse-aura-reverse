package com.facebook.aura.main;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.main.HatchSidePanelHostKt$ModalSidePanel$2$1", f = "HatchSidePanelHost.kt", l = {132}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSidePanelHostKt$ModalSidePanel$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $isAnimatingPanel$delegate;
    public final /* synthetic */ AT5<Float, AOW> $revealPx;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSidePanelHostKt$ModalSidePanel$2$1(AT5<Float, AOW> at5, MutableState<Boolean> mutableState, HtJ<? super HatchSidePanelHostKt$ModalSidePanel$2$1> htJ) {
        super(2, htJ);
        this.$revealPx = at5;
        this.$isAnimatingPanel$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSidePanelHostKt$ModalSidePanel$2$1(this.$revealPx, this.$isAnimatingPanel$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AT5<Float, AOW> at5 = this.$revealPx;
            Float fA0l = AnonymousClass001.A0l();
            this.label = 1;
            if (at5.A04(fA0l, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        MutableState.A09(false, this.$isAnimatingPanel$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchSidePanelHostKt$ModalSidePanel$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
