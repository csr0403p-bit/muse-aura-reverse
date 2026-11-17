package X;

import kotlin.Unit;

/* renamed from: X.607, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass607 implements Ht9, G2j {
    public final int $t;
    public final Object A00;

    public AnonymousClass607(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.G2j
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        if (this.$t != 0) {
            ((G0W) this.A00).invoke(obj2, obj3, obj4);
        } else {
            ((G2j) ((C1BO) this.A00).getValue()).invoke(obj, obj2, obj3, obj4);
        }
        return Unit.INSTANCE;
    }
}
