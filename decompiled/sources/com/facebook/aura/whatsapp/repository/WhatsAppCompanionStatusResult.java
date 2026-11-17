package com.facebook.aura.whatsapp.repository;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class WhatsAppCompanionStatusResult extends C06G {
    public final String error;
    public final String linkCode;
    public final String message;
    public final WhatsAppCompanionStatus status;

    public WhatsAppCompanionStatusResult(WhatsAppCompanionStatus whatsAppCompanionStatus, String str, String str2, String str3) {
        C7384Etj.A0Y(whatsAppCompanionStatus, 0);
        this.status = whatsAppCompanionStatus;
        this.linkCode = str;
        this.error = str2;
        this.message = str3;
    }

    public final WhatsAppCompanionStatusResult copy(WhatsAppCompanionStatus whatsAppCompanionStatus, String str, String str2, String str3) {
        C7384Etj.A0Y(whatsAppCompanionStatus, 0);
        return new WhatsAppCompanionStatusResult(whatsAppCompanionStatus, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WhatsAppCompanionStatusResult) {
                WhatsAppCompanionStatusResult whatsAppCompanionStatusResult = (WhatsAppCompanionStatusResult) obj;
                if (this.status != whatsAppCompanionStatusResult.status || !C7384Etj.areEqual(this.linkCode, whatsAppCompanionStatusResult.linkCode) || !C7384Etj.areEqual(this.error, whatsAppCompanionStatusResult.error) || !C7384Etj.areEqual(this.message, whatsAppCompanionStatusResult.message)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WhatsAppCompanionStatusResult copy$default(WhatsAppCompanionStatusResult whatsAppCompanionStatusResult, WhatsAppCompanionStatus whatsAppCompanionStatus, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            whatsAppCompanionStatus = whatsAppCompanionStatusResult.status;
        }
        if ((i & 2) != 0) {
            str = whatsAppCompanionStatusResult.linkCode;
        }
        if ((i & 4) != 0) {
            str2 = whatsAppCompanionStatusResult.error;
        }
        if ((i & 8) != 0) {
            str3 = whatsAppCompanionStatusResult.message;
        }
        C7384Etj.A0Y(whatsAppCompanionStatus, 0);
        return new WhatsAppCompanionStatusResult(whatsAppCompanionStatus, str, str2, str3);
    }

    public final WhatsAppCompanionStatus component1() {
        return this.status;
    }

    public final String component2() {
        return this.linkCode;
    }

    public final String component3() {
        return this.error;
    }

    public final String component4() {
        return this.message;
    }

    public final String getError() {
        return this.error;
    }

    public final String getLinkCode() {
        return this.linkCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public final WhatsAppCompanionStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0E(this.status) + AnonymousClass006.A0G(this.linkCode)) * 31) + AnonymousClass006.A0G(this.error)) * 31) + AnonymousClass005.A0H(this.message);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WhatsAppCompanionStatusResult(WhatsAppCompanionStatus whatsAppCompanionStatus, String str, String str2, String str3, int i, C06H c06h) {
        this(whatsAppCompanionStatus, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
