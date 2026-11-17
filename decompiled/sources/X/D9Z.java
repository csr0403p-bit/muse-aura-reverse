package X;

import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;

/* loaded from: classes5.dex */
public final class D9Z implements InterfaceC3288C9m {
    public static final D9Z A00 = new D9Z();
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

    static {
        Cx8 cx8A06 = Cx8.A06("deviceInfo");
        EnumC4485CxE enumC4485CxE = EnumC4485CxE.DEFAULT;
        A01 = Cx8.A07(enumC4485CxE, cx8A06);
        A02 = Cx8.A09(enumC4485CxE, "nnapiInfo");
        A03 = Cx8.A0A(enumC4485CxE, "gpuInfo");
        A04 = Cx8.A0B(enumC4485CxE, "pipelineIdentifier");
        A05 = Cx8.A0C(enumC4485CxE, "acceptedConfigurations");
        A06 = Cx8.A0D(enumC4485CxE, "action");
        A07 = Cx8.A0E(enumC4485CxE, AuraDeeplinkRouteMapper.STATUS_ROUTE);
        A08 = Cx8.A08(enumC4485CxE, Cx8.A06("customErrors"), 8);
        A09 = Cx8.A08(enumC4485CxE, Cx8.A06("benchmarkStatus"), 9);
        A0A = Cx8.A08(enumC4485CxE, Cx8.A06("validationTestResult"), 10);
        A0B = Cx8.A08(enumC4485CxE, Cx8.A06("timestampUs"), 11);
        A0C = Cx8.A08(enumC4485CxE, Cx8.A06("elapsedUs"), 12);
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        throw null;
    }
}
