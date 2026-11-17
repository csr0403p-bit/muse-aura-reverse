package com.facebook.aura.conversation.view;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HighlightRequest extends C06G {
    public static final int $stable = 0;
    public final boolean isFromDeeplink;
    public final String messageId;

    public HighlightRequest(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.messageId = str;
        this.isFromDeeplink = z;
    }

    public final HighlightRequest copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new HighlightRequest(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HighlightRequest) {
                HighlightRequest highlightRequest = (HighlightRequest) obj;
                if (!C7384Etj.areEqual(this.messageId, highlightRequest.messageId) || this.isFromDeeplink != highlightRequest.isFromDeeplink) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HighlightRequest copy$default(HighlightRequest highlightRequest, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = highlightRequest.messageId;
        }
        if ((i & 2) != 0) {
            z = highlightRequest.isFromDeeplink;
        }
        C7384Etj.A0Y(str, 0);
        return new HighlightRequest(str, z);
    }

    public final String component1() {
        return this.messageId;
    }

    public final boolean component2() {
        return this.isFromDeeplink;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.messageId), this.isFromDeeplink);
    }

    public final boolean isFromDeeplink() {
        return this.isFromDeeplink;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HighlightRequest(String str, boolean z, int i, C06H c06h) {
        this(str, AnonymousClass001.A1Q(i, z));
    }
}
