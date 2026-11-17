package com.facebook.aura.email.repo;

import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class EmailPageJson$$serializer<T> implements C9cd<EmailPageJson<T>> {
    public final C9iZ descriptor;
    public final /* synthetic */ C9hr<?> typeSerial0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailPageJson$$serializer(C9hr<T> c9hr) {
        this();
        C7384Etj.A0Y(c9hr, 0);
        this.typeSerial0 = c9hr;
    }

    @Override // X.C9jG
    public final EmailPageJson<T> deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = this.descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        List list = null;
        EmailPagingJson emailPagingJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new EmailPageJson<>(i, list, emailPagingJson, (C2hx) null);
            }
            if (iA8N == 0) {
                list = (List) c9j4A55.A8a(C3cG.A19(this.typeSerial0), c9iZ, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                emailPagingJson = (EmailPagingJson) c9j4A55.A8Z(EmailPagingJson$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            }
        }
    }

    private final /* synthetic */ C9hr getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cH.A1Z(EmailPagingJson$$serializer.INSTANCE, C3cG.A19(this.typeSerial0));
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return this.descriptor;
    }

    @Override // X.C9cd
    public final C9hr<?>[] typeParametersSerializers() {
        return new C9hr[]{this.typeSerial0};
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, EmailPageJson<T> emailPageJson) {
        AnonymousClass003.A0u(interfaceC07789is, emailPageJson);
        C9iZ c9iZ = this.descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        EmailPageJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(emailPageJson, c9j5A56, c9iZ, this.typeSerial0);
        c9j5A56.AAd(c9iZ);
    }

    public EmailPageJson$$serializer() {
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.email.repo.EmailPageJson", this, 2);
        c9iKA1C.A08("data", true);
        c9iKA1C.A08("paging", true);
        this.descriptor = c9iKA1C;
    }
}
