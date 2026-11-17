package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.confidentialvm.model.ConfidentialVmChipBudgetViewModel;
import com.facebook.aura.confidentialvm.model.ConfidentialVmChipBudgetViewModelKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ActivationSettingsScreenKey;
import com.facebook.aura.navigation.key.ContactSupportScreenKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class ConfidentialVmChipBudgetSuppressionEffectKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmChipBudgetSuppressionEffectKt$ConfidentialVmChipBudgetSuppressionEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmChipBudgetSuppressionEffectKt.ConfidentialVmChipBudgetSuppressionEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void ConfidentialVmChipBudgetSuppressionEffect(BFM bfm, int i) {
        bfm.AgG(1345640356);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            ConfidentialVmChipBudgetViewModel confidentialVmChipBudgetViewModel = ConfidentialVmChipBudgetViewModelKt.confidentialVmChipBudgetViewModel(bfm, 0);
            boolean zIsInBackStack = auraNavigatorA0b.isInBackStack(ActivationSettingsScreenKey.INSTANCE);
            boolean zIsInBackStack2 = auraNavigatorA0b.isInBackStack(ContactSupportScreenKey.INSTANCE);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = ConfidentialVmChipBudgetSuppressionEffectKt$ConfidentialVmChipBudgetSuppressionEffect$isInBugReport$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            boolean zIsInBackStack3 = auraNavigatorA0b.isInBackStack((G0U<? super AuraNavKey, Boolean>) objAaT);
            boolean zA1U = AnonymousClass001.A1U(bfm, zIsInBackStack3, AnonymousClass003.A1U(bfm, zIsInBackStack, bfm.A67(confidentialVmChipBudgetViewModel), zIsInBackStack2));
            Object objAaT2 = bfm.AaT();
            if (zA1U || objAaT2 == obj) {
                objAaT2 = new ConfidentialVmChipBudgetSuppressionEffectKt$ConfidentialVmChipBudgetSuppressionEffect$1$1(confidentialVmChipBudgetViewModel, zIsInBackStack, zIsInBackStack2, zIsInBackStack3);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A15(bfm, objAaT2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i);
        }
    }
}
