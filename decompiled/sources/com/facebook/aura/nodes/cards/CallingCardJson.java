package com.facebook.aura.nodes.cards;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CallingCardJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String contact_name;
    public final String phone_number;

    public final class Companion {
        public final C9hr<CallingCardJson> serializer() {
            return CallingCardJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CallingCardJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.phone_number = str;
        this.contact_name = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(CallingCardJson callingCardJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(callingCardJson.phone_number)) {
            c9j5.AAV(callingCardJson.phone_number, c9iZ, 0);
        }
        if (zAfR || callingCardJson.contact_name != null) {
            c9j5.AAP(callingCardJson.contact_name, C07779iq.A01, c9iZ, 1);
        }
    }

    public final CallingCardJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new CallingCardJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallingCardJson) {
                CallingCardJson callingCardJson = (CallingCardJson) obj;
                if (!C7384Etj.areEqual(this.phone_number, callingCardJson.phone_number) || !C7384Etj.areEqual(this.contact_name, callingCardJson.contact_name)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CallingCardJson copy$default(CallingCardJson callingCardJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callingCardJson.phone_number;
        }
        if ((i & 2) != 0) {
            str2 = callingCardJson.contact_name;
        }
        C7384Etj.A0Y(str, 0);
        return new CallingCardJson(str, str2);
    }

    public final String component1() {
        return this.phone_number;
    }

    public final String component2() {
        return this.contact_name;
    }

    public final String getContact_name() {
        return this.contact_name;
    }

    public final String getPhone_number() {
        return this.phone_number;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.phone_number) + AnonymousClass006.A0G(this.contact_name);
    }

    public final CallingCardData toDomain() {
        String strA0l;
        String strA0l2 = AnonymousClass002.A0l(this.phone_number);
        String str = null;
        if (strA0l2.length() <= 0) {
            return null;
        }
        String str2 = this.contact_name;
        if (str2 != null && (strA0l = AnonymousClass002.A0l(str2)) != null && strA0l.length() > 0) {
            str = strA0l;
        }
        return new CallingCardData(strA0l2, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CallingCardJson(int i, String str, String str2, C2hx c2hx) {
        this.phone_number = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.contact_name = null;
        } else {
            this.contact_name = str2;
        }
    }

    public /* synthetic */ CallingCardJson(String str, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass006.A0s(i, str2));
    }

    public CallingCardJson() {
        this("", null);
    }
}
