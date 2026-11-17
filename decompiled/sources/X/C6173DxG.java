package X;

import android.util.Pair;
import java.util.Locale;

/* renamed from: X.DxG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6173DxG {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public long A0I;
    public boolean A0J;

    public final void A00(long j) {
        int i = this.A0C;
        int i2 = i == 0 ? -1 : (int) (j / i);
        this.A01 = i2;
        if (this.A0J) {
            return;
        }
        this.A08 = i2;
    }

    public final void A01(Pair<Long, Integer> pair) {
        int i = this.A0F;
        long j = i * this.A00;
        int iA07 = i + BV7.A07(pair);
        this.A0F = iA07;
        int iA05 = iA07 == 0 ? -1 : (int) ((j + C3cG.A05(pair.first)) / iA07);
        this.A00 = iA05;
        if (this.A0J) {
            return;
        }
        this.A07 = iA05;
    }

    public final String toString() {
        return String.format(Locale.US, "DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n lateRenderedFrameCount=%s\n}", Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A0B), Integer.valueOf(this.A0D), Integer.valueOf(this.A0C), Integer.valueOf(this.A0E), Integer.valueOf(this.A04), Integer.valueOf(this.A05), Integer.valueOf(this.A0A), Integer.valueOf(this.A06), Long.valueOf(this.A0I), Integer.valueOf(this.A0G), Integer.valueOf(this.A09));
    }
}
