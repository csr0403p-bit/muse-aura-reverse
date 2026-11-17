package androidx.room.coroutines;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EJ9;
import X.EJE;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.room.coroutines.PassthroughConnection$withTransaction$2", f = "PassthroughConnectionPool.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class PassthroughConnection$withTransaction$2 extends AbstractC07127nr implements G0U<HtJ<? super Object>, Object> {
    public final /* synthetic */ G0V<EJE<R>, HtJ<? super R>, Object> $block;
    public final /* synthetic */ EJ9 $type;
    public int label;
    public final /* synthetic */ PassthroughConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/room/coroutines/PassthroughConnection;LX/EJ9;LX/G0V<-LX/EJE<TR;>;-LX/HtJ<-TR;>;+Ljava/lang/Object;>;LX/HtJ<-Landroidx/room/coroutines/PassthroughConnection$withTransaction$2;>;)V */
    public PassthroughConnection$withTransaction$2(EJ9 ej9, PassthroughConnection passthroughConnection, HtJ htJ, G0V g0v) {
        super(1, htJ);
        this.this$0 = passthroughConnection;
        this.$type = ej9;
        this.$block = g0v;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new PassthroughConnection$withTransaction$2(this.$type, this.this$0, htJ, this.$block);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(HtJ<? super Object> htJ) {
        return ((PassthroughConnection$withTransaction$2) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PassthroughConnection passthroughConnection = this.this$0;
            EJ9 ej9 = this.$type;
            G0V<EJE<R>, HtJ<? super R>, Object> g0v = this.$block;
            this.label = 1;
            obj = PassthroughConnection.A00(ej9, passthroughConnection, this, g0v);
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
