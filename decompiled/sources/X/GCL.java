package X;

import X.GCL;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public abstract class GCL<N extends GCL<N>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(GCL.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(GCL.class, Object.class, "_prev$volatile");
    public volatile /* synthetic */ Object _next$volatile;
    public volatile /* synthetic */ Object _prev$volatile;

    public abstract boolean A03();

    public final N A00() {
        Object obj = A00.get(this);
        if (obj == GCM.A00) {
            return null;
        }
        return (N) obj;
    }

    public final void A01() {
        A01.set(this, null);
    }

    public final void A02() {
        GCL gcl;
        Object obj;
        GCL gcl2;
        GCL gclA00;
        if (A00() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            while (true) {
                gcl = (GCL) obj2;
                if (gcl == null || !gcl.A03()) {
                    break;
                } else {
                    obj2 = atomicReferenceFieldUpdater.get(gcl);
                }
            }
            GCL gclA002 = A00();
            C7384Etj.A0X(gclA002);
            while (gclA002.A03() && (gclA00 = gclA002.A00()) != null) {
                gclA002 = gclA00;
            }
            do {
                obj = atomicReferenceFieldUpdater.get(gclA002);
                gcl2 = gcl;
                if (obj == null) {
                    gcl2 = null;
                }
            } while (!AbstractC5217DdT.A00(gclA002, obj, gcl2, atomicReferenceFieldUpdater));
            if (gcl != null) {
                A00.set(gcl, gclA002);
            }
            if (!gclA002.A03() || gclA002.A00() == null) {
                if (gcl == null || !gcl.A03()) {
                    return;
                }
            }
        }
    }
}
