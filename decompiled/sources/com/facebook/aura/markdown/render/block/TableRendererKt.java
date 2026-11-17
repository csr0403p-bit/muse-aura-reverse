package com.facebook.aura.markdown.render.block;

import X.ADq;
import X.AEk;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AKO;
import X.AKQ;
import X.AT3;
import X.AbstractC0878AGe;
import X.AcQ;
import X.Akx;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C0881AGi;
import X.C0A8;
import X.C10G;
import X.C1251Afj;
import X.C1515AkP;
import X.C1733ApU;
import X.C1822Arm;
import X.C1958Aux;
import X.C1DG;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HtJ;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.ast.TableCell;
import com.facebook.aura.markdown.parser.custom.extensions.InlineMathPayload;
import com.facebook.aura.markdown.render.AuraDottedUnderline;
import com.facebook.aura.markdown.render.AuraDottedUnderlineKt;
import com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntity;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntityHandler;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntityRange;
import com.facebook.aura.markdown.render.AuraMarkdownTheme;
import com.facebook.aura.markdown.render.inline.InlineRenderResult;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class TableRendererKt {
    public static final float BORDER_WIDTH = 1.0f;
    public static final float CELL_PADDING = 8.0f;
    public static final float COLUMN_MAX_WIDTH = 180.0f;
    public static final int DP_PER_CHAR = 10;
    public static final float HEADER_BORDER_WIDTH = 2.0f;
    public static final TableRendererKt$HorizontalNestedScrollConnection$1 HorizontalNestedScrollConnection = new Akx() { // from class: com.facebook.aura.markdown.render.block.TableRendererKt$HorizontalNestedScrollConnection$1
        @Override // X.Akx
        /* renamed from: onPostScroll-DzOQY0M */
        public long mo4onPostScrollDzOQY0M(long j, long j2, int i) {
            return C8j3.A0V(AnonymousClass002.A0F(), C8j3.A0P(AnonymousClass001.A00(j2)) << 32);
        }

        @Override // X.Akx
        /* renamed from: onPreScroll-OzD1aCk */
        public /* bridge */ long mo6onPreScrollOzD1aCk(long j, int i) {
            return 0L;
        }

        @Override // X.Akx
        /* renamed from: onPostFling-RZ2iAVY */
        public Object mo3onPostFlingRZ2iAVY(long j, long j2, HtJ<? super C1251Afj> htJ) {
            return new C1251Afj(AnonymousClass005.A0J(AnonymousClass003.A03(j2), 0.0f));
        }

        @Override // X.Akx
        /* renamed from: onPreFling-QWom1Mo */
        public /* bridge */ Object mo5onPreFlingQWom1Mo(long j, HtJ<? super C1251Afj> htJ) {
            return AnonymousClass006.A0a();
        }
    };
    public static final int MATH_DP_PER_CHAR = 12;
    public static final float MIN_COLUMN_WIDTH = 60.0f;

    public static final Unit TableCellText_uDo3WH8$lambda$4$0(AuraDottedUnderline auraDottedUnderline, C1958Aux c1958Aux) {
        C7384Etj.A0Y(c1958Aux, 1);
        auraDottedUnderline.layoutResult = c1958Aux;
        return Unit.INSTANCE;
    }

    public static final Unit TableRenderer$lambda$8$0$1$0(FlatCell flatCell, long j, boolean z, AT3 at3) {
        C7384Etj.A0Y(at3, 3);
        m1424drawCellBorders9LQNqLg(at3, flatCell.rowIndex, j, z);
        return Unit.INSTANCE;
    }

    /* renamed from: drawCellBorders-9LQNqLg, reason: not valid java name */
    public static final void m1424drawCellBorders9LQNqLg(AT3 at3, int i, long j, boolean z) {
        long j2;
        long jA0K;
        float fAh4;
        if (i == 0) {
            if (!z) {
                return;
            }
            fAh4 = at3.Ah4(HEADER_BORDER_WIDTH);
            long jAKb = at3.AKb();
            float fA01 = AnonymousClass001.A01(jAKb, 4294967295L) - (fAh4 / 2.0f);
            long jA0P = C8j3.A0P(0.0f);
            long jA0P2 = C8j3.A0P(fA01) & 4294967295L;
            j2 = (jA0P << 32) | jA0P2;
            jA0K = jA0P2 | C8j4.A0K(AnonymousClass001.A00(jAKb));
        } else {
            if (z && i == 1) {
                return;
            }
            long jA0P3 = C8j3.A0P(0.0f);
            long j3 = jA0P3 << 32;
            long j4 = jA0P3 & 4294967295L;
            j2 = j3 | j4;
            jA0K = j4 | C8j4.A0K(AnonymousClass001.A00(at3.AKb()));
            fAh4 = at3.Ah4(i == 1 ? HEADER_BORDER_WIDTH : BORDER_WIDTH);
        }
        at3.A9X(null, null, fAh4, 1.0f, 0, 3, j, j2, jA0K);
    }

    /* renamed from: TableCellText-uDo3WH8, reason: not valid java name */
    public static final void m1423TableCellTextuDo3WH8(final InlineRenderResult inlineRenderResult, final BO6<String, AuraMarkdownInlineEntityHandler> bo6, final C1822Arm c1822Arm, final long j, BRg bRg, BFM bfm, final int i, final int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        BRg bRg2 = bRg;
        bfm.AgG(2057421942);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(inlineRenderResult, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bo6);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, c1822Arm);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0P(bfm, j);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (inlineRenderResult.inlineEntityRanges.isEmpty()) {
                bfm.AgE(-820959743);
                AuraTextKt.m2640AuraTextVmYn7U0(inlineRenderResult.annotated, bRg2, j, c1822Arm, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, ((iA05 >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA05 >> 3) & 896) | ((iA05 << 3) & 7168), 0, 32752);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc == null) {
                    return;
                }
                final BRg bRg3 = bRg2;
                g0v = new G0V() { // from class: com.facebook.aura.markdown.render.block.TableRendererKt$$ExternalSyntheticLambda5
                    @Override // X.G0V
                    public final Object invoke(Object obj, Object obj2) {
                        InlineRenderResult inlineRenderResult2 = inlineRenderResult;
                        BO6 bo62 = bo6;
                        C1822Arm c1822Arm2 = c1822Arm;
                        long j2 = j;
                        BRg bRg4 = bRg3;
                        int i4 = i;
                        TableRendererKt.m1423TableCellTextuDo3WH8(inlineRenderResult2, bo62, c1822Arm2, j2, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                        return Unit.INSTANCE;
                    }
                };
            } else {
                bfm.AgE(-820856916);
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                boolean zA65 = bfm.A65(inlineRenderResult.inlineEntityRanges) | AnonymousClass003.A1C(iA05);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    AHD<AuraMarkdownInlineEntityRange> ahd = inlineRenderResult.inlineEntityRanges;
                    ArrayList<AuraMarkdownInlineEntityRange> arrayListA0h = C3cG.A0h();
                    for (Object obj : ahd) {
                        AuraMarkdownInlineEntityHandler auraMarkdownInlineEntityHandler = bo6.get(((AuraMarkdownInlineEntityRange) obj).inlineName);
                        if (auraMarkdownInlineEntityHandler != null && auraMarkdownInlineEntityHandler.tableClicksEnabled && auraMarkdownInlineEntityHandler.onClick != null && auraMarkdownInlineEntityHandler.addDottedUnderline) {
                            arrayListA0h.add(obj);
                        }
                    }
                    ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
                    for (AuraMarkdownInlineEntityRange auraMarkdownInlineEntityRange : arrayListA0h) {
                        C1733ApU.A00("", arrayListA0i, auraMarkdownInlineEntityRange.start, auraMarkdownInlineEntityRange.end);
                    }
                    objAaT = AGI.A07(arrayListA0i);
                    bfm.Ai0(objAaT);
                }
                AHD ahd2 = (AHD) objAaT;
                if (ahd2.isEmpty()) {
                    bfm.AgE(-820345695);
                    AuraTextKt.m2640AuraTextVmYn7U0(inlineRenderResult.annotated, bRg2, j, c1822Arm, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, ((iA05 >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA05 >> 3) & 896) | ((iA05 << 3) & 7168), 0, 32752);
                    bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                    if (bBbAAc == null) {
                        return;
                    }
                    final BRg bRg4 = bRg2;
                    g0v = new G0V() { // from class: com.facebook.aura.markdown.render.block.TableRendererKt$$ExternalSyntheticLambda6
                        @Override // X.G0V
                        public final Object invoke(Object obj2, Object obj3) {
                            InlineRenderResult inlineRenderResult2 = inlineRenderResult;
                            BO6 bo62 = bo6;
                            C1822Arm c1822Arm2 = c1822Arm;
                            long j2 = j;
                            BRg bRg5 = bRg4;
                            int i4 = i;
                            TableRendererKt.m1423TableCellTextuDo3WH8(inlineRenderResult2, bo62, c1822Arm2, j2, bRg5, (BFM) obj2, AnonymousClass011.A02(obj3, i4), i2);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    bfm.AgE(-820242868);
                    BBI.A0R(bbi, false);
                    Object objAaT2 = bfm.AaT();
                    Object obj2 = C78N.A00;
                    if (objAaT2 == obj2) {
                        float f = 0.0f;
                        objAaT2 = new AuraDottedUnderline(f, f, f, f, 15, null);
                        BBI.A0O(bbi, objAaT2);
                    }
                    final AuraDottedUnderline auraDottedUnderline = (AuraDottedUnderline) objAaT2;
                    ApQ apQ = inlineRenderResult.annotated;
                    BRg bRgM1360drawDottedUnderlines9LQNqLg = AuraDottedUnderlineKt.m1360drawDottedUnderlines9LQNqLg(bRg2, auraDottedUnderline, j, ahd2);
                    boolean zA67 = bfm.A67(auraDottedUnderline);
                    Object objAaT3 = bfm.AaT();
                    if (zA67 || objAaT3 == obj2) {
                        objAaT3 = new G0U() { // from class: com.facebook.aura.markdown.render.block.TableRendererKt$$ExternalSyntheticLambda7
                            @Override // X.G0U
                            public final Object invoke(Object obj3) {
                                return TableRendererKt.TableCellText_uDo3WH8$lambda$4$0(auraDottedUnderline, (C1958Aux) obj3);
                            }
                        };
                        BBI.A0O(bbi, objAaT3);
                    }
                    AuraTextKt.m2640AuraTextVmYn7U0(apQ, bRgM1360drawDottedUnderlines9LQNqLg, j, c1822Arm, null, null, null, 0L, false, 0, 0, 0, (G0U) objAaT3, null, null, bfm, ((iA05 >> 3) & 896) | ((iA05 << 3) & 7168), 0, 28656);
                }
            }
            bBbAAc.A06 = g0v;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg5 = bRg2;
            g0v = new G0V() { // from class: com.facebook.aura.markdown.render.block.TableRendererKt$$ExternalSyntheticLambda8
                @Override // X.G0V
                public final Object invoke(Object obj3, Object obj4) {
                    InlineRenderResult inlineRenderResult2 = inlineRenderResult;
                    BO6 bo62 = bo6;
                    C1822Arm c1822Arm2 = c1822Arm;
                    long j2 = j;
                    BRg bRg6 = bRg5;
                    int i4 = i;
                    TableRendererKt.m1423TableCellTextuDo3WH8(inlineRenderResult2, bo62, c1822Arm2, j2, bRg6, (BFM) obj3, AnonymousClass011.A02(obj4, i4), i2);
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v;
        }
    }

    public static final FlatCell emptyFlatCell(int i, int i2, boolean z) {
        return new FlatCell(i, i2, z, "", AHI.A01, null);
    }

    public static final List<FlatCell> flattenCells(AuraBlock.Table table, int i, int i2, BO6<String, AuraMarkdownInlineEntityHandler> bo6) {
        if (i2 <= 0) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        boolean zIsEmpty = table.header.isEmpty();
        int i3 = !zIsEmpty ? 1 : 0;
        if (!zIsEmpty) {
            for (int i4 = 0; i4 < i; i4++) {
                TableCell tableCell = (TableCell) AbstractC0878AGe.A0A(i4, table.header);
                arrayListA0h.add(tableCell != null ? toFlatCell(tableCell, 0, i4, true, bo6) : emptyFlatCell(0, i4, true));
            }
            i2--;
            if (i2 <= 0) {
                return arrayListA0h;
            }
        }
        int iMin = Math.min(i2, table.rows.size());
        for (int i5 = 0; i5 < iMin; i5++) {
            List list = (List) table.rows.get(i5);
            int i6 = i5 + i3;
            for (int i7 = 0; i7 < i; i7++) {
                TableCell tableCell2 = (TableCell) AbstractC0878AGe.A0A(i7, list);
                arrayListA0h.add(tableCell2 != null ? toFlatCell(tableCell2, i6, i7, false, bo6) : emptyFlatCell(i6, i7, false));
            }
        }
        return arrayListA0h;
    }

    public static final void flattenToPlainText$walk(StringBuilder sb, BO6<String, AuraMarkdownInlineEntityHandler> bo6, AuraInline auraInline) {
        G0U<AuraInline.Custom, AuraMarkdownInlineEntity> g0u;
        AuraMarkdownInlineEntity auraMarkdownInlineEntityInvoke;
        String str;
        if (auraInline instanceof AuraInline.Text) {
            str = ((AuraInline.Text) auraInline).text;
        } else {
            if (auraInline instanceof AuraInline.Emphasis) {
                Iterator it = ((AuraInline.Emphasis) auraInline).children.iterator();
                while (it.hasNext()) {
                    flattenToPlainText$walk(sb, bo6, C8j4.A0j(it));
                }
                return;
            }
            if (auraInline instanceof AuraInline.Strong) {
                Iterator it2 = ((AuraInline.Strong) auraInline).children.iterator();
                while (it2.hasNext()) {
                    flattenToPlainText$walk(sb, bo6, C8j4.A0j(it2));
                }
                return;
            }
            if (auraInline instanceof AuraInline.Strikethrough) {
                Iterator it3 = ((AuraInline.Strikethrough) auraInline).children.iterator();
                while (it3.hasNext()) {
                    flattenToPlainText$walk(sb, bo6, C8j4.A0j(it3));
                }
                return;
            }
            if (auraInline instanceof AuraInline.InlineCode) {
                str = ((AuraInline.InlineCode) auraInline).code;
            } else {
                if (auraInline instanceof AuraInline.Link) {
                    Iterator it4 = ((AuraInline.Link) auraInline).children.iterator();
                    while (it4.hasNext()) {
                        flattenToPlainText$walk(sb, bo6, C8j4.A0j(it4));
                    }
                    return;
                }
                if (auraInline instanceof AuraInline.AutoLink) {
                    str = ((AuraInline.AutoLink) auraInline).url;
                } else if (auraInline instanceof AuraInline.Image) {
                    str = ((AuraInline.Image) auraInline).alt;
                } else {
                    if (C7384Etj.areEqual(auraInline, AuraInline.LineBreak.INSTANCE) || C7384Etj.areEqual(auraInline, AuraInline.SoftLineBreak.INSTANCE)) {
                        sb.append(' ');
                        return;
                    }
                    if (!(auraInline instanceof AuraInline.Custom)) {
                        throw C3cG.A0q();
                    }
                    AuraMarkdownInlineEntityHandler auraMarkdownInlineEntityHandler = bo6.get(((AuraInline.Custom) auraInline).name);
                    if (auraMarkdownInlineEntityHandler == null || (g0u = auraMarkdownInlineEntityHandler.resolver) == null || (auraMarkdownInlineEntityInvoke = g0u.invoke(auraInline)) == null) {
                        return;
                    } else {
                        str = auraMarkdownInlineEntityInvoke.text;
                    }
                }
            }
        }
        sb.append(str);
    }

    public static final FlatCell toFlatCell(TableCell tableCell, int i, int i2, boolean z, BO6<String, AuraMarkdownInlineEntityHandler> bo6) {
        List list;
        AuraBlock.Paragraph paragraph;
        Object objA0G = AbstractC0878AGe.A0G(tableCell.children);
        if (!(objA0G instanceof AuraBlock.Paragraph) || (paragraph = (AuraBlock.Paragraph) objA0G) == null || (list = paragraph.inlines) == null) {
            list = AHI.A01;
        }
        return new FlatCell(i, i2, z, flattenToPlainText(list, bo6), AGI.A07(list), AbstractC0878AGe.A0M(list));
    }

    public static final Unit TableCellText_uDo3WH8$lambda$0(InlineRenderResult inlineRenderResult, BO6 bo6, C1822Arm c1822Arm, long j, BRg bRg, int i, int i2, BFM bfm, int i3) {
        m1423TableCellTextuDo3WH8(inlineRenderResult, bo6, c1822Arm, j, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit TableCellText_uDo3WH8$lambda$2(InlineRenderResult inlineRenderResult, BO6 bo6, C1822Arm c1822Arm, long j, BRg bRg, int i, int i2, BFM bfm, int i3) {
        m1423TableCellTextuDo3WH8(inlineRenderResult, bo6, c1822Arm, j, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit TableCellText_uDo3WH8$lambda$5(InlineRenderResult inlineRenderResult, BO6 bo6, C1822Arm c1822Arm, long j, BRg bRg, int i, int i2, BFM bfm, int i3) {
        m1423TableCellTextuDo3WH8(inlineRenderResult, bo6, c1822Arm, j, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit TableRenderer$lambda$0(AuraBlock.Table table, AuraMarkdownTheme auraMarkdownTheme, BRg bRg, boolean z, boolean z2, int i, boolean z3, int i2, int i3, BFM bfm, int i4) {
        TableRenderer(table, auraMarkdownTheme, bRg, z, z2, i, z3, bfm, AnonymousClass011.A00(i2), i3);
        return Unit.INSTANCE;
    }

    public static final Unit TableRenderer$lambda$10(AuraBlock.Table table, AuraMarkdownTheme auraMarkdownTheme, BRg bRg, boolean z, boolean z2, int i, boolean z3, int i2, int i3, BFM bfm, int i4) {
        TableRenderer(table, auraMarkdownTheme, bRg, z, z2, i, z3, bfm, AnonymousClass011.A00(i2), i3);
        return Unit.INSTANCE;
    }

    public static final Unit TableRenderer$lambda$2(AuraBlock.Table table, AuraMarkdownTheme auraMarkdownTheme, BRg bRg, boolean z, boolean z2, int i, boolean z3, int i2, int i3, BFM bfm, int i4) {
        TableRenderer(table, auraMarkdownTheme, bRg, z, z2, i, z3, bfm, AnonymousClass011.A00(i2), i3);
        return Unit.INSTANCE;
    }

    public static final String flattenToPlainText(List<? extends AuraInline> list, BO6<String, AuraMarkdownInlineEntityHandler> bo6) {
        StringBuilder sbA0w = C60O.A0w();
        Iterator<? extends AuraInline> it = list.iterator();
        while (it.hasNext()) {
            flattenToPlainText$walk(sbA0w, bo6, C8j4.A0j(it));
        }
        return sbA0w.toString();
    }

    public static final String singleMathExpression(List<? extends AuraInline> list) {
        return AbstractC0878AGe.A0M(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b6  */
    /* JADX WARN: Type inference failed for: r22v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TableRenderer(final com.facebook.aura.markdown.parser.ast.AuraBlock.Table r80, final com.facebook.aura.markdown.render.AuraMarkdownTheme r81, X.BRg r82, boolean r83, boolean r84, int r85, boolean r86, X.BFM r87, final int r88, final int r89) {
        /*
            Method dump skipped, instructions count: 1179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.block.TableRendererKt.TableRenderer(com.facebook.aura.markdown.parser.ast.AuraBlock$Table, com.facebook.aura.markdown.render.AuraMarkdownTheme, X.BRg, boolean, boolean, int, boolean, X.BFM, int, int):void");
    }

    public static final Unit TableRenderer$lambda$8(int i, List list, List list2, boolean z, final long j, final boolean z2, List list3, AuraMarkdownTheme auraMarkdownTheme, AuraMarkdownTheme auraMarkdownTheme2, C1822Arm c1822Arm, BO6 bo6, C1822Arm c1822Arm2, ADq aDq, BRg bRg, BFM bfm, int i2) {
        C7384Etj.A0Y(aDq, 12);
        C7384Etj.A0Y(bRg, 13);
        int i3 = aDq.A00;
        int i4 = aDq.A01;
        if (i3 <= i4) {
            while (true) {
                InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A05, 0);
                BBI bbi = (BBI) bfm;
                int iA02 = C3cG.A02(bbi.A06);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRg);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
                    G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
                    G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
                    G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                    G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                    bfm.AgE(658646719);
                    int i5 = 0;
                    while (i5 < i) {
                        int i6 = (i3 * i) + i5;
                        if (i6 < list.size()) {
                            bfm.AgE(-1056648193);
                            final FlatCell flatCell = (FlatCell) list.get(i6);
                            BRg bRgA0D = BRg.A00;
                            BRg bRgA08 = C10G.A08(bRgA0D, ((C1DG) ((i5 < 0 || i5 >= list2.size()) ? C8j3.A0k(100.0f) : list2.get(i5))).A00);
                            if (z) {
                                bRgA0D = C10G.A0D(bRgA0D, Float.NaN, COLUMN_MAX_WIDTH);
                            }
                            BRg bRgThen = bRgA08.then(bRgA0D);
                            boolean zA1U = AnonymousClass001.A1U(bfm, z2, bfm.A67(flatCell) | bfm.A64(j));
                            Object objAaT = bfm.AaT();
                            if (zA1U || objAaT == C78N.A00) {
                                objAaT = new G0U() { // from class: com.facebook.aura.markdown.render.block.TableRendererKt$$ExternalSyntheticLambda4
                                    @Override // X.G0U
                                    public final Object invoke(Object obj) {
                                        return TableRendererKt.TableRenderer$lambda$8$0$1$0(flatCell, j, z2, (AT3) obj);
                                    }
                                };
                                BBI.A0O(bbi, objAaT);
                            }
                            BRg bRgA09 = C3U4.A09(AEk.A01(bRgThen, (G0U) objAaT), CELL_PADDING);
                            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                            int iA0D = AnonymousClass001.A0D(bbi);
                            AKQ akqA042 = BBI.A04(bbi);
                            BRg bRgA012 = AxM.A01(bfm, bRgA09);
                            AnonymousClass005.A0n(bfm, bbi, function0);
                            BPg.A02(bfm, interfaceC1380AiAA0c, g0vA0v);
                            BPg.A02(bfm, akqA042, g0v);
                            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                            BPg.A02(bfm, bRgA012, g0vA0u);
                            String str = flatCell.mathExpression;
                            InlineRenderResult inlineRenderResult = (InlineRenderResult) AbstractC0878AGe.A0A(i6, list3);
                            G2j g2j = (G2j) AKO.A07(AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownInlineMathRenderer, bbi);
                            if (str != null) {
                                if (g2j != null) {
                                    bfm.AgE(1100408661);
                                    AnonymousClass001.A1F(new InlineMathPayload(str), auraMarkdownTheme, bfm, g2j, 0);
                                } else {
                                    bfm.AgE(1100565304);
                                    AuraTextKt.m2639AuraTextUY9GdpU(str, null, auraMarkdownTheme2.baseTextColor, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                                }
                            } else if (inlineRenderResult != null) {
                                bfm.AgE(1100782862);
                                C1822Arm c1822Arm3 = c1822Arm;
                                if (flatCell.isHeader) {
                                    c1822Arm3 = c1822Arm2;
                                }
                                m1423TableCellTextuDo3WH8(inlineRenderResult, bo6, c1822Arm3, auraMarkdownTheme2.baseTextColor, null, bfm, InlineRenderResult.$stable, 16);
                            } else {
                                bfm.AgE(1101119181);
                                AuraTextKt.m2640AuraTextVmYn7U0(AnonymousClass005.A0X(""), null, auraMarkdownTheme2.baseTextColor, c1822Arm, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 6, 0, 32754);
                            }
                            AnonymousClass003.A0q(bbi);
                        } else {
                            bfm.AgE(-1054997195);
                        }
                        BBI.A0R(bbi, false);
                        i5++;
                    }
                    AnonymousClass003.A0q(bbi);
                    if (i3 == i4) {
                        break;
                    }
                    i3++;
                } else {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
