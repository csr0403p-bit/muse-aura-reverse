package X;

/* loaded from: classes6.dex */
public final class G6K implements G6J {
    public final boolean A00;

    public G6K() {
        this(false);
    }

    @Override // X.G6J
    public final void AYa(String str, G65 g65, G6G g6g) {
        int length;
        boolean zA1a = AnonymousClass002.A1a(g6g, str);
        C7384Etj.A0Y(g65, 2);
        String strA0L = AbstractC0878AGe.A0L("", "", "", g65.ADb().subList(zA1a ? 1 : 0, AbstractC7607F5u.A0J(g65.ADb(), zA1a ? 1 : 0)), new FYV(str, zA1a ? 1 : 0));
        int i = 0;
        while (true) {
            length = strA0L.length();
            if (length - i <= 2 || strA0L.charAt(i) != '`' || strA0L.charAt((length - 1) - i) != '`') {
                break;
            } else {
                i++;
            }
        }
        String strA0l = AnonymousClass002.A0l(strA0L.substring(i, length - i));
        StringBuilder sbA0x = C60O.A0x("inline = \"");
        sbA0x.append(this.A00);
        g6g.A03("span", g65, new CharSequence[]{"class=\"math\"", C8j3.A16(sbA0x, '\"')}, false);
        g6g.A01(strA0l);
        g6g.A02("span");
    }

    public G6K(boolean z) {
        this.A00 = z;
    }
}
