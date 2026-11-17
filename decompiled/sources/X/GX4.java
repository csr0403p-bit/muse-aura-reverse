package X;

import X.AnonymousClass002;
import X.C7384Etj;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Trace;
import android.provider.Settings;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.json.JSONException;

/* loaded from: classes6.dex */
public abstract class GX4 {
    public BroadcastReceiver A00;
    public GXQ A01;
    public GXX A02;
    public final Context A03;
    public final AudioManager A04;
    public final GY2 A07;
    public final GXS A08;
    public final InterfaceC9648GXn A09;
    public final GXH A0A;
    public final ExecutorService A0B;
    public final GVo A0E;
    public HjW aomAudioModeState;
    public volatile GXX aomCurrentAudioOutput;
    public boolean aomDisableEarpieceMode;
    public volatile boolean aomForceSpeakerOverEarpiece;
    public volatile boolean aomIsHeadsetAttached;
    public int aomSavedAudioMode;
    public volatile boolean aomShouldSpeakerOnHeadsetUnplug;
    public final C10538Hql audioManagerQplLogger;
    public final EBX audioRecordMonitor;
    public final Ao0<InterfaceC9637GWh> A05 = new Ao0<>(0);
    public final Ao0 A0C = new Ao0(0);
    public final Ao0 A06 = new Ao0(0);
    public final GVu A0D = new GVu(this);

    public GX4(Context context, AudioManager audioManager, GY2 gy2, GXS gxs, InterfaceC9648GXn interfaceC9648GXn, GXH gxh, ExecutorService executorService) {
        this.A03 = context;
        this.A07 = gy2;
        this.A04 = audioManager;
        this.A09 = interfaceC9648GXn;
        this.A0B = executorService;
        this.A08 = gxs;
        this.A0A = gxh;
        C10538Hql c10538Hql = new C10538Hql(null);
        this.audioManagerQplLogger = c10538Hql;
        this.A0E = new GVo(context, audioManager, gxs, interfaceC9648GXn, executorService);
        this.audioRecordMonitor = new EBX(context, audioManager, c10538Hql, interfaceC9648GXn, executorService);
        this.aomSavedAudioMode = -2;
        this.aomCurrentAudioOutput = GXX.A03;
        this.aomAudioModeState = HjW.A03;
    }

    public void A0S() {
        this.aomShouldSpeakerOnHeadsetUnplug = false;
        this.aomIsHeadsetAttached = false;
        this.aomForceSpeakerOverEarpiece = false;
        this.aomAudioModeState = HjW.A03;
        this.A0E.A00();
        GXH gxh = this.A0A;
        AudioDeviceCallback audioDeviceCallback = gxh.A00;
        if (audioDeviceCallback != null) {
            this.A04.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
        gxh.A00 = null;
    }

    public final int A0L() {
        int iOrdinal = this.aomAudioModeState.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2 || iOrdinal == 0) {
            return this.A07.A8y();
        }
        throw C3cG.A0q();
    }

    public final void A0M() {
        Iterator itA0z = BV5.A0z(this.A05);
        while (itA0z.hasNext()) {
            ((InterfaceC9637GWh) itA0z.next()).audioOutputChanged();
        }
    }

