package com.facebook.aura.markdown.parser.custom.extensions;

import X.AGI;
import X.AHD;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C7384Etj;
import X.C8j4;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.ast.ListItem;
import com.facebook.aura.markdown.parser.ast.TableCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class MermaidExtension implements AuraMarkdownExtension {
    public static final MermaidExtension INSTANCE = new MermaidExtension();
    public static final String LANGUAGE = "mermaid";

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
            if (auraBlock instanceof AuraBlock.BlockQuote) {
                AHD<AuraBlock> ahd = ((AuraBlock.BlockQuote) auraBlock).children;
                ArrayList arrayListA0m = AnonymousClass002.A0m(ahd);
                Iterator it = ahd.iterator();
                while (it.hasNext()) {
                    arrayListA0m.add(rewriteBlock(C8j4.A0i(it)));
                }
                auraBlockA01 = AGI.A00(arrayListA0m);
            } else if (auraBlock instanceof AuraBlock.UnorderedList) {
                AuraBlock.UnorderedList unorderedList = (AuraBlock.UnorderedList) auraBlock;
                AHD<ListItem> ahd2 = unorderedList.items;
                ArrayList arrayListA0m2 = AnonymousClass002.A0m(ahd2);
                Iterator it2 = ahd2.iterator();
                while (it2.hasNext()) {
                    arrayListA0m2.add(rewriteListItem((ListItem) it2.next()));
                }
                auraBlockA01 = AGI.A02(unorderedList, arrayListA0m2);
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
        auraBlockCopy = new AuraBlock.Custom(AuraCustomBlockNames.MERMAID, new MermaidPayload(codeBlock.code, codeBlock.unclosed));
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
            MermaidExtension mermaidExtension = INSTANCE;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayListA0m2.add(mermaidExtension.rewriteCell((TableCell) it.next()));
            }
            arrayListA0m.add(AGI.A07(arrayListA0m2));
        }
        return AGI.A07(arrayListA0m);
    }
}
