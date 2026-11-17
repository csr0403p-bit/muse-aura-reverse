package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class G6B extends G69 {
    public final List<G65> A00;

    @Override // X.G65
    public final List<G65> ADb() {
        return this.A00;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Incorrect types in method signature: (LX/G72;Ljava/util/List<+LX/G65;>;)V */
    public G6B(List list, G72 g72) {
        G65 g65 = (G65) AbstractC0878AGe.A0G(list);
        int i = g65 != null ? ((G69) g65).A02 : 0;
        G65 g652 = (G65) AbstractC0878AGe.A0I(list);
        super(g72, i, g652 != null ? ((G69) g652).A01 : 0);
        this.A00 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            G65 g65A1D = AbstractC7607F5u.A1D(it);
            if (g65A1D instanceof G69) {
                ((G69) g65A1D).A00 = this;
            }
        }
    }
}
