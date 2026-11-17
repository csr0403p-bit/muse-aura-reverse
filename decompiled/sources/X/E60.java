package X;

import android.os.SystemClock;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes5.dex */
public final class E60 {
    public static final Dy6 A0L = new Dy6(C3cG.A0T(), -1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final C6233Dyb A05;
    public final Timeline A06;
    public final ExoPlaybackException A07;
    public final Dy6 A08;
    public final Dy6 A09;
    public final C5414DiA A0A;
    public final E6W A0B;
    public final List<C5402Dhv> A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public volatile long A0G;
    public volatile long A0H;
    public volatile long A0I;
    public volatile long A0J;
    public volatile long A0K;

    public static E60 A00(E6W e6w) {
        Timeline timeline = Timeline.A00;
        Dy6 dy6 = A0L;
        return new E60(C6233Dyb.A03, timeline, null, dy6, dy6, C5414DiA.A03, e6w, ImmutableList.of(), 1, 1, 0, -9223372036854775807L, 0L, 0L, 0L, -9223372036854775807L, 0L, 0L, false, false, false);
    }

    public final E60 A02() {
        Timeline timeline = this.A06;
        Dy6 dy6 = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        int i = this.A01;
        ExoPlaybackException exoPlaybackException = this.A07;
        boolean z = this.A0D;
        C5414DiA c5414DiA = this.A0A;
        E6W e6w = this.A0B;
        List<C5402Dhv> list = this.A0C;
        Dy6 dy62 = this.A08;
        boolean z2 = this.A0E;
        return new E60(this.A05, timeline, exoPlaybackException, dy6, dy62, c5414DiA, e6w, list, i, this.A00, this.A02, j, j2, this.A0G, this.A0K, this.A0J, this.A0I, this.A0H, z, z2, false);
    }

    public final E60 A03(int i) {
        Timeline timeline = this.A06;
        Dy6 dy6 = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        ExoPlaybackException exoPlaybackException = this.A07;
        boolean z = this.A0D;
        C5414DiA c5414DiA = this.A0A;
        E6W e6w = this.A0B;
        List<C5402Dhv> list = this.A0C;
        Dy6 dy62 = this.A08;
        boolean z2 = this.A0E;
        return new E60(this.A05, timeline, exoPlaybackException, dy6, dy62, c5414DiA, e6w, list, i, this.A00, this.A02, j, j2, this.A0G, this.A0K, this.A0J, this.A0I, this.A0H, z, z2, this.A0F);
    }

    public final E60 A04(int i, int i2, boolean z) {
        Timeline timeline = this.A06;
        Dy6 dy6 = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        int i3 = this.A01;
        ExoPlaybackException exoPlaybackException = this.A07;
        boolean z2 = this.A0D;
        C5414DiA c5414DiA = this.A0A;
        E6W e6w = this.A0B;
        List<C5402Dhv> list = this.A0C;
        return new E60(this.A05, timeline, exoPlaybackException, dy6, this.A08, c5414DiA, e6w, list, i3, i, i2, j, j2, this.A0G, this.A0K, this.A0J, this.A0I, this.A0H, z2, z, this.A0F);
    }

    public final E60 A05(C6233Dyb c6233Dyb) {
        Timeline timeline = this.A06;
        Dy6 dy6 = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        int i = this.A01;
        ExoPlaybackException exoPlaybackException = this.A07;
        boolean z = this.A0D;
        C5414DiA c5414DiA = this.A0A;
        E6W e6w = this.A0B;
        List<C5402Dhv> list = this.A0C;
        return new E60(c6233Dyb, timeline, exoPlaybackException, dy6, this.A08, c5414DiA, e6w, list, i, this.A00, this.A02, j, j2, this.A0G, this.A0K, this.A0J, this.A0I, this.A0H, z, this.A0E, this.A0F);
    }

    public final E60 A06(Timeline timeline) {
        Dy6 dy6 = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        int i = this.A01;
        ExoPlaybackException exoPlaybackException = this.A07;
        boolean z = this.A0D;
        C5414DiA c5414DiA = this.A0A;
        E6W e6w = this.A0B;
        List<C5402Dhv> list = this.A0C;
        Dy6 dy62 = this.A08;
        boolean z2 = this.A0E;
        return new E60(this.A05, timeline, exoPlaybackException, dy6, dy62, c5414DiA, e6w, list, i, this.A00, this.A02, j, j2, this.A0G, this.A0K, this.A0J, this.A0I, this.A0H, z, z2, this.A0F);
    }

    public final E60 A07(ExoPlaybackException exoPlaybackException) {
        Timeline timeline = this.A06;
        Dy6 dy6 = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        int i = this.A01;
        boolean z = this.A0D;
        C5414DiA c5414DiA = this.A0A;
        E6W e6w = this.A0B;
        List<C5402Dhv> list = this.A0C;
        Dy6 dy62 = this.A08;
        boolean z2 = this.A0E;
        return new E60(this.A05, timeline, exoPlaybackException, dy6, dy62, c5414DiA, e6w, list, i, this.A00, this.A02, j, j2, this.A0G, this.A0K, this.A0J, this.A0I, this.A0H, z, z2, this.A0F);
    }

    public final E60 A08(Dy6 dy6) {
        Timeline timeline = this.A06;
        Dy6 dy62 = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        int i = this.A01;
        ExoPlaybackException exoPlaybackException = this.A07;
        boolean z = this.A0D;
        C5414DiA c5414DiA = this.A0A;
        E6W e6w = this.A0B;
        List<C5402Dhv> list = this.A0C;
        boolean z2 = this.A0E;
        return new E60(this.A05, timeline, exoPlaybackException, dy62, dy6, c5414DiA, e6w, list, i, this.A00, this.A02, j, j2, this.A0G, this.A0K, this.A0J, this.A0I, this.A0H, z, z2, this.A0F);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Dy6;JJJJLX/DiA;LX/E6W;Ljava/util/List<LX/Dhv;>;)LX/E60; */
    public final E60 A09(Dy6 dy6, C5414DiA c5414DiA, E6W e6w, List list, long j, long j2, long j3, long j4) {
        Timeline timeline = this.A06;
        int i = this.A01;
        ExoPlaybackException exoPlaybackException = this.A07;
        boolean z = this.A0D;
        Dy6 dy62 = this.A08;
        boolean z2 = this.A0E;
        return new E60(this.A05, timeline, exoPlaybackException, dy6, dy62, c5414DiA, e6w, list, i, this.A00, this.A02, j2, j3, this.A0G, j4, -9223372036854775807L, j, SystemClock.elapsedRealtime(), z, z2, this.A0F);
    }

    public final E60 A0A(boolean z) {
        Timeline timeline = this.A06;
        Dy6 dy6 = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        int i = this.A01;
        ExoPlaybackException exoPlaybackException = this.A07;
        C5414DiA c5414DiA = this.A0A;
        E6W e6w = this.A0B;
        List<C5402Dhv> list = this.A0C;
        Dy6 dy62 = this.A08;
        boolean z2 = this.A0E;
        return new E60(this.A05, timeline, exoPlaybackException, dy6, dy62, c5414DiA, e6w, list, i, this.A00, this.A02, j, j2, this.A0G, this.A0K, this.A0J, this.A0I, this.A0H, z, z2, this.A0F);
    }

    public final boolean A0B() {
        return this.A01 == 3 && this.A0E && this.A02 == 0;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/media3/common/Timeline;LX/Dy6;JJILandroidx/media3/exoplayer/ExoPlaybackException;ZLX/DiA;LX/E6W;Ljava/util/List<LX/Dhv;>;LX/Dy6;ZIILX/Dyb;JJJJJZ)V */
    public E60(C6233Dyb c6233Dyb, Timeline timeline, ExoPlaybackException exoPlaybackException, Dy6 dy6, Dy6 dy62, C5414DiA c5414DiA, E6W e6w, List list, int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3) {
        this.A06 = timeline;
        this.A09 = dy6;
        this.A04 = j;
        this.A03 = j2;
        this.A01 = i;
        this.A07 = exoPlaybackException;
        this.A0D = z;
        this.A0A = c5414DiA;
        this.A0B = e6w;
        this.A0C = list;
        this.A08 = dy62;
        this.A0E = z2;
        this.A00 = i2;
        this.A02 = i3;
        this.A05 = c6233Dyb;
        this.A0G = j3;
        this.A0K = j4;
        this.A0J = j5;
        this.A0I = j6;
        this.A0H = j7;
        this.A0F = z3;
    }

    public final long A01() {
        long j;
        long j2;
        if (!A0B()) {
            return this.A0I;
        }
        do {
            j = this.A0H;
            j2 = this.A0I;
        } while (j != this.A0H);
        return Util.A0A(Util.A0B(j2) + ((long) (C3cG.A04(j) * this.A05.A01)));
    }
}
