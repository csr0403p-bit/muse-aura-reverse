package com.facebook.aura.partners.voice.viewmodel;

import X.C7384Etj;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class Pcm48kResampler {
    public static final int $stable = 8;
    public final int inputRateHz;
    public double position;
    public Short previous;
    public final double step;

    public final short[] push(short[] sArr) {
        int length;
        short sShortValue;
        C7384Etj.A0Y(sArr, 0);
        if (this.inputRateHz == 48000 || (length = sArr.length) == 0) {
            return sArr;
        }
        Short sh = this.previous;
        int i = 0;
        int i2 = sh == null ? 0 : 1;
        double d = length + i2;
        double d2 = this.position;
        short[] sArrCopyOf = new short[((int) ((d - d2) / this.step)) + 1];
        while (1.0d + d2 < d) {
            if (i == sArrCopyOf.length) {
                sArrCopyOf = Arrays.copyOf(sArrCopyOf, i + 1);
                C7384Etj.A0U(sArrCopyOf);
            }
            double d3 = this.position;
            int i3 = (int) d3;
            double d4 = d3 - i3;
            if (i3 < i2) {
                C7384Etj.A0X(sh);
                sShortValue = sh.shortValue();
            } else {
                sShortValue = sArr[i3 - i2];
            }
            sArrCopyOf[i] = (short) (sShortValue + ((sArr[(i3 + 1) - i2] - sShortValue) * d4));
            d2 = this.position + this.step;
            this.position = d2;
            i++;
        }
        this.position = d2 - (r11 - 1);
        this.previous = Short.valueOf(sArr[length - 1]);
        short[] sArrCopyOf2 = Arrays.copyOf(sArrCopyOf, i);
        C7384Etj.A0U(sArrCopyOf2);
        return sArrCopyOf2;
    }

    public Pcm48kResampler(int i) {
        this.inputRateHz = i;
        this.step = i / 48000.0d;
    }
}
