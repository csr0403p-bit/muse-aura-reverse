package X;

import com.meta.mfa.credentials.AttestationObject;
import com.meta.mfa.credentials.AttestationStatement;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C08409ub implements C9cd<AttestationObject> {
    public static final C08409ub A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        AttestationStatement attestationStatement = null;
        byte[] bArr = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new AttestationObject(i, strA8f, attestationStatement, bArr, null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                attestationStatement = (AttestationStatement) c9j4A55.A8a(C9uU.A00, c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                bArr = (byte[]) c9j4A55.A8a(C9jL.A00, c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        C08409ub c08409ub = new C08409ub();
        A00 = c08409ub;
        C9iK c9iKA1C = C3cG.A1C("com.meta.mfa.credentials.AttestationObject", c08409ub, 3);
        c9iKA1C.A08("fmt", false);
        c9iKA1C.A08("attStmt", false);
        c9iKA1C.A08("authData", false);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07779iq.A01, C9uU.A00, C9jL.A00};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        AttestationObject attestationObject = (AttestationObject) obj;
        AnonymousClass003.A0u(interfaceC07789is, attestationObject);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AttestationObject.write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(attestationObject, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
