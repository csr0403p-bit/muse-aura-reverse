package com.facebook.aura.markdown.parser.custom.extensions;

import X.AGI;
import X.AHD;
import X.AbstractC0882AGj;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BFI;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C8j4;
import com.facebook.aura.file.view.ArtifactFileActionMenuKt;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.ast.ListItem;
import com.facebook.aura.markdown.parser.ast.TableCell;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class FileLinkExtension implements AuraMarkdownExtension {
    public static final FileLinkExtension INSTANCE = new FileLinkExtension();
    public static final Set<String> IMAGE_EXTENSIONS = BFI.A0H(new String[]{"jpg", "jpeg", "png", "gif", "webp", "bmp", "svg", "heic"});
    public static final Set<String> VIDEO_EXTENSIONS = BFI.A0H(new String[]{"mp4", "mov", "webm", "m4v", "avi", "mkv"});
    public static final Set<String> AUDIO_EXTENSIONS = BFI.A0H(new String[]{"mp3", "wav", "ogg", "m4a", "aac", "flac"});

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

    private final FileLinkPayload chipFromInline(AuraInline auraInline) {
        if (auraInline instanceof AuraInline.Link) {
            AuraInline.Link link = (AuraInline.Link) auraInline;
            return chipFromLink(link.url, toPlainText(link.children));
        }
        if (!(auraInline instanceof AuraInline.Image)) {
            return null;
        }
        AuraInline.Image image = (AuraInline.Image) auraInline;
        return chipFromImage(image.url, image.alt);
    }

    private final FileLinkPayload chipFromLink(String str, String str2) {
        FileLinkKind fileLinkKindSubKindFromExtension;
        String strA00 = AnonymousClass000.A00(47);
        C7384Etj.A0Y(str, 0);
        if (AnonymousClass006.A1b(strA00, str)) {
            fileLinkKindSubKindFromExtension = FileLinkKind.SLIDES;
        } else {
            if (!AnonymousClass006.A1b(ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX, str) && !AnonymousClass006.A1b("workspace/", str)) {
                return null;
            }
            fileLinkKindSubKindFromExtension = subKindFromExtension(str);
        }
        return new FileLinkPayload(fileLinkKindSubKindFromExtension, str, str2);
    }

    private final String extensionOf(String str) {
        String strA0S = C7BY.A0S(str, str, '?');
        String strA0Z = C7BY.A0Z(C7BY.A0S(strA0S, strA0S, '#'), '/');
        return AnonymousClass001.A0u(C7BY.A0R(strA0Z, strA0Z, '.'));
    }

    private final boolean isImageUrl(String str) {
        C7384Etj.A0Y(str, 0);
        if (AnonymousClass006.A1b("content://", str)) {
            return true;
        }
        return IMAGE_EXTENSIONS.contains(extensionOf(str));
    }

    private final boolean isSlidesUrl(String str) {
        String strA0K = C7BY.A0K("http://sandbox://", C7BY.A0K(ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX, str));
        if (!C7BY.A0q(strA0K, "workspace/slides", false)) {
            return false;
        }
        String strA0Z = C7BY.A0Z(strA0K, '/');
        return !C7BY.A0q(C7BY.A0R(strA0Z, strA0Z, '/'), ".", false);
    }

    private final List<AuraBlock> rewriteBlock(AuraBlock auraBlock) {
        if (auraBlock instanceof AuraBlock.Paragraph) {
            return splitParagraph((AuraBlock.Paragraph) auraBlock);
        }
        if (!(auraBlock instanceof AuraBlock.Heading)) {
            if (auraBlock instanceof AuraBlock.BlockQuote) {
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
                    FileLinkExtension fileLinkExtension = INSTANCE;
                    ArrayList arrayListA0m5 = AnonymousClass002.A0m(list);
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        arrayListA0m5.add(fileLinkExtension.rewriteCell((TableCell) it5.next()));
                    }
                    arrayListA0m4.add(AGI.A07(arrayListA0m5));
                }
                auraBlock = table.copy(ahdA07, AGI.A07(arrayListA0m4), table.alignments);
            }
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

    private final List<AuraBlock> splitParagraph(AuraBlock.Paragraph paragraph) {
        AuraBlock custom;
        AHD<AuraInline> ahd = paragraph.inlines;
        if (!(ahd instanceof Collection) || !ahd.isEmpty()) {
            for (Object obj : ahd) {
                if ((obj instanceof AuraInline.Link) || (obj instanceof AuraInline.Image)) {
                    ArrayList arrayListA0h = C3cG.A0h();
                    ArrayList arrayListA0h2 = C3cG.A0h();
                    Iterator it = ahd.iterator();
                    while (it.hasNext()) {
                        AuraInline auraInlineA0j = C8j4.A0j(it);
                        FileLinkPayload fileLinkPayloadChipFromInline = chipFromInline(auraInlineA0j);
                        if (fileLinkPayloadChipFromInline != null) {
                            splitParagraph$flushPending(arrayListA0h2, arrayListA0h);
                            custom = new AuraBlock.Custom(AuraCustomInlineNames.FILE_LINK, fileLinkPayloadChipFromInline);
                        } else if ((auraInlineA0j instanceof AuraInline.Image) && isImageUrl(((AuraInline.Image) auraInlineA0j).url)) {
                            splitParagraph$flushPending(arrayListA0h2, arrayListA0h);
                            custom = new AuraBlock.Paragraph(AGI.A07(Collections.singletonList(auraInlineA0j)));
                        } else {
                            arrayListA0h2.add(auraInlineA0j);
                        }
                        arrayListA0h.add(custom);
                    }
                    splitParagraph$flushPending(arrayListA0h2, arrayListA0h);
                    if (!arrayListA0h.isEmpty()) {
                        return arrayListA0h;
                    }
                }
            }
        }
        return Collections.singletonList(paragraph);
    }

    public static final void toPlainText$walk(StringBuilder sb, AuraInline auraInline) {
        String str;
        if (auraInline instanceof AuraInline.Text) {
            str = ((AuraInline.Text) auraInline).text;
        } else {
            if (auraInline instanceof AuraInline.Emphasis) {
                Iterator it = ((AuraInline.Emphasis) auraInline).children.iterator();
                while (it.hasNext()) {
                    toPlainText$walk(sb, C8j4.A0j(it));
                }
                return;
            }
            if (auraInline instanceof AuraInline.Strong) {
                Iterator it2 = ((AuraInline.Strong) auraInline).children.iterator();
                while (it2.hasNext()) {
                    toPlainText$walk(sb, C8j4.A0j(it2));
                }
                return;
            }
            if (auraInline instanceof AuraInline.Strikethrough) {
                Iterator it3 = ((AuraInline.Strikethrough) auraInline).children.iterator();
                while (it3.hasNext()) {
                    toPlainText$walk(sb, C8j4.A0j(it3));
                }
                return;
            }
            if (auraInline instanceof AuraInline.Link) {
                Iterator it4 = ((AuraInline.Link) auraInline).children.iterator();
                while (it4.hasNext()) {
                    toPlainText$walk(sb, C8j4.A0j(it4));
                }
                return;
            } else if (auraInline instanceof AuraInline.AutoLink) {
                str = ((AuraInline.AutoLink) auraInline).url;
            } else if (auraInline instanceof AuraInline.InlineCode) {
                str = ((AuraInline.InlineCode) auraInline).code;
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

    private final FileLinkPayload chipFromImage(String str, String str2) {
        if (isImageUrl(str)) {
            return null;
        }
        if (str2.length() == 0) {
            String strA0Z = C7BY.A0Z(str, '/');
            str2 = C7BY.A0R(strA0Z, strA0Z, '/');
        }
        return new FileLinkPayload(isSlidesUrl(str) ? FileLinkKind.SLIDES : isHtmlUrl(str) ? FileLinkKind.HTML_ARTIFACT : subKindFromExtension(str), str, str2);
    }

    private final boolean isHtmlUrl(String str) {
        String strExtensionOf = extensionOf(str);
        return "html".equals(strExtensionOf) || "htm".equals(strExtensionOf);
    }

    public static final void splitParagraph$flushPending(List<AuraInline> list, List<AuraBlock> list2) {
        if (!list.isEmpty() && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator<AuraInline> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AuraInline next = it.next();
                if (!(next instanceof AuraInline.SoftLineBreak) && !(next instanceof AuraInline.LineBreak)) {
                    list2.add(new AuraBlock.Paragraph(AGI.A07(list)));
                    break;
                }
            }
        }
        list.clear();
    }

    private final FileLinkKind subKindFromExtension(String str) {
        String strExtensionOf = extensionOf(str);
        return VIDEO_EXTENSIONS.contains(strExtensionOf) ? FileLinkKind.VIDEO : AUDIO_EXTENSIONS.contains(strExtensionOf) ? FileLinkKind.AUDIO : ("html".equals(strExtensionOf) || "htm".equals(strExtensionOf)) ? FileLinkKind.HTML_ARTIFACT : FileLinkKind.FILE;
    }

    private final String toPlainText(AHD<? extends AuraInline> ahd) {
        StringBuilder sbA0w = C60O.A0w();
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            toPlainText$walk(sbA0w, C8j4.A0j(it));
        }
        return sbA0w.toString();
    }
}
