package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class E8e implements F0T {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public E8e(int i, DcR dcR, F0T<T> f0t) {
        this.$t = i;
        this.A00 = f0t;
        this.A01 = dcR;
    }

    @Override // X.F0T
    public final void invoke(F1G<T> f1g) {
        switch (this.$t) {
            case 0:
                C7384Etj.A0Y(f1g, 0);
                if (!BV4.A1V((AtomicBoolean) this.A00)) {
                    return;
                }
                break;
            case 1:
                C7384Etj.A0Y(f1g, 0);
                ((DcR) this.A00).A01.set(true);
                break;
            default:
                C7384Etj.A0Y(f1g, 0);
                ((Function0) this.A01).invoke();
                ((HtJ) this.A00).resumeWith(f1g);
                return;
        }
        ((F0T) this.A01).invoke(f1g);
    }
}
