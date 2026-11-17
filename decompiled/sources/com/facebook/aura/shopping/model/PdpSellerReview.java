package com.facebook.aura.shopping.model;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07799it;
import X.C0881AGi;
import X.C2hx;
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

@Serializable
/* loaded from: classes.dex */
public final class PdpSellerReview extends C06G {
    public static final int $stable = 8;
    public final Double rating;
    public final String reviewId;
    public final String reviewerName;
    public final String reviewerPicUrl;
    public final List<String> tags;
    public final String text;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, PdpSellerReview$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<PdpSellerReview> serializer() {
            return PdpSellerReview$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PdpSellerReview(String str, String str2, String str3, Double d, String str4, List<String> list) {
        C7384Etj.A0Y(list, 5);
        this.reviewId = str;
        this.reviewerName = str2;
        this.reviewerPicUrl = str3;
        this.rating = d;
        this.text = str4;
        this.tags = list;
    }

    public final PdpSellerReview copy(String str, String str2, String str3, Double d, String str4, List<String> list) {
        C7384Etj.A0Y(list, 5);
        return new PdpSellerReview(str, str2, str3, d, str4, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpSellerReview) {
                PdpSellerReview pdpSellerReview = (PdpSellerReview) obj;
                if (!C7384Etj.areEqual(this.reviewId, pdpSellerReview.reviewId) || !C7384Etj.areEqual(this.reviewerName, pdpSellerReview.reviewerName) || !C7384Etj.areEqual(this.reviewerPicUrl, pdpSellerReview.reviewerPicUrl) || !C7384Etj.areEqual(this.rating, pdpSellerReview.rating) || !C7384Etj.areEqual(this.text, pdpSellerReview.text) || !C7384Etj.areEqual(this.tags, pdpSellerReview.tags)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PdpSellerReview copy$default(PdpSellerReview pdpSellerReview, String str, String str2, String str3, Double d, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdpSellerReview.reviewId;
        }
        if ((i & 2) != 0) {
            str2 = pdpSellerReview.reviewerName;
        }
        if ((i & 4) != 0) {
            str3 = pdpSellerReview.reviewerPicUrl;
        }
        if ((i & 8) != 0) {
            d = pdpSellerReview.rating;
        }
        if ((i & 16) != 0) {
            str4 = pdpSellerReview.text;
        }
        if ((i & 32) != 0) {
            list = pdpSellerReview.tags;
        }
        return pdpSellerReview.copy(str, str2, str3, d, str4, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(PdpSellerReview pdpSellerReview, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(pdpSellerReview.reviewId, c07779iq, c9iZ, 0);
        c9j5.AAP(pdpSellerReview.reviewerName, c07779iq, c9iZ, 1);
        c9j5.AAP(pdpSellerReview.reviewerPicUrl, c07779iq, c9iZ, 2);
        c9j5.AAP(pdpSellerReview.rating, C07799it.A00, c9iZ, 3);
        c9j5.AAP(pdpSellerReview.text, c07779iq, c9iZ, 4);
        if (c9j5.AfR() || !C7384Etj.areEqual(pdpSellerReview.tags, C0881AGi.A00)) {
            c9j5.AAQ(pdpSellerReview.tags, C06G.A0e(f0cArr, 5), c9iZ, 5);
        }
    }

    public final String component1() {
        return this.reviewId;
    }

    public final String component2() {
        return this.reviewerName;
    }

    public final String component3() {
        return this.reviewerPicUrl;
    }

    public final Double component4() {
        return this.rating;
    }

    public final String component5() {
        return this.text;
    }

    public final List<String> component6() {
        return this.tags;
    }

    public final Double getRating() {
        return this.rating;
    }

    public final String getReviewId() {
        return this.reviewId;
    }

    public final String getReviewerName() {
        return this.reviewerName;
    }

    public final String getReviewerPicUrl() {
        return this.reviewerPicUrl;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.tags, ((((((((AnonymousClass006.A0G(this.reviewId) * 31) + AnonymousClass006.A0G(this.reviewerName)) * 31) + AnonymousClass006.A0G(this.reviewerPicUrl)) * 31) + AnonymousClass006.A0D(this.rating)) * 31) + AnonymousClass005.A0H(this.text)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PdpSellerReview(String str, String str2, String str3, Double d, String str4, List list, int i, C06H c06h) {
        this(str, str2, str3, d, str4, (i & 32) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ PdpSellerReview(int i, String str, String str2, String str3, Double d, String str4, List list, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(PdpSellerReview$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.reviewId = str;
        this.reviewerName = str2;
        this.reviewerPicUrl = str3;
        this.rating = d;
        this.text = str4;
        if ((i & 32) == 0) {
            this.tags = C0881AGi.A00;
        } else {
            this.tags = list;
        }
    }
}
