package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public final class GBS implements InterfaceC9269GBw {
    public final GC1 A00;
    public volatile /* synthetic */ Object _exceptionsHolder$volatile;
    public volatile /* synthetic */ int _isCompleting$volatile = 0;
    public volatile /* synthetic */ Object _rootCause$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(GBS.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A03 = AtomicReferenceFieldUpdater.newUpdater(GBS.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A02 = AtomicReferenceFieldUpdater.newUpdater(GBS.class, Object.class, "_exceptionsHolder$volatile");

    public GBS(Throwable th, GC1 gc1) {
        this.A00 = gc1;
        this._rootCause$volatile = th;
    }

    public final void A00(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A03;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (th != obj) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A02;
            Object obj2 = atomicReferenceFieldUpdater2.get(this);
            if (obj2 == null) {
                atomicReferenceFieldUpdater2.set(this, th);
                return;
            }
            if (!(obj2 instanceof Throwable)) {
                if (obj2 instanceof ArrayList) {
                    ((AbstractCollection) obj2).add(th);
                    return;
                } else {
                    StringBuilder sb = new StringBuilder("State is ");
                    sb.append(obj2);
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (th != obj2) {
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj2);
                arrayList.add(th);
                atomicReferenceFieldUpdater2.set(this, arrayList);
            }
        }
    }

    @Override // X.InterfaceC9269GBw
    public final GC1 AH7() {
        return this.A00;
    }

    @Override // X.InterfaceC9269GBw
    public final boolean isActive() {
        return AnonymousClass002.A1Y(A03.get(this));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Finishing[cancelling=");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A03;
        sbA0x.append(AnonymousClass002.A1X(atomicReferenceFieldUpdater.get(this)));
        sbA0x.append(", completing=");
        sbA0x.append(BV7.A1Q(A01.get(this)));
        sbA0x.append(", rootCause=");
        sbA0x.append(atomicReferenceFieldUpdater.get(this));
        sbA0x.append(", exceptions=");
        sbA0x.append(A02.get(this));
        sbA0x.append(", list=");
        sbA0x.append(this.A00);
        return BV5.A0o(sbA0x);
    }
}
