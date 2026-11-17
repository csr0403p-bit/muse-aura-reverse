package com.facebook.aura.subscription.repo;

import X.AGI;
import X.AHD;
import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
/* loaded from: classes2.dex */
public final class ViewerCtaConfirmationJson extends C06G {
    public static final int $stable = 8;
    public final String body;
    public final String cancel_label;
    public final String confirm_label;
    public final List<ViewerCtaConfirmationItemJson> items;
    public final String summary;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, ViewerCtaConfirmationJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<ViewerCtaConfirmationJson> serializer() {
            return ViewerCtaConfirmationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ViewerCtaConfirmationJson() {
        this(null, null, null, null, null, C0881AGi.A00);
    }

    public final ViewerCtaConfirmationJson copy(String str, String str2, String str3, String str4, String str5, List<ViewerCtaConfirmationItemJson> list) {
        C7384Etj.A0Y(list, 5);
        return new ViewerCtaConfirmationJson(str, str2, str3, str4, str5, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerCtaConfirmationJson) {
                ViewerCtaConfirmationJson viewerCtaConfirmationJson = (ViewerCtaConfirmationJson) obj;
                if (!C7384Etj.areEqual(this.title, viewerCtaConfirmationJson.title) || !C7384Etj.areEqual(this.body, viewerCtaConfirmationJson.body) || !C7384Etj.areEqual(this.confirm_label, viewerCtaConfirmationJson.confirm_label) || !C7384Etj.areEqual(this.cancel_label, viewerCtaConfirmationJson.cancel_label) || !C7384Etj.areEqual(this.summary, viewerCtaConfirmationJson.summary) || !C7384Etj.areEqual(this.items, viewerCtaConfirmationJson.items)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ViewerCtaConfirmationJson copy$default(ViewerCtaConfirmationJson viewerCtaConfirmationJson, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerCtaConfirmationJson.title;
        }
        if ((i & 2) != 0) {
            str2 = viewerCtaConfirmationJson.body;
        }
        if ((i & 4) != 0) {
            str3 = viewerCtaConfirmationJson.confirm_label;
        }
        if ((i & 8) != 0) {
            str4 = viewerCtaConfirmationJson.cancel_label;
        }
        if ((i & 16) != 0) {
            str5 = viewerCtaConfirmationJson.summary;
        }
        if ((i & 32) != 0) {
            list = viewerCtaConfirmationJson.items;
        }
        return viewerCtaConfirmationJson.copy(str, str2, str3, str4, str5, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerCtaConfirmationJson viewerCtaConfirmationJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || viewerCtaConfirmationJson.title != null) {
            c9j5.AAP(viewerCtaConfirmationJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || viewerCtaConfirmationJson.body != null) {
            c9j5.AAP(viewerCtaConfirmationJson.body, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || viewerCtaConfirmationJson.confirm_label != null) {
            c9j5.AAP(viewerCtaConfirmationJson.confirm_label, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || viewerCtaConfirmationJson.cancel_label != null) {
            c9j5.AAP(viewerCtaConfirmationJson.cancel_label, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || viewerCtaConfirmationJson.summary != null) {
            c9j5.AAP(viewerCtaConfirmationJson.summary, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || !C3cG.A1L(viewerCtaConfirmationJson.items)) {
            c9j5.AAQ(viewerCtaConfirmationJson.items, C3cH.A15(f0cArr, 5), c9iZ, 5);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final String component3() {
        return this.confirm_label;
    }

    public final String component4() {
        return this.cancel_label;
    }

    public final String component5() {
        return this.summary;
    }

    public final List<ViewerCtaConfirmationItemJson> component6() {
        return this.items;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCancel_label() {
        return this.cancel_label;
    }

    public final String getConfirm_label() {
        return this.confirm_label;
    }

    public final List<ViewerCtaConfirmationItemJson> getItems() {
        return this.items;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.items, ((((((((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.body)) * 31) + AnonymousClass006.A0G(this.confirm_label)) * 31) + AnonymousClass006.A0G(this.cancel_label)) * 31) + AnonymousClass005.A0H(this.summary)) * 31);
    }

    public final SubscriptionConfidentialVmConfirmation toConfidentialVmDomain() {
        String str;
        String str2;
        String str3;
        String str4 = this.title;
        if (str4 == null || C7BY.A0j(str4) || (str = this.summary) == null || C7BY.A0j(str) || (str2 = this.confirm_label) == null || C7BY.A0j(str2) || (str3 = this.cancel_label) == null || C7BY.A0j(str3)) {
            return null;
        }
        List<ViewerCtaConfirmationItemJson> list = this.items;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<ViewerCtaConfirmationItemJson> it = list.iterator();
        while (it.hasNext()) {
            SubscriptionConfirmationItem domain = it.next().toDomain();
            if (domain != null) {
                arrayListA0h.add(domain);
            }
        }
        AHD ahdA07 = AGI.A07(arrayListA0h);
        if (ahdA07.isEmpty()) {
            return null;
        }
        return new SubscriptionConfidentialVmConfirmation(str4, str, ahdA07, str2, str3);
    }

    public final SubscriptionCtaConfirmation toDomain() {
        String str;
        String str2;
        String str3;
        String str4 = this.title;
        if (str4 == null || C7BY.A0j(str4) || (str = this.body) == null || C7BY.A0j(str) || (str2 = this.confirm_label) == null || C7BY.A0j(str2) || (str3 = this.cancel_label) == null || C7BY.A0j(str3)) {
            return null;
        }
        return new SubscriptionCtaConfirmation(str4, str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public ViewerCtaConfirmationJson(String str, String str2, String str3, String str4, String str5, List<ViewerCtaConfirmationItemJson> list) {
        C7384Etj.A0Y(list, 5);
        this.title = str;
        this.body = str2;
        this.confirm_label = str3;
        this.cancel_label = str4;
        this.summary = str5;
        this.items = list;
    }

    public /* synthetic */ ViewerCtaConfirmationJson(String str, String str2, String str3, String str4, String str5, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ ViewerCtaConfirmationJson(int i, String str, String str2, String str3, String str4, String str5, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.body = null;
        } else {
            this.body = str2;
        }
        if ((i & 4) == 0) {
            this.confirm_label = null;
        } else {
            this.confirm_label = str3;
        }
        if ((i & 8) == 0) {
            this.cancel_label = null;
        } else {
            this.cancel_label = str4;
        }
        if ((i & 16) == 0) {
            this.summary = null;
        } else {
            this.summary = str5;
        }
        if ((i & 32) == 0) {
            this.items = C0881AGi.A00;
        } else {
            this.items = list;
        }
    }
}
