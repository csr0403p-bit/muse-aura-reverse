package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class G6Y extends G6B {
    public final F0C A00;

    /* JADX WARN: Incorrect types in method signature: (LX/G72;Ljava/util/List<+LX/G65;>;)V */
    public G6Y(List list, G72 g72) {
        super(list, g72);
        this.A00 = FZP.A00(C79.A0C, this, 25);
    }

    public static final boolean A01(G65 g65) {
        Iterator itA00 = G65.A00(g65);
        int i = 0;
        boolean z = false;
        while (itA00.hasNext()) {
            G72 g72 = ((G69) AbstractC7607F5u.A1D(itA00)).A03;
            if (g72.equals(AbstractC9205G6l.A0E)) {
                i++;
            } else if (!g72.equals(AbstractC9205G6l.A0Q) && !g72.equals(AbstractC9205G6l.A0R) && !g72.equals(AbstractC9205G6l.A0c)) {
                if (z && i > 1) {
                    return true;
                }
                i = 0;
                z = true;
            }
        }
        return false;
    }
}
