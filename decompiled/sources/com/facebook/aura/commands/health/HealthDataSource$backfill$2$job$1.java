package com.facebook.aura.commands.health;

import X.AbstractC07127nr;
import X.C10543Hqv;
import X.C3UX;
import X.G0V;
import X.HtJ;
import com.facebook.aura.nodes.datasource.DataSourceContext;
import com.facebook.aura.nodes.datasource.DataSourceResult;
import java.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.commands.health.HealthDataSource$backfill$2$job$1", f = "HealthDataSource.kt", l = {130}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HealthDataSource$backfill$2$job$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ DataSourceContext $ctx;
    public final /* synthetic */ Instant $effectiveEnd;
    public final /* synthetic */ Instant $effectiveStart;
    public final /* synthetic */ String $endEcho;
    public final /* synthetic */ String $startDate;
    public final /* synthetic */ C10543Hqv<DataSourceResult> $uploadResult;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthDataSource$backfill$2$job$1(C10543Hqv<DataSourceResult> c10543Hqv, Instant instant, Instant instant2, String str, String str2, DataSourceContext dataSourceContext, HtJ<? super HealthDataSource$backfill$2$job$1> htJ) {
        super(2, htJ);
        this.$uploadResult = c10543Hqv;
        this.$effectiveStart = instant;
        this.$effectiveEnd = instant2;
        this.$startDate = str;
        this.$endEcho = str2;
        this.$ctx = dataSourceContext;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HealthDataSource$backfill$2$job$1(this.$uploadResult, this.$effectiveStart, this.$effectiveEnd, this.$startDate, this.$endEcho, this.$ctx, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Exception {
        /*
            r9 = this;
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto L5a
            java.lang.Object r0 = r9.L$1
            X.Hqv r0 = (X.C10543Hqv) r0
            java.lang.Object r2 = r9.L$0
            X.Hqv r2 = (X.C10543Hqv) r2
            goto L35
        L12:
            X.Hwg.A00(r10)
            X.Hqv<com.facebook.aura.nodes.datasource.DataSourceResult> r0 = r9.$uploadResult
            com.facebook.aura.commands.health.HealthDataSource r3 = com.facebook.aura.commands.health.HealthDataSource.INSTANCE     // Catch: java.lang.Exception -> L3d
            java.time.Instant r4 = r9.$effectiveStart     // Catch: java.lang.Exception -> L3d
            java.time.Instant r5 = r9.$effectiveEnd     // Catch: java.lang.Exception -> L3d
            X.C7384Etj.A0X(r5)     // Catch: java.lang.Exception -> L3d
            java.lang.String r6 = r9.$startDate     // Catch: java.lang.Exception -> L3d
            java.lang.String r7 = r9.$endEcho     // Catch: java.lang.Exception -> L3d
            com.facebook.aura.nodes.datasource.DataSourceContext r8 = r9.$ctx     // Catch: java.lang.Exception -> L3d
            r9.L$0 = r0     // Catch: java.lang.Exception -> L3d
            r9.L$1 = r0     // Catch: java.lang.Exception -> L3d
            r9.label = r1     // Catch: java.lang.Exception -> L3d
            java.lang.Object r10 = com.facebook.aura.commands.health.HealthDataSource.access$runBackfill(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L3d
            if (r10 != r2) goto L33
            return r2
        L33:
            r2 = r0
            goto L38
        L35:
            X.Hwg.A00(r10)     // Catch: java.lang.Exception -> L3b
        L38:
            com.facebook.aura.nodes.datasource.DataSourceResult r10 = (com.facebook.aura.nodes.datasource.DataSourceResult) r10     // Catch: java.lang.Exception -> L3b
            goto L55
        L3b:
            r1 = move-exception
            goto L3f
        L3d:
            r1 = move-exception
            r2 = r0
        L3f:
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L5e
            java.lang.String r1 = r1.getMessage()
            java.lang.String r0 = "Health backfill failed: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "backfill_failed"
            com.facebook.aura.nodes.datasource.DataSourceResult$Error r10 = new com.facebook.aura.nodes.datasource.DataSourceResult$Error
            r10.<init>(r0, r1)
            r0 = r2
        L55:
            r0.element = r10
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L5a:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        L5e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.health.HealthDataSource$backfill$2$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HealthDataSource$backfill$2$job$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
