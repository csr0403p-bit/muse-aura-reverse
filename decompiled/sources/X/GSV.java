package X;

import android.os.SystemClock;
import com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice;
import com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioTransport;
import com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerListener;
import com.facebook.rsys.appdrivenaudio.gen.NativeAppDrivenAudioDevice;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public final class GSV {
    public static final Object A0B = C3cG.A0T();
    public static volatile GSV A0C;
    public long A00;
    public long A01;
    public GX5 A02;
    public final AppDrivenAudioDevice A03;
    public final ExecutorService A04;
    public final C3UX A05;
    public final AbstractC9259GBm A06;
    public final InterfaceC2261BLa A07 = new C9258GBl();
    public volatile long A08;
    public volatile AppDrivenAudioTransport A09;
    public volatile String A0A;

    public static final GSV A00(ExecutorService executorService) {
        GSV gsv;
        C7384Etj.A0Y(executorService, 0);
        GSV gsv2 = A0C;
        if (gsv2 != null) {
            return gsv2;
        }
        synchronized (A0B) {
            gsv = A0C;
            if (gsv == null) {
                AppDrivenAudioDevice appDrivenAudioDeviceCreate = NativeAppDrivenAudioDevice.CProxy.create();
                C7384Etj.A0U(appDrivenAudioDeviceCreate);
                gsv = new GSV(appDrivenAudioDeviceCreate, executorService);
                A0C = gsv;
            }
        }
        return gsv;
    }

    public static final void A01(GSV gsv, GSX gsx, AudioStateManagerListener audioStateManagerListener, GX5 gx5, String str, boolean z, boolean z2) throws Exception {
        AbstractC2159Azp.A0z("setupAudioStateForRtcInternal::begin", "%", "%%");
        gsv.A00 = System.nanoTime() / 1000000;
        gsv.A0A = str;
        gsv.A02 = gx5;
        if (gx5 != null) {
            gx5.A02(z, z2);
        }
        AppDrivenAudioDevice appDrivenAudioDevice = gsv.A03;
        appDrivenAudioDevice.setListener(audioStateManagerListener);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        String str2 = gsx.A06;
        if (str2 != null && str2.length() > 0) {
            linkedHashMapA0j.put("startEarconFilePath", str2);
        }
        String str3 = gsx.A05;
        if (str3 != null && str3.length() > 0) {
            linkedHashMapA0j.put("endEarconFilePath", str3);
        }
        LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
        Integer num = gsx.A03;
        if (num != null) {
            linkedHashMapA0j2.put("androidAudioSource", num);
        }
        Integer num2 = gsx.A04;
        if (num2 != null) {
            linkedHashMapA0j2.put("androidPlayoutStreamType", num2);
        }
        appDrivenAudioDevice.setup(linkedHashMapA0j, linkedHashMapA0j2, AGH.A0D(C3cG.A0r("preBufferingEnabled", Boolean.valueOf(gsx.A0A)), C3cG.A0r("ARCv2OnAsmQueueEnabled", false), C3cG.A0r("useMediaStreamForPlayout", Boolean.valueOf(gsx.A0C)), C3cG.A0r("useMarvinAudio", false), C3cG.A0r("deferRtcAudioAtStart", Boolean.valueOf(gsx.A07)), C3cG.A0r("deferStartEarcon", Boolean.valueOf(gsx.A08)), C3cG.A0r("recordingFeederDisabled", Boolean.valueOf(gsx.A0B))));
        if (gsx.A09) {
            appDrivenAudioDevice.enableBuiltInNs(false);
        }
        Boolean bool = gsx.A00;
        if (bool != null) {
            appDrivenAudioDevice.enableBuiltInAec(bool.booleanValue());
        }
        Boolean bool2 = gsx.A01;
        if (bool2 != null) {
            appDrivenAudioDevice.enableBuiltInAgc(bool2.booleanValue());
        }
        Boolean bool3 = gsx.A02;
        if (bool3 != null) {
            appDrivenAudioDevice.enableBuiltInNs(bool3.booleanValue());
        }
        gsv.A01 = System.nanoTime() / 1000000;
        AbstractC2159Azp.A0z("setupAudioStateForRtcInternal::end", "%", "%%");
    }

    public static final void A02(GSV gsv, String str, boolean z) {
        AbstractC2159Azp.A0z(FGI.A0r("teardownAudioStateForRtcInternal::begin, playEndEarcon=", z), "%", "%%");
        if (C7384Etj.areEqual(str, gsv.A0A)) {
            gsv.A03.reset(z);
            GX5 gx5 = gsv.A02;
            if (gx5 != null) {
                boolean zA1Z = AnonymousClass002.A1Z(gx5.A01.A0Q(), GXX.A02);
                gx5.A01();
                gx5.A01.A0S();
                if (zA1Z) {
                    gsv.A08 = SystemClock.elapsedRealtime();
                }
            }
            gsv.A02 = null;
            gsv.A09 = null;
            gsv.A00 = 0L;
            gsv.A01 = 0L;
            gsv.A0A = null;
            AbstractC2159Azp.A0z("teardownAudioStateForRtcInternal::end", "%", "%%");
        }
    }

    public static final boolean A03(GSV gsv, String str) {
        if (gsv.A0A == null) {
            return true;
        }
        String strA0d = FGI.A0d("setupAudioStateForRtc called more than once without a corresponding shutdown. Current localCallId: ", gsv.A0A, ", new localCallId: ", str);
        C7384Etj.A0Y(strA0d, 1);
        AbstractC7608F5v.A1L(strA0d);
        if (C7384Etj.areEqual(gsv.A0A, str)) {
            return false;
        }
        String str2 = gsv.A0A;
        if (str2 == null) {
            return true;
        }
        A02(gsv, str2, false);
        return true;
    }

    public GSV(AppDrivenAudioDevice appDrivenAudioDevice, ExecutorService executorService) {
        this.A04 = executorService;
        this.A03 = appDrivenAudioDevice;
        this.A06 = new Hy1(executorService);
        this.A05 = C78W.A05(new C8eO(null), new Hy1(executorService));
        executorService.execute(new RunnableC9618GSb(this));
        this.A08 = -1L;
    }
}
