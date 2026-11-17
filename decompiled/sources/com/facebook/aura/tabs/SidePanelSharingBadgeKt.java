package com.facebook.aura.tabs;

import X.AEk;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
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
import X.BOf;
import X.BPg;
import X.BQG;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D8;
import X.C1b8;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.library.repo.ArtifactSharingInfo;
import com.facebook.aura.library.repo.ArtifactSharingRecipient;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.tabs.SidePanelSharingBadgeContent;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SidePanelSharingBadgeKt {
    public static final int MaximumFaces = 2;

    /* renamed from: com.facebook.aura.tabs.SidePanelSharingBadgeKt$SharingInitial$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ArtifactSharingRecipient $recipient;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ArtifactSharingRecipient artifactSharingRecipient, BRg bRg, int i, int i2) {
            super(2);
            this.$recipient = artifactSharingRecipient;
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
            SidePanelSharingBadgeKt.SharingInitial(this.$recipient, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final SidePanelSharingBadgeContent sidePanelBadgeContent(ArtifactSharingInfo artifactSharingInfo) {
        if (artifactSharingInfo != null) {
            String str = artifactSharingInfo.state;
            if ("public".equals(str)) {
                return SidePanelSharingBadgeContent.Public.INSTANCE;
            }
            if ("restricted".equals(str) && !artifactSharingInfo.recipients.isEmpty()) {
                List listA0a = AbstractC0878AGe.A0a(artifactSharingInfo.recipients, 2);
                return new SidePanelSharingBadgeContent.People(listA0a, artifactSharingInfo.recipients.size() - listA0a.size());
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* renamed from: SharingFace-3IgeMak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2301SharingFace3IgeMak(com.facebook.aura.library.repo.ArtifactSharingRecipient r24, long r25, X.BRg r27, X.BFM r28, int r29, int r30) {
        /*
            r0 = r27
            r1 = -11589130(0xffffffffff4f29f6, float:-2.7536807E38)
            r2 = r28
            r2.AgG(r1)
            r1 = r29
            r4 = r29 & 6
            r3 = r24
            if (r4 != 0) goto Le0
            int r8 = X.AnonymousClass004.A0T(r2, r3)
            r8 = r8 | r29
        L18:
            r6 = r29 & 48
            r4 = r25
            if (r6 != 0) goto L23
            int r6 = X.AnonymousClass004.A0N(r2, r4)
            r8 = r8 | r6
        L23:
            r9 = r30 & 4
            if (r9 == 0) goto Ld5
            r8 = r8 | 384(0x180, float:5.38E-43)
        L29:
            r7 = r8 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            r15 = 0
            boolean r6 = X.AnonymousClass002.A1P(r7, r6)
            boolean r6 = X.AnonymousClass001.A1b(r6, r2, r8)
            if (r6 == 0) goto Ld1
            if (r9 == 0) goto L3c
            X.BS0 r0 = X.BRg.A00
        L3c:
            X.CGz r9 = X.AnonymousClass002.A0h(r2)
            java.lang.String r6 = r3.photoUrl
            boolean r6 = X.AnonymousClass003.A1K(r2, r6, r9)
            java.lang.Object r10 = r2.AaT()
            if (r6 != 0) goto L50
            java.lang.Object r6 = X.C78N.A00
            if (r10 != r6) goto L63
        L50:
            java.lang.String r10 = r3.photoUrl
            if (r10 == 0) goto Lcf
            com.facebook.aura.gateway.WorkspaceUriResolver r7 = com.facebook.aura.gateway.WorkspaceUriResolver.INSTANCE
            boolean r6 = r7.isDaemonApiReference(r10)
            if (r6 == 0) goto L60
            java.lang.String r10 = r7.resolveDaemonApiUrl(r10, r9)
        L60:
            r2.Ai0(r10)
        L63:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L91
            r6 = -1653894039(0xffffffff9d6b9469, float:-3.1178717E-21)
            r2.AgE(r6)
            X.BRg r7 = m2304ringedFace4WTKRHQ(r0, r4)
            r6 = r8 & 14
            SharingInitial(r3, r7, r2, r6, r15)
        L76:
            X.AnonymousClass001.A1D(r2)
        L79:
            X.BBb r6 = r2.AAc()
            if (r6 == 0) goto L90
            com.facebook.aura.tabs.SidePanelSharingBadgeKt$SharingFace$2 r2 = new com.facebook.aura.tabs.SidePanelSharingBadgeKt$SharingFace$2
            r24 = r2
            r25 = r3
            r26 = r4
            r28 = r0
            r29 = r1
            r24.<init>(r25, r26, r28, r29, r30)
            r6.A06 = r2
        L90:
            return
        L91:
            r6 = -1653809130(0xffffffff9d6ce016, float:-3.135019E-21)
            r2.AgE(r6)
            X.ARL r12 = X.B18.A00
            X.BRg r11 = m2304ringedFace4WTKRHQ(r0, r4)
            r7 = 1101004800(0x41a00000, float:20.0)
            X.1DG r6 = new X.1DG
            r6.<init>(r7)
            com.facebook.aura.tabs.SidePanelSharingBadgeKt$SharingFace$1 r8 = new com.facebook.aura.tabs.SidePanelSharingBadgeKt$SharingFace$1
            r8.<init>(r3)
            r7 = 409866767(0x186e120f, float:3.0769896E-24)
            X.B1U r22 = X.B1V.A00(r2, r8, r7)
            r28 = 48
            r29 = 30136(0x75b8, float:4.223E-41)
            r13 = 0
            r17 = 0
            r27 = 806879616(0x30180180, float:5.529941E-10)
            r14 = r13
            r19 = r15
            r20 = r15
            r21 = r15
            r23 = r13
            r24 = r13
            r25 = r13
            r26 = r2
            r16 = r6
            com.facebook.aura.vds.compose.image.AuraImageKt.m2573AuraImageXRP3Ue8(r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L76
        Lcf:
            r10 = 0
            goto L60
        Ld1:
            r2.Afo()
            goto L79
        Ld5:
            r6 = r1 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L29
            int r6 = X.AnonymousClass004.A0f(r2, r0)
            r8 = r8 | r6
            goto L29
        Le0:
            r8 = r1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.SidePanelSharingBadgeKt.m2301SharingFace3IgeMak(com.facebook.aura.library.repo.ArtifactSharingRecipient, long, X.BRg, X.BFM, int, int):void");
    }

    public static final void SharingInitial(ArtifactSharingRecipient artifactSharingRecipient, BRg bRg, BFM bfm, int i, int i2) {
        Character chA0f;
        BRg bRg2 = bRg;
        bfm.AgG(-724883848);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, artifactSharingRecipient) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String str = artifactSharingRecipient.name;
            String strA0q = (str == null || (chA0f = BQG.A0f(str)) == null) ? null : AnonymousClass006.A0q(chA0f.charValue());
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA01 = C1b8.A01(bRg2, AnonymousClass001.A0f(bfm, akh).fillDivider);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
            if (strA0q == null) {
                bfm.AgE(-1197310662);
                AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.ic_person_filled, 0), 12.0f, null, C06G.A0H(bfm, akh), null, bfm, AnonymousClass001.A03(), 41);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(strA0q, null, C06G.A08(bfm), AnonymousClass006.A0k(bfm, -1197116416).caption1Emphasized, null, null, null, false, 0, 1, 0, null, null, null, bfm, 805306368, 0, 15858);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(artifactSharingRecipient, bRg2, i, i2);
        }
    }

    /* renamed from: SidePanelSharingBadge-3IgeMak, reason: not valid java name */
    public static final void m2302SidePanelSharingBadge3IgeMak(SidePanelSharingBadgeContent sidePanelSharingBadgeContent, long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(sidePanelSharingBadgeContent, 0);
        bfm.AgG(-1283173701);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(sidePanelSharingBadgeContent, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (sidePanelSharingBadgeContent.equals(SidePanelSharingBadgeContent.Public.INSTANCE)) {
                bfm.AgE(-1818589876);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120609);
                AVy aVyA00 = BOf.A00(bfm, R.drawable.globe_wght400_outline_24, 0);
                long jA08 = C06G.A08(bfm);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new SidePanelSharingBadgeKt$SidePanelSharingBadge$1$1(strA01);
                    bfm.Ai0(objAaT);
                }
                AuraIconKt.m2568AuraIconFyETyZw(AnonymousClass001.A0Y(bRg2, objAaT, false), aVyA00, 20.0f, null, jA08, null, bfm, AnonymousClass001.A03(), 40);
                AnonymousClass001.A1D(bfm);
            } else {
                if (!(sidePanelSharingBadgeContent instanceof SidePanelSharingBadgeContent.People)) {
                    throw AnonymousClass005.A0k(bfm, -474307074);
                }
                bfm.AgE(-1818181234);
                SidePanelSharingBadgeContent.People people = (SidePanelSharingBadgeContent.People) sidePanelSharingBadgeContent;
                String strA0Y = AnonymousClass007.A0Y(people.faces.size() + people.overflow, bfm, R.plurals._name_removed__res_0x7f10001c);
                boolean zA652 = bfm.A65(strA0Y);
                Object objAaT2 = bfm.AaT();
                if (zA652 || objAaT2 == C78N.A00) {
                    objAaT2 = new SidePanelSharingBadgeKt$SidePanelSharingBadge$2$1(strA0Y);
                    bfm.Ai0(objAaT2);
                }
                BRg bRgA0Y = AnonymousClass001.A0Y(bRg2, objAaT2, false);
                InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, -8.0f);
                BBI bbi = (BBI) bfm;
                long j2 = bbi.A06;
                int i4 = (int) (j2 ^ (j2 >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA0L, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                bfm.AgE(-1441028378);
                Iterator<ArtifactSharingRecipient> it = people.faces.iterator();
                while (it.hasNext()) {
                    m2301SharingFace3IgeMak(it.next(), j, null, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
                }
                BBI.A0R(bbi, false);
                if (people.overflow > 0) {
                    bfm.AgE(-1722122343);
                    BRg bRgA012 = C1b8.A01(m2304ringedFace4WTKRHQ(BRg.A00, j), AnonymousClass002.A0c(bfm).inactive);
                    InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                    int iA0D = AnonymousClass001.A0D(bbi);
                    AKQ akqA042 = BBI.A04(bbi);
                    BRg bRgA013 = AxM.A01(bfm, bRgA012);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
                    BPg.A02(bfm, akqA042, g0v2);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                    BPg.A02(bfm, bRgA013, g0vA0u);
                    AuraTextKt.m2639AuraTextUY9GdpU(String.valueOf(people.overflow), null, AnonymousClass002.A0c(bfm).invertedText, AnonymousClass002.A0f(bfm).caption1Emphasized, null, null, null, false, 0, 1, 0, null, null, null, bfm, 805306368, 0, 15858);
                    BBI.A0R(bbi, true);
                } else {
                    bfm.AgE(-1721713918);
                }
                AnonymousClass002.A0z(bbi, false, true);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SidePanelSharingBadgeKt$SidePanelSharingBadge$4(sidePanelSharingBadgeContent, j, bRg2, i, i2);
        }
    }

    /* renamed from: ringedFace-4WTKRHQ, reason: not valid java name */
    public static final BRg m2304ringedFace4WTKRHQ(BRg bRg, long j) {
        return C11U.A03(AEk.A01(C10G.A07(bRg, 20.0f), new SidePanelSharingBadgeKt$ringedFace$1(j)), C1D8.A00);
    }
}
