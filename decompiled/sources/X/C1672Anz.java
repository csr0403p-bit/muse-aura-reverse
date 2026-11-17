package X;

/* renamed from: X.Anz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1672Anz {
    public static final Object[] A02;
    public static final C1672Anz A00 = new C1672Anz();
    public static final float[] A01 = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile Ao1<InterfaceC1502Ak9> A03 = new Ao1<>(10);

    static {
        Object[] objArr = new Object[0];
        A02 = objArr;
        synchronized (objArr) {
            A03.A03((int) (1.15f * 100.0f), new Ao5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            A03.A03((int) (1.3f * 100.0f), new Ao5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            A03.A03((int) (1.5f * 100.0f), new Ao5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            A03.A03((int) (1.8f * 100.0f), new Ao5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            A03.A03((int) (2.0f * 100.0f), new Ao5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((A03.A00(0) / 100.0f) - 0.01f <= 1.03f) {
            throw C3cG.A0Q("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public static final void A00(InterfaceC1502Ak9 interfaceC1502Ak9, float f) {
        synchronized (A02) {
            Ao1<InterfaceC1502Ak9> ao1A01 = A03.clone();
            ao1A01.A03((int) (f * 100.0f), interfaceC1502Ak9);
            A03 = ao1A01;
        }
    }

    public final InterfaceC1502Ak9 A01(float f) {
        float fA00;
        InterfaceC1502Ak9 interfaceC1502Ak9A02;
        Ao5 ao5;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        InterfaceC1502Ak9 interfaceC1502Ak9 = (InterfaceC1502Ak9) AbstractC1674AoB.A00(A03, i);
        if (interfaceC1502Ak9 != null) {
            return interfaceC1502Ak9;
        }
        Ao1<InterfaceC1502Ak9> ao1 = A03;
        int iA00 = AbstractC1684AoN.A00(ao1.A01, ao1.A00, i);
        if (iA00 >= 0) {
            return A03.A02(iA00);
        }
        int i2 = -(iA00 + 1);
        int i3 = i2 - 1;
        if (i2 >= A03.A00) {
            ao5 = new Ao5(new float[]{1.0f}, new float[]{f});
        } else {
            if (i3 < 0) {
                float[] fArr = A01;
                interfaceC1502Ak9A02 = new Ao5(fArr, fArr);
                fA00 = 1.0f;
            } else {
                fA00 = A03.A00(i3) / 100.0f;
                interfaceC1502Ak9A02 = A03.A02(i3);
            }
            float fA002 = A03.A00(i2) / 100.0f;
            float fA02 = C8j3.A02(1.0f, 0.0f, Math.max(0.0f, Math.min(1.0f, fA00 == fA002 ? 0.0f : (f - fA00) / (fA002 - fA00))));
            InterfaceC1502Ak9 interfaceC1502Ak9A022 = A03.A02(i2);
            float[] fArr2 = A01;
            float[] fArr3 = new float[9];
            int i4 = 0;
            do {
                float f2 = fArr2[i4];
                float fA7H = interfaceC1502Ak9A02.A7H(f2);
                fArr3[i4] = fA7H + ((interfaceC1502Ak9A022.A7H(f2) - fA7H) * fA02);
                i4++;
            } while (i4 < 9);
            ao5 = new Ao5(fArr2, fArr3);
        }
        A00(ao5, f);
        return ao5;
    }
}
