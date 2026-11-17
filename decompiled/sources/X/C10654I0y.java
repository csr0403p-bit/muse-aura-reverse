package X;

import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.Iterator;

/* renamed from: X.I0y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10654I0y implements G6J {
    public final int $t;

    public C10654I0y(int i) {
        this.$t = i;
    }

    @Override // X.G6J
    public final void AYa(String str, G65 g65, G6G g6g) {
        CharSequence charSequenceA00;
        switch (this.$t) {
            case 0:
                AnonymousClass005.A0x(g6g, str, g65);
                charSequenceA00 = G66.A00(str, g65);
                break;
            case 1:
            default:
                return;
            case 2:
                AnonymousClass005.A10(g6g, str, g65);
                g6g.A01("<pre>");
                g6g.A03(AuraDeeplinkRouteMapper.CODE_PARAM, g65, new CharSequence[0], false);
                Iterator itA00 = G65.A00(g65);
                while (itA00.hasNext()) {
                    G65 g65A1D = AbstractC7607F5u.A1D(itA00);
                    G72 g72 = ((G69) g65A1D).A03;
                    if (g72.equals(AbstractC9205G6l.A09)) {
                        g6g.A01(G6H.A00(G6H.A01(str, g65A1D, false), 4));
                    } else if (g72.equals(AbstractC9205G6l.A0E)) {
                        g6g.A01(PairsDiscretionDocument.TERMINATOR);
                    }
                }
                g6g.A01(PairsDiscretionDocument.TERMINATOR);
                g6g.A02(AuraDeeplinkRouteMapper.CODE_PARAM);
                charSequenceA00 = "</pre>";
                break;
            case 3:
                C7384Etj.A0Y(g6g, 0);
                charSequenceA00 = "<hr />";
                break;
            case 4:
                C7384Etj.A0Y(g6g, 0);
                charSequenceA00 = "<br />";
                break;
        }
        g6g.A01(charSequenceA00);
    }
}
