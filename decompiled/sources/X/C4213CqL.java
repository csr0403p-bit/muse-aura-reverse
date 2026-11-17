package X;

import com.facebook.aura.bloks.data.AuraBloksDataProps;

/* renamed from: X.CqL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4213CqL implements InterfaceC3288C9m {
    public static final C4213CqL A00 = new C4213CqL();
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
        EnumC4485CxE enumC4485CxE = EnumC4485CxE.DEFAULT;
        A01 = Cx8.A07(enumC4485CxE, cx8A06);
        A02 = Cx8.A09(enumC4485CxE, "appVersion");
        A03 = Cx8.A0A(enumC4485CxE, "firebaseProjectId");
        A04 = Cx8.A0B(enumC4485CxE, "mlSdkVersion");
        A05 = Cx8.A0C(enumC4485CxE, "tfliteSchemaVersion");
        A06 = Cx8.A0D(enumC4485CxE, "gcmSenderId");
        A07 = Cx8.A0E(enumC4485CxE, "apiKey");
        A08 = Cx8.A08(enumC4485CxE, Cx8.A06("languages"), 8);
        A09 = Cx8.A08(enumC4485CxE, Cx8.A06("mlSdkInstanceId"), 9);
        A0A = Cx8.A08(enumC4485CxE, Cx8.A06("isClearcutClient"), 10);
        A0B = Cx8.A08(enumC4485CxE, Cx8.A06("isStandaloneMlkit"), 11);
        A0C = Cx8.A08(enumC4485CxE, Cx8.A06("isJsonLogging"), 12);
        A0D = Cx8.A08(enumC4485CxE, Cx8.A06("buildLevel"), 13);
        A0E = Cx8.A08(enumC4485CxE, Cx8.A06("optionalModuleVersion"), 14);
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C3689Ccn c3689Ccn = (C3689Ccn) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, c3689Ccn.A06);
        interfaceC3892CgV2.A3F(A02, c3689Ccn.A07);
        interfaceC3892CgV2.A3F(A03, null);
        interfaceC3892CgV2.A3F(A04, c3689Ccn.A08);
        interfaceC3892CgV2.A3F(A05, c3689Ccn.A09);
        interfaceC3892CgV2.A3F(A06, null);
        interfaceC3892CgV2.A3F(A07, null);
        interfaceC3892CgV2.A3F(A08, c3689Ccn.A00);
        interfaceC3892CgV2.A3F(A09, c3689Ccn.A0A);
        interfaceC3892CgV2.A3F(A0A, c3689Ccn.A01);
        interfaceC3892CgV2.A3F(A0B, c3689Ccn.A02);
        interfaceC3892CgV2.A3F(A0C, c3689Ccn.A03);
        interfaceC3892CgV2.A3F(A0D, c3689Ccn.A04);
        interfaceC3892CgV2.A3F(A0E, c3689Ccn.A05);
    }
}
