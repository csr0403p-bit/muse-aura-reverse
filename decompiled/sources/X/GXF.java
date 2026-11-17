package X;

import X.BV5;
import X.C7384Etj;
import X.F60;
import X.FGI;
import X.GXF;
import X.GXK;
import X.GXT;
import X.GY0;
import X.InterfaceC9648GXn;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import com.sun.jna.Callback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class GXF {
    public int A00;
    public BluetoothHeadset A01;
    public BroadcastReceiver A02;
    public AudioDeviceCallback A03;
    public boolean A04;
    public BluetoothAdapter A05;
    public final Context A06;
    public final GXS A07;
    public final GXH A08;
    public final BluetoothProfile.ServiceListener A09;
    public final BroadcastReceiver A0A;
    public final AudioManager A0B;
    public final C10538Hql A0C;
    public final InterfaceC9648GXn A0D;
    public final C78T A0E;
    public final C3UX A0F;
    public volatile GXT A0G;

    public GXF(Context context, AudioManager audioManager, GXS gxs, InterfaceC9648GXn interfaceC9648GXn, C78T c78t) {
        C7384Etj.A0Y(audioManager, 1);
        this.A06 = context;
        this.A07 = gxs;
        this.A0E = c78t;
        this.A09 = new GXP(this, interfaceC9648GXn);
        this.A0A = new BroadcastReceiver() { // from class: com.facebook.rtc.audiolite.DefaultBluetoothManager$bluetoothScoReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                C7384Etj.A0Y(intent, 1);
                if (BV5.A1Q(intent, "android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                    GXF gxf = this.A00;
                    int i = gxf.A00;
                    gxf.A00 = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                    GXT gxt = gxf.A0G;
                    if (gxt != null) {
                        int i2 = gxf.A00;
                        GXK gxk = gxt.A00;
                        InterfaceC9648GXn.A00(gxk.A07, FGI.A0T("onScoAudioStateChanged: ", " --> ", i, i2));
                        if (i2 != -1) {
                            if (i2 == 0) {
                                gxk.A03.removeMessages(3);
                                if (i == 1 || i == 2) {
                                    GXK.A02(gxk, false);
                                }
                                GXK.A00(gxk);
                            } else if (i2 == 1) {
                                Handler handler = gxk.A03;
                                handler.removeMessages(2);
                                if (gxk.A05.A07.fallBackWhenBluetoothUnusable()) {
                                    handler.sendEmptyMessageDelayed(3, 5000L);
                                }
                            }
                        }
                        GY0 gy0 = gxk.A01;
                        if (gy0 == null) {
                            C7384Etj.A0b(Callback.METHOD_NAME);
                            throw F60.createAndThrow();
                        }
                        gy0.A00.A0d();
                    }
                }
            }
        };
        this.A0B = audioManager;
        this.A0D = interfaceC9648GXn;
        this.A0C = new C10538Hql(null);
        this.A0F = Hxb.A02(c78t);
        this.A08 = new GXH(audioManager);
    }

    public final void A02() {
        BluetoothAdapter bluetoothAdapter;
        A04(false);
        BroadcastReceiver broadcastReceiver = this.A02;
        if (broadcastReceiver != null) {
            try {
                this.A06.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
        }
        try {
            this.A06.unregisterReceiver(this.A0A);
        } catch (IllegalArgumentException unused2) {
        }
        BluetoothHeadset bluetoothHeadset = this.A01;
        if (bluetoothHeadset != null && (bluetoothAdapter = this.A05) != null) {
            bluetoothAdapter.closeProfileProxy(1, bluetoothHeadset);
        }
        GXH gxh = this.A08;
        AudioDeviceCallback audioDeviceCallback = gxh.A00;
        if (audioDeviceCallback != null) {
            this.A0B.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
        AudioDeviceCallback audioDeviceCallback2 = this.A03;
        if (audioDeviceCallback2 != null) {
            this.A0B.unregisterAudioDeviceCallback(audioDeviceCallback2);
        }
        gxh.A00 = null;
        this.A03 = null;
        this.A05 = null;
    }

    public final void A03(GXT gxt) {
        C7384Etj.A0Y(gxt, 0);
        A02();
        this.A0G = gxt;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.A05 = defaultAdapter;
        if (defaultAdapter != null) {
            Context context = this.A06;
            defaultAdapter.getProfileProxy(context, this.A09, 1);
            if (Build.VERSION.SDK_INT < 31) {
                BroadcastReceiver broadcastReceiver = this.A02;
                if (broadcastReceiver == null) {
                    broadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.rtc.audiolite.DefaultBluetoothManager$initBluetoothConnectionReciever$1
                        @Override // android.content.BroadcastReceiver
                        public final void onReceive(Context context2, Intent intent) {
                            int intExtra;
                            GXT gxt2;
                            C7384Etj.A0Y(intent, 1);
                            if (!BV5.A1Q(intent, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") || (intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0)) == intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", 0) || (gxt2 = this.A00.A0G) == null) {
                                return;
                            }
                            gxt2.A00(intExtra);
                        }
                    };
                    this.A02 = broadcastReceiver;
                }
                context.registerReceiver(broadcastReceiver, new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"));
            } else {
                GXH gxh = this.A08;
                AudioManager audioManager = this.A0B;
                C7384Etj.A0Y(audioManager, 0);
                if (gxh.A00 == null) {
                    C9647GXm c9647GXm = new C9647GXm(gxh);
                    gxh.A00 = c9647GXm;
                    audioManager.registerAudioDeviceCallback(c9647GXm, C60O.A02());
                }
                if (this.A03 == null) {
                    C9644GXf c9644GXf = new C9644GXf(this);
                    this.A03 = c9644GXf;
                    audioManager.registerAudioDeviceCallback(c9644GXf, C60O.A02());
                }
            }
            Intent intentRegisterReceiver = context.registerReceiver(this.A0A, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
            if (intentRegisterReceiver != null) {
                this.A00 = intentRegisterReceiver.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            }
        }
    }

    public static final void A00(GXF gxf, boolean z) {
        AudioManager audioManager = gxf.A0B;
        if (!z) {
            audioManager.setBluetoothScoOn(false);
            audioManager.stopBluetoothSco();
            return;
        }
        try {
            audioManager.startBluetoothSco();
            audioManager.setBluetoothScoOn(true);
        } catch (NullPointerException e) {
            gxf.A0D.AAr("DefaultBluetoothManager", "AudioManager#startBluetoothSco failed", e, new Object[0]);
            gxf.A04 = false;
        }
    }

    public static final boolean A01(GXF gxf) {
        List<AudioDeviceInfo> listAsList;
        AbstractC3136BzG.A00("DefaultBluetoothManager.isBluetoothEnabledViaAudioManager");
        try {
            AbstractC3136BzG.A00("DefaultBluetoothManager.isBluetoothEnabledViaAudioManager.getDevices");
            if (C3cH.A1K() && gxf.A07.enableAsyncDevices()) {
                listAsList = gxf.A08.A07;
            } else {
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                AudioDeviceInfo[] devices = gxf.A0B.getDevices(2);
                C7384Etj.A0U(devices);
                listAsList = Arrays.asList(devices);
                GXH gxh = gxf.A08;
                synchronized (gxh.A05) {
                    if (jElapsedRealtimeNanos > gxh.A06) {
                        ArrayList arrayListA0h = C3cG.A0h();
                        for (AudioDeviceInfo audioDeviceInfo : listAsList) {
                            if (audioDeviceInfo.isSink()) {
                                arrayListA0h.add(audioDeviceInfo);
                            }
                        }
                        gxh.A07 = arrayListA0h;
                        gxh.A06 = jElapsedRealtimeNanos;
                    }
                }
            }
            Trace.endSection();
            for (AudioDeviceInfo audioDeviceInfo2 : listAsList) {
                if (audioDeviceInfo2.getType() == 7 || audioDeviceInfo2.getType() == 8) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    public final void A04(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            if (!this.A07.enableAsyncBluetoothToggle()) {
                A00(this, z);
            } else {
                AnonymousClass001.A1J(new C8900FtH(this, null, 2, z), this.A0F);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05() {
        /*
            r5 = this;
            android.bluetooth.BluetoothAdapter r1 = r5.A05
            android.bluetooth.BluetoothHeadset r4 = r5.A01
            X.GXS r0 = r5.A07
            boolean r0 = r0.rtcBluetoothCheckEnabled()
            r3 = 0
            if (r0 != 0) goto L1f
            if (r1 == 0) goto L45
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L45
            X.GXH r0 = r5.A08
            android.media.AudioManager r0 = r0.A04     // Catch: java.lang.Exception -> L3d
            boolean r0 = r0.isBluetoothScoAvailableOffCall()     // Catch: java.lang.Exception -> L3d
            if (r0 == 0) goto L45
        L1f:
            if (r4 == 0) goto L45
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            r1 = 1
            if (r2 <= r0) goto L2f
            boolean r0 = A01(r5)
            if (r0 == 0) goto L45
            return r1
        L2f:
            java.util.List r0 = r4.getConnectedDevices()
            X.C7384Etj.A0U(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L45
            return r1
        L3d:
            r2 = move-exception
            java.lang.String r1 = "audioManager.isBluetoothScoAvailableOffCall failed with exception"
            java.lang.String r0 = "FbAudioManager"
            X.CFK.A08(r0, r1, r2)
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GXF.A05():boolean");
    }
}
