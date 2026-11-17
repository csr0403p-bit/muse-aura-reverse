package X;

import androidx.compose.foundation.gestures.ScrollingLogic;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BUD extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public final long A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/AWe;LX/AOe<LX/2ae;>;JLX/HtJ<-LX/BUD;>;)V */
    public BUD(AOe aOe, C1073AWe c1073AWe, HtJ htJ, long j) {
        super(2, htJ);
        this.$t = 2;
        this.A02 = c1073AWe;
        this.A04 = aOe;
        this.A03 = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0170 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0233 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BUD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        long j;
        Object obj3;
        int i;
        Object obj4;
        Object obj5;
        long j2;
        Object obj6;
        int i2;
        Object obj7;
        long j3;
        Object obj8;
        int i3;
        switch (this.$t) {
            case 0:
                obj2 = this.A01;
                j = this.A03;
                obj3 = this.A04;
                i = 0;
                return new BUD(obj2, obj3, htJ, i, j);
            case 1:
                obj7 = this.A01;
                j3 = this.A03;
                obj8 = this.A04;
                i3 = 1;
                BUD bud = new BUD(obj7, obj8, htJ, i3, j3);
                bud.A02 = obj;
                return bud;
            case 2:
                return new BUD((AOe) this.A04, (C1073AWe) this.A02, htJ, this.A03);
            case 3:
                obj2 = this.A01;
                j = this.A03;
                obj3 = this.A04;
                i = 3;
                return new BUD(obj2, obj3, htJ, i, j);
            case 4:
                obj6 = this.A02;
                j2 = this.A03;
                obj5 = this.A01;
                obj4 = this.A04;
                i2 = 4;
                return new BUD(obj4, obj6, obj5, htJ, i2, j2);
            case 5:
                obj4 = this.A04;
                obj5 = this.A01;
                j2 = this.A03;
                obj6 = this.A02;
                i2 = 5;
                return new BUD(obj4, obj6, obj5, htJ, i2, j2);
            case 6:
                obj2 = this.A01;
                j = this.A03;
                obj3 = this.A04;
                i = 6;
                return new BUD(obj2, obj3, htJ, i, j);
            default:
                obj8 = this.A04;
                j3 = this.A03;
                obj7 = this.A01;
                i3 = 7;
                BUD bud2 = new BUD(obj7, obj8, htJ, i3, j3);
                bud2.A02 = obj;
                return bud2;
        }
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BUD) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x000b: INVOKE (r1v0 ?? I:X.7nr), (r0v0 ?? I:int), (r5 I:X.HtJ) DIRECT call: X.7nr.<init>(int, X.HtJ):void A[MD:(int, X.HtJ<java.lang.Object>):void (m)] (LINE:268435467), block:B:2:0x0000 */
    public BUD(Object obj, C1081AXo c1081AXo, long j, InterfaceC1084AXr interfaceC1084AXr, C1083AXq c1083AXq, HtJ<? super BUD> htJ) {
        HtJ abstractC07127nr;
        this.$t = interfaceC1084AXr;
        this.A02 = c1081AXo;
        this.A03 = c1083AXq;
        this.A01 = j;
        this.A04 = obj;
        super(2, abstractC07127nr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0000: IPUT (r5 I:int), (r1 I:X.BUD) (LINE:536870912) X.BUD.$t int, block:B:2:0x0000 */
    public BUD(Object obj, ScrollingLogic scrollingLogic, long j, C1051ASv c1051ASv, HtJ<? super BUD> htJ) {
        int i;
        super(2, j);
        this.$t = i;
        this.A01 = obj;
        this.A03 = c1051ASv;
        this.A04 = scrollingLogic;
    }
}
