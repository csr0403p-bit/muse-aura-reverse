package X;

/* loaded from: classes6.dex */
public final class HBL implements InterfaceC10348HBm {
    public int A00 = 0;
    public int A03 = 0;
    public byte[] A01 = new byte[8];
    public float[] A02 = new float[16];

    public final void A02(InterfaceC10348HBm interfaceC10348HBm) {
        int i = 0;
        for (int i2 = 0; i2 < this.A00; i2++) {
            byte b = this.A01[i2];
            if (b == 0) {
                float[] fArr = this.A02;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                interfaceC10348HBm.AQx(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = this.A02;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i += 2;
                interfaceC10348HBm.APc(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = this.A02;
                float f3 = fArr3[i];
                float f4 = fArr3[i + 1];
                float f5 = fArr3[i + 2];
                float f6 = fArr3[i + 3];
                int i5 = i + 5;
                float f7 = fArr3[i + 4];
                i += 6;
                interfaceC10348HBm.A87(f3, f4, f5, f6, f7, fArr3[i5]);
            } else if (b == 3) {
                float[] fArr4 = this.A02;
                float f8 = fArr4[i];
                float f9 = fArr4[i + 1];
                int i6 = i + 3;
                float f10 = fArr4[i + 2];
                i += 4;
                interfaceC10348HBm.AYt(f8, f9, f10, fArr4[i6]);
            } else if (b != 8) {
                boolean zA1L = AnonymousClass002.A1L(b & 2);
                boolean zA1L2 = AnonymousClass002.A1L(b & 1);
                float[] fArr5 = this.A02;
                float f11 = fArr5[i];
                float f12 = fArr5[i + 1];
                float f13 = fArr5[i + 2];
                int i7 = i + 4;
                float f14 = fArr5[i + 3];
                i += 5;
                interfaceC10348HBm.A4j(f11, f12, f13, f14, fArr5[i7], zA1L, zA1L2);
            } else {
                interfaceC10348HBm.close();
            }
        }
    }

    @Override // X.InterfaceC10348HBm
    public final void A4j(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        A00((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
        A01(5);
        float[] fArr = this.A02;
        int i = this.A03;
        int i2 = i + 1;
        this.A03 = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.A03 = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.A03 = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.A03 = i5;
        fArr[i4] = f4;
        this.A03 = i + 5;
        fArr[i5] = f5;
    }

    @Override // X.InterfaceC10348HBm
    public final void A87(float f, float f2, float f3, float f4, float f5, float f6) {
        A00((byte) 2);
        A01(6);
        float[] fArr = this.A02;
        int i = this.A03;
        int i2 = i + 1;
        this.A03 = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.A03 = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.A03 = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.A03 = i5;
        fArr[i4] = f4;
        int i6 = i + 5;
        this.A03 = i6;
        fArr[i5] = f5;
        this.A03 = i + 6;
        fArr[i6] = f6;
    }

    @Override // X.InterfaceC10348HBm
    public final void APc(float f, float f2) {
        A00((byte) 1);
        A01(2);
        float[] fArr = this.A02;
        int i = this.A03;
        int i2 = i + 1;
        this.A03 = i2;
        fArr[i] = f;
        this.A03 = i + 2;
        fArr[i2] = f2;
    }

    @Override // X.InterfaceC10348HBm
    public final void AQx(float f, float f2) {
        A00((byte) 0);
        A01(2);
        float[] fArr = this.A02;
        int i = this.A03;
        int i2 = i + 1;
        this.A03 = i2;
        fArr[i] = f;
        this.A03 = i + 2;
        fArr[i2] = f2;
    }

    @Override // X.InterfaceC10348HBm
    public final void AYt(float f, float f2, float f3, float f4) {
        A00((byte) 3);
        A01(4);
        float[] fArr = this.A02;
        int i = this.A03;
        int i2 = i + 1;
        this.A03 = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.A03 = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.A03 = i4;
        fArr[i3] = f3;
        this.A03 = i + 4;
        fArr[i4] = f4;
    }

    private void A00(byte b) {
        int i = this.A00;
        byte[] bArr = this.A01;
        int length = bArr.length;
        if (i == length) {
            byte[] bArr2 = new byte[length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            this.A01 = bArr2;
            bArr = bArr2;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        bArr[i2] = b;
    }

    private void A01(int i) {
        float[] fArr = this.A02;
        int length = fArr.length;
        if (length < this.A03 + i) {
            float[] fArr2 = new float[length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, length);
            this.A02 = fArr2;
        }
    }

    @Override // X.InterfaceC10348HBm
    public final void close() {
        A00((byte) 8);
    }
}
