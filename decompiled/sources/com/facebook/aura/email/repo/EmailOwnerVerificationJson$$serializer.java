package com.facebook.aura.email.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
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
import com.facebook.aura.email.view.EmailSettingsScreenKt;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class EmailOwnerVerificationJson$$serializer implements C9cd<EmailOwnerVerificationJson> {
    public static final EmailOwnerVerificationJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final EmailOwnerVerificationJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        EmailOwnerResultJson emailOwnerResultJson = null;
        String strA0w = null;
        EmailOwnerFailureJson emailOwnerFailureJson = null;
        Boolean boolA0M = null;
        String strA0w2 = null;
        String strA0w3 = null;
        String strA0w4 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new EmailOwnerVerificationJson(i, emailOwnerResultJson, emailOwnerFailureJson, boolA0M, strA0w2, strA0w3, strA0w4, strA0w, (C2hx) null);
                case 0:
                    emailOwnerResultJson = (EmailOwnerResultJson) c9j4A55.A8Z(EmailOwnerResultJson$$serializer.INSTANCE, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    emailOwnerFailureJson = (EmailOwnerFailureJson) c9j4A55.A8Z(EmailOwnerFailureJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    boolA0M = C3cI.A0M(c9iZ, c9j4A55, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w4 = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        EmailOwnerVerificationJson$$serializer emailOwnerVerificationJson$$serializer = new EmailOwnerVerificationJson$$serializer();
        INSTANCE = emailOwnerVerificationJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.email.repo.EmailOwnerVerificationJson", emailOwnerVerificationJson$$serializer, 7);
        c9iKA1C.A08("result", true);
        c9iKA1C.A08("error", true);
        c9iKA1C.A08(PairsInviteMailboxKt.OUTCOME_OK, true);
        c9iKA1C.A08("id", true);
        C3cH.A1H(EmailSettingsScreenKt.EMAIL_ADDRESS_CLIP_LABEL, c9iKA1C, true);
        c9iKA1C.A08("challenge_id", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA00 = AbstractC07749im.A00(EmailOwnerResultJson$$serializer.INSTANCE);
        C9hr c9hrA002 = AbstractC07749im.A00(EmailOwnerFailureJson$$serializer.INSTANCE);
        C9hr c9hrA003 = AbstractC07749im.A00(C07839ix.A00);
        C07779iq c07779iq = C07779iq.A01;
        return C3cJ.A1A(c07779iq, c9hrA00, c9hrA002, c9hrA003, AbstractC07749im.A00(c07779iq));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, EmailOwnerVerificationJson emailOwnerVerificationJson) {
        AnonymousClass003.A0u(interfaceC07789is, emailOwnerVerificationJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        EmailOwnerVerificationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(emailOwnerVerificationJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
