package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes3.dex */
public final class SpaceProposalPresentation extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final SpaceConstructionStatus constructionStatus;
    public final String description;
    public final List<String> features;
    public final String imageUrl;
    public final String name;
    public final String slug;

    public final class Companion {
        public final C9hr<SpaceProposalPresentation> serializer() {
            return SpaceProposalPresentation$$serializer.INSTANCE;
        }

        public final SpaceProposalPresentation fromJson(JsonElement jsonElement) {
            return HatchMessageJsonKt.parseSpaceProposalPresentation(jsonElement);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, AbstractC5321DgF.A02(num, SpaceProposalPresentation$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, SpaceProposalPresentation$Companion$$childSerializers$2.INSTANCE)};
    }

    public SpaceProposalPresentation(String str, String str2, String str3, List<String> list, String str4, SpaceConstructionStatus spaceConstructionStatus) {
        AnonymousClass005.A11(str, str3, list, 0);
        this.name = str;
        this.slug = str2;
        this.description = str3;
        this.features = list;
        this.imageUrl = str4;
        this.constructionStatus = spaceConstructionStatus;
    }

    public final SpaceProposalPresentation copy(String str, String str2, String str3, List<String> list, String str4, SpaceConstructionStatus spaceConstructionStatus) {
        AnonymousClass005.A11(str, str3, list, 0);
        return new SpaceProposalPresentation(str, str2, str3, list, str4, spaceConstructionStatus);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceProposalPresentation) {
                SpaceProposalPresentation spaceProposalPresentation = (SpaceProposalPresentation) obj;
                if (!C7384Etj.areEqual(this.name, spaceProposalPresentation.name) || !C7384Etj.areEqual(this.slug, spaceProposalPresentation.slug) || !C7384Etj.areEqual(this.description, spaceProposalPresentation.description) || !C7384Etj.areEqual(this.features, spaceProposalPresentation.features) || !C7384Etj.areEqual(this.imageUrl, spaceProposalPresentation.imageUrl) || this.constructionStatus != spaceProposalPresentation.constructionStatus) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpaceProposalPresentation copy$default(SpaceProposalPresentation spaceProposalPresentation, String str, String str2, String str3, List list, String str4, SpaceConstructionStatus spaceConstructionStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceProposalPresentation.name;
        }
        if ((i & 2) != 0) {
            str2 = spaceProposalPresentation.slug;
        }
        if ((i & 4) != 0) {
            str3 = spaceProposalPresentation.description;
        }
        if ((i & 8) != 0) {
            list = spaceProposalPresentation.features;
        }
        if ((i & 16) != 0) {
            str4 = spaceProposalPresentation.imageUrl;
        }
        if ((i & 32) != 0) {
            spaceConstructionStatus = spaceProposalPresentation.constructionStatus;
        }
        return spaceProposalPresentation.copy(str, str2, str3, list, str4, spaceConstructionStatus);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(SpaceProposalPresentation spaceProposalPresentation, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(spaceProposalPresentation.name, c9iZ, 0);
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(spaceProposalPresentation.slug, c07779iq, c9iZ, 1);
        c9j5.AAV(spaceProposalPresentation.description, c9iZ, 2);
        c9j5.AAQ(spaceProposalPresentation.features, C3cH.A15(f0cArr, 3), c9iZ, 3);
        c9j5.AAP(spaceProposalPresentation.imageUrl, c07779iq, c9iZ, 4);
        if (c9j5.AfR() || spaceProposalPresentation.constructionStatus != null) {
            c9j5.AAP(spaceProposalPresentation.constructionStatus, C3cH.A15(f0cArr, 5), c9iZ, 5);
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
        return this.imageUrl;
    }

    public final SpaceConstructionStatus component6() {
        return this.constructionStatus;
    }

    public final SpaceConstructionStatus getConstructionStatus() {
        return this.constructionStatus;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getFeatures() {
        return this.features;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.features, AnonymousClass005.A0I(this.description, (AnonymousClass001.A0G(this.name) + AnonymousClass006.A0G(this.slug)) * 31)) + AnonymousClass006.A0G(this.imageUrl)) * 31) + C3cH.A02(this.constructionStatus);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceProposalPresentation(String str, String str2, String str3, List list, String str4, SpaceConstructionStatus spaceConstructionStatus, int i, C06H c06h) {
        this(str, str2, str3, list, str4, (i & 32) != 0 ? null : spaceConstructionStatus);
    }

    public /* synthetic */ SpaceProposalPresentation(int i, String str, String str2, String str3, List list, String str4, SpaceConstructionStatus spaceConstructionStatus, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(SpaceProposalPresentation$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.name = str;
        this.slug = str2;
        this.description = str3;
        this.features = list;
        this.imageUrl = str4;
        this.constructionStatus = (i & 32) == 0 ? null : spaceConstructionStatus;
    }
}
