package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC1103AYp;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1EQ;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.F60;
import X.G0V;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AgentPermissionInlineRequestPreviewKt {
    public static final float InlineConnectorOrderMaxHeight = 400.0f;
    public static final float InlineDetailsMaxHeight = 155.0f;
    public static final float InlineDetailsWithAttachmentsMaxHeight = 240.0f;

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionInlineRequestPreviewKt$AgentPermissionInlineRequestPreview$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument $document;
        public final /* synthetic */ String $fallbackText;
        public final /* synthetic */ boolean $hasAttachments;
        public final /* synthetic */ boolean $isConnectorOrder;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument, String str, boolean z, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, BRg bRg, boolean z2, int i, int i2) {
            super(2);
            this.$document = agentPermissionRequestPreviewDocument;
            this.$fallbackText = str;
            this.$hasAttachments = z;
            this.$approval = agentPermissionApproval;
            this.$screen = hatchScreen;
            this.$modifier = bRg;
            this.$isConnectorOrder = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionInlineRequestPreviewKt.AgentPermissionInlineRequestPreview(this.$document, this.$fallbackText, this.$hasAttachments, this.$approval, this.$screen, this.$modifier, this.$isConnectorOrder, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: InlineRequestPreviewBottomFade-3IgeMak, reason: not valid java name */
    public static final void m162InlineRequestPreviewBottomFade3IgeMak(C1110AYw c1110AYw, long j, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> agentPermissionInlineRequestPreviewKt$InlineRequestPreviewBottomFade$2;
        BRg bRg2 = bRg;
        bfm.AgG(-1163964821);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1110AYw) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = AnonymousClass003.A0R(bfm, new AgentPermissionInlineRequestPreviewKt$InlineRequestPreviewBottomFade$visible$2$1(c1110AYw));
            }
            if (!C1BO.A0F((C1BO) objAaT)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    agentPermissionInlineRequestPreviewKt$InlineRequestPreviewBottomFade$2 = new AgentPermissionInlineRequestPreviewKt$InlineRequestPreviewBottomFade$1(c1110AYw, j, bRg2, i, i2);
                    bBbAAc.A06 = agentPermissionInlineRequestPreviewKt$InlineRequestPreviewBottomFade$2;
                }
                return;
            }
            boolean zA1C = AnonymousClass003.A1C(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == C78N.A00) {
                objAaT2 = C1EQ.A02(new HxE[]{AnonymousClass007.A0h(Float.valueOf(0.0f), 0.0f, j), AnonymousClass007.A0g(0.6f, j), AnonymousClass007.A0g(1.0f, j)}, Float.POSITIVE_INFINITY);
                bfm.Ai0(objAaT2);
            }
            C1b8.A05(bfm, C10G.A04(AnonymousClass001.A0R(bRg2), 40.0f), (C1EQ) objAaT2);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            agentPermissionInlineRequestPreviewKt$InlineRequestPreviewBottomFade$2 = new AgentPermissionInlineRequestPreviewKt$InlineRequestPreviewBottomFade$2(c1110AYw, j, bRg2, i, i2);
            bBbAAc.A06 = agentPermissionInlineRequestPreviewKt$InlineRequestPreviewBottomFade$2;
        }
    }

    public static final void AgentPermissionInlineRequestPreview(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument, String str, boolean z, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, BRg bRg, boolean z2, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z3 = z2;
        AnonymousClass002.A1C(agentPermissionApproval, 3, hatchScreen);
        bfm.AgG(-1199754143);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionRequestPreviewDocument, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass002.A00(AnonymousClass004.A1a(agentPermissionApproval, bfm, i) ? 1 : 0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0G(bfm, hatchScreen.ordinal());
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        int i4 = i2 & 64;
        int iA0t = 1572864;
        if (i4 != 0) {
            iA05 |= iA0t;
        } else if ((1572864 & i) == 0) {
            iA0t = AnonymousClass004.A0t(bfm, z3);
            iA05 |= iA0t;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA05, 599186), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = false;
            }
            C1110AYw c1110AYwA00 = AbstractC1103AYp.A00(0, bfm, 0, 1);
            long jA0J = C06G.A0J(bfm, AuraColorsKt.LocalAuraColors);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA01 = C1b8.A01(C11U.A01(C10G.A0A(bRg2.then(c1062ATq), Float.NaN, z3 ? InlineConnectorOrderMaxHeight : z ? InlineDetailsWithAttachmentsMaxHeight : InlineDetailsMaxHeight), AnonymousClass002.A0d(bfm).sectionCornerRadius), jA0J);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            C0z7 c0z7 = C0z7.A00;
            C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            AgentPermissionRequestPreviewKt.m177AgentPermissionRequestPreviewContenthYmLsZ8(agentPermissionRequestPreviewDocument, str, c1822ArmA0Y, jA0C, agentPermissionApproval, hatchScreen, AbstractC1103AYp.A02(c1110AYwA00, C3U4.A09(c1062ATq, AuraDimensKt.SpacingMedium), true), bfm, AnonymousClass004.A03(iA05 << 3, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument.$stable | (iA05 & 14) | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (HatchAgentPermissionsRepository.AgentPermissionApproval.$stable << 12)), 0);
            m162InlineRequestPreviewBottomFade3IgeMak(c1110AYwA00, jA0J, c0z7.A4C(C2VU.A06, bs0), bfm, 0, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(agentPermissionRequestPreviewDocument, str, z, agentPermissionApproval, hatchScreen, bRg2, z3, i, i2);
        }
    }
}
