package android.support.v4.media.session;

import X.BV4;
import android.support.v4.media.session.IMediaControllerCallback;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback extends IMediaControllerCallback.Stub {
    public final WeakReference A00 = BV4.A0q(null);

    @Override // android.support.v4.media.session.IMediaControllerCallback
    public final void AUh(PlaybackStateCompat playbackStateCompat) {
        this.A00.get();
    }
}
