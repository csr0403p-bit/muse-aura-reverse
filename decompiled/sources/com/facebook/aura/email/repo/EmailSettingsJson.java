package com.facebook.aura.email.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import com.facebook.aura.email.model.EmailSettings;
import com.facebook.aura.email.model.EmailSettingsCopy;
import com.facebook.aura.email.model.EmailSignature;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailSettingsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final EmailSettingsDisplayJson display;
    public final boolean include_signature;
    public final boolean show_permissions;

    /* loaded from: classes4.dex */
    public final class Companion {
        public final C9hr<EmailSettingsJson> serializer() {
            return EmailSettingsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(com.facebook.aura.email.repo.EmailSettingsJson r4, X.C9j5 r5, X.C9iZ r6) {
        /*
            r2 = 0
            boolean r3 = r5.AfR()
            r1 = 1
            if (r3 != 0) goto Lc
            boolean r0 = r4.include_signature
            if (r0 == r1) goto L27
        Lc:
            boolean r0 = r4.include_signature
            r5.AA7(r6, r2, r0)
            if (r3 == 0) goto L27
        L13:
            boolean r0 = r4.show_permissions
            r5.AA7(r6, r1, r0)
        L18:
            r2 = 2
            if (r3 != 0) goto L1f
            com.facebook.aura.email.repo.EmailSettingsDisplayJson r0 = r4.display
            if (r0 == 0) goto L26
        L1f:
            com.facebook.aura.email.repo.EmailSettingsDisplaySerializer r1 = com.facebook.aura.email.repo.EmailSettingsDisplaySerializer.INSTANCE
            com.facebook.aura.email.repo.EmailSettingsDisplayJson r0 = r4.display
            r5.AAP(r0, r1, r6, r2)
        L26:
            return
        L27:
            boolean r0 = r4.show_permissions
            if (r0 == r1) goto L18
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailSettingsJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(com.facebook.aura.email.repo.EmailSettingsJson, X.9j5, X.9iZ):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSettingsJson) {
                EmailSettingsJson emailSettingsJson = (EmailSettingsJson) obj;
                if (this.include_signature != emailSettingsJson.include_signature || this.show_permissions != emailSettingsJson.show_permissions || !C7384Etj.areEqual(this.display, emailSettingsJson.display)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSettingsJson copy$default(EmailSettingsJson emailSettingsJson, boolean z, boolean z2, EmailSettingsDisplayJson emailSettingsDisplayJson, int i, Object obj) {
        if ((i & 1) != 0) {
            z = emailSettingsJson.include_signature;
        }
        if ((i & 2) != 0) {
            z2 = emailSettingsJson.show_permissions;
        }
        if ((i & 4) != 0) {
            emailSettingsDisplayJson = emailSettingsJson.display;
        }
        return new EmailSettingsJson(z, z2, emailSettingsDisplayJson);
    }

    @Serializable(with = EmailSettingsDisplaySerializer.class)
    public static /* synthetic */ void getDisplay$annotations() {
    }

    private final EmailSignature toSignature() {
        EmailSettingDisplayJson emailSettingDisplayJson;
        EmailSettingsDisplayJson emailSettingsDisplayJson = this.display;
        String str = null;
        if (emailSettingsDisplayJson != null && (emailSettingDisplayJson = emailSettingsDisplayJson.include_signature) != null && emailSettingDisplayJson.visible) {
            String str2 = emailSettingDisplayJson.title;
            if (str2.length() != 0) {
                boolean z = this.include_signature;
                String str3 = emailSettingDisplayJson.description;
                if (str3 != null && str3.length() != 0) {
                    str = str3;
                }
                return new EmailSignature(z, str2, str);
            }
        }
        return null;
    }

    public final boolean component1() {
        return this.include_signature;
    }

    public final boolean component2() {
        return this.show_permissions;
    }

    public final EmailSettingsDisplayJson component3() {
        return this.display;
    }

    public final EmailSettingsJson copy(boolean z, boolean z2, EmailSettingsDisplayJson emailSettingsDisplayJson) {
        return new EmailSettingsJson(z, z2, emailSettingsDisplayJson);
    }

    public final EmailSettingsDisplayJson getDisplay() {
        return this.display;
    }

    public final boolean getInclude_signature() {
        return this.include_signature;
    }

    public final boolean getShow_permissions() {
        return this.show_permissions;
    }

    public int hashCode() {
        return C0KA.A01(C0KA.A02(this.include_signature), this.show_permissions) + AnonymousClass006.A0D(this.display);
    }

    public final EmailSettings toDomain() {
        EmailSettingsCopy emailSettingsCopy;
        EmailSignature signature = toSignature();
        boolean z = this.show_permissions;
        EmailSettingsDisplayJson emailSettingsDisplayJson = this.display;
        if (emailSettingsDisplayJson == null || (emailSettingsCopy = emailSettingsDisplayJson.toCopy()) == null) {
            emailSettingsCopy = new EmailSettingsCopy(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }
        return new EmailSettings(signature, z, emailSettingsCopy);
    }

    public EmailSettingsJson(boolean z, boolean z2, EmailSettingsDisplayJson emailSettingsDisplayJson) {
        this.include_signature = z;
        this.show_permissions = z2;
        this.display = emailSettingsDisplayJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailSettingsJson(boolean z, boolean z2, EmailSettingsDisplayJson emailSettingsDisplayJson, int i, C06H c06h) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? null : emailSettingsDisplayJson);
    }

    public /* synthetic */ EmailSettingsJson(int i, boolean z, boolean z2, EmailSettingsDisplayJson emailSettingsDisplayJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.include_signature = true;
        } else {
            this.include_signature = z;
        }
        if ((i & 2) == 0) {
            this.show_permissions = true;
        } else {
            this.show_permissions = z2;
        }
        if ((i & 4) == 0) {
            this.display = null;
        } else {
            this.display = emailSettingsDisplayJson;
        }
    }

    public EmailSettingsJson() {
        this(true, true, null);
    }
}
