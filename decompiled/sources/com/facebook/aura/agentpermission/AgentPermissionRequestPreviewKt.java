package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
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
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D8;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.C7BY;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.AgentPermissionHeadlineKt;
import com.facebook.aura.gateway.AgentPermissionRequestPresentation;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AgentPermissionRequestPreviewKt {

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionRequestPreviewKt$PreviewFields$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Fields $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Fields fields, int i) {
            super(2);
            this.$block = fields;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionRequestPreviewKt.PreviewFields(this.$block, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionRequestPreviewKt$PreviewLabel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i) {
            super(2);
            this.$label = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AgentPermissionRequestPreviewKt.PreviewLabel(this.$label, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void PreviewLabel(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-823924306);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            AuraTextKt.m2639AuraTextUY9GdpU(str, C10G.A02, C06G.A08(bfm), AnonymousClass002.A0f(bfm).footnoteMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d & 14) | 48, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, i);
        }
    }

    public static final boolean hasDetailsRequestPreview(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        return agentPermissionApproval.requestPresentation == AgentPermissionRequestPresentation.DETAILS && AgentPermissionHeadlineKt.hasRequestPreview(agentPermissionApproval);
    }

    public static final boolean hasRequestPreviewAttachments(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock> list;
        C7384Etj.A0Y(agentPermissionApproval, 0);
        HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument = agentPermissionApproval.requestPreviewDocument;
        if (agentPermissionRequestPreviewDocument != null && (list = agentPermissionRequestPreviewDocument.blocks) != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Attachments) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: AgentPermissionRequestPreviewContent-hYmLsZ8, reason: not valid java name */
    public static final void m177AgentPermissionRequestPreviewContenthYmLsZ8(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument, String str, C1822Arm c1822Arm, long j, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> agentPermissionRequestPreviewKt$AgentPermissionRequestPreviewContent$5;
        BBI bbi;
        boolean z;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(c1822Arm, 2);
        AnonymousClass003.A0y(agentPermissionApproval, hatchScreen);
        bfm.AgG(1973700743);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionRequestPreviewDocument, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, c1822Arm);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0P(bfm, j);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass002.A04(AnonymousClass004.A1R(bfm, agentPermissionApproval, 32768, i) ? 1 : 0);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0H(bfm, hatchScreen.ordinal());
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA05 |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA05 |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (agentPermissionRequestPreviewDocument == null) {
                bfm.AgE(416855500);
                if (str == null || C7BY.A0j(str)) {
                    bfm.AgE(416901162);
                    bbi = (BBI) bfm;
                    z = false;
                } else {
                    bfm.AgE(416901163);
                    z = false;
                    AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0R(bRg2), j, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, ((iA05 >> 3) & 896) | ((iA05 << 3) & 7168), 0, 16368);
                    bbi = (BBI) bfm;
                }
                BBI.A0R(bbi, z);
                bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                if (bBbAAc != null) {
                    agentPermissionRequestPreviewKt$AgentPermissionRequestPreviewContent$5 = new AgentPermissionRequestPreviewKt$AgentPermissionRequestPreviewContent$3(agentPermissionRequestPreviewDocument, str, c1822Arm, j, agentPermissionApproval, hatchScreen, bRg2, i, i2);
                    bBbAAc.A06 = agentPermissionRequestPreviewKt$AgentPermissionRequestPreviewContent$5;
                }
                return;
            }
            bfm.AgE(417085179);
            BBI bbi2 = (BBI) bfm;
            BBI.A0R(bbi2, false);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(12.0f), bfm, C2VU.A02, 6);
            int iA0J = AnonymousClass003.A0J(bbi2);
            AKQ akqA04 = BBI.A04(bbi2);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi2.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi2, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            bfm.AgE(428077333);
            for (HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock agentPermissionRequestPreviewBlock : agentPermissionRequestPreviewDocument.blocks) {
                if (agentPermissionRequestPreviewBlock instanceof HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Fields) {
                    bfm.AgE(551656656);
                    PreviewFields((HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Fields) agentPermissionRequestPreviewBlock, bfm, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Fields.$stable);
                } else if (agentPermissionRequestPreviewBlock instanceof HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Text) {
                    bfm.AgE(551659492);
                    m179PreviewTextXOJAsU((HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Text) agentPermissionRequestPreviewBlock, c1822Arm, j, bfm, AnonymousClass002.A07(iA05 >> 3, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Text.$stable));
                } else if (agentPermissionRequestPreviewBlock instanceof HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.ItemList) {
                    bfm.AgE(551664068);
                    m178PreviewListXOJAsU((HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.ItemList) agentPermissionRequestPreviewBlock, c1822Arm, j, bfm, AnonymousClass002.A07(iA05 >> 3, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.ItemList.$stable));
                } else if (agentPermissionRequestPreviewBlock instanceof HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Links) {
                    bfm.AgE(551668643);
                    AgentPermissionRequestPreviewLinksKt.PreviewLinks((HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Links) agentPermissionRequestPreviewBlock, c1822Arm, agentPermissionApproval, hatchScreen, bfm, AnonymousClass002.A08(iA05 >> 6, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Links.$stable | ((iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (HatchAgentPermissionsRepository.AgentPermissionApproval.$stable << 6)));
                } else {
                    if (!(agentPermissionRequestPreviewBlock instanceof HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Attachments)) {
                        throw AnonymousClass003.A0k(bfm, bbi2, 551655125);
                    }
                    bfm.AgE(551676259);
                    AgentPermissionRequestPreviewAttachmentsKt.PreviewAttachments((HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Attachments) agentPermissionRequestPreviewBlock, agentPermissionApproval, hatchScreen, bfm, AnonymousClass002.A07(iA05 >> 9, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Attachments.$stable | (HatchAgentPermissionsRepository.AgentPermissionApproval.$stable << 3)));
                }
                BBI.A0R(bbi2, false);
            }
            BBI.A0R(bbi2, false);
            if (agentPermissionRequestPreviewDocument.truncated) {
                bfm.AgE(386301251);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12011e), c1062ATq, C06G.A09(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            } else {
                bfm.AgE(386555141);
            }
            AnonymousClass003.A0q(bbi2);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            agentPermissionRequestPreviewKt$AgentPermissionRequestPreviewContent$5 = new AgentPermissionRequestPreviewKt$AgentPermissionRequestPreviewContent$5(agentPermissionRequestPreviewDocument, str, c1822Arm, j, agentPermissionApproval, hatchScreen, bRg2, i, i2);
            bBbAAc.A06 = agentPermissionRequestPreviewKt$AgentPermissionRequestPreviewContent$5;
        }
    }

    public static final void PreviewFields(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Fields fields, BFM bfm, int i) {
        bfm.AgG(-626495489);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(fields, bfm, i) ? 1 : 0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA05), bfm, iA05)) {
            C9m9 c9m9A00 = AcQ.A00(6.0f);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            bfm.AgE(315803854);
            for (HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewField : fields.rows) {
                C1062ATq c1062ATq = C10G.A02;
                InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(AcQ.A00(AuraDimensKt.SpacingSmall), bfm, C2VU.A05, 48);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, c1062ATq);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                C90m c90m = C90m.A00;
                AuraTextKt.m2639AuraTextUY9GdpU(agentPermissionRequestPreviewField.label, c90m.AiP(bs0, 1.0f, true), C06G.A08(bfm), AnonymousClass002.A0f(bfm).footnoteMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                AuraTextKt.m2639AuraTextUY9GdpU(agentPermissionRequestPreviewField.value, c90m.AiP(bs0, 1.0f, true), C06G.A0C(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                BBI.A0R(bbi, true);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(fields, i);
        }
    }

    /* renamed from: PreviewList-XO-JAsU, reason: not valid java name */
    public static final void m178PreviewListXOJAsU(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.ItemList itemList, C1822Arm c1822Arm, long j, BFM bfm, int i) {
        bfm.AgG(-1095449507);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(itemList, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, c1822Arm);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0O(bfm, j);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            C9m9 c9m9A00 = AcQ.A00(6.0f);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            long j2 = bbi.A06;
            int i2 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String str = itemList.label;
            if (str == null) {
                bfm.AgE(1112613334);
            } else {
                bfm.AgE(1112613335);
                PreviewLabel(str, bfm, 0);
            }
            BBI.A0R(bbi, false);
            bfm.AgE(-1765222704);
            for (String str2 : itemList.items) {
                C1062ATq c1062ATq = C10G.A02;
                InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(AcQ.A00(AuraDimensKt.SpacingSmall), bfm, C2VU.A05, 48);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, c1062ATq);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                C90m c90m = C90m.A00;
                C3Ue.A04(C1b8.A03(C10G.A07(C3U4.A04(bs0, 7.0f), 4.0f), C1D8.A00, C06G.A08(bfm)), bfm, 0);
                AuraTextKt.m2639AuraTextUY9GdpU(str2, c90m.AiP(bs0, 1.0f, true), j, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA05 & 896) | ((iA05 << 6) & 7168), 0, 16368);
                BBI.A0R(bbi, true);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AgentPermissionRequestPreviewKt$PreviewList$2(itemList, c1822Arm, j, i);
        }
    }

    /* renamed from: PreviewText-XO-JAsU, reason: not valid java name */
    public static final void m179PreviewTextXOJAsU(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Text text, C1822Arm c1822Arm, long j, BFM bfm, int i) {
        bfm.AgG(1520675408);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(text, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, c1822Arm);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0O(bfm, j);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
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
            String str = text.label;
            if (str == null) {
                bfm.AgE(2143782915);
            } else {
                bfm.AgE(2143782916);
                PreviewLabel(str, bfm, 0);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(text.text, C10G.A02, j, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA05 & 896) | 48 | ((iA05 << 6) & 7168), 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AgentPermissionRequestPreviewKt$PreviewText$2(text, c1822Arm, j, i);
        }
    }
}
