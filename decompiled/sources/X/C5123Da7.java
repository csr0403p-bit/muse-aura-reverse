package X;

import com.facebook.pando.NodeStoreJNI;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.Da7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5123Da7 {
    public static final AtomicReferenceFieldUpdater<C5123Da7, ConcurrentHashMap<?, ?>> A02;
    public static final AtomicReferenceFieldUpdater<C5123Da7, ConcurrentHashMap<?, ?>> A03;
    public final long A00;
    public final NodeStoreJNI A01;
    public volatile ConcurrentHashMap<C2935BpD, Object> reads;
    public volatile ConcurrentHashMap<String, Object> resolverReads;

    public final Object A01(String str, int i) {
        C7384Etj.A0Y(str, 0);
        ConcurrentHashMap<C2935BpD, Object> concurrentHashMap = this.reads;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(new C2935BpD(str, i));
        }
        return null;
    }

    static {
        AtomicReferenceFieldUpdater<C5123Da7, ConcurrentHashMap<?, ?>> atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(C5123Da7.class, ConcurrentHashMap.class, "reads");
        C7384Etj.A0U(atomicReferenceFieldUpdaterNewUpdater);
        A02 = atomicReferenceFieldUpdaterNewUpdater;
        AtomicReferenceFieldUpdater<C5123Da7, ConcurrentHashMap<?, ?>> atomicReferenceFieldUpdaterNewUpdater2 = AtomicReferenceFieldUpdater.newUpdater(C5123Da7.class, ConcurrentHashMap.class, "resolverReads");
        C7384Etj.A0U(atomicReferenceFieldUpdaterNewUpdater2);
        A03 = atomicReferenceFieldUpdaterNewUpdater2;
    }

    public final Object A02(String str, Object obj) {
        ConcurrentHashMap<String, Object> concurrentHashMapA1C;
        do {
            concurrentHashMapA1C = this.resolverReads;
            if (concurrentHashMapA1C != null) {
                break;
            }
            concurrentHashMapA1C = C60O.A1C();
        } while (!AbstractC5217DdT.A00(this, null, concurrentHashMapA1C, A03));
        Object objPutIfAbsent = concurrentHashMapA1C.putIfAbsent(str, obj);
        return objPutIfAbsent == null ? obj : objPutIfAbsent;
    }

    public C5123Da7(NodeStoreJNI nodeStoreJNI, long j) {
        this.A01 = nodeStoreJNI;
        this.A00 = j;
    }

    public final Object A00(Object obj, String str, int i) {
        ConcurrentHashMap<C2935BpD, Object> concurrentHashMapA1C;
        AnonymousClass003.A0v(str, obj);
        do {
            concurrentHashMapA1C = this.reads;
            if (concurrentHashMapA1C != null) {
                break;
            }
            concurrentHashMapA1C = C60O.A1C();
        } while (!AbstractC5217DdT.A00(this, null, concurrentHashMapA1C, A02));
        Object objPutIfAbsent = concurrentHashMapA1C.putIfAbsent(new C2935BpD(str, i), obj);
        return objPutIfAbsent == null ? obj : objPutIfAbsent;
    }
}
