package X;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.Beg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2584Beg implements InterfaceC2585Beh {
    public static final C2584Beg A01;
    public static final Comparator<AbstractC2531BdI<?>> A02;
    public final TreeMap<AbstractC2531BdI<?>, Map<BY1, Object>> A00;

    static {
        C7572F4l c7572F4l = new C7572F4l(1);
        A02 = c7572F4l;
        A01 = new C2584Beg(new TreeMap(c7572F4l));
    }

    public static C2584Beg A02(InterfaceC2585Beh interfaceC2585Beh) {
        if (C2584Beg.class.equals(interfaceC2585Beh.getClass())) {
            return (C2584Beg) interfaceC2585Beh;
        }
        TreeMap treeMap = new TreeMap(A02);
        for (AbstractC2531BdI<?> abstractC2531BdI : interfaceC2585Beh.APd()) {
            Set<BY1> setAJ7 = interfaceC2585Beh.AJ7(abstractC2531BdI);
            ArrayMap arrayMap = new ArrayMap();
            for (BY1 by1 : setAJ7) {
                arrayMap.put(by1, interfaceC2585Beh.Abm(abstractC2531BdI, by1));
            }
            treeMap.put(abstractC2531BdI, arrayMap);
        }
        return new C2584Beg(treeMap);
    }

    @Override // X.InterfaceC2585Beh
    public final boolean A74(AbstractC2531BdI<?> abstractC2531BdI) {
        return this.A00.containsKey(abstractC2531BdI);
    }

    @Override // X.InterfaceC2585Beh
    public final void ABW(InterfaceC2588Bek interfaceC2588Bek, String str) {
        Iterator<Map.Entry<AbstractC2531BdI<?>, Map<BY1, Object>>> it = this.A00.tailMap(AbstractC2531BdI.A00(Void.class, str)).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            if (!((C2530BdH) ((AbstractC2531BdI) entryA0l.getKey())).A02.startsWith(str)) {
                return;
            }
            AbstractC2531BdI<?> abstractC2531BdI = (AbstractC2531BdI) entryA0l.getKey();
            C2587Bej c2587Bej = (C2587Bej) interfaceC2588Bek;
            BgT bgT = c2587Bej.A00;
            InterfaceC2585Beh interfaceC2585Beh = c2587Bej.A01;
            bgT.A00.ANk(abstractC2531BdI, interfaceC2585Beh.AIG(abstractC2531BdI), interfaceC2585Beh.Abk(abstractC2531BdI));
        }
    }

    @Override // X.InterfaceC2585Beh
    public final BY1 AIG(AbstractC2531BdI<?> abstractC2531BdI) {
        Map<BY1, Object> map = this.A00.get(abstractC2531BdI);
        if (map != null) {
            return (BY1) Collections.min(map.keySet());
        }
        throw BV5.A0O(abstractC2531BdI, "Option does not exist: ");
    }

    @Override // X.InterfaceC2585Beh
    public final Set<BY1> AJ7(AbstractC2531BdI<?> abstractC2531BdI) {
        Map<BY1, Object> map = this.A00.get(abstractC2531BdI);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // X.InterfaceC2585Beh
    public final Set<AbstractC2531BdI<?>> APd() {
        return Collections.unmodifiableSet(this.A00.keySet());
    }

    @Override // X.InterfaceC2585Beh
    public final <ValueT> ValueT Abk(AbstractC2531BdI<ValueT> abstractC2531BdI) {
        Map<BY1, Object> map = this.A00.get(abstractC2531BdI);
        if (map != null) {
            return (ValueT) map.get(Collections.min(map.keySet()));
        }
        throw BV5.A0O(abstractC2531BdI, "Option does not exist: ");
    }

    @Override // X.InterfaceC2585Beh
    public final <ValueT> ValueT Abm(AbstractC2531BdI<ValueT> abstractC2531BdI, BY1 by1) {
        Map<BY1, Object> map = this.A00.get(abstractC2531BdI);
        if (map == null) {
            throw BV5.A0O(abstractC2531BdI, "Option does not exist: ");
        }
        if (map.containsKey(by1)) {
            return (ValueT) map.get(by1);
        }
        throw BV5.A0P(by1, " with priority=", C3cG.A0f(abstractC2531BdI, "Option does not exist: "));
    }

    public C2584Beg(TreeMap<AbstractC2531BdI<?>, Map<BY1, Object>> treeMap) {
        this.A00 = treeMap;
    }

    @Override // X.InterfaceC2585Beh
    public final <ValueT> ValueT Abl(AbstractC2531BdI<ValueT> abstractC2531BdI, ValueT valuet) {
        try {
            return (ValueT) Abk(abstractC2531BdI);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }
}
