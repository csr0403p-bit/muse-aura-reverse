package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableBiMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DMu<K, V> extends ImmutableMap.Builder<K, V> {
    public DMu() {
        super(4);
    }

    @Override // com.google.common.collect.ImmutableMap.Builder
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ ImmutableMap buildOrThrow() {
        int i = this.size;
        if (i == 0) {
            return RegularImmutableBiMap.A05;
        }
        this.entriesUsed = true;
        return new RegularImmutableBiMap(i, this.alternatingKeysAndValues);
    }

    @Override // com.google.common.collect.ImmutableMap.Builder
    public final /* bridge */ /* synthetic */ ImmutableMap buildOrThrow() {
        int i = this.size;
        if (i == 0) {
            return RegularImmutableBiMap.A05;
        }
        this.entriesUsed = true;
        return new RegularImmutableBiMap(i, this.alternatingKeysAndValues);
    }

    @Override // com.google.common.collect.ImmutableMap.Builder
    public final /* bridge */ /* synthetic */ ImmutableMap.Builder put(Map.Entry entry) {
        super.put(entry);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMap.Builder
    public final /* bridge */ /* synthetic */ ImmutableMap.Builder put(Object key, Object value) {
        super.put(key, value);
        return this;
    }
}
