package X;

import android.media.session.MediaSessionManager;

/* renamed from: X.FrX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8859FrX extends AbstractC8860FrY {
    public final MediaSessionManager.RemoteUserInfo A00;

    public C8859FrX(int i, int i2) {
        this.A02 = "android.media.session.MediaController";
        super.A00 = i;
        this.A01 = i2;
        this.A00 = new MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", i, i2);
    }
}
