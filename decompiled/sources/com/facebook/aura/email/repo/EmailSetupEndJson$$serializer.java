package com.facebook.aura.email.repo;

import X.AnonymousClass003;
import X.C3cG;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iZ;
import X.C9j4;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class EmailSetupEndJson$$serializer implements C9cd<EmailSetupEndJson> {
    public static final EmailSetupEndJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[0];
    }

    @Override // X.C9jG
    public final EmailSetupEndJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        int iA8N = c9j4A55.A8N(c9iZ);
        if (iA8N != -1) {
            throw C3cG.A17(iA8N);
        }
        c9j4A55.AAd(c9iZ);
        return new EmailSetupEndJson();
    }

    static {
        EmailSetupEndJson$$serializer emailSetupEndJson$$serializer = new EmailSetupEndJson$$serializer();
        INSTANCE = emailSetupEndJson$$serializer;
        descriptor = C3cG.A1C("com.facebook.aura.email.repo.EmailSetupEndJson", emailSetupEndJson$$serializer, 0);
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
    public final void serialize(InterfaceC07789is interfaceC07789is, EmailSetupEndJson emailSetupEndJson) {
        AnonymousClass003.A0u(interfaceC07789is, emailSetupEndJson);
        C9iZ c9iZ = descriptor;
        interfaceC07789is.A56(c9iZ).AAd(c9iZ);
    }
}
