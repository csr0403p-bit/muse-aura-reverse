package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.HwO;

/* loaded from: classes6.dex */
public final class NotificationAck {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public long appliedRevision;
    public NotificationStatus status;

    public NotificationAck(long j, NotificationStatus notificationStatus) {
        C7384Etj.A0Y(notificationStatus, 1);
        this.appliedRevision = j;
        this.status = notificationStatus;
    }

    /* renamed from: copy-4PLdz1A, reason: not valid java name */
    public final NotificationAck m3627copy4PLdz1A(long j, NotificationStatus notificationStatus) {
        C7384Etj.A0Y(notificationStatus, 1);
        return new NotificationAck(j, notificationStatus);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NotificationAck) {
                NotificationAck notificationAck = (NotificationAck) obj;
                if (this.appliedRevision != notificationAck.appliedRevision || this.status != notificationAck.status) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setStatus(NotificationStatus notificationStatus) {
        C7384Etj.A0Y(notificationStatus, 0);
        this.status = notificationStatus;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-4PLdz1A$default, reason: not valid java name */
    public static /* synthetic */ NotificationAck m3625copy4PLdz1A$default(NotificationAck notificationAck, long j, NotificationStatus notificationStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            j = notificationAck.appliedRevision;
        }
        if ((i & 2) != 0) {
            notificationStatus = notificationAck.status;
        }
        C7384Etj.A0Y(notificationStatus, 1);
        return new NotificationAck(j, notificationStatus);
    }

    /* renamed from: component1-s-VKNKU, reason: not valid java name */
    public final long m3626component1sVKNKU() {
        return this.appliedRevision;
    }

    public final NotificationStatus component2() {
        return this.status;
    }

    /* renamed from: getAppliedRevision-s-VKNKU, reason: not valid java name */
    public final long m3628getAppliedRevisionsVKNKU() {
        return this.appliedRevision;
    }

    public final NotificationStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.status, C3cI.A01(this.appliedRevision));
    }

    /* renamed from: setAppliedRevision-VKZWuLQ, reason: not valid java name */
    public final void m3629setAppliedRevisionVKZWuLQ(long j) {
        this.appliedRevision = j;
    }

    public String toString() {
        return C3cJ.A0L(this.status, ", status=", C3cI.A0x("NotificationAck(appliedRevision=", HwO.A00(this.appliedRevision)));
    }

    public /* synthetic */ NotificationAck(long j, NotificationStatus notificationStatus, C06H c06h) {
        this(j, notificationStatus);
    }
}
