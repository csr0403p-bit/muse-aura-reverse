package X;

import com.facebook.aura.bloks.data.AuraBloksDataProps;

/* renamed from: X.CqM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4214CqM implements InterfaceC3288C9m {
    public static final C4214CqM A00 = new C4214CqM();
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
        EnumC4487CxG enumC4487CxG = EnumC4487CxG.DEFAULT;
        A01 = Cx8.A0N(enumC4487CxG, cx8A06);
        A02 = Cx8.A0P(enumC4487CxG, "appVersion");
        A03 = Cx8.A0Q(enumC4487CxG, "firebaseProjectId");
        A04 = Cx8.A0R(enumC4487CxG, "mlSdkVersion");
        A05 = Cx8.A0S(enumC4487CxG, "tfliteSchemaVersion");
        A06 = Cx8.A0T(enumC4487CxG, "gcmSenderId");
        A07 = Cx8.A0U(enumC4487CxG, "apiKey");
        A08 = Cx8.A0O(enumC4487CxG, Cx8.A06("languages"), 8);
        A09 = Cx8.A0O(enumC4487CxG, Cx8.A06("mlSdkInstanceId"), 9);
        A0A = Cx8.A0O(enumC4487CxG, Cx8.A06("isClearcutClient"), 10);
        A0B = Cx8.A0O(enumC4487CxG, Cx8.A06("isStandaloneMlkit"), 11);
        A0C = Cx8.A0O(enumC4487CxG, Cx8.A06("isJsonLogging"), 12);
        A0D = Cx8.A0O(enumC4487CxG, Cx8.A06("buildLevel"), 13);
        A0E = Cx8.A0O(enumC4487CxG, Cx8.A06("optionalModuleVersion"), 14);
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        C3705Cd3 c3705Cd3 = (C3705Cd3) obj;
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        interfaceC3892CgV2.A3F(A01, c3705Cd3.A06);
        interfaceC3892CgV2.A3F(A02, c3705Cd3.A07);
        interfaceC3892CgV2.A3F(A03, null);
        interfaceC3892CgV2.A3F(A04, c3705Cd3.A08);
        interfaceC3892CgV2.A3F(A05, c3705Cd3.A09);
        interfaceC3892CgV2.A3F(A06, null);
        interfaceC3892CgV2.A3F(A07, null);
        interfaceC3892CgV2.A3F(A08, c3705Cd3.A00);
        interfaceC3892CgV2.A3F(A09, c3705Cd3.A0A);
        interfaceC3892CgV2.A3F(A0A, c3705Cd3.A01);
        interfaceC3892CgV2.A3F(A0B, c3705Cd3.A02);
        interfaceC3892CgV2.A3F(A0C, c3705Cd3.A03);
        interfaceC3892CgV2.A3F(A0D, c3705Cd3.A04);
        interfaceC3892CgV2.A3F(A0E, c3705Cd3.A05);
    }
}
