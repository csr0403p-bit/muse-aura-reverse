package X;

import X.BV7;
import X.C1G;
import X.C3cG;
import X.FGI;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import java.io.IOException;

/* renamed from: X.Dti, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5999Dti extends Du4 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final boolean A03;

    public C5999Dti(Timeline timeline, final long j, final long j2, boolean z) throws IOException {
        super(timeline);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            final int i = 2;
            throw new IOException(i, j, j2) { // from class: androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException
                public final int reason;

                /* JADX WARN: Illegal instructions before constructor call */
                {
                    String strA0z;
                    if (i != 0) {
                        if (i != 1) {
                            C1G.A08((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
                            StringBuilder sbA0g = C3cG.A0g("start exceeds end. Start time: ");
                            sbA0g.append(j);
                            strA0z = BV7.A0z(", End time: ", sbA0g, j2);
                        } else {
                            strA0z = "not seekable to start";
                        }
                    } else {
                        strA0z = "invalid period count";
                    }
                    super(FGI.A0M("Illegal clipping: ", strA0z));
                    this.reason = i;
                }
            };
        }
        boolean z2 = false;
        z2 = false;
        z2 = false;
        final int i2 = 1;
        if (timeline.A01() != 1) {
            final long j3 = -9223372036854775807L;
            final int i3 = z2 ? 1 : 0;
            throw new IOException(i3, j3, j3) { // from class: androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException
                public final int reason;

                /* JADX WARN: Illegal instructions before constructor call */
                {
                    String strA0z;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            C1G.A08((j3 == -9223372036854775807L || j3 == -9223372036854775807L) ? false : true);
                            StringBuilder sbA0g = C3cG.A0g("start exceeds end. Start time: ");
                            sbA0g.append(j3);
                            strA0z = BV7.A0z(", End time: ", sbA0g, j3);
                        } else {
                            strA0z = "not seekable to start";
                        }
                    } else {
                        strA0z = "invalid period count";
                    }
                    super(FGI.A0M("Illegal clipping: ", strA0z));
                    this.reason = i3;
                }
            };
        }
        C5998Dth c5998DthA0E = timeline.A0E(new C5998Dth(), 0, 0L);
        long jMax = Math.max(0L, j);
        if (!z && !c5998DthA0E.A0E && jMax != 0 && !c5998DthA0E.A0F) {
            final long j4 = -9223372036854775807L;
            throw new IOException(i2, j4, j4) { // from class: androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException
                public final int reason;

                /* JADX WARN: Illegal instructions before constructor call */
                {
                    String strA0z;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            C1G.A08((j4 == -9223372036854775807L || j4 == -9223372036854775807L) ? false : true);
                            StringBuilder sbA0g = C3cG.A0g("start exceeds end. Start time: ");
                            sbA0g.append(j4);
                            strA0z = BV7.A0z(", End time: ", sbA0g, j4);
                        } else {
                            strA0z = "not seekable to start";
                        }
                    } else {
                        strA0z = "invalid period count";
                    }
                    super(FGI.A0M("Illegal clipping: ", strA0z));
                    this.reason = i2;
                }
            };
        }
        long jMax2 = j2 == Long.MIN_VALUE ? c5998DthA0E.A03 : Math.max(0L, j2);
        long j5 = c5998DthA0E.A03;
        if (j5 != -9223372036854775807L) {
            jMax2 = jMax2 > j5 ? j5 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.A02 = jMax;
        this.A01 = jMax2;
        this.A00 = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
        if (c5998DthA0E.A0D && (jMax2 == -9223372036854775807L || (j5 != -9223372036854775807L && jMax2 == j5))) {
            z2 = true;
        }
        this.A03 = z2;
    }

    @Override // X.Du4, androidx.media3.common.Timeline
    public final E6B A0D(E6B e6b, int i, boolean z) {
        super.A00.A0D(e6b, 0, z);
        long j = e6b.A02 - this.A02;
        long j2 = this.A00;
        e6b.A04(e6b.A04, e6b.A05, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j);
        return e6b;
    }

    @Override // X.Du4, androidx.media3.common.Timeline
    public final C5998Dth A0E(C5998Dth c5998Dth, int i, long j) {
        super.A00.A0E(c5998Dth, 0, 0L);
        long j2 = c5998Dth.A05;
        long j3 = this.A02;
        c5998Dth.A05 = j2 + j3;
        c5998Dth.A03 = this.A00;
        c5998Dth.A0D = this.A03;
        long j4 = c5998Dth.A02;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            c5998Dth.A02 = jMax;
            long j5 = this.A01;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            c5998Dth.A02 = jMax;
            c5998Dth.A02 = jMax - j3;
        }
        long jA0B = Util.A0B(j3);
        long j6 = c5998Dth.A06;
        if (j6 != -9223372036854775807L) {
            c5998Dth.A06 = j6 + jA0B;
        }
        long j7 = c5998Dth.A07;
        if (j7 != -9223372036854775807L) {
            c5998Dth.A07 = j7 + jA0B;
        }
        return c5998Dth;
    }
}
