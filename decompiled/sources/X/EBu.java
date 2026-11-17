package X;

import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes5.dex */
public final class EBu<V> {
    public int A00;
    public final int A01;
    public final Queue<Object> A02;

    public EBu(int i, int i2, int i3) {
        CVn.A03(i > 0);
        CVn.A03(i2 >= 0);
        CVn.A03(i3 >= 0);
        this.A01 = i2;
        this.A02 = new LinkedList();
        this.A00 = i3;
    }
}
