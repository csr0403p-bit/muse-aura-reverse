package com.facebook.aura.markdown.parser.custom.extensions;

import X.AGI;
import X.AHD;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C8j4;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.ast.ListItem;
import com.facebook.aura.markdown.parser.ast.TableCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchNodeCardExtension implements AuraMarkdownExtension {
    public static final HatchNodeCardExtension INSTANCE = new HatchNodeCardExtension();
    public static final String LANGUAGE = "hatch-node-card";
    public static final String NODE_CARD_LINK_PREFIX = "hatch://node-card?";

    @Override // com.facebook.aura.markdown.parser.custom.extensions.AuraMarkdownExtension
    public AuraMarkdownDocument transform(AuraMarkdownDocument auraMarkdownDocument) {
        C7384Etj.A0Y(auraMarkdownDocument, 0);
        AHD<AuraBlock> ahd = auraMarkdownDocument.blocks;
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(rewriteBlock(C8j4.A0i(it)));
        }
        return AGI.A03(arrayListA0i);
    }

    private final AuraBlock rewriteBlock(AuraBlock auraBlock) {
        AuraBlock auraBlockCopy;
        AuraBlock auraBlockA01;
        if (!(auraBlock instanceof AuraBlock.CodeBlock)) {
            if (auraBlock instanceof AuraBlock.Paragraph) {
                String strSoleNodeCardLinkUrlOrNull = soleNodeCardLinkUrlOrNull(((AuraBlock.Paragraph) auraBlock).inlines);
                if (strSoleNodeCardLinkUrlOrNull == null) {
                    return auraBlock;
                }
                auraBlockA01 = new AuraBlock.Custom(AuraCustomBlockNames.NODE_CARD, new NodeCardPayload(strSoleNodeCardLinkUrlOrNull, false));
            } else if (auraBlock instanceof AuraBlock.BlockQuote) {
                AHD<AuraBlock> ahd = ((AuraBlock.BlockQuote) auraBlock).children;
                ArrayList arrayListA0m = AnonymousClass002.A0m(ahd);
                Iterator it = ahd.iterator();
                while (it.hasNext()) {
                    arrayListA0m.add(rewriteBlock(C8j4.A0i(it)));
                }
                AHD ahdA07 = AGI.A07(arrayListA0m);
                C7384Etj.A0Y(ahdA07, 0);
                auraBlockA01 = new AuraBlock.BlockQuote(ahdA07);
            } else if (auraBlock instanceof AuraBlock.UnorderedList) {
                AuraBlock.UnorderedList unorderedList = (AuraBlock.UnorderedList) auraBlock;
                AHD<ListItem> ahd2 = unorderedList.items;
                ArrayList arrayListA0m2 = AnonymousClass002.A0m(ahd2);
                Iterator it2 = ahd2.iterator();
                while (it2.hasNext()) {
                    arrayListA0m2.add(rewriteListItem((ListItem) it2.next()));
                }
                AHD ahdA072 = AGI.A07(arrayListA0m2);
                boolean z = unorderedList.tight;
                C7384Etj.A0Y(ahdA072, 0);
                auraBlockA01 = new AuraBlock.UnorderedList(ahdA072, z);
            } else if (auraBlock instanceof AuraBlock.OrderedList) {
                AuraBlock.OrderedList orderedList = (AuraBlock.OrderedList) auraBlock;
                AHD<ListItem> ahd3 = orderedList.items;
                ArrayList arrayListA0m3 = AnonymousClass002.A0m(ahd3);
                Iterator it3 = ahd3.iterator();
                while (it3.hasNext()) {
                    arrayListA0m3.add(rewriteListItem((ListItem) it3.next()));
                }
                auraBlockA01 = AGI.A01(orderedList, arrayListA0m3);
            } else {
                if (!(auraBlock instanceof AuraBlock.Table)) {
                    return auraBlock;
                }
                AuraBlock.Table table = (AuraBlock.Table) auraBlock;
                auraBlockCopy = table.copy(rewriteHeader(table.header), rewriteRows(table.rows), table.alignments);
            }
            return auraBlockA01;
        }
        AuraBlock.CodeBlock codeBlock = (AuraBlock.CodeBlock) auraBlock;
        String str = codeBlock.language;
        if (str == null || !str.equalsIgnoreCase(LANGUAGE)) {
            return auraBlock;
        }
        auraBlockCopy = new AuraBlock.Custom(AuraCustomBlockNames.NODE_CARD, new NodeCardPayload(codeBlock.code, codeBlock.unclosed));
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

    private final ListItem rewriteListItem(ListItem listItem) {
        AHD<AuraBlock> ahd = listItem.children;
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(rewriteBlock(C8j4.A0i(it)));
        }
        return AGI.A04(arrayListA0i);
    }

    private final AHD<TableCell> rewriteHeader(AHD<TableCell> ahd) {
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(rewriteCell((TableCell) it.next()));
        }
        return AGI.A07(arrayListA0i);
    }

    private final AHD<AHD<TableCell>> rewriteRows(AHD<? extends AHD<TableCell>> ahd) {
        ArrayList arrayListA0m = AnonymousClass002.A0m(ahd);
        for (List list : ahd) {
            HatchNodeCardExtension hatchNodeCardExtension = INSTANCE;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayListA0m2.add(hatchNodeCardExtension.rewriteCell((TableCell) it.next()));
            }
            arrayListA0m.add(AGI.A07(arrayListA0m2));
        }
        return AGI.A07(arrayListA0m);
    }

    private final String soleNodeCardLinkUrlOrNull(AHD<? extends AuraInline> ahd) {
        Iterator it = ahd.iterator();
        String str = null;
        while (it.hasNext()) {
            AuraInline auraInlineA0j = C8j4.A0j(it);
            if (!(auraInlineA0j instanceof AuraInline.SoftLineBreak) && !(auraInlineA0j instanceof AuraInline.LineBreak)) {
                if (!(auraInlineA0j instanceof AuraInline.Text)) {
                    if (auraInlineA0j instanceof AuraInline.Link) {
                        if (str == null) {
                            AuraInline.Link link = (AuraInline.Link) auraInlineA0j;
                            if (C60O.A1X(link.url, NODE_CARD_LINK_PREFIX)) {
                                str = link.url;
                            }
                        }
                        return null;
                    }
                    if ((auraInlineA0j instanceof AuraInline.AutoLink) && str == null) {
                        AuraInline.AutoLink autoLink = (AuraInline.AutoLink) auraInlineA0j;
                        if (C60O.A1X(autoLink.url, NODE_CARD_LINK_PREFIX)) {
                            str = autoLink.url;
                        }
                    }
                    return null;
                }
                if (!C7BY.A0j(((AuraInline.Text) auraInlineA0j).text)) {
                    return null;
                }
            }
        }
        return str;
    }
}
