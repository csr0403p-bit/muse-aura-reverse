package X;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes6.dex */
public final class FDX {
    public int A00;
    public ArrayList A01;
    public LinkedHashSet<FDW> A02;
    public boolean A03;
    public final int A04;
    public final long A05;
    public final C7764FDr<FBB> A06;
    public final C0938AIr A07;
    public final String A08;
    public final boolean A09;
    public final FDW[] A0A;

    /* JADX WARN: Incorrect types in method signature: (LX/FDW;LX/FDr<LX/FBB;>;)V */
    public final void A00(C7764FDr c7764FDr, FDW fdw) {
        if (!this.A06.equals(c7764FDr)) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        long id = threadCurrentThread.getId();
        long j = this.A05;
        if (id != j) {
            int i = this.A04;
            int i2 = fdw.A05;
            String str = this.A08;
            String name = threadCurrentThread.getName();
            long id2 = threadCurrentThread.getId();
            StringBuilder sbA0y = C60O.A0y("Detected cross-thread LayoutDependencyTracker set mutation. trackerOwnerStyleId=", i);
            sbA0y.append(" nodeStyleId=");
            sbA0y.append(i2);
            sbA0y.append(" ownerThread=");
            sbA0y.append(str);
            sbA0y.append("-");
            sbA0y.append(j);
            sbA0y.append(" currentThread=");
            sbA0y.append(name);
            FFI.A01(null, BV7.A0z("-", sbA0y, id2), null);
            return;
        }
        FDW[] fdwArr = this.A0A;
        LinkedHashSet<FDW> linkedHashSet = this.A02;
        if (fdwArr == null) {
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>(3);
                this.A02 = linkedHashSet;
            }
        } else if (linkedHashSet == null) {
            int i3 = this.A00 + 1;
            this.A00 = i3;
            if (i3 < fdwArr.length && fdwArr[i3] == fdw) {
                return;
            }
            linkedHashSet = new LinkedHashSet<>(Math.max(3, i3 + 1));
            int i4 = this.A00;
            for (int i5 = 0; i5 < i4; i5++) {
                linkedHashSet.add(fdwArr[i5]);
            }
            this.A02 = linkedHashSet;
        }
        linkedHashSet.add(fdw);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FDX(X.C7764FDr r4, X.FDW r5, long[] r6, X.FDW[] r7, boolean r8) {
        /*
            r3 = this;
            r3.<init>()
            r3.A06 = r4
            r3.A0A = r7
            int r1 = r5.A00
            r0 = r1 & 1
            if (r0 != 0) goto L3c
            r0 = r1 & 2
            if (r0 != 0) goto L3c
            r0 = 0
        L12:
            r3.A07 = r0
            int r0 = r5.A05
            r3.A04 = r0
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            long r0 = r2.getId()
            r3.A05 = r0
            java.lang.String r0 = r2.getName()
            r3.A08 = r0
            r0 = -1
            r3.A00 = r0
            int r1 = r5.A00
            r0 = r1 & 1
            if (r0 != 0) goto L35
            r0 = r1 & 2
            if (r0 == 0) goto L38
        L35:
            r0 = 1
            if (r8 != 0) goto L39
        L38:
            r0 = 0
        L39:
            r3.A09 = r0
            return
        L3c:
            X.AIr r0 = new X.AIr
            r0.<init>(r6)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FDX.<init>(X.FDr, X.FDW, long[], X.FDW[], boolean):void");
    }
}
