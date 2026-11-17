package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C27k;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GBM;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$2$1", f = "HatchShareSheetViewModel.kt", l = {286}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetViewModel$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C27k<HatchMessageShareAttemptResult> $authorization;
    public Object L$0;
    public int label;
    public final /* synthetic */ HatchShareSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchShareSheetViewModel$2$1(HatchShareSheetViewModel hatchShareSheetViewModel, C27k<? extends HatchMessageShareAttemptResult> c27k, HtJ<? super HatchShareSheetViewModel$2$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchShareSheetViewModel;
        this.$authorization = c27k;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchShareSheetViewModel$2$1(this.this$0, this.$authorization, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HatchShareSheetViewModel hatchShareSheetViewModel;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            hatchShareSheetViewModel = this.this$0;
            C78T c78t = this.$authorization;
            this.L$0 = hatchShareSheetViewModel;
            this.label = 1;
            obj = ((GBM) c78t).A0E(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            hatchShareSheetViewModel = (HatchShareSheetViewModel) this.L$0;
            Hwg.A00(obj);
        }
        hatchShareSheetViewModel.applyMessageShareResult((HatchMessageShareAttemptResult) obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchShareSheetViewModel$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
