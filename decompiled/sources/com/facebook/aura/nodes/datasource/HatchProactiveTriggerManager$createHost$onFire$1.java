package com.facebook.aura.nodes.datasource;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.nodes.core.NodeHitlGate;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.datasource.HatchProactiveTriggerManager$createHost$onFire$1", f = "HatchProactiveTriggerManager.kt", l = {94}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchProactiveTriggerManager$createHost$onFire$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ DataSource $ds;
    public final /* synthetic */ G0U<String, Boolean> $isUserEnabled;
    public int label;
    public final /* synthetic */ HatchProactiveTriggerManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchProactiveTriggerManager$createHost$onFire$1(G0U<? super String, Boolean> g0u, DataSource dataSource, HatchProactiveTriggerManager hatchProactiveTriggerManager, HtJ<? super HatchProactiveTriggerManager$createHost$onFire$1> htJ) {
        super(1, htJ);
        this.$isUserEnabled = g0u;
        this.$ds = dataSource;
        this.this$0 = hatchProactiveTriggerManager;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchProactiveTriggerManager$createHost$onFire$1(this.$isUserEnabled, this.$ds, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (AnonymousClass003.A1X(this.$ds.getSourceId(), this.$isUserEnabled)) {
                ProactiveSyncRunner proactiveSyncRunner = ProactiveSyncRunner.INSTANCE;
                DataSource dataSource = this.$ds;
                String strInvoke = this.this$0.clientId.invoke();
                HatchProactiveTriggerManager hatchProactiveTriggerManager = this.this$0;
                AbstractC3358CGz abstractC3358CGz = hatchProactiveTriggerManager.userSession;
                DataSourcePublishSink dataSourcePublishSink = hatchProactiveTriggerManager.sink;
                NodeHitlGate nodeHitlGate = hatchProactiveTriggerManager.hitlGate;
                ProactiveConnectionGate proactiveConnectionGate = hatchProactiveTriggerManager.connectionGate;
                this.label = 1;
                if (proactiveSyncRunner.run(dataSource, strInvoke, abstractC3358CGz, dataSourcePublishSink, nodeHitlGate, proactiveConnectionGate, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                this.$ds.getSourceId();
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Unit> htJ) {
        return ((HatchProactiveTriggerManager$createHost$onFire$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
