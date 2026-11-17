package com.facebook.aura.explore.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass602;
import X.C1BO;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import com.facebook.aura.explore.repo.IdeaFeedback;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.explore.view.IdeaSwipeActionsKt$IdeaRowSwipeContainer$4$1", f = "IdeaSwipeActions.kt", l = {244}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class IdeaSwipeActionsKt$IdeaRowSwipeContainer$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<G0U<IdeaFeedback, Unit>> $currentOnFeedback$delegate;
    public final /* synthetic */ AnchoredDraggableState<IdeaSwipeAnchor> $dragState;
    public int label;

    /* renamed from: com.facebook.aura.explore.view.IdeaSwipeActionsKt$IdeaRowSwipeContainer$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<IdeaSwipeAnchor> {
        public final /* synthetic */ AnchoredDraggableState<IdeaSwipeAnchor> $dragState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDraggableState<IdeaSwipeAnchor> anchoredDraggableState) {
            super(0);
            this.$dragState = anchoredDraggableState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final IdeaSwipeAnchor invoke() {
            return (IdeaSwipeAnchor) this.$dragState.A0C.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IdeaSwipeActionsKt$IdeaRowSwipeContainer$4$1(AnchoredDraggableState<IdeaSwipeAnchor> anchoredDraggableState, C1BO<? extends G0U<? super IdeaFeedback, Unit>> c1bo, HtJ<? super IdeaSwipeActionsKt$IdeaRowSwipeContainer$4$1> htJ) {
        super(2, htJ);
        this.$dragState = anchoredDraggableState;
        this.$currentOnFeedback$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new IdeaSwipeActionsKt$IdeaRowSwipeContainer$4$1(this.$dragState, this.$currentOnFeedback$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass602 anonymousClass602 = new AnonymousClass602(C6v3.A01(new AnonymousClass1(this.$dragState)), 0);
            final C1BO<G0U<IdeaFeedback, Unit>> c1bo = this.$currentOnFeedback$delegate;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.explore.view.IdeaSwipeActionsKt$IdeaRowSwipeContainer$4$1.2
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((IdeaSwipeAnchor) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(IdeaSwipeAnchor ideaSwipeAnchor, HtJ<? super Unit> htJ) {
                    if (ideaSwipeAnchor == IdeaSwipeAnchor.NOT_INTERESTED) {
                        C1BO<G0U<IdeaFeedback, Unit>> c1bo2 = c1bo;
                        float f = IdeaSwipeActionsKt.ARMED_ICON_SCALE;
                        C1BO.A0B(c1bo2).invoke(IdeaFeedback.DOWN);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (anonymousClass602.collect(c20z, this) == enumC10460Hji) {
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
        return ((IdeaSwipeActionsKt$IdeaRowSwipeContainer$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
