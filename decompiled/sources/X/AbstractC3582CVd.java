package X;

import X.AbstractC3582CVd;
import java.io.Serializable;

/* renamed from: X.CVd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3582CVd<T extends AbstractC3582CVd<T>> implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX WARN: Incorrect return type in method signature: (TT;)TT; */
    public void A01(AbstractC3582CVd abstractC3582CVd) {
        if (this instanceof DMF) {
            DMF dmf = (DMF) this;
            DMF dmf2 = (DMF) abstractC3582CVd;
            C7384Etj.A0Y(dmf2, 0);
            dmf.uptimeMs = dmf2.uptimeMs;
            dmf.realtimeMs = dmf2.realtimeMs;
            return;
        }
        if (this instanceof DMA) {
            DMA dma = (DMA) this;
            DMA dma2 = (DMA) abstractC3582CVd;
            dma.mobileBytesRx = dma2.mobileBytesRx;
            dma.mobileBytesTx = dma2.mobileBytesTx;
            dma.wifiBytesRx = dma2.wifiBytesRx;
            dma.wifiBytesTx = dma2.wifiBytesTx;
            return;
        }
        if (!(this instanceof DM6)) {
            if (this instanceof DMK) {
                ((DMK) this).A03((DMK) abstractC3582CVd);
                return;
            } else {
                C3581CVc.A00((C3581CVc) this, (C3581CVc) abstractC3582CVd);
                return;
            }
        }
        DM6 dm6 = (DM6) this;
        DM6 dm62 = (DM6) abstractC3582CVd;
        C7384Etj.A0Y(dm62, 0);
        dm6.batteryLevelPct = dm62.batteryLevelPct;
        dm6.batteryRealtimeMs = dm62.batteryRealtimeMs;
        dm6.chargingRealtimeMs = dm62.chargingRealtimeMs;
    }

    /* JADX WARN: Incorrect return type in method signature: (TT;TT;)TT; */
    public void A02(AbstractC3582CVd abstractC3582CVd, AbstractC3582CVd abstractC3582CVd2) {
        boolean z;
        long j;
        long j2;
        if (this instanceof DMF) {
            DMF dmf = (DMF) this;
            DMF dmf2 = (DMF) abstractC3582CVd;
            DMF dmf3 = (DMF) abstractC3582CVd2;
            if (dmf3 == null) {
                dmf3 = new DMF();
            }
            if (dmf2 == null) {
                dmf3.uptimeMs = dmf.uptimeMs;
                j2 = dmf.realtimeMs;
            } else {
                dmf3.uptimeMs = dmf.uptimeMs - dmf2.uptimeMs;
                j2 = dmf.realtimeMs - dmf2.realtimeMs;
            }
            dmf3.realtimeMs = j2;
            return;
        }
        if (this instanceof DMA) {
            DMA dma = (DMA) this;
            DMA dma2 = (DMA) abstractC3582CVd;
            DMA dma3 = (DMA) abstractC3582CVd2;
            if (dma3 == null) {
                dma3 = new DMA();
            }
            if (dma2 == null) {
                dma3.mobileBytesRx = dma.mobileBytesRx;
                dma3.mobileBytesTx = dma.mobileBytesTx;
                dma3.wifiBytesRx = dma.wifiBytesRx;
                dma3.wifiBytesTx = dma.wifiBytesTx;
                return;
            }
            dma3.mobileBytesTx = dma.mobileBytesTx - dma2.mobileBytesTx;
            dma3.mobileBytesRx = dma.mobileBytesRx - dma2.mobileBytesRx;
            dma3.wifiBytesTx = dma.wifiBytesTx - dma2.wifiBytesTx;
            dma3.wifiBytesRx = dma.wifiBytesRx - dma2.wifiBytesRx;
            return;
        }
        if (this instanceof DM6) {
            DM6 dm6 = (DM6) this;
            DM6 dm62 = (DM6) abstractC3582CVd;
            DM6 dm63 = (DM6) abstractC3582CVd2;
            if (dm63 == null) {
                dm63 = new DM6();
            }
            if (dm62 == null) {
                dm63.batteryLevelPct = dm6.batteryLevelPct;
                dm63.batteryRealtimeMs = dm6.batteryRealtimeMs;
                j = dm6.chargingRealtimeMs;
            } else {
                dm63.batteryLevelPct = dm6.batteryLevelPct - dm62.batteryLevelPct;
                dm63.batteryRealtimeMs = dm6.batteryRealtimeMs - dm62.batteryRealtimeMs;
                j = dm6.chargingRealtimeMs - dm62.chargingRealtimeMs;
            }
            dm63.chargingRealtimeMs = j;
            return;
        }
        if (this instanceof DMK) {
            DMK dmk = (DMK) this;
            DMK dmk2 = (DMK) abstractC3582CVd;
            DMK dmk3 = (DMK) abstractC3582CVd2;
            if (dmk3 == null) {
                dmk3 = new DMK();
            }
            if (dmk2 == null) {
                dmk3.A03(dmk);
                return;
            }
            dmk3.systemTimeS = dmk.systemTimeS - dmk2.systemTimeS;
            dmk3.userTimeS = dmk.userTimeS - dmk2.userTimeS;
            dmk3.childSystemTimeS = dmk.childSystemTimeS - dmk2.childSystemTimeS;
            dmk3.childUserTimeS = dmk.childUserTimeS - dmk2.childUserTimeS;
            return;
        }
        C3581CVc c3581CVc = (C3581CVc) this;
        C3581CVc c3581CVc2 = (C3581CVc) abstractC3582CVd;
        C3581CVc c3581CVc3 = (C3581CVc) abstractC3582CVd2;
        if (c3581CVc3 == null) {
            throw C60O.A0i("CompositeMetrics doesn't support nullable results");
        }
        if (c3581CVc2 == null) {
            C3581CVc.A00(c3581CVc3, c3581CVc);
            return;
        }
        int size = c3581CVc.mMetricsMap.size();
        for (int i = 0; i < size; i++) {
            Class<T> cls = (Class) c3581CVc.mMetricsMap.A05(i);
            if (c3581CVc.A04(cls) && c3581CVc2.A04(cls)) {
                z = true;
                AbstractC3582CVd abstractC3582CVdA03 = c3581CVc3.A03(cls);
                if (abstractC3582CVdA03 != null) {
                    c3581CVc.A03(cls).A02(c3581CVc2.A03(cls), abstractC3582CVdA03);
                }
            } else {
                z = false;
            }
            c3581CVc3.mMetricsValid.put(cls, z ? Boolean.TRUE : Boolean.FALSE);
        }
    }
}
