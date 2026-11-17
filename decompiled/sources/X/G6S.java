package X;

import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.network.api.HatchUrlSegments;
import java.util.Iterator;
import java.util.List;
import org.intellij.markdown.MarkdownParsingException;

/* loaded from: classes6.dex */
public abstract class G6S implements G6J {
    /* JADX WARN: Multi-variable type inference failed */
    private final void A00(String str, G65 g65, G6G g6g) {
        int i;
        String str2;
        String strA0N;
        G65 g65A02;
        CharSequence charSequenceA00;
        String string;
        String strA0l;
        boolean z;
        CharSequence[] charSequenceArr;
        boolean z2;
        if (!(this instanceof G6M)) {
            if (this instanceof G6T) {
                return;
            }
            if (this instanceof G6L) {
                z = false;
                AnonymousClass002.A1A(g6g, 0, g65);
                str2 = ((G6L) this).A00;
                strA0N = "class=\"user-del\"";
            } else if (!(this instanceof G6O)) {
                G6W g6w = (G6W) this;
                if (g6w instanceof G6V) {
                    return;
                }
                i = 0;
                z = false;
                if (g6w instanceof C9195G6a) {
                    int iA1Z = AnonymousClass005.A1Z(g6g, str, g65);
                    G65 g65A022 = G66.A02(AbstractC9206G6m.A0L, g65);
                    strA0N = null;
                    if (g65A022 != null && (g65A02 = G66.A02(AbstractC9205G6l.A0R, g65A022)) != null && (charSequenceA00 = G66.A00(str, g65A02)) != null && (string = charSequenceA00.toString()) != null && (strA0l = AnonymousClass002.A0l(string)) != null) {
                        String strSubstring = strA0l.substring(0, strA0l.length() - iA1Z);
                        char[] cArr = new char[iA1Z];
                        cArr[0] = '0';
                        String strA0a = C7BY.A0a(strSubstring, cArr);
                        if (!strA0a.equals("1")) {
                            if (strA0a.length() == 0) {
                                strA0a = HatchPriceImpressionEventDataKt.NO_DISCOUNT;
                            }
                            strA0N = FGI.A0N("start=\"", strA0a, '\"');
                        }
                    }
                    str2 = "ol";
                } else {
                    AnonymousClass002.A1A(g6g, 0, g65);
                    str2 = g6w.A00;
                }
            } else {
                if (!(((G6O) this) instanceof G6P)) {
                    return;
                }
                i = 0;
                AnonymousClass002.A1A(g6g, 0, g65);
                str2 = HatchUrlSegments.THUMBNAIL_SIZE_PARAM;
            }
            charSequenceArr = new CharSequence[]{strA0N};
            z2 = z;
            g6g.A03(str2, g65, charSequenceArr, z2);
        }
        G6M g6m = (G6M) this;
        if (g6m instanceof G6N) {
            return;
        }
        i = 0;
        AnonymousClass002.A1A(g6g, 0, g65);
        str2 = g6m.A02;
        charSequenceArr = new CharSequence[i];
        z2 = i;
        g6g.A03(str2, g65, charSequenceArr, z2);
    }

