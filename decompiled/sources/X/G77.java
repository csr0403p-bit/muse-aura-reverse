package X;

import java.util.ArrayList;
import java.util.List;
import org.intellij.markdown.parser.CancellationToken;

/* loaded from: classes6.dex */
public abstract class G77 {
    public static final List<G76> A00(List<G7A> list, CancellationToken cancellationToken) {
        ArrayList arrayListA0h = C3cG.A0h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            G7A g7a = list.get(i);
            ADq aDq = g7a.A00;
            int i2 = aDq.A00;
            int i3 = aDq.A01;
            arrayListA0h.add(new G76(g7a, i2, i));
            if (i3 != i2) {
                arrayListA0h.add(new G76(g7a, i3, i));
            }
        }
        AbstractC06907md.A04(arrayListA0h, new C10635I0f(new FZJ(cancellationToken, 17), 7));
        return arrayListA0h;
    }
}
