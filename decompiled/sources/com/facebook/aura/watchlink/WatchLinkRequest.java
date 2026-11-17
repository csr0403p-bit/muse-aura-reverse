package com.facebook.aura.watchlink;

import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class WatchLinkRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String link_id;
    public final String rejected_token_sha256;

    public final class Companion {
        public final C9hr<WatchLinkRequest> serializer() {
            return WatchLinkRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_watchlink_watchlink(WatchLinkRequest watchLinkRequest, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || watchLinkRequest.link_id != null) {
            c9j5.AAP(watchLinkRequest.link_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || watchLinkRequest.rejected_token_sha256 != null) {
            c9j5.AAP(watchLinkRequest.rejected_token_sha256, C07779iq.A01, c9iZ, 1);
        }
    }

    public final String getLink_id() {
        return this.link_id;
    }

    public final String getRejected_token_sha256() {
        return this.rejected_token_sha256;
    }

    public WatchLinkRequest(String str, String str2) {
        this.link_id = str;
        this.rejected_token_sha256 = str2;
    }

    public /* synthetic */ WatchLinkRequest(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.link_id = null;
        } else {
            this.link_id = str;
        }
        if ((i & 2) == 0) {
            this.rejected_token_sha256 = null;
        } else {
            this.rejected_token_sha256 = str2;
        }
    }

    public /* synthetic */ WatchLinkRequest(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public WatchLinkRequest() {
        this(null, null);
    }
}
