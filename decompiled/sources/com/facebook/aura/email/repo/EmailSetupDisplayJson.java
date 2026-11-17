package com.facebook.aura.email.repo;

import X.AGI;
import X.AHD;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.email.model.EmailSetupDisplay;
import com.facebook.aura.email.model.EmailSetupPoint;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class EmailSetupDisplayJson extends C06G {
    public static final Companion Companion = new Companion();
    public final EmailSetupAddressJson address;
    public final EmailSetupIntroJson intro;
    public final EmailSetupOwnerJson owner;

    public final class Companion {
        public final C9hr<EmailSetupDisplayJson> serializer() {
            return EmailSetupDisplayJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailSetupDisplayJson emailSetupDisplayJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C7384Etj.areEqual(emailSetupDisplayJson.intro, new EmailSetupIntroJson(null, null, null))) {
            c9j5.AAQ(emailSetupDisplayJson.intro, EmailSetupIntroJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || !C7384Etj.areEqual(emailSetupDisplayJson.address, new EmailSetupAddressJson(null, null, null, null))) {
            c9j5.AAQ(emailSetupDisplayJson.address, EmailSetupAddressJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || !C7384Etj.areEqual(emailSetupDisplayJson.owner, new EmailSetupOwnerJson(null, null, null, null))) {
            c9j5.AAQ(emailSetupDisplayJson.owner, EmailSetupOwnerJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSetupDisplayJson) {
                EmailSetupDisplayJson emailSetupDisplayJson = (EmailSetupDisplayJson) obj;
                if (!C7384Etj.areEqual(this.intro, emailSetupDisplayJson.intro) || !C7384Etj.areEqual(this.address, emailSetupDisplayJson.address) || !C7384Etj.areEqual(this.owner, emailSetupDisplayJson.owner)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSetupDisplayJson copy$default(EmailSetupDisplayJson emailSetupDisplayJson, EmailSetupIntroJson emailSetupIntroJson, EmailSetupAddressJson emailSetupAddressJson, EmailSetupOwnerJson emailSetupOwnerJson, int i, Object obj) {
        if ((i & 1) != 0) {
            emailSetupIntroJson = emailSetupDisplayJson.intro;
        }
        if ((i & 2) != 0) {
            emailSetupAddressJson = emailSetupDisplayJson.address;
        }
        if ((i & 4) != 0) {
            emailSetupOwnerJson = emailSetupDisplayJson.owner;
        }
        return emailSetupDisplayJson.copy(emailSetupIntroJson, emailSetupAddressJson, emailSetupOwnerJson);
    }

    public final EmailSetupIntroJson component1() {
        return this.intro;
    }

    public final EmailSetupAddressJson component2() {
        return this.address;
    }

    public final EmailSetupOwnerJson component3() {
        return this.owner;
    }

    public final EmailSetupAddressJson getAddress() {
        return this.address;
    }

    public final EmailSetupIntroJson getIntro() {
        return this.intro;
    }

    public final EmailSetupOwnerJson getOwner() {
        return this.owner;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.owner, AnonymousClass005.A0F(this.address, AnonymousClass005.A0E(this.intro)));
    }

    public final EmailSetupDisplay toDomain() {
        AHD ahdA07;
        EmailSetupIntroJson emailSetupIntroJson = this.intro;
        String str = emailSetupIntroJson.title;
        String str2 = emailSetupIntroJson.footer;
        List<EmailSetupPointJson> list = emailSetupIntroJson.points;
        if (list != null) {
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            for (EmailSetupPointJson emailSetupPointJson : list) {
                arrayListA0i.add(new EmailSetupPoint(emailSetupPointJson.icon, emailSetupPointJson.title, emailSetupPointJson.description));
            }
            ahdA07 = AGI.A07(arrayListA0i);
        } else {
            ahdA07 = null;
        }
        EmailSetupAddressJson emailSetupAddressJson = this.address;
        String str3 = emailSetupAddressJson.title;
        String str4 = emailSetupAddressJson.subtitle;
        String str5 = emailSetupAddressJson.address_help;
        String str6 = emailSetupAddressJson.sender_name_help;
        EmailSetupOwnerJson emailSetupOwnerJson = this.owner;
        return new EmailSetupDisplay(str, str2, ahdA07, str3, str4, str5, str6, emailSetupOwnerJson.title, emailSetupOwnerJson.subtitle, emailSetupOwnerJson.email_help, emailSetupOwnerJson.email_help_with_links);
    }

    public EmailSetupDisplayJson(EmailSetupIntroJson emailSetupIntroJson, EmailSetupAddressJson emailSetupAddressJson, EmailSetupOwnerJson emailSetupOwnerJson) {
        AnonymousClass005.A0x(emailSetupIntroJson, emailSetupAddressJson, emailSetupOwnerJson);
        this.intro = emailSetupIntroJson;
        this.address = emailSetupAddressJson;
        this.owner = emailSetupOwnerJson;
    }

    public final EmailSetupDisplayJson copy(EmailSetupIntroJson emailSetupIntroJson, EmailSetupAddressJson emailSetupAddressJson, EmailSetupOwnerJson emailSetupOwnerJson) {
        AnonymousClass005.A0x(emailSetupIntroJson, emailSetupAddressJson, emailSetupOwnerJson);
        return new EmailSetupDisplayJson(emailSetupIntroJson, emailSetupAddressJson, emailSetupOwnerJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailSetupDisplayJson(int i, EmailSetupIntroJson emailSetupIntroJson, EmailSetupAddressJson emailSetupAddressJson, EmailSetupOwnerJson emailSetupOwnerJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.intro = new EmailSetupIntroJson(null, null, null);
        } else {
            this.intro = emailSetupIntroJson;
        }
        if ((i & 2) == 0) {
            this.address = new EmailSetupAddressJson(null, null, null, null);
        } else {
            this.address = emailSetupAddressJson;
        }
        if ((i & 4) == 0) {
            this.owner = new EmailSetupOwnerJson(null, null, null, null);
        } else {
            this.owner = emailSetupOwnerJson;
        }
    }

    public /* synthetic */ EmailSetupDisplayJson(EmailSetupIntroJson emailSetupIntroJson, EmailSetupAddressJson emailSetupAddressJson, EmailSetupOwnerJson emailSetupOwnerJson, int i, C06H c06h) {
        this((i & 1) != 0 ? new EmailSetupIntroJson(null, null, null) : emailSetupIntroJson, (i & 2) != 0 ? new EmailSetupAddressJson(null, null, null, null) : emailSetupAddressJson, (i & 4) != 0 ? new EmailSetupOwnerJson(null, null, null, null) : emailSetupOwnerJson);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmailSetupDisplayJson() {
        this((EmailSetupIntroJson) null, (EmailSetupAddressJson) (0 == true ? 1 : 0), (EmailSetupOwnerJson) (0 == true ? 1 : 0), 7, (C06H) (0 == true ? 1 : 0));
    }
}
