package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class E3X implements Comparable<E3X> {
    public long A00 = -9223372036854775807L;
    public final List<E1P> A01 = C3cG.A0h();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(E3X e3x) {
        return (this.A00 > e3x.A00 ? 1 : (this.A00 == e3x.A00 ? 0 : -1));
    }
}
