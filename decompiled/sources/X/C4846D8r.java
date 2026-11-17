package X;

import com.facebook.aura.library.view.HatchGoalsTabScreenKt;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;

/* renamed from: X.D8r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4846D8r implements InterfaceC3288C9m {
    public static final C4846D8r A00 = new C4846D8r();
    public static final C2580BeF A01;
    public static final C2580BeF A02;
    public static final C2580BeF A03;
    public static final C2580BeF A04;
    public static final C2580BeF A05;
    public static final C2580BeF A06;

    static {
        Cx8 cx8A06 = Cx8.A06(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM);
        EnumC4485CxE enumC4485CxE = EnumC4485CxE.DEFAULT;
        A01 = Cx8.A07(enumC4485CxE, cx8A06);
        A02 = Cx8.A09(enumC4485CxE, "landmark");
        A03 = Cx8.A0A(enumC4485CxE, "classification");
        A04 = Cx8.A0B(enumC4485CxE, "prominentFaceOnly");
        A05 = Cx8.A0C(enumC4485CxE, HatchGoalsTabScreenKt.GOALS_SECTION_TRACKING);
        A06 = Cx8.A0D(enumC4485CxE, "minFaceSize");
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        throw null;
    }
}
