package com.meta.health.core;

import X.AbstractC07127nr;
import X.C3UX;
import X.C8954FuV;
import X.C8967Fun;
import X.C8j3;
import X.G0V;
import X.HtJ;
import java.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.health.core.MetaHealthQuery$queryAll$2", f = "MetaHealthQuery.kt", l = {315, 316, 317, 334}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MetaHealthQuery$queryAll$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super C8967Fun>, Object> {
    public final /* synthetic */ Instant $endDate;
    public final /* synthetic */ long $intervalSeconds;
    public final /* synthetic */ C8954FuV $provider;
    public final /* synthetic */ Instant $startDate;
    public final /* synthetic */ String $timezone;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$12;
    public Object L$13;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public final /* synthetic */ MetaHealthQuery this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/time/Instant;Ljava/time/Instant;JLX/FuV;Ljava/lang/String;Lcom/meta/health/core/MetaHealthQuery;LX/HtJ<-Lcom/meta/health/core/MetaHealthQuery$queryAll$2;>;)V */
    public MetaHealthQuery$queryAll$2(C8954FuV c8954FuV, MetaHealthQuery metaHealthQuery, String str, Instant instant, Instant instant2, HtJ htJ, long j) {
        super(2, htJ);
        this.$endDate = instant;
        this.$startDate = instant2;
        this.$intervalSeconds = j;
        this.$provider = c8954FuV;
        this.$timezone = str;
        this.this$0 = metaHealthQuery;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Instant instant = this.$endDate;
        Instant instant2 = this.$startDate;
        long j = this.$intervalSeconds;
        MetaHealthQuery$queryAll$2 metaHealthQuery$queryAll$2 = new MetaHealthQuery$queryAll$2(this.$provider, this.this$0, this.$timezone, instant, instant2, htJ, j);
        metaHealthQuery$queryAll$2.L$0 = obj;
        return metaHealthQuery$queryAll$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c2  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.core.MetaHealthQuery$queryAll$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super C8967Fun> htJ) {
        return ((MetaHealthQuery$queryAll$2) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
