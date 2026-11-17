package X;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EZE extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EZE(Object obj, EIR eir, HtJ<? super EZE> htJ) {
        super(2, eir);
        this.$t = htJ;
        this.A01 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        int i;
        int i2 = this.$t;
        Object obj2 = this.A01;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            default:
                i = 5;
                break;
        }
        return new EZE(obj2, htJ, i);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.$t;
        HtJ htJ = (HtJ) obj2;
        Object obj3 = this.A01;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                EZE eze = new EZE(obj3, htJ, 2);
                Unit unit = Unit.INSTANCE;
                eze.invokeSuspend(unit);
                return unit;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            default:
                i = 5;
                break;
        }
        return new EZE(obj3, htJ, i).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EZE.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
