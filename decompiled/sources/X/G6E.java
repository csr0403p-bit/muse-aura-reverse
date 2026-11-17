package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class G6E implements G6J {
    @Override // X.G6J
    public final void AYa(String str, G65 g65, G6G g6g) {
        AnonymousClass005.A0x(g6g, str, g65);
        Iterator itA00 = G65.A00(g65);
        while (itA00.hasNext()) {
            G65 g65A1D = AbstractC7607F5u.A1D(itA00);
            if (Arrays.asList(AbstractC9205G6l.A0E, AbstractC9205G6l.A0L).contains(((G69) g65A1D).A03)) {
                g6g.A01(G66.A00(str, g65A1D));
            }
        }
        g6g.A01(PairsDiscretionDocument.TERMINATOR);
    }
}
