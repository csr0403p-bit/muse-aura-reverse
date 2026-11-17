package com.facebook.aura.status.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AvW;
import X.C1Pn;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.status.view.GoalBottomSheetDestination;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$closeReport$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ MutableState<GoalBottomSheetDestination> $currentDestination$delegate;
    public final /* synthetic */ MutableState<Boolean> $isTransitioning$delegate;
    public final /* synthetic */ AuraSheetState $sheetState;

    @DebugMetadata(c = "com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$closeReport$1$1$1", f = "ActivityGoalBottomSheetComponent.kt", l = {210, 211}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$closeReport$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Boolean> $isTransitioning$delegate;
        public final /* synthetic */ AuraSheetState $sheetState;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$closeReport$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03941 extends AbstractC7559F3s implements G0U<Long, Unit> {
            public static final C03941 INSTANCE = new C03941();

            public C03941() {
                super(1);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                return AnonymousClass001.A0x(l);
            }

            public final void invoke(long j) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraSheetState auraSheetState, MutableState<Boolean> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$sheetState = auraSheetState;
            this.$isTransitioning$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sheetState, this.$isTransitioning$delegate, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
                C03941 c03941 = C03941.INSTANCE;
                this.L$0 = obj2;
                this.label = 1;
                if (AvW.A01(c03941, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    MutableState.A09(false, this.$isTransitioning$delegate);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            C1Pn c1Pn = this.$sheetState.sheetState;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (c1Pn.A01(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            MutableState.A09(false, this.$isTransitioning$delegate);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$closeReport$1$1(C3UX c3ux, MutableState<GoalBottomSheetDestination> mutableState, MutableState<Boolean> mutableState2, AuraSheetState auraSheetState) {
        super(0);
        this.$coroutineScope = c3ux;
        this.$currentDestination$delegate = mutableState;
        this.$isTransitioning$delegate = mutableState2;
        this.$sheetState = auraSheetState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        GoalBottomSheetDestination value = this.$currentDestination$delegate.getValue();
        if (!(value instanceof GoalBottomSheetDestination.Report) || value == null || MutableState.A0A((MutableState) this.$isTransitioning$delegate)) {
            return;
        }
        this.$currentDestination$delegate.Af8(GoalBottomSheetDestination.Overview.INSTANCE);
        MutableState.A09(true, this.$isTransitioning$delegate);
        AnonymousClass001.A1J(new AnonymousClass1(this.$sheetState, this.$isTransitioning$delegate, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
