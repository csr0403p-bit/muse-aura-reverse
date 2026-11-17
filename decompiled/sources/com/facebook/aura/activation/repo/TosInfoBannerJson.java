package com.facebook.aura.activation.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.activation.data.HatchDisclosureText;
import com.facebook.aura.activation.data.HatchInfoBanner;
import com.facebook.aura.activation.data.HatchInfoSheetSection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class TosInfoBannerJson extends C06G {
    public final String sheet_button_text;
    public final List<TosInfoSheetSectionJson> sheet_sections;
    public final String text;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, TosInfoBannerJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<TosInfoBannerJson> serializer() {
            return TosInfoBannerJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TosInfoBannerJson) {
                TosInfoBannerJson tosInfoBannerJson = (TosInfoBannerJson) obj;
                if (!C7384Etj.areEqual(this.text, tosInfoBannerJson.text) || !C7384Etj.areEqual(this.sheet_sections, tosInfoBannerJson.sheet_sections) || !C7384Etj.areEqual(this.sheet_button_text, tosInfoBannerJson.sheet_button_text)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TosInfoBannerJson copy$default(TosInfoBannerJson tosInfoBannerJson, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tosInfoBannerJson.text;
        }
        if ((i & 2) != 0) {
            list = tosInfoBannerJson.sheet_sections;
        }
        if ((i & 4) != 0) {
            str2 = tosInfoBannerJson.sheet_button_text;
        }
        return tosInfoBannerJson.copy(str, list, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(TosInfoBannerJson tosInfoBannerJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(tosInfoBannerJson.text)) {
            c9j5.AAV(tosInfoBannerJson.text, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(tosInfoBannerJson.sheet_sections)) {
            c9j5.AAQ(tosInfoBannerJson.sheet_sections, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || !"".equals(tosInfoBannerJson.sheet_button_text)) {
            c9j5.AAV(tosInfoBannerJson.sheet_button_text, c9iZ, 2);
        }
    }

    public final String component1() {
        return this.text;
    }

    public final List<TosInfoSheetSectionJson> component2() {
        return this.sheet_sections;
    }

    public final String component3() {
        return this.sheet_button_text;
    }

    public final String getSheet_button_text() {
        return this.sheet_button_text;
    }

    public final List<TosInfoSheetSectionJson> getSheet_sections() {
        return this.sheet_sections;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.sheet_button_text, AnonymousClass005.A0F(this.sheet_sections, AnonymousClass001.A0G(this.text)));
    }

    public final HatchInfoBanner toDomain() {
        List<TosInfoSheetSectionJson> list = this.sheet_sections;
        ArrayList<TosInfoSheetSectionJson> arrayListA0h = C3cG.A0h();
        for (TosInfoSheetSectionJson tosInfoSheetSectionJson : list) {
            TosInfoSheetSectionJson tosInfoSheetSectionJson2 = tosInfoSheetSectionJson;
            if (!C7BY.A0j(tosInfoSheetSectionJson2.title)) {
                AnonymousClass006.A1F(tosInfoSheetSectionJson2.body, tosInfoSheetSectionJson, arrayListA0h);
            }
        }
        ArrayList arrayListA0m = AnonymousClass002.A0m(arrayListA0h);
        for (TosInfoSheetSectionJson tosInfoSheetSectionJson3 : arrayListA0h) {
            String str = tosInfoSheetSectionJson3.title;
            String str2 = tosInfoSheetSectionJson3.body;
            List<TosEntityJson> list2 = tosInfoSheetSectionJson3.body_entities;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
            Iterator<TosEntityJson> it = list2.iterator();
            while (it.hasNext()) {
                arrayListA0m2.add(it.next().toDomain());
            }
            arrayListA0m.add(new HatchInfoSheetSection(str, new HatchDisclosureText(str2, arrayListA0m2)));
        }
        if (C7BY.A0j(this.text) || C7BY.A0j(this.sheet_button_text) || arrayListA0m.isEmpty()) {
            return null;
        }
        return new HatchInfoBanner(this.text, arrayListA0m, this.sheet_button_text);
    }

    public TosInfoBannerJson(String str, List<TosInfoSheetSectionJson> list, String str2) {
        AnonymousClass005.A0x(str, list, str2);
        this.text = str;
        this.sheet_sections = list;
        this.sheet_button_text = str2;
    }

    public final TosInfoBannerJson copy(String str, List<TosInfoSheetSectionJson> list, String str2) {
        AnonymousClass005.A0x(str, list, str2);
        return new TosInfoBannerJson(str, list, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TosInfoBannerJson(int i, String str, List list, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.text = "";
        } else {
            this.text = str;
        }
        if ((i & 2) == 0) {
            this.sheet_sections = C0881AGi.A00;
        } else {
            this.sheet_sections = list;
        }
        if ((i & 4) == 0) {
            this.sheet_button_text = "";
        } else {
            this.sheet_button_text = str2;
        }
    }

    public /* synthetic */ TosInfoBannerJson(String str, List list, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, C3cI.A11(list, i), (i & 4) != 0 ? "" : str2);
    }

    public TosInfoBannerJson() {
        this("", C0881AGi.A00, "");
    }
}
