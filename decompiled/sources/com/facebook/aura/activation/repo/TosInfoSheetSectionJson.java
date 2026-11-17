package com.facebook.aura.activation.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class TosInfoSheetSectionJson extends C06G {
    public final String body;
    public final List<TosEntityJson> body_entities;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, TosInfoSheetSectionJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<TosInfoSheetSectionJson> serializer() {
            return TosInfoSheetSectionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TosInfoSheetSectionJson) {
                TosInfoSheetSectionJson tosInfoSheetSectionJson = (TosInfoSheetSectionJson) obj;
                if (!C7384Etj.areEqual(this.title, tosInfoSheetSectionJson.title) || !C7384Etj.areEqual(this.body, tosInfoSheetSectionJson.body) || !C7384Etj.areEqual(this.body_entities, tosInfoSheetSectionJson.body_entities)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TosInfoSheetSectionJson copy$default(TosInfoSheetSectionJson tosInfoSheetSectionJson, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tosInfoSheetSectionJson.title;
        }
        if ((i & 2) != 0) {
            str2 = tosInfoSheetSectionJson.body;
        }
        if ((i & 4) != 0) {
            list = tosInfoSheetSectionJson.body_entities;
        }
        return tosInfoSheetSectionJson.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(TosInfoSheetSectionJson tosInfoSheetSectionJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(tosInfoSheetSectionJson.title)) {
            c9j5.AAV(tosInfoSheetSectionJson.title, c9iZ, 0);
        }
        if (zAfR || !"".equals(tosInfoSheetSectionJson.body)) {
            c9j5.AAV(tosInfoSheetSectionJson.body, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(tosInfoSheetSectionJson.body_entities)) {
            c9j5.AAQ(tosInfoSheetSectionJson.body_entities, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final List<TosEntityJson> component3() {
        return this.body_entities;
    }

    public final String getBody() {
        return this.body;
    }

    public final List<TosEntityJson> getBody_entities() {
        return this.body_entities;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.body_entities, AnonymousClass005.A0I(this.body, AnonymousClass001.A0G(this.title)));
    }

    public TosInfoSheetSectionJson(String str, String str2, List<TosEntityJson> list) {
        AnonymousClass005.A0x(str, str2, list);
        this.title = str;
        this.body = str2;
        this.body_entities = list;
    }

    public final TosInfoSheetSectionJson copy(String str, String str2, List<TosEntityJson> list) {
        AnonymousClass005.A0x(str, str2, list);
        return new TosInfoSheetSectionJson(str, str2, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TosInfoSheetSectionJson(int i, String str, String str2, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.body = "";
        } else {
            this.body = str2;
        }
        if ((i & 4) == 0) {
            this.body_entities = C0881AGi.A00;
        } else {
            this.body_entities = list;
        }
    }

    public /* synthetic */ TosInfoSheetSectionJson(String str, String str2, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C0881AGi.A00 : list);
    }

    public TosInfoSheetSectionJson() {
        this("", "", C0881AGi.A00);
    }
}
