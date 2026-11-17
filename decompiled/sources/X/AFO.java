package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AFO<K, V> implements Map.Entry<K, V>, BOA {
    public final K A00;
    public final V A01;

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.A00;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.A01;
    }

    public AFO(K k, V v) {
        this.A00 = k;
        this.A01 = v;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw C8j4.A10();
    }

    public final String toString() {
        K key = getKey();
        V value = getValue();
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(key);
        return AnonymousClass006.A0y(value, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, sbA0w);
    }
}
