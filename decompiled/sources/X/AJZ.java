package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class AJZ extends AbstractC0891AGs implements Set, Collection, BOA {
    public final C0959AJm<K, V> A00;

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
            return false;
        }
        AK8 ak8 = this.A00;
        Object obj2 = ak8.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 != null ? obj2.equals(value) : value == null && ak8.containsKey(entry.getKey());
    }

    @Override // X.AbstractC0890AGr, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        C0957AJk<K, V> c0957AJk = this.A00.A00;
        AJV[] ajvArr = new AJV[8];
        int i = 0;
        do {
            ajvArr[i] = new AJW();
            i++;
        } while (i < 8);
        return new C0949AJc(c0957AJk, ajvArr);
    }

    public AJZ(C0959AJm<K, V> c0959AJm) {
        this.A00 = c0959AJm;
    }
}
