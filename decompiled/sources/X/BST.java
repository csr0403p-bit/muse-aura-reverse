package X;

/* loaded from: classes4.dex */
public final class BST implements InterfaceC04981Yd {
    public final int $t;

    public BST(int i) {
        this.$t = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[LOOP:1: B:19:0x0033->B:20:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e A[LOOP:3: B:26:0x004e->B:28:0x0051, LOOP_START, PHI: r1 r8
  0x004e: PHI (r1v7 int) = (r1v6 int), (r1v8 int) binds: [B:22:0x003e, B:28:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x004e: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:22:0x003e, B:28:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC04981Yd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A4l(X.AXN r4, X.EnumC1820Arj r5, int[] r6, int[] r7, int r8) {
        /*
            r3 = this;
            int r0 = r3.$t
            switch(r0) {
                case 0: goto L59;
                case 1: goto L2e;
                case 2: goto L1d;
                case 3: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            X.Arj r0 = X.EnumC1820Arj.A02
            if (r5 != r0) goto L1b
            r5 = 0
            int r4 = r6.length
            r3 = 0
            r2 = 0
        Le:
            if (r5 >= r4) goto L5
            r1 = r6[r5]
            int r0 = r3 + 1
            r7[r3] = r2
            int r2 = r2 + r1
            int r5 = r5 + 1
            r3 = r0
            goto Le
        L1b:
            r5 = 1
            goto L2f
        L1d:
            X.Arj r0 = X.EnumC1820Arj.A02
            if (r5 == r0) goto L2e
            r2 = 0
            int r1 = r6.length
        L23:
            int r1 = r1 + (-1)
            r0 = -1
            if (r0 >= r1) goto L5
            r0 = r6[r1]
            r7[r1] = r2
            int r2 = r2 + r0
            goto L23
        L2e:
            r5 = 0
        L2f:
            int r4 = r6.length
            r3 = 0
            r2 = 0
            r1 = 0
        L33:
            if (r2 >= r4) goto L3b
            r0 = r6[r2]
            int r1 = r1 + r0
            int r2 = r2 + 1
            goto L33
        L3b:
            int r8 = r8 - r1
            int r1 = r4 + (-1)
            if (r5 != 0) goto L4e
            r2 = 0
        L41:
            if (r3 >= r4) goto L5
            r1 = r6[r3]
            int r0 = r2 + 1
            r7[r2] = r8
            int r8 = r8 + r1
            int r3 = r3 + 1
            r2 = r0
            goto L41
        L4e:
            r0 = -1
            if (r0 >= r1) goto L5
            r0 = r6[r1]
            r7[r1] = r8
            int r8 = r8 + r0
            int r1 = r1 + (-1)
            goto L4e
        L59:
            r5 = 0
            int r4 = r6.length
            r3 = 0
            r2 = 0
        L5d:
            if (r5 >= r4) goto L5
            r1 = r6[r5]
            int r0 = r3 + 1
            r7[r3] = r2
            int r2 = r2 + r1
            int r5 = r5 + 1
            r3 = r0
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BST.A4l(X.AXN, X.Arj, int[], int[], int):void");
    }

    @Override // X.InterfaceC04981Yd, X.InterfaceC1185Ado
    public final /* synthetic */ float AKp() {
        return 0.0f;
    }

    public final String toString() {
        switch (this.$t) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            case 3:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
