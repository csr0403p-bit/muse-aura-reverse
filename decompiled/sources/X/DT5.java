package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DT5<K, V> implements Map.Entry<K, V> {
    public V A00;
    public final K A01;
    public final /* synthetic */ E8S A02;

    public DT5(final E8S this$0, K key, V value) {
        this.A02 = this$0;
        this.A01 = key;
        this.A00 = value;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) object;
        if (this.A01.equals(entry.getKey())) {
            return BV7.A1X(this.A00, entry.getValue(), false);
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.A01;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.A00;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return BV6.A09(this.A00, this.A01.hashCode());
    }

    @Override // java.util.Map.Entry
    public final V setValue(V newValue) {
        V vPut = this.A02.put(this.A01, newValue);
        this.A00 = newValue;
        return vPut;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(getKey());
        sbA0w.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        return C8j3.A14(getValue(), sbA0w);
    }
}
