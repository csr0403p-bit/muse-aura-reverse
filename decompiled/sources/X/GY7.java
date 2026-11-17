package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GY7 implements Ht9, G0W {
    public final int $t;
    public final Object A00;

    public GY7(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.G0W
    public final Object invoke(Object obj, Object obj2, final Object obj3) {
        int i = this.$t;
        Object obj4 = this.A00;
        switch (i) {
            case 0:
                String str = GBL.__redex_internal_original_name;
                ((G0U) obj4).invoke(obj);
                break;
            case 1:
                final GCV gcv = (GCV) obj4;
                final C9273GCa c9273GCa = (C9273GCa) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GCV.A07;
                return new G0W() { // from class: X.GCh
                    @Override // X.G0W
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        Object obj8 = obj3;
                        GCV gcv2 = gcv;
                        C9273GCa c9273GCa2 = c9273GCa;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = GCV.A07;
                        if (obj8 != AbstractC9276GCd.A04) {
                            GCT.A01(obj8, c9273GCa2.A04, gcv2.A00);
                        }
                        return Unit.INSTANCE;
                    }
                };
            case 2:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C9258GBl.A01;
                return new C8942Fty(1, obj2, obj4);
            default:
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = GCI.A02;
                ((GCI) obj4).release();
                break;
        }
        return Unit.INSTANCE;
    }
}
