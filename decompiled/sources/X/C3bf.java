package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3bf, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bf extends AbstractC07117nq implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3bf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3bf(HtJ htJ, G0U<? super AWx, Unit> g0u, G0V<? super C1299Agk, ? super Float, Unit> g0v, Function0<Unit> function0, Function0<Unit> function02, HtJ<? super C3bf> htJ2) {
        super(2, htJ);
        this.$t = htJ2;
        this.A05 = function0;
        this.A06 = function02;
        this.A04 = g0u;
        this.A03 = g0v;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        int i = this.$t;
        C3bf c3bf = new C3bf(htJ, (Function0) this.A04, (Function0) this.A03, (G0U) this.A05, (G0V) this.A06, i != 0 ? 1 : 0);
        c3bf.A01 = obj;
        return c3bf;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C3bf) create(obj, (HtJ) obj2)).invokeSuspend(Unit.INSTANCE);
    }
}
