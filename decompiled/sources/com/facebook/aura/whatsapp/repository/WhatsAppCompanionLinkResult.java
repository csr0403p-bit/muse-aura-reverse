package com.facebook.aura.whatsapp.repository;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class WhatsAppCompanionLinkResult extends C06G {
    public final String error;
    public final String linkCode;
    public final boolean success;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WhatsAppCompanionLinkResult) {
                WhatsAppCompanionLinkResult whatsAppCompanionLinkResult = (WhatsAppCompanionLinkResult) obj;
                if (this.success != whatsAppCompanionLinkResult.success || !C7384Etj.areEqual(this.linkCode, whatsAppCompanionLinkResult.linkCode) || !C7384Etj.areEqual(this.error, whatsAppCompanionLinkResult.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WhatsAppCompanionLinkResult copy$default(WhatsAppCompanionLinkResult whatsAppCompanionLinkResult, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = whatsAppCompanionLinkResult.success;
        }
        if ((i & 2) != 0) {
            str = whatsAppCompanionLinkResult.linkCode;
        }
        if ((i & 4) != 0) {
            str2 = whatsAppCompanionLinkResult.error;
        }
        return new WhatsAppCompanionLinkResult(z, str, str2);
    }

    public final boolean component1() {
        return this.success;
    }

    public final String component2() {
        return this.linkCode;
    }

    public final String component3() {
        return this.error;
    }

    public final WhatsAppCompanionLinkResult copy(boolean z, String str, String str2) {
        return new WhatsAppCompanionLinkResult(z, str, str2);
    }

    public final String getError() {
        return this.error;
    }

    public final String getLinkCode() {
        return this.linkCode;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return ((C0KA.A02(this.success) + AnonymousClass006.A0G(this.linkCode)) * 31) + AnonymousClass005.A0H(this.error);
    }

    public WhatsAppCompanionLinkResult(boolean z, String str, String str2) {
        this.success = z;
        this.linkCode = str;
        this.error = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WhatsAppCompanionLinkResult(boolean z, String str, String str2, int i, C06H c06h) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
