package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.G6f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9200G6f implements G6J {
    public static final G6N A02 = new G6N("", 0, 0);
    public static final G6N A03 = new G6N("", 1, -1);
    public final URI A00;
    public final boolean A01;

    private final C9208G6o A00(String str, G65 g65) {
        AbstractC9200G6f abstractC9200G6f;
        String strA01;
        CharSequence charSequenceA00;
        CharSequence charSequenceA002;
        Object next;
        Object next2;
        if (this instanceof C9210G6q) {
            AnonymousClass003.A0u(str, g65);
            C9208G6o c9208G6oA00 = ((C9210G6q) this).A00.A00(str, g65);
            if (c9208G6oA00 == null) {
                return null;
            }
            CharSequence charSequence = c9208G6oA00.A00;
            if (HqL.A01.A07(C7BY.A0F(charSequence)) && !HqL.A00.A07(C7BY.A0F(charSequence))) {
                charSequence = "#";
            }
            return new C9208G6o(charSequence, c9208G6oA00.A01, c9208G6oA00.A02);
        }
        if (!(this instanceof C9199G6e)) {
            if (!(this instanceof C9197G6c)) {
                C9201G6g c9201G6g = (C9201G6g) this;
                AnonymousClass003.A0u(str, g65);
                G65 g65A02 = G66.A02(AbstractC9206G6m.A0F, g65);
                if (g65A02 != null) {
                    abstractC9200G6f = c9201G6g.A00;
                } else {
                    g65A02 = G66.A02(AbstractC9206G6m.A0C, g65);
                    if (g65A02 == null && (g65A02 = G66.A02(AbstractC9206G6m.A0R, g65)) == null) {
                        return null;
                    }
                    abstractC9200G6f = c9201G6g.A01;
                }
                return abstractC9200G6f.A00(str, g65A02);
            }
            boolean zA1Y = C60P.A1Y(str, g65);
            G65 g65A022 = G66.A02(AbstractC9206G6m.A0J, g65);
            String strA00 = null;
            if (g65A022 == null) {
                return null;
            }
            G65 g65A023 = G66.A02(AbstractC9206G6m.A0H, g65);
            if (g65A023 == null || (charSequenceA002 = G66.A00(str, g65A023)) == null || (strA01 = C9211G6r.A02.A01(charSequenceA002, zA1Y)) == null) {
                strA01 = "";
            }
            G65 g65A024 = G66.A02(AbstractC9206G6m.A0K, g65);
            if (g65A024 != null && (charSequenceA00 = G66.A00(str, g65A024)) != null) {
                Map<Character, String> map = C7l2.A00;
                strA00 = C7l2.A00(Hj9.A00(charSequenceA00, "\"\"", "''", "()"), zA1Y, zA1Y);
            }
            return new C9208G6o(strA01, strA00, g65A022);
        }
        C9199G6e c9199G6e = (C9199G6e) this;
        boolean zA1a = AnonymousClass002.A1a(str, g65);
        Iterator itA00 = G65.A00(g65);
        while (true) {
            if (!itA00.hasNext()) {
                next = null;
                break;
            }
            next = itA00.next();
            if (((G69) ((G65) next)).A03.equals(AbstractC9206G6m.A0I)) {
                break;
            }
        }
        G65 g652 = (G65) next;
        if (g652 == null) {
            return null;
        }
        C9211G6r c9211G6r = c9199G6e.A00;
        CharSequence charSequenceA003 = G66.A00(str, g652);
        C7384Etj.A0Y(charSequenceA003, 0);
        C9209G6p c9209G6p = c9211G6r.A00.get(AnonymousClass001.A0u(C9211G6r.A01.A03(charSequenceA003, InviteCodeScratcherKt.CODE_SEPARATOR)));
        if (c9209G6p == null) {
            return null;
        }
        Iterator itA002 = G65.A00(g65);
        while (true) {
            if (!itA002.hasNext()) {
                next2 = null;
                break;
            }
            next2 = itA002.next();
            if (((G69) ((G65) next2)).A03.equals(AbstractC9206G6m.A0J)) {
                break;
            }
        }
        G65 g653 = (G65) next2;
        if (g653 != null) {
            g652 = g653;
        }
        String strA002 = C7l2.A00(c9209G6p.A00, zA1a, zA1a);
        CharSequence charSequence2 = c9209G6p.A01;
        return new C9208G6o(strA002, charSequence2 != null ? C7l2.A00(charSequence2, zA1a, zA1a) : null, g652);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    private final void A01(String str, G65 g65, G6G g6g, C9208G6o c9208G6o) {
        URI uri;
        URI uri2;
        if (this instanceof C9210G6q) {
            AnonymousClass005.A14(g6g, str, g65, c9208G6o);
            ((C9210G6q) this).A00.A01(str, g65, g6g, c9208G6o);
            return;
        }
        if (!(this instanceof C9201G6g)) {
            C7384Etj.A0Y(g6g, 0);
            AnonymousClass005.A11(str, g65, c9208G6o, 1);
            StringBuilder sbA0x = C60O.A0x("href=\"");
            Object string = c9208G6o.A00;
            if ((this.A01 || !C7BY.A0m(string, '#')) && (uri = this.A00) != null) {
                string = string.toString();
                C7384Etj.A0Y(string, 1);
                try {
                    string = C60O.A0o(uri.resolve(string));
                } catch (Throwable unused) {
                }
            }
            sbA0x.append(string);
            String strA16 = C8j3.A16(sbA0x, '\"');
            CharSequence charSequence = c9208G6o.A01;
            g6g.A03("a", g65, new CharSequence[]{strA16, charSequence != null ? C8j3.A16(C3cG.A0f(charSequence, "title=\""), '\"') : null}, false);
            A03.AYa(str, c9208G6o.A02, g6g);
            g6g.A02("a");
            return;
        }
        C7384Etj.A0Y(g6g, 0);
        AnonymousClass005.A11(str, g65, c9208G6o, 1);
        StringBuilder sbA0x2 = C60O.A0x("src=\"");
        Object string2 = c9208G6o.A00;
        if ((this.A01 || !C7BY.A0m(string2, '#')) && (uri2 = this.A00) != null) {
            string2 = string2.toString();
            C7384Etj.A0Y(string2, 1);
            try {
                string2 = C60O.A0o(uri2.resolve(string2));
            } catch (Throwable unused2) {
            }
        }
        sbA0x2.append(string2);
        String strA162 = C8j3.A16(sbA0x2, '\"');
        StringBuilder sbA0x3 = C60O.A0x("alt=\"");
        sbA0x3.append((Object) C9201G6g.A02.A03(G66.A00(str, c9208G6o.A02), ""));
        String strA163 = C8j3.A16(sbA0x3, '\"');
        CharSequence charSequence2 = c9208G6o.A01;
        g6g.A03("img", g65, new CharSequence[]{strA162, strA163, charSequence2 != null ? C8j3.A16(C3cG.A0f(charSequence2, "title=\""), '\"') : null}, true);
    }

    public AbstractC9200G6f(URI uri, boolean z) {
        this.A00 = uri;
        this.A01 = z;
    }

    @Override // X.G6J
    public final void AYa(String str, G65 g65, G6G g6g) {
        AnonymousClass005.A0x(g6g, str, g65);
        C9208G6o c9208G6oA00 = A00(str, g65);
        if (c9208G6oA00 == null) {
            A02.AYa(str, g65, g6g);
        } else {
            A01(str, g65, g6g, c9208G6oA00);
        }
    }
}
