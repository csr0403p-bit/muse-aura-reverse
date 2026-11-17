package X;

/* loaded from: classes5.dex */
public abstract class E2L {
    public static void A00(C6162Dx5 c6162Dx5, C5402Dhv c5402Dhv, C5402Dhv c5402Dhv2, C5402Dhv[] c5402DhvArr, int i) {
        if (c5402Dhv2 == null) {
            c5402Dhv2 = new C5402Dhv(new InterfaceC5403Dhw[0]);
        }
        if (c5402Dhv != null) {
            int i2 = 0;
            while (true) {
                InterfaceC5403Dhw[] interfaceC5403DhwArr = c5402Dhv.A01;
                if (i2 >= interfaceC5403DhwArr.length) {
                    break;
                }
                InterfaceC5403Dhw interfaceC5403Dhw = interfaceC5403DhwArr[i2];
                if (interfaceC5403Dhw instanceof C3423CMl) {
                    C3423CMl c3423CMl = (C3423CMl) interfaceC5403Dhw;
                    if (!c3423CMl.A02.equals("com.android.capture.fps") || i == 2) {
                        c5402Dhv2 = c5402Dhv2.A01(c3423CMl);
                    }
                }
                i2++;
            }
        }
        for (C5402Dhv c5402Dhv3 : c5402DhvArr) {
            if (c5402Dhv3 != null) {
                c5402Dhv2 = c5402Dhv2.A01(c5402Dhv3.A01);
            }
        }
        if (c5402Dhv2.A01.length > 0) {
            c6162Dx5.A0S = c5402Dhv2;
        }
    }

    public static void A01(C6162Dx5 c6162Dx5, C6361E2n c6361E2n, int i) {
        int i2;
        int i3;
        if (i != 1 || (i2 = c6361E2n.A00) == -1 || (i3 = c6361E2n.A01) == -1) {
            return;
        }
        c6162Dx5.A09 = i2;
        c6162Dx5.A0A = i3;
    }
}
