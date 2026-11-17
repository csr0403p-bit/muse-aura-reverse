package X;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.F4d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC7564F4d implements Callable {
    public final int $t;
    public final Object A00;

    public CallableC7564F4d(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    public static Map A00(CallableC7564F4d callableC7564F4d) {
        return (Map) ((Callable) callableC7564F4d.A00).call();
    }

    public static final void A01(WorkDatabase workDatabase, int i) {
        EK2 ek2 = (EK2) ((WorkDatabase_Impl) workDatabase).A01.getValue();
        BV5.A1D(ek2.A01, new C7592F5f(7, ek2, new EK1("next_job_scheduler_id", Long.valueOf(i))));
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0237  */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v10, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v11, types: [T, java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v17, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v18, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v19, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v23, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v24, types: [T, java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v29, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v32, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.9jH] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T call() {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CallableC7564F4d.call():java.lang.Object");
    }
}
