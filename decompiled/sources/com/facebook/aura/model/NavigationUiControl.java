package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class NavigationUiControl extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String action;
    public final String mode;
    public final JsonObject params;
    public final String target;

    public final class Companion {
        public final C9hr<NavigationUiControl> serializer() {
            return NavigationUiControl$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(NavigationUiControl navigationUiControl, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(navigationUiControl.action, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(navigationUiControl.target)) {
            c9j5.AAV(navigationUiControl.target, c9iZ, 1);
        }
        if (zAfR || !"perform".equals(navigationUiControl.mode)) {
            c9j5.AAV(navigationUiControl.mode, c9iZ, 2);
        }
        if (zAfR || !C7384Etj.areEqual(navigationUiControl.params, C60O.A1G())) {
            c9j5.AAQ(navigationUiControl.params, JsonObjectSerializer.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NavigationUiControl) {
                NavigationUiControl navigationUiControl = (NavigationUiControl) obj;
                if (!C7384Etj.areEqual(this.action, navigationUiControl.action) || !C7384Etj.areEqual(this.target, navigationUiControl.target) || !C7384Etj.areEqual(this.mode, navigationUiControl.mode) || !C7384Etj.areEqual(this.params, navigationUiControl.params)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ NavigationUiControl(int i, String str, String str2, String str3, JsonObject jsonObject, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(NavigationUiControl$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.action = str;
        this.target = (i & 2) == 0 ? "" : str2;
        if ((i & 4) == 0) {
            this.mode = "perform";
        } else {
            this.mode = str3;
        }
        if ((i & 8) == 0) {
            this.params = C60O.A1G();
        } else {
            this.params = jsonObject;
        }
    }

    public static /* synthetic */ NavigationUiControl copy$default(NavigationUiControl navigationUiControl, String str, String str2, String str3, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = navigationUiControl.action;
        }
        if ((i & 2) != 0) {
            str2 = navigationUiControl.target;
        }
        if ((i & 4) != 0) {
            str3 = navigationUiControl.mode;
        }
        if ((i & 8) != 0) {
            jsonObject = navigationUiControl.params;
        }
        return navigationUiControl.copy(str, str2, str3, jsonObject);
    }

    public final String component1() {
        return this.action;
    }

    public final String component2() {
        return this.target;
    }

    public final String component3() {
        return this.mode;
    }

    public final JsonObject component4() {
        return this.params;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getMode() {
        return this.mode;
    }

    public final JsonObject getParams() {
        return this.params;
    }

    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.params, AnonymousClass005.A0I(this.mode, AnonymousClass005.A0I(this.target, AnonymousClass001.A0G(this.action))));
    }

    public final NavigationUiControl copy(String str, String str2, String str3, JsonObject jsonObject) {
        AnonymousClass005.A14(str, str2, str3, jsonObject);
        return new NavigationUiControl(str, str2, str3, jsonObject);
    }

    public String toString() {
        return super.toString();
    }

    public NavigationUiControl(String str, String str2, String str3, JsonObject jsonObject) {
        AnonymousClass005.A14(str, str2, str3, jsonObject);
        this.action = str;
        this.target = str2;
        this.mode = str3;
        this.params = jsonObject;
    }

    public /* synthetic */ NavigationUiControl(String str, String str2, String str3, JsonObject jsonObject, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "perform" : str3, (i & 8) != 0 ? C60O.A1G() : jsonObject);
    }
}
