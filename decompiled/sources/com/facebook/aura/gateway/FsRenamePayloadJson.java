package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FsRenamePayloadJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String destination;
    public final String source;

    public final class Companion {
        public final C9hr<FsRenamePayloadJson> serializer() {
            return FsRenamePayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsRenamePayloadJson fsRenamePayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || fsRenamePayloadJson.source != null) {
            c9j5.AAP(fsRenamePayloadJson.source, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || fsRenamePayloadJson.destination != null) {
            c9j5.AAP(fsRenamePayloadJson.destination, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsRenamePayloadJson) {
                FsRenamePayloadJson fsRenamePayloadJson = (FsRenamePayloadJson) obj;
                if (!C7384Etj.areEqual(this.source, fsRenamePayloadJson.source) || !C7384Etj.areEqual(this.destination, fsRenamePayloadJson.destination)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FsRenamePayloadJson copy$default(FsRenamePayloadJson fsRenamePayloadJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fsRenamePayloadJson.source;
        }
        if ((i & 2) != 0) {
            str2 = fsRenamePayloadJson.destination;
        }
        return new FsRenamePayloadJson(str, str2);
    }

    public final String component1() {
        return this.source;
    }

    public final String component2() {
        return this.destination;
    }

    public final FsRenamePayloadJson copy(String str, String str2) {
        return new FsRenamePayloadJson(str, str2);
    }

    public final String getDestination() {
        return this.destination;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.source) * 31) + AnonymousClass005.A0H(this.destination);
    }

    public FsRenamePayloadJson(String str, String str2) {
        this.source = str;
        this.destination = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsRenamePayloadJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.source = null;
        } else {
            this.source = str;
        }
        if ((i & 2) == 0) {
            this.destination = null;
        } else {
            this.destination = str2;
        }
    }

    public /* synthetic */ FsRenamePayloadJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public FsRenamePayloadJson() {
        this(null, null);
    }
}
