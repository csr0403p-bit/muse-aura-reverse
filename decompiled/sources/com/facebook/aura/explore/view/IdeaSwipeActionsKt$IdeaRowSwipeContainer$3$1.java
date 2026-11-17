package com.facebook.aura.explore.view;

import X.ATS;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C00r;
import X.C1BO;
import X.C1qN;
import X.C20Z;
import X.C3Em;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC04911Xu;
import X.InterfaceC1072AWd;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import com.facebook.aura.explore.repo.IdeaFeedback;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.explore.view.IdeaSwipeActionsKt$IdeaRowSwipeContainer$3$1", f = "IdeaSwipeActions.kt", l = {228}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class IdeaSwipeActionsKt$IdeaRowSwipeContainer$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<G0U<IdeaFeedback, Unit>> $currentOnFeedback$delegate;
    public final /* synthetic */ InterfaceC1072AWd $dragInteractions;
    public final /* synthetic */ AnchoredDraggableState<IdeaSwipeAnchor> $dragState;
    public final /* synthetic */ C00r $measuredRowWidth;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IdeaSwipeActionsKt$IdeaRowSwipeContainer$3$1(InterfaceC1072AWd interfaceC1072AWd, AnchoredDraggableState<IdeaSwipeAnchor> anchoredDraggableState, C00r c00r, C1BO<? extends G0U<? super IdeaFeedback, Unit>> c1bo, HtJ<? super IdeaSwipeActionsKt$IdeaRowSwipeContainer$3$1> htJ) {
        super(2, htJ);
        this.$dragInteractions = interfaceC1072AWd;
        this.$dragState = anchoredDraggableState;
        this.$measuredRowWidth = c00r;
        this.$currentOnFeedback$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new IdeaSwipeActionsKt$IdeaRowSwipeContainer$3$1(this.$dragInteractions, this.$dragState, this.$measuredRowWidth, this.$currentOnFeedback$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C3Em<InterfaceC04911Xu> c3Em = ((C1qN) this.$dragInteractions).A00;
            final AnchoredDraggableState<IdeaSwipeAnchor> anchoredDraggableState = this.$dragState;
            final C00r c00r = this.$measuredRowWidth;
            final C1BO<G0U<IdeaFeedback, Unit>> c1bo = this.$currentOnFeedback$delegate;
            C20Z<? super InterfaceC04911Xu> c20z = new C20Z() { // from class: com.facebook.aura.explore.view.IdeaSwipeActionsKt$IdeaRowSwipeContainer$3$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((InterfaceC04911Xu) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(InterfaceC04911Xu interfaceC04911Xu, HtJ<? super Unit> htJ) {
                    if (interfaceC04911Xu instanceof ATS) {
                        float fAFn = anchoredDraggableState.A08.AFn();
                        if (fAFn > 0.0f && IdeaSwipeActionsKt.isArmed(fAFn, c00r.AGd())) {
                            C1BO.A0B(c1bo).invoke(IdeaFeedback.UP);
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c3Em.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((IdeaSwipeActionsKt$IdeaRowSwipeContainer$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
