package X;

import java.util.Map;
import java.util.Map.Entry;

/* loaded from: classes4.dex */
public abstract class AIo<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC0935AIm<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return AbstractC0931AIi.A00(C8j4.A15(obj), this instanceof C0936AIn ? ((C0936AIn) this).A00 : ((AIp) this).A00);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entryA15 = C8j4.A15(obj);
        return this instanceof C0936AIn ? ((C0936AIn) this).A00.remove(entryA15.getKey(), entryA15.getValue()) : ((AIp) this).A00.remove(entryA15.getKey(), entryA15.getValue());
    }
}
