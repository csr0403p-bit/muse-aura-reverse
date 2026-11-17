package com.facebook.aura.markdown.render;

import X.AHD;
import X.AKO;
import X.AKQ;
import X.AbstractC0885AGm;
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
import X.BRg;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C1515AkP;
import X.C1DG;
import X.C2VU;
import X.C3TH;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C8j4;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.render.block.BlockRenderersKt;
import com.facebook.aura.markdown.render.block.CustomBlockRenderersKt;
import com.facebook.aura.markdown.render.spacing.BlockSpacingKt;
import com.facebook.aura.markdown.render.spacing.BlockSpacingSpec;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AuraMarkdownKt {
    public static /* synthetic */ boolean $r8$lambda$adjGuVY7luSE5iJxrwHdq0mgrIk(int i) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraMarkdown(final com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument r9, final X.BRg r10, final com.facebook.aura.markdown.render.AuraMarkdownTheme r11, X.BFM r12, final int r13, final int r14) {
        /*
            r5 = 0
            X.C7384Etj.A0Y(r9, r5)
            r0 = -43606374(0xfffffffffd669e9a, float:-1.9159122E37)
            r6 = r12
            r12.AgG(r0)
            r12 = r13
            r0 = r13 & 6
            if (r0 != 0) goto L90
            int r3 = X.AnonymousClass004.A0T(r6, r9)
            r3 = r3 | r13
        L15:
            r13 = r14
            r2 = r14 & 2
            if (r2 == 0) goto L86
            r3 = r3 | 48
        L1c:
            r0 = r12 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L2f
            r0 = r14 & 4
            if (r0 != 0) goto L2c
            boolean r1 = r6.A65(r11)
            r0 = 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L2e
        L2c:
            r0 = 128(0x80, float:1.794E-43)
        L2e:
            r3 = r3 | r0
        L2f:
            boolean r0 = X.AnonymousClass004.A1J(r3)
            boolean r0 = X.AnonymousClass001.A1b(r0, r6, r3)
            if (r0 == 0) goto L82
            r6.Afy()
            r0 = r12 & 1
            if (r0 == 0) goto L6b
            boolean r0 = r6.AEk()
            if (r0 != 0) goto L6b
            r6.Afo()
        L49:
            r6.AAb()
            X.AKH<com.facebook.aura.markdown.render.AuraMarkdownTheme> r0 = com.facebook.aura.markdown.render.AuraMarkdownThemeKt.LocalAuraMarkdownTheme
            X.AKJ r2 = r0.A04(r11)
            com.facebook.aura.markdown.render.AuraMarkdownKt$$ExternalSyntheticLambda5 r1 = new com.facebook.aura.markdown.render.AuraMarkdownKt$$ExternalSyntheticLambda5
            r1.<init>()
            r0 = 836555226(0x31dcd1da, float:6.4267E-9)
            X.AnonymousClass003.A0m(r6, r2, r1, r0)
        L5d:
            X.BBb r0 = r6.AAc()
            if (r0 == 0) goto L6a
            com.facebook.aura.markdown.render.AuraMarkdownKt$$ExternalSyntheticLambda6 r8 = new com.facebook.aura.markdown.render.AuraMarkdownKt$$ExternalSyntheticLambda6
            r8.<init>()
            r0.A06 = r8
        L6a:
            return
        L6b:
            if (r2 == 0) goto L6f
            X.BS0 r10 = X.BRg.A00
        L6f:
            r0 = r14 & 4
            if (r0 == 0) goto L49
            com.facebook.aura.markdown.render.AuraMarkdownDefaults r0 = com.facebook.aura.markdown.render.AuraMarkdownDefaults.INSTANCE
            r7 = 196608(0x30000, float:2.75506E-40)
            r8 = 31
            r1 = 0
            r2 = r1
            r3 = r1
            r4 = r1
            com.facebook.aura.markdown.render.AuraMarkdownTheme r11 = r0.m1366fromAuraTheme6p0HZu4(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L49
        L82:
            r6.Afo()
            goto L5d
        L86:
            r0 = r12 & 48
            if (r0 != 0) goto L1c
            int r0 = X.AnonymousClass004.A0e(r6, r10)
            r3 = r3 | r0
            goto L1c
        L90:
            r3 = r13
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.AuraMarkdownKt.AuraMarkdown(com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument, X.BRg, com.facebook.aura.markdown.render.AuraMarkdownTheme, X.BFM, int, int):void");
    }

    public static final boolean CollapsingSpacedColumn$lambda$1$0(int i) {
        return true;
    }

    public static /* synthetic */ C1DG $r8$lambda$5IxjtykAH37_UtTWDnrVkIVyA2k(int i, int i2) {
        return null;
    }

    public static final Unit AuraMarkdown$lambda$0(BRg bRg, AuraMarkdownDocument auraMarkdownDocument, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            AuraMarkdownBlocks(auraMarkdownDocument.blocks, auraMarkdownTheme, bfm, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final void CollapsingSpacedColumn(final int i, final G0U<? super Integer, BlockSpacingSpec> g0u, BRg bRg, G0V<? super Integer, ? super Integer, C1DG> g0v, G0U<? super Integer, Boolean> g0u2, C3TH c3th, final G0W<? super Integer, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, final int i2, final int i3) {
        BRg bRg2 = bRg;
        C3TH c3th2 = c3th;
        G0V<? super Integer, ? super Integer, C1DG> g0v2 = g0v;
        G0U<? super Integer, Boolean> g0u3 = g0u2;
        AnonymousClass002.A1E(g0u, 1, g0w);
        bfm.AgG(-1070830861);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0D |= 384;
        } else if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i5 = i3 & 8;
        if (i5 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0W(bfm, g0v2);
        }
        int i6 = i3 & 16;
        if (i6 != 0) {
            iA0D |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0X(bfm, g0u3);
        }
        int i7 = i3 & 32;
        int iA0i = 196608;
        if (i7 != 0) {
            iA0D |= iA0i;
        } else if ((196608 & i2) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, c3th2);
            iA0D |= iA0i;
        }
        if ((1572864 & i2) == 0) {
            iA0D |= AnonymousClass004.A0Z(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0D), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new G0V() { // from class: com.facebook.aura.markdown.render.AuraMarkdownKt$$ExternalSyntheticLambda2
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            return null;
                        }
                    };
                    BBI.A0T(bfm, objAaT);
                }
                g0v2 = (G0V) objAaT;
            }
            if (i6 != 0) {
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = new G0U() { // from class: com.facebook.aura.markdown.render.AuraMarkdownKt$$ExternalSyntheticLambda3
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            return AnonymousClass001.A0i();
                        }
                    };
                    BBI.A0T(bfm, objAaT2);
                }
                g0u3 = (G0U) objAaT2;
            }
            if (i7 != 0) {
                c3th2 = C2VU.A02;
            }
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th2, ((((iA0D >> 6) & 14) | ((iA0D >> 9) & 896)) >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            bfm.AgE(-1405472205);
            for (int i8 = 0; i8 < i; i8++) {
                if (i8 <= 0 || !AnonymousClass003.A1X(Integer.valueOf(i8), g0u3)) {
                    bfm.AgE(-619748827);
                } else {
                    bfm.AgE(-619903548);
                    int i9 = i8 - 1;
                    C1DG c1dgInvoke = g0v2.invoke(Integer.valueOf(i9), Integer.valueOf(i8));
                    float fCollapsedGap = c1dgInvoke != null ? c1dgInvoke.A00 : BlockSpacingKt.collapsedGap((BlockSpacingSpec) C8j4.A0r(g0u, i9), (BlockSpacingSpec) C8j4.A0r(g0u, i8));
                    if (C1DG.A01(fCollapsedGap, 0.0f) > 0) {
                        C01N.A08(bfm, C3cG.A09(bfm, -1405466963), fCollapsedGap);
                    } else {
                        bfm.AgE(-619756763);
                    }
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, false);
                AnonymousClass001.A1G(Integer.valueOf(i8), bfm, g0w, (iA0D >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final C3TH c3th3 = c3th2;
            final G0U<? super Integer, Boolean> g0u4 = g0u3;
            final G0V<? super Integer, ? super Integer, C1DG> g0v3 = g0v2;
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.markdown.render.AuraMarkdownKt$$ExternalSyntheticLambda4
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    int i10 = i;
                    G0U g0u5 = g0u;
                    BRg bRg4 = bRg3;
                    G0V g0v4 = g0v3;
                    G0U g0u6 = g0u4;
                    C3TH c3th4 = c3th3;
                    G0W g0w2 = g0w;
                    int i11 = i2;
                    AuraMarkdownKt.CollapsingSpacedColumn(i10, g0u5, bRg4, g0v4, g0u6, c3th4, g0w2, (BFM) obj, AnonymousClass011.A02(obj2, i11), i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final C1DG CollapsingSpacedColumn$lambda$0$0(int i, int i2) {
        return null;
    }

    public static final Unit AuraMarkdown$lambda$1(AuraMarkdownDocument auraMarkdownDocument, BRg bRg, AuraMarkdownTheme auraMarkdownTheme, int i, int i2, BFM bfm, int i3) {
        AuraMarkdown(auraMarkdownDocument, bRg, auraMarkdownTheme, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final void AuraMarkdownBlocks(final AHD<? extends AuraBlock> ahd, final AuraMarkdownTheme auraMarkdownTheme, BFM bfm, final int i) {
        boolean zA1b = AnonymousClass004.A1b(ahd, auraMarkdownTheme);
        bfm.AgG(-1724420118);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ahd, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, auraMarkdownTheme);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            int i2 = 0;
            for (Object obj : ahd) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                AuraBlock auraBlock = (AuraBlock) obj;
                if (i2 > 0) {
                    bfm.AgE(1805794176);
                    float fGapBetween = BlockSpacingKt.gapBetween(auraMarkdownTheme, BlockSpacingKt.spacingCategory((AuraBlock) ahd.get(i2 - 1)), BlockSpacingKt.spacingCategory(auraBlock));
                    if (C1DG.A01(fGapBetween, 0.0f) > 0) {
                        C01N.A08(bfm, C3cG.A09(bfm, 1166635997), fGapBetween);
                    } else {
                        bfm.AgE(1806023669);
                    }
                    AnonymousClass001.A1D(bfm);
                } else {
                    bfm.AgE(1806029621);
                }
                BBI bbiA07 = C3cG.A07(bfm);
                if (auraBlock instanceof AuraBlock.Paragraph) {
                    bfm.AgE(1166639385);
                    BlockRenderersKt.ParagraphBlock((AuraBlock.Paragraph) auraBlock, auraMarkdownTheme, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
                } else if (auraBlock instanceof AuraBlock.Heading) {
                    bfm.AgE(1166641783);
                    BlockRenderersKt.HeadingBlock((AuraBlock.Heading) auraBlock, auraMarkdownTheme, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
                } else if (auraBlock instanceof AuraBlock.BlockQuote) {
                    bfm.AgE(1166644218);
                    BlockRenderersKt.BlockQuoteBlock((AuraBlock.BlockQuote) auraBlock, auraMarkdownTheme, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
                } else if (auraBlock instanceof AuraBlock.UnorderedList) {
                    bfm.AgE(1166646845);
                    BlockRenderersKt.UnorderedListBlock((AuraBlock.UnorderedList) auraBlock, auraMarkdownTheme, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
                } else if (auraBlock instanceof AuraBlock.OrderedList) {
                    bfm.AgE(1166649499);
                    BlockRenderersKt.OrderedListBlock((AuraBlock.OrderedList) auraBlock, auraMarkdownTheme, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
                } else if (auraBlock instanceof AuraBlock.CodeBlock) {
                    bfm.AgE(1166652025);
                    BlockRenderersKt.CodeBlockBlock((AuraBlock.CodeBlock) auraBlock, auraMarkdownTheme, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
                } else if (auraBlock instanceof AuraBlock.Table) {
                    bfm.AgE(1166654362);
                    BlockRenderersKt.TableBlockBlock((AuraBlock.Table) auraBlock, auraMarkdownTheme, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
                } else if (auraBlock instanceof AuraBlock.HtmlBlock) {
                    bfm.AgE(1166656857);
                    BlockRenderersKt.HtmlBlockBlock((AuraBlock.HtmlBlock) auraBlock, auraMarkdownTheme, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
                } else if (C7384Etj.areEqual(auraBlock, AuraBlock.ThematicBreak.INSTANCE)) {
                    bfm.AgE(1166659342);
                    BlockRenderersKt.ThematicBreakBlock(auraMarkdownTheme, bfm, (iA05 >> 3) & 14);
                } else {
                    if (!(auraBlock instanceof AuraBlock.Custom)) {
                        throw AnonymousClass003.A0k(bfm, bbiA07, 1166638729);
                    }
                    bfm.AgE(1806767421);
                    AuraBlock.Custom custom = (AuraBlock.Custom) auraBlock;
                    int i4 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
                    if (CustomBlockRenderersKt.renderCustomBlock(custom, auraMarkdownTheme, bfm, i4)) {
                        bfm.AgE(1806905557);
                    } else {
                        bfm.AgE(1166664383);
                        UnhandledCustomBlock(custom, auraMarkdownTheme, bfm, i4);
                    }
                    BBI.A0R(bbiA07, zA1b);
                }
                BBI.A0R(bbiA07, zA1b);
                i2 = i3;
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.markdown.render.AuraMarkdownKt$$ExternalSyntheticLambda7
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    AHD ahd2 = ahd;
                    AuraMarkdownTheme auraMarkdownTheme2 = auraMarkdownTheme;
                    int i5 = i;
                    AnonymousClass001.A0F(obj3);
                    AuraMarkdownKt.AuraMarkdownBlocks(ahd2, auraMarkdownTheme2, (BFM) obj2, AnonymousClass011.A00(i5));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit AuraMarkdownBlocks$lambda$1(AHD ahd, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        AuraMarkdownBlocks(ahd, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit CollapsingSpacedColumn$lambda$3(int i, G0U g0u, BRg bRg, G0V g0v, G0U g0u2, C3TH c3th, G0W g0w, int i2, int i3, BFM bfm, int i4) {
        CollapsingSpacedColumn(i, g0u, bRg, g0v, g0u2, c3th, g0w, bfm, AnonymousClass011.A00(i2), i3);
        return Unit.INSTANCE;
    }

    public static final void UnhandledCustomBlock(final AuraBlock.Custom custom, final AuraMarkdownTheme auraMarkdownTheme, BFM bfm, final int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        bfm.AgG(285522878);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, custom) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, auraMarkdownTheme);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            bfm.Afo();
        } else {
            if (!AKO.A09(AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownShowInternalDebug, (BBI) bfm)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    g0v = new G0V() { // from class: com.facebook.aura.markdown.render.AuraMarkdownKt$$ExternalSyntheticLambda0
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            AuraBlock.Custom custom2 = custom;
                            AuraMarkdownTheme auraMarkdownTheme2 = auraMarkdownTheme;
                            int i2 = i;
                            AnonymousClass001.A0F(obj2);
                            AuraMarkdownKt.UnhandledCustomBlock(custom2, auraMarkdownTheme2, (BFM) obj, AnonymousClass011.A00(i2));
                            return Unit.INSTANCE;
                        }
                    };
                    bBbAAc.A06 = g0v;
                }
                return;
            }
            Object obj = custom.payload;
            AuraTextKt.m2639AuraTextUY9GdpU(FGI.A0U("[FB Internal] ", custom.name, obj != null ? AnonymousClass007.A0a(PairsDiscretionDocument.TERMINATOR, obj) : ""), null, auraMarkdownTheme.mutedTextColor, auraMarkdownTheme.codeBlockTextStyle, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            g0v = new G0V() { // from class: com.facebook.aura.markdown.render.AuraMarkdownKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    AuraBlock.Custom custom2 = custom;
                    AuraMarkdownTheme auraMarkdownTheme2 = auraMarkdownTheme;
                    int i2 = i;
                    AnonymousClass001.A0F(obj3);
                    AuraMarkdownKt.UnhandledCustomBlock(custom2, auraMarkdownTheme2, (BFM) obj2, AnonymousClass011.A00(i2));
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v;
        }
    }

    public static final Unit UnhandledCustomBlock$lambda$0(AuraBlock.Custom custom, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        UnhandledCustomBlock(custom, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit UnhandledCustomBlock$lambda$2(AuraBlock.Custom custom, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        UnhandledCustomBlock(custom, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }
}
