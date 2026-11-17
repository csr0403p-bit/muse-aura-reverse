package X;

import java.util.Iterator;

/* renamed from: X.BTi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2308BTi implements C3b6 {
    public final int $t;
    public final Object A00;

    public C2308BTi(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.C3b6
    public final Iterator<Integer> iterator() {
        switch (this.$t) {
            case 0:
                return new F3T((int[]) this.A00);
            case 1:
                return BL3.A0C((G0V) this.A00);
            default:
                return (Iterator) this.A00;
        }
    }
}
