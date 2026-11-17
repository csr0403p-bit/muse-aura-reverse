package X;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class DFT {
    public final CI5 A00;
    public final InterfaceC4935DFn A01;
    public final DGD A02;

    public static void A00(DFT dft) throws IOException {
        InterfaceC4935DFn interfaceC4935DFn = dft.A01;
        CI5 ci5 = dft.A00;
        interfaceC4935DFn.Adb(ci5.A00());
        interfaceC4935DFn.ARM();
        CI1 ci1 = ci5.A02;
        if (ci1 != null && ci1.A00 >= ci5.A03) {
            interfaceC4935DFn.ARL();
        }
        CI1 ci12 = ci5.A02;
        if (ci12 == null || ci12.A00 < 50) {
            return;
        }
        ci5.A01();
    }

    public DFT(DGD dgd, CI5 ci5, InterfaceC4935DFn interfaceC4935DFn) {
        this.A00 = ci5;
        this.A01 = interfaceC4935DFn;
        this.A02 = dgd;
    }
}
