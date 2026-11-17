package com.facebook.aura.pause;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.pause.HatchPauseEnrollmentDestination;
import com.facebook.aura.utils.MC;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetContent$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ MutableState<Boolean> $isTransitioning$delegate;
    public final /* synthetic */ G0U<HatchPauseEnrollmentDestination, Unit> $onNavigateTo;
    public final /* synthetic */ AuraSheetState $sheetState;

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetContent$1$1$1", f = "HatchPauseBottomSheetComponent.kt", l = {MC.xe_feta_entrypoint_rl.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetContent$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Boolean> $isTransitioning$delegate;
        public final /* synthetic */ AuraSheetState $sheetState;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

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
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    AuraSheetState auraSheetState = this.$sheetState;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (auraSheetState.expand(this) == enumC10460Hji) {
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
            MutableState.A09(false, this.$isTransitioning$delegate);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetContent$1$1(G0U<? super HatchPauseEnrollmentDestination, Unit> g0u, C3UX c3ux, MutableState<Boolean> mutableState, AuraSheetState auraSheetState) {
        super(0);
        this.$onNavigateTo = g0u;
        this.$coroutineScope = c3ux;
        this.$isTransitioning$delegate = mutableState;
        this.$sheetState = auraSheetState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0A((MutableState) this.$isTransitioning$delegate)) {
            return;
        }
        this.$onNavigateTo.invoke(HatchPauseEnrollmentDestination.SaveRecoveryKey.INSTANCE);
        MutableState.A09(true, this.$isTransitioning$delegate);
        AnonymousClass001.A1J(new AnonymousClass1(this.$sheetState, this.$isTransitioning$delegate, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
