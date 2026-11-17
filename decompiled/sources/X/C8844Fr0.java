package X;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.IMediaSession$Stub$Proxy;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import android.view.KeyEvent;

/* renamed from: X.Fr0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8844Fr0 extends MediaBrowser.ConnectionCallback {
    public final /* synthetic */ C8843Fqz A00;

    public C8844Fr0(C8843Fqz c8843Fqz) {
        this.A00 = c8843Fqz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.support.v4.media.session.IMediaSession] */
    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() throws RemoteException {
        IMediaSession$Stub$Proxy iMediaSession$Stub$Proxy;
        C8843Fqz c8843Fqz = this.A00;
        InterfaceC8862Fra interfaceC8862Fra = c8843Fqz.A00;
        if (interfaceC8862Fra != null) {
            AbstractC8842Fqy abstractC8842Fqy = (AbstractC8842Fqy) interfaceC8862Fra;
            try {
                MediaBrowser mediaBrowser = abstractC8842Fqy.A04;
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        Bundle bundle = abstractC8842Fqy.A05;
                        C8847Fr4 c8847Fr4 = new C8847Fr4();
                        c8847Fr4.A01 = new Messenger(binder);
                        c8847Fr4.A00 = bundle;
                        abstractC8842Fqy.A01 = c8847Fr4;
                        HandlerC8656FiG handlerC8656FiG = abstractC8842Fqy.A06;
                        Messenger messenger = new Messenger(handlerC8656FiG);
                        abstractC8842Fqy.A00 = messenger;
                        handlerC8656FiG.A00 = BV4.A0q(messenger);
                        try {
                            C8847Fr4 c8847Fr42 = abstractC8842Fqy.A01;
                            Context context = abstractC8842Fqy.A03;
                            Messenger messenger2 = abstractC8842Fqy.A00;
                            Bundle bundleA0N = BV6.A0N();
                            bundleA0N.putString("data_package_name", context.getPackageName());
                            bundleA0N.putInt("data_calling_pid", Process.myPid());
                            bundleA0N.putBundle("data_root_hints", c8847Fr42.A00);
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 6;
                            messageObtain.arg1 = 1;
                            messageObtain.setData(bundleA0N);
                            messageObtain.replyTo = messenger2;
                            c8847Fr42.A01.send(messageObtain);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    if (binder2 != null) {
                        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMediaSession)) {
                            IMediaSession$Stub$Proxy iMediaSession$Stub$Proxy2 = new IMediaSession$Stub$Proxy();
                            iMediaSession$Stub$Proxy2.A00 = binder2;
                            iMediaSession$Stub$Proxy = iMediaSession$Stub$Proxy2;
                        } else {
                            ?? r2 = (IMediaSession) iInterfaceQueryLocalInterface;
                            iMediaSession$Stub$Proxy = r2;
                            if (r2 != 0) {
                            }
                        }
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        abstractC8842Fqy.A02 = sessionToken != null ? new MediaSessionCompat$Token(iMediaSession$Stub$Proxy, sessionToken) : null;
                    }
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }
        Context context2 = c8843Fqz.A02;
        AbstractC8842Fqy abstractC8842Fqy2 = (AbstractC8842Fqy) c8843Fqz.A01.A00;
        MediaSessionCompat$Token mediaSessionCompat$Token = abstractC8842Fqy2.A02;
        if (mediaSessionCompat$Token == null) {
            MediaSession.Token sessionToken2 = abstractC8842Fqy2.A04.getSessionToken();
            mediaSessionCompat$Token = sessionToken2 != null ? new MediaSessionCompat$Token(null, sessionToken2) : null;
            abstractC8842Fqy2.A02 = mediaSessionCompat$Token;
        }
        C8845Fr2 c8845Fr2 = new C8845Fr2(context2, mediaSessionCompat$Token);
        KeyEvent keyEvent = (KeyEvent) c8843Fqz.A03.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            throw C60O.A0i("KeyEvent may not be null");
        }
        ((C8849Fr9) c8845Fr2.A00).A01.dispatchMediaButtonEvent(keyEvent);
        C8843Fqz.A00(c8843Fqz);
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() throws RemoteException {
        C8843Fqz.A00(this.A00);
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() throws RemoteException {
        C8843Fqz c8843Fqz = this.A00;
        InterfaceC8862Fra interfaceC8862Fra = c8843Fqz.A00;
        if (interfaceC8862Fra != null) {
            AbstractC8842Fqy abstractC8842Fqy = (AbstractC8842Fqy) interfaceC8862Fra;
            abstractC8842Fqy.A01 = null;
            abstractC8842Fqy.A00 = null;
            abstractC8842Fqy.A02 = null;
            abstractC8842Fqy.A06.A00 = BV4.A0q(null);
        }
        C8843Fqz.A00(c8843Fqz);
    }
}
