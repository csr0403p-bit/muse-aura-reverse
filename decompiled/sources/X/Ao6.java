package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class Ao6 implements AnW {
    public final int A04;
    public final List<Ao6> A05;
    public Float A02 = null;
    public Float A03 = null;
    public Ao7 A00 = null;
    public Ao7 A01 = null;

    public Ao6(List list, int i) {
        this.A04 = i;
        this.A05 = list;
    }

    @Override // X.AnW
    public final boolean APE() {
        return this.A05.contains(this);
    }
}
