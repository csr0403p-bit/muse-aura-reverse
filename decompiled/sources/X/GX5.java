package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImplApi26;
import com.facebook.rsys.log.gen.LogApi;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GX5 {
    public G0U<? super Boolean, Unit> A00;
    public final GX4 A01;
    public final InterfaceC9648GXn A02;
    public final GX6 A03;

    public static final GX5 A00(Context context, GY2 gy2, GXS gxs, InterfaceC9648GXn interfaceC9648GXn, ExecutorService executorService, C78T c78t, boolean z, boolean z2) {
        C7384Etj.A0Y(context, 0);
        AudioManager audioManager = (AudioManager) AbstractC7609F5w.A0o(context);
        GXF gxf = new GXF(context, audioManager, gxs, interfaceC9648GXn, c78t);
        GXH gxh = new GXH(audioManager);
        return new GX5((Build.VERSION.SDK_INT < 31 || !gxs.shouldUseAudioOutputManagerAPIUpdate()) ? new GXE(context, audioManager, gy2, new GXK(gxf, interfaceC9648GXn), gxs, interfaceC9648GXn, gxh, executorService, c78t) : new GXD(context, audioManager, gy2, gxs, interfaceC9648GXn, gxh, executorService, c78t), interfaceC9648GXn, z ? new GX6(audioManager, new GY6(), interfaceC9648GXn, z2) : null);
    }

    public final void A01() {
        LogApi.CProxy.consoleLog(0, "AndroidAudioManager: restoreAfterCall", null);
        try {
            GX4 gx4 = this.A01;
            gx4.A0W(true, true);
            GX6 gx6 = this.A03;
            if (gx6 != null) {
                gx6.A00();
            }
            gx4.A0R();
        } finally {
            G0U<? super Boolean, Unit> g0u = this.A00;
            if (g0u != null) {
                g0u.invoke(false);
            }
        }
    }

    public final void A02(boolean z, boolean z2) throws Exception {
        LogApi.CProxy.consoleLog(0, "AndroidAudioManager: setupForCall", null);
        G0U<? super Boolean, Unit> g0u = this.A00;
        if (g0u != null) {
            AnonymousClass001.A1K(true, g0u);
        }
        try {
            GX4 gx4 = this.A01;
            gx4.A0X(z, z2);
            GX6 gx6 = this.A03;
            if (gx6 != null) {
                InterfaceC9648GXn interfaceC9648GXn = gx6.A04;
                boolean z3 = gx6.A05;
                InterfaceC9648GXn.A00(interfaceC9648GXn, FGI.A0q("requesting audio focus for call (useMediaStreamForPlayout=", ")", z3));
                gx6.A00();
                int i = z3 ? 1 : 2;
                SparseIntArray sparseIntArray = AudioAttributesCompat.A01;
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                builder.setUsage(i);
                builder.setContentType(1);
                AudioAttributes audioAttributesBuild = builder.build();
                AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
                audioAttributesImplApi26.A01 = audioAttributesBuild;
                audioAttributesImplApi26.A00 = -1;
                AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
                audioAttributesCompat.A00 = audioAttributesImplApi26;
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = gx6.A01;
                AudioAttributesCompat audioAttributesCompat2 = E88.A05;
                Handler handlerA02 = C60O.A02();
                if (onAudioFocusChangeListener == null) {
                    throw C60O.A0i("OnAudioFocusChangeListener must not be null");
                }
                E88 e88 = new E88(onAudioFocusChangeListener, handlerA02, audioAttributesCompat, 2);
                gx6.A00 = e88;
                boolean zA1Q = AnonymousClass002.A1Q(gx6.A02.A00.requestAudioFocus((AudioFocusRequest) e88.A01), 1);
                interfaceC9648GXn.A8D("audio focus request successful: %b", Boolean.valueOf(zA1Q));
                if (!zA1Q) {
                    InterfaceC9648GXn.A00(this.A02, "Failed to acquire audio focus.");
                }
            }
            gx4.A0T(HjW.A02);
        } catch (Exception e) {
            try {
                A01();
                throw e;
            } catch (Exception e2) {
                CU7.A01(e, e2);
                throw e;
            }
        }
    }

    public GX5(GX4 gx4, InterfaceC9648GXn interfaceC9648GXn, GX6 gx6) {
        this.A01 = gx4;
        this.A03 = gx6;
        this.A02 = interfaceC9648GXn;
    }
}
