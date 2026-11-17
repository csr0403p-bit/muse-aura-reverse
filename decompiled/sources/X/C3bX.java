package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3bX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bX implements Ht9, Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C3bX(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.$t != 0) {
            AnonymousClass001.A1J(new C05363bi(this.A01, null, 12), (C3UX) this.A00);
        } else {
            HxO hxO = (HxO) this.A00;
            Object obj = this.A01;
            C1003AOr<AWA> c1003AOr = C31t.A07;
            hxO.AhZ(obj);
        }
        return Unit.INSTANCE;
    }
}
