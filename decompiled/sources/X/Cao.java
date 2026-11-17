package X;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelClient$Channel;
import com.google.android.gms.wearable.zzag;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class Cao extends Service implements InterfaceC3987Ciw {
    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    public ComponentName zza;
    public HandlerC3636Cam zzb;
    public IBinder zzc;
    public Intent zzd;
    public Looper zze;
    public boolean zzg;
    public final Object zzf = C3cG.A0T();
    public final C3638Cap zzh = new C3638Cap(new C3639Cas(this));

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.IBinder onBind(android.content.Intent r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 == 0) goto L28
            java.lang.String r1 = r6.getAction()
            if (r1 == 0) goto L28
            int r0 = r1.hashCode()
            switch(r0) {
                case -1487371046: goto L3b;
                case -1140095138: goto L38;
                case -786751258: goto L35;
                case 705066793: goto L32;
                case 915816236: goto L2f;
                case 1003809169: goto L2c;
                case 1460975593: goto L29;
                default: goto L10;
            }
        L10:
            r0 = 3
            java.lang.String r3 = "WearableLS"
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L28
            java.lang.String r2 = r6.toString()
            java.lang.String r1 = "onBind: Provided bind intent ("
            java.lang.String r0 = ") is not allowed"
            java.lang.String r0 = X.FGI.A0U(r1, r2, r0)
            android.util.Log.d(r3, r0)
        L28:
            return r4
        L29:
            java.lang.String r0 = "com.google.android.gms.wearable.BIND_LISTENER"
            goto L3d
        L2c:
            java.lang.String r0 = "com.google.android.gms.wearable.CHANNEL_EVENT"
            goto L3d
        L2f:
            java.lang.String r0 = "com.google.android.gms.wearable.DATA_CHANGED"
            goto L3d
        L32:
            java.lang.String r0 = "com.google.android.gms.wearable.NODE_MIGRATED"
            goto L3d
        L35:
            java.lang.String r0 = "com.google.android.gms.wearable.MESSAGE_RECEIVED"
            goto L3d
        L38:
            java.lang.String r0 = "com.google.android.gms.wearable.REQUEST_RECEIVED"
            goto L3d
        L3b:
            java.lang.String r0 = "com.google.android.gms.wearable.CAPABILITY_CHANGED"
        L3d:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L10
            android.os.IBinder r4 = r5.zzc
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cao.onBind(android.content.Intent):android.os.IBinder");
    }

    public abstract CSA<byte[]> onRequest(String str, String str2, byte[] bArr);

    public Looper getLooper() {
        Looper looper = this.zze;
        if (looper != null) {
            return looper;
        }
        Looper looperA0D = BV5.A0D("WearableListenerService");
        this.zze = looperA0D;
        return looperA0D;
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (BV4.A1U("WearableLS")) {
            Log.d("WearableLS", "onDestroy: ".concat(BV7.A0w(this.zza)));
        }
        synchronized (this.zzf) {
            this.zzg = true;
            HandlerC3636Cam handlerC3636Cam = this.zzb;
            if (handlerC3636Cam == null) {
                throw BV5.A0U("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=", String.valueOf(this.zza));
            }
            handlerC3636Cam.getLooper().quit();
            HandlerC3636Cam.A00(handlerC3636Cam, "quit");
        }
        super.onDestroy();
    }

    public void onCapabilityChanged(InterfaceC4097CmR interfaceC4097CmR) {
    }

    @Override // X.InterfaceC3987Ciw
    public void onChannelOpened(Channel channel) {
    }

    public void onConnectedNodes(List<InterfaceC3641Caw> list) {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.zza = new ComponentName(this, C60Q.A0e(this));
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: ".concat(BV7.A0w(this.zza)));
        }
        this.zzb = new HandlerC3636Cam(getLooper(), this);
        Intent intentA03 = C60P.A03(BIND_LISTENER_INTENT_ACTION);
        this.zzd = intentA03;
        intentA03.setComponent(this.zza);
        this.zzc = new zzag(this);
    }

    public void onDataChanged(AbstractC4117CnA abstractC4117CnA) {
    }

    public void onEntityUpdate(Cau cau) {
    }

    public void onMessageReceived(Cax cax) {
    }

    public void onNotificationReceived(InterfaceC3640Cav interfaceC3640Cav) {
    }

    public void onPeerConnected(InterfaceC3641Caw interfaceC3641Caw) {
    }

    public void onPeerDisconnected(InterfaceC3641Caw interfaceC3641Caw) {
    }

    public void onNodeMigrated(String str, AbstractC4115Cn7 abstractC4115Cn7) {
    }

    @Override // X.InterfaceC3987Ciw
    public void onChannelClosed(Channel channel, int i, int i2) {
    }

    @Override // X.InterfaceC3987Ciw
    public void onInputClosed(Channel channel, int i, int i2) {
    }

    @Override // X.InterfaceC3987Ciw
    public void onOutputClosed(Channel channel, int i, int i2) {
    }

    public void onChannelOpened(ChannelClient$Channel channelClient$Channel) {
    }

    public void onChannelClosed(ChannelClient$Channel channelClient$Channel, int i, int i2) {
    }

    public void onInputClosed(ChannelClient$Channel channelClient$Channel, int i, int i2) {
    }

    public void onOutputClosed(ChannelClient$Channel channelClient$Channel, int i, int i2) {
    }
}
