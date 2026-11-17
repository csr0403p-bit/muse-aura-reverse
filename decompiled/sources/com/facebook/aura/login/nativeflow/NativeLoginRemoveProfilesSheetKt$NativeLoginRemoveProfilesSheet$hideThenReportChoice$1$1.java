package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginRemoveProfilesSheetKt$NativeLoginRemoveProfilesSheet$hideThenReportChoice$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $reportChoice;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ AuraSheetState $sheetState;

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginRemoveProfilesSheetKt$NativeLoginRemoveProfilesSheet$hideThenReportChoice$1$1$1", f = "NativeLoginRemoveProfilesSheet.kt", l = {53}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRemoveProfilesSheetKt$NativeLoginRemoveProfilesSheet$hideThenReportChoice$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> $reportChoice;
        public final /* synthetic */ AuraSheetState $sheetState;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraSheetState auraSheetState, Function0<Unit> function0, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$sheetState = auraSheetState;
            this.$reportChoice = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$sheetState, this.$reportChoice, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSheetState auraSheetState = this.$sheetState;
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
            this.$reportChoice.invoke();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRemoveProfilesSheetKt$NativeLoginRemoveProfilesSheet$hideThenReportChoice$1$1(C3UX c3ux, AuraSheetState auraSheetState, Function0<Unit> function0) {
        super(0);
        this.$scope = c3ux;
        this.$sheetState = auraSheetState;
        this.$reportChoice = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1J(new AnonymousClass1(this.$sheetState, this.$reportChoice, null), this.$scope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
