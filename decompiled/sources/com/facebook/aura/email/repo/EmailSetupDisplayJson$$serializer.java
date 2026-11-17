package com.facebook.aura.email.repo;

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
import com.facebook.aura.library.repo.UnifiedArtifactKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class EmailSetupDisplayJson$$serializer implements C9cd<EmailSetupDisplayJson> {
    public static final EmailSetupDisplayJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final EmailSetupDisplayJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        EmailSetupIntroJson emailSetupIntroJson = null;
        EmailSetupAddressJson emailSetupAddressJson = null;
        EmailSetupOwnerJson emailSetupOwnerJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new EmailSetupDisplayJson(i, emailSetupIntroJson, emailSetupAddressJson, emailSetupOwnerJson, (C2hx) null);
            }
            if (iA8N == 0) {
                emailSetupIntroJson = (EmailSetupIntroJson) c9j4A55.A8a(EmailSetupIntroJson$$serializer.INSTANCE, c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                emailSetupAddressJson = (EmailSetupAddressJson) c9j4A55.A8a(EmailSetupAddressJson$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                emailSetupOwnerJson = (EmailSetupOwnerJson) c9j4A55.A8a(EmailSetupOwnerJson$$serializer.INSTANCE, c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        EmailSetupDisplayJson$$serializer emailSetupDisplayJson$$serializer = new EmailSetupDisplayJson$$serializer();
        INSTANCE = emailSetupDisplayJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.email.repo.EmailSetupDisplayJson", emailSetupDisplayJson$$serializer, 3);
        c9iKA1C.A08("intro", true);
        c9iKA1C.A08("address", true);
        c9iKA1C.A08(UnifiedArtifactKt.OWNER_PRINCIPAL, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{EmailSetupIntroJson$$serializer.INSTANCE, EmailSetupAddressJson$$serializer.INSTANCE, EmailSetupOwnerJson$$serializer.INSTANCE};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, EmailSetupDisplayJson emailSetupDisplayJson) {
        AnonymousClass003.A0u(interfaceC07789is, emailSetupDisplayJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        EmailSetupDisplayJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(emailSetupDisplayJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
