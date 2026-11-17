package X;

import com.facebook.aura.partners.voice.viewmodel.RtcPreviewPlayoutKt;

/* loaded from: classes6.dex */
public final class Hq0 {
    public final long A00;

    public final boolean equals(Object obj) {
        return (obj instanceof Hq0) && this.A00 == ((Hq0) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        StringBuilder sbA0w;
        String str;
        long j = this.A00;
        if (j < 1000) {
            sbA0w = C60O.A0w();
            sbA0w.append(j);
            str = " ns";
        } else if (j < RtcPreviewPlayoutKt.FRAME_INTERVAL_NANOS) {
            sbA0w = C60O.A0w();
            sbA0w.append(j / 1000);
            str = " \u00b5s";
        } else {
            sbA0w = C60O.A0w();
            sbA0w.append(j / 1000000);
            str = " ms";
        }
        return AnonymousClass001.A0v(str, sbA0w);
    }

    public /* synthetic */ Hq0(long j) {
        this.A00 = j;
    }
}
