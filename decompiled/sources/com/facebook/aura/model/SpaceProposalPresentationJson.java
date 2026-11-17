package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SpaceProposalPresentationJson extends C06G {
    public static final int $stable = 8;
    public final String constructionStatus;
    public final String construction_status;
    public final String description;
    public final List<String> features;
    public final String image_url;
    public final String name;
    public final String slug;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, AbstractC5321DgF.A02(C79.A01, SpaceProposalPresentationJson$Companion$$childSerializers$1.INSTANCE), null, null, null};

    public final class Companion {
        public final C9hr<SpaceProposalPresentationJson> serializer() {
            return SpaceProposalPresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceProposalPresentationJson) {
                SpaceProposalPresentationJson spaceProposalPresentationJson = (SpaceProposalPresentationJson) obj;
                if (!C7384Etj.areEqual(this.name, spaceProposalPresentationJson.name) || !C7384Etj.areEqual(this.slug, spaceProposalPresentationJson.slug) || !C7384Etj.areEqual(this.description, spaceProposalPresentationJson.description) || !C7384Etj.areEqual(this.features, spaceProposalPresentationJson.features) || !C7384Etj.areEqual(this.image_url, spaceProposalPresentationJson.image_url) || !C7384Etj.areEqual(this.constructionStatus, spaceProposalPresentationJson.constructionStatus) || !C7384Etj.areEqual(this.construction_status, spaceProposalPresentationJson.construction_status)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpaceProposalPresentationJson copy$default(SpaceProposalPresentationJson spaceProposalPresentationJson, String str, String str2, String str3, List list, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceProposalPresentationJson.name;
        }
        if ((i & 2) != 0) {
            str2 = spaceProposalPresentationJson.slug;
        }
        if ((i & 4) != 0) {
            str3 = spaceProposalPresentationJson.description;
        }
        if ((i & 8) != 0) {
            list = spaceProposalPresentationJson.features;
        }
        if ((i & 16) != 0) {
            str4 = spaceProposalPresentationJson.image_url;
        }
        if ((i & 32) != 0) {
            str5 = spaceProposalPresentationJson.constructionStatus;
        }
        if ((i & 64) != 0) {
            str6 = spaceProposalPresentationJson.construction_status;
        }
        return spaceProposalPresentationJson.copy(str, str2, str3, list, str4, str5, str6);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(SpaceProposalPresentationJson spaceProposalPresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(spaceProposalPresentationJson.name)) {
            c9j5.AAV(spaceProposalPresentationJson.name, c9iZ, 0);
        }
        if (zAfR || !"".equals(spaceProposalPresentationJson.slug)) {
            c9j5.AAV(spaceProposalPresentationJson.slug, c9iZ, 1);
        }
        if (zAfR || !"".equals(spaceProposalPresentationJson.description)) {
            c9j5.AAV(spaceProposalPresentationJson.description, c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(spaceProposalPresentationJson.features)) {
            c9j5.AAQ(spaceProposalPresentationJson.features, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || !"".equals(spaceProposalPresentationJson.image_url)) {
            c9j5.AAV(spaceProposalPresentationJson.image_url, c9iZ, 4);
        }
        if (zAfR || !"".equals(spaceProposalPresentationJson.constructionStatus)) {
            c9j5.AAV(spaceProposalPresentationJson.constructionStatus, c9iZ, 5);
        }
        if (zAfR || !"".equals(spaceProposalPresentationJson.construction_status)) {
            c9j5.AAV(spaceProposalPresentationJson.construction_status, c9iZ, 6);
        }
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.slug;
    }

    public final String component3() {
        return this.description;
    }

    public final List<String> component4() {
        return this.features;
    }

    public final String component5() {
        return this.image_url;
    }

    public final String component6() {
        return this.constructionStatus;
    }

    public final String component7() {
        return this.construction_status;
    }

    public final String getConstructionStatus() {
        return this.constructionStatus;
    }

    public final String getConstruction_status() {
        return this.construction_status;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getFeatures() {
        return this.features;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.construction_status, AnonymousClass005.A0I(this.constructionStatus, AnonymousClass005.A0I(this.image_url, AnonymousClass005.A0F(this.features, AnonymousClass005.A0I(this.description, AnonymousClass005.A0I(this.slug, AnonymousClass001.A0G(this.name)))))));
    }

    public final SpaceProposalPresentation toDomain() {
        String strA0l = AnonymousClass002.A0l(this.name);
        if (strA0l.length() <= 0) {
            return null;
        }
        String str = this.constructionStatus;
        if (C7BY.A0j(str)) {
            str = this.construction_status;
        }
        String str2 = this.slug;
        String str3 = null;
        if (str2.length() > 0) {
            str3 = str2;
        }
        String str4 = this.description;
        List<String> list = this.features;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        String str5 = this.image_url;
        return new SpaceProposalPresentation(strA0l, str3, str4, arrayListA0h, str5.length() > 0 ? str5 : null, SpaceConstructionStatus.Companion.fromServerValue(str));
    }

    public /* synthetic */ SpaceProposalPresentationJson(int i, String str, String str2, String str3, List list, String str4, String str5, String str6, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.slug = "";
        } else {
            this.slug = str2;
        }
        if ((i & 4) == 0) {
            this.description = "";
        } else {
            this.description = str3;
        }
        if ((i & 8) == 0) {
            this.features = C0881AGi.A00;
        } else {
            this.features = list;
        }
        if ((i & 16) == 0) {
            this.image_url = "";
        } else {
            this.image_url = str4;
        }
        if ((i & 32) == 0) {
            this.constructionStatus = "";
        } else {
            this.constructionStatus = str5;
        }
        if ((i & 64) == 0) {
            this.construction_status = "";
        } else {
            this.construction_status = str6;
        }
    }

    public final SpaceProposalPresentationJson copy(String str, String str2, String str3, List<String> list, String str4, String str5, String str6) {
        AnonymousClass005.A17(str, str2, str3, list, str4);
        AnonymousClass003.A0z(str5, str6);
        return new SpaceProposalPresentationJson(str, str2, str3, list, str4, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceProposalPresentationJson(String str, String str2, String str3, List list, String str4, String str5, String str6, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? C0881AGi.A00 : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6);
    }

    public SpaceProposalPresentationJson(String str, String str2, String str3, List<String> list, String str4, String str5, String str6) {
        AnonymousClass005.A17(str, str2, str3, list, str4);
        AnonymousClass003.A0z(str5, str6);
        this.name = str;
        this.slug = str2;
        this.description = str3;
        this.features = list;
        this.image_url = str4;
        this.constructionStatus = str5;
        this.construction_status = str6;
    }

    public SpaceProposalPresentationJson() {
        this("", "", "", C0881AGi.A00, "", "", "");
    }
}
