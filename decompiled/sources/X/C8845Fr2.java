package X;

import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.util.Collections;
import java.util.Set;

@Deprecated
/* renamed from: X.Fr2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8845Fr2 {
    public final InterfaceC8863Frb A00;
    public final MediaSessionCompat$Token A01;
    public final Set A02;

    public C8845Fr2(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (mediaSessionCompat$Token == null) {
            throw C60O.A0i("sessionToken must not be null");
        }
        this.A02 = Collections.synchronizedSet(C60O.A13());
        this.A01 = mediaSessionCompat$Token;
        this.A00 = new C8848Fr7(context, mediaSessionCompat$Token);
    }
}
