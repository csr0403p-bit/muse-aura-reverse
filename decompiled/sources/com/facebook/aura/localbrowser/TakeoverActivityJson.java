package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class TakeoverActivityJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String kind;
    public final String label;
    public final String name;
    public final String role;
    public final String url;
    public final TakeoverFieldValueJson value;

    public final class Companion {
        public final C9hr<TakeoverActivityJson> serializer() {
            return TakeoverActivityJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(TakeoverActivityJson takeoverActivityJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(takeoverActivityJson.kind, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || takeoverActivityJson.url != null) {
            c9j5.AAP(takeoverActivityJson.url, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || takeoverActivityJson.role != null) {
            c9j5.AAP(takeoverActivityJson.role, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || takeoverActivityJson.name != null) {
            c9j5.AAP(takeoverActivityJson.name, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || takeoverActivityJson.label != null) {
            c9j5.AAP(takeoverActivityJson.label, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || takeoverActivityJson.value != null) {
            c9j5.AAP(takeoverActivityJson.value, TakeoverFieldValueJson$$serializer.INSTANCE, c9iZ, 5);
        }
    }

    public final TakeoverActivityJson copy(String str, String str2, String str3, String str4, String str5, TakeoverFieldValueJson takeoverFieldValueJson) {
        C7384Etj.A0Y(str, 0);
        return new TakeoverActivityJson(str, str2, str3, str4, str5, takeoverFieldValueJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TakeoverActivityJson) {
                TakeoverActivityJson takeoverActivityJson = (TakeoverActivityJson) obj;
                if (!C7384Etj.areEqual(this.kind, takeoverActivityJson.kind) || !C7384Etj.areEqual(this.url, takeoverActivityJson.url) || !C7384Etj.areEqual(this.role, takeoverActivityJson.role) || !C7384Etj.areEqual(this.name, takeoverActivityJson.name) || !C7384Etj.areEqual(this.label, takeoverActivityJson.label) || !C7384Etj.areEqual(this.value, takeoverActivityJson.value)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ TakeoverActivityJson(int i, String str, String str2, String str3, String str4, String str5, TakeoverFieldValueJson takeoverFieldValueJson, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(TakeoverActivityJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.kind = str;
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
        if ((i & 4) == 0) {
            this.role = null;
        } else {
            this.role = str3;
        }
        if ((i & 8) == 0) {
            this.name = null;
        } else {
            this.name = str4;
        }
        if ((i & 16) == 0) {
            this.label = null;
        } else {
            this.label = str5;
        }
        if ((i & 32) == 0) {
            this.value = null;
        } else {
            this.value = takeoverFieldValueJson;
        }
    }

    public static /* synthetic */ TakeoverActivityJson copy$default(TakeoverActivityJson takeoverActivityJson, String str, String str2, String str3, String str4, String str5, TakeoverFieldValueJson takeoverFieldValueJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = takeoverActivityJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = takeoverActivityJson.url;
        }
        if ((i & 4) != 0) {
            str3 = takeoverActivityJson.role;
        }
        if ((i & 8) != 0) {
            str4 = takeoverActivityJson.name;
        }
        if ((i & 16) != 0) {
            str5 = takeoverActivityJson.label;
        }
        if ((i & 32) != 0) {
            takeoverFieldValueJson = takeoverActivityJson.value;
        }
        return takeoverActivityJson.copy(str, str2, str3, str4, str5, takeoverFieldValueJson);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.role;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.label;
    }

    public final TakeoverFieldValueJson component6() {
        return this.value;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getUrl() {
        return this.url;
    }

    public final TakeoverFieldValueJson getValue() {
        return this.value;
    }

    public int hashCode() {
        return ((((((((AnonymousClass001.A0G(this.kind) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass006.A0G(this.role)) * 31) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.label)) * 31) + C3cH.A02(this.value);
    }

    public String toString() {
        String str = this.kind;
        String str2 = this.url;
        String str3 = this.role;
        String str4 = this.name;
        String str5 = this.label;
        TakeoverFieldValueJson takeoverFieldValueJson = this.value;
        StringBuilder sbA0x = C3cI.A0x("TakeoverActivityJson(kind=", str);
        sbA0x.append(", url=");
        sbA0x.append(str2);
        sbA0x.append(", role=");
        sbA0x.append(str3);
        sbA0x.append(", name=");
        sbA0x.append(str4);
        sbA0x.append(", label=");
        sbA0x.append(str5);
        return C3cJ.A0L(takeoverFieldValueJson, ", value=", sbA0x);
    }

    public TakeoverActivityJson(String str, String str2, String str3, String str4, String str5, TakeoverFieldValueJson takeoverFieldValueJson) {
        C7384Etj.A0Y(str, 0);
        this.kind = str;
        this.url = str2;
        this.role = str3;
        this.name = str4;
        this.label = str5;
        this.value = takeoverFieldValueJson;
    }

    public /* synthetic */ TakeoverActivityJson(String str, String str2, String str3, String str4, String str5, TakeoverFieldValueJson takeoverFieldValueJson, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : takeoverFieldValueJson);
    }
}
