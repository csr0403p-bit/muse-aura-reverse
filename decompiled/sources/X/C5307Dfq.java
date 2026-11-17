package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* renamed from: X.Dfq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5307Dfq<K, V> implements Map.Entry<K, V> {
    public C5307Dfq<K, V> A00;
    public C5307Dfq<K, V> A01;
    public final K A02;
    public final V A03;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C5307Dfq) {
                C5307Dfq c5307Dfq = (C5307Dfq) obj;
                if (!this.A02.equals(c5307Dfq.A02) || !this.A03.equals(c5307Dfq.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.A02;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.A03;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return BV6.A09(this.A03, this.A02.hashCode());
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw C8j3.A18("An entry modification is not supported");
    }

    public C5307Dfq(K k, V v) {
        this.A02 = k;
        this.A03 = v;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A02);
        sbA0w.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        return C8j3.A14(this.A03, sbA0w);
    }
}
