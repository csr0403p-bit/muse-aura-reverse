package com.facebook.aura.sharedcontent;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShareSaveResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean saved;

    public final class Companion {
        public final C9hr<ShareSaveResponseJson> serializer() {
            return ShareSaveResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_sharedcontent_sharedcontent(ShareSaveResponseJson shareSaveResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || shareSaveResponseJson.saved) {
            c9j5.AA7(c9iZ, 0, shareSaveResponseJson.saved);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ShareSaveResponseJson) && this.saved == ((ShareSaveResponseJson) obj).saved);
    }

    public static /* synthetic */ ShareSaveResponseJson copy$default(ShareSaveResponseJson shareSaveResponseJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shareSaveResponseJson.saved;
        }
        return new ShareSaveResponseJson(z);
    }

    public final boolean component1() {
        return this.saved;
    }

    public final ShareSaveResponseJson copy(boolean z) {
        return new ShareSaveResponseJson(z);
    }

    public final boolean getSaved() {
        return this.saved;
    }

    public int hashCode() {
        return this.saved ? 1231 : 1237;
    }

    public /* synthetic */ ShareSaveResponseJson(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.saved = false;
        } else {
            this.saved = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ShareSaveResponseJson(boolean z) {
        this.saved = z;
    }

    public /* synthetic */ ShareSaveResponseJson(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public ShareSaveResponseJson() {
        this(false);
    }
}
