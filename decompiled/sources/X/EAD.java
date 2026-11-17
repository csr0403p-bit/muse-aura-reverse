package X;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes5.dex */
public final class EAD {
    public EAL A00;
    public EAL A01;
    public boolean A02;
    public final ImmutableList<EAX> A04;
    public final List<EAX> A05 = C3cG.A0h();
    public ByteBuffer[] A03 = new ByteBuffer[0];

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.EAD r8, java.nio.ByteBuffer r9) {
        /*
        L0:
            r7 = 0
            r5 = 0
        L2:
            java.nio.ByteBuffer[] r1 = r8.A03
            int r0 = r1.length
            int r0 = r0 + (-1)
            if (r5 > r0) goto L7b
            r0 = r1[r5]
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L3b
            java.util.List<X.EAX> r1 = r8.A05
            java.lang.Object r6 = r1.get(r5)
            X.EAX r6 = (X.EAX) r6
            boolean r0 = r6.isEnded()
            if (r0 == 0) goto L3e
            java.nio.ByteBuffer[] r0 = r8.A03
            r0 = r0[r5]
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L3b
            java.nio.ByteBuffer[] r0 = r8.A03
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r5 >= r0) goto L3b
            int r0 = r5 + 1
            java.lang.Object r0 = r1.get(r0)
            X.EAX r0 = (X.EAX) r0
            r0.AYz()
        L3b:
            int r5 = r5 + 1
            goto L2
        L3e:
            if (r5 <= 0) goto L70
            java.nio.ByteBuffer[] r1 = r8.A03
            int r0 = r5 + (-1)
            r2 = r1[r0]
        L46:
            int r0 = r2.remaining()
            long r3 = (long) r0
            r6.AZ0(r2)
            java.nio.ByteBuffer[] r1 = r8.A03
            java.nio.ByteBuffer r0 = r6.AIL()
            r1[r5] = r0
            int r0 = r2.remaining()
            long r0 = (long) r0
            long r3 = r3 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L6d
            java.nio.ByteBuffer[] r0 = r8.A03
            r0 = r0[r5]
            boolean r1 = r0.hasRemaining()
            r0 = 0
            if (r1 == 0) goto L6e
        L6d:
            r0 = 1
        L6e:
            r7 = r7 | r0
            goto L3b
        L70:
            boolean r0 = r9.hasRemaining()
            if (r0 == 0) goto L78
            r2 = r9
            goto L46
        L78:
            java.nio.ByteBuffer r2 = X.EAX.A00
            goto L46
        L7b:
            if (r7 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EAD.A00(X.EAD, java.nio.ByteBuffer):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EAD) {
                ImmutableList<EAX> immutableList = this.A04;
                int size = immutableList.size();
                ImmutableList<EAX> immutableList2 = ((EAD) obj).A04;
                if (size == immutableList2.size()) {
                    for (int i = 0; i < immutableList.size(); i++) {
                        if (immutableList.get(i) == immutableList2.get(i)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A01() {
        if (this.A02 && this.A05.get(this.A03.length - 1).isEnded()) {
            if (!this.A03[r1.length - 1].hasRemaining()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public EAD(ImmutableList<EAX> immutableList) {
        this.A04 = immutableList;
        EAL eal = EAL.A04;
        this.A00 = eal;
        this.A01 = eal;
        this.A02 = false;
    }
}
