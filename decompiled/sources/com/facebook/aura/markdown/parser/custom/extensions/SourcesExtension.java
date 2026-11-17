package com.facebook.aura.markdown.parser.custom.extensions;

import X.A6B;
import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06827l3;
import X.C06847l8;
import X.C1Lu;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C7LE;
import X.C8j4;
import X.C9tI;
import X.EnumC06837l4;
import X.F60;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class SourcesExtension implements AuraMarkdownExtension {
    public static final SourcesExtension INSTANCE = new SourcesExtension();
    public static final C06827l3 SOURCES_HEADER = new C06827l3("^\\s*Sources\\s*:\\s*", EnumC06837l4.A03);
    public static final C06827l3 SOURCE_LINE = C06827l3.A02("^\\s*(?:\\[(\\d+)]|(\\d+)\\.)\\s+(?:(.+?)\\s*[\u2014\u2013\\-]\\s*)?(\\S+)\\s*$");
    public static final C06827l3 FOOTNOTE_LINE = new C06827l3("\\^(\\d+):\\s*([^\\^]+?)(?=\\s*\\^\\d+:|$)", EnumC06837l4.A02);

    @Override // com.facebook.aura.markdown.parser.custom.extensions.AuraMarkdownExtension
    public AuraMarkdownDocument transform(AuraMarkdownDocument auraMarkdownDocument) {
        C7384Etj.A0Y(auraMarkdownDocument, 0);
        if (auraMarkdownDocument.blocks.isEmpty()) {
            return auraMarkdownDocument;
        }
        int size = auraMarkdownDocument.blocks.size() - 1;
        AHD<AuraBlock> ahd = auraMarkdownDocument.blocks;
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        boolean z = false;
        int i = 0;
        for (Object obj : ahd) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            AuraBlock custom = (AuraBlock) obj;
            SourcesExtension sourcesExtension = INSTANCE;
            List<SourceReference> listExtractFootnotes = sourcesExtension.extractFootnotes(custom);
            if (listExtractFootnotes != null || (i == size && (listExtractFootnotes = sourcesExtension.extractSources(custom)) != null)) {
                custom = new AuraBlock.Custom(AuraCustomBlockNames.SOURCES, new SourcesPayload(listExtractFootnotes));
                z = true;
            }
            arrayListA0i.add(custom);
            i = i2;
        }
        AHD ahdA07 = AGI.A07(arrayListA0i);
        if (!z) {
            return auraMarkdownDocument;
        }
        C7384Etj.A0Y(ahdA07, 0);
        return new AuraMarkdownDocument(ahdA07);
    }

    private final List<SourceReference> extractFootnotes(AuraBlock auraBlock) {
        if (!(auraBlock instanceof AuraBlock.Paragraph)) {
            return null;
        }
        String footnoteFlatText = toFootnoteFlatText(((AuraBlock.Paragraph) auraBlock).inlines);
        int length = footnoteFlatText.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (C7LE.A00(footnoteFlatText.charAt(i))) {
                i++;
            } else if (i >= 0 && footnoteFlatText.charAt(i) == '^') {
                List<C1Lu> listA02 = A6B.A02(C06827l3.A00(footnoteFlatText, FOOTNOTE_LINE));
                if (listA02.isEmpty()) {
                    return null;
                }
                ArrayList arrayListA0h = C3cG.A0h();
                for (C1Lu c1Lu : listA02) {
                    Integer numA0r = C9tI.A0r((String) C8j4.A0q(c1Lu.AG1()));
                    if (numA0r != null) {
                        int iIntValue = numA0r.intValue();
                        String strA0l = AnonymousClass002.A0l(c1Lu.AG1().get(2));
                        if (!C7BY.A0j(strA0l) && strA0l != null) {
                            arrayListA0h.add(new SourceReference(iIntValue, strA0l, null));
                        }
                    }
                }
                if (!arrayListA0h.isEmpty()) {
                    return arrayListA0h;
                }
            }
        }
        return null;
    }

    private final List<SourceReference> extractFromParagraph(AuraBlock.Paragraph paragraph) {
        C06847l8 c06847l8A01;
        String flatText = toFlatText(paragraph.inlines);
        if (flatText == null) {
            return null;
        }
        List listA0g = C7BY.A0g(flatText, new char[]{'\n'});
        if (listA0g.isEmpty() || (c06847l8A01 = C06827l3.A01((CharSequence) listA0g.get(0), SOURCES_HEADER)) == null) {
            return null;
        }
        List listA0P = c06847l8A01.AJM().A01 + 1 < ((String) listA0g.get(0)).length() ? AbstractC0878AGe.A0P(AbstractC0878AGe.A0Z(listA0g, 1), Collections.singletonList(((String) listA0g.get(0)).substring(c06847l8A01.AJM().A01 + 1))) : AbstractC0878AGe.A0Z(listA0g, 1);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA0P.iterator();
        while (it.hasNext()) {
            SourceReference line = parseLine(AnonymousClass005.A0j(it), null);
            if (line != null) {
                arrayListA0h.add(line);
            }
        }
        if (arrayListA0h.isEmpty()) {
            return null;
        }
        return arrayListA0h;
    }

    private final List<SourceReference> extractSources(AuraBlock auraBlock) {
        if (auraBlock instanceof AuraBlock.Paragraph) {
            return extractFromParagraph((AuraBlock.Paragraph) auraBlock);
        }
        return null;
    }

    public static final void linkText$walk(StringBuilder sb, AuraInline auraInline) {
        if (auraInline instanceof AuraInline.Text) {
            sb.append(((AuraInline.Text) auraInline).text);
            return;
        }
        if (auraInline instanceof AuraInline.Emphasis) {
            Iterator it = ((AuraInline.Emphasis) auraInline).children.iterator();
            while (it.hasNext()) {
                linkText$walk(sb, C8j4.A0j(it));
            }
        } else if (auraInline instanceof AuraInline.Strong) {
            Iterator it2 = ((AuraInline.Strong) auraInline).children.iterator();
            while (it2.hasNext()) {
                linkText$walk(sb, C8j4.A0j(it2));
            }
        } else if (auraInline instanceof AuraInline.Link) {
            Iterator it3 = ((AuraInline.Link) auraInline).children.iterator();
            while (it3.hasNext()) {
                linkText$walk(sb, C8j4.A0j(it3));
            }
        }
    }

    public static /* synthetic */ SourceReference parseLine$default(SourcesExtension sourcesExtension, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return sourcesExtension.parseLine(str, num);
    }

    public static final void toFootnoteFlatText$walk(StringBuilder sb, AuraInline auraInline) {
        String str;
        if (auraInline instanceof AuraInline.Text) {
            str = ((AuraInline.Text) auraInline).text;
        } else {
            if (auraInline instanceof AuraInline.Emphasis) {
                Iterator it = ((AuraInline.Emphasis) auraInline).children.iterator();
                while (it.hasNext()) {
                    toFootnoteFlatText$walk(sb, C8j4.A0j(it));
                }
                return;
            }
            if (auraInline instanceof AuraInline.Strong) {
                Iterator it2 = ((AuraInline.Strong) auraInline).children.iterator();
                while (it2.hasNext()) {
                    toFootnoteFlatText$walk(sb, C8j4.A0j(it2));
                }
                return;
            }
            if (auraInline instanceof AuraInline.Strikethrough) {
                Iterator it3 = ((AuraInline.Strikethrough) auraInline).children.iterator();
                while (it3.hasNext()) {
                    toFootnoteFlatText$walk(sb, C8j4.A0j(it3));
                }
                return;
            }
            if (auraInline instanceof AuraInline.Link) {
                Iterator it4 = ((AuraInline.Link) auraInline).children.iterator();
                while (it4.hasNext()) {
                    toFootnoteFlatText$walk(sb, C8j4.A0j(it4));
                }
                return;
            } else if (auraInline instanceof AuraInline.InlineCode) {
                str = ((AuraInline.InlineCode) auraInline).code;
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

    private final String linkText(AuraInline auraInline) {
        StringBuilder sbA0w = C60O.A0w();
        linkText$walk(sbA0w, auraInline);
        return sbA0w.toString();
    }

    private final SourceReference parseLine(String str, Integer num) {
        int iIntValue;
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() == 0) {
            return null;
        }
        C06847l8 c06847l8A06 = SOURCE_LINE.A06(strA0l);
        if (c06847l8A06 == null) {
            if (num == null || !AnonymousClass006.A1b(AuraDeeplinkHandlerActivity.HTTP, strA0l)) {
                return null;
            }
            return new SourceReference(num.intValue(), null, strA0l);
        }
        Integer numA0r = C9tI.A0r(c06847l8A06.AG1().get(1));
        if (numA0r == null) {
            numA0r = C9tI.A0r(c06847l8A06.AG1().get(2));
        }
        String str2 = c06847l8A06.AG1().get(3);
        if (C7BY.A0j(str2)) {
            str2 = null;
        }
        String str3 = str2;
        String str4 = c06847l8A06.AG1().get(4);
        if (numA0r != null) {
            iIntValue = numA0r.intValue();
        } else {
            if (num == null) {
                return null;
            }
            iIntValue = num.intValue();
        }
        return new SourceReference(iIntValue, str3, str4);
    }

    private final String toFlatText(AHD<? extends AuraInline> ahd) {
        String strLinkText;
        StringBuilder sbA0w = C60O.A0w();
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AuraInline auraInlineA0j = C8j4.A0j(it);
            if (auraInlineA0j instanceof AuraInline.Text) {
                strLinkText = ((AuraInline.Text) auraInlineA0j).text;
            } else if (C7384Etj.areEqual(auraInlineA0j, AuraInline.SoftLineBreak.INSTANCE) || C7384Etj.areEqual(auraInlineA0j, AuraInline.LineBreak.INSTANCE)) {
                sbA0w.append('\n');
            } else if (auraInlineA0j instanceof AuraInline.Link) {
                AuraInline.Link link = (AuraInline.Link) auraInlineA0j;
                int length = link.url.length();
                sbA0w.append("[");
                String strLinkText2 = linkText(auraInlineA0j);
                if (length > 0) {
                    sbA0w.append(strLinkText2);
                    sbA0w.append("](");
                    sbA0w.append(link.url);
                    strLinkText = ")";
                } else {
                    sbA0w.append(strLinkText2);
                    strLinkText = "]";
                }
            } else if (auraInlineA0j instanceof AuraInline.AutoLink) {
                strLinkText = ((AuraInline.AutoLink) auraInlineA0j).url;
            } else {
                if (!(auraInlineA0j instanceof AuraInline.Emphasis) && !(auraInlineA0j instanceof AuraInline.Strong)) {
                    return null;
                }
                strLinkText = linkText(auraInlineA0j);
            }
            sbA0w.append(strLinkText);
        }
        return sbA0w.toString();
    }

    private final String toFootnoteFlatText(AHD<? extends AuraInline> ahd) {
        StringBuilder sbA0w = C60O.A0w();
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            toFootnoteFlatText$walk(sbA0w, C8j4.A0j(it));
        }
        return sbA0w.toString();
    }
}
