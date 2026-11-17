package X;

import com.facebook.rsys.logringbuffer.gen.LogRingBufferProxy;
import com.google.common.collect.EvictingQueue;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.DQu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5048DQu extends LogRingBufferProxy {
    public final ConcurrentHashMap<String, C5050DQw> A01 = C60O.A1C();
    public final AtomicLong A02 = BV5.A19();
    public final ConcurrentHashMap<String, Long> A00 = C60O.A1C();
    public volatile int A03 = 2097152;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r0
  0x0021: PHI (r0v2 X.DQw) = (r0v1 X.DQw), (r0v14 X.DQw) binds: [B:6:0x0011, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.facebook.rsys.logringbuffer.gen.LogRingBufferProxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] flush(java.lang.String r13) {
        /*
            r12 = this;
            r9 = 0
            if (r13 != 0) goto L4
            return r9
        L4:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r2 = r12.A00
            r2.remove(r13)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.DQw> r1 = r12.A01
            java.lang.Object r0 = r1.remove(r13)
            X.DQw r0 = (X.C5050DQw) r0
            if (r0 != 0) goto L21
            r12.A01(r13)
            r2.remove(r13)
            java.lang.Object r0 = r1.remove(r13)
            X.DQw r0 = (X.C5050DQw) r0
            if (r0 == 0) goto Lb3
        L21:
            java.lang.Object r2 = r0.A02
            monitor-enter(r2)
            com.google.common.collect.EvictingQueue<X.DQv> r1 = r0.A00     // Catch: java.lang.Throwable -> Lb0
            r7 = 0
            if (r1 == 0) goto L36
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lb0
            if (r0 != 0) goto L36
            java.util.List r7 = X.AbstractC0878AGe.A0X(r1)     // Catch: java.lang.Throwable -> Lb0
            r1.clear()     // Catch: java.lang.Throwable -> Lb0
        L36:
            monitor-exit(r2)
            if (r7 == 0) goto Lb3
            java.util.Iterator r6 = r7.iterator()
            r0 = 0
        L3f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r5 = r6.next()
            X.DQv r5 = (X.C5049DQv) r5
            X.G50<com.facebook.rsys.log.gen.ConsoleLogMetadata> r2 = com.facebook.rsys.log.gen.ConsoleLogMetadata.CONVERTER
            long r2 = r5.A01
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            java.lang.String r12 = r5.A03
            com.facebook.rsys.log.gen.ConsoleLogMetadata r8 = new com.facebook.rsys.log.gen.ConsoleLogMetadata
            r10 = r9
            r8.<init>(r9, r10, r11, r12, r13)
            int r2 = r5.A00
            if (r2 == 0) goto L65
            r4 = 1
            if (r2 == r4) goto L66
            r4 = 2
            if (r2 == r4) goto L66
        L65:
            r4 = 0
        L66:
            java.lang.String r3 = r5.A02
            java.lang.String r2 = "[R]"
            java.lang.String r2 = X.FGI.A0M(r2, r3)
            com.facebook.rsys.log.gen.LogApi.CProxy.consoleLog(r4, r2, r8)
            int r2 = r3.length()
            long r2 = (long) r2
            long r0 = r0 + r2
            goto L3f
        L78:
            int r3 = r7.size()
            java.lang.String r2 = "[P] Flushed "
            java.lang.StringBuilder r3 = X.C60O.A0y(r2, r3)
            java.lang.String r2 = " entries, total message length: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " bytes"
            java.lang.String r4 = X.AnonymousClass001.A0v(r0, r3)
            X.G50<com.facebook.rsys.log.gen.ConsoleLogMetadata> r0 = com.facebook.rsys.log.gen.ConsoleLogMetadata.CONVERTER
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            long r0 = X.BV7.A0Q()
            java.lang.String r12 = java.lang.String.valueOf(r0)
            com.facebook.rsys.log.gen.ConsoleLogMetadata r8 = new com.facebook.rsys.log.gen.ConsoleLogMetadata
            r10 = r9
            r8.<init>(r9, r10, r11, r12, r13)
            r0 = 0
            com.facebook.rsys.log.gen.LogApi.CProxy.consoleLog(r0, r4, r8)
            return r9
        Lb0:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        Lb3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5048DQu.flush(java.lang.String):byte[]");
    }

    @Override // com.facebook.rsys.logringbuffer.gen.LogRingBufferProxy
    public final void log(int i, String str, String str2) {
        List<C5050DQw> listA0X;
        int i2;
        C7384Etj.A0Y(str, 1);
        if (this.A03 > 0) {
            C5049DQv c5049DQv = new C5049DQv(str, System.currentTimeMillis() * 1000, i, String.valueOf(BV7.A0Q()));
            try {
                if (str2 != null) {
                    C5050DQw c5050DQwA01 = this.A01.get(str2);
                    if (c5050DQwA01 == null && (c5050DQwA01 = A01(str2)) == null) {
                        c5050DQwA01 = A00(str2);
                    }
                    listA0X = Collections.singletonList(c5050DQwA01);
                } else {
                    ConcurrentHashMap<String, C5050DQw> concurrentHashMap = this.A01;
                    if (concurrentHashMap.isEmpty()) {
                        A00("__PENDING__");
                    }
                    Collection<C5050DQw> collectionValues = concurrentHashMap.values();
                    C7384Etj.A0U(collectionValues);
                    listA0X = AbstractC0878AGe.A0X(collectionValues);
                }
            } catch (NoSuchElementException unused) {
                listA0X = C0881AGi.A00;
            }
            for (C5050DQw c5050DQw : listA0X) {
                if (c5049DQv.A02.length() != 0 && (i2 = c5050DQw.A01) > 0) {
                    synchronized (c5050DQw.A02) {
                        EvictingQueue<C5049DQv> evictingQueue = c5050DQw.A00;
                        if (evictingQueue == null) {
                            evictingQueue = new EvictingQueue<>(i2);
                            c5050DQw.A00 = evictingQueue;
                        }
                        evictingQueue.add(c5049DQv);
                    }
                }
            }
        }
    }

    private final C5050DQw A00(String str) {
        String key;
        ConcurrentHashMap<String, Long> concurrentHashMap = this.A00;
        if (concurrentHashMap.size() >= 3) {
            Set<Map.Entry<String, Long>> setEntrySet = concurrentHashMap.entrySet();
            C7384Etj.A0U(setEntrySet);
            Iterator<Map.Entry<String, Long>> it = setEntrySet.iterator();
            Map.Entry<String, Long> next = null;
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    Long value = next.getValue();
                    do {
                        Map.Entry<String, Long> next2 = it.next();
                        Long value2 = next2.getValue();
                        if (value.compareTo(value2) > 0) {
                            next = next2;
                            value = value2;
                        }
                    } while (it.hasNext());
                }
            }
            Map.Entry<String, Long> entry = next;
            if (entry != null && (key = entry.getKey()) != null) {
                concurrentHashMap.remove(key);
                this.A01.remove(key);
            }
        }
        C5050DQw c5050DQw = new C5050DQw(this.A03);
        this.A01.put(str, c5050DQw);
        BV4.A1F(str, concurrentHashMap, this.A02.getAndIncrement());
        return c5050DQw;
    }

    private final C5050DQw A01(String str) {
        if ("__PENDING__".equals(str)) {
            return null;
        }
        ConcurrentHashMap<String, C5050DQw> concurrentHashMap = this.A01;
        if (!concurrentHashMap.containsKey("__PENDING__")) {
            return null;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap2 = this.A00;
        concurrentHashMap2.remove("__PENDING__");
        C5050DQw c5050DQwRemove = concurrentHashMap.remove("__PENDING__");
        if (c5050DQwRemove == null) {
            return null;
        }
        concurrentHashMap.put(str, c5050DQwRemove);
        BV4.A1F(str, concurrentHashMap2, this.A02.getAndIncrement());
        return c5050DQwRemove;
    }
}
