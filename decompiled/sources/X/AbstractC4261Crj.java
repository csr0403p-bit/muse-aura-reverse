package X;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: X.Crj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4261Crj {

    @Deprecated
    public static final InterfaceC4455CwX A00;
    public static final C4378CuY A01;
    public static final C4378CuY A02;
    public static final C4240CrC<GoogleSignInOptions> A03;

    @Deprecated
    public static final C4240CrC<C4007Cje> A04;
    public static final C4240CrC A05;
    public static final AbstractC4203Cpp A06;
    public static final AbstractC4203Cpp A07;

    static {
        C4378CuY c4378CuY = new C4378CuY();
        A01 = c4378CuY;
        C4378CuY c4378CuY2 = new C4378CuY();
        A02 = c4378CuY2;
        C4262Crk c4262Crk = new C4262Crk();
        A06 = c4262Crk;
        C4263Crl c4263Crl = new C4263Crl();
        A07 = c4263Crl;
        A04 = AbstractC4265Crn.A02;
        A05 = new C4240CrC(c4262Crk, c4378CuY, "Auth.CREDENTIALS_API");
        A03 = new C4240CrC<>(c4263Crl, c4378CuY2, "Auth.GOOGLE_SIGN_IN_API");
        A00 = AbstractC4265Crn.A00;
    }
}
