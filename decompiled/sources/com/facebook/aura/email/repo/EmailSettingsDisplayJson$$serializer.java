package com.facebook.aura.email.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class EmailSettingsDisplayJson$$serializer implements C9cd<EmailSettingsDisplayJson> {
    public static final EmailSettingsDisplayJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final EmailSettingsDisplayJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        EmailSettingDisplayJson emailSettingDisplayJson = null;
        EmailDeleteDialogJson emailDeleteDialogJson = null;
        EmailVerifiedEmailRowJson emailVerifiedEmailRowJson = null;
        EmailVerifiedEmailPageJson emailVerifiedEmailPageJson = null;
        EmailAddEmailPageJson emailAddEmailPageJson = null;
        EmailSenderNamePageJson emailSenderNamePageJson = null;
        EmailMuseMailPageJson emailMuseMailPageJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new EmailSettingsDisplayJson(i, emailSettingDisplayJson, emailVerifiedEmailRowJson, emailVerifiedEmailPageJson, emailAddEmailPageJson, emailSenderNamePageJson, emailMuseMailPageJson, emailDeleteDialogJson, (C2hx) null);
                case 0:
                    emailSettingDisplayJson = (EmailSettingDisplayJson) c9j4A55.A8Z(EmailSettingDisplayJson$$serializer.INSTANCE, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    emailVerifiedEmailRowJson = (EmailVerifiedEmailRowJson) c9j4A55.A8a(EmailVerifiedEmailRowJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    emailVerifiedEmailPageJson = (EmailVerifiedEmailPageJson) c9j4A55.A8a(EmailVerifiedEmailPageJson$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    emailAddEmailPageJson = (EmailAddEmailPageJson) c9j4A55.A8a(EmailAddEmailPageJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    emailSenderNamePageJson = (EmailSenderNamePageJson) c9j4A55.A8a(EmailSenderNamePageJson$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    emailMuseMailPageJson = (EmailMuseMailPageJson) c9j4A55.A8a(EmailMuseMailPageJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    emailDeleteDialogJson = (EmailDeleteDialogJson) c9j4A55.A8a(EmailDeleteDialogJson$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        EmailSettingsDisplayJson$$serializer emailSettingsDisplayJson$$serializer = new EmailSettingsDisplayJson$$serializer();
        INSTANCE = emailSettingsDisplayJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.email.repo.EmailSettingsDisplayJson", emailSettingsDisplayJson$$serializer, 7);
        c9iKA1C.A08("include_signature", true);
        c9iKA1C.A08("verified_email_row", true);
        c9iKA1C.A08("verified_email_page", true);
        c9iKA1C.A08("add_email_page", true);
        c9iKA1C.A08("sender_name_page", true);
        c9iKA1C.A08("muse_mail_page", true);
        c9iKA1C.A08("delete_dialog", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{AbstractC07749im.A00(EmailSettingDisplayJson$$serializer.INSTANCE), EmailVerifiedEmailRowJson$$serializer.INSTANCE, EmailVerifiedEmailPageJson$$serializer.INSTANCE, EmailAddEmailPageJson$$serializer.INSTANCE, EmailSenderNamePageJson$$serializer.INSTANCE, EmailMuseMailPageJson$$serializer.INSTANCE, EmailDeleteDialogJson$$serializer.INSTANCE};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, EmailSettingsDisplayJson emailSettingsDisplayJson) {
        AnonymousClass003.A0u(interfaceC07789is, emailSettingsDisplayJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        EmailSettingsDisplayJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(emailSettingsDisplayJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
