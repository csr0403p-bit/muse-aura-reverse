package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FsReadPayloadJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String data_base64;
    public final Boolean eof;
    public final Long len;
    public final Long offset;
    public final String path;
    public final String text;

    public final class Companion {
        public final C9hr<FsReadPayloadJson> serializer() {
            return FsReadPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ FsReadPayloadJson copy$default(FsReadPayloadJson fsReadPayloadJson, String str, Long l, Long l2, Boolean bool, String str2, String str3, int i, Object obj) {
        String str4 = str;
        Long l3 = l;
        Long l4 = l2;
        Boolean bool2 = bool;
        String str5 = str2;
        String str6 = str3;
        if ((i & 1) != 0) {
            str4 = fsReadPayloadJson.path;
        }
        if ((i & 2) != 0) {
            l3 = fsReadPayloadJson.offset;
        }
        if ((i & 4) != 0) {
            l4 = fsReadPayloadJson.len;
        }
        if ((i & 8) != 0) {
            bool2 = fsReadPayloadJson.eof;
        }
        if ((i & 16) != 0) {
            str5 = fsReadPayloadJson.text;
        }
        if ((i & 32) != 0) {
            str6 = fsReadPayloadJson.data_base64;
        }
        return new FsReadPayloadJson(str4, l3, l4, bool2, str5, str6);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsReadPayloadJson fsReadPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || fsReadPayloadJson.path != null) {
            c9j5.AAP(fsReadPayloadJson.path, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || fsReadPayloadJson.offset != null) {
            c9j5.AAP(fsReadPayloadJson.offset, C9j1.A00, c9iZ, 1);
        }
        if (zAfR || fsReadPayloadJson.len != null) {
            c9j5.AAP(fsReadPayloadJson.len, C9j1.A00, c9iZ, 2);
        }
        if (zAfR || fsReadPayloadJson.eof != null) {
            c9j5.AAP(fsReadPayloadJson.eof, C07839ix.A00, c9iZ, 3);
        }
        if (zAfR || fsReadPayloadJson.text != null) {
            c9j5.AAP(fsReadPayloadJson.text, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || fsReadPayloadJson.data_base64 != null) {
            c9j5.AAP(fsReadPayloadJson.data_base64, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsReadPayloadJson) {
                FsReadPayloadJson fsReadPayloadJson = (FsReadPayloadJson) obj;
                if (!C7384Etj.areEqual(this.path, fsReadPayloadJson.path) || !C7384Etj.areEqual(this.offset, fsReadPayloadJson.offset) || !C7384Etj.areEqual(this.len, fsReadPayloadJson.len) || !C7384Etj.areEqual(this.eof, fsReadPayloadJson.eof) || !C7384Etj.areEqual(this.text, fsReadPayloadJson.text) || !C7384Etj.areEqual(this.data_base64, fsReadPayloadJson.data_base64)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.path;
    }

    public final Long component2() {
        return this.offset;
    }

    public final Long component3() {
        return this.len;
    }

    public final Boolean component4() {
        return this.eof;
    }

    public final String component5() {
        return this.text;
    }

    public final String component6() {
        return this.data_base64;
    }

    public final FsReadPayloadJson copy(String str, Long l, Long l2, Boolean bool, String str2, String str3) {
        return new FsReadPayloadJson(str, l, l2, bool, str2, str3);
    }

    public final String getData_base64() {
        return this.data_base64;
    }

    public final Boolean getEof() {
        return this.eof;
    }

    public final Long getLen() {
        return this.len;
    }

    public final Long getOffset() {
        return this.offset;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((((((AnonymousClass006.A0G(this.path) * 31) + AnonymousClass006.A0D(this.offset)) * 31) + AnonymousClass006.A0D(this.len)) * 31) + AnonymousClass006.A0D(this.eof)) * 31) + AnonymousClass006.A0G(this.text)) * 31) + AnonymousClass005.A0H(this.data_base64);
    }

    public FsReadPayloadJson(String str, Long l, Long l2, Boolean bool, String str2, String str3) {
        this.path = str;
        this.offset = l;
        this.len = l2;
        this.eof = bool;
        this.text = str2;
        this.data_base64 = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsReadPayloadJson(String str, Long l, Long l2, Boolean bool, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
    }

    public /* synthetic */ FsReadPayloadJson(int i, String str, Long l, Long l2, Boolean bool, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.path = null;
        } else {
            this.path = str;
        }
        if ((i & 2) == 0) {
            this.offset = null;
        } else {
            this.offset = l;
        }
        if ((i & 4) == 0) {
            this.len = null;
        } else {
            this.len = l2;
        }
        if ((i & 8) == 0) {
            this.eof = null;
        } else {
            this.eof = bool;
        }
        if ((i & 16) == 0) {
            this.text = null;
        } else {
            this.text = str2;
        }
        if ((i & 32) == 0) {
            this.data_base64 = null;
        } else {
            this.data_base64 = str3;
        }
    }

    public FsReadPayloadJson() {
        this(null, null, null, null, null, null);
    }
}
