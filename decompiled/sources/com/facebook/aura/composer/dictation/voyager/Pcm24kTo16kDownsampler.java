package com.facebook.aura.composer.dictation.voyager;

import X.Ab3;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class Pcm24kTo16kDownsampler {
    public static final float[] BETWEEN_SAMPLES_KERNEL;

    @Deprecated
    public static final double CUTOFF_HZ = 7400.0d;
    public static final Companion Companion;

    @Deprecated
    public static final int HALF_SAMPLES_PER_OUTPUT = 3;

    @Deprecated
    public static final int INITIAL_CAPACITY = 4096;

    @Deprecated
    public static final double INPUT_RATE_HZ = 24000.0d;
    public static final float[] ON_SAMPLE_KERNEL;

    @Deprecated
    public static final int TAPS_PER_SIDE = 64;
    public float[] input = new float[4096];
    public int inputLength = 64;
    public int nextCenterHalfSamples = 128;

    public final class Companion {
        public final float[] getBETWEEN_SAMPLES_KERNEL() {
            return Pcm24kTo16kDownsampler.BETWEEN_SAMPLES_KERNEL;
        }

        public final float[] getON_SAMPLE_KERNEL() {
            return Pcm24kTo16kDownsampler.ON_SAMPLE_KERNEL;
        }

        public final float[] kernel(double d, int i) {
            double[] dArr = new double[i];
            for (int i2 = 0; i2 < i; i2++) {
                double d2 = (i2 - 64) + d;
                double dSin = d2 == 0.0d ? 2.0d * 0.30833333333333335d : Math.sin(1.9373154697137058d * d2) / (d2 * 3.141592653589793d);
                double d3 = (d2 * 3.141592653589793d) / 65.0d;
                dArr[i2] = dSin * ((Math.cos(d3) * 0.5d) + 0.42d + (Math.cos(2.0d * d3) * 0.08d));
            }
            double d4 = 0.0d;
            for (int i3 = 0; i3 < i; i3++) {
                d4 += dArr[i3];
            }
            float[] fArr = new float[i];
            for (int i4 = 0; i4 < i; i4++) {
                fArr[i4] = (float) (dArr[i4] / d4);
            }
            return fArr;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void append(byte[] bArr) {
        int length = bArr.length / 2;
        int i = this.inputLength + length;
        float[] fArrCopyOf = this.input;
        int length2 = fArrCopyOf.length;
        if (i > length2) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, Math.max(length2 * 2, i));
            C7384Etj.A0U(fArrCopyOf);
            this.input = fArrCopyOf;
        }
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            int i4 = bArr[i3] & 255;
            byte b = bArr[i3 + 1];
            int i5 = this.inputLength;
            this.inputLength = i5 + 1;
            fArrCopyOf[i5] = (b << 8) | i4;
        }
    }

    private final float convolve(int i, float[] fArr) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            f += this.input[i + i2] * fArr[i2];
        }
        return f;
    }

    public final byte[] process(byte[] bArr) {
        int i;
        float[] fArr;
        C7384Etj.A0Y(bArr, 0);
        append(bArr);
        byte[] bArr2 = new byte[bArr.length];
        int i2 = 0;
        while (true) {
            int i3 = this.nextCenterHalfSamples;
            int i4 = i3 / 2;
            if (i4 + 64 >= this.inputLength) {
                dropConsumedInput();
                byte[] bArrCopyOf = Arrays.copyOf(bArr2, i2);
                C7384Etj.A0U(bArrCopyOf);
                return bArrCopyOf;
            }
            if (i3 % 2 == 0) {
                i = i4 - 64;
                fArr = ON_SAMPLE_KERNEL;
            } else {
                i = i4 - 63;
                fArr = BETWEEN_SAMPLES_KERNEL;
            }
            int iA01 = Ab3.A01(convolve(i, fArr));
            if (iA01 < -32768) {
                iA01 = -32768;
            } else if (iA01 > 32767) {
                iA01 = 32767;
            }
            int i5 = i2 + 1;
            bArr2[i2] = (byte) iA01;
            i2 += 2;
            bArr2[i5] = (byte) (iA01 >> 8);
            this.nextCenterHalfSamples = i3 + 3;
        }
    }

    static {
        Companion companion = new Companion();
        Companion = companion;
        ON_SAMPLE_KERNEL = companion.kernel(0.0d, AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS);
        BETWEEN_SAMPLES_KERNEL = companion.kernel(0.5d, 128);
    }

    private final void dropConsumedInput() {
        int i = (this.nextCenterHalfSamples / 2) - 64;
        if (i > 0) {
            float[] fArr = this.input;
            int i2 = this.inputLength;
            C7384Etj.A0Y(fArr, 0);
            System.arraycopy(fArr, i, fArr, 0, i2 - i);
            this.inputLength -= i;
            this.nextCenterHalfSamples -= i * 2;
        }
    }

    public final byte[] flush() {
        return process(new byte[128]);
    }
}
