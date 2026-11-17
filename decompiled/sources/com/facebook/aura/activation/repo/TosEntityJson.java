package com.facebook.aura.activation.repo;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.activation.data.HatchDisclosureEntity;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class TosEntityJson extends C06G {
    public static final Companion Companion = new Companion();
    public final int length;
    public final int offset;
    public final String url;

    public final class Companion {
        public final C9hr<TosEntityJson> serializer() {
            return TosEntityJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public TosEntityJson(int i, int i2, String str) {
        C7384Etj.A0Y(str, 2);
        this.offset = i;
        this.length = i2;
        this.url = str;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(TosEntityJson tosEntityJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || tosEntityJson.offset != 0) {
            c9j5.AAK(c9iZ, 0, tosEntityJson.offset);
        }
        if (zAfR || tosEntityJson.length != 0) {
            c9j5.AAK(c9iZ, 1, tosEntityJson.length);
        }
        if (zAfR || !C3cH.A1Q(tosEntityJson.url)) {
            c9j5.AAV(tosEntityJson.url, c9iZ, 2);
        }
    }

    public final TosEntityJson copy(int i, int i2, String str) {
        C7384Etj.A0Y(str, 2);
        return new TosEntityJson(i, i2, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TosEntityJson) {
                TosEntityJson tosEntityJson = (TosEntityJson) obj;
                if (this.offset != tosEntityJson.offset || this.length != tosEntityJson.length || !C7384Etj.areEqual(this.url, tosEntityJson.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TosEntityJson copy$default(TosEntityJson tosEntityJson, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = tosEntityJson.offset;
        }
        if ((i3 & 2) != 0) {
            i2 = tosEntityJson.length;
        }
        if ((i3 & 4) != 0) {
            str = tosEntityJson.url;
        }
        return tosEntityJson.copy(i, i2, str);
    }

    public final int component1() {
        return this.offset;
    }

    public final int component2() {
        return this.length;
    }

    public final String component3() {
        return this.url;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.url, ((this.offset * 31) + this.length) * 31);
    }

    public final HatchDisclosureEntity toDomain() {
        return new HatchDisclosureEntity(this.offset, this.length, this.url);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TosEntityJson(int i, int i2, int i3, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.offset = 0;
        } else {
            this.offset = i2;
        }
        if ((i & 2) == 0) {
            this.length = 0;
        } else {
            this.length = i3;
        }
        if ((i & 4) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
    }

    public /* synthetic */ TosEntityJson(int i, int i2, String str, int i3, C06H c06h) {
        this(C3cI.A00(i3, i), C3cG.A01(i3, i2), (i3 & 4) != 0 ? "" : str);
    }

    public TosEntityJson() {
        this(0, 0, "");
    }
}
