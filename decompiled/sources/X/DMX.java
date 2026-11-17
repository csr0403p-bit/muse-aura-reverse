package X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.util.Pair;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class DMX {
    public static final ImmutableMap<Integer, Integer> A02;
    public static final DMX A03 = new DMX(new int[]{2}, 8);
    public static final DMX A04 = new DMX(new int[]{2, 5, 6}, 8);
    public final int A00;
    public final int[] A01;

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        BV6.A15(builder, 6, 5);
        BV6.A15(builder, 6, 17);
        BV6.A15(builder, 6, 7);
        BV6.A15(builder, 6, 18);
        builder.put(6, 8);
        builder.put(8, 8);
        BV6.A15(builder, 8, 14);
        A02 = builder.buildOrThrow();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DMX) {
                DMX dmx = (DMX) obj;
                if (!Arrays.equals(this.A01, dmx.A01) || this.A00 != dmx.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final Pair<Integer, Integer> A00(C6154Dwx c6154Dwx) {
        String str = c6154Dwx.A0b;
        str.getClass();
        int iA02 = AbstractC6161Dx4.A02(str, c6154Dwx.A0W);
        if (A02.containsKey(Integer.valueOf(iA02))) {
            if (iA02 == 18) {
                if (Arrays.binarySearch(this.A01, 18) < 0) {
                    iA02 = 6;
                }
            } else if (iA02 == 8 && Arrays.binarySearch(this.A01, 8) < 0) {
                iA02 = 7;
            }
            if (Arrays.binarySearch(this.A01, iA02) >= 0) {
                int i = c6154Dwx.A06;
                if (i != -1 && iA02 != 18) {
                    if (i <= this.A00) {
                        break;
                    }
                } else {
                    int i2 = c6154Dwx.A0L;
                    int i3 = i2 != -1 ? i2 : 48000;
                    AudioAttributes audioAttributes = AbstractC3550CTm.A00;
                    i = 8;
                    while (true) {
                        if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(iA02).setSampleRate(i3).setChannelMask(Util.A00(i)).build(), AbstractC3550CTm.A00)) {
                            break;
                        }
                        i--;
                        if (i <= 0) {
                            i = 0;
                            break;
                        }
                    }
                }
                int iA00 = Util.A00(i);
                if (iA00 != 0) {
                    return Pair.create(Integer.valueOf(iA02), Integer.valueOf(iA00));
                }
            }
        }
        return null;
    }

    public final int hashCode() {
        return this.A00 + (Arrays.hashCode(this.A01) * 31);
    }

    public final String toString() {
        return FGI.A09(this.A00, "AudioCapabilities[maxChannelCount=", ", supportedEncodings=", Arrays.toString(this.A01), "]");
    }

    public DMX(int[] iArr, int i) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.A01 = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.A01 = new int[0];
        }
        this.A00 = i;
    }
}
