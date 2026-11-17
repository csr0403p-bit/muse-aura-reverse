package com.facebook.aura.markdown.parser.custom.adapter;

import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC0878AGe;
import X.AbstractC7607F5u;
import X.AbstractC9205G6l;
import X.AbstractC9206G6m;
import X.AbstractC9212G6s;
import X.AbstractC9213G6t;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BQG;
import X.BV4;
import X.BV5;
import X.BV7;
import X.C0881AGi;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C9209G6p;
import X.C9211G6r;
import X.C9tI;
import X.FGI;
import X.G0U;
import X.G65;
import X.G66;
import X.G69;
import X.G72;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.ast.ListItem;
import com.facebook.aura.markdown.parser.ast.TableAlignment;
import com.facebook.aura.markdown.parser.ast.TableCell;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class JetBrainsAstAdapter {
    public final C9211G6r linkMap;
    public final CharSequence source;

    private final AuraBlock convertBlock(G65 g65) {
        AuraBlock auraBlockTable;
        AHD<AuraInline> ahdA0E;
        AuraBlock htmlBlock;
        G72 g72 = ((G69) g65).A03;
        if (!g72.equals(AbstractC9206G6m.A0O)) {
            if (g72.equals(AbstractC9206G6m.A00)) {
                auraBlockTable = heading(1, g65);
            } else if (g72.equals(AbstractC9206G6m.A01)) {
                auraBlockTable = heading(2, g65);
            } else if (g72.equals(AbstractC9206G6m.A02)) {
                auraBlockTable = heading(3, g65);
            } else if (g72.equals(AbstractC9206G6m.A03)) {
                auraBlockTable = heading(4, g65);
            } else if (g72.equals(AbstractC9206G6m.A04)) {
                auraBlockTable = heading(5, g65);
            } else if (g72.equals(AbstractC9206G6m.A05)) {
                auraBlockTable = heading(6, g65);
            } else if (g72.equals(AbstractC9206G6m.A0P)) {
                auraBlockTable = setextHeading(1, g65);
            } else {
                if (!g72.equals(AbstractC9206G6m.A0Q)) {
                    if (g72.equals(AbstractC9206G6m.A07)) {
                        List<G65> listADb = g65.ADb();
                        ArrayList arrayListA0h = C3cG.A0h();
                        Iterator<G65> it = listADb.iterator();
                        while (it.hasNext()) {
                            AuraBlock auraBlockConvertBlock = convertBlock(it.next());
                            if (auraBlockConvertBlock != null) {
                                arrayListA0h.add(auraBlockConvertBlock);
                            }
                        }
                        htmlBlock = new AuraBlock.BlockQuote(AGI.A07(arrayListA0h));
                    } else if (g72.equals(AbstractC9206G6m.A0T)) {
                        auraBlockTable = unorderedList(g65);
                    } else if (g72.equals(AbstractC9206G6m.A0N)) {
                        auraBlockTable = orderedList(g65);
                    } else if (g72.equals(AbstractC9206G6m.A09)) {
                        auraBlockTable = codeFence(g65);
                    } else if (g72.equals(AbstractC9206G6m.A08)) {
                        auraBlockTable = indentedCodeBlock(g65);
                    } else if (g72.equals(AbstractC9206G6m.A0D)) {
                        htmlBlock = new AuraBlock.HtmlBlock(G66.A01(this, g65));
                    } else {
                        if (g72.equals(AbstractC9206G6m.A0G)) {
                            return null;
                        }
                        if (g72.equals(AbstractC9212G6s.A01)) {
                            ahdA0E = AGI.A0E(rawText(g65));
                        } else if (g72.equals(AbstractC9212G6s.A06)) {
                            auraBlockTable = table(g65);
                        } else {
                            if (!g72.equals(AbstractC9205G6l.A0K)) {
                                if (g72.equals(AbstractC9205G6l.A0E)) {
                                    return null;
                                }
                                g72.equals(AbstractC9205G6l.A0c);
                                return null;
                            }
                            auraBlockTable = AuraBlock.ThematicBreak.INSTANCE;
                        }
                    }
                    return htmlBlock;
                }
                auraBlockTable = setextHeading(2, g65);
            }
            return auraBlockTable;
        }
        ahdA0E = collectInlines(g65.ADb());
        htmlBlock = new AuraBlock.Paragraph(ahdA0E);
        return htmlBlock;
    }

    private final AuraInline convertInline(G65 g65) {
        AuraInline auraInlineRawText;
        AuraInline inlineCode;
        G72 g72 = ((G69) g65).A03;
        if (g72.equals(AbstractC9205G6l.A0a) || g72.equals(AbstractC9205G6l.A0c) || g72.equals(AbstractC9205G6l.A0Z) || g72.equals(AbstractC9205G6l.A0B) || g72.equals(AbstractC9205G6l.A0S) || g72.equals(AbstractC9205G6l.A0V) || g72.equals(AbstractC9205G6l.A0N) || g72.equals(AbstractC9205G6l.A0U) || g72.equals(AbstractC9205G6l.A0T) || g72.equals(AbstractC9205G6l.A0I) || g72.equals(AbstractC9205G6l.A0A) || g72.equals(AbstractC9205G6l.A0G) || g72.equals(AbstractC9205G6l.A0b) || g72.equals(AbstractC9205G6l.A0D) || g72.equals(AbstractC9205G6l.A03) || g72.equals(AbstractC9213G6t.A06) || g72.equals(AbstractC9213G6t.A03) || g72.equals(AbstractC9212G6s.A01) || g72.equals(AbstractC9212G6s.A03)) {
            auraInlineRawText = rawText(g65);
        } else if (g72.equals(AbstractC9205G6l.A0E)) {
            auraInlineRawText = AuraInline.SoftLineBreak.INSTANCE;
        } else {
            if (!g72.equals(AbstractC9205G6l.A0J)) {
                if (g72.equals(AbstractC9206G6m.A0B)) {
                    inlineCode = new AuraInline.Emphasis(collectInlines(unwrapDelimiters(g65.ADb())));
                } else if (g72.equals(AbstractC9206G6m.A0S)) {
                    inlineCode = new AuraInline.Strong(collectInlines(unwrapDelimiters(g65.ADb())));
                } else if (g72.equals(AbstractC9212G6s.A05)) {
                    inlineCode = new AuraInline.Strikethrough(collectInlines(unwrapDelimiters(g65.ADb())));
                } else if (g72.equals(AbstractC9206G6m.A0A)) {
                    inlineCode = new AuraInline.InlineCode(unwrapCodeSpanText(g65));
                } else if (g72.equals(AbstractC9206G6m.A0F)) {
                    auraInlineRawText = inlineLink(g65);
                } else {
                    if (g72.equals(AbstractC9206G6m.A0C) || g72.equals(AbstractC9206G6m.A0R)) {
                        return referenceLink(g65);
                    }
                    if (g72.equals(AbstractC9206G6m.A06) || g72.equals(AbstractC9205G6l.A02) || g72.equals(AbstractC9205G6l.A0C) || g72.equals(AbstractC9213G6t.A04)) {
                        return autoLink(g65);
                    }
                    if (!g72.equals(AbstractC9206G6m.A0E)) {
                        return null;
                    }
                    auraInlineRawText = image(g65);
                }
                return inlineCode;
            }
            auraInlineRawText = AuraInline.LineBreak.INSTANCE;
        }
        return auraInlineRawText;
    }

    public static final CharSequence unwrapCodeSpanText$lambda$0(JetBrainsAstAdapter jetBrainsAstAdapter, G65 g65) {
        C7384Etj.A0Y(g65, 1);
        return G66.A01(jetBrainsAstAdapter, g65);
    }

    public final AuraMarkdownDocument convert(G65 g65) {
        C7384Etj.A0Y(g65, 0);
        G72 g72 = ((G69) g65).A03;
        if (!g72.equals(AbstractC9206G6m.A0M)) {
            throw BV5.A0O(g72, "Root must be MARKDOWN_FILE, was ");
        }
        List<G65> listADb = g65.ADb();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<G65> it = listADb.iterator();
        while (it.hasNext()) {
            AuraBlock auraBlockConvertBlock = convertBlock(it.next());
            if (auraBlockConvertBlock != null) {
                arrayListA0h.add(auraBlockConvertBlock);
            }
        }
        return new AuraMarkdownDocument(AGI.A07(arrayListA0h));
    }

    private final AuraBlock.CodeBlock codeFence(G65 g65) {
        String strA0l;
        CharSequence charSequenceA00;
        String string;
        G65 g65A02 = G66.A02(AbstractC9205G6l.A0H, g65);
        if (g65A02 == null || (charSequenceA00 = G66.A00(this.source, g65A02)) == null || (string = charSequenceA00.toString()) == null || (strA0l = AnonymousClass002.A0l(string)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        G72 g72 = AbstractC9205G6l.A07;
        boolean zA1X = false;
        boolean zA1Y = AnonymousClass002.A1Y(G66.A02(g72, g65));
        List<G65> listADb = g65.ADb();
        G65 g652 = (G65) AbstractC0878AGe.A0I(listADb);
        if (C7384Etj.areEqual(g652 != null ? ((G69) g652).A03 : null, g72)) {
            listADb = listADb.subList(0, AbstractC7607F5u.A0J(listADb, 1));
        }
        StringBuilder sbA0w = C60O.A0w();
        Iterator<G65> it = listADb.iterator();
        while (it.hasNext()) {
            G65 g65A1D = AbstractC7607F5u.A1D(it);
            G72 g722 = ((G69) g65A1D).A03;
            if (!zA1X) {
                zA1X = BV7.A1X(g722, AbstractC9205G6l.A0E, zA1X);
            } else if (g722.equals(AbstractC9205G6l.A06)) {
                BV4.A1O(sbA0w, G66.A00(this.source, g65A1D));
            } else if (g722.equals(AbstractC9205G6l.A0E)) {
                sbA0w.append('\n');
            }
        }
        if (sbA0w.length() > 0 && BQG.A0A(sbA0w) == '\n') {
            sbA0w.setLength(sbA0w.length() - 1);
        }
        return new AuraBlock.CodeBlock(sbA0w.toString(), strA0l, zA1Y);
    }

    private final AuraBlock.Heading heading(int i, G65 g65) {
        G65 g65A02 = G66.A02(AbstractC9205G6l.A00, g65);
        return new AuraBlock.Heading(i, g65A02 != null ? collectInlines(g65A02.ADb()) : AHI.A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.markdown.parser.ast.AuraInline.Image image(X.G65 r8) {
        /*
            r7 = this;
            X.G72 r0 = X.AbstractC9206G6m.A0F
            X.G65 r3 = X.G66.A02(r0, r8)
            r5 = 0
            if (r3 == 0) goto L6c
            X.G72 r0 = X.AbstractC9206G6m.A0J
            X.G65 r2 = X.G66.A02(r0, r3)
            X.G72 r0 = X.AbstractC9206G6m.A0H
            X.G65 r1 = X.G66.A02(r0, r3)
            X.G72 r0 = X.AbstractC9206G6m.A0K
            X.G65 r6 = X.G66.A02(r0, r3)
            if (r1 == 0) goto L6e
            java.lang.CharSequence r0 = r7.source
            java.lang.CharSequence r0 = X.G66.A00(r0, r1)
            if (r0 == 0) goto L6e
            java.lang.String r0 = r0.toString()
        L29:
            java.lang.String r1 = ""
            if (r0 != 0) goto L2e
            r0 = r1
        L2e:
            java.lang.String r4 = r7.trimAngles(r0)
            if (r2 == 0) goto L43
            java.lang.CharSequence r0 = r7.source
            java.lang.CharSequence r0 = X.G66.A00(r0, r2)
            if (r0 == 0) goto L43
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L43
            r1 = r0
        L43:
            r3 = 2
            char[] r0 = new char[r3]
            r0 = {x0070: FILL_ARRAY_DATA , data: [91, 93} // fill-array
            java.lang.String r2 = X.C7BY.A0Y(r1, r0)
            if (r6 == 0) goto L66
            java.lang.CharSequence r0 = r7.source
            java.lang.CharSequence r0 = X.G66.A00(r0, r6)
            if (r0 == 0) goto L66
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L66
            char[] r0 = new char[r3]
            r0 = {x0076: FILL_ARRAY_DATA , data: [34, 39} // fill-array
            java.lang.String r5 = X.C7BY.A0Y(r1, r0)
        L66:
            com.facebook.aura.markdown.parser.ast.AuraInline$Image r0 = new com.facebook.aura.markdown.parser.ast.AuraInline$Image
            r0.<init>(r4, r2, r5)
            return r0
        L6c:
            r2 = r5
            r6 = r5
        L6e:
            r0 = r5
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.parser.custom.adapter.JetBrainsAstAdapter.image(X.G65):com.facebook.aura.markdown.parser.ast.AuraInline$Image");
    }

    private final AuraInline.Link inlineLink(G65 g65) {
        String string;
        AHD<AuraInline> ahdCollectInlines;
        CharSequence charSequenceA00;
        String string2;
        CharSequence charSequenceA002;
        G65 g65A02 = G66.A02(AbstractC9206G6m.A0J, g65);
        G65 g65A022 = G66.A02(AbstractC9206G6m.A0H, g65);
        if (g65A022 == null) {
            g65A022 = G66.A02(AbstractC9206G6m.A06, g65);
        }
        G65 g65A023 = G66.A02(AbstractC9206G6m.A0K, g65);
        String strA0Y = null;
        if (g65A022 == null || (charSequenceA002 = G66.A00(this.source, g65A022)) == null || (string = charSequenceA002.toString()) == null) {
            string = "";
        }
        String strTrimAngles = trimAngles(string);
        if (g65A023 != null && (charSequenceA00 = G66.A00(this.source, g65A023)) != null && (string2 = charSequenceA00.toString()) != null) {
            strA0Y = C7BY.A0Y(string2, '\"', '\'');
        }
        if (g65A02 == null || (ahdCollectInlines = collectInlines(unwrapLinkLabel(g65A02.ADb()))) == null) {
            ahdCollectInlines = AHI.A01;
        }
        return new AuraInline.Link(strTrimAngles, strA0Y, ahdCollectInlines);
    }

    private final boolean isBlockNode(G65 g65) {
        G72 g72 = ((G69) g65).A03;
        return g72.equals(AbstractC9206G6m.A0O) || g72.equals(AbstractC9206G6m.A07) || g72.equals(AbstractC9206G6m.A0T) || g72.equals(AbstractC9206G6m.A0N) || g72.equals(AbstractC9206G6m.A09) || g72.equals(AbstractC9206G6m.A08) || g72.equals(AbstractC9206G6m.A0D) || g72.equals(AbstractC9212G6s.A06);
    }

    private final boolean isDelimiterToken(G72 g72) {
        return C7384Etj.areEqual(g72, AbstractC9205G6l.A0D) || C7384Etj.areEqual(g72, AbstractC9213G6t.A06);
    }

    private final int parseListNumber(G65 g65) {
        G65 g65A02 = G66.A02(AbstractC9205G6l.A0R, g65);
        if (g65A02 == null) {
            return 1;
        }
        String strA0l = AnonymousClass002.A0l(G66.A01(this, g65A02));
        int length = strA0l.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!Character.isDigit(strA0l.charAt(i))) {
                strA0l = strA0l.substring(0, i);
                break;
            }
            i++;
        }
        Integer numA0r = C9tI.A0r(strA0l);
        if (numA0r != null) {
            return numA0r.intValue();
        }
        return 1;
    }

    private final AuraInline referenceLink(G65 g65) {
        AuraInline text;
        CharSequence charSequenceA00;
        C9209G6p c9209G6p;
        G65 g65A02 = G66.A02(AbstractC9206G6m.A0I, g65);
        if (g65A02 == null || (charSequenceA00 = G66.A00(this.source, g65A02)) == null || (c9209G6p = this.linkMap.A00.get(AnonymousClass001.A0u(C9211G6r.A01.A03(charSequenceA00, InviteCodeScratcherKt.CODE_SEPARATOR)))) == null) {
            text = new AuraInline.Text(G66.A01(this, g65));
        } else {
            G65 g65A022 = G66.A02(AbstractC9206G6m.A0J, g65);
            if (g65A022 != null) {
                g65A02 = g65A022;
            }
            AHD<AuraInline> ahdCollectInlines = collectInlines(unwrapLinkLabel(g65A02.ADb()));
            if (ahdCollectInlines == null) {
                ahdCollectInlines = AHI.A01;
            }
            String string = c9209G6p.A00.toString();
            CharSequence charSequence = c9209G6p.A01;
            text = new AuraInline.Link(string, charSequence != null ? charSequence.toString() : null, ahdCollectInlines);
        }
        return text;
    }

    private final AuraBlock.Heading setextHeading(int i, G65 g65) {
        G65 g65A02 = G66.A02(AbstractC9205G6l.A0Y, g65);
        return new AuraBlock.Heading(i, g65A02 != null ? collectInlines(g65A02.ADb()) : AHI.A01);
    }

    private final AuraBlock.Table table(G65 g65) {
        AHD<TableCell> ahdExtractCells;
        G65 g65A02 = G66.A02(AbstractC9212G6s.A02, g65);
        List<G65> listADb = g65.ADb();
        ArrayList arrayListA0h = C3cG.A0h();
        for (G65 g652 : listADb) {
            if (((G69) g652).A03.equals(AbstractC9212G6s.A04)) {
                arrayListA0h.add(g652);
            }
        }
        if (g65A02 == null || (ahdExtractCells = extractCells(g65A02)) == null) {
            ahdExtractCells = AHI.A01;
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(extractCells(AbstractC7607F5u.A1D(it)));
        }
        return new AuraBlock.Table(ahdExtractCells, AGI.A07(arrayListA0i), extractTableAlignments(g65, ahdExtractCells.size()));
    }

    private final String trimAngles(String str) {
        return (C7BY.A0m(str, '<') && C7BY.A0l(str, '>')) ? str.substring(1, str.length() - 1) : str;
    }

    public JetBrainsAstAdapter(CharSequence charSequence, C9211G6r c9211G6r) {
        AnonymousClass003.A0u(charSequence, c9211G6r);
        this.source = charSequence;
        this.linkMap = c9211G6r;
    }

    private final AuraInline autoLink(G65 g65) {
        String strTrimAngles = trimAngles(G66.A01(this, g65));
        G72 g72 = ((G69) g65).A03;
        G72 g722 = AbstractC9205G6l.A0C;
        return (g72.equals(g722) || G66.A02(g722, g65) != null) ? new AuraInline.Link(FGI.A0M("mailto:", new URI(null, null, strTrimAngles, null).toASCIIString()), null, AGI.A0E(new AuraInline.Text(strTrimAngles))) : new AuraInline.AutoLink(strTrimAngles);
    }

    private final AHD<AuraInline> collectInlines(List<? extends G65> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        StringBuilder sbA0w = C60O.A0w();
        Iterator<? extends G65> it = list.iterator();
        while (it.hasNext()) {
            AuraInline auraInlineConvertInline = convertInline(AbstractC7607F5u.A1D(it));
            if (auraInlineConvertInline instanceof AuraInline.Text) {
                sbA0w.append(((AuraInline.Text) auraInlineConvertInline).text);
            } else if (auraInlineConvertInline != null) {
                collectInlines$flushText(sbA0w, arrayListA0h);
                arrayListA0h.add(auraInlineConvertInline);
            }
        }
        collectInlines$flushText(sbA0w, arrayListA0h);
        return AGI.A07(arrayListA0h);
    }

    public static final void collectInlines$flushText(StringBuilder sb, List<AuraInline> list) {
        if (sb.length() != 0) {
            String string = sb.toString();
            if (list.isEmpty()) {
                string = C7BY.A0H(string).toString();
            }
            if (string.length() > 0) {
                list.add(new AuraInline.Text(string));
            }
            sb.setLength(0);
        }
    }

    private final AHD<TableCell> extractCells(G65 g65) {
        List<G65> listADb = g65.ADb();
        ArrayList arrayListA0h = C3cG.A0h();
        for (G65 g652 : listADb) {
            if (((G69) g652).A03.equals(AbstractC9213G6t.A01)) {
                arrayListA0h.add(g652);
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            AHD<AuraInline> ahdCollectInlines = collectInlines(AbstractC7607F5u.A1D(it).ADb());
            arrayListA0i.add(new TableCell(ahdCollectInlines.isEmpty() ? AHI.A01 : AGI.A0E(new AuraBlock.Paragraph(ahdCollectInlines))));
        }
        return AGI.A07(arrayListA0i);
    }

    private final AHD<TableAlignment> extractTableAlignments(G65 g65, int i) {
        ArrayList arrayListA11 = C60O.A11(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayListA11.add(TableAlignment.NONE);
        }
        return AGI.A07(arrayListA11);
    }

    private final AuraBlock.CodeBlock indentedCodeBlock(G65 g65) {
        StringBuilder sbA0w = C60O.A0w();
        Iterator itA00 = G65.A00(g65);
        while (itA00.hasNext()) {
            G65 g65A1D = AbstractC7607F5u.A1D(itA00);
            G72 g72 = ((G69) g65A1D).A03;
            if (g72.equals(AbstractC9205G6l.A09)) {
                sbA0w.append(C7BY.A0K("    ", G66.A01(this, g65A1D)));
            } else if (g72.equals(AbstractC9205G6l.A0E)) {
                sbA0w.append('\n');
            }
        }
        if (sbA0w.length() > 0 && BQG.A0A(sbA0w) == '\n') {
            sbA0w.setLength(sbA0w.length() - 1);
        }
        return new AuraBlock.CodeBlock(sbA0w.toString(), null, false);
    }

    private final boolean isTightList(G65 g65) {
        List<G65> listADb = g65.ADb();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<G65> it = listADb.iterator();
        while (it.hasNext()) {
            G69.A00(arrayListA0h, it);
        }
        if (!(arrayListA0h instanceof Collection) || !arrayListA0h.isEmpty()) {
            Iterator it2 = arrayListA0h.iterator();
            while (it2.hasNext()) {
                List<G65> listADb2 = AbstractC7607F5u.A1D(it2).ADb();
                ArrayList arrayListA0h2 = C3cG.A0h();
                for (G65 g652 : listADb2) {
                    if (isBlockNode(g652)) {
                        arrayListA0h2.add(g652);
                    }
                }
                if (arrayListA0h2.size() > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private final AuraBlock.OrderedList orderedList(G65 g65) {
        Object next;
        List<G65> listADb = g65.ADb();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<G65> it = listADb.iterator();
        while (it.hasNext()) {
            G69.A00(arrayListA0h, it);
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            List<G65> listADb2 = AbstractC7607F5u.A1D(it2).ADb();
            ArrayList arrayListA0h2 = C3cG.A0h();
            Iterator<G65> it3 = listADb2.iterator();
            while (it3.hasNext()) {
                AuraBlock auraBlockConvertBlock = convertBlock(it3.next());
                if (auraBlockConvertBlock != null) {
                    arrayListA0h2.add(auraBlockConvertBlock);
                }
            }
            arrayListA0i.add(new ListItem(AGI.A07(arrayListA0h2)));
        }
        AHD ahdA07 = AGI.A07(arrayListA0i);
        Iterator itA00 = G65.A00(g65);
        while (true) {
            if (!itA00.hasNext()) {
                next = null;
                break;
            }
            next = itA00.next();
            if (((G69) ((G65) next)).A03.equals(AbstractC9206G6m.A0L)) {
                break;
            }
        }
        G65 g652 = (G65) next;
        return new AuraBlock.OrderedList(ahdA07, g652 != null ? parseListNumber(g652) : 1, isTightList(g65));
    }

    private final AuraInline.Text rawText(G65 g65) {
        return new AuraInline.Text(G66.A01(this, g65));
    }

    private final AuraBlock.UnorderedList unorderedList(G65 g65) {
        List<G65> listADb = g65.ADb();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<G65> it = listADb.iterator();
        while (it.hasNext()) {
            G69.A00(arrayListA0h, it);
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            List<G65> listADb2 = AbstractC7607F5u.A1D(it2).ADb();
            ArrayList arrayListA0h2 = C3cG.A0h();
            Iterator<G65> it3 = listADb2.iterator();
            while (it3.hasNext()) {
                AuraBlock auraBlockConvertBlock = convertBlock(it3.next());
                if (auraBlockConvertBlock != null) {
                    arrayListA0h2.add(auraBlockConvertBlock);
                }
            }
            arrayListA0i.add(new ListItem(AGI.A07(arrayListA0h2)));
        }
        return new AuraBlock.UnorderedList(AGI.A07(arrayListA0i), isTightList(g65));
    }

    private final String unwrapCodeSpanText(G65 g65) {
        List<G65> listADb = g65.ADb();
        String strA0L = listADb.size() > 2 ? AbstractC0878AGe.A0L("", "", "", listADb.subList(1, AbstractC7607F5u.A0J(listADb, 1)), new G0U() { // from class: com.facebook.aura.markdown.parser.custom.adapter.JetBrainsAstAdapter$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                JetBrainsAstAdapter jetBrainsAstAdapter = this.f$0;
                G65 g652 = (G65) obj;
                C7384Etj.A0Y(g652, 1);
                return G66.A01(jetBrainsAstAdapter, g652);
            }
        }) : "";
        return (C7BY.A0m(strA0L, ' ') && C7BY.A0l(strA0L, ' ') && AnonymousClass002.A0l(strA0L).length() > 0) ? strA0L.substring(1, strA0L.length() - 1) : strA0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<G65> unwrapDelimiters(List<? extends G65> list) {
        if (list.isEmpty()) {
            return list;
        }
        int size = list.size();
        int i = 0;
        while (i < size && isDelimiterToken(((G69) ((G65) list.get(i))).A03)) {
            i++;
        }
        while (size > i && isDelimiterToken(((G69) ((G65) list.get(size - 1))).A03)) {
            size--;
        }
        return i >= size ? C0881AGi.A00 : list.subList(i, size);
    }

    private final List<G65> unwrapLinkLabel(List<? extends G65> list) {
        return list.size() <= 2 ? C0881AGi.A00 : list.subList(1, list.size() - 1);
    }
}
