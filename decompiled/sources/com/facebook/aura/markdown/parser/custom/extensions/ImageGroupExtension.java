package com.facebook.aura.markdown.parser.custom.extensions;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C8j4;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.ast.ListItem;
import com.facebook.aura.markdown.parser.ast.TableCell;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class ImageGroupExtension implements AuraMarkdownExtension {
    public static final ImageGroupExtension INSTANCE = new ImageGroupExtension();

    @Override // com.facebook.aura.markdown.parser.custom.extensions.AuraMarkdownExtension
    public AuraMarkdownDocument transform(AuraMarkdownDocument auraMarkdownDocument) {
        C7384Etj.A0Y(auraMarkdownDocument, 0);
        return AGI.A03(groupBlocks(auraMarkdownDocument.blocks));
    }

    private final AuraBlock recurseIntoChildren(AuraBlock auraBlock) {
        AuraBlock auraBlockCopy;
        if (auraBlock instanceof AuraBlock.BlockQuote) {
            auraBlockCopy = AGI.A00(groupBlocks(((AuraBlock.BlockQuote) auraBlock).children));
        } else if (auraBlock instanceof AuraBlock.UnorderedList) {
            AuraBlock.UnorderedList unorderedList = (AuraBlock.UnorderedList) auraBlock;
            AHD<ListItem> ahd = unorderedList.items;
            ArrayList arrayListA0m = AnonymousClass002.A0m(ahd);
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                arrayListA0m.add(AGI.A04(INSTANCE.groupBlocks(((ListItem) it.next()).children)));
            }
            auraBlockCopy = AGI.A02(unorderedList, arrayListA0m);
        } else if (auraBlock instanceof AuraBlock.OrderedList) {
            AuraBlock.OrderedList orderedList = (AuraBlock.OrderedList) auraBlock;
            AHD<ListItem> ahd2 = orderedList.items;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(ahd2);
            Iterator it2 = ahd2.iterator();
            while (it2.hasNext()) {
                arrayListA0m2.add(AGI.A04(INSTANCE.groupBlocks(((ListItem) it2.next()).children)));
            }
            auraBlockCopy = AGI.A01(orderedList, arrayListA0m2);
        } else {
            if (!(auraBlock instanceof AuraBlock.Table)) {
                return auraBlock;
            }
            AuraBlock.Table table = (AuraBlock.Table) auraBlock;
            AHD<TableCell> ahd3 = table.header;
            ArrayList arrayListA0m3 = AnonymousClass002.A0m(ahd3);
            Iterator it3 = ahd3.iterator();
            while (it3.hasNext()) {
                arrayListA0m3.add(AGI.A05(INSTANCE.groupBlocks(((TableCell) it3.next()).children)));
            }
            AHD<TableCell> ahdA07 = AGI.A07(arrayListA0m3);
            AHD<AHD<TableCell>> ahd4 = table.rows;
            ArrayList arrayListA0m4 = AnonymousClass002.A0m(ahd4);
            for (List list : ahd4) {
                ArrayList arrayListA0m5 = AnonymousClass002.A0m(list);
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayListA0m5.add(AGI.A05(INSTANCE.groupBlocks(((TableCell) it4.next()).children)));
                }
                arrayListA0m4.add(AGI.A07(arrayListA0m5));
            }
            auraBlockCopy = table.copy(ahdA07, AGI.A07(arrayListA0m4), table.alignments);
        }
        return auraBlockCopy;
    }

    private final AuraInline.Image singleImageInlineOrNull(AuraBlock auraBlock) {
        if (!(auraBlock instanceof AuraBlock.Paragraph)) {
            return null;
        }
        Iterator it = ((AuraBlock.Paragraph) auraBlock).inlines.iterator();
        AuraInline.Image image = null;
        while (it.hasNext()) {
            AuraInline auraInlineA0j = C8j4.A0j(it);
            if (auraInlineA0j instanceof AuraInline.Image) {
                if (image != null) {
                    return null;
                }
                image = (AuraInline.Image) auraInlineA0j;
            } else if (!C7384Etj.areEqual(auraInlineA0j, AuraInline.SoftLineBreak.INSTANCE) && !C7384Etj.areEqual(auraInlineA0j, AuraInline.LineBreak.INSTANCE) && (!(auraInlineA0j instanceof AuraInline.Text) || !C7BY.A0j(((AuraInline.Text) auraInlineA0j).text))) {
                return null;
            }
        }
        return image;
    }

    private final List<AuraBlock> groupBlocks(List<? extends AuraBlock> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator<? extends AuraBlock> it = list.iterator();
        while (it.hasNext()) {
            AuraBlock auraBlockA0i = C8j4.A0i(it);
            AuraInline.Image imageSingleImageInlineOrNull = singleImageInlineOrNull(auraBlockA0i);
            if (imageSingleImageInlineOrNull != null) {
                arrayListA0h2.add(imageSingleImageInlineOrNull);
            } else {
                groupBlocks$flush(arrayListA0h2, arrayListA0h);
                arrayListA0h.add(recurseIntoChildren(auraBlockA0i));
            }
        }
        groupBlocks$flush(arrayListA0h2, arrayListA0h);
        return arrayListA0h;
    }

    public static final void groupBlocks$flush(List<AuraInline.Image> list, List<AuraBlock> list2) {
        int size = list.size();
        if (size != 0) {
            list2.add(size != 1 ? new AuraBlock.Custom(AuraCustomBlockNames.IMAGE_GROUP, new ImageGroupPayload(AbstractC0878AGe.A0X(list))) : new AuraBlock.Paragraph(AGI.A07(Collections.singletonList(C8j4.A0p(list)))));
        }
        list.clear();
    }
}
