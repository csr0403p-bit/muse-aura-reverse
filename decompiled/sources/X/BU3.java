package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BU3 extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public long A01;
    public Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BU3(Object obj, C1262Ag1 c1262Ag1, HtJ<? super BU3> htJ) {
        super(2, c1262Ag1);
        this.$t = htJ;
        this.A02 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        int i;
        long j;
        Object obj3;
        int i2;
        switch (this.$t) {
            case 0:
                BU3 bu3 = new BU3(this.A01, htJ);
                bu3.A02 = obj;
                return bu3;
            case 1:
                obj3 = this.A02;
                j = this.A01;
                i2 = 1;
                return new BU3(obj3, htJ, i2, j);
            case 2:
                obj3 = this.A02;
                j = this.A01;
                i2 = 2;
                return new BU3(obj3, htJ, i2, j);
            case 3:
                obj3 = this.A02;
                j = this.A01;
                i2 = 3;
                return new BU3(obj3, htJ, i2, j);
            case 4:
                obj2 = this.A02;
                i = 4;
                break;
            case 5:
                obj2 = this.A02;
                i = 5;
                break;
            case 6:
                obj3 = this.A02;
                j = this.A01;
                i2 = 6;
                return new BU3(obj3, htJ, i2, j);
            case 7:
                obj2 = this.A02;
                i = 7;
                break;
            case 8:
                obj2 = this.A02;
                i = 8;
                break;
            case 9:
                j = this.A01;
                obj3 = this.A02;
                i2 = 9;
                return new BU3(obj3, htJ, i2, j);
            case 10:
                obj3 = this.A02;
                j = this.A01;
                i2 = 10;
                return new BU3(obj3, htJ, i2, j);
            case 11:
                j = this.A01;
                obj3 = this.A02;
                i2 = 11;
                return new BU3(obj3, htJ, i2, j);
            default:
                j = this.A01;
                obj3 = this.A02;
                i2 = 12;
                return new BU3(obj3, htJ, i2, j);
        }
        BU3 bu32 = new BU3(obj2, htJ, i);
        bu32.A01 = ((AWx) obj).A00;
        return bu32;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        HtJ<Unit> htJCreate;
        switch (this.$t) {
            case 4:
            case 5:
            case 7:
            case 8:
                htJCreate = create(AWx.A0B(((AWx) obj).A00), (HtJ) obj2);
                break;
            case 6:
            default:
                htJCreate = C8j3.A1E(obj2, obj, this);
                break;
        }
        return ((BU3) htJCreate).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fd A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BU3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BU3(long j, HtJ<? super BU3> htJ) {
        super(2, htJ);
        this.$t = 0;
        this.A01 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0004: IPUT (r5 I:long), (r1 I:X.BU3) (LINE:536870916) X.BU3.A01 long, block:B:2:0x0000 */
    public BU3(Object obj, C1262Ag1 c1262Ag1, long j, HtJ<? super BU3> htJ) {
        long j2;
        super(2, c1262Ag1);
        this.$t = j;
        this.A02 = obj;
        this.A01 = j2;
    }
}
