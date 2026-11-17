package com.facebook.aura.shopping.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07799it;
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
import com.facebook.aura.shopping.model.PdpSellerReview;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class SellerReviewJson extends C06G {
    public final Double rating;
    public final String review_id;
    public final String reviewer_name;
    public final String reviewer_pic_url;
    public final List<String> tags;
    public final String text;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, SellerReviewJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<SellerReviewJson> serializer() {
            return SellerReviewJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SellerReviewJson() {
        this(null, null, null, null, null, C0881AGi.A00);
    }

    public final SellerReviewJson copy(String str, String str2, String str3, Double d, String str4, List<String> list) {
        C7384Etj.A0Y(list, 5);
        return new SellerReviewJson(str, str2, str3, d, str4, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SellerReviewJson) {
                SellerReviewJson sellerReviewJson = (SellerReviewJson) obj;
                if (!C7384Etj.areEqual(this.review_id, sellerReviewJson.review_id) || !C7384Etj.areEqual(this.reviewer_name, sellerReviewJson.reviewer_name) || !C7384Etj.areEqual(this.reviewer_pic_url, sellerReviewJson.reviewer_pic_url) || !C7384Etj.areEqual(this.rating, sellerReviewJson.rating) || !C7384Etj.areEqual(this.text, sellerReviewJson.text) || !C7384Etj.areEqual(this.tags, sellerReviewJson.tags)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SellerReviewJson copy$default(SellerReviewJson sellerReviewJson, String str, String str2, String str3, Double d, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sellerReviewJson.review_id;
        }
        if ((i & 2) != 0) {
            str2 = sellerReviewJson.reviewer_name;
        }
        if ((i & 4) != 0) {
            str3 = sellerReviewJson.reviewer_pic_url;
        }
        if ((i & 8) != 0) {
            d = sellerReviewJson.rating;
        }
        if ((i & 16) != 0) {
            str4 = sellerReviewJson.text;
        }
        if ((i & 32) != 0) {
            list = sellerReviewJson.tags;
        }
        return sellerReviewJson.copy(str, str2, str3, d, str4, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(SellerReviewJson sellerReviewJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || sellerReviewJson.review_id != null) {
            c9j5.AAP(sellerReviewJson.review_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || sellerReviewJson.reviewer_name != null) {
            c9j5.AAP(sellerReviewJson.reviewer_name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || sellerReviewJson.reviewer_pic_url != null) {
            c9j5.AAP(sellerReviewJson.reviewer_pic_url, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || sellerReviewJson.rating != null) {
            c9j5.AAP(sellerReviewJson.rating, C07799it.A00, c9iZ, 3);
        }
        if (zAfR || sellerReviewJson.text != null) {
            c9j5.AAP(sellerReviewJson.text, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || !C3cG.A1L(sellerReviewJson.tags)) {
            c9j5.AAQ(sellerReviewJson.tags, C3cH.A15(f0cArr, 5), c9iZ, 5);
        }
    }

    public final String component1() {
        return this.review_id;
    }

    public final String component2() {
        return this.reviewer_name;
    }

    public final String component3() {
        return this.reviewer_pic_url;
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

    public final String getReview_id() {
        return this.review_id;
    }

    public final String getReviewer_name() {
        return this.reviewer_name;
    }

    public final String getReviewer_pic_url() {
        return this.reviewer_pic_url;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.tags, ((((((((AnonymousClass006.A0G(this.review_id) * 31) + AnonymousClass006.A0G(this.reviewer_name)) * 31) + AnonymousClass006.A0G(this.reviewer_pic_url)) * 31) + AnonymousClass006.A0D(this.rating)) * 31) + AnonymousClass005.A0H(this.text)) * 31);
    }

    public final PdpSellerReview toDomain() {
        String str = this.review_id;
        String str2 = null;
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        String str3 = this.reviewer_name;
        if (str3 == null || C7BY.A0j(str3)) {
            str3 = null;
        }
        String str4 = this.reviewer_pic_url;
        if (str4 == null || C7BY.A0j(str4)) {
            str4 = null;
        }
        Double d = this.rating;
        String str5 = this.text;
        if (str5 != null && !C7BY.A0j(str5)) {
            str2 = str5;
        }
        return new PdpSellerReview(str, str3, str4, d, str2, this.tags);
    }

    public String toString() {
        return super.toString();
    }

    public SellerReviewJson(String str, String str2, String str3, Double d, String str4, List<String> list) {
        C7384Etj.A0Y(list, 5);
        this.review_id = str;
        this.reviewer_name = str2;
        this.reviewer_pic_url = str3;
        this.rating = d;
        this.text = str4;
        this.tags = list;
    }

    public /* synthetic */ SellerReviewJson(String str, String str2, String str3, Double d, String str4, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ SellerReviewJson(int i, String str, String str2, String str3, Double d, String str4, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.review_id = null;
        } else {
            this.review_id = str;
        }
        if ((i & 2) == 0) {
            this.reviewer_name = null;
        } else {
            this.reviewer_name = str2;
        }
        if ((i & 4) == 0) {
            this.reviewer_pic_url = null;
        } else {
            this.reviewer_pic_url = str3;
        }
        if ((i & 8) == 0) {
            this.rating = null;
        } else {
            this.rating = d;
        }
        if ((i & 16) == 0) {
            this.text = null;
        } else {
            this.text = str4;
        }
        if ((i & 32) == 0) {
            this.tags = C0881AGi.A00;
        } else {
            this.tags = list;
        }
    }
}
