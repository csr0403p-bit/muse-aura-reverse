package X;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class GQ5<K, V> implements InterfaceC9510GMb<K, V>, Serializable {
    public static final long serialVersionUID = 2;
    public final transient DTL<K, V> A00;
    public final int _initialEntries;
    public final int _maxEntries;

    public Object readResolve() {
        return new GQ5(this._initialEntries, this._maxEntries);
    }

    public GQ5(int i, int i2) {
        this._initialEntries = i;
        this._maxEntries = i2;
        boolean zA1Q = C8j3.A1Q(i);
        int i3 = DTL.A04;
        if (!zA1Q) {
            throw BV4.A0P();
        }
        long j = i2;
        if (j < 0) {
            throw BV4.A0P();
        }
        this.A00 = new DTL<>(4, i, j);
    }
}
