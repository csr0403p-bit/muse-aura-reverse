package X;

import android.content.Context;
import kotlin.Unit;

/* renamed from: X.8iZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iZ extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8iZ(Object obj, Context context, HtJ<? super C8iZ> htJ) {
        super(2, context);
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
            case 5:
                i = 5;
                break;
            default:
                i = 6;
                break;
        }
        return new C8iZ(obj2, htJ, i);
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
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            default:
                i = 6;
                break;
        }
        return new C8iZ(obj3, htJ, i).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8iZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
