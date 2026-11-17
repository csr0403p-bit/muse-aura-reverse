package com.facebook.aura.markdown.parser.custom.extensions;

import X.A6B;
import X.AGI;
import X.AHD;
import X.AbstractC0875AGb;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06827l3;
import X.C1Lu;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C8j4;
import X.C8j5;
import X.C9tI;
import X.F1E;
import X.FGI;
import X.G0U;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.ast.ListItem;
import com.facebook.aura.markdown.parser.ast.TableCell;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class CitationExtension implements AuraMarkdownExtension {
    public static final CitationExtension INSTANCE = new CitationExtension();
    public static final C06827l3 TEXT_CITATION_MARKER = C06827l3.A02("\\[(?=[a-zA-Z0-9]*\\d)([a-zA-Z0-9]{3,6})]|\\^(\\d+)\\b");

    public static final boolean assignDisplayNumbers$lambda$0(AuraBlock.Custom custom) {
        C7384Etj.A0Y(custom, 0);
        return AuraCustomBlockNames.SOURCES.equals(custom.name);
    }

    public static final List assignDisplayNumbers$lambda$1(AuraBlock.Custom custom) {
        SourcesPayload sourcesPayload;
        C7384Etj.A0Y(custom, 0);
        Object obj = custom.payload;
        if (!(obj instanceof SourcesPayload) || (sourcesPayload = (SourcesPayload) obj) == null) {
            return null;
        }
        return sourcesPayload.items;
    }

    public static final Unit assignDisplayNumbers$lambda$3(SourcesPayload sourcesPayload, Map map, F1E f1e, CitationPayload citationPayload) {
        C7384Etj.A0Y(citationPayload, 3);
        String strAllocationKey = INSTANCE.allocationKey(citationPayload, sourcesPayload);
        if (strAllocationKey != null) {
            assignDisplayNumbers$allocate(map, f1e, strAllocationKey);
        }
        return Unit.INSTANCE;
    }

    @Override // com.facebook.aura.markdown.parser.custom.extensions.AuraMarkdownExtension
    public AuraMarkdownDocument transform(AuraMarkdownDocument auraMarkdownDocument) {
        C7384Etj.A0Y(auraMarkdownDocument, 0);
        AHD<AuraBlock> ahd = auraMarkdownDocument.blocks;
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(rewriteBlock(C8j4.A0i(it)));
        }
        return assignDisplayNumbers(AGI.A03(arrayListA0i));
    }

    private final String allocationKey(CitationPayload citationPayload, SourcesPayload sourcesPayload) {
        List<SourceReference> list;
        String strUrlForId = citationPayload.resolvedUrl;
        if (strUrlForId != null || (sourcesPayload != null && (strUrlForId = urlForId(sourcesPayload, citationPayload.id)) != null)) {
            return strUrlForId;
        }
        Integer numA0r = C9tI.A0r(citationPayload.id);
        if (numA0r != null) {
            int iIntValue = numA0r.intValue();
            if (sourcesPayload != null && (list = sourcesPayload.items) != null && (!(list instanceof Collection) || !list.isEmpty())) {
                Iterator<SourceReference> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().index == iIntValue) {
                        return FGI.A0H("footnote:", iIntValue);
                    }
                }
            }
        }
        return null;
    }

    private final AuraMarkdownDocument assignDisplayNumbers(AuraMarkdownDocument auraMarkdownDocument) {
        List listA02 = A6B.A02(AbstractC0875AGb.A0A(A6B.A04(new G0U() { // from class: com.facebook.aura.markdown.parser.custom.extensions.CitationExtension$$ExternalSyntheticLambda1
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return CitationExtension.assignDisplayNumbers$lambda$1((AuraBlock.Custom) obj);
            }
        }, A6B.A03(new G0U() { // from class: com.facebook.aura.markdown.parser.custom.extensions.CitationExtension$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CitationExtension.assignDisplayNumbers$lambda$0((AuraBlock.Custom) obj));
            }
        }, A6B.A03(new G0U<Object, Boolean>() { // from class: com.facebook.aura.markdown.parser.custom.extensions.CitationExtension$assignDisplayNumbers$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // X.G0U
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof AuraBlock.Custom);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof AuraBlock.Custom);
            }
        }, AbstractC0878AGe.A06(auraMarkdownDocument.blocks))))));
        final SourcesPayload sourcesPayload = listA02.isEmpty() ? null : new SourcesPayload(listA02);
        final LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        final F1E f1e = new F1E();
        f1e.element = 1;
        walkCitations(auraMarkdownDocument.blocks, new G0U() { // from class: com.facebook.aura.markdown.parser.custom.extensions.CitationExtension$$ExternalSyntheticLambda2
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return CitationExtension.assignDisplayNumbers$lambda$3(sourcesPayload, linkedHashMapA0j, f1e, (CitationPayload) obj);
            }
        });
        if (linkedHashMapA0j.isEmpty()) {
            return auraMarkdownDocument;
        }
        AHD<AuraBlock> ahd = auraMarkdownDocument.blocks;
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(INSTANCE.remapBlockCitations((AuraBlock) it.next(), sourcesPayload, linkedHashMapA0j));
        }
        return new AuraMarkdownDocument(AGI.A06(arrayListA0i));
    }

    private final AuraBlock remapBlockCitations(AuraBlock auraBlock, SourcesPayload sourcesPayload, Map<String, Integer> map) {
        AuraBlock auraBlockCopy;
        if (auraBlock instanceof AuraBlock.Paragraph) {
            AHD<AuraInline> ahdRemapInlines = remapInlines(((AuraBlock.Paragraph) auraBlock).inlines, sourcesPayload, map);
            C7384Etj.A0Y(ahdRemapInlines, 0);
            auraBlockCopy = new AuraBlock.Paragraph(ahdRemapInlines);
        } else if (auraBlock instanceof AuraBlock.Heading) {
            AuraBlock.Heading heading = (AuraBlock.Heading) auraBlock;
            auraBlockCopy = C8j4.A0h(heading.level, remapInlines(heading.inlines, sourcesPayload, map));
        } else if (auraBlock instanceof AuraBlock.BlockQuote) {
            AHD<AuraBlock> ahd = ((AuraBlock.BlockQuote) auraBlock).children;
            ArrayList arrayListA0m = AnonymousClass002.A0m(ahd);
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                arrayListA0m.add(INSTANCE.remapBlockCitations((AuraBlock) it.next(), sourcesPayload, map));
            }
            auraBlockCopy = AGI.A00(arrayListA0m);
        } else if (auraBlock instanceof AuraBlock.UnorderedList) {
            AuraBlock.UnorderedList unorderedList = (AuraBlock.UnorderedList) auraBlock;
            AHD<ListItem> ahd2 = unorderedList.items;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(ahd2);
            Iterator it2 = ahd2.iterator();
            while (it2.hasNext()) {
                AHD ahdA1E = C8j4.A1E(it2);
                ArrayList arrayListA0m3 = AnonymousClass002.A0m(ahdA1E);
                Iterator it3 = ahdA1E.iterator();
                while (it3.hasNext()) {
                    arrayListA0m3.add(INSTANCE.remapBlockCitations((AuraBlock) it3.next(), sourcesPayload, map));
                }
                arrayListA0m2.add(AGI.A04(arrayListA0m3));
            }
            auraBlockCopy = AGI.A02(unorderedList, arrayListA0m2);
        } else if (auraBlock instanceof AuraBlock.OrderedList) {
            AuraBlock.OrderedList orderedList = (AuraBlock.OrderedList) auraBlock;
            AHD<ListItem> ahd3 = orderedList.items;
            ArrayList arrayListA0m4 = AnonymousClass002.A0m(ahd3);
            Iterator it4 = ahd3.iterator();
            while (it4.hasNext()) {
                AHD ahdA1E2 = C8j4.A1E(it4);
                ArrayList arrayListA0m5 = AnonymousClass002.A0m(ahdA1E2);
                Iterator it5 = ahdA1E2.iterator();
                while (it5.hasNext()) {
                    arrayListA0m5.add(INSTANCE.remapBlockCitations((AuraBlock) it5.next(), sourcesPayload, map));
                }
                arrayListA0m4.add(AGI.A04(arrayListA0m5));
            }
            auraBlockCopy = AGI.A01(orderedList, arrayListA0m4);
        } else {
            if (!(auraBlock instanceof AuraBlock.Table)) {
                return auraBlock;
            }
            AuraBlock.Table table = (AuraBlock.Table) auraBlock;
            AHD<TableCell> ahd4 = table.header;
            ArrayList arrayListA0m6 = AnonymousClass002.A0m(ahd4);
            Iterator it6 = ahd4.iterator();
            while (it6.hasNext()) {
                AHD ahdA1F = C8j4.A1F(it6);
                ArrayList arrayListA0m7 = AnonymousClass002.A0m(ahdA1F);
                Iterator it7 = ahdA1F.iterator();
                while (it7.hasNext()) {
                    arrayListA0m7.add(INSTANCE.remapBlockCitations((AuraBlock) it7.next(), sourcesPayload, map));
                }
                arrayListA0m6.add(AGI.A05(arrayListA0m7));
            }
            AHD<TableCell> ahdA07 = AGI.A07(arrayListA0m6);
            AHD<AHD<TableCell>> ahd5 = table.rows;
            ArrayList arrayListA0m8 = AnonymousClass002.A0m(ahd5);
            for (List list : ahd5) {
                ArrayList arrayListA0m9 = AnonymousClass002.A0m(list);
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    AHD ahdA1F2 = C8j4.A1F(it8);
                    ArrayList arrayListA0m10 = AnonymousClass002.A0m(ahdA1F2);
                    Iterator it9 = ahdA1F2.iterator();
                    while (it9.hasNext()) {
                        arrayListA0m10.add(INSTANCE.remapBlockCitations(C8j4.A0i(it9), sourcesPayload, map));
                    }
                    arrayListA0m9.add(AGI.A05(arrayListA0m10));
                }
                arrayListA0m8.add(AGI.A07(arrayListA0m9));
            }
            auraBlockCopy = table.copy(ahdA07, AGI.A07(arrayListA0m8), table.alignments);
        }
        return auraBlockCopy;
    }

    private final AuraBlock rewriteBlock(AuraBlock auraBlock) {
        AuraBlock auraBlockCopy;
        if (auraBlock instanceof AuraBlock.Paragraph) {
            AHD<AuraInline> ahdRewriteInlines = rewriteInlines(((AuraBlock.Paragraph) auraBlock).inlines);
            C7384Etj.A0Y(ahdRewriteInlines, 0);
            auraBlockCopy = new AuraBlock.Paragraph(ahdRewriteInlines);
        } else if (auraBlock instanceof AuraBlock.Heading) {
            AuraBlock.Heading heading = (AuraBlock.Heading) auraBlock;
            auraBlockCopy = C8j4.A0h(heading.level, rewriteInlines(heading.inlines));
        } else if (auraBlock instanceof AuraBlock.BlockQuote) {
            AHD<AuraBlock> ahd = ((AuraBlock.BlockQuote) auraBlock).children;
            ArrayList arrayListA0m = AnonymousClass002.A0m(ahd);
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                arrayListA0m.add(rewriteBlock(C8j4.A0i(it)));
            }
            auraBlockCopy = AGI.A00(arrayListA0m);
        } else if (auraBlock instanceof AuraBlock.UnorderedList) {
            AuraBlock.UnorderedList unorderedList = (AuraBlock.UnorderedList) auraBlock;
            AHD<ListItem> ahd2 = unorderedList.items;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(ahd2);
            Iterator it2 = ahd2.iterator();
            while (it2.hasNext()) {
                arrayListA0m2.add(rewriteItem((ListItem) it2.next()));
            }
            auraBlockCopy = AGI.A02(unorderedList, arrayListA0m2);
        } else if (auraBlock instanceof AuraBlock.OrderedList) {
            AuraBlock.OrderedList orderedList = (AuraBlock.OrderedList) auraBlock;
            AHD<ListItem> ahd3 = orderedList.items;
            ArrayList arrayListA0m3 = AnonymousClass002.A0m(ahd3);
            Iterator it3 = ahd3.iterator();
            while (it3.hasNext()) {
                arrayListA0m3.add(rewriteItem((ListItem) it3.next()));
            }
            auraBlockCopy = AGI.A01(orderedList, arrayListA0m3);
        } else {
            if (!(auraBlock instanceof AuraBlock.Table)) {
                return auraBlock;
            }
            AuraBlock.Table table = (AuraBlock.Table) auraBlock;
            AHD<TableCell> ahd4 = table.header;
            ArrayList arrayListA0m4 = AnonymousClass002.A0m(ahd4);
            Iterator it4 = ahd4.iterator();
            while (it4.hasNext()) {
                arrayListA0m4.add(rewriteCell((TableCell) it4.next()));
            }
            AHD<TableCell> ahdA07 = AGI.A07(arrayListA0m4);
            AHD<AHD<TableCell>> ahd5 = table.rows;
            ArrayList arrayListA0m5 = AnonymousClass002.A0m(ahd5);
            for (List list : ahd5) {
                CitationExtension citationExtension = INSTANCE;
                ArrayList arrayListA0m6 = AnonymousClass002.A0m(list);
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayListA0m6.add(citationExtension.rewriteCell((TableCell) it5.next()));
                }
                arrayListA0m5.add(AGI.A07(arrayListA0m6));
            }
            auraBlockCopy = table.copy(ahdA07, AGI.A07(arrayListA0m5), table.alignments);
        }
        return auraBlockCopy;
    }

    private final TableCell rewriteCell(TableCell tableCell) {
        AHD<AuraBlock> ahd = tableCell.children;
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(rewriteBlock(C8j4.A0i(it)));
        }
        return AGI.A05(arrayListA0i);
    }

    private final ListItem rewriteItem(ListItem listItem) {
        AHD<AuraBlock> ahd = listItem.children;
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(rewriteBlock(C8j4.A0i(it)));
        }
        return AGI.A04(arrayListA0i);
    }

    private final List<AuraInline> splitTextCitations(AuraInline.Text text) {
        int i = 0;
        List<C1Lu> listA02 = A6B.A02(C06827l3.A00(text.text, TEXT_CITATION_MARKER));
        if (listA02.isEmpty()) {
            return Collections.singletonList(text);
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (C1Lu c1Lu : listA02) {
            if (c1Lu.AJM().A00 > i) {
                arrayListA0h.add(new AuraInline.Text(text.text.substring(i, c1Lu.AJM().A00)));
            }
            CharSequence charSequence = (CharSequence) C8j4.A0q(c1Lu.AG1());
            if (charSequence.length() == 0) {
                charSequence = (String) c1Lu.AG1().get(2);
            }
            arrayListA0h.add(new AuraInline.Custom(AuraCustomInlineNames.CITATION, new CitationPayload((String) charSequence, null, null)));
            i = c1Lu.AJM().A01 + 1;
        }
        C8j5.A0n(text.text, arrayListA0h, i);
        return arrayListA0h;
    }

    private final void walkCitationsInBlock(AuraBlock auraBlock, G0U<? super CitationPayload, Unit> g0u) {
        AHD<AuraInline> ahd;
        if (auraBlock instanceof AuraBlock.Paragraph) {
            ahd = ((AuraBlock.Paragraph) auraBlock).inlines;
        } else {
            if (!(auraBlock instanceof AuraBlock.Heading)) {
                if (auraBlock instanceof AuraBlock.BlockQuote) {
                    walkCitations(((AuraBlock.BlockQuote) auraBlock).children, g0u);
                    return;
                }
                if (auraBlock instanceof AuraBlock.UnorderedList) {
                    Iterator it = ((AuraBlock.UnorderedList) auraBlock).items.iterator();
                    while (it.hasNext()) {
                        INSTANCE.walkCitations(((ListItem) it.next()).children, g0u);
                    }
                    return;
                }
                if (auraBlock instanceof AuraBlock.OrderedList) {
                    Iterator it2 = ((AuraBlock.OrderedList) auraBlock).items.iterator();
                    while (it2.hasNext()) {
                        INSTANCE.walkCitations(((ListItem) it2.next()).children, g0u);
                    }
                    return;
                }
                if (auraBlock instanceof AuraBlock.Table) {
                    AuraBlock.Table table = (AuraBlock.Table) auraBlock;
                    Iterator it3 = table.header.iterator();
                    while (it3.hasNext()) {
                        INSTANCE.walkCitations(((TableCell) it3.next()).children, g0u);
                    }
                    Iterator it4 = table.rows.iterator();
                    while (it4.hasNext()) {
                        Iterator itA11 = C8j4.A11(it4);
                        while (itA11.hasNext()) {
                            INSTANCE.walkCitations(((TableCell) itA11.next()).children, g0u);
                        }
                    }
                    return;
                }
                return;
            }
            ahd = ((AuraBlock.Heading) auraBlock).inlines;
        }
        walkCitationsInInlines(ahd, g0u);
    }

    public static final int assignDisplayNumbers$allocate(Map<String, Integer> map, F1E f1e, String str) {
        Integer numValueOf = map.get(str);
        if (numValueOf == null) {
            int i = f1e.element;
            f1e.element = i + 1;
            numValueOf = Integer.valueOf(i);
            map.put(str, numValueOf);
        }
        return AnonymousClass001.A0F(numValueOf);
    }

    private final String plainText(AHD<? extends AuraInline> ahd) {
        String strPlainText;
        AHD<AuraInline> ahd2;
        StringBuilder sbA0w = C60O.A0w();
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AuraInline auraInlineA0j = C8j4.A0j(it);
            if (auraInlineA0j instanceof AuraInline.Text) {
                strPlainText = ((AuraInline.Text) auraInlineA0j).text;
            } else {
                if (auraInlineA0j instanceof AuraInline.Emphasis) {
                    ahd2 = ((AuraInline.Emphasis) auraInlineA0j).children;
                } else if (auraInlineA0j instanceof AuraInline.Strong) {
                    ahd2 = ((AuraInline.Strong) auraInlineA0j).children;
                } else if (auraInlineA0j instanceof AuraInline.Strikethrough) {
                    ahd2 = ((AuraInline.Strikethrough) auraInlineA0j).children;
                } else if (auraInlineA0j instanceof AuraInline.Link) {
                    ahd2 = ((AuraInline.Link) auraInlineA0j).children;
                } else if (auraInlineA0j instanceof AuraInline.AutoLink) {
                    strPlainText = ((AuraInline.AutoLink) auraInlineA0j).url;
                } else if (auraInlineA0j instanceof AuraInline.InlineCode) {
                    strPlainText = ((AuraInline.InlineCode) auraInlineA0j).code;
                } else if (auraInlineA0j instanceof AuraInline.Image) {
                    strPlainText = ((AuraInline.Image) auraInlineA0j).alt;
                } else if (C7384Etj.areEqual(auraInlineA0j, AuraInline.LineBreak.INSTANCE) || C7384Etj.areEqual(auraInlineA0j, AuraInline.SoftLineBreak.INSTANCE)) {
                    sbA0w.append(' ');
                } else if (!(auraInlineA0j instanceof AuraInline.Custom)) {
                    throw C3cG.A0q();
                }
                strPlainText = plainText(ahd2);
            }
            sbA0w.append(strPlainText);
        }
        return sbA0w.toString();
    }

    private final AHD<AuraInline> remapInlines(AHD<? extends AuraInline> ahd, SourcesPayload sourcesPayload, Map<String, Integer> map) {
        CitationPayload citationPayload;
        Integer num;
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            Object objA0j = C8j4.A0j(it);
            if (objA0j instanceof AuraInline.Custom) {
                AuraInline.Custom custom = (AuraInline.Custom) objA0j;
                if (AuraCustomInlineNames.CITATION.equals(custom.name)) {
                    Object obj = custom.payload;
                    if ((obj instanceof CitationPayload) && (citationPayload = (CitationPayload) obj) != null) {
                        String strAllocationKey = INSTANCE.allocationKey(citationPayload, sourcesPayload);
                        if (strAllocationKey != null && (num = map.get(strAllocationKey)) != null) {
                            CitationPayload citationPayloadCopy = citationPayload.copy(citationPayload.id, citationPayload.resolvedUrl, num);
                            String str = custom.name;
                            C7384Etj.A0Y(str, 0);
                            custom = new AuraInline.Custom(str, citationPayloadCopy);
                        }
                        objA0j = custom;
                    }
                } else {
                    objA0j = custom;
                }
            } else if (objA0j instanceof AuraInline.Emphasis) {
                AHD<AuraInline> ahdRemapInlines = INSTANCE.remapInlines(((AuraInline.Emphasis) objA0j).children, sourcesPayload, map);
                C7384Etj.A0Y(ahdRemapInlines, 0);
                objA0j = new AuraInline.Emphasis(ahdRemapInlines);
            } else if (objA0j instanceof AuraInline.Strong) {
                AHD<AuraInline> ahdRemapInlines2 = INSTANCE.remapInlines(((AuraInline.Strong) objA0j).children, sourcesPayload, map);
                C7384Etj.A0Y(ahdRemapInlines2, 0);
                objA0j = new AuraInline.Strong(ahdRemapInlines2);
            } else if (objA0j instanceof AuraInline.Strikethrough) {
                AHD<AuraInline> ahdRemapInlines3 = INSTANCE.remapInlines(((AuraInline.Strikethrough) objA0j).children, sourcesPayload, map);
                C7384Etj.A0Y(ahdRemapInlines3, 0);
                objA0j = new AuraInline.Strikethrough(ahdRemapInlines3);
            } else if (objA0j instanceof AuraInline.Link) {
                AuraInline.Link link = (AuraInline.Link) objA0j;
                objA0j = link.copy(link.url, link.title, INSTANCE.remapInlines(link.children, sourcesPayload, map));
            }
            arrayListA0i.add(objA0j);
        }
        return AGI.A07(arrayListA0i);
    }

    private final AHD<AuraInline> rewriteInlines(AHD<? extends AuraInline> ahd) {
        AuraInline strikethrough;
        AuraInline auraInlineCopy;
        String str;
        ArrayList arrayListA0h = C3cG.A0h();
        for (int i = 0; i < ahd.size(); i++) {
            AuraInline auraInline = (AuraInline) ahd.get(i);
            if (auraInline instanceof AuraInline.Link) {
                AuraInline.Link link = (AuraInline.Link) auraInline;
                String strPlainText = plainText(link.children);
                Object objA0I = AbstractC0878AGe.A0I(arrayListA0h);
                AuraInline.Text text = objA0I instanceof AuraInline.Text ? (AuraInline.Text) objA0I : null;
                if (link.url.length() <= 0 || text == null || (str = text.text) == null || !C7BY.A0l(str, '^')) {
                    auraInlineCopy = link.copy(link.url, link.title, rewriteInlines(link.children));
                } else {
                    String strA0L = C7BY.A0L("^", text.text);
                    arrayListA0h.remove(arrayListA0h.size() - 1);
                    if (strA0L.length() > 0) {
                        arrayListA0h.add(new AuraInline.Text(strA0L));
                    }
                    auraInlineCopy = new AuraInline.Custom(AuraCustomInlineNames.CITATION, new CitationPayload(strPlainText, link.url, null));
                }
                arrayListA0h.add(auraInlineCopy);
            } else {
                if (auraInline instanceof AuraInline.Emphasis) {
                    AHD<AuraInline> ahdRewriteInlines = rewriteInlines(((AuraInline.Emphasis) auraInline).children);
                    C7384Etj.A0Y(ahdRewriteInlines, 0);
                    strikethrough = new AuraInline.Emphasis(ahdRewriteInlines);
                } else if (auraInline instanceof AuraInline.Strong) {
                    AHD<AuraInline> ahdRewriteInlines2 = rewriteInlines(((AuraInline.Strong) auraInline).children);
                    C7384Etj.A0Y(ahdRewriteInlines2, 0);
                    strikethrough = new AuraInline.Strong(ahdRewriteInlines2);
                } else if (auraInline instanceof AuraInline.Strikethrough) {
                    AHD<AuraInline> ahdRewriteInlines3 = rewriteInlines(((AuraInline.Strikethrough) auraInline).children);
                    C7384Etj.A0Y(ahdRewriteInlines3, 0);
                    strikethrough = new AuraInline.Strikethrough(ahdRewriteInlines3);
                } else if (auraInline instanceof AuraInline.Text) {
                    AbstractC0882AGj.A0r(splitTextCitations((AuraInline.Text) auraInline), arrayListA0h);
                } else {
                    arrayListA0h.add(auraInline);
                }
                arrayListA0h.add(strikethrough);
            }
        }
        return AGI.A07(arrayListA0h);
    }

    private final String urlForId(SourcesPayload sourcesPayload, String str) {
        SourceReference next;
        Integer numA0r = C9tI.A0r(str);
        if (numA0r != null) {
            Iterator<SourceReference> it = sourcesPayload.items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.index == numA0r.intValue()) {
                    break;
                }
            }
            SourceReference sourceReference = next;
            if (sourceReference != null) {
                return sourceReference.url;
            }
        }
        return null;
    }

    private final void walkCitations(AHD<? extends AuraBlock> ahd, G0U<? super CitationPayload, Unit> g0u) {
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            walkCitationsInBlock(C8j4.A0i(it), g0u);
        }
    }

    private final void walkCitationsInInlines(AHD<? extends AuraInline> ahd, G0U<? super CitationPayload, Unit> g0u) {
        AHD<AuraInline> ahd2;
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AuraInline auraInlineA0j = C8j4.A0j(it);
            if (auraInlineA0j instanceof AuraInline.Custom) {
                AuraInline.Custom custom = (AuraInline.Custom) auraInlineA0j;
                if (AuraCustomInlineNames.CITATION.equals(custom.name)) {
                    Object obj = custom.payload;
                    if ((obj instanceof CitationPayload) && obj != 0) {
                        g0u.invoke(obj);
                    }
                }
            } else {
                if (auraInlineA0j instanceof AuraInline.Emphasis) {
                    ahd2 = ((AuraInline.Emphasis) auraInlineA0j).children;
                } else if (auraInlineA0j instanceof AuraInline.Strong) {
                    ahd2 = ((AuraInline.Strong) auraInlineA0j).children;
                } else if (auraInlineA0j instanceof AuraInline.Strikethrough) {
                    ahd2 = ((AuraInline.Strikethrough) auraInlineA0j).children;
                } else if (auraInlineA0j instanceof AuraInline.Link) {
                    ahd2 = ((AuraInline.Link) auraInlineA0j).children;
                }
                walkCitationsInInlines(ahd2, g0u);
            }
        }
    }
}
