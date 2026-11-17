package X;

import java.util.AbstractMap;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DTI<K, V> extends AbstractMap.SimpleEntry<K, V> {
    public static final long serialVersionUID = 1;
    public final /* synthetic */ DTL this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DTI(DTP dtp, DTP<K, V> dtp2) {
        super(dtp.key, dtp.get().A01);
        this.this$0 = dtp2;
    }

    @Override // java.util.AbstractMap.SimpleEntry, java.util.Map.Entry
    public final V setValue(V v) {
        this.this$0.put(getKey(), v);
        return (V) super.setValue(v);
    }

    public Object writeReplace() {
        return new AbstractMap.SimpleEntry(this);
    }
}
