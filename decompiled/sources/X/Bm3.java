package X;

import java.util.ArrayDeque;

/* loaded from: classes5.dex */
public class Bm3<T> implements InterfaceC2837Bmg<T> {
    public final int A00;
    public final BlN<T> A01;
    public final Object A02 = C3cG.A0T();
    public final ArrayDeque<T> A03;

    @Override // X.InterfaceC2837Bmg
    public final T A8p() {
        T tRemoveLast;
        synchronized (this.A02) {
            tRemoveLast = this.A03.removeLast();
        }
        return tRemoveLast;
    }

    @Override // X.InterfaceC2837Bmg
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.A02) {
            zIsEmpty = this.A03.isEmpty();
        }
        return zIsEmpty;
    }

    /* JADX WARN: Incorrect types in method signature: (ILX/BlN<TT;>;)V */
    public Bm3(BlN blN, int i) {
        this.A00 = i;
        this.A03 = new ArrayDeque<>(i);
        this.A01 = blN;
    }
}
