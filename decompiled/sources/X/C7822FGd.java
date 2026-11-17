package X;

/* renamed from: X.FGd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7822FGd implements InterfaceC7823FGe {
    public final InterfaceC7823FGe A00;
    public final boolean A01;
    public final float[] A02;

    public C7822FGd(InterfaceC7823FGe interfaceC7823FGe, float[] fArr, boolean z) {
        C7384Etj.A0Y(interfaceC7823FGe, 0);
        this.A00 = interfaceC7823FGe;
        this.A02 = fArr;
        this.A01 = z;
    }

    @Override // X.InterfaceC7823FGe
    public final InterfaceC7823FGe ADY(int i) {
        return this.A00.ADY(i);
    }

    @Override // X.InterfaceC7823FGe
    public final int ADd() {
        return this.A00.ADd();
    }

    @Override // X.InterfaceC7823FGe
    public final Object AGy() {
        return this.A00.AGy();
    }

    @Override // X.InterfaceC7823FGe
    public final int AIO() {
        return this.A00.AIO();
    }

    @Override // X.InterfaceC7823FGe
    public final int AIP() {
        return this.A00.AIP();
    }

    @Override // X.InterfaceC7823FGe
    public final int AIQ() {
        return this.A00.AIQ();
    }

    @Override // X.InterfaceC7823FGe
    public final int AIR() {
        return this.A00.AIR();
    }

    @Override // X.InterfaceC7823FGe
    public final FGT<?> AJY() {
        return this.A00.AJY();
    }

    @Override // X.InterfaceC7823FGe
    public final int AMu(int i) {
        return this.A00.AMu(i);
    }

    @Override // X.InterfaceC7823FGe
    public final int AMv(int i) {
        return this.A00.AMv(i);
    }

    @Override // X.InterfaceC7823FGe
    public final int getHeight() {
        int height = this.A00.getHeight();
        float[] fArr = this.A02;
        float f = fArr[0];
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        int iA01 = height + Ab3.A01(f);
        float f2 = fArr[3];
        if (Float.isNaN(f2)) {
            f2 = 0.0f;
        }
        return iA01 + Ab3.A01(f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    @Override // X.InterfaceC7823FGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getWidth() {
        /*
            r5 = this;
            X.FGe r0 = r5.A00
            int r4 = r0.getWidth()
            float[] r3 = r5.A02
            boolean r2 = r5.A01
            if (r2 != 0) goto L36
            r0 = 5
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L36
        L15:
            int r0 = X.Ab3.A01(r1)
            int r4 = r4 + r0
            if (r2 == 0) goto L2b
            r0 = 5
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L2b
        L25:
            int r0 = X.Ab3.A01(r1)
            int r4 = r4 + r0
            return r4
        L2b:
            r0 = 2
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L25
            r1 = 0
            goto L25
        L36:
            r0 = 1
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L15
            r1 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7822FGd.getWidth():int");
    }
}
