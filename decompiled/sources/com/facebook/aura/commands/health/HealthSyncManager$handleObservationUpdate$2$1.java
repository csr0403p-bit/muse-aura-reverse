package com.facebook.aura.commands.health;

import X.AbstractC07127nr;
import X.C3UX;
import X.C8954FuV;
import X.G0V;
import X.HtJ;
import com.meta.health.core.MetaHealthQuery;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.commands.health.HealthSyncManager$handleObservationUpdate$2$1", f = "HealthSyncManager.kt", l = {302, 641, 307, 651}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class HealthSyncManager$handleObservationUpdate$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C8954FuV $provider;
    public final /* synthetic */ MetaHealthQuery $query;
    public final /* synthetic */ C3UX $scope;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public final /* synthetic */ HealthSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthSyncManager$handleObservationUpdate$2$1(HealthSyncManager healthSyncManager, C3UX c3ux, MetaHealthQuery metaHealthQuery, C8954FuV c8954FuV, HtJ<? super HealthSyncManager$handleObservationUpdate$2$1> htJ) {
        super(2, htJ);
        this.this$0 = healthSyncManager;
        this.$scope = c3ux;
        this.$query = metaHealthQuery;
        this.$provider = c8954FuV;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HealthSyncManager$handleObservationUpdate$2$1(this.this$0, this.$scope, this.$query, this.$provider, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r9.label
            r6 = 4
            r7 = 3
            r4 = 2
            r0 = 1
            r3 = 0
            if (r1 == 0) goto L3c
            if (r1 == r0) goto L4a
            if (r1 == r4) goto L30
            if (r1 == r7) goto L72
            if (r1 != r6) goto L2b
            java.lang.Object r8 = r9.L$5
            X.FuV r8 = (X.C8954FuV) r8
            java.lang.Object r7 = r9.L$4
            com.meta.health.core.MetaHealthQuery r7 = (com.meta.health.core.MetaHealthQuery) r7
            java.lang.Object r4 = r9.L$3
            X.3UX r4 = (X.C3UX) r4
            java.lang.Object r2 = r9.L$2
            com.facebook.aura.commands.health.HealthSyncManager r2 = (com.facebook.aura.commands.health.HealthSyncManager) r2
            java.lang.Object r1 = r9.L$1
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            X.Hwg.A00(r10)
            goto L95
        L2b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L30:
            java.lang.Object r2 = r9.L$1
            com.facebook.aura.commands.health.HealthSyncManager r2 = (com.facebook.aura.commands.health.HealthSyncManager) r2
            java.lang.Object r1 = r9.L$0
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            X.Hwg.A00(r10)
            goto L5e
        L3c:
            X.Hwg.A00(r10)
            r9.label = r0
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = X.C7Bq.A01(r0, r9)
            if (r0 != r5) goto L4d
            return r5
        L4a:
            X.Hwg.A00(r10)
        L4d:
            com.facebook.aura.commands.health.HealthSyncManager r2 = r9.this$0
            X.BLa r1 = r2.mutex
            r9.L$0 = r1
            r9.L$1 = r2
            r9.label = r4
            java.lang.Object r0 = r1.APs(r3, r9)
            if (r0 != r5) goto L5e
            return r5
        L5e:
            X.HoC r0 = r2.processingJob     // Catch: java.lang.Throwable -> Lab
            r1.Ahe(r3)
            if (r0 == 0) goto L75
            r9.L$0 = r3
            r9.L$1 = r3
            r9.label = r7
            java.lang.Object r0 = r0.APQ(r9)
            if (r0 != r5) goto L75
            return r5
        L72:
            X.Hwg.A00(r10)
        L75:
            com.facebook.aura.commands.health.HealthSyncManager r0 = r9.this$0
            X.BLa r1 = r0.mutex
            r2 = r0
            X.3UX r4 = r9.$scope
            com.meta.health.core.MetaHealthQuery r7 = r9.$query
            X.FuV r8 = r9.$provider
            r9.L$0 = r3
            r9.L$1 = r1
            r9.L$2 = r0
            r9.L$3 = r4
            r9.L$4 = r7
            r9.L$5 = r8
            r9.label = r6
            java.lang.Object r0 = r1.APs(r3, r9)
            if (r0 != r5) goto L95
            return r5
        L95:
            com.facebook.aura.commands.health.HealthSyncManager$handleObservationUpdate$2$1$1$1 r0 = new com.facebook.aura.commands.health.HealthSyncManager$handleObservationUpdate$2$1$1$1     // Catch: java.lang.Throwable -> La6
            r0.<init>(r2, r7, r8, r3)     // Catch: java.lang.Throwable -> La6
            X.Hqc r0 = X.AnonymousClass001.A11(r0, r4)     // Catch: java.lang.Throwable -> La6
            r2.processingJob = r0     // Catch: java.lang.Throwable -> La6
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La6
            r1.Ahe(r3)
            return r5
        La6:
            r0 = move-exception
            r1.Ahe(r3)
            throw r0
        Lab:
            r0 = move-exception
            r1.Ahe(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.health.HealthSyncManager$handleObservationUpdate$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HealthSyncManager$handleObservationUpdate$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
