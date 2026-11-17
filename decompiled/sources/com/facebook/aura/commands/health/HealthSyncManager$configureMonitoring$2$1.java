package com.facebook.aura.commands.health;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C8954FuV;
import X.EnumC10460Hji;
import X.FvK;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.meta.health.core.MetaHealthQuery;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.commands.health.HealthSyncManager$configureMonitoring$2$1", f = "HealthSyncManager.kt", l = {160}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class HealthSyncManager$configureMonitoring$2$1 extends AbstractC07127nr implements G0V<FvK, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C8954FuV $provider;
    public final /* synthetic */ MetaHealthQuery $query;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ HealthSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthSyncManager$configureMonitoring$2$1(HealthSyncManager healthSyncManager, MetaHealthQuery metaHealthQuery, C8954FuV c8954FuV, HtJ<? super HealthSyncManager$configureMonitoring$2$1> htJ) {
        super(2, htJ);
        this.this$0 = healthSyncManager;
        this.$query = metaHealthQuery;
        this.$provider = c8954FuV;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HealthSyncManager$configureMonitoring$2$1 healthSyncManager$configureMonitoring$2$1 = new HealthSyncManager$configureMonitoring$2$1(this.this$0, this.$query, this.$provider, htJ);
        healthSyncManager$configureMonitoring$2$1.L$0 = obj;
        return healthSyncManager$configureMonitoring$2$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        FvK fvK = (FvK) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HealthSyncManager healthSyncManager = this.this$0;
            MetaHealthQuery metaHealthQuery = this.$query;
            C8954FuV c8954FuV = this.$provider;
            this.L$0 = null;
            this.label = 1;
            if (healthSyncManager.handleObservationUpdate(fvK, metaHealthQuery, c8954FuV, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(FvK fvK, HtJ<? super Unit> htJ) {
        return ((HealthSyncManager$configureMonitoring$2$1) create(fvK, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
