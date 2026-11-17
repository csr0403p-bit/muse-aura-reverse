package X;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DTN<K, V> implements Serializable {
    public static final long serialVersionUID = 1;
    public final long capacity;
    public final int concurrencyLevel;
    public final Map<K, V> data;

    public Object readResolve() {
        long j = this.capacity;
        boolean zA1Q = C8j3.A1Q((j > 0L ? 1 : (j == 0L ? 0 : -1)));
        int i = DTL.A04;
        if (!zA1Q) {
            throw BV4.A0P();
        }
        if (j < 0) {
            throw BV4.A0T();
        }
        DTL dtl = new DTL(16, 16, j);
        dtl.putAll(this.data);
        return dtl;
    }

    public DTN(DTL<K, V> dtl) {
        this.concurrencyLevel = dtl.concurrencyLevel;
        this.data = BV4.A0w(dtl);
        this.capacity = dtl.capacity.get();
    }
}
