package com.facebook.aura.maps.scene;

import X.AII;
import X.AIM;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import X.G0U;
import X.HxE;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.net.URLEncoder;

/* loaded from: classes4.dex */
public abstract class HatchMapThemeKt {
    public static final String PARAM_CALLER = "_nc_client_caller";
    public static final String PARAM_LOCALE = "locale";
    public static final String PARAM_SURFACE = "_nc_client_id";

    public static final int backgroundColor(HatchMapTheme hatchMapTheme, boolean z) {
        C7384Etj.A0Y(hatchMapTheme, 0);
        return z ? hatchMapTheme.darkBackgroundColor : hatchMapTheme.lightBackgroundColor;
    }

    public static final int pinLabelColor(HatchMapTheme hatchMapTheme, boolean z) {
        C7384Etj.A0Y(hatchMapTheme, 0);
        return z ? hatchMapTheme.pinLabelColorDark : hatchMapTheme.pinLabelColor;
    }

    public static final String styleUrl(HatchMapTheme hatchMapTheme, boolean z, String str, String str2, String str3) {
        C7384Etj.A0Y(hatchMapTheme, 0);
        String str4 = z ? hatchMapTheme.darkStyleUrl : hatchMapTheme.lightStyleUrl;
        AII aiiA17 = AIM.A17();
        if (str != null && str.length() != 0) {
            AnonymousClass002.A1J(PARAM_LOCALE, str, aiiA17);
        }
        if (str2 != null && str2.length() != 0) {
            AnonymousClass002.A1J(PARAM_SURFACE, str2, aiiA17);
        }
        if (str3 != null && str3.length() != 0) {
            AnonymousClass002.A1J(PARAM_CALLER, str3, aiiA17);
        }
        AII aiiA18 = AIM.A18(aiiA17);
        if (aiiA18.isEmpty()) {
            return str4;
        }
        return AbstractC0878AGe.A0L("&", FGI.A0E(str4, C7BY.A0k(str4, '?') ? '&' : '?'), "", aiiA18, AnonymousClass1.INSTANCE);
    }

    public static /* synthetic */ String styleUrl$default(HatchMapTheme hatchMapTheme, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        return styleUrl(hatchMapTheme, z, str, str2, str3);
    }

    /* renamed from: com.facebook.aura.maps.scene.HatchMapThemeKt$styleUrl$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<HxE<? extends String, ? extends String>, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(HxE<String, String> hxE) {
            C7384Etj.A0Y(hxE, 0);
            return FGI.A0U(hxE.first, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, URLEncoder.encode(hxE.second, HatchWebPageParserKt.UTF_8));
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(HxE<? extends String, ? extends String> hxE) {
            return invoke2((HxE<String, String>) hxE);
        }
    }
}
