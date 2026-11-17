package com.facebook.aura.partners.voice.viewmodel;

import X.AIW;
import X.C0924AIa;
import X.C3cG;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes4.dex */
public final class PcmLoudness {
    public static final int $stable = 8;
    public volatile boolean complete;
    public int peak;
    public long sampleCount;
    public double squareSum;
    public final Object lock = C3cG.A0T();
    public int carryByte = -1;

    public final void addPcm16(byte[] bArr) {
        int length;
        C7384Etj.A0Y(bArr, 0);
        synchronized (this.lock) {
            int i = this.carryByte;
            int i2 = 0;
            if (i >= 0 && bArr.length != 0) {
                addSample(i | (bArr[0] << 8));
                this.carryByte = -1;
                i2 = 1;
            }
            while (true) {
                int i3 = i2 + 1;
                length = bArr.length;
                if (i3 >= length) {
                    break;
                }
                addSample((bArr[i3] << 8) | (bArr[i2] & 255));
                i2 += 2;
            }
            if (i2 < length) {
                this.carryByte = bArr[i2] & 255;
            }
        }
    }

    public final void markComplete() {
        this.complete = true;
    }

    private final void addSample(int i) {
        this.sampleCount++;
        double d = i;
        this.squareSum += d * d;
        this.peak = Math.max(this.peak, Math.abs(i));
    }

    public final Map<String, String> toFields() {
        C0924AIa c0924AIaA0K;
        synchronized (this.lock) {
            C0924AIa c0924AIaA0u = C3cG.A0u();
            c0924AIaA0u.put("source_sample_count", String.valueOf(this.sampleCount));
            c0924AIaA0u.put("source_complete", String.valueOf(this.complete));
            long j = this.sampleCount;
            if (j > 0) {
                c0924AIaA0u.put("source_rms_dbfs", String.valueOf(10.0d * Math.log10(Math.max((this.squareSum / j) / 1.073741824E9d, 1.0E-12d))));
                c0924AIaA0u.put("source_peak_dbfs", String.valueOf(20.0d * Math.log10(Math.max(this.peak / 32768.0d, 1.0E-6d))));
            }
            c0924AIaA0K = AIW.A0K(c0924AIaA0u);
        }
        return c0924AIaA0K;
    }
}
