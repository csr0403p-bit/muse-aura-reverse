package X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DQi<K, V> extends DPA<K, V> {
    public V A00;
    public final K A01;
    public final /* synthetic */ MapMakerInternalMap A02;

    public DQi(final MapMakerInternalMap this$0, K key, V value) {
        this.A02 = this$0;
        this.A01 = key;
        this.A00 = value;
    }

    @Override // X.DPA, java.util.Map.Entry
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

    @Override // X.DPA, java.util.Map.Entry
    public final int hashCode() {
        return BV6.A09(this.A00, this.A01.hashCode());
    }
}
