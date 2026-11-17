package com.facebook.aura.spaces.preload;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SpacesShareFileJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String data;
    public final String name;
    public final String title;
    public final String type;

    public final class Companion {
        public final C9hr<SpacesShareFileJson> serializer() {
            return SpacesShareFileJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_preload_preload(SpacesShareFileJson spacesShareFileJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(spacesShareFileJson.type, c9iZ, 0);
        c9j5.AAV(spacesShareFileJson.data, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(spacesShareFileJson.name)) {
            c9j5.AAV(spacesShareFileJson.name, c9iZ, 2);
        }
        if (zAfR || !"".equals(spacesShareFileJson.title)) {
            c9j5.AAV(spacesShareFileJson.title, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpacesShareFileJson) {
                SpacesShareFileJson spacesShareFileJson = (SpacesShareFileJson) obj;
                if (!C7384Etj.areEqual(this.type, spacesShareFileJson.type) || !C7384Etj.areEqual(this.data, spacesShareFileJson.data) || !C7384Etj.areEqual(this.name, spacesShareFileJson.name) || !C7384Etj.areEqual(this.title, spacesShareFileJson.title)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ SpacesShareFileJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SpacesShareFileJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.type = str;
        this.data = str2;
        if ((i & 4) == 0) {
            this.name = "";
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            this.title = "";
        } else {
            this.title = str4;
        }
    }

    public static /* synthetic */ SpacesShareFileJson copy$default(SpacesShareFileJson spacesShareFileJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spacesShareFileJson.type;
        }
        if ((i & 2) != 0) {
            str2 = spacesShareFileJson.data;
        }
        if ((i & 4) != 0) {
            str3 = spacesShareFileJson.name;
        }
        if ((i & 8) != 0) {
            str4 = spacesShareFileJson.title;
        }
        return spacesShareFileJson.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.data;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.title;
    }

    public final String getData() {
        return this.data;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.title, AnonymousClass005.A0I(this.name, AnonymousClass005.A0I(this.data, AnonymousClass001.A0G(this.type))));
    }

    public final SpacesShareFileJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new SpacesShareFileJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public SpacesShareFileJson(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.type = str;
        this.data = str2;
        this.name = str3;
        this.title = str4;
    }

    public /* synthetic */ SpacesShareFileJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