    public final void A0N() throws JSONException {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.rtc.audiolite.RtcAudioOutputManagerBase$HeadsetPlugReceiver
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                C7384Etj.A0Y(intent, 1);
                boolean zA1N = AnonymousClass002.A1N(intent.getIntExtra("state", 0));
                intent.getIntExtra("microphone", 0);
                intent.getStringExtra("name");
                this.A00.A0U(zA1N);
            }
        };
        this.A00 = broadcastReceiver;
        this.A03.registerReceiver(broadcastReceiver, intentFilter);
        EBX ebx = this.audioRecordMonitor;
        if (ebx.A04.A00 != null) {
            EBX.A01(ebx);
            EBX.A02(ebx, null);
            AudioManager.AudioRecordingCallback audioRecordingCallback = ebx.A00;
            if (audioRecordingCallback != null) {
                ebx.A02.registerAudioRecordingCallback(audioRecordingCallback, null);
            }
        }
    }

    public final void A0O() {
        GVo gVo = this.A0E;
        GVu gVu = this.A0D;
        C7384Etj.A0Y(gVu, 0);
        AbstractC3136BzG.A00("VolumeChangeAnnouncer::registerVolumeObserver");
        try {
            if (gVo.A00 != null) {
                gVo.A05.AiN("VolumeChangeAnnouncer", "Observer already registered", new Object[0]);
            } else {
                C9632GVp c9632GVp = new C9632GVp(C60O.A02(), gVu, gVo);
                gVo.A03.registerContentObserver(Settings.System.CONTENT_URI, true, c9632GVp);
                gVo.A00 = c9632GVp;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void A0P(boolean z) {
        GX7 gx7 = new GX7(this, z);
        ExecutorService executorService = this.A0B;
        if (executorService == null || !this.A08.offloadSetMicrophoneMute()) {
            gx7.run();
        } else {
            executorService.execute(gx7);
        }
    }

    public GXX A0Q() {
        return this.aomCurrentAudioOutput;
    }

    public void A0R() throws JSONException {
        EBX ebx = this.audioRecordMonitor;
        if (ebx.A04.A00 != null) {
            EBX.A01(ebx);
            ebx.A03.removeCallbacks(ebx.A06);
            AudioManager.AudioRecordingCallback audioRecordingCallback = ebx.A00;
            if (audioRecordingCallback != null) {
                ebx.A02.unregisterAudioRecordingCallback(audioRecordingCallback);
            }
        }
        if (this.A08.enableOnVolumeChangeOnBackgroundThread()) {
            this.A0E.A00();
        }
        GXH gxh = this.A0A;
        AudioDeviceCallback audioDeviceCallback = gxh.A00;
        if (audioDeviceCallback != null) {
            this.A04.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
        gxh.A00 = null;
    }

    public /* synthetic */ void A0T(HjW hjW) {
        GXE gxe = (GXE) this;
        C7384Etj.A0Y(hjW, 0);
        gxe.aomAudioModeState = hjW;
        GXE.A00(gxe, gxe.A0L(), false);
        EBX ebx = gxe.audioRecordMonitor;
        if (ebx.A04.A00 == null || hjW != HjW.A02) {
            return;
        }
        Handler handler = ebx.A03;
        Runnable runnable = ebx.A06;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 5000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0U(boolean r4) {
        /*
            r3 = this;
            X.GXE r3 = (X.GXE) r3
            X.GXn r2 = r3.A09
            java.lang.Object[] r1 = X.BV4.A1Z(r4)
            java.lang.String r0 = "onHeadsetPlugged, isHeadsetAttached=%b"
            r2.A8D(r0, r1)
            r3.aomIsHeadsetAttached = r4
            if (r4 == 0) goto L38
            boolean r0 = r3.A0B
            r3.aomShouldSpeakerOnHeadsetUnplug = r0
            X.GXS r0 = r3.A08
            boolean r0 = r0.changeAudioToHeadsetWhenHeadsetIsOn()
            if (r0 == 0) goto L50
            X.GXX r0 = X.GXX.A04
        L1f:
            r3.A0c(r0)
            X.GXX r1 = r3.aomCurrentAudioOutput
            X.GXX r0 = X.GXX.A03
            if (r1 != r0) goto L2e
            boolean r0 = r3.aomIsHeadsetAttached
            if (r0 == 0) goto L2e
            X.GXX r1 = X.GXX.A04
        L2e:
            r3.A02 = r1
            X.GXQ r0 = r3.A01
            if (r0 == 0) goto L37
            r0.A00(r1)
        L37:
            return
        L38:
            boolean r0 = r3.A0Y()
            if (r0 == 0) goto L41
            X.GXX r0 = X.GXX.A02
            goto L1f
        L41:
            boolean r0 = r3.aomShouldSpeakerOnHeadsetUnplug
            if (r0 != 0) goto L4d
            boolean r0 = r3.aomDisableEarpieceMode
            if (r0 != 0) goto L4d
            boolean r0 = r3.aomForceSpeakerOverEarpiece
            if (r0 == 0) goto L50
        L4d:
            X.GXX r0 = X.GXX.A05
            goto L1f
        L50:
            X.GXX r0 = X.GXX.A03
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GX4.A0U(boolean):void");
    }

    public /* synthetic */ void A0V(boolean z) {
        GXE gxe = (GXE) this;
        boolean z2 = gxe.A05 ^ z;
        gxe.A05 = z;
        if (z2 && z) {
            GXS gxs = gxe.A08;
            if (gxs.enableSetVideoCallFix()) {
                RunnableC9645GXh runnableC9645GXh = new RunnableC9645GXh(gxe);
                ExecutorService executorServiceMo1794getSetAsyncTurnOnVideoSpeakerphoneExecutor = gxs.mo1794getSetAsyncTurnOnVideoSpeakerphoneExecutor();
                if (executorServiceMo1794getSetAsyncTurnOnVideoSpeakerphoneExecutor == null) {
                    runnableC9645GXh.run();
                    return;
                }
                Future<?> future = gxe.A02;
                if (future != null) {
                    future.cancel(false);
                }
                gxe.A02 = null;
                gxe.A02 = executorServiceMo1794getSetAsyncTurnOnVideoSpeakerphoneExecutor.submit(runnableC9645GXh);
            }
        }
    }

    public void A0W(boolean z, boolean z2) {
        int i;
        GXE gxe = (GXE) this;
        Future<?> future = gxe.A02;
        if (future != null) {
            future.cancel(false);
        }
        gxe.A02 = null;
        gxe.A07.A05.A02();
        if (z2) {
            gxe.A0P(false);
            ((GX4) gxe).A0A.A00(false);
        }
        if (z && (i = gxe.aomSavedAudioMode) != -2) {
            GXE.A00(gxe, i, true);
        }
        ((GX4) gxe).A02 = null;
        GXQ gxq = ((GX4) gxe).A01;
        if (gxq != null) {
            gxq.A00(null);
        }
        if (gxe.A00 != null && gxe.A03) {
            gxe.A03 = false;
            gxe.A06.post(new RunnableC9640GXb(gxe));
        }
        BroadcastReceiver broadcastReceiver = ((GX4) gxe).A00;
        if (broadcastReceiver != null) {
            ((GX4) gxe).A03.unregisterReceiver(broadcastReceiver);
            ((GX4) gxe).A00 = null;
        }
        GXH gxh = ((GX4) gxe).A0A;
        Context context = ((GX4) gxe).A03;
        synchronized (gxh) {
            if (gxh.A01) {
                context.unregisterReceiver(gxh.A03);
                gxh.A01 = false;
            }
        }
    }

    public void A0X(boolean z, boolean z2) {
        GX7 gx7 = new GX7(this, z);
        ExecutorService executorService = this.A0B;
        if (executorService == null || !this.A08.offloadSetMicrophoneMute()) {
            gx7.run();
        } else {
            executorService.execute(gx7);
        }
        this.aomDisableEarpieceMode = this.A07.AfQ();
        this.aomForceSpeakerOverEarpiece = z2;
        if (this.A08.enableAsyncDevices()) {
            GXH gxh = this.A0A;
            AudioManager audioManager = this.A04;
            if (gxh.A00 == null) {
                C9647GXm c9647GXm = new C9647GXm(gxh);
                gxh.A00 = c9647GXm;
                audioManager.registerAudioDeviceCallback(c9647GXm, C60O.A02());
            }
        }
        this.aomIsHeadsetAttached = this.A04.isWiredHeadsetOn();
    }

    public boolean A0Y() {
        GXE gxe = (GXE) this;
        if (!gxe.A08.shouldSkipBluetoothScoForCall()) {
            GXK gxk = gxe.A07;
            if (!gxk.A09 && gxk.A05.A05()) {
                return true;
            }
        }
        return false;
    }

    public boolean A0Z() {
        return AnonymousClass002.A1Z(this.aomCurrentAudioOutput, GXX.A02);
    }

    public boolean A0a() {
        return AnonymousClass002.A1Z(this.aomCurrentAudioOutput, GXX.A03);
    }

    public boolean A0b() {
        return AnonymousClass002.A1Z(this.aomCurrentAudioOutput, GXX.A05);
    }

    public boolean A0c(GXX gxx) {
        int i;
        String str;
        GXE gxe = (GXE) this;
        C7384Etj.A0Y(gxx, 0);
        InterfaceC9648GXn interfaceC9648GXn = ((GX4) gxe).A09;
        interfaceC9648GXn.A8D("changeAudio to %s", gxx);
        if (gxx == GXX.A02 && gxe.A08.shouldSkipBluetoothScoForCall()) {
            str = "changeAudio: Bluetooth SCO disabled for this call";
        } else {
            String.valueOf(gxx);
            GXE.A00(gxe, gxe.A0L(), false);
            GXX gxx2 = GXX.A05;
            if (gxx != gxx2 || !gxe.A08.preventSpeakerphoneWhileBluetoothIsOn() || !gxe.A07.A03()) {
                if (gxe.aomCurrentAudioOutput == gxx) {
                    if (gxx == gxx2 && gxe.aomForceSpeakerOverEarpiece) {
                        interfaceC9648GXn.A8D("changeAudio: re-asserting %s", gxx);
                        ((GX4) gxe).A0A.A00(true);
                        gxe.A0B = true;
                    } else {
                        interfaceC9648GXn.A8D("changeAudio: already on %s, skipping", gxx);
                    }
                    gxe.A0M();
                    return false;
                }
                int iOrdinal = gxx.ordinal();
                if (iOrdinal != 2) {
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            GXK gxk = gxe.A07;
                            int i2 = gxk.A05.A00;
                            if (i2 == 1 || i2 == 2) {
                                GXK.A02(gxk, true);
                            }
                            ((GX4) gxe).A0A.A00(true);
                            gxe.A0B = true;
                        } else if (iOrdinal != 3) {
                            throw C3cG.A0q();
                        }
                    } else if (!gxe.aomIsHeadsetAttached && (gxe.aomDisableEarpieceMode || gxe.aomForceSpeakerOverEarpiece)) {
                        return false;
                    }
                    GXK gxk2 = gxe.A07;
                    int i3 = gxk2.A05.A00;
                    if (i3 == 1 || i3 == 2) {
                        GXK.A02(gxk2, true);
                    }
                    ((GX4) gxe).A0A.A00(false);
                    gxe.A0B = false;
                } else {
                    GXK gxk3 = gxe.A07;
                    if (!gxk3.A09) {
                        GXF gxf = gxk3.A05;
                        if (gxf.A05() && (i = gxf.A00) != 1 && i != 2) {
                            GXK.A01(gxk3);
                        }
                    }
                }
                Thread threadCurrentThread = Thread.currentThread();
                Handler handler = gxe.A06;
                if (threadCurrentThread.equals(handler.getLooper().getThread())) {
                    gxe.A0d();
                    return true;
                }
                handler.post(new RunnableC9651GXx(gxe));
                return true;
            }
            str = "changeAudio: refusing speakerphone while bluetooth is on";
        }
        InterfaceC9648GXn.A00(interfaceC9648GXn, str);
        return false;
    }
}
