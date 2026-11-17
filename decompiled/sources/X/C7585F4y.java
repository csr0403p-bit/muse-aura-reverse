package X;

import java.util.List;

/* renamed from: X.F4y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7585F4y implements E7R {
    public final int $t;
    public final Object A00;

    public C7585F4y(C6202Dxm c6202Dxm, int i) {
        this.$t = i;
        this.A00 = c6202Dxm;
    }

    @Override // X.E7R
    public final void ANx(Object obj) {
        switch (this.$t) {
            case 0:
                C10388Har c10388Har = (C10388Har) this.A00;
                C6438E5q c6438E5q = C6438E5q.$redex_init_class;
                ((E76) obj).onMediaMetadataChanged(c10388Har);
                break;
            case 1:
                E60 e60 = (E60) this.A00;
                C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
                ((E76) obj).onIsLoadingChanged(e60.A0D);
                break;
            case 2:
                E60 e602 = (E60) this.A00;
                C6438E5q c6438E5q3 = C6438E5q.$redex_init_class;
                ((E76) obj).onPlayerStateChanged(e602.A0E, e602.A01);
                break;
            case 3:
                E60 e603 = (E60) this.A00;
                C6438E5q c6438E5q4 = C6438E5q.$redex_init_class;
                ((E76) obj).onPlaybackStateChanged(e603.A01);
                break;
            case 4:
                E60 e604 = (E60) this.A00;
                C6438E5q c6438E5q5 = C6438E5q.$redex_init_class;
                ((E76) obj).onPlayWhenReadyChanged(e604.A0E, e604.A00);
                break;
            case 5:
                E60 e605 = (E60) this.A00;
                C6438E5q c6438E5q6 = C6438E5q.$redex_init_class;
                ((E76) obj).onPlaybackSuppressionReasonChanged(e605.A02);
                break;
            case 6:
                ((E76) obj).onAvailableCommandsChanged(((C6438E5q) this.A00).A0B);
                break;
            case 7:
                E60 e606 = (E60) this.A00;
                C6438E5q c6438E5q7 = C6438E5q.$redex_init_class;
                ((E76) obj).onIsPlayingChanged(e606.A0B());
                break;
            case 8:
                E60 e607 = (E60) this.A00;
                C6438E5q c6438E5q8 = C6438E5q.$redex_init_class;
                ((E76) obj).onPlaybackParametersChanged(e607.A05);
                break;
            case 9:
                E60 e608 = (E60) this.A00;
                C6438E5q c6438E5q9 = C6438E5q.$redex_init_class;
                ((E76) obj).onPlayerErrorChanged(e608.A07);
                break;
            case 10:
                E60 e609 = (E60) this.A00;
                C6438E5q c6438E5q10 = C6438E5q.$redex_init_class;
                ((E76) obj).onPlayerError(e609.A07);
                break;
            case 11:
                E60 e6010 = (E60) this.A00;
                C6438E5q c6438E5q11 = C6438E5q.$redex_init_class;
                ((E76) obj).onTracksChanged(e6010.A0B.A01);
                break;
            case 12:
                ((E76) obj).onCues((DXD) this.A00);
                break;
            case 13:
                C6438E5q c6438E5q12 = ((SurfaceHolderCallbackC6446E5z) this.A00).A00;
                C6438E5q c6438E5q13 = C6438E5q.$redex_init_class;
                ((E76) obj).onMediaMetadataChanged(c6438E5q12.A09);
                break;
            case 14:
                ((E76) obj).onMetadata((C5402Dhv) this.A00);
                break;
            case 15:
                ((E76) obj).onCues((List<E0J>) this.A00);
                break;
            case 16:
                ((E76) obj).onVideoSizeChanged((C6232Dya) this.A00);
                break;
        }
    }

    public C7585F4y(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }
}
