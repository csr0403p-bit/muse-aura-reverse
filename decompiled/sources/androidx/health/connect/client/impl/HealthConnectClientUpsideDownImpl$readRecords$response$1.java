package androidx.health.connect.client.impl;

import X.AbstractC07127nr;
import X.AbstractC4472Cwo;
import X.AbstractC9053Fxb;
import X.AnonymousClass001;
import X.C7Bm;
import X.C9042FxO;
import X.EnumC10460Hji;
import X.G0U;
import X.GBL;
import X.HtJ;
import X.Hwg;
import android.health.connect.ReadRecordsResponse;
import android.health.connect.datatypes.Record;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$readRecords$response$1", f = "HealthConnectClientUpsideDownImpl.kt", l = {634}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class HealthConnectClientUpsideDownImpl$readRecords$response$1 extends AbstractC07127nr implements G0U<HtJ<? super ReadRecordsResponse<? extends Record>>, Object> {
    public final /* synthetic */ C9042FxO<T> $request;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthConnectClientUpsideDownImpl$readRecords$response$1(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, C9042FxO<T> c9042FxO, HtJ<? super HealthConnectClientUpsideDownImpl$readRecords$response$1> htJ) {
        super(1, htJ);
        this.this$0 = healthConnectClientUpsideDownImpl;
        this.$request = c9042FxO;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HealthConnectClientUpsideDownImpl$readRecords$response$1(this.this$0, this.$request, htJ);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(HtJ<? super ReadRecordsResponse<? extends Record>> htJ) {
        return ((HealthConnectClientUpsideDownImpl$readRecords$response$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = this.this$0;
            C9042FxO<T> c9042FxO = this.$request;
            this.L$0 = healthConnectClientUpsideDownImpl;
            this.L$1 = c9042FxO;
            this.label = 1;
            GBL gblA04 = C7Bm.A04(this);
            healthConnectClientUpsideDownImpl.A01.readRecords(AbstractC9053Fxb.A02(c9042FxO), healthConnectClientUpsideDownImpl.A03, AbstractC4472Cwo.A00(gblA04));
            obj = gblA04.A0F();
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
}
