package X;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* renamed from: X.I0z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10655I0z implements G6J {
    public final int $t;
    public final Object A00;

    public C10655I0z(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.G6J
    public final void AYa(String str, G65 g65, G6G g6g) throws UnsupportedEncodingException {
        CharSequence charSequenceA00;
        CharSequence charSequenceSubSequence;
        int i;
        int i2 = this.$t;
        boolean zA1Z = AnonymousClass005.A1Z(g6g, str, g65);
        if (i2 != 0) {
            charSequenceSubSequence = G66.A00(str, g65);
            G72[] g72Arr = {AbstractC9206G6m.A0I, AbstractC9206G6m.A0J};
            G65 g652 = g65;
            do {
                g652 = ((G69) g652).A00;
                if (g652 == null) {
                    int iA08 = C7BY.A08(charSequenceSubSequence, '/', 0);
                    if (iA08 == -1 || iA08 == 0 || (i = iA08 + 1) >= charSequenceSubSequence.length() || charSequenceSubSequence.charAt(iA08 - (zA1Z ? 1 : 0)) != ':' || charSequenceSubSequence.charAt(i) != '/') {
                        charSequenceA00 = AnonymousClass007.A0a(((AbstractC9198G6d) this.A00).makeHttpsAutoLinks ? "https://" : AnonymousClass000.A00(29), charSequenceSubSequence);
                    } else {
                        charSequenceA00 = charSequenceSubSequence;
                    }
                }
            } while (!BFI.A0J(((G69) g652).A03, g72Arr));
            g6g.A01(charSequenceSubSequence);
            return;
        }
        charSequenceA00 = G66.A00(str, g65);
        Map<Character, String> map = C7l2.A00;
        charSequenceSubSequence = charSequenceA00.subSequence(zA1Z ? 1 : 0, charSequenceA00.length() - (zA1Z ? 1 : 0));
        String strA00 = C7l2.A00(charSequenceSubSequence, zA1Z, false);
        String strA01 = C9211G6r.A02.A01(charSequenceA00, false);
        if (((C9202G6h) this.A00).useSafeLinks) {
            C7384Etj.A0Y(strA01, 0);
            if (HqL.A01.A07(C7BY.A0F(strA01)) && !HqL.A00.A07(C7BY.A0F(strA01))) {
                strA01 = "#";
            }
        }
        g6g.A03("a", g65, new CharSequence[]{C8j3.A16(C3cG.A0f(strA01, "href=\""), '\"')}, false);
        g6g.A01(strA00);
        g6g.A02("a");
    }
}
