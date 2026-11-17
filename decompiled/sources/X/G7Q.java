package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.intellij.markdown.MarkdownParsingException;

/* loaded from: classes6.dex */
public final class G7Q implements InterfaceC9228G7j<C9242G7x> {
    public static final List<HxE<C06827l3, C06827l3>> A00;
    public static final C06827l3 A01;

    static {
        String strA0h = FGI.A0h("<", "[a-zA-Z][a-zA-Z0-9-]*", "(?:", FGI.A0h("\\s+", "[A-Za-z:_][A-Za-z0-9_.:-]*", "(?:", "\\s*=\\s*(?:[^ \"'=<>`]+|'[^']*'|\"[^\"]*\")", ")?"), ")*\\s*/?>");
        String strA0U = FGI.A0U("</", "[a-zA-Z][a-zA-Z0-9-]*", "\\s*>");
        EnumC06837l4 enumC06837l4 = EnumC06837l4.A03;
        HxE hxEA0r = C3cG.A0r(new C06827l3("<(?:script|pre|style)(?: |>|$)", enumC06837l4), new C06827l3("</(?:script|style|pre)>", enumC06837l4));
        HxE hxEA0r2 = C3cG.A0r(C06827l3.A02("<!--"), C06827l3.A02("-->"));
        HxE hxEA0r3 = C3cG.A0r(C06827l3.A02("<\\?"), C06827l3.A02("\\?>"));
        HxE hxEA0r4 = C3cG.A0r(C06827l3.A02("<![A-Z]"), C06827l3.A02(">"));
        HxE hxEA0r5 = C3cG.A0r(C06827l3.A02("<!\\[CDATA\\["), C06827l3.A02("\\]\\]>"));
        HxE hxEA0r6 = C3cG.A0r(new C06827l3(FGI.A0U("</?(?:", AbstractC2159Azp.A0z("address, article, aside, base, basefont, blockquote, body, caption, center, col, colgroup, dd, details, dialog, dir, div, dl, dt, fieldset, figcaption, figure, footer, form, frame, frameset, h1, head, header, hr, html, legend, li, link, main, menu, menuitem, meta, nav, noframes, ol, optgroup, option, p, param, pre, section, source, title, summary, table, tbody, td, tfoot, th, thead, title, tr, track, ul", ", ", "|"), ")(?: |/?>|$)"), enumC06837l4), null);
        StringBuilder sbA0x = C3cI.A0x("(?:", strA0h);
        sbA0x.append('|');
        sbA0x.append(strA0U);
        List<HxE<C06827l3, C06827l3>> listAsList = Arrays.asList(hxEA0r, hxEA0r2, hxEA0r3, hxEA0r4, hxEA0r5, hxEA0r6, C3cG.A0r(C06827l3.A02(AnonymousClass001.A0v(")(?: |$)", sbA0x)), null));
        A00 = listAsList;
        A01 = C06827l3.A02(FGI.A0N("^(", AbstractC0878AGe.A0L("|", "", "", listAsList, new C07338im(13)), ')'));
    }

    @Override // X.InterfaceC9228G7j
    public final boolean ANs(G7T g7t, G7Y g7y) {
        boolean zA1a = AnonymousClass002.A1a(g7t, g7y);
        int iA00 = A00(g7t, g7y);
        if (iA00 < 0 || iA00 >= 6) {
            return false;
        }
        return zA1a;
    }

    public static final int A00(G7T g7t, G7Y g7y) {
        if (InterfaceC9228G7j.A01(g7t, g7y)) {
            CharSequence charSequenceA0c = AbstractC7608F5v.A0c(g7t.A03, g7t.A02);
            int iA00 = InterfaceC9228G7j.A00(charSequenceA0c, 0);
            if (iA00 < charSequenceA0c.length() && charSequenceA0c.charAt(iA00) == '<') {
                C06847l8 c06847l8A01 = C06827l3.A01(AbstractC7608F5v.A0c(charSequenceA0c, iA00).toString(), A01);
                if (c06847l8A01 != null) {
                    C06857lE c06857lE = c06847l8A01.A02;
                    int size = c06857lE.size();
                    List<HxE<C06827l3, C06827l3>> list = A00;
                    if (size != list.size() + 2) {
                        throw new MarkdownParsingException("There are some excess capturing groups probably!");
                    }
                    int size2 = list.size();
                    for (int i = 0; i < size2; i++) {
                        if (c06857lE.A0E(i + 2) != null) {
                            return i;
                        }
                    }
                    throw new MarkdownParsingException("Match found but all groups are empty!");
                }
            }
        }
        return -1;
    }

    @Override // X.InterfaceC9228G7j
    public final List A7s(G7T g7t, C9242G7x c9242G7x, C9236G7r c9236G7r) {
        AnonymousClass005.A0x(g7t, c9236G7r, c9242G7x);
        G7Y g7y = c9242G7x.A01;
        int iA00 = A00(g7t, g7y);
        return iA00 != -1 ? Collections.singletonList(new G7P(A00.get(iA00).second, g7t, c9236G7r, g7y)) : C0881AGi.A00;
    }
}
