package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareEligibilityRequest$1$1$1", f = "HatchShareSheetViewModel.kt", l = {153}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetViewModel$shareEligibilityRequest$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends Boolean>>, Object> {
    public final /* synthetic */ String $eligibilityContentType;
    public final /* synthetic */ String $id;
    public int label;
    public final /* synthetic */ HatchShareSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetViewModel$shareEligibilityRequest$1$1$1(HatchShareSheetViewModel hatchShareSheetViewModel, String str, String str2, HtJ<? super HatchShareSheetViewModel$shareEligibilityRequest$1$1$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchShareSheetViewModel;
        this.$eligibilityContentType = str;
        this.$id = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchShareSheetViewModel$shareEligibilityRequest$1$1$1(this.this$0, this.$eligibilityContentType, this.$id, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends Boolean>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<Boolean>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM2005x85088dca;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchShareSheetRepository hatchShareSheetRepository = this.this$0.repository;
            String str = this.$eligibilityContentType;
            String str2 = this.$id;
            this.label = 1;
            objM2005x85088dca = hatchShareSheetRepository.m2005x85088dca(str, str2, this);
            if (objM2005x85088dca == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM2005x85088dca = AnonymousClass001.A0q(obj);
        }
        return new HsJ(objM2005x85088dca);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<Boolean>> htJ) {
        return ((HatchShareSheetViewModel$shareEligibilityRequest$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
