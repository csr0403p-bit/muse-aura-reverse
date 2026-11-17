package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.telephony.PhoneStateListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes6.dex */
public final class GXE extends GX4 {
    public PhoneStateListener A00;
    public Integer A01;
    public Future<?> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Handler A06;
    public final GXK A07;
    public final GXS A08;
    public final F0C A09;
    public final C78T A0A;
    public volatile boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GXE(Context context, AudioManager audioManager, GY2 gy2, GXK gxk, GXS gxs, InterfaceC9648GXn interfaceC9648GXn, GXH gxh, ExecutorService executorService, C78T c78t) {
        super(context, audioManager, gy2, gxs, interfaceC9648GXn, gxh, executorService);
        C7384Etj.A0Y(audioManager, 2);
        this.A07 = gxk;
        this.A08 = gxs;
        this.A0A = c78t;
        this.A06 = C60O.A02();
        this.A09 = AbstractC5321DgF.A02(C79.A0C, new EQf(context, 8));
    }

    public static final void A00(GXE gxe, int i, boolean z) {
        GXV gxv = new GXV(gxe, i, z);
        ExecutorService executorServiceMo1795getSetAudioModeExecutor = gxe.A08.mo1795getSetAudioModeExecutor();
        if (executorServiceMo1795getSetAudioModeExecutor == null) {
            gxv.run();
        } else {
            executorServiceMo1795getSetAudioModeExecutor.execute(gxv);
        }
    }

    public final void A0d() {
        GXX gxx;
        GXX gxx2 = this.aomCurrentAudioOutput;
        GXS gxs = this.A08;
        if (gxs.shouldUseCustomAudioModule()) {
            super.A09.AiN("RtcAudioOutputManager", "WARP Audio enabled, defaulting to earpiece", new Object[0]);
            gxx = GXX.A03;
        } else {
            gxx = this.A07.A03() ? GXX.A02 : this.A0B ? GXX.A05 : this.aomIsHeadsetAttached ? GXX.A04 : GXX.A03;
        }
        this.aomCurrentAudioOutput = gxx;
        if (gxx2 != this.aomCurrentAudioOutput) {
            InterfaceC9648GXn.A00(super.A09, AnonymousClass006.A0y(this.aomCurrentAudioOutput, " to ", C3cG.A0f(gxx2, "determineAndSetCurrentAudioOutput from ")));
            if (gxs.invokeChangeAudioOnAudioOutputUpdate()) {
                A0c(this.aomCurrentAudioOutput);
            }
            A0M();
        }
        EBX.A02(this.audioRecordMonitor, null);
        GXX gxx3 = this.aomCurrentAudioOutput;
        super.A02 = gxx3;
        GXQ gxq = super.A01;
        if (gxq != null) {
            gxq.A00(gxx3);
        }
    }

    @Override // X.GX4
    public final void A0S() {
        super.A0S();
        this.A0B = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    @Override // X.GX4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0X(boolean r8, boolean r9) throws org.json.JSONException {
        /*
            r7 = this;
            super.A0X(r8, r9)
            X.GXS r0 = r7.A08
            boolean r0 = r0.shouldSkipBluetoothScoForCall()
            if (r0 == 0) goto L1b
            X.GXn r2 = r7.A09
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "setupBluetooth: Bluetooth SCO disabled for this call"
            r2.A8D(r0, r1)
        L15:
            X.GXH r3 = r7.A0A
            android.content.Context r4 = r7.A03
            monitor-enter(r3)
            goto L6d
        L1b:
            android.content.Context r6 = r7.A03
            r5 = 0
            int r4 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            boolean r1 = X.C8j4.A1V(r4, r3)
            r0 = 49
            java.lang.String r2 = X.BV3.A00(r0)
            if (r1 == 0) goto L35
            int r1 = X.AbstractC4103Cmd.A02(r6, r2)
            r0 = -1
            if (r1 == r0) goto L3e
        L35:
            if (r4 <= r3) goto L4f
            int r1 = r6.checkSelfPermission(r2)
            r0 = -1
            if (r1 != r0) goto L4f
        L3e:
            X.GXK r2 = r7.A07
            X.GY0 r0 = new X.GY0
            r0.<init>(r7)
            r2.A01 = r0
            X.GXF r1 = r2.A05
            X.GXT r0 = r2.A04
            r1.A03(r0)
            goto L15
        L4f:
            boolean r0 = r7.A03
            if (r0 == 0) goto L5f
            X.GXn r3 = r7.A09
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r1 = "RtcAudioOutputManager"
            java.lang.String r0 = "Missed unregistering PhoneStateListener."
            r3.AAq(r1, r0, r2)
            goto L3e
        L5f:
            r0 = 1
            r7.A03 = r0
            X.GXa r1 = new X.GXa
            r1.<init>(r7)
            android.os.Handler r0 = r7.A06
            r0.post(r1)
            goto L3e
        L6d:
            boolean r0 = r3.A01     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto L91
            android.media.AudioManager r0 = r3.A04     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> Lb4
            boolean r0 = r0.isSpeakerphoneOn()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> Lb4
            r3.A02 = r0     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> Lb4
            goto L82
        L7a:
            r2 = move-exception
            java.lang.String r1 = "FbAudioManager"
            java.lang.String r0 = "audioManager.isSpeakerphoneOn failed with exception"
            X.CFK.A08(r1, r0, r2)     // Catch: java.lang.Throwable -> Lb4
        L82:
            android.content.BroadcastReceiver r2 = r3.A03     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = "android.media.action.SPEAKERPHONE_STATE_CHANGED"
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb4
            r4.registerReceiver(r2, r0)     // Catch: java.lang.Throwable -> Lb4
            r0 = 1
            r3.A01 = r0     // Catch: java.lang.Throwable -> Lb4
        L91:
            monitor-exit(r3)
            boolean r0 = r7.aomDisableEarpieceMode
            if (r0 != 0) goto L9a
            boolean r0 = r7.aomForceSpeakerOverEarpiece
            if (r0 == 0) goto L9f
        L9a:
            boolean r1 = r7.aomIsHeadsetAttached
            r0 = 1
            if (r1 == 0) goto La0
        L9f:
            r0 = 0
        La0:
            r7.A0B = r0
            boolean r0 = r7.A0B
            r3.A00(r0)
            r7.A0d()
            r7.A0O()
            r7.A0N()
            r7.A0M()
            return
        Lb4:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GXE.A0X(boolean, boolean):void");
    }
}
