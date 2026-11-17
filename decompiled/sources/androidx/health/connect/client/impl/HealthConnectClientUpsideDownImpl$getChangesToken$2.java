package androidx.health.connect.client.impl;

import X.AbstractC07127nr;
import X.AbstractC4472Cwo;
import X.AbstractC9053Fxb;
import X.AnonymousClass001;
import X.C7Bm;
import X.EnumC10460Hji;
import X.FvW;
import X.G0U;
import X.GBL;
import X.HtJ;
import X.Hwg;
import android.health.connect.changelog.ChangeLogTokenResponse;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getChangesToken$2", f = "HealthConnectClientUpsideDownImpl.kt", l = {634}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class HealthConnectClientUpsideDownImpl$getChangesToken$2 extends AbstractC07127nr implements G0U<HtJ<? super ChangeLogTokenResponse>, Object> {
    public final /* synthetic */ FvW $request;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthConnectClientUpsideDownImpl$getChangesToken$2(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, FvW fvW, HtJ<? super HealthConnectClientUpsideDownImpl$getChangesToken$2> htJ) {
        super(1, htJ);
        this.this$0 = healthConnectClientUpsideDownImpl;
        this.$request = fvW;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HealthConnectClientUpsideDownImpl$getChangesToken$2(this.this$0, this.$request, htJ);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(HtJ<? super ChangeLogTokenResponse> htJ) {
        return ((HealthConnectClientUpsideDownImpl$getChangesToken$2) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = this.this$0;
            FvW fvW = this.$request;
            this.L$0 = healthConnectClientUpsideDownImpl;
            this.L$1 = fvW;
            this.label = 1;
            GBL gblA04 = C7Bm.A04(this);
            healthConnectClientUpsideDownImpl.A01.getChangeLogToken(AbstractC9053Fxb.A04(fvW), healthConnectClientUpsideDownImpl.A03, AbstractC4472Cwo.A00(gblA04));
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
