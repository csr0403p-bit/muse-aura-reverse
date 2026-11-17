package X;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class C0u {
    public final Set<Integer> A00;
    public final ConcurrentHashMap<Integer, AtomicLong> A01;

    public C0u() {
        Set<Integer> setA18 = C60O.A18();
        C7384Etj.A0U(setA18);
        this.A00 = setA18;
        this.A01 = C60O.A1C();
    }
}
