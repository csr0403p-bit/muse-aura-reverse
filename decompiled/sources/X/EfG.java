package X;

import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EfG<T> {
    public static final Map<Object, Integer> A03 = new IdentityHashMap();
    public int A00 = 1;
    public T A01;
    public final InterfaceC3587CVm<T> A02;

    public static void A00(EfG efG) {
        boolean zA1N;
        synchronized (efG) {
            zA1N = AnonymousClass002.A1N(efG.A00);
        }
        if (!zA1N) {
            throw new RuntimeException() { // from class: com.facebook.common.references.SharedReference$NullReferenceException
            };
        }
    }

    public final synchronized T A01() {
        return this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EfG(InterfaceC3587CVm interfaceC3587CVm, Object obj) {
        this.A01 = obj;
        this.A02 = interfaceC3587CVm;
        Map<Object, Integer> map = A03;
        synchronized (map) {
            Integer num = map.get(obj);
            if (num == null) {
                BV4.A1H(obj, map, 1);
            } else {
                BV4.A1H(obj, map, num.intValue() + 1);
            }
        }
    }
}
