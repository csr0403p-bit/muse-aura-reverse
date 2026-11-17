package com.facebook.aura.main;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C2HU;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.main.HatchSidePanelHostKt$ModalSidePanel$7$1", f = "HatchSidePanelHost.kt", l = {188, AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSidePanelHostKt$ModalSidePanel$7$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $isAnimatingPanel$delegate;
    public final /* synthetic */ AT5<Float, AOW> $revealPx;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSidePanelHostKt$ModalSidePanel$7$1(HatchSidePanelController hatchSidePanelController, AT5<Float, AOW> at5, MutableState<Boolean> mutableState, HtJ<? super HatchSidePanelHostKt$ModalSidePanel$7$1> htJ) {
        super(2, htJ);
        this.$sidePanelController = hatchSidePanelController;
        this.$revealPx = at5;
        this.$isAnimatingPanel$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSidePanelHostKt$ModalSidePanel$7$1(this.$sidePanelController, this.$revealPx, this.$isAnimatingPanel$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$sidePanelController.closeToken$delegate.AGd() != 0) {
                MutableState.A09(true, this.$isAnimatingPanel$delegate);
                AT5<Float, AOW> at5 = this.$revealPx;
                Float f = new Float(HatchSidePanelHostKt.currentRevealPx(this.$sidePanelController, MutableState.A00(at5)));
                this.label = 1;
                if (at5.A04(f, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            this.$sidePanelController.updateRevealOffset(0.0f);
            this.$sidePanelController.finishClose();
            MutableState.A09(false, this.$isAnimatingPanel$delegate);
            return Unit.INSTANCE;
        }
        Hwg.A00(obj);
        this.$sidePanelController.clearDragOffset();
        AT5<Float, AOW> at52 = this.$revealPx;
        Float f2 = new Float(0.0f);
        ASj aSjA0J = AnonymousClass002.A0J(C2HU.A01, 250);
        this.label = 2;
        if (AnonymousClass002.A0i(at52, aSjA0J, f2, this, null) == enumC10460Hji) {
            return enumC10460Hji;
        }
        this.$sidePanelController.updateRevealOffset(0.0f);
        this.$sidePanelController.finishClose();
        MutableState.A09(false, this.$isAnimatingPanel$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchSidePanelHostKt$ModalSidePanel$7$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
