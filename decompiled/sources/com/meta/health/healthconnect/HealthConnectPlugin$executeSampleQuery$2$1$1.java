package com.meta.health.healthconnect;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC7609F5w;
import X.AbstractC9044FxQ;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C8957FuZ;
import X.C8964Fuh;
import X.C8j3;
import X.C9005Fwi;
import X.C9025Fx3;
import X.C9uG;
import X.EnumC10460Hji;
import X.G0V;
import X.HiP;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.InterfaceC9011Fwo;
import com.meta.health.core.MetaHealthError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.health.healthconnect.HealthConnectPlugin$executeSampleQuery$2$1$1", f = "HealthConnectPlugin.kt", l = {328}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class HealthConnectPlugin$executeSampleQuery$2$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends C8964Fuh>>, Object> {
    public final /* synthetic */ List<HxE<String, HiP>> $mappedTypes;
    public final /* synthetic */ C8957FuZ $params;
    public final /* synthetic */ C9uG<? extends InterfaceC9011Fwo> $recordClass;
    public final /* synthetic */ C9025Fx3 $timeFilter;
    public int I$0;
    public int label;
    public final /* synthetic */ HealthConnectPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/FuZ;LX/9uG<+LX/Fwo;>;Lcom/meta/health/healthconnect/HealthConnectPlugin;LX/Fx3;Ljava/util/List<LX/HxE<Ljava/lang/String;LX/HiP;>;>;LX/HtJ<-Lcom/meta/health/healthconnect/HealthConnectPlugin$executeSampleQuery$2$1$1;>;)V */
    public HealthConnectPlugin$executeSampleQuery$2$1$1(C9025Fx3 c9025Fx3, C8957FuZ c8957FuZ, HealthConnectPlugin healthConnectPlugin, List list, HtJ htJ, C9uG c9uG) {
        super(2, htJ);
        this.$params = c8957FuZ;
        this.$recordClass = c9uG;
        this.this$0 = healthConnectPlugin;
        this.$timeFilter = c9025Fx3;
        this.$mappedTypes = list;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        C8957FuZ c8957FuZ = this.$params;
        C9uG<? extends InterfaceC9011Fwo> c9uG = this.$recordClass;
        return new HealthConnectPlugin$executeSampleQuery$2$1$1(this.$timeFilter, c8957FuZ, this.this$0, this.$mappedTypes, htJ, c9uG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws MetaHealthError.IncompleteResult {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            boolean zA1V = AbstractC7609F5w.A1V(C9005Fwi.class, this.$recordClass);
            C8957FuZ c8957FuZ = this.$params;
            int iMin = zA1V ? Math.min(c8957FuZ.A00, 100) : c8957FuZ.A00;
            HealthConnectPlugin healthConnectPlugin = this.this$0;
            C9uG<? extends InterfaceC9011Fwo> c9uG = this.$recordClass;
            C7384Etj.A0Z(c9uG, "null cannot be cast to non-null type kotlin.reflect.KClass<androidx.health.connect.client.records.Record>");
            C9025Fx3 c9025Fx3 = this.$timeFilter;
            this.I$0 = iMin;
            this.label = 1;
            obj = HealthConnectPlugin.A0A(c9025Fx3, healthConnectPlugin, this, null, c9uG, iMin, true);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        List<HxE<String, HiP>> list = this.$mappedTypes;
        ArrayList arrayListA0h = C3cG.A0h();
        for (InterfaceC9011Fwo interfaceC9011Fwo : (List) obj) {
            ArrayList arrayListA0h2 = C3cG.A0h();
            Iterator<HxE<String, HiP>> it = list.iterator();
            while (it.hasNext()) {
                HxE hxEA10 = C60Q.A10(it);
                AbstractC0882AGj.A0r(AbstractC9044FxQ.A01(interfaceC9011Fwo, (String) hxEA10.first, ((HiP) hxEA10.second).A01), arrayListA0h2);
            }
            AbstractC0882AGj.A0r(arrayListA0h2, arrayListA0h);
        }
        int i2 = this.$params.A00;
        if (arrayListA0h.size() <= i2) {
            return AbstractC0878AGe.A0a(arrayListA0h, i2);
        }
        throw new MetaHealthError.IncompleteResult();
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends C8964Fuh>> htJ) {
        return ((HealthConnectPlugin$executeSampleQuery$2$1$1) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
