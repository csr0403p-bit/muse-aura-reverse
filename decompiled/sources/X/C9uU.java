package X;

import com.meta.mfa.credentials.AttestationStatement;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9uU, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9uU implements C9cd<AttestationStatement> {
    public static final C9uU A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = AttestationStatement.$childSerializers;
        byte[] bArr = null;
        List listA0Q = null;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new AttestationStatement(i, iA8U, bArr, listA0Q, null);
            }
            if (iA8N == 0) {
                iA8U = c9j4A55.A8U(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                bArr = (byte[]) c9j4A55.A8a(C9tf.A00, c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            }
        }
    }

    static {
        C9uU c9uU = new C9uU();
        A00 = c9uU;
        C9iK c9iKA1C = C3cG.A1C("com.meta.mfa.credentials.AttestationStatement", c9uU, 3);
        c9iKA1C.A08("alg", false);
        c9iKA1C.A08("sig", false);
        c9iKA1C.A08("x5c", false);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07729ii.A00, C9tf.A00, C3cH.A11(AttestationStatement.$childSerializers)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        AttestationStatement attestationStatement = (AttestationStatement) obj;
        AnonymousClass003.A0u(interfaceC07789is, attestationStatement);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AttestationStatement.write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(attestationStatement, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
