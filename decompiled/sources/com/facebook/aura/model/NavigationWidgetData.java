package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class NavigationWidgetData extends C06G implements HatchWidgetData {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String cta;
    public final String icon;
    public final String imagePath;
    public final String subtitle;
    public final String summary;
    public final String title;
    public final NavigationUiControl uiControl;

    public final class Companion {
        public final C9hr<NavigationWidgetData> serializer() {
            return NavigationWidgetData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ NavigationWidgetData copy$default(NavigationWidgetData navigationWidgetData, String str, String str2, String str3, String str4, NavigationUiControl navigationUiControl, String str5, String str6, int i, Object obj) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        NavigationUiControl navigationUiControl2 = navigationUiControl;
        String str11 = str5;
        String str12 = str6;
        if ((i & 1) != 0) {
            str7 = navigationWidgetData.title;
        }
        if ((i & 2) != 0) {
            str8 = navigationWidgetData.summary;
        }
        if ((i & 4) != 0) {
            str9 = navigationWidgetData.icon;
        }
        if ((i & 8) != 0) {
            str10 = navigationWidgetData.imagePath;
        }
        if ((i & 16) != 0) {
            navigationUiControl2 = navigationWidgetData.uiControl;
        }
        if ((i & 32) != 0) {
            str11 = navigationWidgetData.cta;
        }
        if ((i & 64) != 0) {
            str12 = navigationWidgetData.subtitle;
        }
        AnonymousClass003.A0u(str7, str8);
        return new NavigationWidgetData(str7, str8, str9, str10, navigationUiControl2, str11, str12);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(NavigationWidgetData navigationWidgetData, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(navigationWidgetData.title, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(navigationWidgetData.summary)) {
            c9j5.AAV(navigationWidgetData.summary, c9iZ, 1);
        }
        if (zAfR || navigationWidgetData.icon != null) {
            c9j5.AAP(navigationWidgetData.icon, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || navigationWidgetData.imagePath != null) {
            c9j5.AAP(navigationWidgetData.imagePath, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || navigationWidgetData.uiControl != null) {
            c9j5.AAP(navigationWidgetData.uiControl, NavigationUiControl$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || navigationWidgetData.cta != null) {
            c9j5.AAP(navigationWidgetData.cta, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || navigationWidgetData.subtitle != null) {
            c9j5.AAP(navigationWidgetData.subtitle, C07779iq.A01, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NavigationWidgetData) {
                NavigationWidgetData navigationWidgetData = (NavigationWidgetData) obj;
                if (!C7384Etj.areEqual(this.title, navigationWidgetData.title) || !C7384Etj.areEqual(this.summary, navigationWidgetData.summary) || !C7384Etj.areEqual(this.icon, navigationWidgetData.icon) || !C7384Etj.areEqual(this.imagePath, navigationWidgetData.imagePath) || !C7384Etj.areEqual(this.uiControl, navigationWidgetData.uiControl) || !C7384Etj.areEqual(this.cta, navigationWidgetData.cta) || !C7384Etj.areEqual(this.subtitle, navigationWidgetData.subtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ NavigationWidgetData(int i, String str, String str2, String str3, String str4, NavigationUiControl navigationUiControl, String str5, String str6, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(NavigationWidgetData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.title = str;
        this.summary = (i & 2) == 0 ? "" : str2;
        if ((i & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = str3;
        }
        if ((i & 8) == 0) {
            this.imagePath = null;
        } else {
            this.imagePath = str4;
        }
        if ((i & 16) == 0) {
            this.uiControl = null;
        } else {
            this.uiControl = navigationUiControl;
        }
        if ((i & 32) == 0) {
            this.cta = null;
        } else {
            this.cta = str5;
        }
        if ((i & 64) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str6;
        }
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.summary;
    }

    public final String component3() {
        return this.icon;
    }

    public final String component4() {
        return this.imagePath;
    }

    public final NavigationUiControl component5() {
        return this.uiControl;
    }

    public final String component6() {
        return this.cta;
    }

    public final String component7() {
        return this.subtitle;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public final NavigationUiControl getUiControl() {
        return this.uiControl;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0I(this.summary, AnonymousClass001.A0G(this.title)) + AnonymousClass006.A0G(this.icon)) * 31) + AnonymousClass006.A0G(this.imagePath)) * 31) + AnonymousClass006.A0D(this.uiControl)) * 31) + AnonymousClass006.A0G(this.cta)) * 31) + AnonymousClass005.A0H(this.subtitle);
    }

    public final NavigationWidgetData copy(String str, String str2, String str3, String str4, NavigationUiControl navigationUiControl, String str5, String str6) {
        AnonymousClass003.A0u(str, str2);
        return new NavigationWidgetData(str, str2, str3, str4, navigationUiControl, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NavigationWidgetData(String str, String str2, String str3, String str4, NavigationUiControl navigationUiControl, String str5, String str6, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : navigationUiControl, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }

    public NavigationWidgetData(String str, String str2, String str3, String str4, NavigationUiControl navigationUiControl, String str5, String str6) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.summary = str2;
        this.icon = str3;
        this.imagePath = str4;
        this.uiControl = navigationUiControl;
        this.cta = str5;
        this.subtitle = str6;
    }
}
