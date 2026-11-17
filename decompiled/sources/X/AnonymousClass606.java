package X;

import java.util.Map;
import kotlin.Unit;

/* renamed from: X.606, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass606 implements Ht9, G0U {
    public final int $t;
    public final Object A00;

    public AnonymousClass606(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                C1BO.A0B((C1BO) this.A00).invoke(obj);
                break;
            case 1:
                C5rn c5rn = (C5rn) this.A00;
                Object obj2 = c5rn.A00.get(C3cG.A0x(obj.getClass()));
                C5ro c5ro = obj2 instanceof C5ro ? (C5ro) obj2 : null;
                c5rn.A01.get(obj);
                return c5ro != null ? new BRL(obj, c5ro.A00.invoke(obj), c5ro.A01.invoke(obj), c5ro.A02) : c5rn.A02.invoke(obj);
            default:
                ((Map) this.A00).remove(obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
