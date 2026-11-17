package X;

/* loaded from: classes5.dex */
public final class DMA extends AbstractC3582CVd<DMA> {
    public static final long serialVersionUID = 1;
    public long mobileBytesRx;
    public long mobileBytesTx;
    public long wifiBytesRx;
    public long wifiBytesTx;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                DMA dma = (DMA) obj;
                if (this.mobileBytesTx != dma.mobileBytesTx || this.mobileBytesRx != dma.mobileBytesRx || this.wifiBytesTx != dma.wifiBytesTx || this.wifiBytesRx != dma.wifiBytesRx) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A0B(this.wifiBytesRx, AnonymousClass006.A06(this.wifiBytesTx, AnonymousClass006.A06(this.mobileBytesRx, AnonymousClass005.A07(this.mobileBytesTx))));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("NetworkMetrics{mobileBytesTx=");
        sbA0x.append(this.mobileBytesTx);
        sbA0x.append(", mobileBytesRx=");
        sbA0x.append(this.mobileBytesRx);
        sbA0x.append(", wifiBytesTx=");
        sbA0x.append(this.wifiBytesTx);
        sbA0x.append(", wifiBytesRx=");
        sbA0x.append(this.wifiBytesRx);
        return C8j3.A15(sbA0x);
    }
}
