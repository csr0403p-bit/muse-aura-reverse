package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Eae, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6826Eae {
    public static final int A00;
    public static final AtomicReference<C6830Eai>[] A01;
    public static final C6830Eai A02 = new C6830Eai(new byte[0], 0, 0, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((BV5.A00() * 2) - 1);
        A00 = iHighestOneBit;
        AtomicReference<C6830Eai>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        A01 = atomicReferenceArr;
    }

    public static final void A01(C6830Eai c6830Eai) {
        int i;
        if (c6830Eai.A02 != null || c6830Eai.A03 != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c6830Eai.A05) {
            return;
        }
        AtomicReference<C6830Eai> atomicReference = A01[(int) (Thread.currentThread().getId() & (A00 - 1))];
        C6830Eai c6830Eai2 = A02;
        C6830Eai andSet = atomicReference.getAndSet(c6830Eai2);
        if (andSet != c6830Eai2) {
            if (andSet != null) {
                i = andSet.A00;
                if (i >= 65536) {
                    atomicReference.set(andSet);
                    return;
                }
            } else {
                i = 0;
            }
            c6830Eai.A02 = andSet;
            c6830Eai.A01 = 0;
            c6830Eai.A00 = i + 8192;
            atomicReference.set(c6830Eai);
        }
    }

    public static final C6830Eai A00() {
        AtomicReference<C6830Eai> atomicReference = A01[(int) (Thread.currentThread().getId() & (A00 - 1))];
        C6830Eai c6830Eai = A02;
        C6830Eai andSet = atomicReference.getAndSet(c6830Eai);
        if (andSet != c6830Eai) {
            if (andSet != null) {
                atomicReference.set(andSet.A02);
                andSet.A02 = null;
                andSet.A00 = 0;
                return andSet;
            }
            atomicReference.set(null);
        }
        return new C6830Eai();
    }
}
