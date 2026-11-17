package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Hhm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10439Hhm implements InterfaceC9568GPa {
    public final AtomicReference<Map<String, GPY>> A00 = BV4.A16(C9jH.A00);

    @Override // X.InterfaceC9568GPa
    public final GPY ABx(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A00.get().get(str);
    }

    @Override // X.InterfaceC9568GPa
    public final void AYk(GPY gpy) {
        AtomicReference<Map<String, GPY>> atomicReference;
        Map<String, GPY> map;
        HashMap mapA0w;
        C7384Etj.A0Y(gpy, 0);
        do {
            atomicReference = this.A00;
            map = atomicReference.get();
            C7384Etj.A0X(map);
            mapA0w = BV4.A0w(map);
            C10606Hye c10606HyeAJ9 = gpy.AJ9();
            mapA0w.put(c10606HyeAJ9.A06, gpy);
            String str = c10606HyeAJ9.A03;
            if (str != null) {
                mapA0w.put(str, gpy);
            }
        } while (!Bs8.A00(map, mapA0w, atomicReference));
    }

    @Override // X.InterfaceC9568GPa
    public final void Aad(GPY gpy) {
        AtomicReference<Map<String, GPY>> atomicReference;
        Map<String, GPY> map;
        HashMap mapA0w;
        C7384Etj.A0Y(gpy, 0);
        do {
            atomicReference = this.A00;
            map = atomicReference.get();
            C7384Etj.A0X(map);
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                if (entryA0l.getValue() == gpy) {
                    AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
                }
            }
            Set setKeySet = linkedHashMapA0j.keySet();
            if (setKeySet.isEmpty()) {
                return;
            }
            mapA0w = BV4.A0w(map);
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                AbstractC7608F5v.A1V(mapA0w, it);
            }
        } while (!Bs8.A00(map, mapA0w, atomicReference));
    }
}
