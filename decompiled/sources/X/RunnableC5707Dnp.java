package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.Dnp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5707Dnp implements Runnable {
    public static final String __redex_internal_original_name = "AudioFocusManager$maybeReleaseAudioFocusRunnable$1";
    public final /* synthetic */ C5645DmZ A00;
    public final /* synthetic */ DsL A01;
    public final /* synthetic */ HeroPlayerSetting A02;

    public RunnableC5707Dnp(C5645DmZ c5645DmZ, DsL dsL, HeroPlayerSetting heroPlayerSetting) {
        this.A00 = c5645DmZ;
        this.A02 = heroPlayerSetting;
        this.A01 = dsL;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            X.DmZ r5 = r7.A00
            X.E88 r2 = r5.A0D
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.A07
            boolean r0 = r4.get()
            r3 = 0
            if (r0 == 0) goto L49
            if (r2 == 0) goto L35
            X.DtO r0 = r5.A01
            android.media.AudioManager r1 = r0.A00
            java.lang.Object r0 = r2.A01
            android.media.AudioFocusRequest r0 = (android.media.AudioFocusRequest) r0
            int r6 = r1.abandonAudioFocusRequest(r0)
            r1 = 1
            if (r6 == r1) goto L36
            r0 = 2
            if (r6 != r0) goto L46
            java.lang.String r1 = "Delayed"
        L23:
            java.lang.String r0 = " to abandon audio focus"
            java.lang.String r2 = r1.concat(r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = "AudioFocusManager"
            X.AbstractC3426CMt.A03(r0, r2, r1)
            X.DsL r0 = r5.A04
            r0.ATH(r6)
        L35:
            r1 = 0
        L36:
            r0 = 0
            r5.A0D = r0
            r4.set(r3)
            r5.A0C = r3
            if (r1 == 0) goto L45
            X.DsL r0 = r7.A01
            r0.ARp()
        L45:
            return
        L46:
            java.lang.String r1 = "Failed"
            goto L23
        L49:
            if (r2 == 0) goto L35
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r7.A02
            boolean r0 = r0.abandonUnacquiredAudioFocusRequest
            if (r0 == 0) goto L35
            X.DtO r0 = r5.A01
            android.media.AudioManager r1 = r0.A00
            java.lang.Object r0 = r2.A01
            android.media.AudioFocusRequest r0 = (android.media.AudioFocusRequest) r0
            r1.abandonAudioFocusRequest(r0)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC5707Dnp.run():void");
    }
}
