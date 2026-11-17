package X;

/* loaded from: classes5.dex */
public final class DMC implements InterfaceC3585CVk<DMA> {
    @Override // X.InterfaceC3585CVk
    public final /* bridge */ /* synthetic */ void Ab5(AbstractC3582CVd abstractC3582CVd, DMN dmn) {
        DMA dma = (DMA) abstractC3582CVd;
        C7384Etj.A0Y(dma, 0);
        long j = dma.mobileBytesTx;
        if (j != 0) {
            dmn.A3B("mobile_bytes_tx", j);
        }
        long j2 = dma.mobileBytesRx;
        if (j2 != 0) {
            dmn.A3B("mobile_bytes_rx", j2);
        }
        long j3 = dma.wifiBytesTx;
        if (j3 != 0) {
            dmn.A3B("wifi_bytes_tx", j3);
        }
        long j4 = dma.wifiBytesRx;
        if (j4 != 0) {
            dmn.A3B("wifi_bytes_rx", j4);
        }
    }
}
