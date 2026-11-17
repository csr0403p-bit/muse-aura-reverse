package com.facebook.aura.agentpermission;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.BS0;
import X.C1BO;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.AgentComputerApprovalBannerViewModel;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.AgentPermissionHeadlineKt;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.microphone.view.SilencedByMicrophoneKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.view.common.HatchConnectorIconKt;
import com.facebook.aura.ui.HatchInlineBannerKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AgentComputerApprovalBannerKt {
    public static final float BannerIconCornerRadius = 10.0f;
    public static final float BannerIconGlyphSize = 20.0f;
    public static final float BannerIconSize = 36.0f;

    /* renamed from: com.facebook.aura.agentpermission.AgentComputerApprovalBannerKt$AgentComputerApprovalBanner$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $currentApproval;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
            super(2);
            this.$currentApproval = agentPermissionApproval;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = this.$currentApproval;
                String str = agentPermissionApproval.iconUrl;
                if (!agentPermissionApproval.payloadType.getRendersAsConnectorCard()) {
                    str = null;
                }
                HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(str, agentPermissionApproval.iconRes, null, AgentComputerApprovalBannerKt.BannerIconSize, AgentComputerApprovalBannerKt.BannerIconCornerRadius, AgentPermissionIconsKt.approvalGlyphRes(agentPermissionApproval), AgentComputerApprovalBannerKt.BannerIconGlyphSize, null, null, bfm, 1600512, 388);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentComputerApprovalBannerKt$AgentComputerApprovalBanner$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $currentApproval;
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, AuraNavigator auraNavigator) {
            super(2);
            this.$currentApproval = agentPermissionApproval;
            this.$navigator = auraNavigator;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120081);
                AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$navigator, bfm.A67(this.$currentApproval));
                HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = this.$currentApproval;
                AuraNavigator auraNavigator = this.$navigator;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new AgentComputerApprovalBannerKt$AgentComputerApprovalBanner$3$1$1(agentPermissionApproval, auraNavigator);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, null, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201293);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentComputerApprovalBannerKt$AgentComputerApprovalBanner$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $currentApproval;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, BRg bRg, int i, int i2) {
            super(2);
            this.$currentApproval = agentPermissionApproval;
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
            AgentComputerApprovalBannerKt.AgentComputerApprovalBanner(this.$currentApproval, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AgentComputerApprovalBanner(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(202579608);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            String strAgentPermissionAgentName = AgentPermissionTitleKt.agentPermissionAgentName(bfm, 0);
            C7384Etj.A0Y(agentPermissionApproval, 0);
            String strHeadline = AgentPermissionHeadlineKt.headline(agentPermissionApproval, AgentPermissionTitleKt.agentPermissionAgentName(bfm, 0), null, null);
            boolean zRememberSilencedByMicrophone = SilencedByMicrophoneKt.rememberSilencedByMicrophone(agentPermissionApproval.approvalId, bfm, 0);
            if (strHeadline == null) {
                bfm.AgE(620463164);
                i3 = R.string._name_removed__res_0x7f12007c;
            } else {
                bfm.AgE(620577988);
                i3 = R.string._name_removed__res_0x7f12007b;
            }
            String strA0t = AnonymousClass001.A0t(bfm, strAgentPermissionAgentName, i3);
            BBI bbiA07 = C3cG.A07(bfm);
            bfm.AgE(1405544041);
            BRg bRgAgentPermissionApprovalImpression = AgentPermissionTelemetryKt.agentPermissionApprovalImpression(bRg2, agentPermissionApproval, HatchScreen.AGENT_PERMISSION_BANNER);
            if (!zRememberSilencedByMicrophone) {
                BS0 bs0 = BRg.A00;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = AgentComputerApprovalBannerKt$AgentComputerApprovalBanner$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                bRgAgentPermissionApprovalImpression = bRgAgentPermissionApprovalImpression.then(AnonymousClass001.A0Y(bs0, objAaT, false));
            }
            BBI.A0R(bbiA07, false);
            HatchInlineBannerKt.m2318HatchInlineBannerKBbEK2Q(strA0t, B1V.A00(bfm, new AnonymousClass2(agentPermissionApproval), 1327491793), bRgAgentPermissionApprovalImpression, strHeadline, B1V.A00(bfm, new AnonymousClass3(agentPermissionApproval, auraNavigatorA0b), 292744558), null, 0L, 0.0f, null, 0.0f, 0.0f, null, 0L, 2, null, 0L, 0, bfm, 24624, 3072, 122848);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(agentPermissionApproval, bRg2, i, i2);
        }
    }

    public static final G0W<BRg, BFM, Integer, Unit> rememberAgentComputerApprovalBanner(BFM bfm, int i) {
        bfm.AgE(-346720715);
        AgentComputerApprovalBannerViewModel.Factory factory = new AgentComputerApprovalBannerViewModel.Factory(AnonymousClass002.A0h(bfm));
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 == null) {
            throw AnonymousClass001.A0o();
        }
        HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = (HatchAgentPermissionsRepository.AgentPermissionApproval) C1BO.A07(bfm, ((AgentComputerApprovalBannerViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(AgentComputerApprovalBannerViewModel.class))).approval);
        if (agentPermissionApproval == null) {
            AnonymousClass001.A1D(bfm);
            return null;
        }
        boolean zA65 = bfm.A65(agentPermissionApproval);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = AnonymousClass001.A0M(new AgentComputerApprovalBannerKt$rememberAgentComputerApprovalBanner$1$1(agentPermissionApproval), 1321773722);
            bfm.Ai0(objAaT);
        }
        G0W<BRg, BFM, Integer, Unit> g0w = (G0W) objAaT;
        AnonymousClass001.A1D(bfm);
        return g0w;
    }
}
