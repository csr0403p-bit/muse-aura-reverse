package com.facebook.aura.status.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1Pn;
import X.C1Vj;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1", f = "ActivityGoalBottomSheetComponent.kt", l = {170, 176}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $didAttemptInitialPartial$delegate;
    public final /* synthetic */ MutableState<Boolean> $isTransitioning$delegate;
    public final /* synthetic */ AuraSheetState $sheetState;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1(AuraSheetState auraSheetState, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, HtJ<? super ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1> htJ) {
        super(2, htJ);
        this.$sheetState = auraSheetState;
        this.$didAttemptInitialPartial$delegate = mutableState;
        this.$isTransitioning$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1 activityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1 = new ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1(this.$sheetState, this.$didAttemptInitialPartial$delegate, this.$isTransitioning$delegate, htJ);
        activityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1.L$0 = obj;
        return activityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
        } catch (Throwable th) {
            Hwg.A01(th);
        }
        if (i == 0) {
            Hwg.A00(obj);
            if (!MutableState.A0A((MutableState) this.$didAttemptInitialPartial$delegate)) {
                ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1$observedSheetValue$1 activityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1$observedSheetValue$1 = new ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1$observedSheetValue$1(this.$sheetState, null);
                this.L$0 = obj2;
                this.label = 1;
                obj = GAX.A01(this, activityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1$observedSheetValue$1, 400L);
                if (obj == enumC10460Hji) {
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
            MutableState.A09(true, this.$didAttemptInitialPartial$delegate);
            MutableState.A09(false, this.$isTransitioning$delegate);
            return Unit.INSTANCE;
        }
        Hwg.A00(obj);
        if (obj == null) {
            obj = this.$sheetState.sheetState.A00.A07.getValue();
        }
        if (obj != C1Vj.Expanded) {
            if (obj == C1Vj.PartiallyExpanded) {
                MutableState.A09(true, this.$didAttemptInitialPartial$delegate);
            }
            return Unit.INSTANCE;
        }
        MutableState.A09(true, this.$isTransitioning$delegate);
        C1Pn c1Pn = this.$sheetState.sheetState;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        if (c1Pn.A01(this) == enumC10460Hji) {
            return enumC10460Hji;
        }
        MutableState.A09(true, this.$didAttemptInitialPartial$delegate);
        MutableState.A09(false, this.$isTransitioning$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
