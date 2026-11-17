package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BU1 extends AbstractC07127nr implements G0U {
    public final int $t;
    public int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BU1(Object obj, AT5<T, V> at5, HtJ<? super BU1> htJ) {
        super(1, at5);
        this.$t = htJ;
        this.A01 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        Object obj;
        int i;
        switch (this.$t) {
            case 0:
                obj = this.A01;
                i = 0;
                break;
            case 1:
                obj = this.A01;
                i = 1;
                break;
            case 2:
                obj = this.A01;
                i = 2;
                break;
            case 3:
                obj = this.A01;
                i = 3;
                break;
            case 4:
                obj = this.A01;
                i = 4;
                break;
            case 5:
                obj = this.A01;
                i = 5;
                break;
            case 6:
                obj = this.A01;
                i = 6;
                break;
            case 7:
                obj = this.A01;
                i = 7;
                break;
            case 8:
                obj = this.A01;
                i = 8;
                break;
            case 9:
                obj = this.A01;
                i = 9;
                break;
            case 10:
                obj = this.A01;
                i = 10;
                break;
            case 11:
                obj = this.A01;
                i = 11;
                break;
            default:
                return new BU1(htJ);
        }
        return new BU1(obj, htJ, i);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        int i;
        BU1 bu1;
        HtJ htJ = (HtJ) obj;
        switch (this.$t) {
            case 0:
                obj2 = this.A01;
                i = 0;
                bu1 = new BU1(obj2, htJ, i);
                break;
            case 1:
                obj2 = this.A01;
                i = 1;
                bu1 = new BU1(obj2, htJ, i);
                break;
            case 2:
                obj2 = this.A01;
                i = 2;
                bu1 = new BU1(obj2, htJ, i);
                break;
            case 3:
                obj2 = this.A01;
                i = 3;
                bu1 = new BU1(obj2, htJ, i);
                break;
            case 4:
                obj2 = this.A01;
                i = 4;
                bu1 = new BU1(obj2, htJ, i);
                break;
            case 5:
                obj2 = this.A01;
                i = 5;
                bu1 = new BU1(obj2, htJ, i);
                break;
            case 6:
                obj2 = this.A01;
                i = 6;
                bu1 = new BU1(obj2, htJ, i);
                break;
            case 7:
                obj2 = this.A01;
                i = 7;
                bu1 = new BU1(obj2, htJ, i);
                break;
            case 8:
                obj2 = this.A01;
                i = 8;
                bu1 = new BU1(obj2, htJ, i);
                break;
            case 9:
                obj2 = this.A01;
                i = 9;
                bu1 = new BU1(obj2, htJ, i);
                break;
            case 10:
                obj2 = this.A01;
                i = 10;
                bu1 = new BU1(obj2, htJ, i);
                break;
            case 11:
                obj2 = this.A01;
                i = 11;
                bu1 = new BU1(obj2, htJ, i);
                break;
            default:
                bu1 = new BU1(htJ);
                break;
        }
        return bu1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BU1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BU1(HtJ htJ) {
        super(1, htJ);
        this.$t = 12;
        this.A01 = null;
    }
}
