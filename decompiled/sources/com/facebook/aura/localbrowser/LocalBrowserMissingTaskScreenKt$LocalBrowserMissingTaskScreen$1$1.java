package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserMissingTaskScreenKt$LocalBrowserMissingTaskScreen$1$1", f = "LocalBrowserMissingTaskScreen.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserMissingTaskScreenKt$LocalBrowserMissingTaskScreen$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnClose$delegate;
    public final /* synthetic */ LocalBrowserMissingTaskViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LocalBrowserMissingTaskScreenKt$LocalBrowserMissingTaskScreen$1$1(LocalBrowserMissingTaskViewModel localBrowserMissingTaskViewModel, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super LocalBrowserMissingTaskScreenKt$LocalBrowserMissingTaskScreen$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = localBrowserMissingTaskViewModel;
        this.$currentOnClose$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserMissingTaskScreenKt$LocalBrowserMissingTaskScreen$1$1(this.$viewModel, this.$currentOnClose$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<Unit> c20q = this.$viewModel.closeScreen;
            final C1BO<Function0<Unit>> c1bo = this.$currentOnClose$delegate;
            C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.localbrowser.LocalBrowserMissingTaskScreenKt$LocalBrowserMissingTaskScreen$1$1.1
                public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                    C1BO.A0D(c1bo);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    C1BO.A0D(c1bo);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c20q.collect(c20z, this) == enumC10460Hji) {
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
        return ((LocalBrowserMissingTaskScreenKt$LocalBrowserMissingTaskScreen$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
