package X;

import java.lang.ref.PhantomReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class EUX extends PhantomReference<Object> {
    public EUX next;
    public EUX previous;

    public abstract void destruct();

    public EUX(Object obj) {
        AtomicReference<EUX> atomicReference;
        EUX eux;
        super(obj, EUZ.A02);
        EUb eUb = EUZ.A01;
        do {
            atomicReference = eUb.A00;
            eux = atomicReference.get();
            this.next = eux;
        } while (!C7O.A00(eux, this, atomicReference));
    }

    public EUX() {
        super(null, EUZ.A02);
    }
}
