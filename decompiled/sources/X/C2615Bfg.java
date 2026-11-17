package X;

import com.google.common.base.Supplier;
import java.util.concurrent.Executor;

/* renamed from: X.Bfg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2615Bfg implements Supplier {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C2615Bfg(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.$t) {
            case 3:
                return new C5606Dll((CXN) this.A01, ((C5703Dnk) this.A00).A06);
            case 4:
                return new C5343Dgm((InterfaceC5344Dgn) this.A01, (Executor) ((Supplier) this.A00).get());
            default:
                try {
                    return (InterfaceC5791Dpa) ((Class) this.A00).getConstructor(CXN.class).newInstance((CXN) this.A01);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
