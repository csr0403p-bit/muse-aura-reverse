package X;

import androidx.media3.common.util.Util;
import com.google.common.collect.ByFunctionOrdering;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.NaturalOrdering;
import java.util.List;

/* renamed from: X.Dzy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6302Dzy implements E0T {
    public static final DOM<E00> A02 = new ByFunctionOrdering(new F5K(9), NaturalOrdering.A00);
    public final ImmutableList<ImmutableList<E0J>> A00;
    public final long[] A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6302Dzy(java.util.List<X.E00> r16) {
        /*
            r15 = this;
            r10 = r15
            r15.<init>()
            r3 = r16
            int r0 = r3.size()
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            r11 = 0
            r6 = 1
            if (r0 != r6) goto L4b
            java.lang.Object r5 = X.AbstractC7398Eub.A01(r3)
            X.E00 r5 = (X.E00) r5
            long r3 = r5.A02
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 != 0) goto L22
            r3 = 0
        L22:
            long r1 = r5.A00
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 != 0) goto L37
            com.google.common.collect.ImmutableList<X.E0J> r0 = r5.A03
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0)
            r10.A00 = r0
            long[] r0 = new long[r6]
            r0[r11] = r3
        L34:
            r10.A01 = r0
            return
        L37:
            com.google.common.collect.ImmutableList<X.E0J> r5 = r5.A03
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r5, r0)
            r10.A00 = r0
            long r1 = r1 + r3
            long[] r0 = new long[r7]
            r0[r11] = r3
            r0[r6] = r1
            goto L34
        L4b:
            int r0 = r3.size()
            int r0 = r0 * 2
            long[] r2 = new long[r0]
            r10.A01 = r2
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r2, r0)
            java.util.ArrayList r9 = X.C3cG.A0h()
            X.DOM<X.E00> r0 = X.C6302Dzy.A02
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.sortedCopyOf(r0, r3)
            r14 = 0
        L68:
            int r0 = r8.size()
            if (r11 >= r0) goto Ld0
            java.lang.Object r7 = r8.get(r11)
            X.E00 r7 = (X.E00) r7
            long r4 = r7.A02
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r0 != 0) goto L7c
            r4 = 0
        L7c:
            long r2 = r7.A00
            long r2 = r2 + r4
            if (r14 == 0) goto Lc3
            long[] r0 = r10.A01
            int r6 = r14 + (-1)
            r12 = r0[r6]
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 < 0) goto Lc3
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 != 0) goto Lb7
            java.lang.Object r0 = r9.get(r6)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb7
        L9b:
            com.google.common.collect.ImmutableList<X.E0J> r0 = r7.A03
            r9.set(r6, r0)
        La0:
            long r0 = r7.A00
            int r4 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r4 == 0) goto Lb4
            long[] r0 = r10.A01
            int r1 = r14 + 1
            r0[r14] = r2
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            r9.add(r0)
            r14 = r1
        Lb4:
            int r11 = r11 + 1
            goto L68
        Lb7:
            java.lang.String r1 = "CuesWithTimingSubtitle"
            java.lang.String r0 = "Truncating unsupported overlapping cues."
            X.CNC.A04(r1, r0)
            long[] r0 = r10.A01
            r0[r6] = r4
            goto L9b
        Lc3:
            long[] r0 = r10.A01
            int r1 = r14 + 1
            r0[r14] = r4
            com.google.common.collect.ImmutableList<X.E0J> r0 = r7.A03
            r9.add(r0)
            r14 = r1
            goto La0
        Ld0:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r9)
            r10.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6302Dzy.<init>(java.util.List):void");
    }

    @Override // X.E0T
    public final /* bridge */ /* synthetic */ List AEJ(long j) {
        int iA08 = Util.A08(this.A01, j, false);
        return iA08 == -1 ? ImmutableList.of() : this.A00.get(iA08);
    }

    @Override // X.E0T
    public final long AFN(int i) {
        C1G.A07(C8j3.A1T(i, this.A00.size()));
        return this.A01[i];
    }

    @Override // X.E0T
    public final int AFO() {
        return this.A00.size();
    }

    @Override // X.E0T
    public final int AI2(long j) {
        int iA07 = Util.A07(this.A01, j, false);
        if (iA07 >= this.A00.size()) {
            return -1;
        }
        return iA07;
    }
}
