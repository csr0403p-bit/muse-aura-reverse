package X;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class DFU {
    public final CI5 A00;
    public final InterfaceC4935DFn A01;
    public final DGD A02;
    public final DFV A03;

    public static void A00(DFU dfu) throws IOException {
        CI5 ci5;
        CI1 ci1;
        if (dfu.A03.shouldNotifyOnBatchReady() && (ci1 = (ci5 = dfu.A00).A02) != null && ci1.A00 >= ci5.A03) {
            dfu.A01.ARL();
        }
        CI5 ci52 = dfu.A00;
        CI1 ci12 = ci52.A02;
        if (ci12 == null || ci12.A00 < 50) {
            return;
        }
        ci52.A01();
    }

    public DFU(DGD dgd, CI5 ci5, DFV dfv, InterfaceC4935DFn interfaceC4935DFn) {
        this.A00 = ci5;
        this.A01 = interfaceC4935DFn;
        this.A03 = dfv;
        this.A02 = dgd;
    }
}
