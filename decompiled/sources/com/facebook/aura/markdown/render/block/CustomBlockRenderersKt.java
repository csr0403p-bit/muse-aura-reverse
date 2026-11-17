package com.facebook.aura.markdown.render.block;

import X.AHD;
import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B0A;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BG3;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1697Aoc;
import X.C1731ApS;
import X.C1736ApY;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1D8;
import X.C1DI;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.C8j4;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.custom.AuraMarkdown;
import com.facebook.aura.markdown.parser.custom.extensions.AuraCustomBlockNames;
import com.facebook.aura.markdown.parser.custom.extensions.AuraCustomInlineNames;
import com.facebook.aura.markdown.parser.custom.extensions.MathBlockPayload;
import com.facebook.aura.markdown.parser.custom.extensions.MermaidPayload;
import com.facebook.aura.markdown.parser.custom.extensions.SourceReference;
import com.facebook.aura.markdown.parser.custom.extensions.SourcesPayload;
import com.facebook.aura.markdown.render.AuraMarkdownTheme;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class CustomBlockRenderersKt {
    public static final Set<String> RENDERABLE_CUSTOM_BLOCK_NAMES = BFI.A0H(new String[]{AuraCustomInlineNames.FILE_LINK, AuraCustomBlockNames.MERMAID, AuraCustomBlockNames.MATH, AuraCustomBlockNames.SOURCES, AuraCustomBlockNames.IMAGE_GROUP});

    public static final boolean markdownRendersNothing(String str) {
        C7384Etj.A0Y(str, 0);
        if (!C7BY.A0j(str)) {
            AHD<AuraBlock> ahd = AuraMarkdown.INSTANCE.parse(str, true).blocks;
            if (!ahd.isEmpty()) {
                if (!(ahd instanceof Collection) || !ahd.isEmpty()) {
                    Iterator it = ahd.iterator();
                    while (it.hasNext()) {
                        AuraBlock auraBlockA0i = C8j4.A0i(it);
                        if (!(auraBlockA0i instanceof AuraBlock.Custom) || RENDERABLE_CUSTOM_BLOCK_NAMES.contains(((AuraBlock.Custom) auraBlockA0i).name)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final Set<String> getRENDERABLE_CUSTOM_BLOCK_NAMES() {
        return RENDERABLE_CUSTOM_BLOCK_NAMES;
    }

    public static final void ImageGroupAltTextFallback(final AuraInline.Image image, final AuraMarkdownTheme auraMarkdownTheme, BFM bfm, final int i) {
        bfm.AgG(1217084068);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, image) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, auraMarkdownTheme);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, image.alt, R.string._name_removed__res_0x7f120cd8), null, auraMarkdownTheme.mutedTextColor, auraMarkdownTheme.baseTextStyle, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.markdown.render.block.CustomBlockRenderersKt$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    AuraInline.Image image2 = image;
                    AuraMarkdownTheme auraMarkdownTheme2 = auraMarkdownTheme;
                    int i2 = i;
                    AnonymousClass001.A0F(obj2);
                    CustomBlockRenderersKt.ImageGroupAltTextFallback(image2, auraMarkdownTheme2, (BFM) obj, AnonymousClass011.A00(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit ImageGroupAltTextFallback$lambda$0(AuraInline.Image image, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        ImageGroupAltTextFallback(image, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final void MathBlockFallback(final MathBlockPayload mathBlockPayload, final AuraMarkdownTheme auraMarkdownTheme, BFM bfm, final int i) {
        bfm.AgG(2109305955);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, mathBlockPayload) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, auraMarkdownTheme);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0B = C3U4.A0B(C1b8.A01(C11U.A01(c1062ATq, 6.0f), auraMarkdownTheme.codeBlockBackground), auraMarkdownTheme.codeBlockPadding, 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(mathBlockPayload.expression, c1062ATq, auraMarkdownTheme.baseTextColor, C1822Arm.A00(null, auraMarkdownTheme.codeBlockTextStyle, null, new B0A(1), null, null, null, null, null, null, 3, 0, 0, 16744439, 0L, 0L, 0L, 0L), null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.markdown.render.block.CustomBlockRenderersKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    MathBlockPayload mathBlockPayload2 = mathBlockPayload;
                    AuraMarkdownTheme auraMarkdownTheme2 = auraMarkdownTheme;
                    int i2 = i;
                    AnonymousClass001.A0F(obj2);
                    CustomBlockRenderersKt.MathBlockFallback(mathBlockPayload2, auraMarkdownTheme2, (BFM) obj, AnonymousClass011.A00(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit MathBlockFallback$lambda$1(MathBlockPayload mathBlockPayload, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        MathBlockFallback(mathBlockPayload, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final void MermaidBlockFallback(final MermaidPayload mermaidPayload, final AuraMarkdownTheme auraMarkdownTheme, BFM bfm, final int i) {
        bfm.AgG(1693987684);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, mermaidPayload) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, auraMarkdownTheme);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA09 = C3U4.A09(C1b8.A01(C11U.A01(C10G.A02, auraMarkdownTheme.codeBlockCornerRadius), auraMarkdownTheme.codeBlockBackground), auraMarkdownTheme.codeBlockPadding);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            boolean z = mermaidPayload.isStreaming;
            int i2 = R.string._name_removed__res_0x7f120cd9;
            if (z) {
                i2 = R.string._name_removed__res_0x7f120cda;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i2), null, auraMarkdownTheme.mutedTextColor, auraMarkdownTheme.codeBlockTextStyle, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 4.0f);
            AuraTextKt.m2640AuraTextVmYn7U0(AnonymousClass005.A0X(mermaidPayload.source), null, auraMarkdownTheme.baseTextColor, auraMarkdownTheme.codeBlockTextStyle, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32754);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.markdown.render.block.CustomBlockRenderersKt$$ExternalSyntheticLambda3
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    MermaidPayload mermaidPayload2 = mermaidPayload;
                    AuraMarkdownTheme auraMarkdownTheme2 = auraMarkdownTheme;
                    int i3 = i;
                    AnonymousClass001.A0F(obj2);
                    CustomBlockRenderersKt.MermaidBlockFallback(mermaidPayload2, auraMarkdownTheme2, (BFM) obj, AnonymousClass011.A00(i3));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit MermaidBlockFallback$lambda$1(MermaidPayload mermaidPayload, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        MermaidBlockFallback(mermaidPayload, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final void SourcesBlockCard(final SourcesPayload sourcesPayload, final AuraMarkdownTheme auraMarkdownTheme, BFM bfm, final int i) {
        bfm.AgG(1960643734);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, sourcesPayload) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, auraMarkdownTheme);
        }
        int i2 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            long j = auraMarkdownTheme.tableBorderColor;
            float f = auraMarkdownTheme.codeBlockCornerRadius;
            BRg bRgA09 = C3U4.A09(C11U.A01(C1DI.A02(c1062ATq, C1D8.A00(f), 1.0f, j), f), auraMarkdownTheme.codeBlockPadding);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0U);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                C1736ApY c1736ApY = null;
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120cdb), null, auraMarkdownTheme.baseTextColor, C1822Arm.A00(null, auraMarkdownTheme.baseTextStyle, null, null, C1736ApY.A05, null, null, null, null, null, 0, 0, 0, 16777211, 0L, 0L, 0L, 0L), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                C01N.A08(bfm, bs0, 6.0f);
                bfm.AgE(1466571184);
                for (SourceReference sourceReference : sourcesPayload.items) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        SourceReference sourceReference2 = sourceReference;
                        if (i2 > 0) {
                            bfm.AgE(-783475916);
                            C01N.A08(bfm, bs0, 4.0f);
                        } else {
                            bfm.AgE(1482097471);
                        }
                        BBI.A0R(bbi, false);
                        InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A05, 0);
                        int iA0D = AnonymousClass001.A0D(bbi);
                        AKQ akqA042 = BBI.A04(bbi);
                        BRg bRgA012 = AxM.A01(bfm, bs0);
                        AnonymousClass005.A0n(bfm, bbi, function0);
                        BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
                        BPg.A02(bfm, akqA042, g0v);
                        AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                        BPg.A02(bfm, bRgA012, g0vA0u);
                        AuraTextKt.m2639AuraTextUY9GdpU(FGI.A08(sourceReference2.index, "."), C10G.A08(bs0, 24.0f), auraMarkdownTheme.mutedTextColor, auraMarkdownTheme.baseTextStyle, null, c1736ApY, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                        C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
                        String str = sourceReference2.url;
                        String str2 = sourceReference2.title;
                        if (str != null) {
                            if (str2 != null && !C7BY.A0j(str2)) {
                                C1736ApY c1736ApY2 = C1736ApY.A03;
                                long j2 = B6A.A07;
                                long j3 = C1809ArT.A01;
                                int iA00 = C1731ApS.A00(c1731ApSA0W, new C1824Aro(null, null, null, null, null, c1736ApY2, null, null, null, null, null, j2, j3, j3, j2));
                                try {
                                    c1731ApSA0W.A0C(sourceReference2.title);
                                    c1731ApSA0W.A06(iA00);
                                    c1731ApSA0W.A0E(" \u2014 ");
                                } catch (Throwable th) {
                                    c1731ApSA0W.A06(iA00);
                                    throw th;
                                }
                            }
                            long j4 = auraMarkdownTheme.linkColor;
                            C1736ApY c1736ApY3 = auraMarkdownTheme.linkFontWeight;
                            BG3 bg3 = BG3.A03;
                            long j5 = C1809ArT.A01;
                            int iA002 = C1697Aoc.A00(c1731ApSA0W, new C1824Aro(null, null, null, null, null, c1736ApY3, null, null, bg3, null, null, j4, j5, j5, B6A.A07), str);
                            c1731ApSA0W.A0E(str);
                            c1731ApSA0W.A06(iA002);
                        } else if (str2 != null && !C7BY.A0j(str2)) {
                            c1731ApSA0W.A0C(sourceReference2.title);
                        }
                        c1736ApY = null;
                        AuraTextKt.m2640AuraTextVmYn7U0(c1731ApSA0W.A04(), null, auraMarkdownTheme.baseTextColor, auraMarkdownTheme.baseTextStyle, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32754);
                        BBI.A0R(bbi, true);
                        i2 = i3;
                    }
                }
                AnonymousClass003.A0q(bbi);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.markdown.render.block.CustomBlockRenderersKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    SourcesPayload sourcesPayload2 = sourcesPayload;
                    AuraMarkdownTheme auraMarkdownTheme2 = auraMarkdownTheme;
                    int i4 = i;
                    AnonymousClass001.A0F(obj2);
                    CustomBlockRenderersKt.SourcesBlockCard(sourcesPayload2, auraMarkdownTheme2, (BFM) obj, AnonymousClass011.A00(i4));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit SourcesBlockCard$lambda$1(SourcesPayload sourcesPayload, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        SourcesBlockCard(sourcesPayload, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean renderCustomBlock(com.facebook.aura.markdown.parser.ast.AuraBlock.Custom r10, com.facebook.aura.markdown.render.AuraMarkdownTheme r11, X.BFM r12, int r13) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.block.CustomBlockRenderersKt.renderCustomBlock(com.facebook.aura.markdown.parser.ast.AuraBlock$Custom, com.facebook.aura.markdown.render.AuraMarkdownTheme, X.BFM, int):boolean");
    }
}
