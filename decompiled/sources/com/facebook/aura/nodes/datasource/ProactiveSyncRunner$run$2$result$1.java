package com.facebook.aura.nodes.datasource;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.nodes.datasource.DataSourceResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.datasource.ProactiveSyncRunner$run$2$result$1", f = "ProactiveSyncRunner.kt", l = {114, 115}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class ProactiveSyncRunner$run$2$result$1 extends AbstractC07127nr implements G0U<HtJ<? super DataSourceResult>, Object> {
    public final /* synthetic */ ProactiveConnectionGate $connectionGate;
    public final /* synthetic */ DataSourceContext $ctx;
    public final /* synthetic */ DataSource $source;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProactiveSyncRunner$run$2$result$1(ProactiveConnectionGate proactiveConnectionGate, DataSource dataSource, DataSourceContext dataSourceContext, HtJ<? super ProactiveSyncRunner$run$2$result$1> htJ) {
        super(1, htJ);
        this.$connectionGate = proactiveConnectionGate;
        this.$source = dataSource;
        this.$ctx = dataSourceContext;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new ProactiveSyncRunner$run$2$result$1(this.$connectionGate, this.$source, this.$ctx, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ProactiveConnectionGate proactiveConnectionGate = this.$connectionGate;
            this.label = 1;
            obj = proactiveConnectionGate.awaitConnected(30000L, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    Hwg.A00(obj);
                }
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        if (!AnonymousClass001.A1X(obj)) {
            return new DataSourceResult.Error("gateway_unavailable", "Gateway not connected before proactive publish");
        }
        DataSource dataSource = this.$source;
        DataSourceContext dataSourceContext = this.$ctx;
        this.label = 2;
        obj = dataSource.proactiveSync(dataSourceContext, this);
        return obj == enumC10460Hji ? enumC10460Hji : obj;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super DataSourceResult> htJ) {
        return ((ProactiveSyncRunner$run$2$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
