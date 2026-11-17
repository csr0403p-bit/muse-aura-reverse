package X;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* renamed from: X.Fqy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8842Fqy implements InterfaceC8862Fra, InterfaceC8841Fqx, InterfaceC8657FiH {
    public Messenger A00;
    public C8847Fr4 A01;
    public MediaSessionCompat$Token A02;
    public final Context A03;
    public final MediaBrowser A04;
    public final Bundle A05;
    public final HandlerC8656FiG A06 = new HandlerC8656FiG(this);
    public final DQd A07 = new DQd(0);

    public AbstractC8842Fqy(ComponentName componentName, Context context, C8843Fqz c8843Fqz) {
        this.A03 = context;
        Bundle bundleA0N = BV6.A0N();
        this.A05 = bundleA0N;
        bundleA0N.putInt("extra_client_version", 1);
        bundleA0N.putInt("extra_calling_pid", Process.myPid());
        c8843Fqz.A00 = this;
        this.A04 = new MediaBrowser(context, componentName, c8843Fqz.A04, bundleA0N);
    }
}
