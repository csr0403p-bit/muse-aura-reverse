package com.facebook.aura.messenger.skills.read.view;

import X.AQC;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BQN;
import X.BRg;
import X.C07C;
import X.C1BO;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC7353EnQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.messenger.skills.read.model.PinError;
import com.facebook.aura.messenger.skills.read.viewmodel.MessengerConnectorViewModel;
import com.facebook.aura.messenger.skills.read.viewmodel.MessengerPinState;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerStyle;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class MessengerPinScreenKt {

    /* renamed from: com.facebook.aura.messenger.skills.read.view.MessengerPinScreenKt$MessengerPinScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ C1BO<MessengerPinState> $pinState$delegate;
        public final /* synthetic */ MessengerConnectorViewModel $viewModel;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            MessengerPinState.Error error;
            C7384Etj.A0Y(c07c, 0);
            int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            PinError pinError = null;
            if ((this.$pinState$delegate.getValue() instanceof MessengerPinState.CheckingPinStatus) || (this.$pinState$delegate.getValue() instanceof MessengerPinState.LockedOut)) {
                bfm.AgE(-1192845559);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205f4);
                BRg bRgA06 = C3U4.A06(new AQC(C2VU.A00), 60.0f);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new MessengerPinScreenKt$MessengerPinScreen$5$1$1(strA01);
                    bfm.Ai0(objAaT);
                }
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(AnonymousClass001.A0Y(bRgA06, objAaT, false), AuraSpinnerStyle.Companion.small(bfm, 6), 0L, bfm, AuraSpinnerStyle.$stable << 3, 4);
            } else {
                bfm.AgE(-1192422719);
                boolean zA67 = bfm.A67(this.$viewModel);
                MessengerConnectorViewModel messengerConnectorViewModel = this.$viewModel;
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new MessengerPinScreenKt$MessengerPinScreen$5$2$1(messengerConnectorViewModel);
                    bfm.Ai0(objAaT2);
                }
                G0U g0u = (G0U) objAaT2;
                boolean zA672 = bfm.A67(this.$viewModel);
                MessengerConnectorViewModel messengerConnectorViewModel2 = this.$viewModel;
                Object objAaT3 = bfm.AaT();
                if (zA672 || objAaT3 == C78N.A00) {
                    objAaT3 = new MessengerPinScreenKt$MessengerPinScreen$5$3$1(messengerConnectorViewModel2);
                    bfm.Ai0(objAaT3);
                }
                Function0 function0 = (Function0) objAaT3;
                boolean z = this.$pinState$delegate.getValue() instanceof MessengerPinState.Verifying;
                MessengerPinState value = this.$pinState$delegate.getValue();
                if ((value instanceof MessengerPinState.Error) && (error = (MessengerPinState.Error) value) != null) {
                    pinError = error.error;
                }
                MessengerPinSheetKt.MessengerPinSheet(g0u, function0, null, z, pinError, this.$pinState$delegate.getValue() instanceof MessengerPinState.ConnectivityError, this.$iconUrl, bfm, 0, 4);
            }
            AnonymousClass001.A1D(bfm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(MessengerConnectorViewModel messengerConnectorViewModel, String str, C1BO<? extends MessengerPinState> c1bo) {
            super(3);
            this.$viewModel = messengerConnectorViewModel;
            this.$iconUrl = str;
            this.$pinState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.messenger.skills.read.view.MessengerPinScreenKt$MessengerPinScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, BRg bRg, String str2, int i, int i2) {
            super(2);
            this.$connectorId = str;
            this.$origin = hatchSkillOAuthOrigin;
            this.$modifier = bRg;
            this.$iconUrl = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            MessengerPinScreenKt.MessengerPinScreen(this.$connectorId, this.$origin, this.$modifier, this.$iconUrl, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void MessengerPinScreen(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, BRg bRg, String str2, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        String strA0e = str2;
        boolean zA1b = AnonymousClass004.A1b(str, hatchSkillOAuthOrigin);
        bfm.AgG(179819729);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass005.A09(bfm, hatchSkillOAuthOrigin);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, strA0e);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            strA0e = C3cG.A0e(strA0e, i4);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            MessengerConnectorViewModel.Factory factory = new MessengerConnectorViewModel.Factory(AnonymousClass002.A0h(bfm), str, hatchSkillOAuthOrigin);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            MessengerConnectorViewModel messengerConnectorViewModel = (MessengerConnectorViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, C3cG.A0x(MessengerConnectorViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, messengerConnectorViewModel.pinState);
            C1BO c1boA022 = C2CK.A02(bfm, messengerConnectorViewModel.showTroubleshooting);
            Object value = c1boA02.getValue();
            boolean zA1O = C3cH.A1O(bfm, c1boA02, messengerConnectorViewModel, auraNavigatorA0b) | AnonymousClass003.A1E(iA0d) | AnonymousClass003.A1C(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new MessengerPinScreenKt$MessengerPinScreen$1$1(messengerConnectorViewModel, auraNavigatorA0b, strA0e, hatchSkillOAuthOrigin, c1boA02);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, value);
            if (C1BO.A0F(c1boA022)) {
                bfm.AgE(1186537994);
                boolean zA1M = AnonymousClass003.A1M(bfm, messengerConnectorViewModel, contextA0H);
                Object objAaT2 = bfm.AaT();
                if (zA1M || objAaT2 == C78N.A00) {
                    objAaT2 = new MessengerPinScreenKt$MessengerPinScreen$2$1(messengerConnectorViewModel, contextA0H);
                    bfm.Ai0(objAaT2);
                }
                Function0 function0 = (Function0) objAaT2;
                boolean zA67 = bfm.A67(messengerConnectorViewModel);
                Object objAaT3 = bfm.AaT();
                if (zA67 || objAaT3 == C78N.A00) {
                    objAaT3 = new MessengerPinScreenKt$MessengerPinScreen$3$1(messengerConnectorViewModel);
                    bfm.Ai0(objAaT3);
                }
                Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT3);
                boolean zA672 = bfm.A67(messengerConnectorViewModel);
                Object objAaT4 = bfm.AaT();
                if (zA672 || objAaT4 == C78N.A00) {
                    objAaT4 = new MessengerPinScreenKt$MessengerPinScreen$4$1(messengerConnectorViewModel);
                    bfm.Ai0(objAaT4);
                }
                MessengerPinSheetKt.MessengerPinTroubleshootingDialog(function0, function02, (Function0) ((InterfaceC7353EnQ) objAaT4), bfm, zA1b ? 1 : 0);
            } else {
                bfm.AgE(1186759985);
            }
            AnonymousClass001.A1D(bfm);
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, bRg2, null, null, null, null, null, zA1b, zA1b, zA1b, null, B1V.A00(bfm, new AnonymousClass5(messengerConnectorViewModel, strA0e, c1boA02), 1365393652), bfm, ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 48, 2044);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(str, hatchSkillOAuthOrigin, bRg2, strA0e, i, i2);
        }
    }

    public static final /* synthetic */ MessengerPinState access$MessengerPinScreen$lambda$0(C1BO c1bo) {
        return (MessengerPinState) c1bo.getValue();
    }
}
