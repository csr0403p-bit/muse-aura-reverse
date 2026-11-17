package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.8iI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iI implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                C7az c7az = (C7az) this.A02;
                BRg bRg = (BRg) this.A03;
                G0W g0w = (G0W) this.A04;
                int i = this.A00;
                int i2 = this.A01;
                C7az c7az2 = AbstractC06777ay.A00;
                AbstractC06777ay.A02(c7az, (BFM) obj, bRg, g0w, AnonymousClass011.A00(i), i2);
                break;
            case 1:
                BRg bRg2 = (BRg) this.A02;
                C7az c7az3 = (C7az) this.A03;
                G0U g0u = (G0U) this.A04;
                int i3 = this.A00;
                int i4 = this.A01;
                C7az c7az4 = AbstractC06777ay.A00;
                AbstractC06777ay.A01(c7az3, (BFM) obj, bRg2, g0u, AnonymousClass011.A00(i3), i4);
                break;
            case 2:
                C76B c76b = (C76B) this.A02;
                C059672t c059672t = (C059672t) this.A03;
                G0V g0v = (G0V) this.A04;
                int i5 = this.A00;
                C72G.A00((BFM) obj, c76b, c059672t, g0v, AnonymousClass011.A00(i5), this.A01);
                break;
            case 3:
                Object obj3 = this.A02;
                C1HY c1hy = (C1HY) this.A03;
                G0U g0u2 = (G0U) this.A04;
                int i6 = this.A00;
                C7bA.A06((BFM) obj, c1hy, obj3, g0u2, AnonymousClass011.A00(i6), this.A01);
                break;
            case 4:
                Object obj4 = this.A02;
                C1HY c1hy2 = (C1HY) this.A03;
                G0U g0u3 = (G0U) this.A04;
                int i7 = this.A00;
                C7bA.A05((BFM) obj, c1hy2, obj4, g0u3, AnonymousClass011.A00(i7), this.A01);
                break;
            case 5:
                EnumC3085Bxl enumC3085Bxl = (EnumC3085Bxl) this.A02;
                C1HY c1hy3 = (C1HY) this.A03;
                Function0 function0 = (Function0) this.A04;
                int i8 = this.A00;
                C7bA.A00((BFM) obj, enumC3085Bxl, c1hy3, function0, AnonymousClass011.A00(i8), this.A01);
                break;
            default:
                Object[] objArr = (Object[]) this.A02;
                C1HY c1hy4 = (C1HY) this.A03;
                G0U g0u4 = (G0U) this.A04;
                int i9 = this.A00;
                C7bA.A07((BFM) obj, c1hy4, g0u4, objArr, AnonymousClass011.A00(i9), this.A01);
                break;
        }
        return Unit.INSTANCE;
    }

    public C8iI(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.$t = i3;
        this.A02 = obj2;
        this.A03 = obj;
        this.A04 = obj3;
        this.A00 = i;
        this.A01 = i2;
    }
}
