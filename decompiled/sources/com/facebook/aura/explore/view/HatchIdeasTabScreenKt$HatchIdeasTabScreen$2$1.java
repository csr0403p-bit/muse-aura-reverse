package com.facebook.aura.explore.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.explore.view.HatchIdeasTabScreenKt$HatchIdeasTabScreen$2$1", f = "HatchIdeasTabScreen.kt", l = {193}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $dismissedIdeaCardId;
    public final /* synthetic */ G0U<String, Unit> $finishDismissal;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$2$1(MutableState<String> mutableState, G0U<? super String, Unit> g0u, HtJ<? super HatchIdeasTabScreenKt$HatchIdeasTabScreen$2$1> htJ) {
        super(2, htJ);
        this.$dismissedIdeaCardId = mutableState;
        this.$finishDismissal = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchIdeasTabScreenKt$HatchIdeasTabScreen$2$1(this.$dismissedIdeaCardId, this.$finishDismissal, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object value;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            value = this.$dismissedIdeaCardId.getValue();
            if (value != null) {
                this.L$0 = value;
                this.label = 1;
                if (C7Bq.A01(1000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        value = this.L$0;
        Hwg.A00(obj);
        if (C7384Etj.areEqual(this.$dismissedIdeaCardId.getValue(), value)) {
            this.$finishDismissal.invoke(value);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchIdeasTabScreenKt$HatchIdeasTabScreen$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
