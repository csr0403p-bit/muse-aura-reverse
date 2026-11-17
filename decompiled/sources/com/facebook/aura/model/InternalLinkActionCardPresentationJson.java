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
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class InternalLinkActionCardPresentationJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final InternalLinkActionCardDataJson data;
    public final String image_url;
    public final String subtitle;
    public final String title;
    public final String type;

    public final class Companion {
        public final C9hr<InternalLinkActionCardPresentationJson> serializer() {
            return InternalLinkActionCardPresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(InternalLinkActionCardPresentationJson internalLinkActionCardPresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(internalLinkActionCardPresentationJson.title)) {
            c9j5.AAV(internalLinkActionCardPresentationJson.title, c9iZ, 0);
        }
        if (zAfR || internalLinkActionCardPresentationJson.subtitle != null) {
            c9j5.AAP(internalLinkActionCardPresentationJson.subtitle, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || internalLinkActionCardPresentationJson.image_url != null) {
            c9j5.AAP(internalLinkActionCardPresentationJson.image_url, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !"".equals(internalLinkActionCardPresentationJson.type)) {
            c9j5.AAV(internalLinkActionCardPresentationJson.type, c9iZ, 3);
        }
        if (zAfR || internalLinkActionCardPresentationJson.data != null) {
            c9j5.AAP(internalLinkActionCardPresentationJson.data, InternalLinkActionCardDataJson$$serializer.INSTANCE, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InternalLinkActionCardPresentationJson) {
                InternalLinkActionCardPresentationJson internalLinkActionCardPresentationJson = (InternalLinkActionCardPresentationJson) obj;
                if (!C7384Etj.areEqual(this.title, internalLinkActionCardPresentationJson.title) || !C7384Etj.areEqual(this.subtitle, internalLinkActionCardPresentationJson.subtitle) || !C7384Etj.areEqual(this.image_url, internalLinkActionCardPresentationJson.image_url) || !C7384Etj.areEqual(this.type, internalLinkActionCardPresentationJson.type) || !C7384Etj.areEqual(this.data, internalLinkActionCardPresentationJson.data)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ InternalLinkActionCardPresentationJson copy$default(InternalLinkActionCardPresentationJson internalLinkActionCardPresentationJson, String str, String str2, String str3, String str4, InternalLinkActionCardDataJson internalLinkActionCardDataJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internalLinkActionCardPresentationJson.title;
        }
        if ((i & 2) != 0) {
            str2 = internalLinkActionCardPresentationJson.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = internalLinkActionCardPresentationJson.image_url;
        }
        if ((i & 8) != 0) {
            str4 = internalLinkActionCardPresentationJson.type;
        }
        if ((i & 16) != 0) {
            internalLinkActionCardDataJson = internalLinkActionCardPresentationJson.data;
        }
        return internalLinkActionCardPresentationJson.copy(str, str2, str3, str4, internalLinkActionCardDataJson);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.image_url;
    }

    public final String component4() {
        return this.type;
    }

    public final InternalLinkActionCardDataJson component5() {
        return this.data;
    }

    public final InternalLinkActionCardDataJson getData() {
        return this.data;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.type, (((AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.image_url)) * 31) + C3cH.A02(this.data);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
    
        if (r12 == null) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00fa  */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.model.InternalLinkActionCardPresentation toDomain() {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.InternalLinkActionCardPresentationJson.toDomain():com.facebook.aura.model.InternalLinkActionCardPresentation");
    }

    public InternalLinkActionCardPresentationJson(String str, String str2, String str3, String str4, InternalLinkActionCardDataJson internalLinkActionCardDataJson) {
        AnonymousClass003.A0w(str, str4);
        this.title = str;
        this.subtitle = str2;
        this.image_url = str3;
        this.type = str4;
        this.data = internalLinkActionCardDataJson;
    }

    public final InternalLinkActionCardPresentationJson copy(String str, String str2, String str3, String str4, InternalLinkActionCardDataJson internalLinkActionCardDataJson) {
        AnonymousClass003.A0w(str, str4);
        return new InternalLinkActionCardPresentationJson(str, str2, str3, str4, internalLinkActionCardDataJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ InternalLinkActionCardPresentationJson(String str, String str2, String str3, String str4, InternalLinkActionCardDataJson internalLinkActionCardDataJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : internalLinkActionCardDataJson);
    }

    public /* synthetic */ InternalLinkActionCardPresentationJson(int i, String str, String str2, String str3, String str4, InternalLinkActionCardDataJson internalLinkActionCardDataJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.image_url = null;
        } else {
            this.image_url = str3;
        }
        if ((i & 8) == 0) {
            this.type = "";
        } else {
            this.type = str4;
        }
        if ((i & 16) == 0) {
            this.data = null;
        } else {
            this.data = internalLinkActionCardDataJson;
        }
    }

    public InternalLinkActionCardPresentationJson() {
        this("", null, null, "", null);
    }
}
