package com.facebook.aura.conversation.view.richcontent;

import X.AEk;
import X.AKQ;
import X.AbstractC1996Aw5;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0v5;
import X.C0z7;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1809ArT;
import X.C1822Arm;
import X.C1847AsK;
import X.C19U;
import X.C1DM;
import X.C1OM;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C60N;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.HBA;
import X.HDi;
import X.HxS;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchMermaidContentKt {
    public static final String TAG = "HatchMermaidContent";

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchMermaidContentKt$MermaidErrorFallback$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $mermaidSource;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$mermaidSource = str;
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
            HatchMermaidContentKt.MermaidErrorFallback(this.$mermaidSource, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchMermaidContentKt$MermaidSvgCanvas$2, reason: invalid class name and case insensitive filesystem */
    public final class C115232 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HBA $svg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115232(HBA hba, BRg bRg, int i, int i2) {
            super(2);
            this.$svg = hba;
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
            HatchMermaidContentKt.MermaidSvgCanvas(this.$svg, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void MermaidSvgCanvas(HBA hba, BRg bRg, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(hba, 0);
        bfm.AgG(-999008209);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hba) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            boolean zA67 = bfm.A67(hba);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchMermaidContentKt$MermaidSvgCanvas$1$1(hba);
                bfm.Ai0(objAaT);
            }
            C3Ue.A04(AEk.A02(bRg, (G0U) objAaT), bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115232(hba, bRg, i, i2);
        }
    }

    public static final List<String> buildChartColors(AuraColors auraColors) {
        C7384Etj.A0Y(auraColors, 0);
        String strM684toHexString8_81llA = m684toHexString8_81llA(auraColors.link);
        String strM684toHexString8_81llA2 = m684toHexString8_81llA(auraColors.success);
        long j = 4294939904L << 32;
        long j2 = B6A.A01;
        return Arrays.asList(strM684toHexString8_81llA, strM684toHexString8_81llA2, m684toHexString8_81llA(j), m684toHexString8_81llA(auraColors.error), m684toHexString8_81llA(auraColors.secondaryText), m684toHexString8_81llA(auraColors.link), m684toHexString8_81llA(auraColors.success), m684toHexString8_81llA(j), m684toHexString8_81llA(auraColors.error), m684toHexString8_81llA(auraColors.secondaryText));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer.RenderResult rememberMermaidRenderResult(java.lang.String r10, com.facebook.aura.conversation.view.richcontent.MermaidThemeColors r11, X.BFM r12, int r13) {
        /*
            r8 = r10
            r9 = r11
            X.AnonymousClass003.A0u(r10, r11)
            android.content.Context r7 = X.AnonymousClass003.A0O(r12)
            java.lang.Object r10 = r12.AaT()
            java.lang.Object r2 = X.C78N.A00
            if (r10 != r2) goto L16
            r0 = 0
            androidx.compose.runtime.ParcelableSnapshotMutableState r10 = X.AnonymousClass004.A11(r12, r0)
        L16:
            androidx.compose.runtime.MutableState r10 = (androidx.compose.runtime.MutableState) r10
            boolean r5 = r12.A67(r7)
            r0 = r13 & 14
            r0 = r0 ^ 6
            r4 = 0
            r3 = 4
            if (r0 <= r3) goto L2a
            boolean r0 = r12.A65(r8)
            if (r0 != 0) goto L2f
        L2a:
            r1 = r13 & 6
            r0 = 0
            if (r1 != r3) goto L30
        L2f:
            r0 = 1
        L30:
            r5 = r5 | r0
            r0 = r13 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L3f
            boolean r0 = r12.A67(r11)
            if (r0 != 0) goto L43
        L3f:
            r0 = r13 & 48
            if (r0 != r1) goto L44
        L43:
            r4 = 1
        L44:
            r5 = r5 | r4
            java.lang.Object r6 = r12.AaT()
            if (r5 != 0) goto L4d
            if (r6 != r2) goto L56
        L4d:
            r11 = 0
            com.facebook.aura.conversation.view.richcontent.HatchMermaidContentKt$rememberMermaidRenderResult$1$1 r6 = new com.facebook.aura.conversation.view.richcontent.HatchMermaidContentKt$rememberMermaidRenderResult$1$1
            r6.<init>(r7, r8, r9, r10, r11)
            r12.Ai0(r6)
        L56:
            X.AnonymousClass001.A1A(r12, r6, r8, r9)
            java.lang.Object r0 = r10.getValue()
            com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$RenderResult r0 = (com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer.RenderResult) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchMermaidContentKt.rememberMermaidRenderResult(java.lang.String, com.facebook.aura.conversation.view.richcontent.MermaidThemeColors, X.BFM, int):com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$RenderResult");
    }

    /* renamed from: HatchMermaidContent-FJfuzF0, reason: not valid java name */
    public static final void m683HatchMermaidContentFJfuzF0(String str, Function0<Unit> function0, BRg bRg, boolean z, float f, BFM bfm, int i, int i2) {
        BBI bbiA07;
        BS0 bs0A09;
        boolean z2;
        BRg bRg2 = bRg;
        float f2 = f;
        boolean zA1K = z;
        boolean zA1a = AnonymousClass002.A1a(str, function0);
        bfm.AgG(-1673998503);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
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
            iA0d |= AnonymousClass004.A0q(bfm, zA1K);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A08(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1K = C3cG.A1K(i4, zA1K);
            if (i5 != 0) {
                f2 = 16.0f;
            }
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            AuraColors colors = AuraTheme.INSTANCE.getColors(bfm, 6);
            MermaidThemeColors mermaidThemeColorsRememberMermaidThemeColors = rememberMermaidThemeColors(bfm, 0);
            MermaidSvgRenderer.RenderResult renderResultRememberMermaidRenderResult = null;
            if (zA1K) {
                bbiA07 = AnonymousClass002.A0M(bfm, -1223534684);
            } else {
                bfm.AgE(1900194154);
                renderResultRememberMermaidRenderResult = rememberMermaidRenderResult(str, mermaidThemeColorsRememberMermaidThemeColors, bfm, iA0d & 14);
                bbiA07 = C3cG.A07(bfm);
            }
            BRg bRgA01 = C11U.A01(C10G.A0A(AnonymousClass001.A0R(C3U4.A06(bRg2, f2)), 150.0f, 400.0f), 12.0f);
            long j = colors.background;
            C1DM c1dm = C1OM.A00;
            BRg bRgA03 = C1b8.A03(bRgA01, c1dm, j);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA02 = C3cG.A02(bbiA07.A06);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA012 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0c);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            BPg.A02(bfm, akqA04, g0v);
            Integer numValueOf = Integer.valueOf(iA02);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v2 = C1515AkP.A03;
            BPg.A02(bfm, numValueOf, g0v2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            C0z7 c0z7 = C0z7.A00;
            bfm.AgE(1347457554);
            if (zA1K) {
                bfm.AgE(1347420136);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120238);
                BS0 bs0 = BRg.A00;
                BRg bRgAQJ = c0z7.AQJ(bs0);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchMermaidContentKt$HatchMermaidContent$1$1$1(strA01);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA0Y = AnonymousClass001.A0Y(bRgAQJ, objAaT, false);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D = AnonymousClass001.A0D(bbiA07);
                AKQ akqA042 = BBI.A04(bbiA07);
                BRg bRgA013 = AxM.A01(bfm, bRgA0Y);
                AnonymousClass005.A0n(bfm, bbiA07, function02);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0v2, bfm, iA0D);
                BPg.A02(bfm, bRgA013, g0vA0u);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(bs0, 48.0f), null, 0L, bfm, 6, 6);
                z2 = zA1a;
                BBI.A0R(bbiA07, z2);
                BBI.A0R(bbiA07, false);
            } else {
                bfm.AgE(1347876611);
                BBI.A0R(bbiA07, false);
                if (renderResultRememberMermaidRenderResult == null) {
                    bs0A09 = C3cG.A09(bfm, 1347936255);
                    BRg bRgAQJ2 = c0z7.AQJ(bs0A09);
                    InterfaceC1380AiA interfaceC1380AiAA0a2 = AnonymousClass001.A0a();
                    int iA0D2 = AnonymousClass001.A0D(bbiA07);
                    AKQ akqA043 = BBI.A04(bbiA07);
                    BRg bRgA014 = AxM.A01(bfm, bRgAQJ2);
                    AnonymousClass005.A0n(bfm, bbiA07, function02);
                    BPg.A02(bfm, interfaceC1380AiAA0a2, g0vA0v);
                    BPg.A02(bfm, akqA043, g0v);
                    AnonymousClass003.A15(g0u, g0v2, bfm, iA0D2);
                    BPg.A02(bfm, bRgA014, g0vA0u);
                    AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(bs0A09, 48.0f), null, 0L, bfm, 6, 6);
                    BBI.A0R(bbiA07, zA1a);
                    BBI.A0R(bbiA07, false);
                } else if (renderResultRememberMermaidRenderResult instanceof MermaidSvgRenderer.RenderResult.Success) {
                    bfm.AgE(1348149442);
                    HBA hba = ((MermaidSvgRenderer.RenderResult.Success) renderResultRememberMermaidRenderResult).parsedSvg;
                    bs0A09 = BRg.A00;
                    MermaidSvgCanvas(hba, c0z7.AQJ(bs0A09), bfm, 0, 0);
                    BBI.A0R(bbiA07, false);
                } else {
                    if (!(renderResultRememberMermaidRenderResult instanceof MermaidSvgRenderer.RenderResult.Error)) {
                        throw AnonymousClass003.A0k(bfm, bbiA07, 459122607);
                    }
                    bs0A09 = C3cG.A09(bfm, 1348296599);
                    MermaidErrorFallback(str, c0z7.AQJ(bs0A09), bfm, iA0d & 14, 0);
                    BBI.A0R(bbiA07, false);
                }
                BRg bRgAQJ3 = c0z7.AQJ(bs0A09);
                Object objAaT2 = bfm.AaT();
                Object obj = C78N.A00;
                InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT2, obj);
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == obj) {
                    objAaT3 = HatchMermaidContentKt$HatchMermaidContent$1$5$1.INSTANCE;
                    bfm.Ai0(objAaT3);
                }
                Function0 function03 = (Function0) objAaT3;
                boolean zA67 = bfm.A67(mapCurrentChatThreadLogMetadata);
                int i6 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
                boolean zA1Q = zA67 | AnonymousClass002.A1Q(i6, 32);
                Object objAaT4 = bfm.AaT();
                if (zA1Q || objAaT4 == obj) {
                    objAaT4 = new HatchMermaidContentKt$HatchMermaidContent$1$6$1(mapCurrentChatThreadLogMetadata, function0);
                    bfm.Ai0(objAaT4);
                }
                C3Ue.A04(C0v5.A00(null, interfaceC1072AWd, bRgAQJ3, null, null, null, function03, (Function0) objAaT4, zA1a), bfm, 0);
                BRg bRgA015 = C11U.A01(C3U4.A09(c0z7.A4C(C2VU.A07, bs0A09), 8.0f), 8.0f);
                long j2 = colors.background;
                BRg bRgA032 = C1b8.A03(bRgA015, c1dm, HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), 0.85f));
                boolean zA672 = bfm.A67(mapCurrentChatThreadLogMetadata) | (i6 == 32);
                Object objAaT5 = bfm.AaT();
                if (zA672 || objAaT5 == obj) {
                    objAaT5 = new HatchMermaidContentKt$HatchMermaidContent$1$7$1(mapCurrentChatThreadLogMetadata, function0);
                    bfm.Ai0(objAaT5);
                }
                BRg bRgA0B = C3U4.A0B(C0v5.A04(bRgA032, null, null, (Function0) objAaT5, zA1a), 10.0f, 6.0f);
                InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
                int iA0D3 = AnonymousClass001.A0D(bbiA07);
                AKQ akqA044 = BBI.A04(bbiA07);
                BRg bRgA016 = AxM.A01(bfm, bRgA0B);
                AnonymousClass005.A0n(bfm, bbiA07, function02);
                BPg.A02(bfm, interfaceC1380AiAA0W, g0vA0v);
                BPg.A02(bfm, akqA044, g0v);
                AnonymousClass003.A15(g0u, g0v2, bfm, iA0D3);
                BPg.A02(bfm, bRgA016, g0vA0u);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b79);
                long j3 = colors.primaryText;
                C1822Arm c1822Arm = C1822Arm.A03;
                long jA03 = C19U.A03(12);
                long j4 = B6A.A07;
                long j5 = C1809ArT.A01;
                AuraTextKt.m2639AuraTextUY9GdpU(strA012, null, j3, new C1822Arm(null, null, null, 0, 0, j4, jA03, j5, j4, j5), null, null, null, false, 0, 0, 0, null, null, null, bfm, 3072, 0, 16370);
                z2 = zA1a;
                BBI.A0R(bbiA07, z2);
            }
            BBI.A0R(bbiA07, false);
            BBI.A0R(bbiA07, z2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchMermaidContentKt$HatchMermaidContent$2(str, function0, bRg2, zA1K, f2, i, i2);
        }
    }

    public static final void MermaidErrorFallback(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-802256228);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors colors = AuraTheme.INSTANCE.getColors(bfm, 6);
            BRg bRgA09 = C3U4.A09(C1b8.A01(bRg2, colors.background), 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            long j = colors.primaryText;
            C1822Arm c1822Arm = C1822Arm.A03;
            long jA03 = C19U.A03(12);
            C1847AsK c1847AsK = AbstractC1996Aw5.A01;
            long j2 = B6A.A07;
            long j3 = C1809ArT.A01;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, j, new C1822Arm(null, c1847AsK, null, 0, 0, j2, jA03, j3, j2, j3), null, null, null, false, 0, 20, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14834);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, bRg2, i, i2);
        }
    }

    public static final void logDiagramExpandClick(Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.DIAGRAM_EXPAND_BUTTON, null, map, null);
    }

    public static final MermaidThemeColors rememberMermaidThemeColors(BFM bfm, int i) {
        AuraColors auraColorsA0W = C3cH.A0W(bfm);
        boolean zA65 = bfm.A65(auraColorsA0W);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new MermaidThemeColors(m684toHexString8_81llA(auraColorsA0W.background), m684toHexString8_81llA(auraColorsA0W.background), m684toHexString8_81llA(auraColorsA0W.primaryText), m684toHexString8_81llA(auraColorsA0W.secondaryText), m684toHexString8_81llA(auraColorsA0W.border), buildChartColors(auraColorsA0W));
            bfm.Ai0(objAaT);
        }
        return (MermaidThemeColors) objAaT;
    }

    /* renamed from: toHexString-8_81llA, reason: not valid java name */
    public static final String m684toHexString8_81llA(long j) {
        int iA03 = (int) (B6A.A03(j) * 255.0f);
        if (iA03 < 0) {
            iA03 = 0;
        } else if (iA03 > 255) {
            iA03 = 255;
        }
        int iA02 = (int) (B6A.A02(j) * 255.0f);
        if (iA02 < 0) {
            iA02 = 0;
        } else if (iA02 > 255) {
            iA02 = 255;
        }
        int iA01 = (int) (B6A.A01(j) * 255.0f);
        if (iA01 < 0) {
            iA01 = 0;
        } else if (iA01 > 255) {
            iA01 = 255;
        }
        return String.format(C60N.A00(33), Arrays.copyOf(new Object[]{Integer.valueOf(iA03), Integer.valueOf(iA02), Integer.valueOf(iA01)}, 3));
    }
}
