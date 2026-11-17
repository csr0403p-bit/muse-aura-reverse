package X;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend", v = 1)
/* renamed from: X.4vp, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4vp extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C20Q<T>[] $flows;
    public final /* synthetic */ int $i;
    public final /* synthetic */ AtomicInteger $nonClosed;
    public final /* synthetic */ HzR<C2273BRq<Object>> $resultChannel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: ([LX/20Q<+TT;>;ILjava/util/concurrent/atomic/AtomicInteger;LX/HzR<LX/BRq<Ljava/lang/Object;>;>;LX/HtJ<-LX/4vp;>;)V */
    public C4vp(AtomicInteger atomicInteger, HtJ htJ, HzR hzR, C20Q[] c20qArr, int i) {
        super(2, htJ);
        this.$flows = c20qArr;
        this.$i = i;
        this.$nonClosed = atomicInteger;
        this.$resultChannel = hzR;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new C4vp(this.$nonClosed, htJ, this.$resultChannel, this.$flows, this.$i);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((C4vp) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        AtomicInteger atomicInteger;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                C20Q[] c20qArr = this.$flows;
                int i2 = this.$i;
                C20Q c20q = c20qArr[i2];
                C4vr c4vr = new C4vr(this.$resultChannel, i2);
                this.label = 1;
                if (c20q.collect(c4vr, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Hwg.A00(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.$resultChannel.A6R(null);
            }
            return Unit.INSTANCE;
        } finally {
            if (this.$nonClosed.decrementAndGet() == 0) {
                this.$resultChannel.A6R(null);
            }
        }
    }
}
