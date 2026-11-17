package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class GXD extends GX4 {
    public AudioDeviceInfo A00;
    public GY1 A01;
    public Set<AudioDeviceInfo> A02;
    public HoC A03;
    public boolean A04;
    public Integer A05;
    public HoC A06;
    public boolean A07;
    public final AudioManager.OnCommunicationDeviceChangedListener A08;
    public final AudioDeviceCallback A09;
    public final Handler A0A;
    public final GXS A0B;
    public final AtomicInteger A0C;
    public final C78T A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GXD(Context context, AudioManager audioManager, GY2 gy2, GXS gxs, InterfaceC9648GXn interfaceC9648GXn, GXH gxh, ExecutorService executorService, C78T c78t) {
        super(context, audioManager, gy2, gxs, interfaceC9648GXn, gxh, executorService);
        C7384Etj.A0Y(audioManager, 2);
        this.A0B = gxs;
        this.A0D = c78t;
        this.A0A = C60O.A02();
        this.A02 = new CopyOnWriteArraySet();
        this.A0C = new AtomicInteger(1);
        this.A09 = new GXM(this, interfaceC9648GXn);
        this.A08 = new GXJ(audioManager, this, interfaceC9648GXn);
    }

    public static /* synthetic */ boolean A0I(AudioDeviceInfo audioDeviceInfo, GXD gxd) {
        try {
        } catch (IllegalArgumentException e) {
            ((GX4) gxd).A09.AAr("RtcAudioOutputManagerImplV2", "selectDevice: attempt to set invalid communication device", e, new Object[0]);
        }
        return ((GX4) gxd).A04.setCommunicationDevice(audioDeviceInfo);
    }

    public static final /* synthetic */ boolean A0J(AudioDeviceInfo audioDeviceInfo, GXD gxd) {
        AudioManager audioManager;
        try {
            audioManager = ((GX4) gxd).A04;
        } catch (IllegalArgumentException e) {
            ((GX4) gxd).A09.AAr("RtcAudioOutputManagerImplV2", "selectDevice: attempt to set invalid communication device", e, new Object[0]);
        }
        if (audioManager.setCommunicationDevice(audioDeviceInfo)) {
            return true;
        }
        AudioDeviceInfo communicationDevice = audioManager.getCommunicationDevice();
        if (communicationDevice != null) {
            if (communicationDevice.getId() == audioDeviceInfo.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.GX4
    public final void A0T(HjW hjW) {
        C7384Etj.A0Y(hjW, 0);
        this.aomAudioModeState = hjW;
        A09(A0L(), false);
        EBX ebx = this.audioRecordMonitor;
        if (ebx.A04.A00 == null || hjW != HjW.A02) {
            return;
        }
        Handler handler = ebx.A03;
        Runnable runnable = ebx.A06;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 5000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    @Override // X.GX4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0c(X.GXX r11) {
        /*
            r10 = this;
            r4 = 0
            r7 = r11
            X.C7384Etj.A0Y(r11, r4)
            r8 = r10
            X.GXn r3 = r10.A09
            java.lang.String r0 = "changeAudio to "
            java.lang.String r1 = X.AnonymousClass007.A0a(r0, r11)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r6 = "RtcAudioOutputManagerImplV2"
            r3.A8D(r1, r0)
            X.GXX r0 = X.GXX.A02
            if (r11 != r0) goto L27
            X.GXS r0 = r10.A0B
            boolean r0 = r0.shouldSkipBluetoothScoForCall()
            if (r0 == 0) goto L27
            java.lang.String r0 = "changeAudio: Bluetooth communication routing disabled for call"
        L23:
            X.InterfaceC9648GXn.A00(r3, r0)
        L26:
            return r4
        L27:
            java.lang.String.valueOf(r11)
            java.util.concurrent.atomic.AtomicInteger r0 = r10.A0C
            int r10 = r0.incrementAndGet()
            X.GXX r0 = r8.aomCurrentAudioOutput
            r11 = 1
            boolean r2 = X.AnonymousClass002.A1Z(r0, r7)
            X.GY1 r0 = r8.A01
            if (r0 == 0) goto L40
            X.GXX r0 = r0.A00
            r1 = 1
            if (r7 == r0) goto L41
        L40:
            r1 = 0
        L41:
            int r0 = r8.A0L()
            r8.A09(r0, r4)
            java.lang.String r5 = ", skipping"
            X.GXX r0 = r8.aomCurrentAudioOutput
            if (r2 != 0) goto La6
            if (r0 == r7) goto Lbb
            if (r1 != 0) goto L5a
            X.GY1 r0 = r8.A01
            if (r0 == 0) goto L65
            X.GXX r0 = r0.A00
            if (r7 != r0) goto L65
        L5a:
            java.lang.String r0 = "changeAudio: already requesting to change to "
        L5c:
            java.lang.StringBuilder r0 = X.C3cG.A0f(r7, r0)
        L60:
            java.lang.String r0 = X.AnonymousClass001.A0v(r5, r0)
            goto L23
        L65:
            X.GXX r0 = X.GXX.A03
            if (r7 != r0) goto L72
            boolean r0 = r8.aomDisableEarpieceMode
            if (r0 != 0) goto L26
            boolean r0 = r8.aomForceSpeakerOverEarpiece
            if (r0 == 0) goto L72
            return r4
        L72:
            java.util.Set<android.media.AudioDeviceInfo> r0 = r8.A02
            java.util.Iterator r1 = r0.iterator()
        L78:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r6 = r1.next()
            r0 = r6
            android.media.AudioDeviceInfo r0 = (android.media.AudioDeviceInfo) r0
            X.GXX r0 = r8.A02(r0)
            if (r0 != r7) goto L78
            if (r6 == 0) goto L9d
            X.78T r0 = r8.A0D
            X.HzC r0 = X.Hxb.A02(r0)
            r9 = 0
            X.FtC r5 = new X.FtC
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.AnonymousClass001.A1J(r5, r0)
            return r11
        L9d:
            java.lang.String r0 = "changeAudio: no device matching route "
            java.lang.StringBuilder r0 = X.C3cG.A0f(r7, r0)
            java.lang.String r5 = " available"
            goto L60
        La6:
            if (r0 == r7) goto Lbb
            X.GXX r2 = r8.aomCurrentAudioOutput
            java.lang.String r0 = "changeAudio: skipped stale "
            java.lang.StringBuilder r1 = X.C3cG.A0f(r7, r0)
            java.lang.String r0 = " after setMode confirmed "
            java.lang.String r1 = X.AnonymousClass006.A0y(r2, r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r3.AiN(r6, r1, r0)
        Lbb:
            java.lang.String r0 = "changeAudio: already on "
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GXD.A0c(X.GXX):boolean");
    }

    private final void A08() {
        HoC hoC = this.A06;
        if (hoC != null && hoC.isActive()) {
            HoC hoC2 = this.A06;
            if (hoC2 != null) {
                hoC2.A5w(null);
            }
            this.A06 = null;
            return;
        }
        if (!this.A0B.enableClearCommunicationDeviceFixes()) {
            AnonymousClass001.A1J(new C8902FtJ(this, null, 13), Hxb.A02(this.A0D));
            return;
        }
        HoC hoC3 = this.A03;
        if (hoC3 != null && hoC3.isActive()) {
            super.A09.A8D("clearCommunicationDeviceJob is already active", BV4.A1W());
        } else {
            this.A03 = AnonymousClass001.A11(new C8902FtJ(this, null, 12), Hxb.A02(this.A0D));
        }
    }

    private final void A09(int i, boolean z) {
        GXU gxu = new GXU(this, i, z);
        ExecutorService executorServiceMo1795getSetAudioModeExecutor = this.A0B.mo1795getSetAudioModeExecutor();
        if (executorServiceMo1795getSetAudioModeExecutor == null) {
            gxu.run();
        } else {
            executorServiceMo1795getSetAudioModeExecutor.execute(gxu);
        }
    }

    public static final /* synthetic */ void A0C(GXD gxd) {
        InterfaceC9648GXn interfaceC9648GXn = ((GX4) gxd).A09;
        interfaceC9648GXn.A8D("Started clearCommunicationDevice", new Object[0]);
        ((GX4) gxd).A04.clearCommunicationDevice();
        InterfaceC9648GXn.A00(interfaceC9648GXn, "Finished clearCommunicationDevice");
    }

    @Override // X.GX4
    public final GXX A0Q() {
        return A02(this.A00);
    }

    @Override // X.GX4
    public final void A0U(boolean z) {
        super.A09.A8D("onHeadsetPlugged, isHeadsetAttached=%b", BV4.A1Z(z));
        this.aomIsHeadsetAttached = z;
    }

    @Override // X.GX4
    public final void A0V(boolean z) {
        boolean z2 = this.A07 ^ z;
        this.A07 = z;
        if (z2 && z && this.A0B.enableSetVideoCallFix()) {
            if (this.A04) {
                InterfaceC9648GXn.A00(super.A09, "turnOnVideoSpeakerphone: Video speakerphone is already turning on");
            }
            if (!this.A04 && !A0b() && !A0Z() && !this.aomIsHeadsetAttached) {
                GY1 gy1 = this.A01;
                if ((gy1 != null ? gy1.A00 : null) != GXX.A02) {
                    InterfaceC9648GXn.A00(super.A09, "turnOnVideoSpeakerphone: changeAudio to speakerphone");
                    this.A04 = A0c(GXX.A05);
                }
            }
            this.aomShouldSpeakerOnHeadsetUnplug = true;
        }
    }

    @Override // X.GX4
    public final void A0W(boolean z, boolean z2) {
        int i;
        if (z2) {
            A0P(false);
        }
        if (z && (i = this.aomSavedAudioMode) != -2) {
            A09(i, true);
        }
        super.A02 = null;
        GXQ gxq = super.A01;
        if (gxq != null) {
            gxq.A00(null);
        }
        BroadcastReceiver broadcastReceiver = super.A00;
        if (broadcastReceiver != null) {
            super.A03.unregisterReceiver(broadcastReceiver);
            super.A00 = null;
        }
    }

    @Override // X.GX4
    public final boolean A0Y() {
        if (!this.A0B.shouldSkipBluetoothScoForCall()) {
            GXX gxx = GXX.A02;
            Iterator<AudioDeviceInfo> it = this.A02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AudioDeviceInfo next = it.next();
                if (A02(next) == gxx) {
                    if (next == null) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.GX4
    public final boolean A0Z() {
        return AnonymousClass002.A1Z(A02(this.A00), GXX.A02);
    }

    @Override // X.GX4
    public final boolean A0a() {
        return AnonymousClass002.A1Z(A02(this.A00), GXX.A03);
    }

    @Override // X.GX4
    public final boolean A0b() {
        return AnonymousClass002.A1Z(A02(this.A00), GXX.A05);
    }

    public final void A0d() {
        InterfaceC9648GXn.A00(super.A09, AnonymousClass007.A0a("updateAudioOutput to ", this.aomCurrentAudioOutput));
        GXX gxx = this.aomCurrentAudioOutput;
        super.A02 = gxx;
        GXQ gxq = super.A01;
        if (gxq != null) {
            gxq.A00(gxx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GXX A02(AudioDeviceInfo audioDeviceInfo) {
        GXX gxxA00 = GX9.A00(audioDeviceInfo);
        return gxxA00 == null ? this.aomDisableEarpieceMode ? GXX.A05 : GXX.A03 : gxxA00;
    }

    public static final boolean A0G(AudioDeviceInfo audioDeviceInfo) {
        int type;
        return audioDeviceInfo.isSink() && ((type = audioDeviceInfo.getType()) == 1 || type == 2 || type == 3 || type == 4 || type == 7 || type == 22 || type == 23 || type == 26 || type == 27);
    }

    @Override // X.GX4
    public final void A0R() throws JSONException {
        super.A0R();
        this.A04 = false;
        this.A01 = null;
        this.A02 = new CopyOnWriteArraySet();
        try {
            super.A04.removeOnCommunicationDeviceChangedListener(this.A08);
        } catch (IllegalArgumentException unused) {
            super.A09.AiN("RtcAudioOutputManagerImplV2", "safeUnregisterDeviceChangedListener: tried to remove unregistered listener", new Object[0]);
        }
        super.A04.unregisterAudioDeviceCallback(this.A09);
        A08();
    }

    @Override // X.GX4
    public final void A0S() {
        super.A0S();
        this.A04 = false;
        this.A01 = null;
        A08();
    }

    @Override // X.GX4
    public final void A0X(boolean z, boolean z2) throws JSONException {
        HoC hoC;
        super.A0X(z, z2);
        if (this.A0B.enableClearCommunicationDeviceFixes() && (hoC = this.A03) != null && hoC.isActive()) {
            super.A09.A8D("Cancelling clearCommunicationDevice", BV4.A1W());
            HoC hoC2 = this.A03;
            if (hoC2 != null) {
                hoC2.A5w(null);
            }
            this.A03 = null;
        }
        AudioManager audioManager = super.A04;
        List<AudioDeviceInfo> availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
        C7384Etj.A0U(availableCommunicationDevices);
        for (AudioDeviceInfo audioDeviceInfo : availableCommunicationDevices) {
            C7384Etj.A0X(audioDeviceInfo);
            if (A0G(audioDeviceInfo)) {
                this.A02.add(audioDeviceInfo);
            }
        }
        String strA0L = AbstractC0878AGe.A0L(", ", "", "", this.A02, FZS.A02(this, 43));
        InterfaceC9648GXn interfaceC9648GXn = super.A09;
        interfaceC9648GXn.A8D(FGI.A0M("Initial available audio devices: ", strA0L), new Object[0]);
        try {
            audioManager.addOnCommunicationDeviceChangedListener(GXz.A00, this.A08);
        } catch (IllegalArgumentException unused) {
            interfaceC9648GXn.AiN("RtcAudioOutputManagerImplV2", "safeRegisterDeviceChangedListener: tried to add listener twice", BV4.A1W());
        }
        audioManager.registerAudioDeviceCallback(this.A09, this.A0A);
        if ((this.aomDisableEarpieceMode || z2) && !this.aomIsHeadsetAttached) {
            A0c(GXX.A05);
        }
        AudioDeviceInfo communicationDevice = audioManager.getCommunicationDevice();
        this.A00 = communicationDevice;
        this.aomCurrentAudioOutput = A02(communicationDevice);
        A0d();
        A0O();
        A0N();
        A0M();
    }
}
