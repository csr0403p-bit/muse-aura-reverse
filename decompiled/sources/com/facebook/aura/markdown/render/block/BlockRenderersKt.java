package com.facebook.aura.markdown.render.block;

import X.AEk;
import X.AGI;
import X.AHD;
import X.AKO;
import X.AKQ;
import X.ART;
import X.AT3;
import X.ATD;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC1103AYp;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B0A;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C11U;
import X.C14P;
import X.C1515AkP;
import X.C1736ApY;
import X.C1822Arm;
import X.C1958Aux;
import X.C1D8;
import X.C1DI;
import X.C1DM;
import X.C1OM;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.EnumC1820Arj;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC0857A6e;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.ListItem;
import com.facebook.aura.markdown.parser.ast.TableCell;
import com.facebook.aura.markdown.parser.custom.extensions.InlineMathPayload;
import com.facebook.aura.markdown.render.AuraDottedUnderline;
import com.facebook.aura.markdown.render.AuraDottedUnderlineKt;
import com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntityHandler;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntitySlot;
import com.facebook.aura.markdown.render.AuraMarkdownKt;
import com.facebook.aura.markdown.render.AuraMarkdownTheme;
import com.facebook.aura.markdown.render.inline.InlineEntityGesturesKt;
import com.facebook.aura.markdown.render.inline.InlineMathEntity;
import com.facebook.aura.markdown.render.inline.InlineRenderResult;
import com.facebook.aura.markdown.render.inline.InlineRendererKt;
import com.facebook.aura.markdown.render.inline.PhoneLinkifierKt;
import com.facebook.aura.markdown.render.reveal.WordRevealKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class BlockRenderersKt {
    public static final void BlockQuoteBlock(final AuraBlock.BlockQuote blockQuote, final AuraMarkdownTheme auraMarkdownTheme, BFM bfm, final int i) {
        boolean zA1a = AnonymousClass002.A1a(blockQuote, auraMarkdownTheme);
        bfm.AgG(1433982083);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, blockQuote) : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, auraMarkdownTheme);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            int i2 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1Q = AnonymousClass002.A1Q(i2, 32);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = AuraMarkdownTheme.m1369copy5wRo7Uk$default(auraMarkdownTheme, C1822Arm.A00(null, auraMarkdownTheme.baseTextStyle, null, new B0A(zA1a ? 1 : 0), null, null, null, null, null, null, 0, 0, 0, 16777207, 0L, 0L, 0L, 0L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, null, null, null, null, null, null, 0.0f, 0.0f, null, 0.0f, 0.0f, 0.0f, 0.0f, null, 0.0f, 0.0f, 0.0f, 0.0f, 0L, false, 0.0f, null, null, 0.0f, 0.0f, -2, 15, null);
                bfm.Ai0(objAaT);
            }
            AuraMarkdownTheme auraMarkdownTheme2 = (AuraMarkdownTheme) objAaT;
            final float f = auraMarkdownTheme.blockQuoteRuleWidth;
            C1062ATq c1062ATq = C10G.A02;
            boolean zA62 = bfm.A62(f) | AnonymousClass002.A1Q(i2, 32);
            Object objAaT2 = bfm.AaT();
            if (zA62 || objAaT2 == C78N.A00) {
                objAaT2 = new G0U() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda12
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return BlockRenderersKt.BlockQuoteBlock$lambda$1$0(f, auraMarkdownTheme, (AT3) obj);
                    }
                };
                BBI.A0T(bfm, objAaT2);
            }
            BRg bRgA0C = C3U4.A0C(AEk.A01(c1062ATq, (G0U) objAaT2), f + auraMarkdownTheme.blockQuoteIndent, 0.0f, 0.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0D);
            AuraMarkdownKt.AuraMarkdownBlocks(blockQuote.children, auraMarkdownTheme2, bfm, 0);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda13
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    AuraBlock.BlockQuote blockQuote2 = blockQuote;
                    AuraMarkdownTheme auraMarkdownTheme3 = auraMarkdownTheme;
                    int i3 = i;
                    AnonymousClass001.A0F(obj2);
                    BlockRenderersKt.BlockQuoteBlock(blockQuote2, auraMarkdownTheme3, (BFM) obj, AnonymousClass011.A00(i3));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit BlockQuoteBlock$lambda$1$0(float f, AuraMarkdownTheme auraMarkdownTheme, AT3 at3) {
        C7384Etj.A0Y(at3, 2);
        float fAh4 = at3.Ah4(f);
        ART.A03(null, at3, 0.0f, 120, auraMarkdownTheme.blockQuoteRuleColor, (C8j3.A0P(at3.getLayoutDirection() == EnumC1820Arj.A03 ? AnonymousClass001.A00(at3.AKb()) - fAh4 : 0.0f) << 32) | (C8j3.A0P(0.0f) & 4294967295L), AnonymousClass005.A0L(fAh4, AnonymousClass001.A01(at3.AKb(), 4294967295L)));
        return Unit.INSTANCE;
    }

    public static final void HeadingBlock(final AuraBlock.Heading heading, final AuraMarkdownTheme auraMarkdownTheme, BFM bfm, final int i) {
        boolean zA1a = AnonymousClass002.A1a(heading, auraMarkdownTheme);
        bfm.AgG(-2135550001);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, heading) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, auraMarkdownTheme);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            List<C1822Arm> list = auraMarkdownTheme.headingStyles;
            C1822Arm c1822Arm = (C1822Arm) AbstractC0878AGe.A0A(ATD.A04(heading.level - (zA1a ? 1 : 0), 0, list.size() - (zA1a ? 1 : 0)), list);
            if (c1822Arm == null) {
                c1822Arm = auraMarkdownTheme.baseTextStyle;
            }
            G0U<String, String> g0uRememberImageAltFormatter = rememberImageAltFormatter(bfm, 0);
            BBI bbi = (BBI) bfm;
            BO6 bo6 = (BO6) AKO.A07(AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownInlineEntityHandlers, bbi);
            boolean zA1P = AnonymousClass003.A1P(bfm, g0uRememberImageAltFormatter, bo6, AnonymousClass003.A1C(iA0T) | bfm.A65(heading));
            Object objAaT = bfm.AaT();
            if (zA1P || objAaT == C78N.A00) {
                objAaT = InlineRendererKt.renderInlines(heading.inlines, auraMarkdownTheme, g0uRememberImageAltFormatter, bo6);
                bfm.Ai0(objAaT);
            }
            InlineRenderResult inlineRenderResult = (InlineRenderResult) objAaT;
            boolean zA1R = AnonymousClass005.A1R(bfm, inlineRenderResult.annotated, inlineRenderResult.inlineEntityRanges, bo6);
            Object objAaT2 = bfm.AaT();
            if (zA1R || objAaT2 == C78N.A00) {
                objAaT2 = AuraMarkdownExtensionRenderersKt.withAuraMarkdownInlineEntityLinks(inlineRenderResult.annotated, bo6, inlineRenderResult.inlineEntityRanges);
                bfm.Ai0(objAaT2);
            }
            ApQ apQ = (ApQ) objAaT2;
            boolean zA65 = bfm.A65(apQ);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == C78N.A00) {
                objAaT3 = PhoneLinkifierKt.linkifyPhoneNumbers(apQ, auraMarkdownTheme);
                bfm.Ai0(objAaT3);
            }
            ApQ apQ2 = (ApQ) objAaT3;
            int i2 = auraMarkdownTheme.reflowSoftLineBreaks ? inlineRenderResult.textDirection : 0;
            Object objAaT4 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT4 == obj) {
                objAaT4 = new AuraDottedUnderline(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                BBI.A0O(bbi, objAaT4);
            }
            final AuraDottedUnderline auraDottedUnderline = (AuraDottedUnderline) objAaT4;
            ApQ apQM1432withWordRevealXOJAsU = WordRevealKt.m1432withWordRevealXOJAsU(apQ2, heading, auraMarkdownTheme.baseTextColor, bfm, (iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            boolean zA1L = AnonymousClass003.A1L(bfm, bo6, inlineRenderResult.inlineEntityRanges);
            Object objAaT5 = bfm.AaT();
            if (zA1L || objAaT5 == obj) {
                objAaT5 = AuraMarkdownExtensionRenderersKt.applyAuraMarkdownInlineEntityModifiers(BRg.A00, bo6, inlineRenderResult.inlineEntityRanges);
                bfm.Ai0(objAaT5);
            }
            BRg bRg = (BRg) objAaT5;
            Object objAaT6 = bfm.AaT();
            if (objAaT6 == obj) {
                objAaT6 = new G0U() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda6
                    @Override // X.G0U
                    public final Object invoke(Object obj2) {
                        AnonymousClass006.A19((InterfaceC0857A6e) obj2);
                        return Unit.INSTANCE;
                    }
                };
                BBI.A0O(bbi, objAaT6);
            }
            BRg bRgM1361drawDottedUnderlinesmxwnekA = AuraDottedUnderlineKt.m1361drawDottedUnderlinesmxwnekA(AnonymousClass001.A0Y(bRg, objAaT6, false), auraDottedUnderline, auraMarkdownTheme.baseTextColor);
            boolean zA67 = bfm.A67(auraDottedUnderline);
            Object objAaT7 = bfm.AaT();
            if (zA67 || objAaT7 == obj) {
                objAaT7 = new Function0() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return auraDottedUnderline.layoutResult;
                    }
                };
                BBI.A0O(bbi, objAaT7);
            }
            BRg bRgInlineEntityGestures = InlineEntityGesturesKt.inlineEntityGestures(bRgM1361drawDottedUnderlinesmxwnekA, (Function0) objAaT7, apQM1432withWordRevealXOJAsU, bo6, bfm, 0);
            BO6<String, C14P> bo6RememberInlineContent = rememberInlineContent(inlineRenderResult.mathEntities, inlineRenderResult.inlineEntitySlots, bo6, auraMarkdownTheme, bfm, ((iA0T << 6) & 7168) | InlineMathEntity.$stable | (AuraMarkdownInlineEntitySlot.$stable << 3));
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, c1822Arm, null, null, null, null, null, null, null, null, 0, i2, 0, 16711679, 0L, 0L, 0L, 0L);
            long j = auraMarkdownTheme.baseTextColor;
            boolean zA672 = bfm.A67(auraDottedUnderline);
            Object objAaT8 = bfm.AaT();
            if (zA672 || objAaT8 == obj) {
                objAaT8 = new G0U() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda8
                    @Override // X.G0U
                    public final Object invoke(Object obj2) {
                        return BlockRenderersKt.HeadingBlock$lambda$7$0(auraDottedUnderline, (C1958Aux) obj2);
                    }
                };
                BBI.A0O(bbi, objAaT8);
            }
            AuraTextKt.m2640AuraTextVmYn7U0(apQM1432withWordRevealXOJAsU, bRgInlineEntityGestures, j, c1822ArmA00, null, null, null, 0L, false, 0, 0, 0, (G0U) objAaT8, null, bo6RememberInlineContent, bfm, 0, 0, 12272);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda9
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    AuraBlock.Heading heading2 = heading;
                    AuraMarkdownTheme auraMarkdownTheme2 = auraMarkdownTheme;
                    int i3 = i;
                    AnonymousClass001.A0F(obj3);
                    BlockRenderersKt.HeadingBlock(heading2, auraMarkdownTheme2, (BFM) obj2, AnonymousClass011.A00(i3));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit HeadingBlock$lambda$7$0(AuraDottedUnderline auraDottedUnderline, C1958Aux c1958Aux) {
        C7384Etj.A0Y(c1958Aux, 1);
        auraDottedUnderline.layoutResult = c1958Aux;
        return Unit.INSTANCE;
    }

    public static final Unit ParagraphBlock$lambda$8$0(AuraDottedUnderline auraDottedUnderline, C1958Aux c1958Aux) {
        C7384Etj.A0Y(c1958Aux, 1);
        auraDottedUnderline.layoutResult = c1958Aux;
        return Unit.INSTANCE;
    }

    public static final void TableBlockBlock(final AuraBlock.Table table, final AuraMarkdownTheme auraMarkdownTheme, BFM bfm, final int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        boolean zA1a = AnonymousClass002.A1a(table, auraMarkdownTheme);
        bfm.AgG(1217058690);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, table) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, auraMarkdownTheme);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            BBI bbi = (BBI) bfm;
            G2j g2j = (G2j) AKO.A07(AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownTableBlockRenderer, bbi);
            if (g2j != null) {
                bfm.AgE(-718059207);
                AnonymousClass001.A1F(table, auraMarkdownTheme, bfm, g2j, iA0T & 126);
                bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                if (bBbAAc != null) {
                    g0v = new G0V() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda10
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            AuraBlock.Table table2 = table;
                            AuraMarkdownTheme auraMarkdownTheme2 = auraMarkdownTheme;
                            int i2 = i;
                            AnonymousClass001.A0F(obj2);
                            BlockRenderersKt.TableBlockBlock(table2, auraMarkdownTheme2, (BFM) obj, AnonymousClass011.A00(i2));
                            return Unit.INSTANCE;
                        }
                    };
                    bBbAAc.A06 = g0v;
                }
                return;
            }
            bfm.AgE(-718021728);
            BBI.A0R(bbi, false);
            C1110AYw c1110AYwA00 = AbstractC1103AYp.A00(0, bfm, 0, zA1a ? 1 : 0);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA01 = AbstractC1103AYp.A01(c1110AYwA00, C11U.A01(C1DI.A02(c1062ATq, C1D8.A00(6.0f), 1.0f, auraMarkdownTheme.tableBorderColor), 6.0f), zA1a);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
            if (table.header.isEmpty()) {
                bfm.AgE(-388879862);
            } else {
                bfm.AgE(-389040349);
                m1419TableRowFNF3uiM(table.header, auraMarkdownTheme, auraMarkdownTheme.tableHeaderBackground, zA1a, bfm, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 3072);
            }
            BBI.A0R(bbi, false);
            bfm.AgE(-289638367);
            Iterator it = table.rows.iterator();
            while (it.hasNext()) {
                AHD ahd = (AHD) it.next();
                C1b8.A04(bfm, C10G.A04(c1062ATq, 1.0f), auraMarkdownTheme.tableBorderColor);
                m1419TableRowFNF3uiM(ahd, auraMarkdownTheme, B6A.A06, false, bfm, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 3456);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            g0v = new G0V() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda11
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    AuraBlock.Table table2 = table;
                    AuraMarkdownTheme auraMarkdownTheme2 = auraMarkdownTheme;
                    int i2 = i;
                    AnonymousClass001.A0F(obj2);
                    BlockRenderersKt.TableBlockBlock(table2, auraMarkdownTheme2, (BFM) obj, AnonymousClass011.A00(i2));
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v;
        }
    }

    public static final void ThematicBreakBlock(final AuraMarkdownTheme auraMarkdownTheme, BFM bfm, final int i) {
        C7384Etj.A0Y(auraMarkdownTheme, 0);
        bfm.AgG(1847064389);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, auraMarkdownTheme) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            C1b8.A04(bfm, C10G.A04(C10G.A02, auraMarkdownTheme.thematicBreakHeight), auraMarkdownTheme.thematicBreakColor);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda5
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BlockRenderersKt.ThematicBreakBlock(auraMarkdownTheme, (BFM) obj, AnonymousClass011.A02(obj2, i));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final String rememberImageAltFormatter$lambda$0$0(Context context, String str) {
        C7384Etj.A0Y(str, 1);
        return context.getString(R.string._name_removed__res_0x7f120cd8, str);
    }

    public static final Unit rememberInlineMathContent$lambda$0$0$0(G2j g2j, InlineMathEntity inlineMathEntity, AuraMarkdownTheme auraMarkdownTheme, String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 3);
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            if (g2j != null) {
                bfm.AgE(278148079);
                AnonymousClass001.A1F(new InlineMathPayload(inlineMathEntity.expression), auraMarkdownTheme, bfm, g2j, 0);
            } else {
                bfm.AgE(278292756);
                AuraTextKt.m2639AuraTextUY9GdpU(inlineMathEntity.expression, null, auraMarkdownTheme.baseTextColor, C1822Arm.A00(null, auraMarkdownTheme.codeBlockTextStyle, null, new B0A(1), null, null, null, null, null, null, 0, 0, 0, 16777207, 0L, 0L, 0L, 0L), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final void HtmlBlockBlock(final AuraBlock.HtmlBlock htmlBlock, final AuraMarkdownTheme auraMarkdownTheme, BFM bfm, final int i) {
        boolean zA1b = AnonymousClass004.A1b(htmlBlock, auraMarkdownTheme);
        bfm.AgG(1700069391);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, htmlBlock) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, auraMarkdownTheme);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            AuraTextKt.m2639AuraTextUY9GdpU(htmlBlock.html, null, auraMarkdownTheme.mutedTextColor, auraMarkdownTheme.codeBlockTextStyle, null, null, null, zA1b, zA1b ? 1 : 0, zA1b ? 1 : 0, zA1b ? 1 : 0, null, null, null, bfm, zA1b ? 1 : 0, zA1b ? 1 : 0, 16370);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda4
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    AuraBlock.HtmlBlock htmlBlock2 = htmlBlock;
                    AuraMarkdownTheme auraMarkdownTheme2 = auraMarkdownTheme;
                    int i2 = i;
                    AnonymousClass001.A0F(obj2);
                    BlockRenderersKt.HtmlBlockBlock(htmlBlock2, auraMarkdownTheme2, (BFM) obj, AnonymousClass011.A00(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final String OrderedListBlock$lambda$0$0(AuraBlock.OrderedList orderedList, int i) {
        return FGI.A08(orderedList.startNumber + i, ".");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ParagraphBlock(final com.facebook.aura.markdown.parser.ast.AuraBlock.Paragraph r50, final com.facebook.aura.markdown.render.AuraMarkdownTheme r51, X.BFM r52, final int r53) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.block.BlockRenderersKt.ParagraphBlock(com.facebook.aura.markdown.parser.ast.AuraBlock$Paragraph, com.facebook.aura.markdown.render.AuraMarkdownTheme, X.BFM, int):void");
    }

    public static final G0U<String, String> rememberImageAltFormatter(BFM bfm, int i) {
        BBI bbi = (BBI) bfm;
        final Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, bbi);
        boolean zA65 = bfm.A65(contextA00);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new G0U() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda14
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return BlockRenderersKt.rememberImageAltFormatter$lambda$0$0(contextA00, (String) obj);
                }
            };
            BBI.A0O(bbi, objAaT);
        }
        return (G0U) objAaT;
    }

    public static /* synthetic */ Unit $r8$lambda$OGOTlHNtLPC04xMhuRYuH3hFcQ4(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass006.A19(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final Unit BlockQuoteBlock$lambda$3(AuraBlock.BlockQuote blockQuote, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        BlockQuoteBlock(blockQuote, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final void CodeBlockBlock(final AuraBlock.CodeBlock codeBlock, final AuraMarkdownTheme auraMarkdownTheme, BFM bfm, final int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        AnonymousClass003.A0u(codeBlock, auraMarkdownTheme);
        bfm.AgG(-1000729521);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, codeBlock) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, auraMarkdownTheme);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            BBI bbi = (BBI) bfm;
            G2j g2j = (G2j) AKO.A07(AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownCodeBlockRenderer, bbi);
            if (g2j != null) {
                bfm.AgE(-1364757588);
                AnonymousClass001.A1F(codeBlock, auraMarkdownTheme, bfm, g2j, iA0T & 126);
                bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                if (bBbAAc != null) {
                    g0v = new G0V() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda18
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            AuraBlock.CodeBlock codeBlock2 = codeBlock;
                            AuraMarkdownTheme auraMarkdownTheme2 = auraMarkdownTheme;
                            int i2 = i;
                            AnonymousClass001.A0F(obj2);
                            BlockRenderersKt.CodeBlockBlock(codeBlock2, auraMarkdownTheme2, (BFM) obj, AnonymousClass011.A00(i2));
                            return Unit.INSTANCE;
                        }
                    };
                    bBbAAc.A06 = g0v;
                }
                return;
            }
            bfm.AgE(-1364720109);
            BBI.A0R(bbi, false);
            CodeBlockRendererKt.CodeBlockRenderer(codeBlock, auraMarkdownTheme, bfm, iA0T & 126);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            g0v = new G0V() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda19
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    AuraBlock.CodeBlock codeBlock2 = codeBlock;
                    AuraMarkdownTheme auraMarkdownTheme2 = auraMarkdownTheme;
                    int i2 = i;
                    AnonymousClass001.A0F(obj2);
                    BlockRenderersKt.CodeBlockBlock(codeBlock2, auraMarkdownTheme2, (BFM) obj, AnonymousClass011.A00(i2));
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v;
        }
    }

    public static final Unit CodeBlockBlock$lambda$0(AuraBlock.CodeBlock codeBlock, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        CodeBlockBlock(codeBlock, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit CodeBlockBlock$lambda$1(AuraBlock.CodeBlock codeBlock, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        CodeBlockBlock(codeBlock, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit HeadingBlock$lambda$5$0(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass006.A19(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final Unit HeadingBlock$lambda$8(AuraBlock.Heading heading, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        HeadingBlock(heading, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit HtmlBlockBlock$lambda$0(AuraBlock.HtmlBlock htmlBlock, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        HtmlBlockBlock(htmlBlock, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final void ListBlockShared(final AHD<ListItem> ahd, final AuraMarkdownTheme auraMarkdownTheme, final G0U<? super Integer, String> g0u, BFM bfm, final int i) {
        bfm.AgG(934510119);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, auraMarkdownTheme);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            BS0 bs0 = BRg.A00;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
                G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
                Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -843055453);
                int i2 = 0;
                while (itA0w.hasNext()) {
                    Object next = itA0w.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        ListItem listItem = (ListItem) next;
                        if (i2 > 0) {
                            bfm.AgE(-1156553348);
                            C01N.A08(bfm, bs0, auraMarkdownTheme.listItemSpacing);
                        } else {
                            bfm.AgE(-1493360641);
                        }
                        BBI.A0R(bbi, false);
                        InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(AcQ.A01, bfm, C2VU.A05, 0);
                        int iA0D = AnonymousClass001.A0D(bbi);
                        AKQ akqA042 = BBI.A04(bbi);
                        BRg bRgA012 = AxM.A01(bfm, bs0);
                        AnonymousClass005.A0n(bfm, bbi, function0);
                        BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                        BPg.A02(bfm, akqA042, g0v);
                        AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
                        BPg.A02(bfm, bRgA012, g0vA0u);
                        AuraTextKt.m2639AuraTextUY9GdpU((String) C8j4.A0r(g0u, i2), C3U4.A0C(bs0, 0.0f, 0.0f, 8.0f, 0.0f), auraMarkdownTheme.baseTextColor, C1822Arm.A00(null, auraMarkdownTheme.baseTextStyle, null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, auraMarkdownTheme.paragraphLineHeight), null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                        InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                        int iA0D2 = AnonymousClass001.A0D(bbi);
                        AKQ akqA043 = BBI.A04(bbi);
                        BRg bRgA013 = AxM.A01(bfm, bs0);
                        AnonymousClass005.A0n(bfm, bbi, function0);
                        BPg.A02(bfm, interfaceC1380AiAA003, g0vA0v);
                        BPg.A02(bfm, akqA043, g0v);
                        AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D2);
                        BPg.A02(bfm, bRgA013, g0vA0u);
                        AuraMarkdownKt.AuraMarkdownBlocks(listItem.children, auraMarkdownTheme, bfm, iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
                        AnonymousClass002.A0y(bbi);
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
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda3
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BlockRenderersKt.ListBlockShared(ahd, auraMarkdownTheme, g0u, (BFM) obj, AnonymousClass011.A00(i));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit ListBlockShared$lambda$1(AHD ahd, AuraMarkdownTheme auraMarkdownTheme, G0U g0u, int i, BFM bfm, int i2) {
        ListBlockShared(ahd, auraMarkdownTheme, g0u, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final void OrderedListBlock(final AuraBlock.OrderedList orderedList, final AuraMarkdownTheme auraMarkdownTheme, BFM bfm, final int i) {
        AnonymousClass003.A0u(orderedList, auraMarkdownTheme);
        bfm.AgG(-781639825);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, orderedList) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, auraMarkdownTheme);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            AHD<ListItem> ahd = orderedList.items;
            boolean zA67 = bfm.A67(orderedList);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda1
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return BlockRenderersKt.OrderedListBlock$lambda$0$0(orderedList, AnonymousClass001.A0F(obj));
                    }
                };
                BBI.A0T(bfm, objAaT);
            }
            ListBlockShared(ahd, auraMarkdownTheme, (G0U) objAaT, bfm, iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    AuraBlock.OrderedList orderedList2 = orderedList;
                    AuraMarkdownTheme auraMarkdownTheme2 = auraMarkdownTheme;
                    int i2 = i;
                    AnonymousClass001.A0F(obj2);
                    BlockRenderersKt.OrderedListBlock(orderedList2, auraMarkdownTheme2, (BFM) obj, AnonymousClass011.A00(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit OrderedListBlock$lambda$1(AuraBlock.OrderedList orderedList, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        OrderedListBlock(orderedList, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit ParagraphBlock$lambda$0(AuraBlock.Paragraph paragraph, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        ParagraphBlock(paragraph, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit ParagraphBlock$lambda$1(AuraBlock.Paragraph paragraph, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        ParagraphBlock(paragraph, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit ParagraphBlock$lambda$9(AuraBlock.Paragraph paragraph, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        ParagraphBlock(paragraph, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit TableBlockBlock$lambda$0(AuraBlock.Table table, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        TableBlockBlock(table, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit TableBlockBlock$lambda$2(AuraBlock.Table table, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        TableBlockBlock(table, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    /* renamed from: TableRow-FNF3uiM, reason: not valid java name */
    public static final void m1419TableRowFNF3uiM(final AHD<TableCell> ahd, final AuraMarkdownTheme auraMarkdownTheme, final long j, final boolean z, BFM bfm, final int i) {
        bfm.AgG(1617299073);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, ahd) | i : i;
        AuraMarkdownTheme auraMarkdownThemeM1369copy5wRo7Uk$default = auraMarkdownTheme;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, auraMarkdownTheme);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            BS0 bs0 = BRg.A00;
            C1DM c1dm = C1OM.A00;
            BRg bRgA03 = C1b8.A03(bs0, c1dm, j);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A05, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -1828155364);
                int i2 = 0;
                while (itA0w.hasNext()) {
                    Object next = itA0w.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        TableCell tableCell = (TableCell) next;
                        if (i2 > 0) {
                            bfm.AgE(-1845054965);
                            C3Ue.A04(C1b8.A03(C10G.A04(C10G.A08(bs0, 1.0f), 32.0f), c1dm, auraMarkdownTheme.tableBorderColor), bfm, 0);
                        } else {
                            bfm.AgE(-1844854116);
                        }
                        BBI.A0R(bbi, false);
                        BRg bRgA08 = C10G.A08(C3U4.A09(bs0, auraMarkdownTheme.tableCellPadding), 120.0f);
                        InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                        int iA0D = AnonymousClass001.A0D(bbi);
                        AKQ akqA042 = BBI.A04(bbi);
                        BRg bRgA012 = AxM.A01(bfm, bRgA08);
                        AnonymousClass005.A0n(bfm, bbi, function0);
                        BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
                        BPg.A02(bfm, akqA042, g0v);
                        AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                        BPg.A02(bfm, bRgA012, g0vA0u);
                        AHD<AuraBlock> ahd2 = tableCell.children;
                        if (z) {
                            auraMarkdownThemeM1369copy5wRo7Uk$default = AuraMarkdownTheme.m1369copy5wRo7Uk$default(auraMarkdownTheme, C1822Arm.A00(null, auraMarkdownTheme.baseTextStyle, null, null, C1736ApY.A01, null, null, null, null, null, 0, 0, 0, 16777211, 0L, 0L, 0L, 0L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, null, null, null, null, null, null, 0.0f, 0.0f, null, 0.0f, 0.0f, 0.0f, 0.0f, null, 0.0f, 0.0f, 0.0f, 0.0f, 0L, false, 0.0f, null, null, 0.0f, 0.0f, -2, 15, null);
                        }
                        AuraMarkdownKt.AuraMarkdownBlocks(ahd2, auraMarkdownThemeM1369copy5wRo7Uk$default, bfm, 0);
                        BBI.A0R(bbi, true);
                        auraMarkdownThemeM1369copy5wRo7Uk$default = auraMarkdownTheme;
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
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda15
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BlockRenderersKt.m1419TableRowFNF3uiM(ahd, auraMarkdownTheme, j, z, (BFM) obj, AnonymousClass011.A02(obj2, i));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit TableRow_FNF3uiM$lambda$1(AHD ahd, AuraMarkdownTheme auraMarkdownTheme, long j, boolean z, int i, BFM bfm, int i2) {
        m1419TableRowFNF3uiM(ahd, auraMarkdownTheme, j, z, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit ThematicBreakBlock$lambda$0(AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        ThematicBreakBlock(auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final void UnorderedListBlock(final AuraBlock.UnorderedList unorderedList, final AuraMarkdownTheme auraMarkdownTheme, BFM bfm, final int i) {
        AnonymousClass003.A0u(unorderedList, auraMarkdownTheme);
        bfm.AgG(117016207);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, unorderedList) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, auraMarkdownTheme);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            AHD<ListItem> ahd = unorderedList.items;
            int i2 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean z = i2 == 32;
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda16
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return auraMarkdownTheme.bulletGlyph;
                    }
                };
                BBI.A0T(bfm, objAaT);
            }
            ListBlockShared(ahd, auraMarkdownTheme, (G0U) objAaT, bfm, i2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda17
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    AuraBlock.UnorderedList unorderedList2 = unorderedList;
                    AuraMarkdownTheme auraMarkdownTheme2 = auraMarkdownTheme;
                    int i3 = i;
                    AnonymousClass001.A0F(obj2);
                    BlockRenderersKt.UnorderedListBlock(unorderedList2, auraMarkdownTheme2, (BFM) obj, AnonymousClass011.A00(i3));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit UnorderedListBlock$lambda$1(AuraBlock.UnorderedList unorderedList, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        UnorderedListBlock(unorderedList, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final BO6<String, C14P> rememberInlineContent(AHD<InlineMathEntity> ahd, AHD<AuraMarkdownInlineEntitySlot> ahd2, BO6<String, AuraMarkdownInlineEntityHandler> bo6, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, int i) {
        bfm.AgE(1438973371);
        BO6<String, C14P> bo6RememberInlineMathContent = rememberInlineMathContent(ahd, auraMarkdownTheme, bfm, InlineMathEntity.$stable | (i & 14) | ((i >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
        int i2 = i >> 3;
        BO6<String, C14P> bo6RememberInlineEntityLeadingContent = rememberInlineEntityLeadingContent(ahd2, bo6, bfm, AuraMarkdownInlineEntitySlot.$stable | (i2 & 14) | (i2 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
        if (bo6RememberInlineEntityLeadingContent.isEmpty()) {
            AnonymousClass002.A19(bfm);
            return bo6RememberInlineMathContent;
        }
        if (bo6RememberInlineMathContent.isEmpty()) {
            AnonymousClass002.A19(bfm);
            return bo6RememberInlineEntityLeadingContent;
        }
        boolean zA1K = AnonymousClass003.A1K(bfm, bo6RememberInlineMathContent, bo6RememberInlineEntityLeadingContent);
        Object objAaT = bfm.AaT();
        if (zA1K || objAaT == C78N.A00) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(bo6RememberInlineMathContent);
            linkedHashMap.putAll(bo6RememberInlineEntityLeadingContent);
            objAaT = AGI.A08(linkedHashMap);
            bfm.Ai0(objAaT);
        }
        BO6<String, C14P> bo62 = (BO6) objAaT;
        AnonymousClass002.A19(bfm);
        return bo62;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.BO6] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.AJp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BO6<java.lang.String, X.C14P> rememberInlineEntityLeadingContent(X.AHD<com.facebook.aura.markdown.render.AuraMarkdownInlineEntitySlot> r6, X.BO6<java.lang.String, com.facebook.aura.markdown.render.AuraMarkdownInlineEntityHandler> r7, X.BFM r8, int r9) {
        /*
            r0 = 1588079519(0x5ea82b9f, float:6.058977E18)
            r8.AgE(r0)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L12
            X.AJg r2 = X.C0953AJg.A03
        Le:
            X.AnonymousClass002.A19(r8)
            return r2
        L12:
            r0 = r9 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L1f
            boolean r0 = r8.A65(r6)
            if (r0 != 0) goto L24
        L1f:
            r1 = r9 & 6
            r0 = 0
            if (r1 != r2) goto L25
        L24:
            r0 = 1
        L25:
            java.lang.Object r4 = r8.AaT()
            if (r0 != 0) goto L2f
            java.lang.Object r0 = X.C78N.A00
            if (r4 != r0) goto L53
        L2f:
            java.util.LinkedHashMap r4 = X.C3cG.A0j()
            java.util.Iterator r2 = r6.iterator()
        L37:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.markdown.render.AuraMarkdownInlineEntitySlot r0 = (com.facebook.aura.markdown.render.AuraMarkdownInlineEntitySlot) r0
            java.lang.String r0 = r0.inlineName
            java.lang.Object r0 = X.C60R.A0Z(r0, r4)
            java.util.List r0 = (java.util.List) r0
            r0.add(r1)
            goto L37
        L50:
            r8.Ai0(r4)
        L53:
            java.util.Map r4 = (java.util.Map) r4
            r0 = 1431039816(0x554bef48, float:1.40142853E13)
            r8.AgE(r0)
            int r0 = r4.size()
            java.util.ArrayList r3 = X.C60O.A11(r0)
            java.util.Iterator r6 = X.AnonymousClass002.A0n(r4)
        L67:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lce
            java.util.Map$Entry r0 = X.C3cH.A0l(r6)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r5 = r0.getValue()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = 1276490269(0x4c15b21d, float:3.9241844E7)
            r8.Ag8(r0, r1)
            java.lang.Object r1 = r7.get(r1)
            com.facebook.aura.markdown.render.AuraMarkdownInlineEntityHandler r1 = (com.facebook.aura.markdown.render.AuraMarkdownInlineEntityHandler) r1
            r0 = 0
            if (r1 == 0) goto Lcc
            X.G0W<X.AHD<com.facebook.aura.markdown.render.AuraMarkdownInlineEntitySlot>, X.BFM, java.lang.Integer, X.BO6<java.lang.String, X.14P>> r4 = r1.leadingContent
        L8c:
            boolean r1 = r8.A65(r5)
            java.lang.Object r2 = r8.AaT()
            if (r1 != 0) goto L9a
            java.lang.Object r1 = X.C78N.A00
            if (r2 != r1) goto La1
        L9a:
            X.AHD r2 = X.AGI.A07(r5)
            r8.Ai0(r2)
        La1:
            if (r4 != 0) goto Lbb
            r1 = 916658092(0x36a317ac, float:4.8605343E-6)
            r8.AgE(r1)
        La9:
            r2 = r8
            X.BBI r2 = (X.BBI) r2
            r1 = 0
            X.BBI.A0R(r2, r1)
            if (r0 != 0) goto Lb4
            X.AJg r0 = X.C0953AJg.A03
        Lb4:
            X.BBI.A0R(r2, r1)
            r3.add(r0)
            goto L67
        Lbb:
            r0 = 1276495605(0x4c15c6f5, float:3.9263188E7)
            r8.AgE(r0)
            int r0 = com.facebook.aura.markdown.render.AuraMarkdownInlineEntitySlot.$stable
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.invoke(r2, r8, r0)
            goto La9
        Lcc:
            r4 = r0
            goto L8c
        Lce:
            X.AnonymousClass002.A19(r8)
            boolean r0 = r8.A65(r3)
            java.lang.Object r2 = r8.AaT()
            if (r0 != 0) goto Ldf
            java.lang.Object r0 = X.C78N.A00
            if (r2 != r0) goto L101
        Ldf:
            java.lang.Object r2 = X.AbstractC0878AGe.A0K(r3)
            X.BO6 r2 = (X.BO6) r2
            if (r2 != 0) goto Lfe
            X.AJg r2 = X.C0953AJg.A03
            java.util.Iterator r1 = r3.iterator()
        Led:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lfe
            java.lang.Object r0 = r1.next()
            java.util.Map r0 = (java.util.Map) r0
            X.AJp r2 = r2.AYm(r0)
            goto Led
        Lfe:
            r8.Ai0(r2)
        L101:
            X.BO6 r2 = (X.BO6) r2
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.block.BlockRenderersKt.rememberInlineEntityLeadingContent(X.AHD, X.BO6, X.BFM, int):X.BO6");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BO6<java.lang.String, X.C14P> rememberInlineMathContent(X.AHD<com.facebook.aura.markdown.render.inline.InlineMathEntity> r14, final com.facebook.aura.markdown.render.AuraMarkdownTheme r15, X.BFM r16, int r17) {
        /*
            r0 = -60110885(0xfffffffffc6ac7db, float:-4.876204E36)
            r5 = r16
            r5.AgE(r0)
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L14
            X.AJg r1 = X.C0953AJg.A03
        L10:
            X.AnonymousClass002.A19(r5)
            return r1
        L14:
            X.AKH<X.G2j<X.AHD<com.facebook.aura.markdown.render.inline.InlineMathEntity>, X.B6A, X.BFM, java.lang.Integer, X.BO6<java.lang.String, X.14P>>> r0 = com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownInlineMathContentBuilder
            r4 = r5
            X.BBI r4 = (X.BBI) r4
            java.lang.Object r3 = X.AKO.A07(r0, r4)
            X.G2j r3 = (X.G2j) r3
            r6 = r15
            if (r3 == 0) goto L42
            r0 = 238287820(0xe33fbcc, float:2.218469E-30)
            r5.AgE(r0)
            long r0 = r15.baseTextColor
            X.B6A r2 = X.C60P.A04(r0)
            int r1 = com.facebook.aura.markdown.render.inline.InlineMathEntity.$stable
            r0 = r17 & 14
            r0 = r0 | r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r3.invoke(r14, r2, r5, r0)
            X.BO6 r1 = (X.BO6) r1
            r0 = 0
            X.BBI.A0R(r4, r0)
            goto L10
        L42:
            r0 = 238344519(0xe34d947, float:2.2291328E-30)
            r5.AgE(r0)
            r3 = 0
            X.BBI.A0R(r4, r3)
            X.AKH<X.G2j<com.facebook.aura.markdown.parser.custom.extensions.InlineMathPayload, com.facebook.aura.markdown.render.AuraMarkdownTheme, X.BFM, java.lang.Integer, kotlin.Unit>> r0 = com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownInlineMathRenderer
            java.lang.Object r2 = X.AKO.A07(r0, r4)
            X.G2j r2 = (X.G2j) r2
            r0 = r17 & 14
            r0 = r0 ^ 6
            r8 = 0
            r7 = 4
            if (r0 <= r7) goto L62
            boolean r0 = r5.A65(r14)
            if (r0 != 0) goto L67
        L62:
            r1 = r17 & 6
            r0 = 0
            if (r1 != r7) goto L68
        L67:
            r0 = 1
        L68:
            boolean r7 = X.AnonymousClass001.A1R(r5, r2, r0)
            r0 = r17 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L7a
            boolean r0 = r5.A65(r15)
            if (r0 != 0) goto L7e
        L7a:
            r0 = r17 & 48
            if (r0 != r1) goto L7f
        L7e:
            r8 = 1
        L7f:
            r7 = r7 | r8
            java.lang.Object r1 = r5.AaT()
            if (r7 != 0) goto L8a
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto Le9
        L8a:
            int r0 = X.AnonymousClass005.A0C(r14)
            java.util.LinkedHashMap r7 = X.C60O.A15(r0)
            java.util.Iterator r11 = r14.iterator()
        L96:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Le2
            java.lang.Object r9 = r11.next()
            com.facebook.aura.markdown.render.inline.InlineMathEntity r9 = (com.facebook.aura.markdown.render.inline.InlineMathEntity) r9
            java.lang.String r0 = r9.expression
            int r0 = r0.length()
            float r8 = (float) r0
            r0 = 1060320051(0x3f333333, float:0.7)
            float r8 = r8 * r0
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = 1106247680(0x41f00000, float:30.0)
            float r10 = X.ATD.A03(r8, r1, r0)
            java.lang.String r8 = r9.key
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            long r13 = X.C19U.A04(r0, r10)
            r10 = 1069547520(0x3fc00000, float:1.5)
            long r15 = X.C19U.A04(r0, r10)
            r17 = 4
            X.Arl r12 = new X.Arl
            r12.<init>(r13, r15, r17)
            com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda0 r1 = new com.facebook.aura.markdown.render.block.BlockRenderersKt$$ExternalSyntheticLambda0
            r1.<init>()
            r0 = 1689825443(0x64b8b0a3, float:2.7255431E22)
            X.B1U r1 = X.B1U.A02(r1, r0)
            X.14P r0 = new X.14P
            r0.<init>(r12, r1)
            r7.put(r8, r0)
            goto L96
        Le2:
            X.BO6 r1 = X.AGI.A08(r7)
            r5.Ai0(r1)
        Le9:
            X.BO6 r1 = (X.BO6) r1
            X.BBI.A0R(r4, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.block.BlockRenderersKt.rememberInlineMathContent(X.AHD, com.facebook.aura.markdown.render.AuraMarkdownTheme, X.BFM, int):X.BO6");
    }
}
