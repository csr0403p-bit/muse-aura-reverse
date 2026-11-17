package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.DaL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5132DaL extends AbstractC5160Daq {
    public int A00;
    public int A01;
    public C5126DaA A02;
    public C5161Dar A03;
    public C5125Da9 A04;
    public boolean A05;
    public boolean A06;
    public int[] A07;
    public final int A08;
    public final int A09;
    public final /* synthetic */ C5130DaE A0A;

    public C5132DaL(C5130DaE c5130DaE, int[] iArr, int i, int i2) {
        this.A0A = c5130DaE;
        this.A07 = iArr;
        this.A00 = i;
        this.A01 = i2;
        AtomicReferenceFieldUpdater<C5130DaE, AbstractC5140DaU> atomicReferenceFieldUpdater = C5130DaE.A07;
        this.A09 = c5130DaE.A03.A01.size();
        this.A08 = this.A01;
    }

    public static final void A00(C5132DaL c5132DaL) {
        int[] iArrCopyOf;
        AbstractC5169Db0 c5141DaV;
        C5130DaE c5130DaE = c5132DaL.A0A;
        int i = c5132DaL.A00;
        if (i == c5132DaL.A09) {
            c5141DaV = C5153Daj.A00;
        } else {
            int[] iArr = c5132DaL.A07;
            if (iArr != null) {
                iArrCopyOf = Arrays.copyOf(iArr, i);
                C7384Etj.A0U(iArrCopyOf);
            } else {
                iArrCopyOf = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArrCopyOf[i2] = i2;
                }
            }
            c5141DaV = new C5141DaV(null, iArrCopyOf, iArrCopyOf.length);
        }
        AtomicReferenceFieldUpdater<C5130DaE, AbstractC5140DaU> atomicReferenceFieldUpdater = C5130DaE.A07;
        c5130DaE.A06 = c5141DaV;
        c5130DaE.A05 = null;
        c5132DaL.A06 = true;
    }
}
