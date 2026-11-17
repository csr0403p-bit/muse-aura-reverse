package com.facebook.aura.conversation.view.richcontent;

import X.ADq;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AKQ;
import X.ATD;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
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
import X.BNt;
import X.BRg;
import X.C00x;
import X.C0881AGi;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C3cG;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.ast.TableAlignment;
import com.facebook.aura.markdown.parser.ast.TableCell;
import com.facebook.aura.markdown.parser.custom.extensions.AuraCustomInlineNames;
import com.facebook.aura.markdown.parser.custom.extensions.InlineMathPayload;
import com.facebook.aura.model.HatchTableCellDataModel;
import com.facebook.aura.model.HatchTableParamsModel;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchMarkdownTableCardKt {
    public static final float CORNER_RADIUS = 8.0f;
    public static final float FOOTER_PADDING = 8.0f;
    public static final int MAX_INLINE_ROWS = 10;
    public static final float VERTICAL_PADDING = 12.0f;

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchMarkdownTableCardKt$SeeMoreFooter$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onSeeMoreClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, int i) {
            super(2);
            this.$onSeeMoreClick = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMarkdownTableCardKt.SeeMoreFooter(this.$onSeeMoreClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final AuraBlock.Table toAuraBlockTable(HatchTableParamsModel hatchTableParamsModel) {
        C7384Etj.A0Y(hatchTableParamsModel, 0);
        AuraBlock.Table table = hatchTableParamsModel.parsedTable;
        if (table != null) {
            return table;
        }
        AHD<HatchTableCellDataModel> ahd = hatchTableParamsModel.data;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        for (Object obj : ahd) {
            ((List) C60R.A0Z(Integer.valueOf(((HatchTableCellDataModel) obj).rowIndex), linkedHashMapA0j)).add(obj);
        }
        Number number = (Number) AbstractC0878AGe.A07(linkedHashMapA0j.keySet());
        int iIntValue = number != null ? number.intValue() : -1;
        List list = (List) linkedHashMapA0j.get(0);
        if (list == null) {
            list = C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj2 : list) {
            if (((HatchTableCellDataModel) obj2).isHeader) {
                arrayListA0h.add(obj2);
            }
        }
        List listA0c = AbstractC0878AGe.A0c(arrayListA0h, new Comparator() { // from class: com.facebook.aura.conversation.view.richcontent.HatchMarkdownTableCardKt$toAuraBlockTable$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Integer.valueOf(((HatchTableCellDataModel) t).columnIndex).compareTo(Integer.valueOf(((HatchTableCellDataModel) t2).columnIndex));
            }
        });
        ArrayList arrayListA0m = AnonymousClass002.A0m(listA0c);
        Iterator it = listA0c.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(toTableCell((HatchTableCellDataModel) it.next()));
        }
        AHD ahdA07 = AGI.A07(arrayListA0m);
        ADq aDq = new ADq(1, iIntValue);
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(aDq);
        Iterator<Integer> it2 = aDq.iterator();
        while (it2.hasNext()) {
            Iterable iterable = (Iterable) linkedHashMapA0j.get(Integer.valueOf(((BNt) it2).A00()));
            if (iterable == null) {
                iterable = C0881AGi.A00;
            }
            List listA0c2 = AbstractC0878AGe.A0c(iterable, new Comparator() { // from class: com.facebook.aura.conversation.view.richcontent.HatchMarkdownTableCardKt$toAuraBlockTable$lambda$5$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return Integer.valueOf(((HatchTableCellDataModel) t).columnIndex).compareTo(Integer.valueOf(((HatchTableCellDataModel) t2).columnIndex));
                }
            });
            ArrayList arrayListA0m3 = AnonymousClass002.A0m(listA0c2);
            Iterator it3 = listA0c2.iterator();
            while (it3.hasNext()) {
                arrayListA0m3.add(toTableCell((HatchTableCellDataModel) it3.next()));
            }
            arrayListA0m2.add(AGI.A07(arrayListA0m3));
        }
        AHD ahdA072 = AGI.A07(arrayListA0m2);
        ADq aDqA0C = ATD.A0C(0, hatchTableParamsModel.columnSize);
        ArrayList arrayListA0m4 = AnonymousClass002.A0m(aDqA0C);
        Iterator<Integer> it4 = aDqA0C.iterator();
        while (it4.hasNext()) {
            ((BNt) it4).A00();
            arrayListA0m4.add(TableAlignment.NONE);
        }
        return new AuraBlock.Table(ahdA07, ahdA072, AGI.A07(arrayListA0m4));
    }

    public static final HatchTableParamsModel toHatchTableParamsModel(AuraBlock.Table table) {
        C7384Etj.A0Y(table, 0);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = table.header.iterator();
        int iIntValue = 0;
        int i = 0;
        while (it.hasNext()) {
            arrayListA0h.add(toCellModel((TableCell) it.next(), 0, i, true));
            i++;
        }
        Iterator it2 = table.rows.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            i2++;
            Iterator itA11 = C8j4.A11(it2);
            int i3 = 0;
            while (itA11.hasNext()) {
                arrayListA0h.add(toCellModel((TableCell) itA11.next(), i2, i3, false));
                i3++;
            }
        }
        int size = table.header.size();
        Iterator it3 = table.rows.iterator();
        if (it3.hasNext()) {
            Integer numA0T = C8j5.A0T(it3);
            while (it3.hasNext()) {
                Integer numA0T2 = C8j5.A0T(it3);
                if (numA0T.compareTo(numA0T2) < 0) {
                    numA0T = numA0T2;
                }
            }
            iIntValue = numA0T.intValue();
        }
        int iMax = Math.max(size, iIntValue);
        return new HatchTableParamsModel(AGI.A07(arrayListA0h), C8j3.A0L(table.rows, !table.header.isEmpty() ? 1 : 0), iMax, table);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    /* renamed from: HatchMarkdownTableCard--b7W0Lw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m681HatchMarkdownTableCardb7W0Lw(com.facebook.aura.markdown.parser.ast.AuraBlock.Table r31, com.facebook.aura.markdown.render.AuraMarkdownTheme r32, X.BRg r33, float r34, boolean r35, boolean r36, kotlin.jvm.functions.Function0<kotlin.Unit> r37, X.BFM r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchMarkdownTableCardKt.m681HatchMarkdownTableCardb7W0Lw(com.facebook.aura.markdown.parser.ast.AuraBlock$Table, com.facebook.aura.markdown.render.AuraMarkdownTheme, X.BRg, float, boolean, boolean, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final void flattenToPlainText$walk(StringBuilder sb, AuraInline auraInline) {
        String str;
        if (auraInline instanceof AuraInline.Text) {
            str = ((AuraInline.Text) auraInline).text;
        } else {
            if (auraInline instanceof AuraInline.Emphasis) {
                Iterator it = ((AuraInline.Emphasis) auraInline).children.iterator();
                while (it.hasNext()) {
                    flattenToPlainText$walk(sb, C8j4.A0j(it));
                }
                return;
            }
            if (auraInline instanceof AuraInline.Strong) {
                Iterator it2 = ((AuraInline.Strong) auraInline).children.iterator();
                while (it2.hasNext()) {
                    flattenToPlainText$walk(sb, C8j4.A0j(it2));
                }
                return;
            }
            if (auraInline instanceof AuraInline.Strikethrough) {
                Iterator it3 = ((AuraInline.Strikethrough) auraInline).children.iterator();
                while (it3.hasNext()) {
                    flattenToPlainText$walk(sb, C8j4.A0j(it3));
                }
                return;
            }
            if (auraInline instanceof AuraInline.InlineCode) {
                str = ((AuraInline.InlineCode) auraInline).code;
            } else if (auraInline instanceof AuraInline.Link) {
                Iterator it4 = ((AuraInline.Link) auraInline).children.iterator();
                while (it4.hasNext()) {
                    flattenToPlainText$walk(sb, C8j4.A0j(it4));
                }
                return;
            } else if (auraInline instanceof AuraInline.AutoLink) {
                str = ((AuraInline.AutoLink) auraInline).url;
            } else {
                if (!(auraInline instanceof AuraInline.Image)) {
                    if (C7384Etj.areEqual(auraInline, AuraInline.LineBreak.INSTANCE) || C7384Etj.areEqual(auraInline, AuraInline.SoftLineBreak.INSTANCE)) {
                        sb.append(' ');
                        return;
                    } else {
                        if (!(auraInline instanceof AuraInline.Custom)) {
                            throw C3cG.A0q();
                        }
                        return;
                    }
                }
                str = ((AuraInline.Image) auraInline).alt;
            }
        }
        sb.append(str);
    }

    public static final void logTableSeeMoreClick(Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.TABLE_SEE_MORE_BUTTON, null, map, null);
    }

    public static final HatchTableCellDataModel toCellModel(TableCell tableCell, int i, int i2, boolean z) {
        List list;
        AuraBlock.Paragraph paragraph;
        Object objA0G = AbstractC0878AGe.A0G(tableCell.children);
        if (!(objA0G instanceof AuraBlock.Paragraph) || (paragraph = (AuraBlock.Paragraph) objA0G) == null || (list = paragraph.inlines) == null) {
            list = AHI.A01;
        }
        return new HatchTableCellDataModel(flattenToPlainText(list), i, i2, z, AbstractC0878AGe.A0M(list));
    }

    public static final TableCell toTableCell(HatchTableCellDataModel hatchTableCellDataModel) {
        String str = hatchTableCellDataModel.mathExpression;
        return new TableCell(AGI.A0E(new AuraBlock.Paragraph(AGI.A0E(str != null ? new AuraInline.Custom(AuraCustomInlineNames.MATH, new InlineMathPayload(str)) : new AuraInline.Text(hatchTableCellDataModel.text)))));
    }

    public static final void SeeMoreFooter(Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-1269032993);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            C1062ATq c1062ATq = C10G.A02;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bef);
            AuraLabelButtonStyle auraLabelButtonStyleSecondaryOutlined = AuraButtonStyles.INSTANCE.secondaryOutlined(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
            boolean zA67 = bfm.A67(mapCurrentChatThreadLogMetadata) | ((iA0T & 14) == 4);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchMarkdownTableCardKt$SeeMoreFooter$1$1$1(mapCurrentChatThreadLogMetadata, function0);
                BBI.A0O(bbi, objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStyleSecondaryOutlined, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, i);
        }
    }

    public static final String flattenToPlainText(List<? extends AuraInline> list) {
        StringBuilder sbA0w = C60O.A0w();
        Iterator<? extends AuraInline> it = list.iterator();
        while (it.hasNext()) {
            flattenToPlainText$walk(sbA0w, C8j4.A0j(it));
        }
        return sbA0w.toString();
    }

    public static final String singleMathExpression(List<? extends AuraInline> list) {
        return AbstractC0878AGe.A0M(list);
    }
}
