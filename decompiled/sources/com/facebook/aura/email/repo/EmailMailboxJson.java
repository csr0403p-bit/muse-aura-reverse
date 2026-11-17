package com.facebook.aura.email.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.email.model.EmailMailbox;
import com.facebook.aura.email.model.EmailMailboxRestriction;
import com.facebook.aura.email.model.EmailRestrictionNotice;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

@Serializable
/* loaded from: classes.dex */
public final class EmailMailboxJson extends C06G {
    public static final Companion Companion = new Companion();
    public final JsonElement display;
    public final String email_address;
    public final String environment_id;
    public final String handle;
    public final String id;
    public final String name;
    public final JsonElement restriction;

    public final class Companion {
        public final C9hr<EmailMailboxJson> serializer() {
            return EmailMailboxJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailMailboxJson emailMailboxJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(emailMailboxJson.id, c9iZ, 0);
        c9j5.AAV(emailMailboxJson.environment_id, c9iZ, 1);
        c9j5.AAV(emailMailboxJson.name, c9iZ, 2);
        c9j5.AAV(emailMailboxJson.handle, c9iZ, 3);
        c9j5.AAV(emailMailboxJson.email_address, c9iZ, 4);
        boolean zAfR = c9j5.AfR();
        if (zAfR || emailMailboxJson.restriction != null) {
            c9j5.AAP(emailMailboxJson.restriction, JsonElementSerializer.A00, c9iZ, 5);
        }
        if (zAfR || emailMailboxJson.display != null) {
            c9j5.AAP(emailMailboxJson.display, JsonElementSerializer.A00, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailMailboxJson) {
                EmailMailboxJson emailMailboxJson = (EmailMailboxJson) obj;
                if (!C7384Etj.areEqual(this.id, emailMailboxJson.id) || !C7384Etj.areEqual(this.environment_id, emailMailboxJson.environment_id) || !C7384Etj.areEqual(this.name, emailMailboxJson.name) || !C7384Etj.areEqual(this.handle, emailMailboxJson.handle) || !C7384Etj.areEqual(this.email_address, emailMailboxJson.email_address) || !C7384Etj.areEqual(this.restriction, emailMailboxJson.restriction) || !C7384Etj.areEqual(this.display, emailMailboxJson.display)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailMailboxJson copy$default(EmailMailboxJson emailMailboxJson, String str, String str2, String str3, String str4, String str5, JsonElement jsonElement, JsonElement jsonElement2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailMailboxJson.id;
        }
        if ((i & 2) != 0) {
            str2 = emailMailboxJson.environment_id;
        }
        if ((i & 4) != 0) {
            str3 = emailMailboxJson.name;
        }
        if ((i & 8) != 0) {
            str4 = emailMailboxJson.handle;
        }
        if ((i & 16) != 0) {
            str5 = emailMailboxJson.email_address;
        }
        if ((i & 32) != 0) {
            jsonElement = emailMailboxJson.restriction;
        }
        if ((i & 64) != 0) {
            jsonElement2 = emailMailboxJson.display;
        }
        return emailMailboxJson.copy(str, str2, str3, str4, str5, jsonElement, jsonElement2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.environment_id;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.handle;
    }

    public final String component5() {
        return this.email_address;
    }

    public final JsonElement component6() {
        return this.restriction;
    }

    public final JsonElement component7() {
        return this.display;
    }

    public final JsonElement getDisplay() {
        return this.display;
    }

    public final String getEmail_address() {
        return this.email_address;
    }

    public final String getEnvironment_id() {
        return this.environment_id;
    }

    public final String getHandle() {
        return this.handle;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final JsonElement getRestriction() {
        return this.restriction;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.email_address, AnonymousClass005.A0I(this.handle, AnonymousClass005.A0I(this.name, AnonymousClass005.A0I(this.environment_id, AnonymousClass001.A0G(this.id))))) + AnonymousClass006.A0D(this.restriction)) * 31) + C06G.A04(this.display);
    }

    public final EmailMailbox toDomain() {
        JsonObject jsonObject;
        JsonObject jsonObject2;
        String str = this.id;
        String str2 = this.environment_id;
        String str3 = this.name;
        String str4 = this.handle;
        String str5 = this.email_address;
        String strStringOrNull = EmailRepositoryJsonKt.stringOrNull(this.restriction);
        EmailRestrictionNotice restrictionNotice = null;
        EmailMailboxRestriction emailMailboxRestrictionFromWire = strStringOrNull != null ? EmailMailboxRestriction.Companion.fromWire(strStringOrNull) : null;
        JsonElement jsonElement = this.display;
        JsonElement jsonElement2 = (!(jsonElement instanceof JsonObject) || (jsonObject2 = (JsonObject) jsonElement) == null) ? null : (JsonElement) jsonObject2.get("restriction_notice");
        if ((jsonElement2 instanceof JsonObject) && (jsonObject = (JsonObject) jsonElement2) != null) {
            restrictionNotice = EmailRepositoryJsonKt.toRestrictionNotice(jsonObject);
        }
        return new EmailMailbox(str, str2, str3, str4, str5, emailMailboxRestrictionFromWire, restrictionNotice);
    }

    public EmailMailboxJson(String str, String str2, String str3, String str4, String str5, JsonElement jsonElement, JsonElement jsonElement2) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.id = str;
        this.environment_id = str2;
        this.name = str3;
        this.handle = str4;
        this.email_address = str5;
        this.restriction = jsonElement;
        this.display = jsonElement2;
    }

    public final EmailMailboxJson copy(String str, String str2, String str3, String str4, String str5, JsonElement jsonElement, JsonElement jsonElement2) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        return new EmailMailboxJson(str, str2, str3, str4, str5, jsonElement, jsonElement2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailMailboxJson(String str, String str2, String str3, String str4, String str5, JsonElement jsonElement, JsonElement jsonElement2, int i, C06H c06h) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : jsonElement, (i & 64) != 0 ? null : jsonElement2);
    }

    public /* synthetic */ EmailMailboxJson(int i, String str, String str2, String str3, String str4, String str5, JsonElement jsonElement, JsonElement jsonElement2, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(EmailMailboxJson$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.environment_id = str2;
        this.name = str3;
        this.handle = str4;
        this.email_address = str5;
        if ((i & 32) == 0) {
            this.restriction = null;
        } else {
            this.restriction = jsonElement;
        }
        if ((i & 64) == 0) {
            this.display = null;
        } else {
            this.display = jsonElement2;
        }
    }
}
