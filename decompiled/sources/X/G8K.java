package X;

import java.util.Collection;
import java.util.List;

/* loaded from: classes6.dex */
public final class G8K implements G8M {
    public final Collection<G7A> A00 = C3cG.A0h();
    public final Collection<List<ADq>> A01 = C3cG.A0h();

    public final void A01(G8M g8m) {
        this.A00.addAll(g8m.AIc());
        this.A01.addAll(g8m.AJN());
    }

    @Override // X.G8M
    public final Collection<G7A> AIc() {
        return this.A00;
    }

    @Override // X.G8M
    public final Collection<List<ADq>> AJN() {
        return this.A01;
    }

    public static void A00(G8L g8l, G8K g8k) {
        g8k.A01.add(g8l.A00());
    }
}
