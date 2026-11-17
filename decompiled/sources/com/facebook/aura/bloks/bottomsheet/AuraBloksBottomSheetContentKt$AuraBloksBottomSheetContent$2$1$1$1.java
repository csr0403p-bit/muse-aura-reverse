package com.facebook.aura.bloks.bottomsheet;

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

/* loaded from: classes4.dex */
public final class AuraBloksBottomSheetContentKt$AuraBloksBottomSheetContent$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $coroutine;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ AuraSheetState $sheetState;
    public final /* synthetic */ AuraBloksBottomSheetStateHolder $viewModel;

    @DebugMetadata(c = "com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetContentKt$AuraBloksBottomSheetContent$2$1$1$1$1", f = "AuraBloksBottomSheetContent.kt", l = {78}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetContentKt$AuraBloksBottomSheetContent$2$1$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AuraSheetState $sheetState;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraSheetState auraSheetState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$sheetState = auraSheetState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$sheetState, htJ);
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
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass1(this.$sheetState, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBloksBottomSheetContentKt$AuraBloksBottomSheetContent$2$1$1$1(AuraBloksBottomSheetStateHolder auraBloksBottomSheetStateHolder, C3UX c3ux, Function0<Unit> function0, AuraSheetState auraSheetState) {
        super(0);
        this.$viewModel = auraBloksBottomSheetStateHolder;
        this.$coroutine = c3ux;
        this.$onDismissRequest = function0;
        this.$sheetState = auraSheetState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$viewModel.popBottomSheetData()) {
            return;
        }
        AnonymousClass001.A1J(new AnonymousClass1(this.$sheetState, null), this.$coroutine);
        this.$onDismissRequest.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
