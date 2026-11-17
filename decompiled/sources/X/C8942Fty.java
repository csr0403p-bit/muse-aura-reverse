package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* renamed from: X.Fty, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8942Fty implements Ht9, G0W {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C8942Fty(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    @Override // X.G0W
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C9258GBl c9258GBl;
        Object obj4;
        int i = this.$t;
        Object obj5 = this.A00;
        switch (i) {
            case 0:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GCV.A07;
                GCT.A01(this.A01, (C78T) obj3, (G0U) obj5);
                break;
            case 1:
                c9258GBl = (C9258GBl) obj5;
                obj4 = this.A01;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C9258GBl.A01;
                c9258GBl.Ahe(obj4);
                break;
            default:
                c9258GBl = (C9258GBl) obj5;
                GBV gbv = (GBV) this.A01;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C9258GBl.A01;
                obj4 = gbv.A00;
                atomicReferenceFieldUpdater3.set(c9258GBl, obj4);
                c9258GBl.Ahe(obj4);
                break;
        }
        return Unit.INSTANCE;
    }
}
