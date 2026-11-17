package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FZI extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FZI(C9659Gcj c9659Gcj, C9659Gcj<TState> c9659Gcj2) {
        super(1);
        this.$t = c9659Gcj2;
        this.A00 = c9659Gcj;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        Object obj2;
        Object objInvoke;
        int i = this.$t;
        C7384Etj.A0Y(obj, 0);
        C9659Gcj c9659Gcj = (C9659Gcj) this.A00;
        switch (i) {
            case 0:
                obj2 = c9659Gcj.A01;
                synchronized (obj2) {
                    objInvoke = c9659Gcj.A03.AEo().invoke(obj);
                    break;
                }
            case 1:
                synchronized (c9659Gcj.A01) {
                    c9659Gcj.A03.AJZ().invoke(obj);
                }
                return Unit.INSTANCE;
            default:
                obj2 = c9659Gcj.A01;
                synchronized (obj2) {
                    objInvoke = (Function0) c9659Gcj.A03.ALD().invoke(obj);
                    break;
                }
        }
        return objInvoke;
    }
}
