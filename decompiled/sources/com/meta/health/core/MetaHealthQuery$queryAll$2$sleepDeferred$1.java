package com.meta.health.core;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C8954FuV;
import X.C8955FuX;
import X.C8963Fug;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.time.Instant;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.health.core.MetaHealthQuery$queryAll$2$sleepDeferred$1", f = "MetaHealthQuery.kt", l = {299}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MetaHealthQuery$queryAll$2$sleepDeferred$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends C8963Fug>>, Object> {
    public final /* synthetic */ C8954FuV $provider;
    public final /* synthetic */ Instant $resolvedEndDate;
    public final /* synthetic */ Instant $startDate;
    public final /* synthetic */ String $timezone;
    public int label;
    public final /* synthetic */ MetaHealthQuery this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/meta/health/core/MetaHealthQuery;LX/FuV;Ljava/time/Instant;Ljava/time/Instant;Ljava/lang/String;LX/HtJ<-Lcom/meta/health/core/MetaHealthQuery$queryAll$2$sleepDeferred$1;>;)V */
    public MetaHealthQuery$queryAll$2$sleepDeferred$1(C8954FuV c8954FuV, MetaHealthQuery metaHealthQuery, String str, Instant instant, Instant instant2, HtJ htJ) {
        super(2, htJ);
        this.this$0 = metaHealthQuery;
        this.$provider = c8954FuV;
        this.$startDate = instant;
        this.$resolvedEndDate = instant2;
        this.$timezone = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        MetaHealthQuery metaHealthQuery = this.this$0;
        return new MetaHealthQuery$queryAll$2$sleepDeferred$1(this.$provider, metaHealthQuery, this.$timezone, this.$startDate, this.$resolvedEndDate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            MetaHealthQuery metaHealthQuery = this.this$0;
            C8954FuV c8954FuV = this.$provider;
            C8955FuX c8955FuX = new C8955FuX(this.$timezone, c8954FuV.A01, this.$startDate, this.$resolvedEndDate);
            this.label = 1;
            obj = metaHealthQuery.A03(c8954FuV, c8955FuX, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends C8963Fug>> htJ) {
        return ((MetaHealthQuery$queryAll$2$sleepDeferred$1) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