    private final void A01(G6G g6g) {
        String str;
        if (this instanceof G6W) {
            C7384Etj.A0Y(g6g, 0);
            str = ((G6W) this).A00;
        } else if (this instanceof G6M) {
            G6M g6m = (G6M) this;
            if (g6m instanceof G6N) {
                return;
            }
            C7384Etj.A0Y(g6g, 0);
            str = g6m.A02;
        } else {
            if (this instanceof G6T) {
                return;
            }
            if (this instanceof G6L) {
                C7384Etj.A0Y(g6g, 0);
                str = ((G6L) this).A00;
            } else {
                if (!(((G6O) this) instanceof G6P)) {
                    return;
                }
                C7384Etj.A0Y(g6g, 0);
                str = HatchUrlSegments.THUMBNAIL_SIZE_PARAM;
            }
        }
        g6g.A02(str);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    @Override // X.G6J
    public final void AYa(String str, G65 g65, G6G g6g) {
        String strA0U;
        String str2;
        int i;
        List<G65> listADb;
        if (this instanceof G6R) {
            this = (G6R) this;
            AnonymousClass005.A0x(g6g, str, g65);
            this.A00(str, g65, g6g);
            if (this instanceof G6O) {
                i = 0;
                C7384Etj.A0Y(g65, 0);
                List<G65> listADb2 = g65.ADb();
                int i2 = 0;
                while (i2 < listADb2.size() && ((G69) listADb2.get(i2)).A03.equals(AbstractC9205G6l.A0c)) {
                    i2++;
                }
                int size = listADb2.size();
                while (size > i2 && ((G69) listADb2.get(size - 1)).A03.equals(AbstractC9205G6l.A0c)) {
                    size--;
                }
                listADb = listADb2.subList(i2, size);
            } else if (this instanceof G6M) {
                G6M g6m = (G6M) this;
                i = 0;
                C7384Etj.A0Y(g65, 0);
                listADb = g65.ADb().subList(g6m.A00, g65.ADb().size() + g6m.A01);
            } else if (this instanceof G6L) {
                G6L g6l = (G6L) this;
                i = 0;
                C7384Etj.A0Y(g65, 0);
                if (g65.ADb().isEmpty()) {
                    listADb = g65.ADb();
                } else {
                    int iA00 = C60O.A00(g65.ADb());
                    int i3 = 0;
                    do {
                        G72 g72 = ((G69) g65.ADb().get(i3)).A03;
                        G72 g722 = g6l.A01;
                        if (!g72.equals(g722) || !((G69) g65.ADb().get(iA00)).A03.equals(g722)) {
                            break;
                        }
                        i3++;
                        iA00--;
                    } while (i3 < iA00);
                    listADb = g65.ADb().subList(i3, iA00 + 1);
                }
            } else {
                i = 0;
                C7384Etj.A0Y(g65, 0);
                listADb = g65.ADb();
            }
            Iterator<G65> it = listADb.iterator();
            while (it.hasNext()) {
                G65 g65A1D = AbstractC7607F5u.A1D(it);
                if (g65A1D instanceof G6Q) {
                    g6g.A04(g65A1D);
                } else {
                    C7384Etj.A0Y(g65A1D, i);
                    g6g.A00(g65A1D);
                }
            }
        } else if (this instanceof G6U) {
            AnonymousClass005.A0x(g6g, str, g65);
            if (!(g65 instanceof G6X)) {
                throw new MarkdownParsingException("");
            }
            A00(str, g65, g6g);
            G65 g652 = ((G69) g65).A00;
            if (!(g652 instanceof G6Y)) {
                throw new MarkdownParsingException("");
            }
            C7384Etj.A0Z(g652, "null cannot be cast to non-null type org.intellij.markdown.ast.impl.ListCompositeNode");
            boolean zA1a = AbstractC7609F5w.A1a(((G6Y) g652).A00);
            Iterator itA00 = G65.A00(g65);
            while (itA00.hasNext()) {
                G65 g65A1D2 = AbstractC7607F5u.A1D(itA00);
                if (!((G69) g65A1D2).A03.equals(AbstractC9206G6m.A0O) || zA1a) {
                    C7384Etj.A0Y(g65A1D2, 0);
                    g6g.A00(g65A1D2);
                } else {
                    G6T.A00.AYa(str, g65A1D2, g6g);
                }
            }
        } else if (this instanceof G6V) {
            ?? A1Z = AnonymousClass005.A1Z(g6g, str, g65);
            if (!(g65 instanceof G6X)) {
                throw new MarkdownParsingException("");
            }
            G65 g65A02 = G66.A02(AbstractC9213G6t.A02, g65);
            if (g65A02 != null) {
                str2 = "class=\"task-list-item\"";
                CharSequence charSequenceA00 = G66.A00(str, g65A02);
                strA0U = FGI.A0U("<input type=\"checkbox\" class=\"task-list-item-checkbox\"", (charSequenceA00 == null || charSequenceA00.length() <= A1Z || charSequenceA00.charAt(A1Z == true ? 1 : 0) == ' ') ? "" : " checked", " disabled />");
            } else {
                strA0U = "";
                str2 = null;
            }
            boolean z = false;
            g6g.A03("li", g65, new CharSequence[]{str2}, false);
            G65 g653 = ((G69) g65).A00;
            if (!(g653 instanceof G6Y)) {
                throw new MarkdownParsingException("");
            }
            C7384Etj.A0Z(g653, "null cannot be cast to non-null type org.intellij.markdown.ast.impl.ListCompositeNode");
            boolean zA1a2 = AbstractC7609F5w.A1a(((G6Y) g653).A00);
            Iterator itA002 = G65.A00(g65);
            while (itA002.hasNext()) {
                G65 g65A1D3 = AbstractC7607F5u.A1D(itA002);
                if (!(g65A1D3 instanceof G6Q)) {
                    if (z) {
                        C7384Etj.A0Y(g65A1D3, 0);
                        g6g.A00(g65A1D3);
                    } else {
                        if (((G69) g65A1D3).A03.equals(AbstractC9206G6m.A0O)) {
                            if (zA1a2) {
                                g6g.A03(HatchUrlSegments.THUMBNAIL_SIZE_PARAM, g65A1D3, new CharSequence[0], false);
                            }
                            g6g.A01(strA0U);
                            Iterator itA003 = G65.A00(g65A1D3);
                            while (itA003.hasNext()) {
                                G65 g65A1D4 = AbstractC7607F5u.A1D(itA003);
                                if (g65A1D4 instanceof G6Q) {
                                    g6g.A04(g65A1D4);
                                } else {
                                    C7384Etj.A0Y(g65A1D4, 0);
                                    g6g.A00(g65A1D4);
                                }
                            }
                            if (zA1a2) {
                                g6g.A02(HatchUrlSegments.THUMBNAIL_SIZE_PARAM);
                            }
                        } else {
                            g6g.A01(strA0U);
                            C7384Etj.A0Y(g65A1D3, 0);
                            g6g.A00(g65A1D3);
                        }
                        z = true;
                    }
                }
            }
        } else {
            AnonymousClass005.A0x(g6g, str, g65);
            A00(str, g65, g6g);
            Iterator itA004 = G65.A00(g65);
            while (itA004.hasNext()) {
                G65 g65A1D5 = AbstractC7607F5u.A1D(itA004);
                C7384Etj.A0Y(g65A1D5, 0);
                g6g.A00(g65A1D5);
            }
        }
        this.A01(g6g);
    }
}
