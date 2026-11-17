package X;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* renamed from: X.3bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05383bk extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05383bk(AvR avR, HtJ<? super C05383bk> htJ) {
        super(2, htJ);
        this.$t = 4;
        this.A02 = avR;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05383bk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        int i2;
        switch (this.$t) {
            case 0:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 0;
                break;
            case 1:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 1;
                break;
            case 2:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 2;
                break;
            case 3:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 3;
                break;
            case 4:
                C05383bk c05383bk = new C05383bk((AvR) this.A02, htJ);
                c05383bk.A01 = obj;
                return c05383bk;
            case 5:
                return new C05383bk(this.A02, this.A01, htJ, 5);
            case 6:
                obj4 = this.A01;
                i2 = 6;
                C05383bk c05383bk2 = new C05383bk(obj4, htJ, i2);
                c05383bk2.A02 = obj;
                return c05383bk2;
            case 7:
                obj4 = this.A01;
                i2 = 7;
                C05383bk c05383bk22 = new C05383bk(obj4, htJ, i2);
                c05383bk22.A02 = obj;
                return c05383bk22;
            case 8:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 8;
                break;
            default:
                obj4 = this.A01;
                i2 = 9;
                C05383bk c05383bk222 = new C05383bk(obj4, htJ, i2);
                c05383bk222.A02 = obj;
                return c05383bk222;
        }
        return new C05383bk(obj2, obj3, htJ, i);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C05383bk) create(obj, (HtJ) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05383bk(Object obj, G0V<? super C3UX, ? super HtJ<? super Unit>, ? extends Object> g0v, HtJ<? super C05383bk> htJ) {
        super(2, g0v);
        this.$t = htJ;
        this.A01 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05383bk(Object obj, C0dy c0dy, MutableState<Boolean> mutableState, HtJ<? super C05383bk> htJ) {
        super(2, mutableState);
        this.$t = htJ;
        this.A02 = obj;
        this.A01 = c0dy;
    }
}
