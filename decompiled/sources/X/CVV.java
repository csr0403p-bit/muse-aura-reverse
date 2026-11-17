package X;

import android.app.Notification;

/* loaded from: classes5.dex */
public final class CVV implements InterfaceC3579CVa {
    public final int A00;
    public final Notification A01;
    public final String A02;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("NotifyTask[packageName:");
        sbA0x.append("com.facebook.aura");
        sbA0x.append(", id:");
        sbA0x.append(this.A00);
        sbA0x.append(", tag:");
        sbA0x.append(this.A02);
        return AnonymousClass001.A0v("]", sbA0x);
    }

    public CVV(String str, int i, Notification notification) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = notification;
    }
}
