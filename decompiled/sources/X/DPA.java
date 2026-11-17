package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.base.Objects;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.ImmutableEntry;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class DPA<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public boolean equals(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) object;
        return Objects.equal(getKey(), entry.getKey()) && Objects.equal(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this instanceof DQi ? ((DQi) this).A01 : this instanceof DPS ? ((DPS) this).A05 : this instanceof ImmutableEntry ? ((ImmutableEntry) this).key : ((DQT) this).A01;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        if (this instanceof DQi) {
            return ((DQi) this).A00;
        }
        if (this instanceof DPS) {
            return ((DPS) this).A04;
        }
        if (this instanceof ImmutableEntry) {
            return ((ImmutableEntry) this).value;
        }
        DQT dqt = (DQT) this;
        CompactHashMap compactHashMap = dqt.A02;
        Map<K, V> mapA06 = compactHashMap.A06();
        if (mapA06 != null) {
            return mapA06.get(dqt.A01);
        }
        DQT.A00(dqt);
        int i = dqt.A00;
        if (i == -1) {
            return null;
        }
        Object[] objArr = compactHashMap.A05;
        objArr.getClass();
        return (V) objArr[i];
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        if (this instanceof DQi) {
            DQi dQi = (DQi) this;
            V vPut = dQi.A02.put(dQi.A01, v);
            dQi.A00 = v;
            return vPut;
        }
        if (this instanceof DPS) {
            DPS dps = (DPS) this;
            V v2 = dps.A04;
            dps.A04 = v;
            return v2;
        }
        if (this instanceof ImmutableEntry) {
            throw C8j3.A17();
        }
        DQT dqt = (DQT) this;
        CompactHashMap compactHashMap = dqt.A02;
        Map<K, V> mapA06 = compactHashMap.A06();
        if (mapA06 != null) {
            return mapA06.put(dqt.A01, v);
        }
        DQT.A00(dqt);
        int i = dqt.A00;
        if (i == -1) {
            compactHashMap.put(dqt.A01, v);
            return null;
        }
        Object[] objArr = compactHashMap.A05;
        objArr.getClass();
        V v3 = (V) objArr[i];
        int i2 = dqt.A00;
        Object[] objArr2 = compactHashMap.A05;
        objArr2.getClass();
        objArr2[i2] = v;
        return v3;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return AnonymousClass006.A0D(getKey()) ^ C3cH.A02(getValue());
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(getKey());
        sbA0w.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        return C8j3.A14(getValue(), sbA0w);
    }
}
