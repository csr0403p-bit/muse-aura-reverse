package X;

import android.app.Notification;

/* renamed from: X.EKk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6617EKk {
    public final int A00;
    public final int A01;
    public final Notification A02;

    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && getClass() == o.getClass()) {
            C6617EKk c6617EKk = (C6617EKk) o;
            if (this.A01 == c6617EKk.A01 && this.A00 == c6617EKk.A00) {
                return this.A02.equals(c6617EKk.A02);
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ForegroundInfo{mNotificationId=");
        sbA0x.append(this.A01);
        sbA0x.append(", mForegroundServiceType=");
        sbA0x.append(this.A00);
        sbA0x.append(", mNotification=");
        sbA0x.append(this.A02);
        return C8j3.A15(sbA0x);
    }

    public C6617EKk(int notificationId, Notification notification, int foregroundServiceType) {
        this.A01 = notificationId;
        this.A02 = notification;
        this.A00 = foregroundServiceType;
    }
}
