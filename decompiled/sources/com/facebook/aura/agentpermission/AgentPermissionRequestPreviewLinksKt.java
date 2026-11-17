package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BG3;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C0jP;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1YD;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.C9m9;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AgentPermissionRequestPreviewLinksKt {
    public static final String TAG = "ApprovalPreviewLinks";

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionRequestPreviewLinksKt$PreviewLinks$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Links $block;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ C1822Arm $textStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Links links, C1822Arm c1822Arm, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, int i) {
            super(2);
            this.$block = links;
            this.$textStyle = c1822Arm;
            this.$approval = agentPermissionApproval;
            this.$screen = hatchScreen;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionRequestPreviewLinksKt.PreviewLinks(this.$block, this.$textStyle, this.$approval, this.$screen, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void PreviewLinks(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Links links, C1822Arm c1822Arm, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, BFM bfm, int i) {
        C7384Etj.A0Y(links, 0);
        AnonymousClass005.A11(c1822Arm, agentPermissionApproval, hatchScreen, 1);
        bfm.AgG(-1414063749);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(links, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, c1822Arm);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(agentPermissionApproval, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass007.A06(bfm, hatchScreen.ordinal());
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            C0jP c0jP = (C0jP) bfm.A6v(Am0.A0G);
            C9m9 c9m9A00 = AcQ.A00(4.0f);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            String str = links.label;
            if (str == null) {
                bfm.AgE(-1303401564);
            } else {
                bfm.AgE(-1303401563);
                AgentPermissionRequestPreviewKt.PreviewLabel(str, bfm, 0);
            }
            BBI.A0R(bbi, false);
            bfm.AgE(789240733);
            for (HatchAgentPermissionsRepository.AgentPermissionRequestPreviewLink agentPermissionRequestPreviewLink : links.items) {
                String str2 = agentPermissionRequestPreviewLink.label;
                C1822Arm c1822ArmA00 = C1822Arm.A00(null, c1822Arm, null, null, null, null, BG3.A03, null, null, null, 0, 0, 0, 16773119, 0L, 0L, 0L, 0L);
                long jA07 = C06G.A07(bfm);
                BRg bRgA0O = AnonymousClass006.A0O(C10G.A02);
                C1YD c1yd = new C1YD(0);
                boolean zA1Y = AnonymousClass005.A1Y(bfm, c0jP, agentPermissionRequestPreviewLink, AnonymousClass004.A1M(iA05), (iA05 & 896) == 256 || ((iA05 & 512) != 0 && bfm.A67(agentPermissionApproval)));
                Object objAaT = bfm.AaT();
                if (zA1Y || objAaT == C78N.A00) {
                    objAaT = new AgentPermissionRequestPreviewLinksKt$PreviewLinks$1$2$1$1(hatchScreen, agentPermissionApproval, c90l, c0jP, agentPermissionRequestPreviewLink);
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str2, C3U4.A06(C0v5.A04(bRgA0O, c1yd, null, (Function0) objAaT, true), 12.0f), jA07, c1822ArmA00, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(links, c1822Arm, agentPermissionApproval, hatchScreen, i);
        }
    }
}
