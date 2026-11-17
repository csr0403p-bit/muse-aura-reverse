package com.facebook.aura.status.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AvW;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.status.repo.ActivityGoalAction;
import com.facebook.aura.status.view.GoalBottomSheetDestination;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$onGoalActionClick$1$1 extends AbstractC7559F3s implements G0U<ActivityGoalAction, Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ MutableState<GoalBottomSheetDestination> $currentDestination$delegate;
    public final /* synthetic */ MutableState<Boolean> $isTransitioning$delegate;
    public final /* synthetic */ AuraSheetState $sheetState;

    @DebugMetadata(c = "com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$onGoalActionClick$1$1$1", f = "ActivityGoalBottomSheetComponent.kt", l = {196, HatchMessageShareDocumentRenderer.CONTENT_TOP_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$onGoalActionClick$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Boolean> $isTransitioning$delegate;
        public final /* synthetic */ AuraSheetState $sheetState;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$onGoalActionClick$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03951 extends AbstractC7559F3s implements G0U<Long, Unit> {
            public static final C03951 INSTANCE = new C03951();

            public C03951() {
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
                C03951 c03951 = C03951.INSTANCE;
                this.L$0 = obj2;
                this.label = 1;
                if (AvW.A01(c03951, this) == enumC10460Hji) {
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
            AuraSheetState auraSheetState = this.$sheetState;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (auraSheetState.expand(this) == enumC10460Hji) {
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

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityGoalAction activityGoalAction) {
        C7384Etj.A0Y(activityGoalAction, 0);
        if (MutableState.A0A((MutableState) this.$isTransitioning$delegate) || !ActivityGoalBottomSheetComponentKt.canOpenGoalActionDetail(activityGoalAction)) {
            return;
        }
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, HatchSubsurface.BOT_SHEET_CONTENT, HatchScreen.BOT_SHEET, HatchComponent.GOAL_STEP_ROW, null, null, null);
        this.$currentDestination$delegate.Af8(new GoalBottomSheetDestination.Report(activityGoalAction));
        MutableState.A09(true, this.$isTransitioning$delegate);
        AnonymousClass001.A1J(new AnonymousClass1(this.$sheetState, this.$isTransitioning$delegate, null), this.$coroutineScope);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$onGoalActionClick$1$1(C3UX c3ux, MutableState<Boolean> mutableState, MutableState<GoalBottomSheetDestination> mutableState2, AuraSheetState auraSheetState) {
        super(1);
        this.$coroutineScope = c3ux;
        this.$isTransitioning$delegate = mutableState;
        this.$currentDestination$delegate = mutableState2;
        this.$sheetState = auraSheetState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityGoalAction activityGoalAction) {
        invoke2(activityGoalAction);
        return Unit.INSTANCE;
    }
}
