package X;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.util.Util;

/* renamed from: X.DoX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5737DoX {
    public final Spatializer.OnSpatializerStateChangedListener A00;
    public final Spatializer A01;
    public final Handler A02;
    public final boolean A03;

    public final void A00() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.A01;
        if (spatializer == null || (onSpatializerStateChangedListener = this.A00) == null || (handler = this.A02) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }

    public final boolean A01() {
        Spatializer spatializer = this.A01;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    public final boolean A02() {
        Spatializer spatializer = this.A01;
        spatializer.getClass();
        return spatializer.isEnabled();
    }

    public final boolean A03() {
        return this.A03;
    }

    public final boolean A04(DrN drN, C6154Dwx c6154Dwx) throws IllegalArgumentException {
        int i;
        String str = c6154Dwx.A0b;
        if (C6xC.A00(str, "audio/eac3-joc")) {
            i = c6154Dwx.A06;
            if (i == 16) {
                i = 12;
            }
        } else if (C6xC.A00(str, "audio/iamf")) {
            i = c6154Dwx.A06;
            if (i == -1) {
                i = 6;
            }
        } else {
            boolean zA00 = C6xC.A00(str, "audio/ac4");
            i = c6154Dwx.A06;
            if (zA00 && (i == 18 || i == 21)) {
                i = 24;
            }
        }
        int iA00 = Util.A00(i);
        if (iA00 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iA00);
        int i2 = c6154Dwx.A0L;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.A01;
        spatializer.getClass();
        C5887DrO c5887DrO = drN.A00;
        if (c5887DrO == null) {
            c5887DrO = new C5887DrO(drN);
            drN.A00 = c5887DrO;
        }
        return spatializer.canBeSpatialized(c5887DrO.A00, channelMask.build());
    }

    public C5737DoX(Context context, DoW doW, Boolean bool) {
        if (context != null) {
            AudioManager audioManagerA00 = DpL.A00(context);
            if (bool == null || !bool.booleanValue()) {
                Spatializer spatializer = audioManagerA00.getSpatializer();
                this.A01 = spatializer;
                this.A03 = spatializer.getImmersiveAudioLevel() != 0;
                C5837DqT c5837DqT = new C5837DqT(this, doW);
                this.A00 = c5837DqT;
                Looper looperMyLooper = Looper.myLooper();
                C1G.A05(looperMyLooper);
                Handler handlerA09 = BV4.A09(looperMyLooper);
                this.A02 = handlerA09;
                spatializer.addOnSpatializerStateChangedListener(new F53(handlerA09, 0), c5837DqT);
            }
        }
    }
}
