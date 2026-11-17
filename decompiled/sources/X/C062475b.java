package X;

import android.widget.RemoteViews;

/* renamed from: X.75b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C062475b {
    public final RemoteViews A00;
    public final C75T A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C062475b) {
                C062475b c062475b = (C062475b) obj;
                if (!this.A00.equals(c062475b.A00) || !this.A01.equals(c062475b.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("RemoteViewsInfo(remoteViews=");
        sbA0x.append(this.A00);
        sbA0x.append(AbstractC7606F5t.A00(9));
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public C062475b(RemoteViews remoteViews, C75T c75t) {
        this.A00 = remoteViews;
        this.A01 = c75t;
    }
}
