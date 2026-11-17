package com.facebook.aura.markdown.parser.custom.extensions;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AnonymousClass002;
import X.C06827l3;
import X.C06847l8;
import X.C1Lu;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C8j4;
import X.C8j5;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.ast.ListItem;
import com.facebook.aura.markdown.parser.ast.TableCell;
import com.facebook.aura.markdown.parser.custom.MathPreprocessor;
import com.facebook.aura.markdown.parser.custom.MathToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class MathPlaceholderExtension implements AuraMarkdownExtension {
    public final Map<Integer, MathToken> table;

    public interface Segment {

        public final class BlockMath implements Segment {
            public final String expression;

            public BlockMath(String str) {
                C7384Etj.A0Y(str, 0);
                this.expression = str;
            }

            public final BlockMath copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new BlockMath(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof BlockMath) && C7384Etj.areEqual(this.expression, ((BlockMath) obj).expression));
            }

            public static /* synthetic */ BlockMath copy$default(BlockMath blockMath, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = blockMath.expression;
                }
                C7384Etj.A0Y(str, 0);
                return new BlockMath(str);
            }

            public final String component1() {
                return this.expression;
            }

            public final String getExpression() {
                return this.expression;
            }

            public int hashCode() {
                return this.expression.hashCode();
            }

            public String toString() {
                return C60O.A0r("BlockMath(expression=", this.expression);
            }
        }

        public final class Plain implements Segment {
            public final String text;

            public Plain(String str) {
                C7384Etj.A0Y(str, 0);
                this.text = str;
            }

            public final Plain copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Plain(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Plain) && C7384Etj.areEqual(this.text, ((Plain) obj).text));
            }

            public static /* synthetic */ Plain copy$default(Plain plain, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = plain.text;
                }
                C7384Etj.A0Y(str, 0);
                return new Plain(str);
            }

            public final String component1() {
                return this.text;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return C60O.A0r("Plain(text=", this.text);
            }
        }
    }

    public MathPlaceholderExtension(Map<Integer, MathToken> map) {
        C7384Etj.A0Y(map, 0);
        this.table = map;
    }

    private final List<AuraInline> rewriteText(String str) {
        int i = 0;
        if (C7BY.A0k(str, MathPreprocessor.PLACEHOLDER_OPEN)) {
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator it = C06827l3.A00(str, MathPreprocessor.PLACEHOLDER_REGEX).iterator();
            while (it.hasNext()) {
                C1Lu c1Lu = (C1Lu) it.next();
                MathToken mathToken = this.table.get(Integer.valueOf(Integer.parseInt((String) C8j4.A0q(c1Lu.AG1()))));
                if (mathToken != null) {
                    if (c1Lu.AJM().A00 > i) {
                        arrayListA0h.add(new AuraInline.Text(str.substring(i, c1Lu.AJM().A00)));
                    }
                    arrayListA0h.add(new AuraInline.Custom(AuraCustomInlineNames.MATH, new InlineMathPayload(mathToken.expression)));
                    i = c1Lu.AJM().A01 + 1;
                }
            }
            if (!arrayListA0h.isEmpty()) {
                C8j5.A0n(str, arrayListA0h, i);
                return arrayListA0h;
            }
        }
        return Collections.singletonList(new AuraInline.Text(str));
    }

    @Override // com.facebook.aura.markdown.parser.custom.extensions.AuraMarkdownExtension
    public AuraMarkdownDocument transform(AuraMarkdownDocument auraMarkdownDocument) {
        C7384Etj.A0Y(auraMarkdownDocument, 0);
        AHD<AuraBlock> ahd = auraMarkdownDocument.blocks;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(rewriteBlock(C8j4.A0i(it)), arrayListA0h);
        }
        return AGI.A03(arrayListA0h);
    }

    private final boolean isBlank(AuraInline auraInline) {
        if (auraInline instanceof AuraInline.SoftLineBreak) {
            return true;
        }
        return (auraInline instanceof AuraInline.Text) && C7BY.A0j(((AuraInline.Text) auraInline).text);
    }

    private final List<AuraBlock> rewriteBlock(AuraBlock auraBlock) {
        if (auraBlock instanceof AuraBlock.Paragraph) {
            return rewriteParagraph((AuraBlock.Paragraph) auraBlock);
        }
        if (auraBlock instanceof AuraBlock.Heading) {
            AuraBlock.Heading heading = (AuraBlock.Heading) auraBlock;
            auraBlock = C8j4.A0h(heading.level, rewriteInlines(heading.inlines));
        } else if (auraBlock instanceof AuraBlock.BlockQuote) {
            AHD<AuraBlock> ahd = ((AuraBlock.BlockQuote) auraBlock).children;
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                AbstractC0882AGj.A0r(rewriteBlock(C8j4.A0i(it)), arrayListA0h);
            }
            auraBlock = AGI.A00(arrayListA0h);
        } else if (auraBlock instanceof AuraBlock.UnorderedList) {
            AuraBlock.UnorderedList unorderedList = (AuraBlock.UnorderedList) auraBlock;
            AHD<ListItem> ahd2 = unorderedList.items;
            ArrayList arrayListA0m = AnonymousClass002.A0m(ahd2);
            Iterator it2 = ahd2.iterator();
            while (it2.hasNext()) {
                arrayListA0m.add(rewriteItem((ListItem) it2.next()));
            }
            auraBlock = AGI.A02(unorderedList, arrayListA0m);
        } else if (auraBlock instanceof AuraBlock.OrderedList) {
            AuraBlock.OrderedList orderedList = (AuraBlock.OrderedList) auraBlock;
            AHD<ListItem> ahd3 = orderedList.items;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(ahd3);
            Iterator it3 = ahd3.iterator();
            while (it3.hasNext()) {
                arrayListA0m2.add(rewriteItem((ListItem) it3.next()));
            }
            auraBlock = AGI.A01(orderedList, arrayListA0m2);
        } else if (auraBlock instanceof AuraBlock.Table) {
            AuraBlock.Table table = (AuraBlock.Table) auraBlock;
            AHD<TableCell> ahd4 = table.header;
            ArrayList arrayListA0m3 = AnonymousClass002.A0m(ahd4);
            Iterator it4 = ahd4.iterator();
            while (it4.hasNext()) {
                arrayListA0m3.add(rewriteCell((TableCell) it4.next()));
            }
            AHD<TableCell> ahdA07 = AGI.A07(arrayListA0m3);
            AHD<AHD<TableCell>> ahd5 = table.rows;
            ArrayList arrayListA0m4 = AnonymousClass002.A0m(ahd5);
            for (List list : ahd5) {
                ArrayList arrayListA0m5 = AnonymousClass002.A0m(list);
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayListA0m5.add(rewriteCell((TableCell) it5.next()));
                }
                arrayListA0m4.add(AGI.A07(arrayListA0m5));
            }
            auraBlock = table.copy(ahdA07, AGI.A07(arrayListA0m4), table.alignments);
        }
        return Collections.singletonList(auraBlock);
    }

    private final TableCell rewriteCell(TableCell tableCell) {
        AHD<AuraBlock> ahd = tableCell.children;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(rewriteBlock(C8j4.A0i(it)), arrayListA0h);
        }
        return AGI.A05(arrayListA0h);
    }

    private final ListItem rewriteItem(ListItem listItem) {
        AHD<AuraBlock> ahd = listItem.children;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(rewriteBlock(C8j4.A0i(it)), arrayListA0h);
        }
        return AGI.A04(arrayListA0h);
    }

    private final AuraBlock.Custom wholeParagraphBlockMath(AuraBlock.Paragraph paragraph) {
        String strA0l;
        C06847l8 c06847l8A06;
        String strPlainTextOrNull = plainTextOrNull(paragraph.inlines);
        if (strPlainTextOrNull != null && (strA0l = AnonymousClass002.A0l(strPlainTextOrNull)) != null && ((c06847l8A06 = MathExtension.BLOCK_DOLLAR.A06(strA0l)) != null || (c06847l8A06 = MathExtension.BLOCK_BRACKET.A06(strA0l)) != null)) {
            String strA0l2 = AnonymousClass002.A0l((String) C8j4.A0q(c06847l8A06.AG1()));
            if (strA0l2.length() != 0) {
                return new AuraBlock.Custom(AuraCustomBlockNames.MATH, new MathBlockPayload(strA0l2));
            }
        }
        return null;
    }

    private final String plainTextOrNull(AHD<? extends AuraInline> ahd) {
        StringBuilder sbA0w = C60O.A0w();
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AuraInline auraInlineA0j = C8j4.A0j(it);
            if (auraInlineA0j instanceof AuraInline.Text) {
                sbA0w.append(((AuraInline.Text) auraInlineA0j).text);
            } else {
                if (!(auraInlineA0j instanceof AuraInline.SoftLineBreak)) {
                    return null;
                }
                sbA0w.append('\n');
            }
        }
        return sbA0w.toString();
    }

    private final AHD<AuraInline> rewriteInlines(AHD<? extends AuraInline> ahd) {
        AuraInline emphasis;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AuraInline auraInlineA0j = C8j4.A0j(it);
            if (auraInlineA0j instanceof AuraInline.Text) {
                AbstractC0882AGj.A0r(rewriteText(((AuraInline.Text) auraInlineA0j).text), arrayListA0h);
            } else {
                if (auraInlineA0j instanceof AuraInline.Emphasis) {
                    AHD<AuraInline> ahdRewriteInlines = rewriteInlines(((AuraInline.Emphasis) auraInlineA0j).children);
                    C7384Etj.A0Y(ahdRewriteInlines, 0);
                    emphasis = new AuraInline.Emphasis(ahdRewriteInlines);
                } else if (auraInlineA0j instanceof AuraInline.Strong) {
                    AHD<AuraInline> ahdRewriteInlines2 = rewriteInlines(((AuraInline.Strong) auraInlineA0j).children);
                    C7384Etj.A0Y(ahdRewriteInlines2, 0);
                    emphasis = new AuraInline.Strong(ahdRewriteInlines2);
                } else if (auraInlineA0j instanceof AuraInline.Strikethrough) {
                    AHD<AuraInline> ahdRewriteInlines3 = rewriteInlines(((AuraInline.Strikethrough) auraInlineA0j).children);
                    C7384Etj.A0Y(ahdRewriteInlines3, 0);
                    emphasis = new AuraInline.Strikethrough(ahdRewriteInlines3);
                } else if (auraInlineA0j instanceof AuraInline.Link) {
                    AuraInline.Link link = (AuraInline.Link) auraInlineA0j;
                    emphasis = link.copy(link.url, link.title, rewriteInlines(link.children));
                } else {
                    arrayListA0h.add(auraInlineA0j);
                }
                arrayListA0h.add(emphasis);
            }
        }
        return AGI.A07(arrayListA0h);
    }

    private final List<AuraBlock> rewriteParagraph(AuraBlock.Paragraph paragraph) {
        ArrayList arrayList;
        Object custom;
        AuraBlock.Custom customWholeParagraphBlockMath = wholeParagraphBlockMath(paragraph);
        if (customWholeParagraphBlockMath != null) {
            return Collections.singletonList(customWholeParagraphBlockMath);
        }
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it = paragraph.inlines.iterator();
        while (it.hasNext()) {
            AuraInline auraInlineA0j = C8j4.A0j(it);
            if (auraInlineA0j instanceof AuraInline.Text) {
                AuraInline.Text text = (AuraInline.Text) auraInlineA0j;
                if (C7BY.A0k(text.text, MathPreprocessor.PLACEHOLDER_OPEN)) {
                    for (Segment segment : splitOnBlockMath(text.text)) {
                        if (segment instanceof Segment.Plain) {
                            arrayList = arrayListA0h2;
                            custom = new AuraInline.Text(((Segment.Plain) segment).text);
                        } else {
                            if (!(segment instanceof Segment.BlockMath)) {
                                throw C3cG.A0q();
                            }
                            rewriteParagraph$flushPending(arrayListA0h2, this, arrayListA0h);
                            arrayList = arrayListA0h;
                            custom = new AuraBlock.Custom(AuraCustomBlockNames.MATH, new MathBlockPayload(((Segment.BlockMath) segment).expression));
                        }
                        arrayList.add(custom);
                    }
                }
            }
            arrayListA0h2.add(auraInlineA0j);
        }
        rewriteParagraph$flushPending(arrayListA0h2, this, arrayListA0h);
        return arrayListA0h.isEmpty() ? Collections.singletonList(paragraph) : arrayListA0h;
    }

    public static final void rewriteParagraph$flushPending(List<AuraInline> list, MathPlaceholderExtension mathPlaceholderExtension, List<AuraBlock> list2) {
        while (!list.isEmpty() && mathPlaceholderExtension.isBlank((AuraInline) AbstractC0878AGe.A0F(list))) {
            list.remove(0);
        }
        while (!list.isEmpty() && mathPlaceholderExtension.isBlank((AuraInline) AbstractC0878AGe.A0H(list))) {
            list.remove(C60O.A00(list));
        }
        if (!list.isEmpty()) {
            list2.add(new AuraBlock.Paragraph(mathPlaceholderExtension.rewriteInlines(AGI.A07(list))));
        }
        list.clear();
    }

    private final List<Segment> splitOnBlockMath(String str) {
        ArrayList arrayListA0h = C3cG.A0h();
        int i = 0;
        Iterator it = C06827l3.A00(str, MathPreprocessor.PLACEHOLDER_REGEX).iterator();
        while (it.hasNext()) {
            C1Lu c1Lu = (C1Lu) it.next();
            MathToken mathToken = this.table.get(Integer.valueOf(Integer.parseInt((String) C8j4.A0q(c1Lu.AG1()))));
            if (mathToken != null && mathToken.isBlock) {
                if (c1Lu.AJM().A00 > i) {
                    arrayListA0h.add(new Segment.Plain(str.substring(i, c1Lu.AJM().A00)));
                }
                arrayListA0h.add(new Segment.BlockMath(mathToken.expression));
                i = c1Lu.AJM().A01 + 1;
            }
        }
        if (arrayListA0h.isEmpty()) {
            return Collections.singletonList(new Segment.Plain(str));
        }
        if (i < str.length()) {
            arrayListA0h.add(new Segment.Plain(str.substring(i)));
        }
        return arrayListA0h;
    }
}
