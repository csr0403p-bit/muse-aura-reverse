package X;

/* renamed from: X.FEo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7783FEo implements FG2 {
    public FEM A00;
    public FDt A01;

    @Override // X.FG2
    public final Object AZd(Object obj) {
        C7384Etj.A0Y(obj, 0);
        FDt fDt = this.A01;
        if (fDt == null) {
            return null;
        }
        AbstractC8162FXe.A02("ContinuationValueStore can only be read from the UI Thread");
        C7784FEp c7784FEpA05 = fDt.A01.A05(obj);
        if (c7784FEpA05 != null) {
            return c7784FEpA05.A01;
        }
        return null;
    }

    @Override // X.FG2
    public final long AZe(Object obj) {
        C7384Etj.A0Y(obj, 0);
        FDt fDt = this.A01;
        if (fDt == null) {
            return -1L;
        }
        AbstractC8162FXe.A02("ContinuationValueStore can only be read from the UI Thread");
        C7784FEp c7784FEpA05 = fDt.A01.A05(obj);
        if (c7784FEpA05 != null) {
            return c7784FEpA05.A00;
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.FEM r22) {
        /*
            r21 = this;
            r0 = r21
            X.FDt r14 = r0.A01
            if (r14 == 0) goto L82
            java.lang.String r0 = "ContinuationValueStore can only be written from the UI Thread"
            X.AbstractC8162FXe.A02(r0)
            r13 = r22
            X.AHr<java.lang.Object, java.lang.Object> r1 = r13.A00
            int r0 = r1.A01
            if (r0 == 0) goto L7e
            java.lang.Object[] r12 = r1.A04
            java.lang.Object[] r11 = r1.A05
            long[] r10 = r1.A03
            int r0 = r10.length
            int r9 = r0 + (-2)
            if (r9 < 0) goto L7e
            r8 = 0
        L1f:
            r19 = r10[r8]
            long r3 = X.C8j5.A0A(r19)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L79
            int r0 = X.C8j3.A0E(r8, r9)
            int r7 = 8 - r0
            r15 = 0
        L36:
            if (r15 >= r7) goto L75
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r19
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L72
            int r0 = r8 << 3
            int r0 = r0 + r15
            r6 = r12[r0]
            r5 = r11[r0]
            X.AHu<java.lang.Object, X.FEp> r4 = r14.A01
            java.lang.Object r0 = r4.A05(r6)
            X.FEp r0 = (X.C7784FEp) r0
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r0.A01
            boolean r0 = X.C7384Etj.areEqual(r0, r5)
            if (r0 != 0) goto L72
        L5b:
            long r2 = r14.A00
            r17 = 1
            r16 = 8
            long r0 = r2 + r17
            r14.A00 = r0
            X.FEp r0 = new X.FEp
            r0.<init>(r5, r2)
            r4.A0E(r6, r0)
        L6d:
            long r19 = r19 >> r16
            int r15 = r15 + 1
            goto L36
        L72:
            r16 = 8
            goto L6d
        L75:
            r0 = 8
            if (r7 != r0) goto L7e
        L79:
            if (r8 == r9) goto L7e
            int r8 = r8 + 1
            goto L1f
        L7e:
            r0 = r21
            r0.A00 = r13
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7783FEo.A00(X.FEM):void");
    }
}
