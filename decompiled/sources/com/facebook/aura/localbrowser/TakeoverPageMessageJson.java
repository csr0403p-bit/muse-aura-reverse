package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BQG;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class TakeoverPageMessageJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Boolean filled;
    public final String kind;
    public final String label;
    public final String name;
    public final String role;
    public final String text;
    public final String type;

    public final class Companion {
        public final C9hr<TakeoverPageMessageJson> serializer() {
            return TakeoverPageMessageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public TakeoverPageMessageJson() {
        this("", null, null, null, null, null, null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(TakeoverPageMessageJson takeoverPageMessageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(takeoverPageMessageJson.type)) {
            c9j5.AAV(takeoverPageMessageJson.type, c9iZ, 0);
        }
        if (zAfR || takeoverPageMessageJson.kind != null) {
            c9j5.AAP(takeoverPageMessageJson.kind, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || takeoverPageMessageJson.role != null) {
            c9j5.AAP(takeoverPageMessageJson.role, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || takeoverPageMessageJson.name != null) {
            c9j5.AAP(takeoverPageMessageJson.name, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || takeoverPageMessageJson.label != null) {
            c9j5.AAP(takeoverPageMessageJson.label, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || takeoverPageMessageJson.filled != null) {
            c9j5.AAP(takeoverPageMessageJson.filled, C07839ix.A00, c9iZ, 5);
        }
        if (zAfR || takeoverPageMessageJson.text != null) {
            c9j5.AAP(takeoverPageMessageJson.text, C07779iq.A01, c9iZ, 6);
        }
    }

    public final TakeoverPageMessageJson copy(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6) {
        C7384Etj.A0Y(str, 0);
        return new TakeoverPageMessageJson(str, str2, str3, str4, str5, bool, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TakeoverPageMessageJson) {
                TakeoverPageMessageJson takeoverPageMessageJson = (TakeoverPageMessageJson) obj;
                if (!C7384Etj.areEqual(this.type, takeoverPageMessageJson.type) || !C7384Etj.areEqual(this.kind, takeoverPageMessageJson.kind) || !C7384Etj.areEqual(this.role, takeoverPageMessageJson.role) || !C7384Etj.areEqual(this.name, takeoverPageMessageJson.name) || !C7384Etj.areEqual(this.label, takeoverPageMessageJson.label) || !C7384Etj.areEqual(this.filled, takeoverPageMessageJson.filled) || !C7384Etj.areEqual(this.text, takeoverPageMessageJson.text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TakeoverPageMessageJson copy$default(TakeoverPageMessageJson takeoverPageMessageJson, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = takeoverPageMessageJson.type;
        }
        if ((i & 2) != 0) {
            str2 = takeoverPageMessageJson.kind;
        }
        if ((i & 4) != 0) {
            str3 = takeoverPageMessageJson.role;
        }
        if ((i & 8) != 0) {
            str4 = takeoverPageMessageJson.name;
        }
        if ((i & 16) != 0) {
            str5 = takeoverPageMessageJson.label;
        }
        if ((i & 32) != 0) {
            bool = takeoverPageMessageJson.filled;
        }
        if ((i & 64) != 0) {
            str6 = takeoverPageMessageJson.text;
        }
        return takeoverPageMessageJson.copy(str, str2, str3, str4, str5, bool, str6);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.kind;
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

    public final Boolean component6() {
        return this.filled;
    }

    public final String component7() {
        return this.text;
    }

    public final Boolean getFilled() {
        return this.filled;
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

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((((((((AnonymousClass001.A0G(this.type) + AnonymousClass006.A0G(this.kind)) * 31) + AnonymousClass006.A0G(this.role)) * 31) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass006.A0D(this.filled)) * 31) + AnonymousClass005.A0H(this.text);
    }

    public final TakeoverActivityJson toActivity() {
        TakeoverFieldValueJson takeoverFieldValueJson;
        String str;
        String str2;
        String str3 = this.kind;
        if (str3 != null) {
            int iHashCode = str3.hashCode();
            if (iHashCode != -1600253841) {
                if (iHashCode == -139244736) {
                    if (!str3.equals("form_submitted") || (str = this.name) == null) {
                        return null;
                    }
                    return new TakeoverActivityJson(str3, null, null, BQG.A17(str, 500), null, null);
                }
                if (iHashCode != 860524583 || !str3.equals("clicked") || (str2 = this.role) == null || this.name == null) {
                    return null;
                }
                return new TakeoverActivityJson(str3, null, BQG.A17(str2, 500), BQG.A17(this.name, 500), null, null);
            }
            if (str3.equals("field_changed")) {
                if (AnonymousClass002.A1b(this.filled, true)) {
                    takeoverFieldValueJson = new TakeoverFieldValueJson("filled", null);
                } else {
                    String str4 = this.text;
                    takeoverFieldValueJson = str4 != null ? new TakeoverFieldValueJson("text", BQG.A17(str4, 500)) : null;
                }
                String str5 = this.label;
                if (str5 != null && takeoverFieldValueJson != null) {
                    return new TakeoverActivityJson(this.kind, null, null, null, BQG.A17(str5, 500), takeoverFieldValueJson);
                }
            }
        }
        return null;
    }

    public String toString() {
        String str = this.type;
        String str2 = this.kind;
        String str3 = this.role;
        String str4 = this.name;
        String str5 = this.label;
        Boolean bool = this.filled;
        String str6 = this.text;
        StringBuilder sbA0x = C3cI.A0x("TakeoverPageMessageJson(type=", str);
        sbA0x.append(", kind=");
        sbA0x.append(str2);
        sbA0x.append(", role=");
        sbA0x.append(str3);
        sbA0x.append(", name=");
        sbA0x.append(str4);
        sbA0x.append(", label=");
        sbA0x.append(str5);
        sbA0x.append(", filled=");
        sbA0x.append(bool);
        return C3cJ.A0N(", text=", str6, sbA0x);
    }

    public /* synthetic */ TakeoverPageMessageJson(int i, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, C2hx c2hx) {
        this.type = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.kind = null;
        } else {
            this.kind = str2;
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
            this.filled = null;
        } else {
            this.filled = bool;
        }
        if ((i & 64) == 0) {
            this.text = null;
        } else {
            this.text = str6;
        }
    }

    public TakeoverPageMessageJson(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6) {
        C7384Etj.A0Y(str, 0);
        this.type = str;
        this.kind = str2;
        this.role = str3;
        this.name = str4;
        this.label = str5;
        this.filled = bool;
        this.text = str6;
    }

    public /* synthetic */ TakeoverPageMessageJson(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str6);
    }
}
