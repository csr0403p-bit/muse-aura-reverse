package X;

import java.util.Comparator;

/* renamed from: X.I0e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10634I0e implements Comparator {
    public final int $t;

    public C10634I0e(int i) {
        this.$t = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[ORIG_RETURN, RETURN] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(T r3, T r4) {
        /*
            r2 = this;
            int r0 = r2.$t
            switch(r0) {
                case 0: goto La9;
                case 1: goto La9;
                case 2: goto La0;
                case 3: goto L97;
                case 4: goto L8e;
                case 5: goto L85;
                case 6: goto L7c;
                case 7: goto L73;
                case 8: goto L6a;
                case 9: goto L61;
                case 10: goto L58;
                case 11: goto L4e;
                case 12: goto L7;
                case 13: goto L45;
                case 14: goto L36;
                default: goto L5;
            }
        L5:
            r1 = 0
        L6:
            return r1
        L7:
            X.FU7 r3 = (X.FU7) r3
            X.FU7 r4 = (X.FU7) r4
            androidx.recyclerview.widget.RecyclerView r2 = r3.A03
            boolean r1 = X.AnonymousClass002.A1Y(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
            boolean r0 = X.AnonymousClass002.A1Y(r0)
            if (r1 == r0) goto L1d
            if (r2 != 0) goto L25
        L1b:
            r1 = 1
            return r1
        L1d:
            boolean r1 = r3.A04
            boolean r0 = r4.A04
            if (r1 == r0) goto L27
            if (r1 == 0) goto L1b
        L25:
            r1 = -1
            return r1
        L27:
            int r1 = r4.A02
            int r0 = r3.A02
            int r1 = r1 - r0
            if (r1 != 0) goto L6
            int r1 = r3.A00
            int r0 = r4.A00
            int r1 = r1 - r0
            if (r1 == 0) goto L5
            return r1
        L36:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = (java.lang.String) r4
            X.GtM[] r0 = X.GtM.A00
            int r1 = r4.length()
            int r0 = r3.length()
            goto L56
        L45:
            X.Fuh r3 = (X.C8964Fuh) r3
            java.time.Instant r1 = r3.A07
            X.Fuh r4 = (X.C8964Fuh) r4
            java.time.Instant r0 = r4.A07
            goto Lb1
        L4e:
            X.FFQ r3 = (X.FFQ) r3
            X.FFQ r4 = (X.FFQ) r4
            int r1 = r3.A01
            int r0 = r4.A01
        L56:
            int r1 = r1 - r0
            return r1
        L58:
            X.FxG r3 = (X.C9034FxG) r3
            java.time.Instant r1 = r3.A05
            X.FxG r4 = (X.C9034FxG) r4
            java.time.Instant r0 = r4.A05
            goto Lb1
        L61:
            X.Fro r3 = (X.C8875Fro) r3
            java.time.Instant r1 = r3.A01
            X.Fro r4 = (X.C8875Fro) r4
            java.time.Instant r0 = r4.A01
            goto Lb1
        L6a:
            X.Fx8 r3 = (X.C9028Fx8) r3
            java.time.Instant r1 = r3.A01
            X.Fx8 r4 = (X.C9028Fx8) r4
            java.time.Instant r0 = r4.A01
            goto Lb1
        L73:
            X.Fwh r3 = (X.C9004Fwh) r3
            java.time.Instant r1 = r3.A02
            X.Fwh r4 = (X.C9004Fwh) r4
            java.time.Instant r0 = r4.A02
            goto Lb1
        L7c:
            X.Fy8 r3 = (X.C9081Fy8) r3
            java.time.Instant r1 = r3.A01
            X.Fy8 r4 = (X.C9081Fy8) r4
            java.time.Instant r0 = r4.A01
            goto Lb1
        L85:
            X.Frs r3 = (X.C8879Frs) r3
            java.time.Instant r1 = r3.A01
            X.Frs r4 = (X.C8879Frs) r4
            java.time.Instant r0 = r4.A01
            goto Lb1
        L8e:
            X.Fxq r3 = (X.C9068Fxq) r3
            java.time.Instant r1 = r3.A03
            X.Fxq r4 = (X.C9068Fxq) r4
            java.time.Instant r0 = r4.A03
            goto Lb1
        L97:
            X.FyF r3 = (X.C9088FyF) r3
            java.time.Instant r1 = r3.A02
            X.FyF r4 = (X.C9088FyF) r4
            java.time.Instant r0 = r4.A02
            goto Lb1
        La0:
            X.Frn r3 = (X.C8874Frn) r3
            java.time.Instant r1 = r3.A01
            X.Frn r4 = (X.C8874Frn) r4
            java.time.Instant r0 = r4.A01
            goto Lb1
        La9:
            X.FxB r3 = (X.C9030FxB) r3
            java.time.Instant r1 = r3.A02
            X.FxB r4 = (X.C9030FxB) r4
            java.time.Instant r0 = r4.A02
        Lb1:
            int r1 = X.AbstractC7536F0j.A00(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10634I0e.compare(java.lang.Object, java.lang.Object):int");
    }
}
