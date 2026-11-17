package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableEntry;
import java.util.Map;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes5.dex */
public final class DOU extends AbstractC3450CNv implements Map.Entry {
    public final /* synthetic */ F4F A00;
    public final /* synthetic */ Map.Entry A01;

    @Override // java.util.Map.Entry
    public final boolean equals(Object object) {
        return this.A01.equals(object);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [K, java.lang.Object] */
    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.A01.getKey();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [V, java.lang.Object] */
    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.A01.getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.A01.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [V, java.lang.Object] */
    @Override // java.util.Map.Entry
    public final V setValue(V newValue) {
        Preconditions.checkArgument(((DOO) ((DOS) this.A00.A00).A00).A00.apply(new ImmutableEntry(getKey(), newValue)));
        return this.A01.setValue(newValue);
    }

    public DOU() {
    }

    public DOU(final F4F this$2, final Map.Entry val$entry) {
        this.A01 = val$entry;
        this.A00 = this$2;
    }
}
