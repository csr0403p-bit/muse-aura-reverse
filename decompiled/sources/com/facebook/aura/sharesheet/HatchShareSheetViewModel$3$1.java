package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BLG;
import X.C10571Hud;
import X.C27k;
import X.C3UX;
import X.C7384Etj;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GBM;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$3$1", f = "HatchShareSheetViewModel.kt", l = {290}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetViewModel$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C27k<HsJ<Boolean>> $eligibility;
    public int label;
    public final /* synthetic */ HatchShareSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetViewModel$3$1(C27k<HsJ<Boolean>> c27k, HatchShareSheetViewModel hatchShareSheetViewModel, HtJ<? super HatchShareSheetViewModel$3$1> htJ) {
        super(2, htJ);
        this.$eligibility = c27k;
        this.this$0 = hatchShareSheetViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchShareSheetViewModel$3$1(this.$eligibility, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HatchShareSheetUiState value;
        Object objA0E = obj;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(objA0E);
            C78T c78t = this.$eligibility;
            this.label = 1;
            objA0E = ((GBM) c78t).A0E(this);
            if (objA0E == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(objA0E);
        }
        Object obj2 = ((HsJ) objA0E).value;
        if (obj2 instanceof C10571Hud) {
            obj2 = null;
        }
        boolean zAreEqual = C7384Etj.areEqual(obj2, false);
        HatchShareLogging.INSTANCE.logStoryEligibility(!zAreEqual, this.this$0.logContext.getValue());
        BLG<HatchShareSheetUiState> blg = this.this$0._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(value, null, !zAreEqual ? HatchShareEligibilityState.ELIGIBLE : HatchShareEligibilityState.INELIGIBLE, null, null, false, false, null, null, false, null, false, 2045, null)));
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchShareSheetViewModel$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
