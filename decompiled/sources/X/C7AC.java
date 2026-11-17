package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.7AC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AC implements Iterator<ADq>, BOA {
    public int A00 = -1;
    public ADq A01;
    public int A02;
    public int A03;
    public int A04;
    public final /* synthetic */ C7AD A05;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException(C8j2.A00(0));
    }

    public C7AC(C7AD c7ad) {
        this.A05 = c7ad;
        int iA04 = ATD.A04(0, 0, c7ad.A01.length());
        this.A03 = iA04;
        this.A04 = iA04;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            r8 = this;
            int r7 = r8.A04
            r5 = 0
            if (r7 >= 0) goto Lb
            r8.A00 = r5
            r0 = 0
            r8.A01 = r0
            return
        Lb:
            X.7AD r6 = r8.A05
            int r1 = r6.A00
            r2 = -1
            r3 = 1
            if (r1 <= 0) goto L1b
            int r0 = r8.A02
            int r0 = r0 + 1
            r8.A02 = r0
            if (r0 >= r1) goto L53
        L1b:
            java.lang.CharSequence r4 = r6.A01
            int r0 = r4.length()
            if (r7 > r0) goto L53
            X.G0V<java.lang.CharSequence, java.lang.Integer, X.HxE<java.lang.Integer, java.lang.Integer>> r1 = r6.A02
            int r0 = r8.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.invoke(r4, r0)
            X.HxE r1 = (X.HxE) r1
            if (r1 == 0) goto L53
            A r0 = r1.first
            int r2 = X.AnonymousClass001.A0F(r0)
            B r0 = r1.second
            int r1 = X.AnonymousClass001.A0F(r0)
            int r0 = r8.A03
            X.ADq r0 = X.ATD.A0C(r0, r2)
            r8.A01 = r0
            int r2 = r2 + r1
            r8.A03 = r2
            if (r1 != 0) goto L4d
            r5 = 1
        L4d:
            int r2 = r2 + r5
        L4e:
            r8.A04 = r2
            r8.A00 = r3
            return
        L53:
            int r4 = r8.A03
            java.lang.CharSequence r0 = r6.A01
            int r0 = r0.length()
            int r1 = r0 + (-1)
            X.ADq r0 = new X.ADq
            r0.<init>(r4, r1)
            r8.A01 = r0
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7AC.A00():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A00 == -1) {
            A00();
        }
        return this.A00 == 1;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ ADq next() {
        if (this.A00 == -1) {
            A00();
        }
        if (this.A00 == 0) {
            throw new NoSuchElementException();
        }
        ADq aDq = this.A01;
        C7384Etj.A0Z(aDq, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.A01 = null;
        this.A00 = -1;
        return aDq;
    }
}
