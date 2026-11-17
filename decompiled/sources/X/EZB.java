package X;

import androidx.room.TriggerBasedInvalidationTracker;
import androidx.work.impl.WorkerWrapper;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EZB extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZB(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, HtJ<? super EZB> htJ) {
        super(2, htJ);
        this.$t = 1;
        this.A03 = triggerBasedInvalidationTracker;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        Object obj5;
        Object obj6;
        int i2;
        switch (this.$t) {
            case 0:
                obj2 = this.A01;
                obj3 = this.A03;
                i = 0;
                break;
            case 1:
                EZB ezb = new EZB((TriggerBasedInvalidationTracker) this.A03, htJ);
                ezb.A01 = obj;
                return ezb;
            case 2:
                obj2 = this.A01;
                obj3 = this.A03;
                i = 2;
                break;
            case 3:
                EZB ezb2 = new EZB((C3010Brs) this.A02, htJ, (G0V) this.A01);
                ezb2.A03 = obj;
                return ezb2;
            case 4:
                obj4 = this.A03;
                obj5 = this.A02;
                obj6 = this.A01;
                i2 = 4;
                return new EZB(obj6, obj5, obj4, htJ, i2);
            case 5:
                EZB ezb3 = new EZB(this.A03, this.A01, htJ, 5);
                ezb3.A02 = obj;
                return ezb3;
            default:
                obj4 = this.A03;
                obj5 = this.A02;
                obj6 = this.A01;
                i2 = 6;
                return new EZB(obj6, obj5, obj4, htJ, i2);
        }
        return new EZB(obj3, obj2, htJ, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x033b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EZB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EZB) AbstractC07127nr.A09(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/G0V<-LX/3UX;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;LX/Brs<TT;>;LX/HtJ<-LX/EZB;>;)V */
    public EZB(C3010Brs c3010Brs, HtJ htJ, G0V g0v) {
        super(2, htJ);
        this.$t = 3;
        this.A01 = g0v;
        this.A02 = c3010Brs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EZB(Object obj, String[] strArr, C5297Dfd c5297Dfd, HtJ<? super EZB> htJ) {
        super(2, c5297Dfd);
        this.$t = htJ;
        this.A01 = strArr;
        this.A03 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EZB(Object obj, WorkerWrapper workerWrapper, AbstractC6610EKa abstractC6610EKa, EL0 el0, HtJ<? super EZB> htJ) {
        super(2, el0);
        this.$t = htJ;
        this.A03 = abstractC6610EKa;
        this.A02 = workerWrapper;
        this.A01 = obj;
    }
}
