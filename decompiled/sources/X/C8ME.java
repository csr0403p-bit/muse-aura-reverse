package X;

import com.meta.mfa.credentials.ExcludeCredentialParams;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.8ME, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8ME implements C9cd<ExcludeCredentialParams> {
    public static final C8ME A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ExcludeCredentialParams.$childSerializers;
        byte[] bArr = null;
        String strA8f = null;
        List list = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ExcludeCredentialParams(i, bArr, strA8f, list, (C2hx) null);
            }
            if (iA8N == 0) {
                bArr = (byte[]) c9j4A55.A8a(C9jL.A00, c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                list = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            }
        }
    }

    static {
        C8ME c8me = new C8ME();
        A00 = c8me;
        C9iK c9iKA1C = C3cG.A1C("com.meta.mfa.credentials.ExcludeCredentialParams", c8me, 3);
        C3cH.A1F("id", c9iKA1C, false);
        c9iKA1C.A08("transports", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C9jL.A00, C07779iq.A01, C3cH.A14(ExcludeCredentialParams.$childSerializers, 2)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        ExcludeCredentialParams excludeCredentialParams = (ExcludeCredentialParams) obj;
        AnonymousClass003.A0u(interfaceC07789is, excludeCredentialParams);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ExcludeCredentialParams.write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(excludeCredentialParams, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
