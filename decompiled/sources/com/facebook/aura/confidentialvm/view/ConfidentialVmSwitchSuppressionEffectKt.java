package com.facebook.aura.confidentialvm.view;

import X.AKH;
import X.AKL;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel;
import com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class ConfidentialVmSwitchSuppressionEffectKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchSuppressionEffectKt$ConfidentialVmSwitchSuppressionEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmSwitchSuppressionEffectKt.ConfidentialVmSwitchSuppressionEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void ConfidentialVmSwitchSuppressionEffect(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 252512068, i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
            ConfidentialVmSwitchResumeViewModel.Factory factory = new ConfidentialVmSwitchResumeViewModel.Factory(abstractC3358CGzA0g);
            AKH<Activity> akh = AKL.A00;
            Object objA6v = bfm.A6v(akh);
            C7384Etj.A0Z(objA6v, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
            ComponentActivity componentActivity = (ComponentActivity) objA6v;
            ConfidentialVmSwitchResumeViewModel confidentialVmSwitchResumeViewModel = (ConfidentialVmSwitchResumeViewModel) C3cH.A0H(factory, componentActivity, AnonymousClass003.A0Z(componentActivity), C3cG.A0x(ConfidentialVmSwitchResumeViewModel.class));
            ConfidentialVmDataTransferResumeViewModel.Factory factory2 = new ConfidentialVmDataTransferResumeViewModel.Factory(abstractC3358CGzA0g);
            ComponentActivity componentActivityA0A = C3cH.A0A(bfm, akh);
            ConfidentialVmDataTransferResumeViewModel confidentialVmDataTransferResumeViewModel = (ConfidentialVmDataTransferResumeViewModel) C3cH.A0H(factory2, componentActivityA0A, AnonymousClass003.A0Z(componentActivityA0A), C3cG.A0x(ConfidentialVmDataTransferResumeViewModel.class));
            ConfidentialVmMigrationDoneViewModel.Factory factory3 = new ConfidentialVmMigrationDoneViewModel.Factory(abstractC3358CGzA0g);
            ComponentActivity componentActivityA0A2 = C3cH.A0A(bfm, akh);
            ConfidentialVmMigrationDoneViewModel confidentialVmMigrationDoneViewModel = (ConfidentialVmMigrationDoneViewModel) C3cH.A0H(factory3, componentActivityA0A2, AnonymousClass003.A0Z(componentActivityA0A2), C3cG.A0x(ConfidentialVmMigrationDoneViewModel.class));
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = ConfidentialVmSwitchSuppressionEffectKt$ConfidentialVmSwitchSuppressionEffect$isSuppressed$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            boolean zIsInBackStack = auraNavigatorA0b.isInBackStack((G0U<? super AuraNavKey, Boolean>) objAaT);
            boolean zA1Y = AnonymousClass005.A1Y(bfm, confidentialVmDataTransferResumeViewModel, confidentialVmMigrationDoneViewModel, bfm.A67(confidentialVmSwitchResumeViewModel), bfm.A66(zIsInBackStack));
            Object objAaT2 = bfm.AaT();
            if (zA1Y || objAaT2 == obj) {
                objAaT2 = new ConfidentialVmSwitchSuppressionEffectKt$ConfidentialVmSwitchSuppressionEffect$1$1(confidentialVmSwitchResumeViewModel, zIsInBackStack, confidentialVmDataTransferResumeViewModel, confidentialVmMigrationDoneViewModel);
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
