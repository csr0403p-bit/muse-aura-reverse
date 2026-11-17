package X;

import kotlin.Unit;

/* renamed from: X.3bi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05363bi extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05363bi(Object obj, AT5<Float, AOW> at5, HtJ<? super C05363bi> htJ) {
        super(2, at5);
        this.$t = htJ;
        this.A01 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        int i;
        switch (this.$t) {
            case 0:
                obj2 = this.A01;
                i = 0;
                break;
            case 1:
                obj2 = this.A01;
                i = 1;
                break;
            case 2:
                obj2 = this.A01;
                i = 2;
                break;
            case 3:
                obj2 = this.A01;
                i = 3;
                break;
            case 4:
                obj2 = this.A01;
                i = 4;
                break;
            case 5:
                obj2 = this.A01;
                i = 5;
                break;
            case 6:
                obj2 = this.A01;
                i = 6;
                break;
            case 7:
                obj2 = this.A01;
                i = 7;
                break;
            case 8:
                obj2 = this.A01;
                i = 8;
                break;
            case 9:
                obj2 = this.A01;
                i = 9;
                break;
            case 10:
                obj2 = this.A01;
                i = 10;
                break;
            case 11:
                obj2 = this.A01;
                i = 11;
                break;
            case 12:
                obj2 = this.A01;
                i = 12;
                break;
            default:
                C05363bi c05363bi = new C05363bi(htJ);
                c05363bi.A01 = obj;
                return c05363bi;
        }
        return new C05363bi(obj2, htJ, i);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3;
        int i;
        C05363bi c05363bi;
        HtJ htJ = (HtJ) obj2;
        switch (this.$t) {
            case 0:
                obj3 = this.A01;
                i = 0;
                c05363bi = new C05363bi(obj3, htJ, i);
                break;
            case 1:
                obj3 = this.A01;
                i = 1;
                c05363bi = new C05363bi(obj3, htJ, i);
                break;
            case 2:
                obj3 = this.A01;
                i = 2;
                c05363bi = new C05363bi(obj3, htJ, i);
                break;
            case 3:
                obj3 = this.A01;
                i = 3;
                c05363bi = new C05363bi(obj3, htJ, i);
                break;
            case 4:
                obj3 = this.A01;
                i = 4;
                c05363bi = new C05363bi(obj3, htJ, i);
                break;
            case 5:
                obj3 = this.A01;
                i = 5;
                c05363bi = new C05363bi(obj3, htJ, i);
                break;
            case 6:
                obj3 = this.A01;
                i = 6;
                c05363bi = new C05363bi(obj3, htJ, i);
                break;
            case 7:
                obj3 = this.A01;
                i = 7;
                c05363bi = new C05363bi(obj3, htJ, i);
                break;
            case 8:
                obj3 = this.A01;
                i = 8;
                c05363bi = new C05363bi(obj3, htJ, i);
                break;
            case 9:
                obj3 = this.A01;
                i = 9;
                c05363bi = new C05363bi(obj3, htJ, i);
                break;
            case 10:
                obj3 = this.A01;
                i = 10;
                c05363bi = new C05363bi(obj3, htJ, i);
                break;
            case 11:
                obj3 = this.A01;
                i = 11;
                c05363bi = new C05363bi(obj3, htJ, i);
                break;
            case 12:
                obj3 = this.A01;
                i = 12;
                c05363bi = new C05363bi(obj3, htJ, i);
                break;
            default:
                c05363bi = new C05363bi(htJ);
                c05363bi.A01 = obj;
                break;
        }
        return c05363bi.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080 A[Catch: IllegalArgumentException -> 0x0083, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x0083, blocks: (B:20:0x004f, B:29:0x0080, B:26:0x006d), top: B:62:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05363bi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05363bi(HtJ<? super C05363bi> htJ) {
        super(2, htJ);
        this.$t = 13;
    }
}
