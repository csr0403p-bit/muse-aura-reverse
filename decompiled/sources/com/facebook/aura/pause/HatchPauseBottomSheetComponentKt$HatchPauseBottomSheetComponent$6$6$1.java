package com.facebook.aura.pause;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$6$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ HatchPauseEnrollmentViewModel $enrollmentViewModel;
    public final /* synthetic */ AuraSheetState $sheetState;

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$6$6$1$1", f = "HatchPauseBottomSheetComponent.kt", l = {327}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$6$6$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchPauseEnrollmentViewModel $enrollmentViewModel;
        public final /* synthetic */ AuraSheetState $sheetState;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, AuraSheetState auraSheetState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$enrollmentViewModel = hatchPauseEnrollmentViewModel;
            this.$sheetState = auraSheetState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$enrollmentViewModel, this.$sheetState, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    AuraSheetState auraSheetState = this.$sheetState;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (auraSheetState.hide(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (Throwable th) {
                C3cG.A0s(th);
            }
            this.$enrollmentViewModel.showPauseConfirmDialog();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$6$6$1(C3UX c3ux, HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, AuraSheetState auraSheetState) {
        super(0);
        this.$coroutineScope = c3ux;
        this.$enrollmentViewModel = hatchPauseEnrollmentViewModel;
        this.$sheetState = auraSheetState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1J(new AnonymousClass1(this.$enrollmentViewModel, this.$sheetState, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
