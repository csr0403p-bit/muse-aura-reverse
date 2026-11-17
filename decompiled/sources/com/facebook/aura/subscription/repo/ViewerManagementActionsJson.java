package com.facebook.aura.subscription.repo;

import X.AGI;
import X.AHD;
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
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ViewerManagementActionsJson extends C06G {
    public static final int $stable = 0;
    public final List<ViewerManagementCtaJson> management_rows;
    public final ViewerManagementCtaJson primary_cta;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, ViewerManagementActionsJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ViewerManagementActionsJson> serializer() {
            return ViewerManagementActionsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ViewerManagementActionsJson(ViewerManagementCtaJson viewerManagementCtaJson, List<ViewerManagementCtaJson> list) {
        C7384Etj.A0Y(list, 1);
        this.primary_cta = viewerManagementCtaJson;
        this.management_rows = list;
    }

    public final ViewerManagementActionsJson copy(ViewerManagementCtaJson viewerManagementCtaJson, List<ViewerManagementCtaJson> list) {
        C7384Etj.A0Y(list, 1);
        return new ViewerManagementActionsJson(viewerManagementCtaJson, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerManagementActionsJson) {
                ViewerManagementActionsJson viewerManagementActionsJson = (ViewerManagementActionsJson) obj;
                if (!C7384Etj.areEqual(this.primary_cta, viewerManagementActionsJson.primary_cta) || !C7384Etj.areEqual(this.management_rows, viewerManagementActionsJson.management_rows)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ViewerManagementActionsJson copy$default(ViewerManagementActionsJson viewerManagementActionsJson, ViewerManagementCtaJson viewerManagementCtaJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            viewerManagementCtaJson = viewerManagementActionsJson.primary_cta;
        }
        if ((i & 2) != 0) {
            list = viewerManagementActionsJson.management_rows;
        }
        C7384Etj.A0Y(list, 1);
        return new ViewerManagementActionsJson(viewerManagementCtaJson, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerManagementActionsJson viewerManagementActionsJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || viewerManagementActionsJson.primary_cta != null) {
            c9j5.AAP(viewerManagementActionsJson.primary_cta, ViewerManagementCtaJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(viewerManagementActionsJson.management_rows)) {
            c9j5.AAQ(viewerManagementActionsJson.management_rows, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final ViewerManagementCtaJson component1() {
        return this.primary_cta;
    }

    public final List<ViewerManagementCtaJson> component2() {
        return this.management_rows;
    }

    public final List<ViewerManagementCtaJson> getManagement_rows() {
        return this.management_rows;
    }

    public final ViewerManagementCtaJson getPrimary_cta() {
        return this.primary_cta;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.management_rows, AnonymousClass006.A0D(this.primary_cta) * 31);
    }

    public final SubscriptionManagementActions toDomain() {
        List<ViewerManagementCtaJson> list = this.management_rows;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<ViewerManagementCtaJson> it = list.iterator();
        while (it.hasNext()) {
            SubscriptionManagementCta domain = it.next().toDomain();
            if (domain != null) {
                arrayListA0h.add(domain);
            }
        }
        AHD ahdA07 = AGI.A07(arrayListA0h);
        ViewerManagementCtaJson viewerManagementCtaJson = this.primary_cta;
        return new SubscriptionManagementActions(ahdA07, viewerManagementCtaJson != null ? viewerManagementCtaJson.toDomain() : null);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ViewerManagementActionsJson(int i, ViewerManagementCtaJson viewerManagementCtaJson, List list, C2hx c2hx) {
        this.primary_cta = (i & 1) == 0 ? null : viewerManagementCtaJson;
        if ((i & 2) == 0) {
            this.management_rows = C0881AGi.A00;
        } else {
            this.management_rows = list;
        }
    }

    public /* synthetic */ ViewerManagementActionsJson(ViewerManagementCtaJson viewerManagementCtaJson, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : viewerManagementCtaJson, C3cI.A11(list, i));
    }

    public ViewerManagementActionsJson() {
        this(null, C0881AGi.A00);
    }
}
