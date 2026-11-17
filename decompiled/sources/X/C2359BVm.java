package X;

import java.util.HashSet;

/* renamed from: X.BVm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2359BVm implements InterfaceC2356BVg {
    public final /* synthetic */ HashSet A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public C2359BVm(HashSet hashSet, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = z;
        this.A05 = z2;
        this.A04 = z3;
        this.A02 = z4;
        this.A00 = hashSet;
        this.A03 = z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    @Override // X.InterfaceC2356BVg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C6153Dwv> AEg(java.lang.String r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            X.BVg r0 = X.InterfaceC2356BVg.A00
            java.util.List r0 = r0.AEg(r8, r9, r10)
            java.util.ArrayList r4 = X.BV4.A0t(r0)
            boolean r5 = r7.A01
            boolean r1 = r7.A05
            boolean r0 = r7.A04
            X.BVp.A02(r8, r4, r5, r1, r0)
            java.lang.String r0 = "video/av01"
            java.lang.String r3 = "MediaCodecSelectorHelper"
            boolean r6 = r0.equals(r8)
            if (r6 != 0) goto L2b
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            java.lang.String r0 = "Unexpected mime type %s"
            X.AbstractC3426CMt.A04(r3, r0, r1)
            boolean r0 = r7.A02
            if (r0 == 0) goto L55
        L2b:
            java.util.HashSet r2 = r7.A00
            if (r2 == 0) goto L55
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L55
            java.util.Iterator r1 = r4.iterator()
        L39:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r1.next()
            X.Dwv r0 = (X.C6153Dwv) r0
            java.lang.String r0 = r0.A06
            java.lang.String r0 = X.AnonymousClass001.A0u(r0)
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L39
            r1.remove()
            goto L39
        L55:
            if (r6 == 0) goto L6a
            boolean r1 = r7.A03
            X.BVn r0 = new X.BVn
            r0.<init>(r7, r8, r1, r5)
            java.util.Collections.sort(r4, r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r4}
            java.lang.String r0 = "%s dec order (hw first) %s"
            X.AbstractC3426CMt.A03(r3, r0, r1)
        L6a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2359BVm.AEg(java.lang.String, boolean, boolean):java.util.List");
    }
}
