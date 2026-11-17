package com.facebook.aura.commands.health;

import X.HtJ;
import X.HzP;
import com.facebook.aura.commands.health.HealthDataSource;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.commands.health.HealthDataSource$HealthBackfillStrategy", f = "HealthDataSource.kt", l = {284, 332}, m = "windowSnapshot", v = 2)
/* loaded from: classes6.dex */
public final class HealthDataSource$HealthBackfillStrategy$windowSnapshot$1 extends HzP {
    public long J$0;
    public long J$1;
    public long J$2;
    public long J$3;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HealthDataSource.HealthBackfillStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthDataSource$HealthBackfillStrategy$windowSnapshot$1(HealthDataSource.HealthBackfillStrategy healthBackfillStrategy, HtJ<? super HealthDataSource$HealthBackfillStrategy$windowSnapshot$1> htJ) {
        super(htJ);
        this.this$0 = healthBackfillStrategy;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.windowSnapshot(0L, 0L, this);
    }
}
