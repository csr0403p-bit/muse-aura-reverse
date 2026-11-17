package com.facebook.aura.globaleffects;

import X.AKH;
import X.AKL;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BQN;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import android.app.Activity;
import android.content.Context;
import androidx.activity.ComponentActivity;
import com.facebook.aura.applock.AppBiometricLockViewModel;
import com.facebook.aura.appreview.HatchInAppReviewEffectKt;
import com.facebook.aura.appupdate.PlayInAppUpdateEffectKt;
import com.facebook.aura.checkpoint.view.HatchCheckpointViewModel;
import com.facebook.aura.conversation.lifecycle.ConversationResumeResetEffectKt;
import com.facebook.aura.gateway.HatchLockGating;
import com.facebook.aura.globaleffects.api.AppFloatingLayerKt;
import com.facebook.aura.globaleffects.api.AppGlobalEffectKt;
import com.facebook.aura.overlay.HatchOverlayFrameworkKt;
import com.facebook.aura.pause.HatchPauseViewModel;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchScreenshotShareEffectKt;
import com.facebook.aura.toast.HatchGlobalToastKt;
import com.facebook.aura.vmavailability.VmUnavailableViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class HatchGlobalEffectsKt {

    /* renamed from: com.facebook.aura.globaleffects.HatchGlobalEffectsKt$HatchGlobalEffects$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchGlobalEffectsKt.HatchGlobalEffects(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.globaleffects.HatchGlobalEffectsKt$HatchGlobalEffects$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchGlobalEffectsKt.HatchGlobalEffects(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.globaleffects.HatchGlobalEffectsKt$ViewModelInitialization$2, reason: invalid class name and case insensitive filesystem */
    public final class C121682 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121682(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchGlobalEffectsKt.ViewModelInitialization(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchGlobalEffects(BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass2;
        bfm.AgG(-1335910939);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            ViewModelInitialization(bfm, 0);
            VmDisabledSettingsSuppressionEffectKt.VmDisabledSettingsSuppressionEffect(bfm, 0);
            StorageRecoverySettingsSuppressionEffectKt.StorageRecoverySettingsSuppressionEffect(bfm, 0);
            HatchVmRestartEffectKt.HatchVmRestartEffect(bfm, 0);
            AppGlobalEffectKt.AppGlobalEffects(true, bfm, 6);
            if (HatchOverlayFrameworkKt.hasBlockingOverlay(null, bfm, 0, 1)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass2 = new AnonymousClass1(i);
                    C3cG.A1D(bBbAAc, anonymousClass2);
                }
                return;
            }
            HatchGlobalToastKt.HatchGlobalToast(bfm, 0);
            HatchVmRestartEffectKt.HatchVmRestartToastEffect(bfm, 0);
            NavigationEffectKt.NavigationEffect(bfm, 0);
            HatchUiControlEffectsKt.HatchUiControlEffects(bfm, 0);
            AppGlobalEffectKt.AppGlobalEffects(false, bfm, 6);
            ConversationResumeResetEffectKt.ConversationResumeResetEffect(null, null, bfm, 0, 3);
            HatchScreenshotShareEffectKt.HatchScreenshotShareEffect(bfm, 0);
            PlayInAppUpdateEffectKt.PlayInAppUpdateEffect(bfm, 0);
            HatchInAppReviewEffectKt.HatchInAppReviewEffect(bfm, 0);
            HatchActivationGateEffectKt.HatchActivationGateEffect(bfm, 0);
            AppFloatingLayerKt.AppFloatingEffects(bfm, 0);
            AppFloatingLayerKt.AppFloatingLayers(null, true, bfm, 48, 1);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(i);
            C3cG.A1D(bBbAAc, anonymousClass2);
        }
    }

    public static final void ViewModelInitialization(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 1457942364, i), bfm, i)) {
            Context applicationContext = AnonymousClass002.A0H(bfm).getApplicationContext();
            AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
            long jA05 = C3cG.A05(bfm.A6v(LocalUserSessionKt.LocalUserSessionGeneration));
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = AnonymousClass001.A0j(bfm, HatchLockGating.INSTANCE.isEnabled());
            }
            if (AnonymousClass001.A1X(objAaT)) {
                bfm.AgE(-1443053374);
                HatchPauseViewModel.Factory factory = new HatchPauseViewModel.Factory(abstractC3358CGzA0g);
                ComponentActivity componentActivityA0A = C3cH.A0A(bfm, AKL.A00);
                BQN.A00(factory, componentActivityA0A, AnonymousClass003.A0Z(componentActivityA0A), null, C3cG.A0x(HatchPauseViewModel.class));
            } else {
                bfm.AgE(-1442957274);
            }
            AnonymousClass002.A19(bfm);
            C7384Etj.A0X(applicationContext);
            AppBiometricLockViewModel.Factory factory2 = new AppBiometricLockViewModel.Factory(abstractC3358CGzA0g, applicationContext);
            String strActivityViewModelKey = LocalUserSessionKt.activityViewModelKey(AppBiometricLockViewModel.class, jA05);
            AKH<Activity> akh = AKL.A00;
            ComponentActivity componentActivityA0A2 = C3cH.A0A(bfm, akh);
            BQN.A00(factory2, componentActivityA0A2, AnonymousClass003.A0Z(componentActivityA0A2), strActivityViewModelKey, C3cG.A0x(AppBiometricLockViewModel.class));
            HatchCheckpointViewModel.Factory factory3 = new HatchCheckpointViewModel.Factory(abstractC3358CGzA0g);
            ComponentActivity componentActivityA0A3 = C3cH.A0A(bfm, akh);
            BQN.A00(factory3, componentActivityA0A3, AnonymousClass003.A0Z(componentActivityA0A3), null, C3cG.A0x(HatchCheckpointViewModel.class));
            VmUnavailableViewModel.Factory factory4 = new VmUnavailableViewModel.Factory(abstractC3358CGzA0g);
            ComponentActivity componentActivityA0A4 = C3cH.A0A(bfm, akh);
            BQN.A00(factory4, componentActivityA0A4, AnonymousClass003.A0Z(componentActivityA0A4), null, C3cG.A0x(VmUnavailableViewModel.class));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121682(i);
        }
    }
}
