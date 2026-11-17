package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class F31 {
    public static final C1531Akn A00(C1HY c1hy) {
        C1531Akn c1531Akn;
        C7384Etj.A0Y(c1hy, 0);
        F2N lifecycle = c1hy.getLifecycle();
        C7384Etj.A0Y(lifecycle, 0);
        while (true) {
            AtomicReference<Object> atomicReference = lifecycle.A00.A00;
            c1531Akn = (C1531Akn) atomicReference.get();
            if (c1531Akn != null) {
                break;
            }
            C8eO c8eO = new C8eO(null);
            GBK gbk = AbstractC9266GBt.A00;
            B8t b8t = ((B8t) AbstractC7429Evm.A00).A01;
            c1531Akn = new C1531Akn(lifecycle, C78W.A02(c8eO, b8t));
            if (C7O.A00(null, c1531Akn, atomicReference)) {
                GAo.A02(C79.A00, b8t, new C60C(c1531Akn, (C1531Akn) null, (HtJ<? super C60C>) 1), c1531Akn);
                break;
            }
        }
        return c1531Akn;
    }
}
