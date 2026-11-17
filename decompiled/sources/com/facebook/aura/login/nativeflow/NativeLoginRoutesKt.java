package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AKL;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B81;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7OQ;
import X.C7OU;
import X.C7bA;
import X.EnumC3085Bxl;
import X.G0U;
import X.G0V;
import X.HpR;
import X.InterfaceC7353EnQ;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.login.nativeflow.NativeLoginViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.NativeLoginAccountSelectionScreenKey;
import com.facebook.aura.navigation.key.NativeLoginBirthdayScreenKey;
import com.facebook.aura.navigation.key.NativeLoginCheckpointScreenKey;
import com.facebook.aura.navigation.key.NativeLoginItemizedConsentScreenKey;
import com.facebook.aura.navigation.key.NativeLoginLandingScreenKey;
import com.facebook.aura.navigation.key.NativeLoginLinkingDisclosureScreenKey;
import com.facebook.aura.navigation.key.NativeLoginNameScreenKey;
import com.facebook.aura.navigation.key.NativeLoginNtpUpsellChoiceScreenKey;
import com.facebook.aura.navigation.key.NativeLoginNtpUpsellScreenKey;
import com.facebook.aura.navigation.key.NativeLoginOtpScreenKey;
import com.facebook.aura.navigation.key.NativeLoginPasswordScreenKey;
import com.facebook.aura.navigation.key.NativeLoginReactivationScreenKey;
import com.facebook.aura.navigation.key.NativeLoginTwoFactorMethodScreenKey;
import com.facebook.aura.navigation.key.NativeLoginTwoFactorScreenKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class NativeLoginRoutesKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginAccountSelectionRoute$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginAccountSelectionRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginAccountSelectionRoute$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginAccountSelectionRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginBirthdayRoute$12, reason: invalid class name */
    public final class AnonymousClass12 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginBirthdayRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginCheckpointRoute$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginCheckpointRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginCheckpointWebRoute$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginCheckpointWebRoute(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginEffects$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ NativeLoginViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NativeLoginViewModel nativeLoginViewModel, AuraNavigator auraNavigator, int i) {
            super(2);
            this.$viewModel = nativeLoginViewModel;
            this.$navigator = auraNavigator;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginEffects(this.$viewModel, this.$navigator, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginEntryOffers$2, reason: invalid class name and case insensitive filesystem */
    public final class C125662 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $offersCredentials;
        public final /* synthetic */ NativeLoginViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125662(NativeLoginViewModel nativeLoginViewModel, boolean z, int i) {
            super(2);
            this.$viewModel = nativeLoginViewModel;
            this.$offersCredentials = z;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginEntryOffers(this.$viewModel, this.$offersCredentials, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginError$1, reason: invalid class name and case insensitive filesystem */
    public final class C125671 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ NativeLoginErrorDialogContent $content;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ AuraNavKey $screenKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125671(AuraNavKey auraNavKey, NativeLoginErrorDialogContent nativeLoginErrorDialogContent, Function0<Unit> function0, int i) {
            super(2);
            this.$screenKey = auraNavKey;
            this.$content = nativeLoginErrorDialogContent;
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginError(this.$screenKey, this.$content, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginIntroRoute$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginIntroRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginItemizedConsentRoute$6, reason: invalid class name and case insensitive filesystem */
    public final class C125686 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125686(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginItemizedConsentRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginLandingRoute$12, reason: invalid class name and case insensitive filesystem */
    public final class C1256912 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1256912(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginLandingRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginLinkingDisclosureRoute$5, reason: invalid class name and case insensitive filesystem */
    public final class C125705 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125705(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginLinkingDisclosureRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginMoreAccountsSheetRoute$6, reason: invalid class name and case insensitive filesystem */
    public final class C125716 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125716(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginMoreAccountsSheetRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginNameRoute$13, reason: invalid class name */
    public final class AnonymousClass13 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginNameRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginNtpUpsellChoiceRoute$7, reason: invalid class name and case insensitive filesystem */
    public final class C125727 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125727(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginNtpUpsellChoiceRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginNtpUpsellRoute$7, reason: invalid class name and case insensitive filesystem */
    public final class C125737 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125737(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginNtpUpsellRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginOtpRoute$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginOtpRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginPasswordRoute$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginPasswordRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginPhoneEntryRoute$13, reason: invalid class name and case insensitive filesystem */
    public final class C1257413 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1257413(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginPhoneEntryRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginReactivationRoute$6, reason: invalid class name and case insensitive filesystem */
    public final class C125756 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125756(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginReactivationRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginTwoFactorMethodRoute$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginTwoFactorMethodRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginTwoFactorRoute$7, reason: invalid class name and case insensitive filesystem */
    public final class C125767 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125767(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginRoutesKt.NativeLoginTwoFactorRoute(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$popTwoFactorScreens$1, reason: invalid class name and case insensitive filesystem */
    public final class C125771 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final C125771 INSTANCE = new C125771();

        public C125771() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(NativeLoginRoutesKt.isTwoFactorScreenKey(auraNavKey));
        }
    }

    public static final void NativeLoginCheckpointWebRoute(BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass5;
        BRg bRg2 = bRg;
        bfm.AgG(-1977056520);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            NativeLoginViewModel nativeLoginViewModel = nativeLoginViewModel(bfm, 0);
            C1BO c1boA04 = C3cI.A04(bfm, nativeLoginViewModel, auraNavigatorA0b, nativeLoginViewModel.uiState);
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(nativeLoginViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new NativeLoginRoutesKt$NativeLoginCheckpointWebRoute$1$1(nativeLoginViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, unit);
            HatchCheckpointChallenge hatchCheckpointChallenge = C3cH.A0Q(c1boA04).checkpoint;
            if (hatchCheckpointChallenge == null || !C3cH.A0Q(c1boA04).checkpointWebViewVisible) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass5 = new NativeLoginRoutesKt$NativeLoginCheckpointWebRoute$checkpoint$2(bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass5);
                }
                return;
            }
            String str = hatchCheckpointChallenge.url;
            boolean zA672 = bfm.A67(nativeLoginViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginCheckpointWebRoute$2$1(nativeLoginViewModel);
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT2);
            boolean zA673 = bfm.A67(nativeLoginViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA673 || objAaT3 == C78N.A00) {
                objAaT3 = new NativeLoginRoutesKt$NativeLoginCheckpointWebRoute$3$1(nativeLoginViewModel);
                bfm.Ai0(objAaT3);
            }
            Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT3);
            boolean zA674 = bfm.A67(nativeLoginViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA674 || objAaT4 == C78N.A00) {
                objAaT4 = new NativeLoginRoutesKt$NativeLoginCheckpointWebRoute$4$1(nativeLoginViewModel);
                bfm.Ai0(objAaT4);
            }
            NativeLoginCheckpointWebScreenKt.NativeLoginCheckpointWebScreen(str, g0u, function0, (Function0) ((InterfaceC7353EnQ) objAaT4), bRg2, bfm, (iA0d << 12) & 57344, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
    }

    public static final boolean isTwoFactorScreenKey(AuraNavKey auraNavKey) {
        return (auraNavKey instanceof NativeLoginTwoFactorScreenKey) || (auraNavKey instanceof NativeLoginTwoFactorMethodScreenKey);
    }

    public static final void NativeLoginAccountSelectionRoute(BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass7;
        bfm.AgG(-1862140164);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            NativeLoginViewModel nativeLoginViewModel = nativeLoginViewModel(bfm, 0);
            C1BO c1boA04 = C3cI.A04(bfm, nativeLoginViewModel, auraNavigatorA0b, nativeLoginViewModel.uiState);
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = NativeLoginRoutesKt$NativeLoginAccountSelectionRoute$pageShownLogged$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            if (C3cH.A0Q(c1boA04).accountSelectionAccounts.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass7 = new AnonymousClass1(i);
                    C3cG.A1D(bBbAAc, anonymousClass7);
                }
                return;
            }
            Unit unit = Unit.INSTANCE;
            boolean zA1J = AnonymousClass003.A1J(bfm, mutableStateA0N, nativeLoginViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA1J || objAaT2 == obj) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginAccountSelectionRoute$2$1(nativeLoginViewModel, mutableStateA0N);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, unit);
            AHD<NativeLoginAccountUiModel> ahd = C3cH.A0Q(c1boA04).accountSelectionAccounts;
            boolean accountSelectionSingleCard = C3cH.A0Q(c1boA04).getAccountSelectionSingleCard();
            String str = C3cH.A0Q(c1boA04).destination;
            String str2 = C3cH.A0Q(c1boA04).selectedAccountSelectionId;
            boolean zA67 = bfm.A67(nativeLoginViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new NativeLoginRoutesKt$NativeLoginAccountSelectionRoute$3$1(nativeLoginViewModel);
                bfm.Ai0(objAaT3);
            }
            G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT3);
            boolean zA672 = bfm.A67(nativeLoginViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA672 || objAaT4 == obj) {
                objAaT4 = new NativeLoginRoutesKt$NativeLoginAccountSelectionRoute$4$1(nativeLoginViewModel);
                bfm.Ai0(objAaT4);
            }
            Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT4);
            boolean zA673 = bfm.A67(nativeLoginViewModel);
            Object objAaT5 = bfm.AaT();
            if (zA673 || objAaT5 == obj) {
                objAaT5 = new NativeLoginRoutesKt$NativeLoginAccountSelectionRoute$5$1(nativeLoginViewModel);
                bfm.Ai0(objAaT5);
            }
            NativeLoginAccountSelectionScreenKt.NativeLoginAccountSelectionScreen(ahd, accountSelectionSingleCard, str, str2, g0u, function0, (Function0) ((InterfaceC7353EnQ) objAaT5), null, bfm, NativeLoginAccountUiModel.$stable, 128);
            NativeLoginAccountSelectionScreenKey nativeLoginAccountSelectionScreenKey = NativeLoginAccountSelectionScreenKey.INSTANCE;
            NativeLoginErrorDialogContent nativeLoginErrorDialogContentA0H = C3cI.A0H(c1boA04);
            boolean zA674 = bfm.A67(nativeLoginViewModel);
            Object objAaT6 = bfm.AaT();
            if (zA674 || objAaT6 == obj) {
                objAaT6 = new NativeLoginRoutesKt$NativeLoginAccountSelectionRoute$6$1(nativeLoginViewModel);
                bfm.Ai0(objAaT6);
            }
            C3cJ.A0a(bfm, nativeLoginErrorDialogContentA0H, nativeLoginAccountSelectionScreenKey, objAaT6);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass7 = new AnonymousClass7(i);
            C3cG.A1D(bBbAAc, anonymousClass7);
        }
    }

    public static final void NativeLoginBirthdayRoute(BFM bfm, int i) {
        bfm.AgG(1993658010);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            NativeLoginViewModel nativeLoginViewModel = nativeLoginViewModel(bfm, 0);
            C1BO c1boA04 = C3cI.A04(bfm, nativeLoginViewModel, auraNavigatorA0b, nativeLoginViewModel.uiState);
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(nativeLoginViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new NativeLoginRoutesKt$NativeLoginBirthdayRoute$1$1(nativeLoginViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, unit);
            boolean zA1O = AnonymousClass003.A1O(bfm, nativeLoginViewModel, c1boA04, bfm.A67(auraNavigatorA0b));
            Object objAaT2 = bfm.AaT();
            if (zA1O || objAaT2 == C78N.A00) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginBirthdayRoute$onBack$1$1(auraNavigatorA0b, nativeLoginViewModel, c1boA04);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            B81.A00(false, function0, bfm, 0, 1);
            String str = C3cH.A0Q(c1boA04).birthday;
            boolean zA672 = bfm.A67(nativeLoginViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new NativeLoginRoutesKt$NativeLoginBirthdayRoute$2$1(nativeLoginViewModel);
                bfm.Ai0(objAaT3);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT3;
            boolean zA673 = bfm.A67(nativeLoginViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA673 || objAaT4 == C78N.A00) {
                objAaT4 = new NativeLoginRoutesKt$NativeLoginBirthdayRoute$3$1(nativeLoginViewModel);
                bfm.Ai0(objAaT4);
            }
            InterfaceC7353EnQ interfaceC7353EnQ2 = (InterfaceC7353EnQ) objAaT4;
            String str2 = C3cH.A0Q(c1boA04).signupFirstName;
            boolean zA674 = bfm.A67(nativeLoginViewModel);
            Object objAaT5 = bfm.AaT();
            if (zA674 || objAaT5 == C78N.A00) {
                objAaT5 = new NativeLoginRoutesKt$NativeLoginBirthdayRoute$4$1(nativeLoginViewModel);
                bfm.Ai0(objAaT5);
            }
            InterfaceC7353EnQ interfaceC7353EnQ3 = (InterfaceC7353EnQ) objAaT5;
            String str3 = C3cH.A0Q(c1boA04).signupLastName;
            boolean zA675 = bfm.A67(nativeLoginViewModel);
            Object objAaT6 = bfm.AaT();
            if (zA675 || objAaT6 == C78N.A00) {
                objAaT6 = new NativeLoginRoutesKt$NativeLoginBirthdayRoute$5$1(nativeLoginViewModel);
                bfm.Ai0(objAaT6);
            }
            InterfaceC7353EnQ interfaceC7353EnQ4 = (InterfaceC7353EnQ) objAaT6;
            boolean z = C3cH.A0Q(c1boA04).collectsSignupName;
            boolean z2 = C3cH.A0Q(c1boA04).collectsSignupBirthday;
            String str4 = C3cH.A0Q(c1boA04).signupPassword;
            boolean zA676 = bfm.A67(nativeLoginViewModel);
            Object objAaT7 = bfm.AaT();
            if (zA676 || objAaT7 == C78N.A00) {
                objAaT7 = new NativeLoginRoutesKt$NativeLoginBirthdayRoute$6$1(nativeLoginViewModel);
                bfm.Ai0(objAaT7);
            }
            InterfaceC7353EnQ interfaceC7353EnQ5 = (InterfaceC7353EnQ) objAaT7;
            boolean z3 = C3cH.A0Q(c1boA04).collectsSignupPassword;
            String strMessageFor = NativeLoginCommonKt.messageFor(C3cH.A0Q(c1boA04).fieldError, NativeLoginField.SIGNUP_PASSWORD, bfm, NativeLoginFieldError.$stable | 48);
            boolean zA677 = bfm.A67(nativeLoginViewModel);
            Object objAaT8 = bfm.AaT();
            if (zA677 || objAaT8 == C78N.A00) {
                objAaT8 = new NativeLoginRoutesKt$NativeLoginBirthdayRoute$7$1(nativeLoginViewModel);
                bfm.Ai0(objAaT8);
            }
            InterfaceC7353EnQ interfaceC7353EnQ6 = (InterfaceC7353EnQ) objAaT8;
            NativeLoginBirthdayError nativeLoginBirthdayError = C3cH.A0Q(c1boA04).birthdayError;
            boolean zA1T = C3cI.A1T(c1boA04);
            HatchTosDisclosure hatchTosDisclosure = C3cH.A0Q(c1boA04).completionTos;
            HatchTosDisclosure hatchTosDisclosure2 = C3cH.A0Q(c1boA04).completionClause;
            boolean zA678 = bfm.A67(nativeLoginViewModel);
            Object objAaT9 = bfm.AaT();
            if (zA678 || objAaT9 == C78N.A00) {
                objAaT9 = new NativeLoginRoutesKt$NativeLoginBirthdayRoute$8$1(nativeLoginViewModel);
                bfm.Ai0(objAaT9);
            }
            InterfaceC7353EnQ interfaceC7353EnQ7 = (InterfaceC7353EnQ) objAaT9;
            Function0 function02 = (Function0) interfaceC7353EnQ;
            G0U g0u = (G0U) interfaceC7353EnQ2;
            G0U g0u2 = (G0U) interfaceC7353EnQ3;
            G0U g0u3 = (G0U) interfaceC7353EnQ4;
            G0U g0u4 = (G0U) interfaceC7353EnQ5;
            Function0 function03 = (Function0) interfaceC7353EnQ6;
            boolean zA679 = bfm.A67(nativeLoginViewModel);
            Object objAaT10 = bfm.AaT();
            if (zA679 || objAaT10 == C78N.A00) {
                objAaT10 = new NativeLoginRoutesKt$NativeLoginBirthdayRoute$9$1(nativeLoginViewModel);
                bfm.Ai0(objAaT10);
            }
            G0U g0u5 = (G0U) objAaT10;
            boolean zA6710 = bfm.A67(nativeLoginViewModel);
            Object objAaT11 = bfm.AaT();
            if (zA6710 || objAaT11 == C78N.A00) {
                objAaT11 = new NativeLoginRoutesKt$NativeLoginBirthdayRoute$10$1(nativeLoginViewModel);
                bfm.Ai0(objAaT11);
            }
            NativeLoginBirthdayScreenKt.NativeLoginBirthdayScreen(str, function02, g0u, str2, g0u2, str3, g0u3, z, z2, true, str4, g0u4, z3, strMessageFor, function03, function0, g0u5, (G0U) objAaT11, nativeLoginBirthdayError, zA1T, (Function0) interfaceC7353EnQ7, null, hatchTosDisclosure, hatchTosDisclosure2, bfm, 805306368, 0, 0, 2097152);
            NativeLoginBirthdayScreenKey nativeLoginBirthdayScreenKey = NativeLoginBirthdayScreenKey.INSTANCE;
            NativeLoginErrorDialogContent nativeLoginErrorDialogContentA0H = C3cI.A0H(c1boA04);
            boolean zA6711 = bfm.A67(nativeLoginViewModel);
            Object objAaT12 = bfm.AaT();
            if (zA6711 || objAaT12 == C78N.A00) {
                objAaT12 = new NativeLoginRoutesKt$NativeLoginBirthdayRoute$11$1(nativeLoginViewModel);
                bfm.Ai0(objAaT12);
            }
            C3cJ.A0a(bfm, nativeLoginErrorDialogContentA0H, nativeLoginBirthdayScreenKey, objAaT12);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass12(i);
        }
    }

    public static final void NativeLoginCheckpointRoute(BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass6;
        bfm.AgG(266580005);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            NativeLoginViewModel nativeLoginViewModel = nativeLoginViewModel(bfm, 0);
            C1BO c1boA04 = C3cI.A04(bfm, nativeLoginViewModel, auraNavigatorA0b, nativeLoginViewModel.uiState);
            HatchCheckpointChallenge hatchCheckpointChallenge = C3cH.A0Q(c1boA04).checkpoint;
            if (hatchCheckpointChallenge == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass6 = new NativeLoginRoutesKt$NativeLoginCheckpointRoute$checkpoint$1(i);
                    C3cG.A1D(bBbAAc, anonymousClass6);
                }
                return;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = NativeLoginRoutesKt$NativeLoginCheckpointRoute$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            B81.A00(false, (Function0) objAaT, bfm, 48, 1);
            EnumC3085Bxl enumC3085Bxl = EnumC3085Bxl.ON_RESUME;
            boolean zA67 = bfm.A67(nativeLoginViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginCheckpointRoute$2$1(nativeLoginViewModel);
                bfm.Ai0(objAaT2);
            }
            C7bA.A00(bfm, enumC3085Bxl, null, (Function0) objAaT2, 6, 2);
            NativeLoginCheckpointAction nativeLoginCheckpointAction = C3cH.A0Q(c1boA04).checkpointPrimaryAction;
            boolean zA672 = bfm.A67(nativeLoginViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == obj) {
                objAaT3 = new NativeLoginRoutesKt$NativeLoginCheckpointRoute$3$1(nativeLoginViewModel);
                bfm.Ai0(objAaT3);
            }
            Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT3);
            boolean zA673 = bfm.A67(nativeLoginViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA673 || objAaT4 == obj) {
                objAaT4 = new NativeLoginRoutesKt$NativeLoginCheckpointRoute$4$1(nativeLoginViewModel);
                bfm.Ai0(objAaT4);
            }
            NativeLoginCheckpointScreenKt.NativeLoginCheckpointScreen(hatchCheckpointChallenge, nativeLoginCheckpointAction, function0, (Function0) objAaT4, C3cI.A1T(c1boA04), null, bfm, 0, 32);
            NativeLoginCheckpointScreenKey nativeLoginCheckpointScreenKey = NativeLoginCheckpointScreenKey.INSTANCE;
            NativeLoginErrorDialogContent nativeLoginErrorDialogContentA0H = C3cI.A0H(c1boA04);
            boolean zA674 = bfm.A67(nativeLoginViewModel);
            Object objAaT5 = bfm.AaT();
            if (zA674 || objAaT5 == obj) {
                objAaT5 = new NativeLoginRoutesKt$NativeLoginCheckpointRoute$5$1(nativeLoginViewModel);
                bfm.Ai0(objAaT5);
            }
            C3cJ.A0a(bfm, nativeLoginErrorDialogContentA0H, nativeLoginCheckpointScreenKey, objAaT5);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass6 = new AnonymousClass6(i);
            C3cG.A1D(bBbAAc, anonymousClass6);
        }
    }

    public static final void NativeLoginEffects(NativeLoginViewModel nativeLoginViewModel, AuraNavigator auraNavigator, BFM bfm, int i) {
        bfm.AgG(-33319490);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeLoginViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraNavigator, bfm, i) ? 1 : 0);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            View viewA0J = AnonymousClass001.A0J(bfm);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120504);
            HpR hpR = new HpR();
            int i2 = iA05 & 14;
            boolean z2 = i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(nativeLoginViewModel));
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new NativeLoginRoutesKt$NativeLoginEffects$smsConsentLauncher$1$1(nativeLoginViewModel);
                bfm.Ai0(objAaT);
            }
            C7OU c7ouA00 = C7OQ.A00(hpR, bfm, (G0U) objAaT);
            boolean zA1T = AnonymousClass001.A1T(bfm, c7ouA00, i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(nativeLoginViewModel)));
            if ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(auraNavigator))) {
                z = true;
            }
            boolean zA1R = AnonymousClass001.A1R(bfm, strA01, AnonymousClass005.A1Y(bfm, contextA0H, viewA0J, zA1T, z));
            Object objAaT2 = bfm.AaT();
            if (zA1R || objAaT2 == C78N.A00) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginEffects$1$1(nativeLoginViewModel, c7ouA00, auraNavigator, contextA0H, viewA0J, strA01, null);
                bfm.Ai0(objAaT2);
            }
            C78e.A02(bfm, nativeLoginViewModel, auraNavigator, c7ouA00, (G0V) objAaT2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(nativeLoginViewModel, auraNavigator, i);
        }
    }

    public static final void NativeLoginEntryOffers(NativeLoginViewModel nativeLoginViewModel, boolean z, BFM bfm, int i) {
        bfm.AgG(-2078693461);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeLoginViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA67 = ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(nativeLoginViewModel))) | bfm.A67(activity) | ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new NativeLoginRoutesKt$NativeLoginEntryOffers$1$1(activity, nativeLoginViewModel, z);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, activity, boolValueOf);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125662(nativeLoginViewModel, z, i);
        }
    }

    public static final void NativeLoginError(AuraNavKey auraNavKey, NativeLoginErrorDialogContent nativeLoginErrorDialogContent, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-1461322728);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraNavKey, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(nativeLoginErrorDialogContent, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            if (nativeLoginErrorDialogContent == null || !C7384Etj.areEqual(C3cG.A0H(auraNavigatorA0b), auraNavKey)) {
                bfm.AgE(-476287350);
            } else {
                bfm.AgE(-476358464);
                int i2 = iA05 >> 3;
                NativeLoginCommonKt.NativeLoginErrorDialog(nativeLoginErrorDialogContent, function0, bfm, NativeLoginErrorDialogContent.$stable | (i2 & 14) | (i2 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125671(auraNavKey, nativeLoginErrorDialogContent, function0, i);
        }
    }

    public static final void NativeLoginIntroRoute(BFM bfm, int i) {
        bfm.AgG(330461697);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            C1BO c1boA02 = C2CK.A02(bfm, nativeLoginViewModel(bfm, 0).initialDestination);
            boolean zA65 = bfm.A65(c1boA02);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new NativeLoginRoutesKt$NativeLoginIntroRoute$1$1(c1boA02);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginIntroRoute$2$1(auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            NativeLoginIntroLogoKt.NativeLoginIntroLogo(function0, (G0U) objAaT2, null, bfm, 0, 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(i);
        }
    }

    public static final void NativeLoginItemizedConsentRoute(BFM bfm, int i) {
        BBb bBbAAc;
        Object c125686;
        HatchItemizedConsent consent;
        bfm.AgG(-1218957428);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            NativeLoginViewModel nativeLoginViewModel = nativeLoginViewModel(bfm, 0);
            C1BO c1boA04 = C3cI.A04(bfm, nativeLoginViewModel, auraNavigatorA0b, nativeLoginViewModel.uiState);
            NativeLoginItemizedConsentTarget nativeLoginItemizedConsentTarget = C3cH.A0Q(c1boA04).itemizedConsentTarget;
            if (nativeLoginItemizedConsentTarget == null || (consent = nativeLoginItemizedConsentTarget.getConsent()) == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c125686 = new NativeLoginRoutesKt$NativeLoginItemizedConsentRoute$consent$1(i);
                    C3cG.A1D(bBbAAc, c125686);
                }
                return;
            }
            boolean zA1O = C3cH.A1O(bfm, c1boA04, nativeLoginViewModel, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new NativeLoginRoutesKt$NativeLoginItemizedConsentRoute$onBack$1$1(nativeLoginViewModel, auraNavigatorA0b, c1boA04);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            B81.A00(false, function0, bfm, 0, 1);
            AHD<Boolean> ahd = C3cH.A0Q(c1boA04).itemizedConsentAccepted;
            boolean z = C3cH.A0Q(c1boA04).itemizedConsentAllAccepted;
            boolean z2 = C3cH.A0Q(c1boA04).itemizedConsentConfirmEnabled;
            boolean zA67 = bfm.A67(nativeLoginViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginItemizedConsentRoute$1$1(nativeLoginViewModel);
                bfm.Ai0(objAaT2);
            }
            G0V g0v = (G0V) ((InterfaceC7353EnQ) objAaT2);
            boolean zA672 = bfm.A67(nativeLoginViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new NativeLoginRoutesKt$NativeLoginItemizedConsentRoute$2$1(nativeLoginViewModel);
                bfm.Ai0(objAaT3);
            }
            G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT3);
            boolean zA673 = bfm.A67(nativeLoginViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA673 || objAaT4 == C78N.A00) {
                objAaT4 = new NativeLoginRoutesKt$NativeLoginItemizedConsentRoute$3$1(nativeLoginViewModel);
                bfm.Ai0(objAaT4);
            }
            Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT4);
            boolean zA1M = AnonymousClass003.A1M(bfm, nativeLoginViewModel, auraNavigatorA0b);
            Object objAaT5 = bfm.AaT();
            if (zA1M || objAaT5 == C78N.A00) {
                objAaT5 = new NativeLoginRoutesKt$NativeLoginItemizedConsentRoute$4$1(nativeLoginViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT5);
            }
            NativeLoginItemizedConsentScreenKt.NativeLoginItemizedConsentScreen(consent, ahd, z, z2, g0v, g0u, function02, (Function0) objAaT5, function0, C3cI.A1T(c1boA04), null, null, null, bfm, 0, 0, 7168);
            NativeLoginItemizedConsentScreenKey nativeLoginItemizedConsentScreenKey = NativeLoginItemizedConsentScreenKey.INSTANCE;
            NativeLoginErrorDialogContent nativeLoginErrorDialogContentA0H = C3cI.A0H(c1boA04);
            boolean zA674 = bfm.A67(nativeLoginViewModel);
            Object objAaT6 = bfm.AaT();
            if (zA674 || objAaT6 == C78N.A00) {
                objAaT6 = new NativeLoginRoutesKt$NativeLoginItemizedConsentRoute$5$1(nativeLoginViewModel);
                bfm.Ai0(objAaT6);
            }
            C3cJ.A0a(bfm, nativeLoginErrorDialogContentA0H, nativeLoginItemizedConsentScreenKey, objAaT6);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c125686 = new C125686(i);
            C3cG.A1D(bBbAAc, c125686);
        }
    }

    public static final void NativeLoginLandingRoute(BFM bfm, int i) {
        bfm.AgG(1588897324);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            NativeLoginViewModel nativeLoginViewModel = nativeLoginViewModel(bfm, 0);
            C1BO c1boA02 = C2CK.A02(bfm, nativeLoginViewModel.uiState);
            int i2 = NativeLoginViewModel.$stable;
            NativeLoginEffects(nativeLoginViewModel, auraNavigatorA0b, bfm, i2);
            NativeLoginEntryOffers(nativeLoginViewModel, false, bfm, i2 | 48);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass001.A0j(bfm, nativeLoginViewModel.claimHeroLogoAnimation());
            }
            boolean zA1X = AnonymousClass001.A1X(objAaT);
            Unit unit = Unit.INSTANCE;
            boolean zA1M = AnonymousClass003.A1M(bfm, nativeLoginViewModel, auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == obj) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginLandingRoute$1$1(nativeLoginViewModel, auraNavigatorA0b, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, unit);
            AHD<NativeLoginAccountUiModel> ahd = C3cH.A0Q(c1boA02).accounts;
            NativeLoginResolveState nativeLoginResolveState = C3cH.A0Q(c1boA02).resolveState;
            boolean zA67 = bfm.A67(nativeLoginViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new NativeLoginRoutesKt$NativeLoginLandingRoute$2$1(nativeLoginViewModel);
                bfm.Ai0(objAaT3);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT3;
            boolean zA672 = bfm.A67(nativeLoginViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA672 || objAaT4 == obj) {
                objAaT4 = new NativeLoginRoutesKt$NativeLoginLandingRoute$3$1(nativeLoginViewModel);
                bfm.Ai0(objAaT4);
            }
            InterfaceC7353EnQ interfaceC7353EnQ2 = (InterfaceC7353EnQ) objAaT4;
            boolean zA673 = bfm.A67(nativeLoginViewModel);
            Object objAaT5 = bfm.AaT();
            if (zA673 || objAaT5 == obj) {
                objAaT5 = new NativeLoginRoutesKt$NativeLoginLandingRoute$4$1(nativeLoginViewModel);
                bfm.Ai0(objAaT5);
            }
            InterfaceC7353EnQ interfaceC7353EnQ3 = (InterfaceC7353EnQ) objAaT5;
            boolean zA674 = bfm.A67(nativeLoginViewModel);
            Object objAaT6 = bfm.AaT();
            if (zA674 || objAaT6 == obj) {
                objAaT6 = new NativeLoginRoutesKt$NativeLoginLandingRoute$5$1(nativeLoginViewModel);
                bfm.Ai0(objAaT6);
            }
            InterfaceC7353EnQ interfaceC7353EnQ4 = (InterfaceC7353EnQ) objAaT6;
            boolean zA675 = bfm.A67(nativeLoginViewModel);
            Object objAaT7 = bfm.AaT();
            if (zA675 || objAaT7 == obj) {
                objAaT7 = new NativeLoginRoutesKt$NativeLoginLandingRoute$6$1(nativeLoginViewModel);
                bfm.Ai0(objAaT7);
            }
            InterfaceC7353EnQ interfaceC7353EnQ5 = (InterfaceC7353EnQ) objAaT7;
            boolean zA676 = bfm.A67(nativeLoginViewModel);
            Object objAaT8 = bfm.AaT();
            if (zA676 || objAaT8 == obj) {
                objAaT8 = new NativeLoginRoutesKt$NativeLoginLandingRoute$7$1(nativeLoginViewModel);
                bfm.Ai0(objAaT8);
            }
            String str = C3cH.A0Q(c1boA02).accountOptions;
            String str2 = C3cH.A0Q(c1boA02).selectedAccountId;
            NativeLoginLandingStatus nativeLoginLandingStatusLandingStatus = nativeLoginViewModel.landingStatus(C3cH.A0Q(c1boA02));
            HatchTosDisclosure hatchTosDisclosure = C3cH.A0Q(c1boA02).entryTos;
            AHD<NativeLoginAccountUiModel> ahd2 = C3cH.A0Q(c1boA02).disclosedAccounts;
            AHD<NativeLoginAccountUiModel> ahd3 = C3cH.A0Q(c1boA02).removableAccounts;
            HatchLandingPresentation hatchLandingPresentation = C3cH.A0Q(c1boA02).landingPresentation;
            AHD<NativeLoginAccountUiModel> ahd4 = C3cH.A0Q(c1boA02).shownAccounts;
            AHD<NativeLoginAccountUiModel> ahd5 = C3cH.A0Q(c1boA02).neutralCollapsedAccounts;
            G0U g0u = (G0U) interfaceC7353EnQ;
            Function0 function0 = (Function0) interfaceC7353EnQ2;
            G0U g0u2 = (G0U) interfaceC7353EnQ3;
            Function0 function02 = (Function0) interfaceC7353EnQ4;
            Function0 function03 = (Function0) interfaceC7353EnQ5;
            Function0 function04 = (Function0) ((InterfaceC7353EnQ) objAaT8);
            boolean zA1M2 = AnonymousClass003.A1M(bfm, auraNavigatorA0b, nativeLoginViewModel);
            Object objAaT9 = bfm.AaT();
            if (zA1M2 || objAaT9 == obj) {
                objAaT9 = new NativeLoginRoutesKt$NativeLoginLandingRoute$8$1(auraNavigatorA0b, nativeLoginViewModel);
                bfm.Ai0(objAaT9);
            }
            Function0 function05 = (Function0) objAaT9;
            boolean zA677 = bfm.A67(auraNavigatorA0b);
            Object objAaT10 = bfm.AaT();
            if (zA677 || objAaT10 == obj) {
                objAaT10 = new NativeLoginRoutesKt$NativeLoginLandingRoute$9$1(auraNavigatorA0b);
                bfm.Ai0(objAaT10);
            }
            Function0 function06 = (Function0) objAaT10;
            boolean zA678 = bfm.A67(nativeLoginViewModel);
            Object objAaT11 = bfm.AaT();
            if (zA678 || objAaT11 == obj) {
                objAaT11 = new NativeLoginRoutesKt$NativeLoginLandingRoute$10$1(nativeLoginViewModel);
                bfm.Ai0(objAaT11);
            }
            int i3 = NativeLoginAccountUiModel.$stable;
            NativeLoginLandingScreenKt.NativeLoginLandingScreen(ahd, nativeLoginResolveState, g0u, function0, g0u2, function02, function03, function04, function05, function06, (G0U) objAaT11, str, nativeLoginLandingStatusLandingStatus, hatchLandingPresentation, ahd4, ahd5, null, str2, hatchTosDisclosure, ahd2, ahd3, zA1X, bfm, i3, (i3 << 12) | (i3 << 15) | (i3 << 27), i3 | 48, 65536);
            NativeLoginLandingScreenKey nativeLoginLandingScreenKey = NativeLoginLandingScreenKey.INSTANCE;
            NativeLoginErrorDialogContent nativeLoginErrorDialogContentA0H = C3cI.A0H(c1boA02);
            boolean zA679 = bfm.A67(nativeLoginViewModel);
            Object objAaT12 = bfm.AaT();
            if (zA679 || objAaT12 == obj) {
                objAaT12 = new NativeLoginRoutesKt$NativeLoginLandingRoute$11$1(nativeLoginViewModel);
                bfm.Ai0(objAaT12);
            }
            C3cJ.A0a(bfm, nativeLoginErrorDialogContentA0H, nativeLoginLandingScreenKey, objAaT12);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1256912(i);
        }
    }

    public static final void NativeLoginLinkingDisclosureRoute(BFM bfm, int i) {
        BBb bBbAAc;
        Object c125705;
        bfm.AgG(-266492470);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            NativeLoginViewModel nativeLoginViewModel = nativeLoginViewModel(bfm, 0);
            C1BO c1boA04 = C3cI.A04(bfm, nativeLoginViewModel, auraNavigatorA0b, nativeLoginViewModel.uiState);
            NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState = C3cH.A0Q(c1boA04).linkingDisclosure;
            if (nativeLoginLinkingDisclosureUiState == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c125705 = new NativeLoginRoutesKt$NativeLoginLinkingDisclosureRoute$disclosure$1(i);
                    C3cG.A1D(bBbAAc, c125705);
                }
                return;
            }
            boolean zA1O = C3cH.A1O(bfm, c1boA04, nativeLoginViewModel, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new NativeLoginRoutesKt$NativeLoginLinkingDisclosureRoute$onBack$1$1(nativeLoginViewModel, auraNavigatorA0b, c1boA04);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            B81.A00(false, function0, bfm, 0, 1);
            boolean zA67 = bfm.A67(nativeLoginViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginLinkingDisclosureRoute$1$1(nativeLoginViewModel);
                bfm.Ai0(objAaT2);
            }
            Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT2);
            boolean zA672 = bfm.A67(nativeLoginViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new NativeLoginRoutesKt$NativeLoginLinkingDisclosureRoute$2$1(nativeLoginViewModel);
                bfm.Ai0(objAaT3);
            }
            Function0 function03 = (Function0) ((InterfaceC7353EnQ) objAaT3);
            boolean zA673 = bfm.A67(nativeLoginViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA673 || objAaT4 == C78N.A00) {
                objAaT4 = new NativeLoginRoutesKt$NativeLoginLinkingDisclosureRoute$3$1(nativeLoginViewModel);
                bfm.Ai0(objAaT4);
            }
            NativeLoginLinkingDisclosureScreenKt.NativeLoginLinkingDisclosureScreen(nativeLoginLinkingDisclosureUiState, function02, function03, function0, (G0U) objAaT4, C3cI.A1T(c1boA04), null, bfm, NativeLoginLinkingDisclosureUiState.$stable, 64);
            NativeLoginLinkingDisclosureScreenKey nativeLoginLinkingDisclosureScreenKey = NativeLoginLinkingDisclosureScreenKey.INSTANCE;
            NativeLoginErrorDialogContent nativeLoginErrorDialogContentA0H = C3cI.A0H(c1boA04);
            boolean zA674 = bfm.A67(nativeLoginViewModel);
            Object objAaT5 = bfm.AaT();
            if (zA674 || objAaT5 == C78N.A00) {
                objAaT5 = new NativeLoginRoutesKt$NativeLoginLinkingDisclosureRoute$4$1(nativeLoginViewModel);
                bfm.Ai0(objAaT5);
            }
            C3cJ.A0a(bfm, nativeLoginErrorDialogContentA0H, nativeLoginLinkingDisclosureScreenKey, objAaT5);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c125705 = new C125705(i);
            C3cG.A1D(bBbAAc, c125705);
        }
    }

    public static final void NativeLoginMoreAccountsSheetRoute(BFM bfm, int i) {
        bfm.AgG(-914782887);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            NativeLoginViewModel nativeLoginViewModel = nativeLoginViewModel(bfm, 0);
            C1BO c1boA02 = C2CK.A02(bfm, nativeLoginViewModel.uiState);
            boolean zOffersMoreAccounts = nativeLoginViewModel.offersMoreAccounts(C3cH.A0Q(c1boA02));
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new NativeLoginRoutesKt$NativeLoginMoreAccountsSheetRoute$close$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            Boolean boolValueOf = Boolean.valueOf(zOffersMoreAccounts);
            boolean zA1S = AnonymousClass003.A1S(bfm, function0, zOffersMoreAccounts);
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == C78N.A00) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginMoreAccountsSheetRoute$1$1(zOffersMoreAccounts, function0);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, boolValueOf);
            AHD<NativeLoginAccountUiModel> ahd = C3cH.A0Q(c1boA02).neutralCollapsedAccounts;
            boolean zA1J = AnonymousClass003.A1J(bfm, function0, nativeLoginViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA1J || objAaT3 == C78N.A00) {
                objAaT3 = new NativeLoginRoutesKt$NativeLoginMoreAccountsSheetRoute$2$1(function0, nativeLoginViewModel);
                bfm.Ai0(objAaT3);
            }
            G0U g0u = (G0U) objAaT3;
            boolean zA1J2 = AnonymousClass003.A1J(bfm, function0, nativeLoginViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA1J2 || objAaT4 == C78N.A00) {
                objAaT4 = new NativeLoginRoutesKt$NativeLoginMoreAccountsSheetRoute$3$1(function0, nativeLoginViewModel);
                bfm.Ai0(objAaT4);
            }
            Function0 function02 = (Function0) objAaT4;
            boolean zA65 = bfm.A65(function0);
            Object objAaT5 = bfm.AaT();
            if (zA65 || objAaT5 == C78N.A00) {
                objAaT5 = new NativeLoginRoutesKt$NativeLoginMoreAccountsSheetRoute$4$1(function0);
                bfm.Ai0(objAaT5);
            }
            Function0 function03 = (Function0) objAaT5;
            boolean zA672 = bfm.A67(nativeLoginViewModel);
            Object objAaT6 = bfm.AaT();
            if (zA672 || objAaT6 == C78N.A00) {
                objAaT6 = new NativeLoginRoutesKt$NativeLoginMoreAccountsSheetRoute$5$1(nativeLoginViewModel);
                bfm.Ai0(objAaT6);
            }
            HatchTosDisclosure hatchTosDisclosure = C3cH.A0Q(c1boA02).entryTos;
            AHD<NativeLoginAccountUiModel> ahd2 = C3cH.A0Q(c1boA02).disclosedAccounts;
            int i2 = NativeLoginAccountUiModel.$stable;
            NativeLoginNeutralLandingKt.NativeLoginMoreAccountsSheet(ahd, g0u, function02, function03, (G0U) objAaT6, hatchTosDisclosure, ahd2, null, bfm, i2 | (i2 << 18), 128);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125716(i);
        }
    }

    public static final void NativeLoginNameRoute(BFM bfm, int i) {
        bfm.AgG(860132264);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            NativeLoginViewModel nativeLoginViewModel = nativeLoginViewModel(bfm, 0);
            C1BO c1boA04 = C3cI.A04(bfm, nativeLoginViewModel, auraNavigatorA0b, nativeLoginViewModel.uiState);
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(nativeLoginViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new NativeLoginRoutesKt$NativeLoginNameRoute$1$1(nativeLoginViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, unit);
            String str = C3cH.A0Q(c1boA04).birthday;
            boolean zA672 = bfm.A67(nativeLoginViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginNameRoute$2$1(nativeLoginViewModel);
                bfm.Ai0(objAaT2);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT2;
            boolean zA673 = bfm.A67(nativeLoginViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA673 || objAaT3 == C78N.A00) {
                objAaT3 = new NativeLoginRoutesKt$NativeLoginNameRoute$3$1(nativeLoginViewModel);
                bfm.Ai0(objAaT3);
            }
            InterfaceC7353EnQ interfaceC7353EnQ2 = (InterfaceC7353EnQ) objAaT3;
            String str2 = C3cH.A0Q(c1boA04).signupFirstName;
            boolean zA674 = bfm.A67(nativeLoginViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA674 || objAaT4 == C78N.A00) {
                objAaT4 = new NativeLoginRoutesKt$NativeLoginNameRoute$4$1(nativeLoginViewModel);
                bfm.Ai0(objAaT4);
            }
            InterfaceC7353EnQ interfaceC7353EnQ3 = (InterfaceC7353EnQ) objAaT4;
            String str3 = C3cH.A0Q(c1boA04).signupLastName;
            boolean zA675 = bfm.A67(nativeLoginViewModel);
            Object objAaT5 = bfm.AaT();
            if (zA675 || objAaT5 == C78N.A00) {
                objAaT5 = new NativeLoginRoutesKt$NativeLoginNameRoute$5$1(nativeLoginViewModel);
                bfm.Ai0(objAaT5);
            }
            InterfaceC7353EnQ interfaceC7353EnQ4 = (InterfaceC7353EnQ) objAaT5;
            boolean z = C3cH.A0Q(c1boA04).requiresSignupConsent;
            String str4 = C3cH.A0Q(c1boA04).signupPassword;
            boolean zA676 = bfm.A67(nativeLoginViewModel);
            Object objAaT6 = bfm.AaT();
            if (zA676 || objAaT6 == C78N.A00) {
                objAaT6 = new NativeLoginRoutesKt$NativeLoginNameRoute$6$1(nativeLoginViewModel);
                bfm.Ai0(objAaT6);
            }
            InterfaceC7353EnQ interfaceC7353EnQ5 = (InterfaceC7353EnQ) objAaT6;
            boolean zA677 = bfm.A67(nativeLoginViewModel);
            Object objAaT7 = bfm.AaT();
            if (zA677 || objAaT7 == C78N.A00) {
                objAaT7 = new NativeLoginRoutesKt$NativeLoginNameRoute$7$1(nativeLoginViewModel);
                bfm.Ai0(objAaT7);
            }
            InterfaceC7353EnQ interfaceC7353EnQ6 = (InterfaceC7353EnQ) objAaT7;
            boolean zA678 = bfm.A67(nativeLoginViewModel);
            Object objAaT8 = bfm.AaT();
            if (zA678 || objAaT8 == C78N.A00) {
                objAaT8 = new NativeLoginRoutesKt$NativeLoginNameRoute$8$1(nativeLoginViewModel);
                bfm.Ai0(objAaT8);
            }
            InterfaceC7353EnQ interfaceC7353EnQ7 = (InterfaceC7353EnQ) objAaT8;
            boolean zA1T = C3cI.A1T(c1boA04);
            HatchTosDisclosure hatchTosDisclosure = C3cH.A0Q(c1boA04).completionTos;
            HatchTosDisclosure hatchTosDisclosure2 = C3cH.A0Q(c1boA04).completionClause;
            boolean zA679 = bfm.A67(nativeLoginViewModel);
            Object objAaT9 = bfm.AaT();
            if (zA679 || objAaT9 == C78N.A00) {
                objAaT9 = new NativeLoginRoutesKt$NativeLoginNameRoute$9$1(nativeLoginViewModel);
                bfm.Ai0(objAaT9);
            }
            InterfaceC7353EnQ interfaceC7353EnQ8 = (InterfaceC7353EnQ) objAaT9;
            Function0 function0 = (Function0) interfaceC7353EnQ;
            G0U g0u = (G0U) interfaceC7353EnQ2;
            G0U g0u2 = (G0U) interfaceC7353EnQ3;
            G0U g0u3 = (G0U) interfaceC7353EnQ4;
            G0U g0u4 = (G0U) interfaceC7353EnQ5;
            Function0 function02 = (Function0) interfaceC7353EnQ6;
            Function0 function03 = (Function0) interfaceC7353EnQ7;
            Object objAaT10 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT10 == obj) {
                objAaT10 = NativeLoginRoutesKt$NativeLoginNameRoute$10$1.INSTANCE;
                bfm.Ai0(objAaT10);
            }
            G0U g0u5 = (G0U) objAaT10;
            boolean zA6710 = bfm.A67(nativeLoginViewModel);
            Object objAaT11 = bfm.AaT();
            if (zA6710 || objAaT11 == obj) {
                objAaT11 = new NativeLoginRoutesKt$NativeLoginNameRoute$11$1(nativeLoginViewModel);
                bfm.Ai0(objAaT11);
            }
            NativeLoginBirthdayScreenKt.NativeLoginBirthdayScreen(str, function0, g0u, str2, g0u2, str3, g0u3, true, false, z, str4, g0u4, false, null, function02, function03, g0u5, (G0U) objAaT11, null, zA1T, (Function0) interfaceC7353EnQ8, null, hatchTosDisclosure, hatchTosDisclosure2, bfm, 113246208, 102239616, 0, 2097152);
            NativeLoginNameScreenKey nativeLoginNameScreenKey = NativeLoginNameScreenKey.INSTANCE;
            NativeLoginErrorDialogContent nativeLoginErrorDialogContentA0H = C3cI.A0H(c1boA04);
            boolean zA6711 = bfm.A67(nativeLoginViewModel);
            Object objAaT12 = bfm.AaT();
            if (zA6711 || objAaT12 == obj) {
                objAaT12 = new NativeLoginRoutesKt$NativeLoginNameRoute$12$1(nativeLoginViewModel);
                bfm.Ai0(objAaT12);
            }
            C3cJ.A0a(bfm, nativeLoginErrorDialogContentA0H, nativeLoginNameScreenKey, objAaT12);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass13(i);
        }
    }

    public static final void NativeLoginNtpUpsellChoiceRoute(BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c125727;
        bfm.AgG(-831951987);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            NativeLoginViewModel nativeLoginViewModel = nativeLoginViewModel(bfm, 0);
            C1BO c1boA04 = C3cI.A04(bfm, nativeLoginViewModel, auraNavigatorA0b, nativeLoginViewModel.uiState);
            AHD<NtpUpsellChoiceRowUiState> ahd = C3cH.A0Q(c1boA04).ntpUpsellChoice;
            if (ahd == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c125727 = new NativeLoginRoutesKt$NativeLoginNtpUpsellChoiceRoute$rows$1(i);
                    bBbAAc.A06 = c125727;
                }
                return;
            }
            boolean zA1O = C3cH.A1O(bfm, c1boA04, nativeLoginViewModel, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new NativeLoginRoutesKt$NativeLoginNtpUpsellChoiceRoute$onBack$1$1(nativeLoginViewModel, auraNavigatorA0b, c1boA04);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            B81.A00(false, function0, bfm, 0, 1);
            String str = C3cH.A0Q(c1boA04).destination;
            boolean zA67 = bfm.A67(nativeLoginViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginNtpUpsellChoiceRoute$1$1(nativeLoginViewModel);
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT2);
            boolean zA672 = bfm.A67(nativeLoginViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new NativeLoginRoutesKt$NativeLoginNtpUpsellChoiceRoute$2$1(nativeLoginViewModel);
                bfm.Ai0(objAaT3);
            }
            Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT3);
            boolean zA673 = bfm.A67(nativeLoginViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA673 || objAaT4 == C78N.A00) {
                objAaT4 = new NativeLoginRoutesKt$NativeLoginNtpUpsellChoiceRoute$3$1(nativeLoginViewModel);
                bfm.Ai0(objAaT4);
            }
            Function0 function03 = (Function0) ((InterfaceC7353EnQ) objAaT4);
            boolean zA1O2 = C3cH.A1O(bfm, c1boA04, nativeLoginViewModel, auraNavigatorA0b);
            Object objAaT5 = bfm.AaT();
            if (zA1O2 || objAaT5 == C78N.A00) {
                objAaT5 = new NativeLoginRoutesKt$NativeLoginNtpUpsellChoiceRoute$4$1(nativeLoginViewModel, auraNavigatorA0b, c1boA04);
                bfm.Ai0(objAaT5);
            }
            Function0 function04 = (Function0) objAaT5;
            HatchTosDisclosure hatchTosDisclosure = C3cH.A0Q(c1boA04).ntpUpsellChoiceTos;
            boolean zA674 = bfm.A67(nativeLoginViewModel);
            Object objAaT6 = bfm.AaT();
            if (zA674 || objAaT6 == C78N.A00) {
                objAaT6 = new NativeLoginRoutesKt$NativeLoginNtpUpsellChoiceRoute$5$1(nativeLoginViewModel);
                bfm.Ai0(objAaT6);
            }
            NativeLoginNtpUpsellChoiceScreenKt.NativeLoginNtpUpsellChoiceScreen(ahd, str, g0u, function02, function03, function04, function0, hatchTosDisclosure, (G0U) objAaT6, C3cI.A1T(c1boA04), C3cH.A0Q(c1boA04).selectedAccountId, C3cH.A0Q(c1boA04).ntpUpsellChoiceLandingPresentation, null, bfm, NtpUpsellChoiceRowUiState.$stable, 0, 4096);
            NativeLoginNtpUpsellChoiceScreenKey nativeLoginNtpUpsellChoiceScreenKey = NativeLoginNtpUpsellChoiceScreenKey.INSTANCE;
            NativeLoginErrorDialogContent nativeLoginErrorDialogContentA0H = C3cI.A0H(c1boA04);
            boolean zA675 = bfm.A67(nativeLoginViewModel);
            Object objAaT7 = bfm.AaT();
            if (zA675 || objAaT7 == C78N.A00) {
                objAaT7 = new NativeLoginRoutesKt$NativeLoginNtpUpsellChoiceRoute$6$1(nativeLoginViewModel);
                bfm.Ai0(objAaT7);
            }
            C3cJ.A0a(bfm, nativeLoginErrorDialogContentA0H, nativeLoginNtpUpsellChoiceScreenKey, objAaT7);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c125727 = new C125727(i);
            bBbAAc.A06 = c125727;
        }
    }

    public static final void NativeLoginNtpUpsellRoute(BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c125737;
        bfm.AgG(-2100562548);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            NativeLoginViewModel nativeLoginViewModel = nativeLoginViewModel(bfm, 0);
            C1BO c1boA04 = C3cI.A04(bfm, nativeLoginViewModel, auraNavigatorA0b, nativeLoginViewModel.uiState);
            NtpUpsellUiState ntpUpsellUiState = C3cH.A0Q(c1boA04).ntpUpsell;
            if (ntpUpsellUiState == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c125737 = new NativeLoginRoutesKt$NativeLoginNtpUpsellRoute$offer$1(i);
                    bBbAAc.A06 = c125737;
                }
                return;
            }
            boolean zA1M = AnonymousClass003.A1M(bfm, nativeLoginViewModel, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new NativeLoginRoutesKt$NativeLoginNtpUpsellRoute$onBack$1$1(nativeLoginViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            B81.A00(false, function0, bfm, 0, 1);
            NativeLoginAccountUiModel nativeLoginAccountUiModel = ntpUpsellUiState.account;
            HatchTosDisclosure hatchTosDisclosure = ntpUpsellUiState.tos;
            boolean z = ntpUpsellUiState.drawsTosClause;
            boolean zA67 = bfm.A67(nativeLoginViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginNtpUpsellRoute$1$1(nativeLoginViewModel);
                bfm.Ai0(objAaT2);
            }
            Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT2);
            boolean zA672 = bfm.A67(nativeLoginViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new NativeLoginRoutesKt$NativeLoginNtpUpsellRoute$2$1(nativeLoginViewModel);
                bfm.Ai0(objAaT3);
            }
            Function0 function03 = (Function0) ((InterfaceC7353EnQ) objAaT3);
            boolean zA673 = bfm.A67(nativeLoginViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA673 || objAaT4 == C78N.A00) {
                objAaT4 = new NativeLoginRoutesKt$NativeLoginNtpUpsellRoute$3$1(nativeLoginViewModel);
                bfm.Ai0(objAaT4);
            }
            Function0 function04 = (Function0) ((InterfaceC7353EnQ) objAaT4);
            boolean zA1M2 = AnonymousClass003.A1M(bfm, nativeLoginViewModel, auraNavigatorA0b);
            Object objAaT5 = bfm.AaT();
            if (zA1M2 || objAaT5 == C78N.A00) {
                objAaT5 = new NativeLoginRoutesKt$NativeLoginNtpUpsellRoute$4$1(nativeLoginViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT5);
            }
            Function0 function05 = (Function0) objAaT5;
            boolean zA674 = bfm.A67(nativeLoginViewModel);
            Object objAaT6 = bfm.AaT();
            if (zA674 || objAaT6 == C78N.A00) {
                objAaT6 = new NativeLoginRoutesKt$NativeLoginNtpUpsellRoute$5$1(nativeLoginViewModel);
                bfm.Ai0(objAaT6);
            }
            NativeLoginNtpUpsellScreenKt.NativeLoginNtpUpsellScreen(nativeLoginAccountUiModel, hatchTosDisclosure, z, function02, function03, function04, function05, function0, (G0U) objAaT6, C3cI.A1T(c1boA04), ntpUpsellUiState.landingPresentation, null, bfm, NativeLoginAccountUiModel.$stable, 0, 2048);
            NativeLoginNtpUpsellScreenKey nativeLoginNtpUpsellScreenKey = NativeLoginNtpUpsellScreenKey.INSTANCE;
            NativeLoginErrorDialogContent nativeLoginErrorDialogContentA0H = C3cI.A0H(c1boA04);
            boolean zA675 = bfm.A67(nativeLoginViewModel);
            Object objAaT7 = bfm.AaT();
            if (zA675 || objAaT7 == C78N.A00) {
                objAaT7 = new NativeLoginRoutesKt$NativeLoginNtpUpsellRoute$6$1(nativeLoginViewModel);
                bfm.Ai0(objAaT7);
            }
            C3cJ.A0a(bfm, nativeLoginErrorDialogContentA0H, nativeLoginNtpUpsellScreenKey, objAaT7);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c125737 = new C125737(i);
            bBbAAc.A06 = c125737;
        }
    }

    public static final void NativeLoginOtpRoute(BFM bfm, int i) {
        bfm.AgG(-636388544);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            NativeLoginViewModel nativeLoginViewModel = nativeLoginViewModel(bfm, 0);
            C1BO c1boA04 = C3cI.A04(bfm, nativeLoginViewModel, auraNavigatorA0b, nativeLoginViewModel.uiState);
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = NativeLoginRoutesKt$NativeLoginOtpRoute$pageShownLogged$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            Unit unit = Unit.INSTANCE;
            boolean zA1J = AnonymousClass003.A1J(bfm, mutableStateA0N, nativeLoginViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA1J || objAaT2 == obj) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginOtpRoute$1$1(nativeLoginViewModel, mutableStateA0N);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, unit);
            String str = C3cH.A0Q(c1boA04).destination;
            String str2 = C3cH.A0Q(c1boA04).otp;
            boolean zA67 = bfm.A67(nativeLoginViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new NativeLoginRoutesKt$NativeLoginOtpRoute$2$1(nativeLoginViewModel);
                bfm.Ai0(objAaT3);
            }
            G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT3);
            boolean zA672 = bfm.A67(nativeLoginViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA672 || objAaT4 == obj) {
                objAaT4 = new NativeLoginRoutesKt$NativeLoginOtpRoute$3$1(nativeLoginViewModel);
                bfm.Ai0(objAaT4);
            }
            Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT4);
            boolean zA673 = bfm.A67(nativeLoginViewModel);
            Object objAaT5 = bfm.AaT();
            if (zA673 || objAaT5 == obj) {
                objAaT5 = new NativeLoginRoutesKt$NativeLoginOtpRoute$4$1(nativeLoginViewModel);
                bfm.Ai0(objAaT5);
            }
            Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT5);
            boolean zA1M = AnonymousClass003.A1M(bfm, nativeLoginViewModel, auraNavigatorA0b);
            Object objAaT6 = bfm.AaT();
            if (zA1M || objAaT6 == obj) {
                objAaT6 = new NativeLoginRoutesKt$NativeLoginOtpRoute$5$1(nativeLoginViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT6);
            }
            Function0 function03 = (Function0) objAaT6;
            String strMessageFor = NativeLoginCommonKt.messageFor(C3cH.A0Q(c1boA04).fieldError, NativeLoginField.OTP, bfm, NativeLoginFieldError.$stable | 48);
            boolean zA1T = C3cI.A1T(c1boA04);
            boolean z = C3cH.A0Q(c1boA04).isEmailDestination;
            boolean z2 = C3cH.A0Q(c1boA04).isPasswordLoginAvailable;
            HatchAuthFlow hatchAuthFlow = C3cH.A0Q(c1boA04).otpFlow;
            boolean z3 = C3cH.A0Q(c1boA04).otpShowsLoginCopy;
            boolean zA674 = bfm.A67(nativeLoginViewModel);
            Object objAaT7 = bfm.AaT();
            if (zA674 || objAaT7 == obj) {
                objAaT7 = new NativeLoginRoutesKt$NativeLoginOtpRoute$6$1(nativeLoginViewModel);
                bfm.Ai0(objAaT7);
            }
            Function0 function04 = (Function0) ((InterfaceC7353EnQ) objAaT7);
            Boolean bool = C3cH.A0Q(c1boA04).rememberDeviceValue;
            boolean zA675 = bfm.A67(nativeLoginViewModel);
            Object objAaT8 = bfm.AaT();
            if (zA675 || objAaT8 == obj) {
                objAaT8 = new NativeLoginRoutesKt$NativeLoginOtpRoute$7$1(nativeLoginViewModel);
                bfm.Ai0(objAaT8);
            }
            G0U g0u2 = (G0U) objAaT8;
            boolean zA1M2 = AnonymousClass003.A1M(bfm, nativeLoginViewModel, auraNavigatorA0b);
            Object objAaT9 = bfm.AaT();
            if (zA1M2 || objAaT9 == obj) {
                objAaT9 = new NativeLoginRoutesKt$NativeLoginOtpRoute$8$1(nativeLoginViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT9);
            }
            NativeLoginOtpScreenKt.NativeLoginOtpScreen(str, str2, g0u, function0, function02, function03, strMessageFor, zA1T, z, z2, hatchAuthFlow, z3, function04, bool, g0u2, (Function0) objAaT9, null, bfm, 0, 0, 65536);
            NativeLoginOtpScreenKey nativeLoginOtpScreenKey = NativeLoginOtpScreenKey.INSTANCE;
            NativeLoginErrorDialogContent nativeLoginErrorDialogContentA0H = C3cI.A0H(c1boA04);
            boolean zA676 = bfm.A67(nativeLoginViewModel);
            Object objAaT10 = bfm.AaT();
            if (zA676 || objAaT10 == obj) {
                objAaT10 = new NativeLoginRoutesKt$NativeLoginOtpRoute$9$1(nativeLoginViewModel);
                bfm.Ai0(objAaT10);
            }
            C3cJ.A0a(bfm, nativeLoginErrorDialogContentA0H, nativeLoginOtpScreenKey, objAaT10);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass10(i);
        }
    }

    public static final void NativeLoginPasswordRoute(BFM bfm, int i) {
        bfm.AgG(1632631224);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            NativeLoginViewModel nativeLoginViewModel = nativeLoginViewModel(bfm, 0);
            C1BO c1boA04 = C3cI.A04(bfm, nativeLoginViewModel, auraNavigatorA0b, nativeLoginViewModel.uiState);
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = NativeLoginRoutesKt$NativeLoginPasswordRoute$pageShownLogged$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            Unit unit = Unit.INSTANCE;
            boolean zA1J = AnonymousClass003.A1J(bfm, mutableStateA0N, nativeLoginViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA1J || objAaT2 == obj) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginPasswordRoute$1$1(nativeLoginViewModel, mutableStateA0N);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, unit);
            String str = C3cH.A0Q(c1boA04).destination;
            String str2 = nativeLoginViewModel.submittedContactPoint;
            String str3 = C3cH.A0Q(c1boA04).password;
            boolean zA67 = bfm.A67(nativeLoginViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new NativeLoginRoutesKt$NativeLoginPasswordRoute$2$1(nativeLoginViewModel);
                bfm.Ai0(objAaT3);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT3;
            boolean zA672 = bfm.A67(nativeLoginViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA672 || objAaT4 == obj) {
                objAaT4 = new NativeLoginRoutesKt$NativeLoginPasswordRoute$3$1(nativeLoginViewModel);
                bfm.Ai0(objAaT4);
            }
            String strMessageFor = NativeLoginCommonKt.messageFor(C3cH.A0Q(c1boA04).fieldError, NativeLoginField.PASSWORD, bfm, NativeLoginFieldError.$stable | 48);
            boolean zA1T = C3cI.A1T(c1boA04);
            NativeLoginPasswordSubtitle passwordSubtitle = C3cH.A0Q(c1boA04).getPasswordSubtitle();
            Boolean bool = C3cH.A0Q(c1boA04).rememberDeviceValue;
            G0U g0u = (G0U) interfaceC7353EnQ;
            Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT4);
            boolean zA1M = AnonymousClass003.A1M(bfm, nativeLoginViewModel, auraNavigatorA0b);
            Object objAaT5 = bfm.AaT();
            if (zA1M || objAaT5 == obj) {
                objAaT5 = new NativeLoginRoutesKt$NativeLoginPasswordRoute$4$1(nativeLoginViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT5);
            }
            Function0 function02 = (Function0) objAaT5;
            boolean zA673 = bfm.A67(nativeLoginViewModel);
            Object objAaT6 = bfm.AaT();
            if (zA673 || objAaT6 == obj) {
                objAaT6 = new NativeLoginRoutesKt$NativeLoginPasswordRoute$5$1(nativeLoginViewModel);
                bfm.Ai0(objAaT6);
            }
            G0U g0u2 = (G0U) objAaT6;
            boolean zA674 = bfm.A67(nativeLoginViewModel);
            Object objAaT7 = bfm.AaT();
            if (zA674 || objAaT7 == obj) {
                objAaT7 = new NativeLoginRoutesKt$NativeLoginPasswordRoute$6$1(nativeLoginViewModel);
                bfm.Ai0(objAaT7);
            }
            G0U g0u3 = (G0U) objAaT7;
            boolean zA1M2 = AnonymousClass003.A1M(bfm, nativeLoginViewModel, auraNavigatorA0b);
            Object objAaT8 = bfm.AaT();
            if (zA1M2 || objAaT8 == obj) {
                objAaT8 = new NativeLoginRoutesKt$NativeLoginPasswordRoute$7$1(nativeLoginViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT8);
            }
            NativeLoginPasswordScreenKt.NativeLoginPasswordScreen(str, str2, str3, g0u, function0, function02, g0u2, strMessageFor, zA1T, bool, g0u3, (Function0) objAaT8, null, passwordSubtitle, bfm, 0, NativeLoginPasswordSubtitle.$stable << 9, 4096);
            NativeLoginPasswordScreenKey nativeLoginPasswordScreenKey = NativeLoginPasswordScreenKey.INSTANCE;
            NativeLoginErrorDialogContent nativeLoginErrorDialogContentA0H = C3cI.A0H(c1boA04);
            boolean zA675 = bfm.A67(nativeLoginViewModel);
            Object objAaT9 = bfm.AaT();
            if (zA675 || objAaT9 == obj) {
                objAaT9 = new NativeLoginRoutesKt$NativeLoginPasswordRoute$8$1(nativeLoginViewModel);
                bfm.Ai0(objAaT9);
            }
            C3cJ.A0a(bfm, nativeLoginErrorDialogContentA0H, nativeLoginPasswordScreenKey, objAaT9);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass9(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NativeLoginPhoneEntryRoute(X.BFM r37, int r38) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt.NativeLoginPhoneEntryRoute(X.BFM, int):void");
    }

    public static final void NativeLoginReactivationRoute(BFM bfm, int i) {
        BBb bBbAAc;
        Object c125756;
        bfm.AgG(-1464417370);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            NativeLoginViewModel nativeLoginViewModel = nativeLoginViewModel(bfm, 0);
            C1BO c1boA04 = C3cI.A04(bfm, nativeLoginViewModel, auraNavigatorA0b, nativeLoginViewModel.uiState);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = NativeLoginRoutesKt$NativeLoginReactivationRoute$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            B81.A00(false, (Function0) objAaT, bfm, 48, 1);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass001.A0j(bfm, C3cH.A0Q(c1boA04).reactivation == null);
            }
            if (AnonymousClass001.A1X(objAaT2)) {
                bfm.AgE(1820274888);
                Unit unit = Unit.INSTANCE;
                boolean zA67 = bfm.A67(nativeLoginViewModel);
                Object objAaT3 = bfm.AaT();
                if (zA67 || objAaT3 == obj) {
                    objAaT3 = new NativeLoginRoutesKt$NativeLoginReactivationRoute$2$1(nativeLoginViewModel);
                    bfm.Ai0(objAaT3);
                }
                AnonymousClass001.A17(bfm, objAaT3, unit);
            } else {
                bfm.AgE(1820386364);
            }
            AnonymousClass001.A1D(bfm);
            HatchReactivationChallenge hatchReactivationChallenge = C3cH.A0Q(c1boA04).reactivation;
            if (hatchReactivationChallenge == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c125756 = new NativeLoginRoutesKt$NativeLoginReactivationRoute$reactivation$1(i);
                    C3cG.A1D(bBbAAc, c125756);
                }
                return;
            }
            boolean zA1T = C3cI.A1T(c1boA04);
            boolean zA672 = bfm.A67(nativeLoginViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA672 || objAaT4 == obj) {
                objAaT4 = new NativeLoginRoutesKt$NativeLoginReactivationRoute$3$1(nativeLoginViewModel);
                bfm.Ai0(objAaT4);
            }
            Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT4);
            boolean zA673 = bfm.A67(nativeLoginViewModel);
            Object objAaT5 = bfm.AaT();
            if (zA673 || objAaT5 == obj) {
                objAaT5 = new NativeLoginRoutesKt$NativeLoginReactivationRoute$4$1(nativeLoginViewModel);
                bfm.Ai0(objAaT5);
            }
            NativeLoginReactivationScreenKt.NativeLoginReactivationScreen(hatchReactivationChallenge, zA1T, function0, (Function0) ((InterfaceC7353EnQ) objAaT5), null, bfm, 0, 16);
            NativeLoginReactivationScreenKey nativeLoginReactivationScreenKey = NativeLoginReactivationScreenKey.INSTANCE;
            NativeLoginErrorDialogContent nativeLoginErrorDialogContentA0H = C3cI.A0H(c1boA04);
            boolean zA674 = bfm.A67(nativeLoginViewModel);
            Object objAaT6 = bfm.AaT();
            if (zA674 || objAaT6 == obj) {
                objAaT6 = new NativeLoginRoutesKt$NativeLoginReactivationRoute$5$1(nativeLoginViewModel);
                bfm.Ai0(objAaT6);
            }
            C3cJ.A0a(bfm, nativeLoginErrorDialogContentA0H, nativeLoginReactivationScreenKey, objAaT6);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c125756 = new C125756(i);
            C3cG.A1D(bBbAAc, c125756);
        }
    }

    public static final void NativeLoginTwoFactorMethodRoute(BFM bfm, int i) {
        bfm.AgG(-772137967);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            NativeLoginViewModel nativeLoginViewModel = nativeLoginViewModel(bfm, 0);
            C1BO c1boA04 = C3cI.A04(bfm, nativeLoginViewModel, auraNavigatorA0b, nativeLoginViewModel.uiState);
            AHD<HatchTwoFactorMethod> ahd = C3cH.A0Q(c1boA04).twoFactorMethods;
            HatchTwoFactorSourceApp hatchTwoFactorSourceApp = C3cH.A0Q(c1boA04).twoFactorSourceApp;
            boolean zA67 = bfm.A67(nativeLoginViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new NativeLoginRoutesKt$NativeLoginTwoFactorMethodRoute$1$1(nativeLoginViewModel);
                bfm.Ai0(objAaT);
            }
            G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT);
            boolean zA672 = bfm.A67(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginTwoFactorMethodRoute$2$1(auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            NativeLoginTwoFactorMethodScreenKt.NativeLoginTwoFactorMethodScreen(ahd, hatchTwoFactorSourceApp, g0u, (Function0) objAaT2, C3cI.A1T(c1boA04), null, bfm, 0, 32);
            NativeLoginTwoFactorMethodScreenKey nativeLoginTwoFactorMethodScreenKey = NativeLoginTwoFactorMethodScreenKey.INSTANCE;
            NativeLoginErrorDialogContent nativeLoginErrorDialogContentA0H = C3cI.A0H(c1boA04);
            boolean zA673 = bfm.A67(nativeLoginViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA673 || objAaT3 == C78N.A00) {
                objAaT3 = new NativeLoginRoutesKt$NativeLoginTwoFactorMethodRoute$3$1(nativeLoginViewModel);
                bfm.Ai0(objAaT3);
            }
            C3cJ.A0a(bfm, nativeLoginErrorDialogContentA0H, nativeLoginTwoFactorMethodScreenKey, objAaT3);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(i);
        }
    }

    public static final void NativeLoginTwoFactorRoute(BFM bfm, int i) {
        bfm.AgG(-77507120);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            NativeLoginViewModel nativeLoginViewModel = nativeLoginViewModel(bfm, 0);
            C1BO c1boA04 = C3cI.A04(bfm, nativeLoginViewModel, auraNavigatorA0b, nativeLoginViewModel.uiState);
            HatchTwoFactorMethod hatchTwoFactorMethod = C3cH.A0Q(c1boA04).twoFactorMethod;
            HatchTwoFactorMethodType hatchTwoFactorMethodType = hatchTwoFactorMethod != null ? hatchTwoFactorMethod.type : null;
            HatchTwoFactorSourceApp hatchTwoFactorSourceApp = C3cH.A0Q(c1boA04).twoFactorSourceApp;
            String str = hatchTwoFactorMethod != null ? hatchTwoFactorMethod.displayContactPoint : null;
            String str2 = C3cH.A0Q(c1boA04).twoFactorCode;
            Integer num = C3cH.A0Q(c1boA04).twoFactorCodeLength;
            boolean zA67 = bfm.A67(nativeLoginViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new NativeLoginRoutesKt$NativeLoginTwoFactorRoute$1$1(nativeLoginViewModel);
                bfm.Ai0(objAaT);
            }
            G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT);
            boolean zA672 = bfm.A67(nativeLoginViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new NativeLoginRoutesKt$NativeLoginTwoFactorRoute$2$1(nativeLoginViewModel);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT2);
            boolean zA673 = bfm.A67(nativeLoginViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA673 || objAaT3 == C78N.A00) {
                objAaT3 = new NativeLoginRoutesKt$NativeLoginTwoFactorRoute$3$1(nativeLoginViewModel);
                bfm.Ai0(objAaT3);
            }
            Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT3);
            boolean zA674 = bfm.A67(auraNavigatorA0b);
            Object objAaT4 = bfm.AaT();
            if (zA674 || objAaT4 == C78N.A00) {
                objAaT4 = new NativeLoginRoutesKt$NativeLoginTwoFactorRoute$4$1(auraNavigatorA0b);
                bfm.Ai0(objAaT4);
            }
            Function0 function03 = (Function0) objAaT4;
            String strMessageFor = NativeLoginCommonKt.messageFor(C3cH.A0Q(c1boA04).fieldError, NativeLoginField.TWO_FACTOR_CODE, bfm, NativeLoginFieldError.$stable | 48);
            boolean zA1T = C3cI.A1T(c1boA04);
            boolean zA1M = AnonymousClass003.A1M(bfm, nativeLoginViewModel, auraNavigatorA0b);
            Object objAaT5 = bfm.AaT();
            if (zA1M || objAaT5 == C78N.A00) {
                objAaT5 = new NativeLoginRoutesKt$NativeLoginTwoFactorRoute$5$1(nativeLoginViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT5);
            }
            NativeLoginTwoFactorScreenKt.NativeLoginTwoFactorScreen(hatchTwoFactorMethodType, hatchTwoFactorSourceApp, str, str2, num, g0u, function0, function02, function03, strMessageFor, zA1T, (Function0) objAaT5, null, bfm, 0, 0, 4096);
            NativeLoginTwoFactorScreenKey nativeLoginTwoFactorScreenKey = NativeLoginTwoFactorScreenKey.INSTANCE;
            NativeLoginErrorDialogContent nativeLoginErrorDialogContentA0H = C3cI.A0H(c1boA04);
            boolean zA675 = bfm.A67(nativeLoginViewModel);
            Object objAaT6 = bfm.AaT();
            if (zA675 || objAaT6 == C78N.A00) {
                objAaT6 = new NativeLoginRoutesKt$NativeLoginTwoFactorRoute$6$1(nativeLoginViewModel);
                bfm.Ai0(objAaT6);
            }
            C3cJ.A0a(bfm, nativeLoginErrorDialogContentA0H, nativeLoginTwoFactorScreenKey, objAaT6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125767(i);
        }
    }

    public static final /* synthetic */ NativeLoginInitialDestination access$NativeLoginIntroRoute$lambda$0(C1BO c1bo) {
        return (NativeLoginInitialDestination) c1bo.getValue();
    }

    public static final NativeLoginViewModel nativeLoginViewModel(BFM bfm, int i) {
        Context applicationContext = AnonymousClass002.A0H(bfm).getApplicationContext();
        C7384Etj.A0Z(applicationContext, "null cannot be cast to non-null type android.app.Application");
        NativeLoginViewModel.Factory factory = new NativeLoginViewModel.Factory((Application) applicationContext);
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        return (NativeLoginViewModel) C3cH.A0G(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), NativeLoginViewModel.class);
    }

    public static final void popTwoFactorScreens(AuraNavigator auraNavigator) {
        if (isTwoFactorScreenKey(C3cG.A0H(auraNavigator))) {
            auraNavigator.popAll(C125771.INSTANCE);
        }
    }
}
