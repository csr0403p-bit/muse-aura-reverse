package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class SubscriptionConfirmNameSheetKt$NameSubmissionError$detail$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AuraSubscriptionNameGateViewModel.NameSubmission $submission;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionConfirmNameSheetKt$NameSubmissionError$detail$1(AuraSubscriptionNameGateViewModel.NameSubmission nameSubmission, BRg bRg, int i, int i2) {
        super(2);
        this.$submission = nameSubmission;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        SubscriptionConfirmNameSheetKt.NameSubmissionError(this.$submission, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
