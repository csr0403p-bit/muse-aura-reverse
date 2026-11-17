package com.facebook.aura.email.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import com.facebook.aura.email.model.EmailSettingsCopy;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class EmailSettingsDisplayJson extends C06G {
    public static final Companion Companion = new Companion();
    public final EmailAddEmailPageJson add_email_page;
    public final EmailDeleteDialogJson delete_dialog;
    public final EmailSettingDisplayJson include_signature;
    public final EmailMuseMailPageJson muse_mail_page;
    public final EmailSenderNamePageJson sender_name_page;
    public final EmailVerifiedEmailPageJson verified_email_page;
    public final EmailVerifiedEmailRowJson verified_email_row;

    public final class Companion {
        public final C9hr<EmailSettingsDisplayJson> serializer() {
            return EmailSettingsDisplayJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public EmailSettingsDisplayJson(EmailSettingDisplayJson emailSettingDisplayJson, EmailVerifiedEmailRowJson emailVerifiedEmailRowJson, EmailVerifiedEmailPageJson emailVerifiedEmailPageJson, EmailAddEmailPageJson emailAddEmailPageJson, EmailSenderNamePageJson emailSenderNamePageJson, EmailMuseMailPageJson emailMuseMailPageJson, EmailDeleteDialogJson emailDeleteDialogJson) {
        C7384Etj.A0Y(emailVerifiedEmailRowJson, 1);
        AnonymousClass005.A16(emailVerifiedEmailPageJson, emailAddEmailPageJson, emailSenderNamePageJson, emailMuseMailPageJson, 2);
        C7384Etj.A0Y(emailDeleteDialogJson, 6);
        this.include_signature = emailSettingDisplayJson;
        this.verified_email_row = emailVerifiedEmailRowJson;
        this.verified_email_page = emailVerifiedEmailPageJson;
        this.add_email_page = emailAddEmailPageJson;
        this.sender_name_page = emailSenderNamePageJson;
        this.muse_mail_page = emailMuseMailPageJson;
        this.delete_dialog = emailDeleteDialogJson;
    }

    private final String orNullIfEmpty(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(com.facebook.aura.email.repo.EmailSettingsDisplayJson r6, X.C9j5 r7, X.C9iZ r8) {
        /*
            r2 = 0
            boolean r5 = r7.AfR()
            if (r5 != 0) goto Lb
            com.facebook.aura.email.repo.EmailSettingDisplayJson r0 = r6.include_signature
            if (r0 == 0) goto L12
        Lb:
            com.facebook.aura.email.repo.EmailSettingDisplayJson$$serializer r1 = com.facebook.aura.email.repo.EmailSettingDisplayJson$$serializer.INSTANCE
            com.facebook.aura.email.repo.EmailSettingDisplayJson r0 = r6.include_signature
            r7.AAP(r0, r1, r8, r2)
        L12:
            r4 = 1
            r3 = 3
            r2 = 0
            if (r5 != 0) goto L24
            com.facebook.aura.email.repo.EmailVerifiedEmailRowJson r1 = r6.verified_email_row
            com.facebook.aura.email.repo.EmailVerifiedEmailRowJson r0 = new com.facebook.aura.email.repo.EmailVerifiedEmailRowJson
            r0.<init>(r2, r2)
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L2b
        L24:
            com.facebook.aura.email.repo.EmailVerifiedEmailRowJson$$serializer r1 = com.facebook.aura.email.repo.EmailVerifiedEmailRowJson$$serializer.INSTANCE
            com.facebook.aura.email.repo.EmailVerifiedEmailRowJson r0 = r6.verified_email_row
            r7.AAQ(r0, r1, r8, r4)
        L2b:
            r4 = 2
            if (r5 != 0) goto L3b
            com.facebook.aura.email.repo.EmailVerifiedEmailPageJson r1 = r6.verified_email_page
            com.facebook.aura.email.repo.EmailVerifiedEmailPageJson r0 = new com.facebook.aura.email.repo.EmailVerifiedEmailPageJson
            r0.<init>(r2, r2, r2, r2)
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L91
        L3b:
            com.facebook.aura.email.repo.EmailVerifiedEmailPageJson$$serializer r1 = com.facebook.aura.email.repo.EmailVerifiedEmailPageJson$$serializer.INSTANCE
            com.facebook.aura.email.repo.EmailVerifiedEmailPageJson r0 = r6.verified_email_page
            r7.AAQ(r0, r1, r8, r4)
            if (r5 == 0) goto L91
        L44:
            com.facebook.aura.email.repo.EmailAddEmailPageJson$$serializer r1 = com.facebook.aura.email.repo.EmailAddEmailPageJson$$serializer.INSTANCE
            com.facebook.aura.email.repo.EmailAddEmailPageJson r0 = r6.add_email_page
            r7.AAQ(r0, r1, r8, r3)
        L4b:
            r3 = 4
            if (r5 != 0) goto L5b
            com.facebook.aura.email.repo.EmailSenderNamePageJson r1 = r6.sender_name_page
            com.facebook.aura.email.repo.EmailSenderNamePageJson r0 = new com.facebook.aura.email.repo.EmailSenderNamePageJson
            r0.<init>(r2, r2, r2)
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L62
        L5b:
            com.facebook.aura.email.repo.EmailSenderNamePageJson$$serializer r1 = com.facebook.aura.email.repo.EmailSenderNamePageJson$$serializer.INSTANCE
            com.facebook.aura.email.repo.EmailSenderNamePageJson r0 = r6.sender_name_page
            r7.AAQ(r0, r1, r8, r3)
        L62:
            r3 = 5
            if (r5 != 0) goto L72
            com.facebook.aura.email.repo.EmailMuseMailPageJson r1 = r6.muse_mail_page
            com.facebook.aura.email.repo.EmailMuseMailPageJson r0 = new com.facebook.aura.email.repo.EmailMuseMailPageJson
            r0.<init>(r2, r2)
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L79
        L72:
            com.facebook.aura.email.repo.EmailMuseMailPageJson$$serializer r1 = com.facebook.aura.email.repo.EmailMuseMailPageJson$$serializer.INSTANCE
            com.facebook.aura.email.repo.EmailMuseMailPageJson r0 = r6.muse_mail_page
            r7.AAQ(r0, r1, r8, r3)
        L79:
            r3 = 6
            if (r5 != 0) goto L89
            com.facebook.aura.email.repo.EmailDeleteDialogJson r1 = r6.delete_dialog
            com.facebook.aura.email.repo.EmailDeleteDialogJson r0 = new com.facebook.aura.email.repo.EmailDeleteDialogJson
            r0.<init>(r2, r2, r2)
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L90
        L89:
            com.facebook.aura.email.repo.EmailDeleteDialogJson$$serializer r1 = com.facebook.aura.email.repo.EmailDeleteDialogJson$$serializer.INSTANCE
            com.facebook.aura.email.repo.EmailDeleteDialogJson r0 = r6.delete_dialog
            r7.AAQ(r0, r1, r8, r3)
        L90:
            return
        L91:
            com.facebook.aura.email.repo.EmailAddEmailPageJson r1 = r6.add_email_page
            com.facebook.aura.email.repo.EmailAddEmailPageJson r0 = new com.facebook.aura.email.repo.EmailAddEmailPageJson
            r0.<init>(r2, r2, r2)
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L4b
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailSettingsDisplayJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(com.facebook.aura.email.repo.EmailSettingsDisplayJson, X.9j5, X.9iZ):void");
    }

    public final EmailSettingsDisplayJson copy(EmailSettingDisplayJson emailSettingDisplayJson, EmailVerifiedEmailRowJson emailVerifiedEmailRowJson, EmailVerifiedEmailPageJson emailVerifiedEmailPageJson, EmailAddEmailPageJson emailAddEmailPageJson, EmailSenderNamePageJson emailSenderNamePageJson, EmailMuseMailPageJson emailMuseMailPageJson, EmailDeleteDialogJson emailDeleteDialogJson) {
        C7384Etj.A0Y(emailVerifiedEmailRowJson, 1);
        AnonymousClass005.A16(emailVerifiedEmailPageJson, emailAddEmailPageJson, emailSenderNamePageJson, emailMuseMailPageJson, 2);
        C7384Etj.A0Y(emailDeleteDialogJson, 6);
        return new EmailSettingsDisplayJson(emailSettingDisplayJson, emailVerifiedEmailRowJson, emailVerifiedEmailPageJson, emailAddEmailPageJson, emailSenderNamePageJson, emailMuseMailPageJson, emailDeleteDialogJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSettingsDisplayJson) {
                EmailSettingsDisplayJson emailSettingsDisplayJson = (EmailSettingsDisplayJson) obj;
                if (!C7384Etj.areEqual(this.include_signature, emailSettingsDisplayJson.include_signature) || !C7384Etj.areEqual(this.verified_email_row, emailSettingsDisplayJson.verified_email_row) || !C7384Etj.areEqual(this.verified_email_page, emailSettingsDisplayJson.verified_email_page) || !C7384Etj.areEqual(this.add_email_page, emailSettingsDisplayJson.add_email_page) || !C7384Etj.areEqual(this.sender_name_page, emailSettingsDisplayJson.sender_name_page) || !C7384Etj.areEqual(this.muse_mail_page, emailSettingsDisplayJson.muse_mail_page) || !C7384Etj.areEqual(this.delete_dialog, emailSettingsDisplayJson.delete_dialog)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSettingsDisplayJson copy$default(EmailSettingsDisplayJson emailSettingsDisplayJson, EmailSettingDisplayJson emailSettingDisplayJson, EmailVerifiedEmailRowJson emailVerifiedEmailRowJson, EmailVerifiedEmailPageJson emailVerifiedEmailPageJson, EmailAddEmailPageJson emailAddEmailPageJson, EmailSenderNamePageJson emailSenderNamePageJson, EmailMuseMailPageJson emailMuseMailPageJson, EmailDeleteDialogJson emailDeleteDialogJson, int i, Object obj) {
        if ((i & 1) != 0) {
            emailSettingDisplayJson = emailSettingsDisplayJson.include_signature;
        }
        if ((i & 2) != 0) {
            emailVerifiedEmailRowJson = emailSettingsDisplayJson.verified_email_row;
        }
        if ((i & 4) != 0) {
            emailVerifiedEmailPageJson = emailSettingsDisplayJson.verified_email_page;
        }
        if ((i & 8) != 0) {
            emailAddEmailPageJson = emailSettingsDisplayJson.add_email_page;
        }
        if ((i & 16) != 0) {
            emailSenderNamePageJson = emailSettingsDisplayJson.sender_name_page;
        }
        if ((i & 32) != 0) {
            emailMuseMailPageJson = emailSettingsDisplayJson.muse_mail_page;
        }
        if ((i & 64) != 0) {
            emailDeleteDialogJson = emailSettingsDisplayJson.delete_dialog;
        }
        return emailSettingsDisplayJson.copy(emailSettingDisplayJson, emailVerifiedEmailRowJson, emailVerifiedEmailPageJson, emailAddEmailPageJson, emailSenderNamePageJson, emailMuseMailPageJson, emailDeleteDialogJson);
    }

    public final EmailSettingDisplayJson component1() {
        return this.include_signature;
    }

    public final EmailVerifiedEmailRowJson component2() {
        return this.verified_email_row;
    }

    public final EmailVerifiedEmailPageJson component3() {
        return this.verified_email_page;
    }

    public final EmailAddEmailPageJson component4() {
        return this.add_email_page;
    }

    public final EmailSenderNamePageJson component5() {
        return this.sender_name_page;
    }

    public final EmailMuseMailPageJson component6() {
        return this.muse_mail_page;
    }

    public final EmailDeleteDialogJson component7() {
        return this.delete_dialog;
    }

    public final EmailAddEmailPageJson getAdd_email_page() {
        return this.add_email_page;
    }

    public final EmailDeleteDialogJson getDelete_dialog() {
        return this.delete_dialog;
    }

    public final EmailSettingDisplayJson getInclude_signature() {
        return this.include_signature;
    }

    public final EmailMuseMailPageJson getMuse_mail_page() {
        return this.muse_mail_page;
    }

    public final EmailSenderNamePageJson getSender_name_page() {
        return this.sender_name_page;
    }

    public final EmailVerifiedEmailPageJson getVerified_email_page() {
        return this.verified_email_page;
    }

    public final EmailVerifiedEmailRowJson getVerified_email_row() {
        return this.verified_email_row;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.delete_dialog, AnonymousClass005.A0F(this.muse_mail_page, AnonymousClass005.A0F(this.sender_name_page, AnonymousClass005.A0F(this.add_email_page, AnonymousClass005.A0F(this.verified_email_page, AnonymousClass005.A0F(this.verified_email_row, AnonymousClass006.A0D(this.include_signature) * 31))))));
    }

    public final EmailSettingsCopy toCopy() {
        EmailVerifiedEmailRowJson emailVerifiedEmailRowJson = this.verified_email_row;
        String strOrNullIfEmpty = orNullIfEmpty(emailVerifiedEmailRowJson.title);
        String strOrNullIfEmpty2 = orNullIfEmpty(emailVerifiedEmailRowJson.note);
        EmailVerifiedEmailPageJson emailVerifiedEmailPageJson = this.verified_email_page;
        String strOrNullIfEmpty3 = orNullIfEmpty(emailVerifiedEmailPageJson.title);
        String strOrNullIfEmpty4 = orNullIfEmpty(emailVerifiedEmailPageJson.how_it_works_title);
        String strOrNullIfEmpty5 = orNullIfEmpty(emailVerifiedEmailPageJson.how_it_works_body);
        String strOrNullIfEmpty6 = orNullIfEmpty(emailVerifiedEmailPageJson.list_label);
        EmailAddEmailPageJson emailAddEmailPageJson = this.add_email_page;
        String strOrNullIfEmpty7 = orNullIfEmpty(emailAddEmailPageJson.title);
        String strOrNullIfEmpty8 = orNullIfEmpty(emailAddEmailPageJson.placeholder);
        String strOrNullIfEmpty9 = orNullIfEmpty(emailAddEmailPageJson.help);
        EmailSenderNamePageJson emailSenderNamePageJson = this.sender_name_page;
        String strOrNullIfEmpty10 = orNullIfEmpty(emailSenderNamePageJson.title);
        String strOrNullIfEmpty11 = orNullIfEmpty(emailSenderNamePageJson.label);
        String strOrNullIfEmpty12 = orNullIfEmpty(emailSenderNamePageJson.help);
        EmailMuseMailPageJson emailMuseMailPageJson = this.muse_mail_page;
        String strOrNullIfEmpty13 = orNullIfEmpty(emailMuseMailPageJson.title);
        String strOrNullIfEmpty14 = orNullIfEmpty(emailMuseMailPageJson.delete_action);
        EmailDeleteDialogJson emailDeleteDialogJson = this.delete_dialog;
        return new EmailSettingsCopy(strOrNullIfEmpty, strOrNullIfEmpty2, strOrNullIfEmpty3, strOrNullIfEmpty4, strOrNullIfEmpty5, strOrNullIfEmpty6, strOrNullIfEmpty7, strOrNullIfEmpty8, strOrNullIfEmpty9, strOrNullIfEmpty10, strOrNullIfEmpty11, strOrNullIfEmpty12, strOrNullIfEmpty13, strOrNullIfEmpty14, orNullIfEmpty(emailDeleteDialogJson.title), orNullIfEmpty(emailDeleteDialogJson.message), orNullIfEmpty(emailDeleteDialogJson.deleting));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailSettingsDisplayJson(EmailSettingDisplayJson emailSettingDisplayJson, EmailVerifiedEmailRowJson emailVerifiedEmailRowJson, EmailVerifiedEmailPageJson emailVerifiedEmailPageJson, EmailAddEmailPageJson emailAddEmailPageJson, EmailSenderNamePageJson emailSenderNamePageJson, EmailMuseMailPageJson emailMuseMailPageJson, EmailDeleteDialogJson emailDeleteDialogJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : emailSettingDisplayJson, (i & 2) != 0 ? new EmailVerifiedEmailRowJson(null, null) : emailVerifiedEmailRowJson, (i & 4) != 0 ? new EmailVerifiedEmailPageJson(null, null, null, null) : emailVerifiedEmailPageJson, (i & 8) != 0 ? new EmailAddEmailPageJson(null, null, null) : emailAddEmailPageJson, (i & 16) != 0 ? new EmailSenderNamePageJson(null, null, null) : emailSenderNamePageJson, (i & 32) != 0 ? new EmailMuseMailPageJson(null, null) : emailMuseMailPageJson, (i & 64) != 0 ? new EmailDeleteDialogJson(null, null, null) : emailDeleteDialogJson);
    }

    public /* synthetic */ EmailSettingsDisplayJson(int i, EmailSettingDisplayJson emailSettingDisplayJson, EmailVerifiedEmailRowJson emailVerifiedEmailRowJson, EmailVerifiedEmailPageJson emailVerifiedEmailPageJson, EmailAddEmailPageJson emailAddEmailPageJson, EmailSenderNamePageJson emailSenderNamePageJson, EmailMuseMailPageJson emailMuseMailPageJson, EmailDeleteDialogJson emailDeleteDialogJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.include_signature = null;
        } else {
            this.include_signature = emailSettingDisplayJson;
        }
        if ((i & 2) == 0) {
            this.verified_email_row = new EmailVerifiedEmailRowJson(null, null);
        } else {
            this.verified_email_row = emailVerifiedEmailRowJson;
        }
        if ((i & 4) == 0) {
            this.verified_email_page = new EmailVerifiedEmailPageJson(null, null, null, null);
        } else {
            this.verified_email_page = emailVerifiedEmailPageJson;
        }
        if ((i & 8) == 0) {
            this.add_email_page = new EmailAddEmailPageJson(null, null, null);
        } else {
            this.add_email_page = emailAddEmailPageJson;
        }
        if ((i & 16) == 0) {
            this.sender_name_page = new EmailSenderNamePageJson(null, null, null);
        } else {
            this.sender_name_page = emailSenderNamePageJson;
        }
        this.muse_mail_page = (i & 32) == 0 ? new EmailMuseMailPageJson(null, null) : emailMuseMailPageJson;
        if ((i & 64) == 0) {
            this.delete_dialog = new EmailDeleteDialogJson(null, null, null);
        } else {
            this.delete_dialog = emailDeleteDialogJson;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmailSettingsDisplayJson() {
        this((EmailSettingDisplayJson) null, (EmailVerifiedEmailRowJson) (0 == true ? 1 : 0), (EmailVerifiedEmailPageJson) (0 == true ? 1 : 0), (EmailAddEmailPageJson) (0 == true ? 1 : 0), (EmailSenderNamePageJson) (0 == true ? 1 : 0), (EmailMuseMailPageJson) (0 == true ? 1 : 0), (EmailDeleteDialogJson) (0 == true ? 1 : 0), 127, (C06H) (0 == true ? 1 : 0));
    }
}
