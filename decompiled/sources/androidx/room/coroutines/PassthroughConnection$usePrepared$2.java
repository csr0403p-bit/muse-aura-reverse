package androidx.room.coroutines;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EIK;
import X.G0U;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.room.coroutines.PassthroughConnection$usePrepared$2", f = "PassthroughConnectionPool.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class PassthroughConnection$usePrepared$2 extends AbstractC07127nr implements G0U<HtJ<? super Object>, Object> {
    public final /* synthetic */ G0U<EIK, R> $block;
    public final /* synthetic */ String $sql;
    public int label;
    public final /* synthetic */ PassthroughConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/room/coroutines/PassthroughConnection;Ljava/lang/String;LX/G0U<-LX/EIK;+TR;>;LX/HtJ<-Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;>;)V */
    public PassthroughConnection$usePrepared$2(PassthroughConnection passthroughConnection, String str, HtJ htJ, G0U g0u) {
        super(1, htJ);
        this.this$0 = passthroughConnection;
        this.$sql = str;
        this.$block = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new PassthroughConnection$usePrepared$2(this.this$0, this.$sql, htJ, this.$block);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(HtJ<? super Object> htJ) {
        return ((PassthroughConnection$usePrepared$2) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        EIK eikAYO = this.this$0.A02.AYO(this.$sql);
        try {
            Object objInvoke = this.$block.invoke(eikAYO);
            if (eikAYO != null) {
                eikAYO.close();
            }
            return objInvoke;
        } finally {
        }
    }
}
