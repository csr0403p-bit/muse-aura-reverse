package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class Af9 {
    public int A00;
    public int A01;
    public boolean A02;
    public final List<C1229Af7> A03;
    public final List<AfH>[] A04;
    public final /* synthetic */ C1230Af8 A05;

    public Af9(C1230Af8 c1230Af8, List<C1229Af7> list) {
        this.A05 = c1230Af8;
        this.A03 = list;
        this.A04 = new List[list.size()];
        if (list.isEmpty()) {
            AbstractC1061ATk.A00("NestedPrefetchController shouldn't be created with no states");
            throw F60.createAndThrow();
        }
    }
}
