package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class G6H {
    public final String A00;
    public final StringBuilder A01;
    public final Map<G72, G6J> A02;
    public final G65 A03;

    public G6H(String str, G65 g65, C9202G6h c9202G6h) {
        C7384Etj.A0Y(str, 0);
        HashMap mapA0u = BV4.A0u();
        new C9196G6b(str, mapA0u).A00(g65);
        Map<G72, G6J> mapCreateHtmlGeneratingProviders = c9202G6h.createHtmlGeneratingProviders(new C9211G6r(mapA0u), null);
        this.A00 = str;
        this.A03 = g65;
        this.A02 = mapCreateHtmlGeneratingProviders;
        this.A01 = C60O.A0w();
    }

    public static final CharSequence A00(CharSequence charSequence, int i) {
        C7384Etj.A0Y(charSequence, 0);
        if (i == 0) {
            return charSequence;
        }
        StringBuilder sbA0w = C60O.A0w();
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            if (i2 == 0 || charSequence.charAt(i2 - 1) == '\n') {
                sbA0w.append(charSequence.subSequence(i3, i2));
                int i4 = 0;
                while (i4 < i && i2 < charSequence.length()) {
                    char cCharAt = charSequence.charAt(i2);
                    if (cCharAt != ' ') {
                        if (cCharAt != '\t') {
                            break;
                        }
                        i4 += 4 - (i4 % 4);
                    } else {
                        i4++;
                    }
                    i2++;
                }
                if (i4 > i) {
                    sbA0w.append(AbstractC2159Azp.A0y(InviteCodeScratcherKt.CODE_SEPARATOR, i4 - i));
                }
                i3 = i2;
            }
            i2++;
        }
        sbA0w.append(AbstractC7608F5v.A0c(charSequence, i3));
        return sbA0w;
    }

    public static final String A01(String str, G65 g65, boolean z) {
        C7384Etj.A0Y(str, 0);
        if (((G69) g65).A03.equals(AbstractC9205G6l.A05)) {
            return "";
        }
        Map<Character, String> map = C7l2.A00;
        return C7l2.A00(G66.A00(str, g65), z, z);
    }
}
