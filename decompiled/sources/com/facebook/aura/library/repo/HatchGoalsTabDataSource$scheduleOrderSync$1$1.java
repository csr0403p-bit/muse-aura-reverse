package com.facebook.aura.library.repo;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0U;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$scheduleOrderSync$1$1", f = "HatchGoalsTabDataSource.kt", l = {1942, 1943}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchGoalsTabDataSource$scheduleOrderSync$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $block;
    public final /* synthetic */ String $key;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ HatchGoalsTabDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGoalsTabDataSource$scheduleOrderSync$1$1(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, HatchGoalsTabDataSource hatchGoalsTabDataSource, String str, HtJ<? super HatchGoalsTabDataSource$scheduleOrderSync$1$1> htJ) {
        super(2, htJ);
        this.$block = g0u;
        this.this$0 = hatchGoalsTabDataSource;
        this.$key = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchGoalsTabDataSource$scheduleOrderSync$1$1 hatchGoalsTabDataSource$scheduleOrderSync$1$1 = new HatchGoalsTabDataSource$scheduleOrderSync$1$1(this.$block, this.this$0, this.$key, htJ);
        hatchGoalsTabDataSource$scheduleOrderSync$1$1.L$0 = obj;
        return hatchGoalsTabDataSource$scheduleOrderSync$1$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #3 {, blocks: (B:23:0x0051, B:25:0x0059, B:26:0x005e, B:34:0x006c, B:36:0x0074), top: B:48:0x000a }] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r4 = r6.L$0
            X.3UX r4 = (X.C3UX) r4
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 == r1) goto L1d
            if (r0 != r2) goto L18
            java.lang.Object r5 = r6.L$1
            X.Hwg.A00(r7)     // Catch: java.lang.Throwable -> L16
            goto L4a
        L16:
            r4 = move-exception
            goto L65
        L18:
            java.lang.IllegalStateException r4 = X.AnonymousClass001.A0n()
            throw r4
        L1d:
            java.lang.Object r5 = r6.L$1
            X.Hwg.A00(r7)     // Catch: java.lang.Throwable -> L64
            goto L3a
        L23:
            X.Hwg.A00(r7)
            X.78X r5 = X.C3cH.A0t(r4)
            r0 = 0
            r6.L$0 = r0     // Catch: java.lang.Throwable -> L62
            r6.L$1 = r5     // Catch: java.lang.Throwable -> L62
            r6.label = r1     // Catch: java.lang.Throwable -> L62
            r0 = 300(0x12c, double:1.48E-321)
            java.lang.Object r0 = X.C7Bq.A01(r0, r6)     // Catch: java.lang.Throwable -> L62
            if (r0 != r3) goto L3a
            return r3
        L3a:
            X.G0U<X.HtJ<? super kotlin.Unit>, java.lang.Object> r1 = r6.$block     // Catch: java.lang.Throwable -> L62
            r0 = 0
            r6.L$0 = r0     // Catch: java.lang.Throwable -> L62
            r6.L$1 = r5     // Catch: java.lang.Throwable -> L62
            r6.label = r2     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r1.invoke(r6)     // Catch: java.lang.Throwable -> L62
            if (r0 != r3) goto L4a
            return r3
        L4a:
            com.facebook.aura.library.repo.HatchGoalsTabDataSource r3 = r6.this$0
            java.lang.Object r2 = r3.orderSyncLock
            java.lang.String r1 = r6.$key
            monitor-enter(r2)
            java.util.Map<java.lang.String, X.HoC> r0 = r3.orderSyncJobs     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L7b
            if (r0 != r5) goto L5e
            java.util.Map<java.lang.String, X.HoC> r0 = r3.orderSyncJobs     // Catch: java.lang.Throwable -> L7b
            r0.remove(r1)     // Catch: java.lang.Throwable -> L7b
        L5e:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r2)
            return r3
        L62:
            r4 = move-exception
            goto L65
        L64:
            r4 = move-exception
        L65:
            com.facebook.aura.library.repo.HatchGoalsTabDataSource r3 = r6.this$0
            java.lang.Object r2 = r3.orderSyncLock
            java.lang.String r1 = r6.$key
            monitor-enter(r2)
            java.util.Map<java.lang.String, X.HoC> r0 = r3.orderSyncJobs     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L7b
            if (r0 != r5) goto L79
            java.util.Map<java.lang.String, X.HoC> r0 = r3.orderSyncJobs     // Catch: java.lang.Throwable -> L7b
            r0.remove(r1)     // Catch: java.lang.Throwable -> L7b
        L79:
            monitor-exit(r2)
            throw r4
        L7b:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSource$scheduleOrderSync$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchGoalsTabDataSource$scheduleOrderSync$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
