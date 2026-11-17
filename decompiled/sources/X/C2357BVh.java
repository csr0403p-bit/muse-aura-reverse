package X;

import java.util.Comparator;

/* renamed from: X.BVh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2357BVh implements Comparator<C6153Dwv> {
    public final /* synthetic */ BVk A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C2357BVh(BVk bVk, String str, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
        this.A04 = z3;
        this.A00 = bVk;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(C6153Dwv c6153Dwv, C6153Dwv c6153Dwv2) {
        return A00(c6153Dwv) - A00(c6153Dwv2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A00(X.C6153Dwv r7) {
        /*
            r6 = this;
            java.lang.String r1 = "video/av01"
            java.lang.String r0 = r6.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L36
            boolean r5 = r6.A03
            boolean r2 = r6.A02
            java.lang.String r1 = r7.A06
            r4 = 0
            java.lang.String r0 = "c2.android.av1-dav1d.decoder"
            boolean r0 = r1.equals(r0)
            boolean r3 = X.AnonymousClass002.A1L(r0)
            if (r2 == 0) goto L27
            java.lang.String r0 = "meta.dav1d.av1.decoder"
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L28
        L27:
            r2 = 0
        L28:
            boolean r0 = r7.A0C
            r1 = 3
            if (r0 == 0) goto L2e
            r1 = 0
        L2e:
            if (r5 == r3) goto L31
            r4 = 2
        L31:
            int r1 = r1 + r4
            r0 = r2 ^ 1
            int r1 = r1 + r0
        L35:
            return r1
        L36:
            boolean r0 = r6.A04
            r1 = 0
            if (r0 == 0) goto L35
            boolean r0 = r7.A0C
            if (r0 != 0) goto L35
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2357BVh.A00(X.Dwv):int");
    }
}
