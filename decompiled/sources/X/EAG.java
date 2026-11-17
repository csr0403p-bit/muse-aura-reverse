package X;

import android.media.AudioTrack;
import androidx.media3.common.util.Util;
import com.facebook.aura.partners.voice.viewmodel.RtcPreviewPlayoutKt;
import java.math.RoundingMode;

/* loaded from: classes5.dex */
public final class EAG {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public final int A06;
    public final C6514EAq A07;
    public final EB9 A08;

    public static long A00(EAG eag, float f, long j) {
        C6514EAq c6514EAq = eag.A07;
        return BV7.A0X(RoundingMode.DOWN, c6514EAq.A01, eag.A06) + Util.A0C(j - BV4.A04(c6514EAq.A05.nanoTime), f);
    }

    public static void A01(EAG eag, int i) {
        eag.A00 = i;
        long j = 10000;
        if (i == 0) {
            eag.A04 = 0L;
            eag.A01 = -1L;
            eag.A02 = -9223372036854775807L;
            eag.A03 = BV8.A0G();
        } else if (i != 1) {
            j = (i == 2 || i == 3) ? RtcPreviewPlayoutKt.FRAME_INTERVAL_NANOS : 500000L;
        }
        eag.A05 = j;
    }

    public EAG(AudioTrack audioTrack, EB9 eb9) {
        this.A07 = new C6514EAq(audioTrack);
        this.A06 = audioTrack.getSampleRate();
        this.A08 = eb9;
        A01(this, 0);
    }
}
