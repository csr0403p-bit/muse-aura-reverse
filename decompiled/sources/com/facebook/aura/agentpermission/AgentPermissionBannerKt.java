package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BPg;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0861A6i;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1BO;
import X.C1D8;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.res.Resources;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.AgentPermissionBannerViewModel;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.ApprovalConversationIdentity;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.microphone.view.SilencedByMicrophoneKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraAdaptiveColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AgentPermissionBannerKt {

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionBannerKt$AgentPermissionBanner$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$sessionId = str;
            this.$modifier = bRg;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) throws Resources.NotFoundException {
            AgentPermissionBannerKt.AgentPermissionBanner(this.$sessionId, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionBannerKt$AgentPermissionBanner$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$sessionId = str;
            this.$modifier = bRg;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) throws Resources.NotFoundException {
            AgentPermissionBannerKt.AgentPermissionBanner(this.$sessionId, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AgentPermissionBanner(String str, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) throws Resources.NotFoundException {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(g0v, 2);
        bfm.AgG(-720753217);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            String strA0M = FGI.A0M("agent_permission_banner_", ApprovalConversationIdentity.INSTANCE.normalize(str));
            AgentPermissionBannerViewModel.Factory factory = new AgentPermissionBannerViewModel.Factory(abstractC3358CGzA0h, str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            List<HatchAgentPermissionsRepository.AgentPermissionApproval> list = ((AgentPermissionBannerUiState) C1BO.A07(bfm, ((AgentPermissionBannerViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), strA0M, new C0861A6i(AgentPermissionBannerViewModel.class))).uiState)).approvals;
            if (list.isEmpty()) {
                bfm.AgE(-1417007579);
                AnonymousClass003.A13(bfm, g0v, iA0d >> 6);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(str, bRg2, g0v, i, i2);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, -1416978749);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zRememberSilencedByMicrophone = SilencedByMicrophoneKt.rememberSilencedByMicrophone(Integer.valueOf(list.size()), bfm, 0);
            boolean zA1M = AnonymousClass003.A1M(bfm, list, auraNavigatorA0b) | AnonymousClass004.A1F(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new AgentPermissionBannerKt$AgentPermissionBanner$onReview$1$1(list, auraNavigatorA0b, str);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            Alignment alignment = C2VU.A0E;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            long j = bbiA0M.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v2 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA01, g0v2);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            BPg.A03(bfm, g0u);
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v4 = C1515AkP.A05;
            BPg.A02(bfm, bRgA01, g0v4);
            bfm.AgE(1692512330);
            BS0 bs0 = BRg.A00;
            BRg bRgAgentPermissionApprovalImpressions = AgentPermissionPendingCardKt.agentPermissionApprovalImpressions(C1b8.A01(C11U.A03(C10G.A04(C3U4.A0B(c1062ATq, 16.0f, 0.0f), 64.0f), C1D8.A01(24.0f, 24.0f, 0.0f, 0.0f)), AuraAdaptiveColorsKt.adaptiveSecondaryFill(AnonymousClass002.A0c(bfm), bfm, AuraColors.$stable)), list, HatchScreen.AGENT_PERMISSION_BANNER, bfm, 384);
            if (!zRememberSilencedByMicrophone) {
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = AgentPermissionBannerKt$AgentPermissionBanner$2$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                bRgAgentPermissionApprovalImpressions = bRgAgentPermissionApprovalImpressions.then(AnonymousClass001.A0Y(bs0, objAaT2, false));
            }
            BBI.A0R(bbiA0M, false);
            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
            int iA0D = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA042 = BBI.A04(bbiA0M);
            BRg bRgA012 = AxM.A01(bfm, bRgAgentPermissionApprovalImpressions);
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            BPg.A02(bfm, interfaceC1380AiAA012, g0v2);
            BPg.A02(bfm, akqA042, g0v3);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0v4);
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0V(c1062ATq, 40.0f), 15.0f, 0.0f, 0.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA043 = BBI.A04(bbiA0M);
            BRg bRgA013 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v2);
            BPg.A02(bfm, akqA043, g0v3);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0v4);
            C90m c90m = C90m.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A00(R.plurals._name_removed__res_0x7f100002, new Object[]{Integer.valueOf(list.size())}, bfm, list.size()), AnonymousClass001.A0O(c90m, bs0, true), C06G.A08(bfm), C06G.A0S(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            BRg bRgA0C2 = C3U4.A0C(C0v5.A05(C10G.A09(bs0, 48.0f, 40.0f), null, function0, true), 12.0f, 0.0f, 15.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D3 = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA044 = BBI.A04(bbiA0M);
            BRg bRgA014 = AxM.A01(bfm, bRgA0C2);
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0v2);
            BPg.A02(bfm, akqA044, g0v3);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
            BPg.A02(bfm, bRgA014, g0v4);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120081), null, C06G.A07(bfm), AnonymousClass002.A0f(bfm).caption1Emphasized, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbiA0M, true);
            BBI.A0R(bbiA0M, true);
            BBI.A0R(bbiA0M, true);
            BRg bRgA0C3 = C3U4.A0C(bs0, 0.0f, 30.0f, 0.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA013 = C3Ue.A01(alignment, false);
            int iA0D4 = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA045 = BBI.A04(bbiA0M);
            BRg bRgA015 = AxM.A01(bfm, bRgA0C3);
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            BPg.A02(bfm, interfaceC1380AiAA013, g0v2);
            BPg.A02(bfm, akqA045, g0v3);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D4);
            BPg.A02(bfm, bRgA015, g0v4);
            AnonymousClass004.A1C(bbiA0M, bfm, g0v, iA0d >> 6, true);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(str, bRg2, g0v, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }
}
