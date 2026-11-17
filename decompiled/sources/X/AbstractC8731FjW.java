package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.FjW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8731FjW<V, O> implements InterfaceC8761Fk0<V, O> {
    public final List<C8725FjQ<V>> A00;

    @Override // X.InterfaceC8761Fk0
    public final List<C8725FjQ<V>> AGq() {
        return this.A00;
    }

    @Override // X.InterfaceC8761Fk0
    public final boolean AP6() {
        List<C8725FjQ<V>> list = this.A00;
        return list.isEmpty() || (list.size() == 1 && list.get(0).A02());
    }

    public AbstractC8731FjW(List<C8725FjQ<V>> list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        List<C8725FjQ<V>> list = this.A00;
        if (!list.isEmpty()) {
            sbA0w.append("values=");
            sbA0w.append(Arrays.toString(list.toArray()));
        }
        return sbA0w.toString();
    }
}
