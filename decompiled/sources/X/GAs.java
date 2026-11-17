package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes6.dex */
public final class GAs<T> extends GAk<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A00 = AtomicIntegerFieldUpdater.newUpdater(GAs.class, "_decision$volatile");
    public volatile /* synthetic */ int _decision$volatile;

    @Override // X.GAk, X.GAq
    public final void A0V(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A00;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw C3cG.A0Q("Already resumed");
                }
                HtJ htJA02 = C7Bm.A02(((GAk) this).A00);
                if (obj instanceof C10474Hkl) {
                    Throwable th = ((C10474Hkl) obj).A00;
                    C7384Etj.A0Y(th, 0);
                    obj = C3cG.A0s(th);
                }
                GBI.A00(obj, htJA02);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
