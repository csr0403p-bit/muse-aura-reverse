package X;

/* renamed from: X.Cnr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4147Cnr {
    public static final AbstractC4203Cpp A00;
    public static final AbstractC4203Cpp A01;
    public static final C4378CuY A02;
    public static final C4378CuY A03;
    public static final C4240CrC A04;
    public static final C4240CrC A05;

    static {
        C4378CuY c4378CuY = new C4378CuY();
        A02 = c4378CuY;
        C4378CuY c4378CuY2 = new C4378CuY();
        A03 = c4378CuY2;
        C4146Cnq c4146Cnq = new C4146Cnq();
        A00 = c4146Cnq;
        C4144Cnn c4144Cnn = new C4144Cnn();
        A01 = c4144Cnn;
        CRy.A07("profile", "scopeUri must not be null or empty");
        CRy.A07("email", "scopeUri must not be null or empty");
        A04 = new C4240CrC(c4146Cnq, c4378CuY, "SignIn.API");
        A05 = new C4240CrC(c4144Cnn, c4378CuY2, "SignIn.INTERNAL_API");
    }
}
