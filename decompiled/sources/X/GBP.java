package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes6.dex */
public abstract class GBP extends GBT implements HsS, InterfaceC9269GBw {
    public GBM A00;

    public final GBM A05() {
        GBM gbm = this.A00;
        if (gbm != null) {
            return gbm;
        }
        C7384Etj.A0b("job");
        throw F60.createAndThrow();
    }

    public void A06(Throwable th) {
        G0U<Throwable, Unit> g0u;
        if (this instanceof C9254GBh) {
            C9254GBh c9254GBh = (C9254GBh) this;
            c9254GBh.A00.A0Q(c9254GBh.A05());
            return;
        }
        if (this instanceof GAf) {
            GAf gAf = (GAf) this;
            C9273GCa.A00(gAf.A01, Unit.INSTANCE, gAf.A00);
            return;
        }
        if (this instanceof GAi) {
            GAi gAi = (GAi) this;
            GBM gbm = gAi.A01;
            Object objA00 = GBM.A01.get(gbm);
            if (!(objA00 instanceof C10474Hkl)) {
                objA00 = AbstractC9251GBe.A00(objA00);
            }
            C9273GCa.A00(gbm, objA00, gAi.A00);
            return;
        }
        if (this instanceof GAb) {
            g0u = ((GAb) this).A00;
        } else {
            Hm2 hm2 = (Hm2) this;
            if (!Hm2.A01.compareAndSet(hm2, 0, 1)) {
                return;
            } else {
                g0u = hm2.A00;
            }
        }
        g0u.invoke(th);
    }

    public boolean A07() {
        if ((this instanceof GAc) || (this instanceof GBZ)) {
            return false;
        }
        if (this instanceof C9254GBh) {
            return true;
        }
        return ((this instanceof GAf) || (this instanceof GAi) || !(this instanceof Hm2)) ? false : true;
    }

    @Override // X.InterfaceC9269GBw
    public final GC1 AH7() {
        return null;
    }

    @Override // X.InterfaceC9269GBw
    public final boolean isActive() {
        return true;
    }

    @Override // X.HsS
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        Object obj2;
        GBT gbt;
        Object c9256GBj;
        GBM gbmA05 = A05();
        do {
            atomicReferenceFieldUpdater = GBM.A01;
            obj = atomicReferenceFieldUpdater.get(gbmA05);
            if (!(obj instanceof GBP)) {
                if (!(obj instanceof InterfaceC9269GBw) || ((InterfaceC9269GBw) obj).AH7() == null) {
                    return;
                }
                do {
                    atomicReferenceFieldUpdater2 = GBT.A00;
                    obj2 = atomicReferenceFieldUpdater2.get(this);
                    if ((obj2 instanceof C9256GBj) || obj2 == this) {
                        return;
                    }
                    C7384Etj.A0Z(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    gbt = (GBT) obj2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = GBT.A02;
                    c9256GBj = atomicReferenceFieldUpdater3.get(gbt);
                    if (c9256GBj == null) {
                        c9256GBj = new C9256GBj(gbt);
                        atomicReferenceFieldUpdater3.set(gbt, c9256GBj);
                    }
                } while (!AbstractC5217DdT.A00(this, obj2, c9256GBj, atomicReferenceFieldUpdater2));
                GBT.A00(gbt);
                return;
            }
            if (obj != this) {
                return;
            }
        } while (!AbstractC5217DdT.A00(gbmA05, obj, AbstractC9251GBe.A00, atomicReferenceFieldUpdater));
    }

    @Override // X.GBT
    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        AbstractC7609F5w.A1L(sbA0w, this);
        sbA0w.append('@');
        AbstractC7609F5w.A1K(sbA0w, this);
        sbA0w.append("[job@");
        AbstractC7609F5w.A1K(sbA0w, A05());
        return BV5.A0o(sbA0w);
    }
}
