package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public class GBT {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(GBT.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(GBT.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A02 = AtomicReferenceFieldUpdater.newUpdater(GBT.class, Object.class, "_removedRef$volatile");
    public volatile /* synthetic */ Object _next$volatile = this;
    public volatile /* synthetic */ Object _prev$volatile = this;
    public volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (X.AbstractC5217DdT.A00(r4, r1, ((X.C9256GBj) r2).A00, r3) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.GBT A00(X.GBT r8) {
        /*
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = X.GBT.A01
            java.lang.Object r6 = r7.get(r8)
            X.GBT r6 = (X.GBT) r6
            r5 = 0
            r1 = r6
        La:
            r4 = r5
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = X.GBT.A00
            java.lang.Object r2 = r3.get(r1)
            if (r2 != r8) goto L1c
            if (r6 == r1) goto L46
            boolean r0 = X.AbstractC5217DdT.A00(r8, r6, r1, r7)
            if (r0 != 0) goto L46
            goto L0
        L1c:
            boolean r0 = r8.A03()
            if (r0 == 0) goto L23
            return r5
        L23:
            boolean r0 = r2 instanceof X.C9256GBj
            if (r0 == 0) goto L3c
            if (r4 == 0) goto L35
            X.GBj r2 = (X.C9256GBj) r2
            X.GBT r0 = r2.A00
            boolean r0 = X.AbstractC5217DdT.A00(r4, r1, r0, r3)
            if (r0 == 0) goto L0
            r1 = r4
            goto La
        L35:
            java.lang.Object r1 = r7.get(r1)
            X.GBT r1 = (X.GBT) r1
            goto Lb
        L3c:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            X.C7384Etj.A0Z(r2, r0)
            X.GBT r2 = (X.GBT) r2
            r4 = r1
            r1 = r2
            goto Lb
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBT.A00(X.GBT):X.GBT");
    }

    public static final void A01(GBT gbt, GBT gbt2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
        do {
            obj = atomicReferenceFieldUpdater.get(gbt2);
            if (A00.get(gbt) != gbt2) {
                return;
            }
        } while (!AbstractC5217DdT.A00(gbt2, obj, gbt, atomicReferenceFieldUpdater));
        if (gbt.A03()) {
            A00(gbt2);
        }
    }

    public final GBT A02() {
        C9256GBj c9256GBj;
        GBT gbt;
        Object obj = A00.get(this);
        if ((obj instanceof C9256GBj) && (c9256GBj = (C9256GBj) obj) != null && (gbt = c9256GBj.A00) != null) {
            return gbt;
        }
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (GBT) obj;
    }

    public boolean A03() {
        return A00.get(this) instanceof C9256GBj;
    }

    public final boolean A04(GBT gbt, int i) {
        GBT gbtA00;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            gbtA00 = A00(this);
            if (gbtA00 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A01;
                Object obj = atomicReferenceFieldUpdater2.get(this);
                while (true) {
                    gbtA00 = (GBT) obj;
                    if (!gbtA00.A03()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater2.get(gbtA00);
                }
            }
            if (gbtA00 instanceof C9265GBs) {
                return (((C9265GBs) gbtA00).A00 & i) == 0 && gbtA00.A04(gbt, i);
            }
            A01.set(gbt, gbtA00);
            atomicReferenceFieldUpdater = A00;
            atomicReferenceFieldUpdater.set(gbt, this);
        } while (!AbstractC5217DdT.A00(gbtA00, this, gbt, atomicReferenceFieldUpdater));
        A01(gbt, this);
        return true;
    }

    public String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(new C2590Bem(this, 4));
        sbA0w.append('@');
        AbstractC7609F5w.A1K(sbA0w, this);
        return sbA0w.toString();
    }
}
