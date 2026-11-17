package X;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Fr9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8849Fr9 implements InterfaceC8863Frb {
    public final MediaController A01;
    public final MediaSessionCompat$Token A02;
    public final Object A03 = C3cG.A0T();
    public final List A04 = C3cG.A0h();
    public HashMap A00 = BV4.A0u();

    public C8849Fr9(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        IMediaSession iMediaSession;
        this.A02 = mediaSessionCompat$Token;
        this.A01 = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.A02);
        synchronized (mediaSessionCompat$Token.A03) {
            iMediaSession = mediaSessionCompat$Token.A00;
        }
        if (iMediaSession == null) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(null);
            mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.A00 = BV4.A0q(this);
            this.A01.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        }
    }
}
