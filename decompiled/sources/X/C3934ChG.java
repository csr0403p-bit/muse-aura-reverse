package X;

import com.facebook.aura.maps.scene.HatchMapThemeKt;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.ChG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3934ChG implements InterfaceC3288C9m<AbstractC3931ChD> {
    public static final C3934ChG A00 = new C3934ChG();
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
        Map map = Collections.EMPTY_MAP;
        A0C = C2580BeF.A00("sdkVersion", map);
        A09 = C2580BeF.A00("model", map);
        A05 = C2580BeF.A00("hardware", map);
        A03 = C2580BeF.A00("device", map);
        A0B = C2580BeF.A00("product", map);
        A0A = C2580BeF.A00("osBuild", map);
        A07 = C2580BeF.A00("manufacturer", map);
        A04 = C2580BeF.A00("fingerprint", map);
        A06 = C2580BeF.A00(HatchMapThemeKt.PARAM_LOCALE, map);
        A02 = C2580BeF.A00("country", map);
        A08 = C2580BeF.A00("mccMnc", map);
        A01 = C2580BeF.A00("applicationBuild", map);
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        C3935ChH c3935ChH = (C3935ChH) ((AbstractC3931ChD) obj);
        interfaceC3892CgV2.A3F(A0C, c3935ChH.A00);
        interfaceC3892CgV2.A3F(A09, c3935ChH.A09);
        interfaceC3892CgV2.A3F(A05, c3935ChH.A05);
        interfaceC3892CgV2.A3F(A03, c3935ChH.A03);
        interfaceC3892CgV2.A3F(A0B, c3935ChH.A0B);
        interfaceC3892CgV2.A3F(A0A, c3935ChH.A0A);
        interfaceC3892CgV2.A3F(A07, c3935ChH.A07);
        interfaceC3892CgV2.A3F(A04, c3935ChH.A04);
        interfaceC3892CgV2.A3F(A06, c3935ChH.A06);
        interfaceC3892CgV2.A3F(A02, c3935ChH.A02);
        interfaceC3892CgV2.A3F(A08, c3935ChH.A08);
        interfaceC3892CgV2.A3F(A01, c3935ChH.A01);
    }
}
