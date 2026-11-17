package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ERE<K, V> implements Map.Entry<K, V> {
    public int A00;
    public ERE<K, V> A01;
    public ERE<K, V> A02;
    public ERE<K, V> A03;
    public ERE<K, V> A04;
    public ERE<K, V> A05;
    public V A06;
    public final K A07;
    public final boolean A08;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        K k = this.A07;
        Object key = entry.getKey();
        if (k == null) {
            if (key != null) {
                return false;
            }
        } else if (!k.equals(key)) {
            return false;
        }
        V v = this.A06;
        Object value = entry.getValue();
        if (v == null) {
            if (value != null) {
                return false;
            }
        } else if (!v.equals(value)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.A07;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.A06;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return AnonymousClass006.A0D(this.A07) ^ C3cH.A02(this.A06);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        if (v == null && !this.A08) {
            throw BV4.A0a("value == null");
        }
        V v2 = this.A06;
        this.A06 = v;
        return v2;
    }

    public ERE(boolean z) {
        this.A07 = null;
        this.A08 = z;
        this.A04 = this;
        this.A02 = this;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A07);
        sbA0w.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        return C8j3.A14(this.A06, sbA0w);
    }

    /* JADX WARN: Incorrect types in method signature: (ZLX/ERE<TK;TV;>;TK;LX/ERE<TK;TV;>;LX/ERE<TK;TV;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public ERE(ERE ere, ERE ere2, ERE ere3, Object obj, boolean z) {
        this.A03 = ere;
        this.A07 = obj;
        this.A08 = z;
        this.A00 = 1;
        this.A02 = ere2;
        this.A04 = ere3;
        ere3.A02 = this;
        ere2.A04 = this;
    }
}
