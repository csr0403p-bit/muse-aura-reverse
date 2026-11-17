package com.facebook.aura.main;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.main.ActivationLoadingScreenKt$StuckReportButton$1$1", f = "ActivationLoadingScreen.kt", l = {86}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ActivationLoadingScreenKt$StuckReportButton$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $visible$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivationLoadingScreenKt$StuckReportButton$1$1(MutableState<Boolean> mutableState, HtJ<? super ActivationLoadingScreenKt$StuckReportButton$1$1> htJ) {
        super(2, htJ);
        this.$visible$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ActivationLoadingScreenKt$StuckReportButton$1$1(this.$visible$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            this.label = 1;
            if (C7Bq.A01(5000L, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        MutableState.A09(true, this.$visible$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new ActivationLoadingScreenKt$StuckReportButton$1$1(this.$visible$delegate, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
