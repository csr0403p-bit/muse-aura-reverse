package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DUM<K, V> implements Map.Entry<K, V>, Comparable<DUL<K, V>.Entry> {
    public V A00;

    /* JADX INFO: Incorrect field signature: TK; */
    public final Comparable A01;
    public final /* synthetic */ DUL A02;

    @Override // java.util.Map.Entry
    public final boolean equals(Object o) {
        if (o != this) {
            if (o instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) o;
                Comparable comparable = this.A01;
                Object key = entry.getKey();
                if (comparable != null ? comparable.equals(key) : key == null) {
                    V v = this.A00;
                    Object value = entry.getValue();
                    if (v == null) {
                        if (value == null) {
                        }
                    } else if (v.equals(value)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DUM(final DUL this$0, K key, V value) {
        this.A02 = this$0;
        this.A01 = key;
        this.A00 = value;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object other) {
        return this.A01.compareTo(((DUM) other).A01);
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.A00;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return AnonymousClass006.A0D(this.A01) ^ C3cH.A02(this.A00);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V newValue) {
        DUL.A03(this.A02);
        V v = this.A00;
        this.A00 = newValue;
        return v;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A01);
        sbA0w.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        return C8j3.A14(this.A00, sbA0w);
    }
}
