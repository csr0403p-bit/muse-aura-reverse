package com.facebook.aura.globaleffects;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C3cG;
import X.C78N;
import X.G0U;
import X.G0V;
import androidx.activity.ComponentActivity;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ActivationSettingsScreenKey;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.storagerecovery.StorageRecoveryViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class StorageRecoverySettingsSuppressionEffectKt {

    /* renamed from: com.facebook.aura.globaleffects.StorageRecoverySettingsSuppressionEffectKt$StorageRecoverySettingsSuppressionEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            StorageRecoverySettingsSuppressionEffectKt.StorageRecoverySettingsSuppressionEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void StorageRecoverySettingsSuppressionEffect(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 98499649, i), bfm, i)) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            long jA05 = C3cG.A05(bfm.A6v(LocalUserSessionKt.LocalUserSessionGeneration));
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            StorageRecoveryViewModel.Factory factory = new StorageRecoveryViewModel.Factory(abstractC3358CGzA0h);
            String strActivityViewModelKey = LocalUserSessionKt.activityViewModelKey(StorageRecoveryViewModel.class, jA05);
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            StorageRecoveryViewModel storageRecoveryViewModel = (StorageRecoveryViewModel) AnonymousClass003.A0Y(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), StorageRecoveryViewModel.class, strActivityViewModelKey);
            boolean zIsInBackStack = auraNavigatorA0b.isInBackStack(ActivationSettingsScreenKey.INSTANCE);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = StorageRecoverySettingsSuppressionEffectKt$StorageRecoverySettingsSuppressionEffect$isInBugReport$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            boolean zIsInBackStack2 = auraNavigatorA0b.isInBackStack((G0U<? super AuraNavKey, Boolean>) objAaT);
            boolean zA1U = AnonymousClass003.A1U(bfm, zIsInBackStack, bfm.A67(storageRecoveryViewModel), zIsInBackStack2);
            Object objAaT2 = bfm.AaT();
            if (zA1U || objAaT2 == obj) {
                objAaT2 = new StorageRecoverySettingsSuppressionEffectKt$StorageRecoverySettingsSuppressionEffect$1$1(storageRecoveryViewModel, zIsInBackStack, zIsInBackStack2);
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
