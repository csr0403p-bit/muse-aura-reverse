package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;

/* loaded from: classes6.dex */
public final class G67 implements G6J {
    @Override // X.G6J
    public final void AYa(String str, G65 g65, G6G g6g) {
        boolean z;
        boolean zA1a = AnonymousClass002.A1a(g6g, str);
        C7384Etj.A0Y(g65, 2);
        G72[] g72Arr = {AbstractC9213G6t.A01};
        G65 g652 = g65;
        while (true) {
            g652 = ((G69) g652).A00;
            if (g652 == null) {
                z = false;
                break;
            } else if (BFI.A0J(((G69) g652).A03, g72Arr)) {
                z = true;
                break;
            }
        }
        if (g65.ADb().size() < 2) {
            throw BV4.A0S();
        }
        String strA0L = AbstractC0878AGe.A0L("", "", "", g65.ADb().subList(zA1a ? 1 : 0, AbstractC7607F5u.A0J(g65.ADb(), zA1a ? 1 : 0)), new G68(str, this, z));
        C7384Etj.A0Y(strA0L, 0);
        boolean zA0j = C7BY.A0j(strA0L);
        CharSequence charSequenceSubSequence = strA0L;
        if (!zA0j) {
            int length = strA0L.length();
            int length2 = InviteCodeScratcherKt.CODE_SEPARATOR.length();
            charSequenceSubSequence = (length >= length2 + length2 && C7BY.A0o(strA0L, InviteCodeScratcherKt.CODE_SEPARATOR) && C7BY.A0n(strA0L, InviteCodeScratcherKt.CODE_SEPARATOR)) ? strA0L.subSequence(length2, length - length2) : strA0L.subSequence(0, length);
        }
        g6g.A03(AuraDeeplinkRouteMapper.CODE_PARAM, g65, new CharSequence[0], false);
        g6g.A01(charSequenceSubSequence);
        g6g.A02(AuraDeeplinkRouteMapper.CODE_PARAM);
    }
}
