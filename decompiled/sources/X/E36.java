package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class E36 implements InterfaceC5458Dit {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC6413E4p A03;
    public E5Q A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final SparseArray<InterfaceC6406E4i> A08;
    public final SparseBooleanArray A09;
    public final SparseBooleanArray A0A;
    public final E1P A0B;
    public final C6373E3a A0C;
    public final E2D A0D;
    public final List<E3J> A0E;
    public final int A0F;
    public final SparseIntArray A0G;
    public final InterfaceC5885DrL A0H;

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AcL(long r15, long r17) {
        /*
            r14 = this;
            r3 = 0
            java.util.List<X.E3J> r11 = r14.A0E
            int r10 = r11.size()
            r9 = 0
        L8:
            r12 = 0
            r1 = r17
            if (r9 >= r10) goto L37
            java.lang.Object r8 = r11.get(r9)
            X.E3J r8 = (X.E3J) r8
            long r4 = r8.A01()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L31
            long r4 = r8.A00()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L34
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 == 0) goto L34
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r0 == 0) goto L34
        L31:
            r8.A05(r1)
        L34:
            int r9 = r9 + 1
            goto L8
        L37:
            int r0 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r0 == 0) goto L42
            X.E5Q r0 = r14.A04
            if (r0 == 0) goto L42
            r0.A01(r1)
        L42:
            X.E1P r0 = r14.A0B
            r0.A0P(r3)
            android.util.SparseIntArray r0 = r14.A0G
            r0.clear()
            r2 = 0
        L4d:
            android.util.SparseArray<X.E4i> r1 = r14.A08
            int r0 = r1.size()
            if (r2 >= r0) goto L61
            java.lang.Object r0 = r1.valueAt(r2)
            X.E4i r0 = (X.InterfaceC6406E4i) r0
            r0.AcK()
            int r2 = r2 + 1
            goto L4d
        L61:
            r14.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E36.AcL(long, long):void");
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    @Deprecated
    public E36() {
        this(new E3J(0L), InterfaceC5885DrL.A00, new E21(ImmutableList.of()), 1);
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        if ((this.A0F & 1) == 0) {
            interfaceC6413E4p = new C6195Dxf(interfaceC6413E4p, this.A0H);
        }
        this.A03 = interfaceC6413E4p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024f  */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v4 */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AZ4(X.E2K r30, X.C5542DkK r31) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E36.AZ4(X.E2K, X.DkK):int");
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        byte[] bArr = this.A0B.A02;
        e2k.AXi(bArr, 0, 940);
        int i = 0;
        do {
            int i2 = 0;
            while (bArr[(i2 * 188) + i] == 71) {
                i2++;
                if (i2 >= 5) {
                    e2k.Afm(i);
                    return true;
                }
            }
            i++;
        } while (i < 188);
        return false;
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E36(E3J e3j, InterfaceC5885DrL interfaceC5885DrL, E2D e2d, int i) {
        this.A0D = e2d;
        this.A0F = i;
        this.A0H = interfaceC5885DrL;
        this.A0E = Collections.singletonList(e3j);
        E1P e1p = new E1P();
        e1p.A02 = new byte[9400];
        e1p.A00 = 0;
        this.A0B = e1p;
        this.A09 = new SparseBooleanArray();
        this.A0A = new SparseBooleanArray();
        this.A08 = BV4.A0B();
        this.A0G = new SparseIntArray();
        this.A0C = new C6373E3a();
        this.A03 = InterfaceC6413E4p.A00;
        this.A01 = -1;
        this.A09.clear();
        SparseArray<InterfaceC6406E4i> sparseArray = this.A08;
        sparseArray.clear();
        SparseArray sparseArrayA0B = BV4.A0B();
        int size = sparseArrayA0B.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArrayA0B.keyAt(i2), sparseArrayA0B.valueAt(i2));
        }
        sparseArray.put(0, new E3I(new E35(this)));
    }
}
