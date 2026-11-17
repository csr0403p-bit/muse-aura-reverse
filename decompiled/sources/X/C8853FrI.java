package X;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21$ExtraSession;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;

/* renamed from: X.FrI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8853FrI implements InterfaceC8858FrW {
    public MediaMetadataCompat A00;
    public AbstractC8851FrC A01;
    public PlaybackStateCompat A02;
    public C8856FrQ A03;
    public final MediaSession A04;
    public final MediaSessionCompat$MediaSessionImplApi21$ExtraSession A06;
    public final MediaSessionCompat$Token A07;
    public final Object A08 = C3cG.A0T();
    public final RemoteCallbackList<IMediaControllerCallback> A05 = new RemoteCallbackList<>();

    public C8853FrI(Context context) {
        MediaSession mediaSession = new MediaSession(context, "HatchAudioPlayer", null);
        this.A04 = mediaSession;
        MediaSessionCompat$MediaSessionImplApi21$ExtraSession mediaSessionCompat$MediaSessionImplApi21$ExtraSession = new MediaSessionCompat$MediaSessionImplApi21$ExtraSession(this);
        this.A06 = mediaSessionCompat$MediaSessionImplApi21$ExtraSession;
        this.A07 = new MediaSessionCompat$Token(mediaSessionCompat$MediaSessionImplApi21$ExtraSession, mediaSession.getSessionToken());
        this.A04.setFlags(3);
    }

    @Override // X.InterfaceC8858FrW
    public final void AdD(C8856FrQ c8856FrQ) {
        if (this instanceof C8857FrU) {
            return;
        }
        synchronized (this.A08) {
            this.A03 = c8856FrQ;
        }
    }
}
