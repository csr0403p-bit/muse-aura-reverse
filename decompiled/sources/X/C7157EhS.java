package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EhS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7157EhS<K, V> {
    public int A00;
    public final Eh0<V> A01;
    public final LinkedHashMap<K, V> A02 = C3cG.A0j();

    public final synchronized int A00() {
        return this.A02.size();
    }

    public final synchronized int A01() {
        return this.A00;
    }

    public final synchronized V A02(K k) {
        V vRemove;
        vRemove = this.A02.remove(k);
        this.A00 -= vRemove == null ? 0 : this.A01.AKf(vRemove);
        return vRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized ArrayList<V> A03(InterfaceC7168Ehd<K> interfaceC7168Ehd) {
        Gu6 gu6;
        gu6 = (ArrayList<V>) C3cG.A0h();
        Iterator itA0i = C3cG.A0i(this.A02);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            Object key = entryA0l.getKey();
            C7384Etj.A0X(key);
            if (interfaceC7168Ehd.apply(key)) {
                gu6.add(entryA0l.getValue());
                int i = this.A00;
                Object value = entryA0l.getValue();
                this.A00 = i - (value == null ? 0 : this.A01.AKf(value));
                itA0i.remove();
            }
        }
        return gu6;
    }

    /* JADX WARN: Incorrect return type in method signature: (TK;TV;)TV; */
    public final synchronized void A04(Object obj, Object obj2) {
        LinkedHashMap<K, V> linkedHashMap = this.A02;
        V vRemove = linkedHashMap.remove(obj);
        this.A00 -= vRemove == null ? 0 : this.A01.AKf(vRemove);
        linkedHashMap.put(obj, obj2);
        this.A00 += this.A01.AKf(obj2);
    }

    public C7157EhS(Eh0<V> eh0) {
        this.A01 = eh0;
    }
}
