package android.support.v4.media.session;

import X.BV4;
import X.C60O;
import X.C8849Fr9;
import X.C8865Frd;
import X.E1K;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public WeakReference<C8849Fr9> A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.support.v4.media.session.IMediaSession] */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        IMediaSession$Stub$Proxy iMediaSession$Stub$Proxy;
        E1K e1k;
        IMediaSession iMediaSession;
        C8849Fr9 c8849Fr9 = this.A00.get();
        if (c8849Fr9 == null || bundle == null) {
            return;
        }
        synchronized (c8849Fr9.A03) {
            MediaSessionCompat$Token mediaSessionCompat$Token = c8849Fr9.A02;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            if (binder == null) {
                iMediaSession$Stub$Proxy = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMediaSession)) {
                    IMediaSession$Stub$Proxy iMediaSession$Stub$Proxy2 = new IMediaSession$Stub$Proxy();
                    iMediaSession$Stub$Proxy2.A00 = binder;
                    iMediaSession$Stub$Proxy = iMediaSession$Stub$Proxy2;
                } else {
                    iMediaSession$Stub$Proxy = (IMediaSession) iInterfaceQueryLocalInterface;
                }
            }
            Object obj = mediaSessionCompat$Token.A03;
            synchronized (obj) {
                try {
                    mediaSessionCompat$Token.A00 = iMediaSession$Stub$Proxy;
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 == null) {
                    e1k = null;
                } else {
                    bundle2.setClassLoader(C8865Frd.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable("a");
                    if (!(parcelable instanceof ParcelImpl)) {
                        throw C60O.A0i("Invalid parcel");
                    }
                    e1k = ((ParcelImpl) parcelable).A00;
                }
            } catch (RuntimeException unused) {
                e1k = null;
            }
            synchronized (obj) {
                try {
                    mediaSessionCompat$Token.A01 = e1k;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            synchronized (obj) {
                try {
                    iMediaSession = mediaSessionCompat$Token.A00;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (iMediaSession != null) {
                List list = c8849Fr9.A04;
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next();
                    c8849Fr9.A00.put(null, new MediaControllerCompat$MediaControllerImplApi21$ExtraCallback());
                    throw BV4.A0a("mIControllerCallback");
                }
                list.clear();
            }
        }
    }
}
