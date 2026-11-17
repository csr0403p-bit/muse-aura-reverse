package com.facebook.aura.markdown.parser.custom.extensions;

import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06827l3;
import X.C1Lu;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C8j4;
import X.F60;
import X.FGI;
import X.G0U;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class IndexedInlineEntityExtension implements AuraMarkdownExtension {
    public static final int MAX_SENTINEL_INDEX = 9999;
    public static final char SENTINEL_CHAR = '\ufffb';
    public static final String escapedSentinel;
    public static final C06827l3 sentinel;
    public static final IndexedInlineEntityExtension INSTANCE = new IndexedInlineEntityExtension();
    public static final C06827l3 inlineName = C06827l3.A02("[A-Za-z][A-Za-z0-9._-]{0,63}");

    public final class Tally {
        public int entities;
        public boolean entityInsideLink;
        public final String name;
        public boolean strandedSentinel;

        public Tally(String str) {
            C7384Etj.A0Y(str, 0);
            this.name = str;
        }

        public final void walkBlock(AuraBlock auraBlock, boolean z) {
            String str;
            C7384Etj.A0Y(auraBlock, 0);
            if (auraBlock instanceof AuraBlock.Paragraph) {
                Iterator it = ((AuraBlock.Paragraph) auraBlock).inlines.iterator();
                while (it.hasNext()) {
                    walkInline(C8j4.A0j(it), z);
                }
                return;
            }
            if (auraBlock instanceof AuraBlock.Heading) {
                Iterator it2 = ((AuraBlock.Heading) auraBlock).inlines.iterator();
                while (it2.hasNext()) {
                    walkInline(C8j4.A0j(it2), z);
                }
                return;
            }
            if (auraBlock instanceof AuraBlock.BlockQuote) {
                Iterator it3 = ((AuraBlock.BlockQuote) auraBlock).children.iterator();
                while (it3.hasNext()) {
                    walkBlock(C8j4.A0i(it3), z);
                }
                return;
            }
            if (auraBlock instanceof AuraBlock.UnorderedList) {
                Iterator it4 = ((AuraBlock.UnorderedList) auraBlock).items.iterator();
                while (it4.hasNext()) {
                    Iterator it5 = C8j4.A1E(it4).iterator();
                    while (it5.hasNext()) {
                        walkBlock(C8j4.A0i(it5), z);
                    }
                }
                return;
            }
            if (auraBlock instanceof AuraBlock.OrderedList) {
                Iterator it6 = ((AuraBlock.OrderedList) auraBlock).items.iterator();
                while (it6.hasNext()) {
                    Iterator it7 = C8j4.A1E(it6).iterator();
                    while (it7.hasNext()) {
                        walkBlock(C8j4.A0i(it7), z);
                    }
                }
                return;
            }
            if (!(auraBlock instanceof AuraBlock.Table)) {
                if (auraBlock instanceof AuraBlock.CodeBlock) {
                    str = ((AuraBlock.CodeBlock) auraBlock).code;
                } else {
                    if (!(auraBlock instanceof AuraBlock.HtmlBlock)) {
                        if (!(auraBlock instanceof AuraBlock.Custom) && !auraBlock.equals(AuraBlock.ThematicBreak.INSTANCE)) {
                            throw C3cG.A0q();
                        }
                        return;
                    }
                    str = ((AuraBlock.HtmlBlock) auraBlock).html;
                }
                note(str);
                return;
            }
            AuraBlock.Table table = (AuraBlock.Table) auraBlock;
            Iterator it8 = table.header.iterator();
            while (it8.hasNext()) {
                Iterator it9 = C8j4.A1F(it8).iterator();
                while (it9.hasNext()) {
                    walkBlock(C8j4.A0i(it9), z);
                }
            }
            Iterator it10 = table.rows.iterator();
            while (it10.hasNext()) {
                Iterator itA11 = C8j4.A11(it10);
                while (itA11.hasNext()) {
                    Iterator it11 = C8j4.A1F(itA11).iterator();
                    while (it11.hasNext()) {
                        walkBlock(C8j4.A0i(it11), z);
                    }
                }
            }
        }

        public final void walkInline(AuraInline auraInline, boolean z) {
            String str;
            C7384Etj.A0Y(auraInline, 0);
            if (auraInline instanceof AuraInline.Text) {
                str = ((AuraInline.Text) auraInline).text;
            } else if (auraInline instanceof AuraInline.InlineCode) {
                str = ((AuraInline.InlineCode) auraInline).code;
            } else {
                if (auraInline instanceof AuraInline.Emphasis) {
                    Iterator it = ((AuraInline.Emphasis) auraInline).children.iterator();
                    while (it.hasNext()) {
                        walkInline(C8j4.A0j(it), z);
                    }
                    return;
                }
                if (auraInline instanceof AuraInline.Strong) {
                    Iterator it2 = ((AuraInline.Strong) auraInline).children.iterator();
                    while (it2.hasNext()) {
                        walkInline(C8j4.A0j(it2), z);
                    }
                    return;
                }
                if (auraInline instanceof AuraInline.Strikethrough) {
                    Iterator it3 = ((AuraInline.Strikethrough) auraInline).children.iterator();
                    while (it3.hasNext()) {
                        walkInline(C8j4.A0j(it3), z);
                    }
                    return;
                }
                if (auraInline instanceof AuraInline.Link) {
                    AuraInline.Link link = (AuraInline.Link) auraInline;
                    note(link.url);
                    note(link.title);
                    Iterator it4 = link.children.iterator();
                    while (it4.hasNext()) {
                        walkInline(C8j4.A0j(it4), true);
                    }
                    return;
                }
                if (auraInline instanceof AuraInline.AutoLink) {
                    str = ((AuraInline.AutoLink) auraInline).url;
                } else {
                    if (!(auraInline instanceof AuraInline.Image)) {
                        if (!(auraInline instanceof AuraInline.Custom)) {
                            if (!auraInline.equals(AuraInline.LineBreak.INSTANCE) && !auraInline.equals(AuraInline.SoftLineBreak.INSTANCE)) {
                                throw C3cG.A0q();
                            }
                            return;
                        } else {
                            if (C7384Etj.areEqual(((AuraInline.Custom) auraInline).name, this.name)) {
                                this.entities++;
                                if (z) {
                                    this.entityInsideLink = true;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    AuraInline.Image image = (AuraInline.Image) auraInline;
                    note(image.url);
                    note(image.alt);
                    str = image.title;
                }
            }
            note(str);
        }

        public final int getEntities() {
            return this.entities;
        }

        public final boolean getEntityInsideLink() {
            return this.entityInsideLink;
        }

        public final boolean getStrandedSentinel() {
            return this.strandedSentinel;
        }

        public final void note(String str) {
            if (str == null || C7BY.A08(str, IndexedInlineEntityExtension.SENTINEL_CHAR, 0) < 0) {
                return;
            }
            this.strandedSentinel = true;
        }

        public final void setEntities(int i) {
            this.entities = i;
        }

        public final void setEntityInsideLink(boolean z) {
            this.entityInsideLink = z;
        }

        public final void setStrandedSentinel(boolean z) {
            this.strandedSentinel = z;
        }
    }

    public static final AuraInline.Custom transform$lambda$0(C1Lu c1Lu) {
        C7384Etj.A0Y(c1Lu, 0);
        return new AuraInline.Custom((String) C8j4.A0q(c1Lu.AG1()), c1Lu.AG1().get(2));
    }

    public final boolean entitiesRenderCleanly(AuraMarkdownDocument auraMarkdownDocument, String str, int i) {
        boolean zA1a = AnonymousClass002.A1a(auraMarkdownDocument, str);
        Tally tally = new Tally(str);
        Iterator it = auraMarkdownDocument.blocks.iterator();
        while (it.hasNext()) {
            tally.walkBlock(C8j4.A0i(it), false);
        }
        if (tally.strandedSentinel || tally.entityInsideLink || tally.entities != i) {
            return false;
        }
        return zA1a;
    }

    public final int sentinelCount(String str, String str2) {
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        int i = 0;
        if (C7BY.A08(str, SENTINEL_CHAR, 0) < 0) {
            return 0;
        }
        Iterator it = C06827l3.A00(str, sentinel).iterator();
        while (it.hasNext()) {
            if (C8j4.A1Y(str2, ((C1Lu) it.next()).AG1(), zA1a ? 1 : 0) && (i = i + 1) < 0) {
                AbstractC0885AGm.A13();
                throw F60.createAndThrow();
            }
        }
        return i;
    }

    public final String sentinelFor(String str, int i) {
        C7384Etj.A0Y(str, 0);
        if (!inlineName.A08(str) || i < 0 || i >= 10000) {
            return null;
        }
        return FGI.A0A(i, "\ufffb", str, ":", "\ufffb");
    }

    @Override // com.facebook.aura.markdown.parser.custom.extensions.AuraMarkdownExtension
    public AuraMarkdownDocument transform(AuraMarkdownDocument auraMarkdownDocument) {
        C7384Etj.A0Y(auraMarkdownDocument, 0);
        return AuraInlineMarkerSplitterKt.splitTextInlinesOn(auraMarkdownDocument, sentinel, new G0U() { // from class: com.facebook.aura.markdown.parser.custom.extensions.IndexedInlineEntityExtension$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return IndexedInlineEntityExtension.transform$lambda$0((C1Lu) obj);
            }
        });
    }

    static {
        String strQuote = Pattern.quote("\ufffb");
        C7384Etj.A0U(strQuote);
        escapedSentinel = strQuote;
        sentinel = C06827l3.A02(FGI.A0U(strQuote, "([A-Za-z][A-Za-z0-9._-]{0,63}):(\\d{1,4})", strQuote));
    }

    public final String key(AuraInline.Custom custom, String str) {
        AnonymousClass003.A0u(custom, str);
        if (str.equals(custom.name)) {
            Object obj = custom.payload;
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }
}
