package com.facebook.aura.email.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailSendingModeRequestJson extends C06G {
    public final Map<String, String> actions;
    public final String actor;
    public final String connector;
    public final String reason;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, EmailSendingModeRequestJson$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<EmailSendingModeRequestJson> serializer() {
            return EmailSendingModeRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSendingModeRequestJson) {
                EmailSendingModeRequestJson emailSendingModeRequestJson = (EmailSendingModeRequestJson) obj;
                if (!C7384Etj.areEqual(this.connector, emailSendingModeRequestJson.connector) || !C7384Etj.areEqual(this.actions, emailSendingModeRequestJson.actions) || !C7384Etj.areEqual(this.actor, emailSendingModeRequestJson.actor) || !C7384Etj.areEqual(this.reason, emailSendingModeRequestJson.reason)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmailSendingModeRequestJson copy$default(EmailSendingModeRequestJson emailSendingModeRequestJson, String str, Map map, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailSendingModeRequestJson.connector;
        }
        if ((i & 2) != 0) {
            map = emailSendingModeRequestJson.actions;
        }
        if ((i & 4) != 0) {
            str2 = emailSendingModeRequestJson.actor;
        }
        if ((i & 8) != 0) {
            str3 = emailSendingModeRequestJson.reason;
        }
        return emailSendingModeRequestJson.copy(str, map, str2, str3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailSendingModeRequestJson emailSendingModeRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(emailSendingModeRequestJson.connector, c9iZ, 0);
        c9j5.AAQ(emailSendingModeRequestJson.actions, C06G.A0e(f0cArr, 1), c9iZ, 1);
        c9j5.AAV(emailSendingModeRequestJson.actor, c9iZ, 2);
        c9j5.AAV(emailSendingModeRequestJson.reason, c9iZ, 3);
    }

    public final String component1() {
        return this.connector;
    }

    public final Map<String, String> component2() {
        return this.actions;
    }

    public final String component3() {
        return this.actor;
    }

    public final String component4() {
        return this.reason;
    }

    public final Map<String, String> getActions() {
        return this.actions;
    }

    public final String getActor() {
        return this.actor;
    }

    public final String getConnector() {
        return this.connector;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.reason, AnonymousClass005.A0I(this.actor, AnonymousClass005.A0F(this.actions, AnonymousClass001.A0G(this.connector))));
    }

    public EmailSendingModeRequestJson(String str, Map<String, String> map, String str2, String str3) {
        AnonymousClass005.A14(str, map, str2, str3);
        this.connector = str;
        this.actions = map;
        this.actor = str2;
        this.reason = str3;
    }

    public final EmailSendingModeRequestJson copy(String str, Map<String, String> map, String str2, String str3) {
        AnonymousClass005.A14(str, map, str2, str3);
        return new EmailSendingModeRequestJson(str, map, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailSendingModeRequestJson(int i, String str, Map map, String str2, String str3, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(EmailSendingModeRequestJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.connector = str;
        this.actions = map;
        this.actor = str2;
        this.reason = str3;
    }
}
