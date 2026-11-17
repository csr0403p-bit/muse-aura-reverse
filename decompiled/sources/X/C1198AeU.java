package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.AeU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1198AeU implements InterfaceC1134Abi, InterfaceC1197AeS {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final C1202AeY A09;
    public final AXN A0A;
    public final List A0B;
    public final C3UX A0C;
    public final boolean A0D;
    public final int[] A0E;
    public final int[] A0F;
    public final C1204Aea A0G;
    public final InterfaceC1134Abi A0H;
    public final boolean A0I;
    public final boolean A0J;

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1198AeU A00(int r37) {
        /*
            r36 = this;
            r0 = r36
            boolean r13 = r0.A0J
            r2 = 0
            if (r13 != 0) goto La1
            java.util.List r12 = r0.A0B
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto La1
            int[] r11 = r0.A0E
            int r1 = r11.length
            if (r1 == 0) goto La1
            int[] r4 = r0.A0F
            int r3 = r4.length
            if (r3 == 0) goto La1
            int r1 = r12.size()
            r2 = 0
            if (r2 >= r1) goto L2b
            r12.get(r2)
            java.lang.String r1 = "getNonScrollableItem"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L2b:
            int r1 = r12.size()
            if (r2 >= r1) goto L3c
            r12.get(r2)
            java.lang.String r1 = "applyScrollDelta"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L3c:
            int[] r10 = new int[r3]
        L3e:
            r1 = r4[r2]
            r5 = r37
            int r1 = r1 - r37
            r10[r2] = r1
            int r2 = r2 + 1
            if (r2 < r3) goto L3e
            float r1 = (float) r5
            r25 = r1
            float r1 = r0.A01
            r18 = r1
            X.Abi r1 = r0.A0H
            r19 = r1
            boolean r1 = r0.A0D
            if (r1 != 0) goto L5d
            r35 = 0
            if (r37 <= 0) goto L5f
        L5d:
            r35 = 1
        L5f:
            boolean r1 = r0.A0I
            r17 = r1
            X.Aea r15 = r0.A0G
            X.AeY r14 = r0.A09
            X.AXN r9 = r0.A0A
            int r8 = r0.A05
            long r3 = r0.A08
            int r7 = r0.A07
            int r6 = r0.A06
            int r5 = r0.A03
            int r2 = r0.A02
            int r1 = r0.A04
            X.3UX r0 = r0.A0C
            X.AeU r16 = new X.AeU
            r32 = r1
            r33 = r3
            r36 = r17
            r37 = r13
            r26 = r18
            r27 = r8
            r28 = r7
            r29 = r6
            r30 = r5
            r31 = r2
            r20 = r9
            r21 = r12
            r22 = r0
            r23 = r11
            r24 = r10
            r17 = r15
            r18 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36, r37)
            return r16
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1198AeU.A00(int):X.AeU");
    }

    @Override // X.InterfaceC1134Abi
    public final Map<AbstractC1493Ak0, Integer> ACJ() {
        return this.A0H.ACJ();
    }

    @Override // X.InterfaceC1134Abi
    public final G0U<InterfaceC1620Amr, Unit> AJs() {
        return this.A0H.AJs();
    }

    @Override // X.InterfaceC1134Abi
    public final void AXv() {
        this.A0H.AXv();
    }

    @Override // X.InterfaceC1134Abi
    public final int getHeight() {
        return this.A0H.getHeight();
    }

    @Override // X.InterfaceC1134Abi
    public final int getWidth() {
        return this.A0H.getWidth();
    }

    public C1198AeU(C1204Aea c1204Aea, C1202AeY c1202AeY, InterfaceC1134Abi interfaceC1134Abi, AXN axn, List list, C3UX c3ux, int[] iArr, int[] iArr2, float f, float f2, int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z, boolean z2, boolean z3) {
        this.A0E = iArr;
        this.A0F = iArr2;
        this.A00 = f;
        this.A0H = interfaceC1134Abi;
        this.A01 = f2;
        this.A0D = z;
        this.A0I = z2;
        this.A0J = z3;
        this.A0G = c1204Aea;
        this.A09 = c1202AeY;
        this.A0A = axn;
        this.A05 = i;
        this.A0B = list;
        this.A08 = j;
        this.A07 = i2;
        this.A06 = i3;
        this.A03 = i4;
        this.A02 = i5;
        this.A04 = i6;
        this.A0C = c3ux;
    }
}
