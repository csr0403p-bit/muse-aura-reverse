package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.G0V;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class ConfidentialVmSubscriptionEndedActionsKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSubscriptionEndedActionsKt$SubscriptionEndedActions$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $switchViewModel;
        public final /* synthetic */ ConfidentialVmSubscriptionEndedViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel, BRg bRg, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, int i, int i2) {
            super(2);
            this.$viewModel = confidentialVmSubscriptionEndedViewModel;
            this.$modifier = bRg;
            this.$switchViewModel = confidentialVmSwitchViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmSubscriptionEndedActionsKt.SubscriptionEndedActions(this.$viewModel, this.$modifier, this.$switchViewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SubscriptionEndedActions(com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel r33, X.BRg r34, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel r35, X.BFM r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmSubscriptionEndedActionsKt.SubscriptionEndedActions(com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel, X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel, X.BFM, int, int):void");
    }

    public static final /* synthetic */ ConfidentialVmSubscriptionEndedViewModel.ContinueCheck access$SubscriptionEndedActions$lambda$0(C1BO c1bo) {
        return (ConfidentialVmSubscriptionEndedViewModel.ContinueCheck) c1bo.getValue();
    }
}
