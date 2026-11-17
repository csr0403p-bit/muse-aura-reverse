package com.facebook.payments.dcp.xapp.cache.prefetch;

import X.InterfaceC10560Hsz;

/* loaded from: classes6.dex */
public abstract class IapPrefetchCache<Key, Result> {
    public static final Companion A02 = new Companion();
    public InterfaceC10560Hsz<Result> A00;
    public volatile Key A01;

    public final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <Key, Result> java.lang.Object A00(com.facebook.payments.dcp.xapp.cache.prefetch.IapPrefetchCache<Key, Result> r7, Key r8, X.HtJ<? super Result> r9) {
            /*
                r6 = this;
                r3 = 5
                boolean r0 = r9 instanceof X.C8912FtU
                if (r0 == 0) goto Ld
                r0 = r9
                X.FtU r0 = (X.C8912FtU) r0
                int r1 = r0.$t
                r0 = 1
                if (r1 == r3) goto Le
            Ld:
                r0 = 0
            Le:
                if (r0 == 0) goto L2b
                r5 = r9
                X.FtU r5 = (X.C8912FtU) r5
                int r2 = r5.A00
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L2b
                int r2 = r2 - r1
                r5.A00 = r2
            L1e:
                java.lang.Object r1 = r5.A03
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r5.A00
                r3 = 0
                r2 = 1
                if (r0 == 0) goto L3a
                if (r0 != r2) goto L35
                goto L31
            L2b:
                X.FtU r5 = new X.FtU
                r5.<init>(r6, r9, r3)
                goto L1e
            L31:
                X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L60
                return r1
            L35:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L3a:
                X.Hwg.A00(r1)
                if (r8 == 0) goto L67
                if (r7 == 0) goto L67
                monitor-enter(r7)
                Key r0 = r7.A01     // Catch: java.lang.Throwable -> L64
                boolean r0 = r8.equals(r0)     // Catch: java.lang.Throwable -> L64
                if (r0 == 0) goto L4f
                X.Hsz<Result> r1 = r7.A00     // Catch: java.lang.Throwable -> L64
                r0 = 1
                if (r1 != 0) goto L50
            L4f:
                r0 = 0
            L50:
                monitor-exit(r7)
                if (r0 == 0) goto L67
                r5.A01 = r3     // Catch: java.lang.Throwable -> L60
                r5.A02 = r3     // Catch: java.lang.Throwable -> L60
                r5.A00 = r2     // Catch: java.lang.Throwable -> L60
                java.lang.Object r3 = r7.A00(r8, r5)     // Catch: java.lang.Throwable -> L60
                if (r3 != r4) goto L67
                return r4
            L60:
                X.C3cG.A1H(r5)
                return r3
            L64:
                r0 = move-exception
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L64
                throw r0
            L67:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.cache.prefetch.IapPrefetchCache.Companion.A00(com.facebook.payments.dcp.xapp.cache.prefetch.IapPrefetchCache, java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(Key r7, X.HtJ<? super Result> r8) throws com.facebook.payments.dcp.xapp.cache.prefetch.PrefetchCacheInvalidKeyException {
        /*
            r6 = this;
            r3 = 6
            boolean r0 = r8 instanceof X.C8912FtU
            if (r0 == 0) goto Ld
            r0 = r8
            X.FtU r0 = (X.C8912FtU) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r3) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L2e
            r5 = r8
            X.FtU r5 = (X.C8912FtU) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r5.A00 = r2
        L1e:
            java.lang.Object r1 = r5.A03
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L3d
            if (r0 != r3) goto L38
            java.lang.Object r2 = r5.A02
            X.HoC r2 = (X.HoC) r2
            goto L34
        L2e:
            X.FtU r5 = new X.FtU
            r5.<init>(r6, r8, r3)
            goto L1e
        L34:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L6e
            goto L59
        L38:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L3d:
            X.Hwg.A00(r1)
            monitor-enter(r6)
            Key r0 = r6.A01     // Catch: java.lang.Throwable -> La4
            boolean r0 = X.C7384Etj.areEqual(r7, r0)     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L84
            X.Hsz<Result> r2 = r6.A00     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L94
            monitor-exit(r6)
            r0 = 0
            X.C8912FtU.A00(r0, r2, r5, r3)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = X.C3cG.A0W(r2, r5)     // Catch: java.lang.Throwable -> L6e
            if (r1 != r4) goto L59
            return r4
        L59:
            monitor-enter(r6)
            boolean r0 = r2.AOG()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L6c
            X.Hsz<Result> r0 = r6.A00     // Catch: java.lang.Throwable -> La4
            if (r0 != r2) goto L6c
            r0 = 0
            r6.A01 = r0     // Catch: java.lang.Throwable -> L6a
            r6.A00 = r0     // Catch: java.lang.Throwable -> L6a
            goto L6c
        L6a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> La4
        L6c:
            monitor-exit(r6)
            return r1
        L6e:
            r1 = move-exception
            monitor-enter(r6)
            boolean r0 = r2.AOG()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L82
            X.Hsz<Result> r0 = r6.A00     // Catch: java.lang.Throwable -> La4
            if (r0 != r2) goto L82
            r0 = 0
            r6.A01 = r0     // Catch: java.lang.Throwable -> L80
            r6.A00 = r0     // Catch: java.lang.Throwable -> L80
            goto L82
        L80:
            r1 = move-exception
            goto La3
        L82:
            monitor-exit(r6)
            throw r1
        L84:
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = "Wrong key used to finish cached request: "
            java.lang.String r0 = X.FGI.A0M(r0, r1)     // Catch: java.lang.Throwable -> La4
            com.facebook.payments.dcp.xapp.cache.prefetch.PrefetchCacheInvalidKeyException r1 = new com.facebook.payments.dcp.xapp.cache.prefetch.PrefetchCacheInvalidKeyException     // Catch: java.lang.Throwable -> La4
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La4
            goto La3
        L94:
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = "Result is missing from cache for "
            java.lang.String r0 = X.FGI.A0M(r0, r1)     // Catch: java.lang.Throwable -> La4
            com.facebook.payments.dcp.xapp.cache.prefetch.PrefetchCacheMissingResultException r1 = new com.facebook.payments.dcp.xapp.cache.prefetch.PrefetchCacheMissingResultException     // Catch: java.lang.Throwable -> La4
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La4
        La3:
            throw r1     // Catch: java.lang.Throwable -> La4
        La4:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.cache.prefetch.IapPrefetchCache.A00(java.lang.Object, X.HtJ):java.lang.Object");
    }
}
