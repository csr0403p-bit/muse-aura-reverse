package X;

import com.facebook.aura.bloks.data.AuraBloksDataProps;

/* renamed from: X.CqK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4212CqK implements InterfaceC3288C9m {
    public static final C4212CqK A00 = new C4212CqK();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;
    public static final C2580BeF A04;
    public static final C2580BeF A05;
    public static final C2580BeF A06;
    public static final C2580BeF A07;
    public static final C2580BeF A08;
    public static final C2580BeF A09;
    public static final C2580BeF A0A;
    public static final C2580BeF A0B;
    public static final C2580BeF A0C;
    public static final C2580BeF A0D;
    public static final C2580BeF A0E;

    static {
        Cx8 cx8A06 = Cx8.A06(AuraBloksDataProps.APP_ID);
        EnumC4486CxF enumC4486CxF = EnumC4486CxF.DEFAULT;
        A01 = Cx8.A0F(enumC4486CxF, cx8A06);
        A02 = Cx8.A0H(enumC4486CxF, "appVersion");
        A03 = Cx8.A0I(enumC4486CxF, "firebaseProjectId");
        A04 = Cx8.A0J(enumC4486CxF, "mlSdkVersion");
        A05 = Cx8.A0K(enumC4486CxF, "tfliteSchemaVersion");
        A06 = Cx8.A0L(enumC4486CxF, "gcmSenderId");
        A07 = Cx8.A0M(enumC4486CxF, "apiKey");
        A08 = Cx8.A0G(enumC4486CxF, Cx8.A06("languages"), 8);
        A09 = Cx8.A0G(enumC4486CxF, Cx8.A06("mlSdkInstanceId"), 9);
        A0A = Cx8.A0G(enumC4486CxF, Cx8.A06("isClearcutClient"), 10);
        A0B = Cx8.A0G(enumC4486CxF, Cx8.A06("isStandaloneMlkit"), 11);
        A0C = Cx8.A0G(enumC4486CxF, Cx8.A06("isJsonLogging"), 12);
        A0D = Cx8.A0G(enumC4486CxF, Cx8.A06("buildLevel"), 13);
        A0E = Cx8.A0G(enumC4486CxF, Cx8.A06("optionalModuleVersion"), 14);
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C3706Cd4 c3706Cd4 = (C3706Cd4) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, c3706Cd4.A06);
        interfaceC3892CgV2.A3F(A02, c3706Cd4.A07);
        interfaceC3892CgV2.A3F(A03, null);
        interfaceC3892CgV2.A3F(A04, c3706Cd4.A08);
        interfaceC3892CgV2.A3F(A05, c3706Cd4.A09);
        interfaceC3892CgV2.A3F(A06, null);
        interfaceC3892CgV2.A3F(A07, null);
        interfaceC3892CgV2.A3F(A08, c3706Cd4.A00);
        interfaceC3892CgV2.A3F(A09, c3706Cd4.A0A);
        interfaceC3892CgV2.A3F(A0A, c3706Cd4.A01);
        interfaceC3892CgV2.A3F(A0B, c3706Cd4.A02);
        interfaceC3892CgV2.A3F(A0C, c3706Cd4.A03);
        interfaceC3892CgV2.A3F(A0D, c3706Cd4.A04);
        interfaceC3892CgV2.A3F(A0E, c3706Cd4.A05);
    }
}
