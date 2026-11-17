package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class G6D implements G6J {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.G6J
    public final void AYa(String str, G65 g65, G6G g6g) {
        int iA1Z = AnonymousClass005.A1Z(g6g, str, g65);
        int length = C7BY.A0I(G66.A00(str, g65), AbstractC2159Azp.A0y(InviteCodeScratcherKt.CODE_SEPARATOR, 10)).length();
        g6g.A01("<pre>");
        List<G65> listADb = g65.ADb();
        if (((G69) ((G65) AbstractC0878AGe.A0H(listADb))).A03.equals(AbstractC9205G6l.A07)) {
            listADb = listADb.subList(0, AbstractC7607F5u.A0J(listADb, iA1Z));
        }
        ArrayList arrayListA0h = C3cG.A0h();
        boolean z = false;
        boolean zEquals = false;
        for (G65 g652 : listADb) {
            if (z == iA1Z) {
                G72 g72 = AbstractC9205G6l.A06;
                List listAsList = Arrays.asList(g72, AbstractC9205G6l.A0E);
                G72 g722 = ((G69) g652).A03;
                if (listAsList.contains(g722)) {
                    g6g.A01(G6H.A00(G6H.A01(str, g652, false), length));
                    zEquals = g722.equals(g72);
                }
            } else {
                G72 g723 = ((G69) g652).A03;
                if (g723.equals(AbstractC9205G6l.A0H)) {
                    String strA0l = AnonymousClass002.A0l(G6H.A01(str, g652, iA1Z).toString());
                    char[] cArr = new char[iA1Z];
                    cArr[0] = ' ';
                    arrayListA0h.add(FGI.A0N("class=\"language-", C60Q.A0n(C7BY.A0g(strA0l, cArr), 0), '\"'));
                }
                if (g723.equals(AbstractC9205G6l.A0E)) {
                    String[] strArr = (String[]) arrayListA0h.toArray(new String[0]);
                    g6g.A03(AuraDeeplinkRouteMapper.CODE_PARAM, g65, (CharSequence[]) Arrays.copyOf(strArr, strArr.length), false);
                    z = true;
                }
            }
        }
        if (!z) {
            String[] strArr2 = (String[]) arrayListA0h.toArray(new String[0]);
            g6g.A03(AuraDeeplinkRouteMapper.CODE_PARAM, g65, (CharSequence[]) Arrays.copyOf(strArr2, strArr2.length), false);
        }
        if (zEquals) {
            g6g.A01(PairsDiscretionDocument.TERMINATOR);
        }
        g6g.A01("</code></pre>");
    }
}
