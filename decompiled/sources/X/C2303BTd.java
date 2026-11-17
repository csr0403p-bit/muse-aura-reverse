package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.BTd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2303BTd implements Ht9, Function0 {
    public final int $t;
    public final Object A00;
    public final String A01;

    public C2303BTd(String str, Object obj, int i) {
        this.$t = i;
        this.A01 = str;
        this.A00 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        BL8 bl8;
        G0U g0uA00;
        switch (this.$t) {
            case 0:
                str = this.A01;
                Object obj = this.A00;
                bl8 = C9hy.A00;
                g0uA00 = C2297BSx.A00(obj, 48);
                break;
            case 1:
                C9iQ c9iQ = (C9iQ) this.A00;
                String str2 = this.A01;
                C9iZ c9iZ = c9iQ.A00;
                if (c9iZ != null) {
                    return c9iZ;
                }
                Enum[] enumArr = c9iQ.A01;
                C9iD c9iD = new C9iD(str2, enumArr.length);
                for (Enum r0 : enumArr) {
                    c9iD.A08(r0.name(), false);
                }
                return c9iD;
            default:
                str = this.A01;
                Object obj2 = this.A00;
                bl8 = C9iE.A00;
                g0uA00 = new C2291BSr(obj2, 0);
                break;
        }
        return C9iY.A02(str, g0uA00, bl8);
    }
}
