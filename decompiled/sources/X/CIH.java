package X;

import X.AbstractC3582CVd;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class CIH<T extends AbstractC3582CVd<T>> {
    public final long A00() {
        if (this instanceof DMD) {
            return 4345974300167284411L;
        }
        if (this instanceof DM8) {
            return -2479634339626480691L;
        }
        if (this instanceof DM3) {
            return -2269842438411178483L;
        }
        return this instanceof DML ? 2353414016265691865L : -3137023965338009377L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A01(T t, DataOutput dataOutput) throws IOException {
        long j;
        if (this instanceof DMD) {
            DMF dmf = (DMF) t;
            C7384Etj.A0Y(dmf, 0);
            dataOutput.writeLong(dmf.realtimeMs);
            j = dmf.uptimeMs;
        } else if (this instanceof DM8) {
            DMA dma = (DMA) t;
            C7384Etj.A0Y(dma, 0);
            dataOutput.writeLong(dma.mobileBytesRx);
            dataOutput.writeLong(dma.mobileBytesTx);
            dataOutput.writeLong(dma.wifiBytesRx);
            j = dma.wifiBytesTx;
        } else {
            if (!(this instanceof DM3)) {
                if (this instanceof DML) {
                    DMK dmk = (DMK) t;
                    C7384Etj.A0Y(dmk, 0);
                    dataOutput.writeDouble(dmk.userTimeS);
                    dataOutput.writeDouble(dmk.systemTimeS);
                    dataOutput.writeDouble(dmk.childUserTimeS);
                    dataOutput.writeDouble(dmk.childSystemTimeS);
                    return;
                }
                C3581CVc c3581CVc = (C3581CVc) t;
                DQZ<Class<? extends AbstractC3582CVd>, CIH> dqz = ((C3580CVb) this).A02;
                int size = dqz.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    if (c3581CVc.A04(dqz.A05(i2))) {
                        i++;
                    }
                }
                dataOutput.writeInt(i);
                for (int i3 = 0; i3 < size; i3++) {
                    Class<? extends AbstractC3582CVd> clsA05 = dqz.A05(i3);
                    if (c3581CVc.A04(clsA05)) {
                        CIH cihA07 = dqz.A07(i3);
                        cihA07.getClass();
                        dataOutput.writeLong(cihA07.A00());
                        cihA07.A01(c3581CVc.A03(clsA05), dataOutput);
                    }
                }
                return;
            }
            DM6 dm6 = (DM6) t;
            C7384Etj.A0Y(dm6, 0);
            dataOutput.writeFloat(dm6.batteryLevelPct);
            dataOutput.writeLong(dm6.batteryRealtimeMs);
            j = dm6.chargingRealtimeMs;
        }
        dataOutput.writeLong(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A02(T t, DataInput dataInput) throws IOException {
        if (this instanceof DMD) {
            DMF dmf = (DMF) t;
            C7384Etj.A0Y(dmf, 0);
            dmf.realtimeMs = dataInput.readLong();
            dmf.uptimeMs = dataInput.readLong();
            return true;
        }
        if (this instanceof DM8) {
            DMA dma = (DMA) t;
            C7384Etj.A0Y(dma, 0);
            dma.mobileBytesRx = dataInput.readLong();
            dma.mobileBytesTx = dataInput.readLong();
            dma.wifiBytesRx = dataInput.readLong();
            dma.wifiBytesTx = dataInput.readLong();
            return true;
        }
        if (this instanceof DM3) {
            DM6 dm6 = (DM6) t;
            C7384Etj.A0Y(dm6, 0);
            dm6.batteryLevelPct = dataInput.readFloat();
            dm6.batteryRealtimeMs = dataInput.readLong();
            dm6.chargingRealtimeMs = dataInput.readLong();
            return true;
        }
        if (this instanceof DML) {
            DMK dmk = (DMK) t;
            C7384Etj.A0Y(dmk, 0);
            dmk.userTimeS = dataInput.readDouble();
            dmk.systemTimeS = dataInput.readDouble();
            dmk.childUserTimeS = dataInput.readDouble();
            dmk.childSystemTimeS = dataInput.readDouble();
            return true;
        }
        C3580CVb c3580CVb = (C3580CVb) this;
        C3581CVc c3581CVc = (C3581CVc) t;
        DQZ<Class<? extends AbstractC3582CVd>, AbstractC3582CVd> dqz = c3581CVc.mMetricsMap;
        int size = dqz.size();
        for (int i = 0; i < size; i++) {
            c3581CVc.mMetricsValid.put(dqz.A05(i), Boolean.FALSE);
        }
        int i2 = dataInput.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            long j = dataInput.readLong();
            DQZ<Long, CIH> dqz2 = c3580CVb.A01;
            Long lValueOf = Long.valueOf(j);
            CIH cih = dqz2.get(lValueOf);
            Class<T> cls = (Class) c3580CVb.A00.get(lValueOf);
            if (cih == 0 || cls == null || !cih.A02(c3581CVc.A03(cls), dataInput)) {
                return false;
            }
            c3581CVc.mMetricsValid.put(cls, Boolean.TRUE);
        }
        return true;
    }
}
