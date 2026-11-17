package X;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$NonSerializableMemoizingSupplier;

/* loaded from: classes5.dex */
public final class E62 {
    public float A00 = 1.0f;
    public int A01 = 0;
    public int A02;
    public DrN A03;
    public E87 A04;
    public E7V A05;
    public final Handler A06;
    public final Supplier<AudioManager> A07;

    public static void A00(E62 e62) {
        int i = e62.A01;
        if (i == 1 || i == 0 || e62.A04 == null) {
            return;
        }
        AudioManager audioManager = e62.A07.get();
        Object obj = e62.A04.A00;
        obj.getClass();
        audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
    }

    public static void A01(E62 e62, int i) {
        if (e62.A01 != i) {
            e62.A01 = i;
            float f = i == 4 ? 0.2f : 1.0f;
            if (e62.A00 != f) {
                e62.A00 = f;
                E7V e7v = e62.A05;
                if (e7v != null) {
                    e7v.AfG();
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.DrN r5) {
        /*
            r4 = this;
            X.DrN r0 = r4.A03
            boolean r0 = X.C6xC.A00(r0, r5)
            if (r0 != 0) goto L27
            r4.A03 = r5
            if (r5 == 0) goto L19
            int r3 = r5.A01
            java.lang.String r2 = "AudioFocusManager"
            r1 = 1
            switch(r3) {
                case 0: goto L2e;
                case 1: goto L1a;
                case 2: goto L2c;
                case 3: goto L19;
                case 4: goto L2c;
                case 5: goto L2a;
                case 6: goto L2a;
                case 7: goto L2a;
                case 8: goto L2a;
                case 9: goto L2a;
                case 10: goto L2a;
                case 11: goto L2a;
                case 12: goto L2a;
                case 13: goto L2a;
                case 14: goto L1a;
                case 15: goto L14;
                case 16: goto L28;
                default: goto L14;
            }
        L14:
            java.lang.String r0 = "Unidentified audio usage: "
            X.BV6.A1H(r0, r3, r2)
        L19:
            r1 = 0
        L1a:
            r4.A02 = r1
            r2 = 1
            if (r1 == r2) goto L22
            if (r1 == 0) goto L22
            r2 = 0
        L22:
            java.lang.String r0 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            X.C1G.A09(r2, r0)
        L27:
            return
        L28:
            r1 = 4
            goto L1a
        L2a:
            r1 = 3
            goto L1a
        L2c:
            r1 = 2
            goto L1a
        L2e:
            java.lang.String r0 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            X.CNC.A04(r2, r0)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E62.A02(X.DrN):void");
    }

    public E62(Context context, Looper looper, E7V e7v) {
        this.A07 = new Suppliers$NonSerializableMemoizingSupplier(new CL8(context, 0));
        this.A05 = e7v;
        this.A06 = BV4.A09(looper);
    }
}
