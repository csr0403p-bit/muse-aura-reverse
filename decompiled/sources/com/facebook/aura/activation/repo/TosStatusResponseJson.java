package com.facebook.aura.activation.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
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
public final class TosStatusResponseJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final TosUpsellCellJson cvm_upsell_cell;
    public final String disclosure_button_text;
    public final List<TosEntityJson> disclosure_entities;
    public final List<TosSectionJson> disclosure_sections;
    public final String disclosure_text;
    public final String disclosure_title;
    public final String disclosure_version;
    public final boolean has_accepted_tos;
    public final TosInfoBannerJson info_banner;
    public final List<TosEntityJson> subscription_disclosure_entities;
    public final String subscription_disclosure_text;
    public final TosUpsellCellJson subscription_upsell_cell;

    public final class Companion {
        public final C9hr<TosStatusResponseJson> serializer() {
            return TosStatusResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, AbstractC5321DgF.A02(num, TosStatusResponseJson$Companion$$childSerializers$1.INSTANCE), null, null, AbstractC5321DgF.A02(num, TosStatusResponseJson$Companion$$childSerializers$2.INSTANCE), null, null, null, null, AbstractC5321DgF.A02(num, TosStatusResponseJson$Companion$$childSerializers$3.INSTANCE)};
    }

    public TosStatusResponseJson(boolean z, String str, String str2, List<TosEntityJson> list, String str3, String str4, List<TosSectionJson> list2, TosUpsellCellJson tosUpsellCellJson, TosUpsellCellJson tosUpsellCellJson2, TosInfoBannerJson tosInfoBannerJson, String str5, List<TosEntityJson> list3) {
        C7384Etj.A0Y(str, 1);
        AnonymousClass005.A16(str2, list, str3, str4, 2);
        C7384Etj.A0Y(list2, 6);
        AnonymousClass002.A1G(str5, 10, list3);
        this.has_accepted_tos = z;
        this.disclosure_text = str;
        this.disclosure_version = str2;
        this.disclosure_entities = list;
        this.disclosure_title = str3;
        this.disclosure_button_text = str4;
        this.disclosure_sections = list2;
        this.cvm_upsell_cell = tosUpsellCellJson;
        this.subscription_upsell_cell = tosUpsellCellJson2;
        this.info_banner = tosInfoBannerJson;
        this.subscription_disclosure_text = str5;
        this.subscription_disclosure_entities = list3;
    }

    public final TosStatusResponseJson copy(boolean z, String str, String str2, List<TosEntityJson> list, String str3, String str4, List<TosSectionJson> list2, TosUpsellCellJson tosUpsellCellJson, TosUpsellCellJson tosUpsellCellJson2, TosInfoBannerJson tosInfoBannerJson, String str5, List<TosEntityJson> list3) {
        C7384Etj.A0Y(str, 1);
        AnonymousClass005.A16(str2, list, str3, str4, 2);
        C7384Etj.A0Y(list2, 6);
        AnonymousClass002.A1G(str5, 10, list3);
        return new TosStatusResponseJson(z, str, str2, list, str3, str4, list2, tosUpsellCellJson, tosUpsellCellJson2, tosInfoBannerJson, str5, list3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TosStatusResponseJson) {
                TosStatusResponseJson tosStatusResponseJson = (TosStatusResponseJson) obj;
                if (this.has_accepted_tos != tosStatusResponseJson.has_accepted_tos || !C7384Etj.areEqual(this.disclosure_text, tosStatusResponseJson.disclosure_text) || !C7384Etj.areEqual(this.disclosure_version, tosStatusResponseJson.disclosure_version) || !C7384Etj.areEqual(this.disclosure_entities, tosStatusResponseJson.disclosure_entities) || !C7384Etj.areEqual(this.disclosure_title, tosStatusResponseJson.disclosure_title) || !C7384Etj.areEqual(this.disclosure_button_text, tosStatusResponseJson.disclosure_button_text) || !C7384Etj.areEqual(this.disclosure_sections, tosStatusResponseJson.disclosure_sections) || !C7384Etj.areEqual(this.cvm_upsell_cell, tosStatusResponseJson.cvm_upsell_cell) || !C7384Etj.areEqual(this.subscription_upsell_cell, tosStatusResponseJson.subscription_upsell_cell) || !C7384Etj.areEqual(this.info_banner, tosStatusResponseJson.info_banner) || !C7384Etj.areEqual(this.subscription_disclosure_text, tosStatusResponseJson.subscription_disclosure_text) || !C7384Etj.areEqual(this.subscription_disclosure_entities, tosStatusResponseJson.subscription_disclosure_entities)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TosStatusResponseJson copy$default(TosStatusResponseJson tosStatusResponseJson, boolean z, String str, String str2, List list, String str3, String str4, List list2, TosUpsellCellJson tosUpsellCellJson, TosUpsellCellJson tosUpsellCellJson2, TosInfoBannerJson tosInfoBannerJson, String str5, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = tosStatusResponseJson.has_accepted_tos;
        }
        if ((i & 2) != 0) {
            str = tosStatusResponseJson.disclosure_text;
        }
        if ((i & 4) != 0) {
            str2 = tosStatusResponseJson.disclosure_version;
        }
        if ((i & 8) != 0) {
            list = tosStatusResponseJson.disclosure_entities;
        }
        if ((i & 16) != 0) {
            str3 = tosStatusResponseJson.disclosure_title;
        }
        if ((i & 32) != 0) {
            str4 = tosStatusResponseJson.disclosure_button_text;
        }
        if ((i & 64) != 0) {
            list2 = tosStatusResponseJson.disclosure_sections;
        }
        if ((i & 128) != 0) {
            tosUpsellCellJson = tosStatusResponseJson.cvm_upsell_cell;
        }
        if ((i & 256) != 0) {
            tosUpsellCellJson2 = tosStatusResponseJson.subscription_upsell_cell;
        }
        if ((i & 512) != 0) {
            tosInfoBannerJson = tosStatusResponseJson.info_banner;
        }
        if ((i & 1024) != 0) {
            str5 = tosStatusResponseJson.subscription_disclosure_text;
        }
        if ((i & 2048) != 0) {
            list3 = tosStatusResponseJson.subscription_disclosure_entities;
        }
        return tosStatusResponseJson.copy(z, str, str2, list, str3, str4, list2, tosUpsellCellJson, tosUpsellCellJson2, tosInfoBannerJson, str5, list3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(TosStatusResponseJson tosStatusResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || tosStatusResponseJson.has_accepted_tos) {
            c9j5.AA7(c9iZ, 0, tosStatusResponseJson.has_accepted_tos);
        }
        if (zAfR || !"".equals(tosStatusResponseJson.disclosure_text)) {
            c9j5.AAV(tosStatusResponseJson.disclosure_text, c9iZ, 1);
        }
        if (zAfR || !"".equals(tosStatusResponseJson.disclosure_version)) {
            c9j5.AAV(tosStatusResponseJson.disclosure_version, c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(tosStatusResponseJson.disclosure_entities)) {
            c9j5.AAQ(tosStatusResponseJson.disclosure_entities, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || !"".equals(tosStatusResponseJson.disclosure_title)) {
            c9j5.AAV(tosStatusResponseJson.disclosure_title, c9iZ, 4);
        }
        if (zAfR || !"".equals(tosStatusResponseJson.disclosure_button_text)) {
            c9j5.AAV(tosStatusResponseJson.disclosure_button_text, c9iZ, 5);
        }
        if (zAfR || !C3cG.A1L(tosStatusResponseJson.disclosure_sections)) {
            c9j5.AAQ(tosStatusResponseJson.disclosure_sections, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
        if (zAfR || tosStatusResponseJson.cvm_upsell_cell != null) {
            c9j5.AAP(tosStatusResponseJson.cvm_upsell_cell, TosUpsellCellJson$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || tosStatusResponseJson.subscription_upsell_cell != null) {
            c9j5.AAP(tosStatusResponseJson.subscription_upsell_cell, TosUpsellCellJson$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || tosStatusResponseJson.info_banner != null) {
            c9j5.AAP(tosStatusResponseJson.info_banner, TosInfoBannerJson$$serializer.INSTANCE, c9iZ, 9);
        }
        if (zAfR || !"".equals(tosStatusResponseJson.subscription_disclosure_text)) {
            c9j5.AAV(tosStatusResponseJson.subscription_disclosure_text, c9iZ, 10);
        }
        if (zAfR || !C3cG.A1L(tosStatusResponseJson.subscription_disclosure_entities)) {
            c9j5.AAQ(tosStatusResponseJson.subscription_disclosure_entities, C3cH.A15(f0cArr, 11), c9iZ, 11);
        }
    }

    public final boolean component1() {
        return this.has_accepted_tos;
    }

    public final TosInfoBannerJson component10() {
        return this.info_banner;
    }

    public final String component11() {
        return this.subscription_disclosure_text;
    }

    public final List<TosEntityJson> component12() {
        return this.subscription_disclosure_entities;
    }

    public final String component2() {
        return this.disclosure_text;
    }

    public final String component3() {
        return this.disclosure_version;
    }

    public final List<TosEntityJson> component4() {
        return this.disclosure_entities;
    }

    public final String component5() {
        return this.disclosure_title;
    }

    public final String component6() {
        return this.disclosure_button_text;
    }

    public final List<TosSectionJson> component7() {
        return this.disclosure_sections;
    }

    public final TosUpsellCellJson component8() {
        return this.cvm_upsell_cell;
    }

    public final TosUpsellCellJson component9() {
        return this.subscription_upsell_cell;
    }

    public final TosUpsellCellJson getCvm_upsell_cell() {
        return this.cvm_upsell_cell;
    }

    public final String getDisclosure_button_text() {
        return this.disclosure_button_text;
    }

    public final List<TosEntityJson> getDisclosure_entities() {
        return this.disclosure_entities;
    }

    public final List<TosSectionJson> getDisclosure_sections() {
        return this.disclosure_sections;
    }

    public final String getDisclosure_text() {
        return this.disclosure_text;
    }

    public final String getDisclosure_title() {
        return this.disclosure_title;
    }

    public final String getDisclosure_version() {
        return this.disclosure_version;
    }

    public final boolean getHas_accepted_tos() {
        return this.has_accepted_tos;
    }

    public final TosInfoBannerJson getInfo_banner() {
        return this.info_banner;
    }

    public final List<TosEntityJson> getSubscription_disclosure_entities() {
        return this.subscription_disclosure_entities;
    }

    public final String getSubscription_disclosure_text() {
        return this.subscription_disclosure_text;
    }

    public final TosUpsellCellJson getSubscription_upsell_cell() {
        return this.subscription_upsell_cell;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.subscription_disclosure_entities, AnonymousClass005.A0I(this.subscription_disclosure_text, (((((AnonymousClass005.A0F(this.disclosure_sections, AnonymousClass005.A0I(this.disclosure_button_text, AnonymousClass005.A0I(this.disclosure_title, AnonymousClass005.A0F(this.disclosure_entities, AnonymousClass005.A0I(this.disclosure_version, AnonymousClass005.A0I(this.disclosure_text, C0KA.A02(this.has_accepted_tos))))))) + AnonymousClass006.A0D(this.cvm_upsell_cell)) * 31) + AnonymousClass006.A0D(this.subscription_upsell_cell)) * 31) + C3cH.A02(this.info_banner)) * 31));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TosStatusResponseJson(int i, boolean z, String str, String str2, List list, String str3, String str4, List list2, TosUpsellCellJson tosUpsellCellJson, TosUpsellCellJson tosUpsellCellJson2, TosInfoBannerJson tosInfoBannerJson, String str5, List list3, C2hx c2hx) {
        this.has_accepted_tos = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.disclosure_text = "";
        } else {
            this.disclosure_text = str;
        }
        if ((i & 4) == 0) {
            this.disclosure_version = "";
        } else {
            this.disclosure_version = str2;
        }
        if ((i & 8) == 0) {
            this.disclosure_entities = C0881AGi.A00;
        } else {
            this.disclosure_entities = list;
        }
        if ((i & 16) == 0) {
            this.disclosure_title = "";
        } else {
            this.disclosure_title = str3;
        }
        if ((i & 32) == 0) {
            this.disclosure_button_text = "";
        } else {
            this.disclosure_button_text = str4;
        }
        if ((i & 64) == 0) {
            this.disclosure_sections = C0881AGi.A00;
        } else {
            this.disclosure_sections = list2;
        }
        if ((i & 128) == 0) {
            this.cvm_upsell_cell = null;
        } else {
            this.cvm_upsell_cell = tosUpsellCellJson;
        }
        if ((i & 256) == 0) {
            this.subscription_upsell_cell = null;
        } else {
            this.subscription_upsell_cell = tosUpsellCellJson2;
        }
        if ((i & 512) == 0) {
            this.info_banner = null;
        } else {
            this.info_banner = tosInfoBannerJson;
        }
        if ((i & 1024) == 0) {
            this.subscription_disclosure_text = "";
        } else {
            this.subscription_disclosure_text = str5;
        }
        this.subscription_disclosure_entities = (i & 2048) == 0 ? C0881AGi.A00 : list3;
    }

    public /* synthetic */ TosStatusResponseJson(boolean z, String str, String str2, List list, String str3, String str4, List list2, TosUpsellCellJson tosUpsellCellJson, TosUpsellCellJson tosUpsellCellJson2, TosInfoBannerJson tosInfoBannerJson, String str5, List list3, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? C0881AGi.A00 : list, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? C0881AGi.A00 : list2, (i & 128) != 0 ? null : tosUpsellCellJson, (i & 256) != 0 ? null : tosUpsellCellJson2, (i & 512) == 0 ? tosInfoBannerJson : null, (i & 1024) == 0 ? str5 : "", (i & 2048) != 0 ? C0881AGi.A00 : list3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TosStatusResponseJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(false, "", "", c0881AGi, "", "", c0881AGi, null, null, null, "", c0881AGi);
    }
}
