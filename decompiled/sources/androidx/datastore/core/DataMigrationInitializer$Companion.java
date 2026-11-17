package androidx.datastore.core;

/* loaded from: classes3.dex */
public final class DataMigrationInitializer$Companion {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x007a -> B:21:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007d -> B:21:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(androidx.datastore.core.DataMigrationInitializer$Companion r6, X.C6PM r7, java.util.List r8, X.HtJ r9) throws java.lang.Throwable {
        /*
            r3 = 0
            boolean r0 = r9 instanceof X.C8iS
            if (r0 == 0) goto L2e
            r4 = r9
            X.8iS r4 = (X.C8iS) r4
            int r0 = r4.$t
            if (r0 != r3) goto L2e
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r1 = r4.A03
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L38
            if (r0 == r3) goto L4d
            if (r0 != r5) goto L8d
            java.lang.Object r2 = r4.A02
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r3 = r4.A01
            X.Hqv r3 = (X.C10543Hqv) r3
            goto L34
        L2e:
            X.8iS r4 = new X.8iS
            r4.<init>(r6, r9, r3)
            goto L17
        L34:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L75
            goto L5c
        L38:
            java.util.ArrayList r2 = X.C60O.A12(r1)
            r1 = 0
            X.BUJ r0 = new X.BUJ
            r0.<init>(r8, r2, r1)
            r4.A01 = r2
            r4.A00 = r3
            java.lang.Object r0 = r7.Ahr(r0, r4)
            if (r0 != r6) goto L54
            return r6
        L4d:
            java.lang.Object r2 = r4.A01
            java.util.List r2 = (java.util.List) r2
            X.Hwg.A00(r1)
        L54:
            X.Hqv r3 = X.C3cG.A0z()
            java.util.Iterator r2 = r2.iterator()
        L5c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r2.next()
            X.G0U r0 = (X.G0U) r0
            r4.A01 = r3     // Catch: java.lang.Throwable -> L75
            r4.A02 = r2     // Catch: java.lang.Throwable -> L75
            r4.A00 = r5     // Catch: java.lang.Throwable -> L75
            java.lang.Object r0 = r0.invoke(r4)     // Catch: java.lang.Throwable -> L75
            if (r0 != r6) goto L5c
            goto L83
        L75:
            r1 = move-exception
            T r0 = r3.element
            if (r0 != 0) goto L7d
            r3.element = r1
            goto L5c
        L7d:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.CU7.A01(r0, r1)
            goto L5c
        L83:
            return r6
        L84:
            T r0 = r3.element
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 != 0) goto L91
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L8d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
        L91:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion.A00(androidx.datastore.core.DataMigrationInitializer$Companion, X.6PM, java.util.List, X.HtJ):java.lang.Object");
    }
}
