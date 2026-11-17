package X;

import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioDeviceApi;
import com.facebook.rsys.audio.gen.AudioDeviceModule;
import com.facebook.rsys.audio.gen.AudioInputRoute;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class GXO extends GVw {
    public AudioApi A00;
    public AudioDeviceApi A01;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public AudioDeviceModule A06;
    public Executor A07;
    public HxE<Boolean, Boolean> A08;
    public HxE<? extends AudioOutputRoute, Boolean> A09;
    public boolean A0A;
    public final GX5 A0B;
    public final InterfaceC9648GXn A0C;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public volatile AudioOutputRoute A0L;
    public final Object A0K = C3cG.A0T();
    public final Collection<Runnable> A0D = Collections.synchronizedCollection(C3cG.A0h());
    public String A02 = AudioOutputRoute.UNKNOWN.identifier;

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setApi(AudioApi audioApi) {
        C7384Etj.A0Y(audioApi, 0);
        this.A00 = audioApi;
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
        C7384Etj.A0Y(audioDeviceModule, 0);
        synchronized (this.A0K) {
            this.A06 = audioDeviceModule;
        }
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setAudioOutputRouteAndVideoEnabled(AudioOutputRoute audioOutputRoute, boolean z) {
        C7384Etj.A0Y(audioOutputRoute, 0);
        if (this.A0F) {
            return;
        }
        if (this.A0A) {
            this.A09 = AnonymousClass002.A0q(audioOutputRoute, z);
            return;
        }
        GXN gxn = new GXN(audioOutputRoute, this, z);
        Executor executor = this.A07;
        if (executor == null) {
            gxn.run();
        } else {
            executor.execute(gxn);
        }
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setDeviceApi(AudioDeviceApi audioDeviceApi) {
        C7384Etj.A0Y(audioDeviceApi, 0);
        this.A01 = audioDeviceApi;
        Collection<Runnable> collection = this.A0D;
        C7384Etj.A0T(collection);
        synchronized (collection) {
            Iterator<Runnable> it = collection.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            collection.clear();
        }
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final AudioInputRoute createInitialAudioInputRoute() {
        return AudioInputRoute.DEFAULT;
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final AudioOutputRoute createInitialAudioOutputRoute() {
        return AudioOutputRoute.UNKNOWN;
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setAudioInputRoute(AudioInputRoute audioInputRoute) {
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setAudioOn(boolean z, boolean z2) {
        if (this.A0A) {
            this.A08 = AnonymousClass002.A0q(Boolean.valueOf(z), z2);
            return;
        }
        GXY gxy = new GXY(this, z);
        Executor executor = this.A07;
        if (executor == null) {
            gxy.run();
        } else {
            executor.execute(gxy);
        }
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setIsCallActive(boolean z) {
        RunnableC9642GXd runnableC9642GXd = new RunnableC9642GXd(this, z);
        Executor executor = this.A07;
        if (executor == null) {
            runnableC9642GXd.run();
        } else {
            executor.execute(runnableC9642GXd);
        }
    }

    public GXO(GX5 gx5, GXS gxs, InterfaceC9648GXn interfaceC9648GXn, Executor executor, boolean z, boolean z2, boolean z3) {
        this.A07 = executor;
        this.A0G = z;
        this.A0H = gxs.preventAudioProxyRouteOverwrites();
        this.A0I = gxs.preventAudioProxyOverwriteToSpeakerPhoneWhenBTisAvailable();
        this.A0E = gxs.allowBluetoothOverrideSpeakerPreference();
        this.A0C = interfaceC9648GXn;
        this.A0B = gx5;
        GXQ gxq = new GXQ(this);
        GX4 gx4 = gx5.A01;
        gx4.A01 = gxq;
        GXX gxx = gx4.A02;
        if (gxx != null) {
            gxq.A00(gxx);
        }
        this.A0J = gxs.setupAndTeardownAudioManagerExternally();
        this.A0A = z2;
        this.A0F = z3;
    }
}
