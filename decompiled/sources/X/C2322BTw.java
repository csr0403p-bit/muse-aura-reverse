package X;

import kotlin.Unit;

/* renamed from: X.BTw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2322BTw extends AbstractC07117nq implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2322BTw(Object obj, InterfaceC2045AxD interfaceC2045AxD, HtJ<? super C2322BTw> htJ) {
        super(2, interfaceC2045AxD);
        this.$t = htJ;
        this.A03 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        C2322BTw c2322BTw;
        Object obj2;
        int i;
        Object obj3;
        Object obj4;
        int i2;
        C2322BTw c2322BTw2;
        switch (this.$t) {
            case 0:
                c2322BTw = new C2322BTw(this.A03, this.A01, htJ, 0);
                c2322BTw.A02 = obj;
                return c2322BTw;
            case 1:
                obj2 = this.A03;
                i = 1;
                c2322BTw2 = new C2322BTw(obj2, htJ, i);
                c2322BTw2.A01 = obj;
                return c2322BTw2;
            case 2:
                c2322BTw = new C2322BTw(this.A03, this.A01, htJ, 2);
                c2322BTw.A02 = obj;
                return c2322BTw;
            case 3:
                obj3 = this.A02;
                obj4 = this.A03;
                i2 = 3;
                c2322BTw2 = new C2322BTw(obj3, obj4, htJ, i2, 42);
                c2322BTw2.A01 = obj;
                return c2322BTw2;
            case 4:
                obj2 = this.A03;
                i = 4;
                c2322BTw2 = new C2322BTw(obj2, htJ, i);
                c2322BTw2.A01 = obj;
                return c2322BTw2;
            default:
                obj3 = this.A02;
                obj4 = this.A03;
                i2 = 5;
                c2322BTw2 = new C2322BTw(obj3, obj4, htJ, i2, 42);
                c2322BTw2.A01 = obj;
                return c2322BTw2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x006b, code lost:
    
        if (androidx.compose.foundation.gestures.ForEachGestureKt.A00(r2, X.EnumC1080AXj.A02, r13) == r6) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0217 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[Catch: CancellationException -> 0x009f, TRY_ENTER, TryCatch #0 {CancellationException -> 0x009f, blocks: (B:30:0x0075, B:37:0x0094, B:34:0x0089, B:36:0x0091), top: B:145:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0215 -> B:113:0x01f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x019c -> B:62:0x0102). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2322BTw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C2322BTw) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2322BTw(Object obj, EnumC1080AXj enumC1080AXj, C10543Hqv<AbstractC1077AXf> c10543Hqv, HtJ<? super C2322BTw> htJ) {
        super(2, c10543Hqv);
        this.$t = htJ;
        this.A03 = obj;
        this.A01 = enumC1080AXj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2322BTw(Object obj, Object obj2, HtJ htJ, int i, int i2) {
        super(2, htJ);
        this.$t = i;
        this.A02 = obj;
        this.A03 = obj2;
    }
}
