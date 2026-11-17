package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public final class E8W<K, V> implements HsZ<K, V>, Serializable {
    public static final long serialVersionUID = 1;
    public final E8S<K, V> localCache;

    public E8W(E8Q<? super K, ? super V> builder) {
        this.localCache = new E8S<>(builder);
    }

    private void readObject(ObjectInputStream in) throws InvalidObjectException {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }

    @Override // X.HsZ
    public final ConcurrentMap<K, V> A4o() {
        return this.localCache;
    }

    @Override // X.HsZ
    public final long size() {
        long jMax = 0;
        for (int i = 0; i < this.localCache.A0J.length; i++) {
            jMax += Math.max(0, r7[i].count);
        }
        return jMax;
    }

    public Object writeReplace() {
        return new E8R(this.localCache);
    }
}
