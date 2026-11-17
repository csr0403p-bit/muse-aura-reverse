package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.DQb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5039DQb<K, V> implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
    public int A00;
    public int A01 = -1;
    public boolean A02;
    public final /* synthetic */ DQd A03;

    public C5039DQb(DQd dQd) {
        this.A03 = dQd;
        this.A00 = dQd.size() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.A02) {
            throw C3cG.A0Q("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        DQd dQd = this.A03;
        if (C7384Etj.areEqual(key, dQd.A05(this.A01))) {
            return C8j3.A1W(entry.getValue(), dQd.A07(this.A01), false);
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        if (this.A02) {
            return this.A03.A05(this.A01);
        }
        throw C3cG.A0Q("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        if (this.A02) {
            return this.A03.A07(this.A01);
        }
        throw C3cG.A0Q("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A01, this.A00);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.A02) {
            throw C3cG.A0Q("This container does not support retaining Map.Entry objects");
        }
        DQd dQd = this.A03;
        return AnonymousClass006.A0D(dQd.A05(this.A01)) ^ C3cH.A02(dQd.A07(this.A01));
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.A02) {
            throw BV4.A0T();
        }
        this.A03.A06(this.A01);
        this.A01--;
        this.A00--;
        this.A02 = false;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        if (this.A02) {
            return this.A03.A08(this.A01, v);
        }
        throw C3cG.A0Q("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        this.A01++;
        this.A02 = true;
        return this;
    }

    public final String toString() {
        return FGI.A0U(String.valueOf(getKey()), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, String.valueOf(getValue()));
    }
}
