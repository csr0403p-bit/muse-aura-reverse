package X;

import java.util.List;
import kotlin.Unit;

/* renamed from: X.3bZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bZ implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C3bZ(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        Object obj3 = this.A01;
        switch (i) {
            case 0:
                C0zJ.A00((BRg) obj3, (G0U) this.A02, (BFM) obj, AnonymousClass011.A00(this.A00));
                break;
            case 1:
                C14O.A00((BFM) obj, (ApQ) obj3, (List) this.A02, AnonymousClass011.A00(this.A00));
                break;
            case 2:
                C17y.A00((C1822Arm) obj3, (G0V) this.A02, (BFM) obj, AnonymousClass011.A00(this.A00));
                break;
            default:
                AKT.A00((BFM) obj, (C2Jb) obj3, (G0V) this.A02, AnonymousClass011.A00(this.A00));
                break;
        }
        return Unit.INSTANCE;
    }
}
