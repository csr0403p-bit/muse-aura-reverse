package com.facebook.aura.shopping.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ActionButtonJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String label;

    public final class Companion {
        public final C9hr<ActionButtonJson> serializer() {
            return ActionButtonJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(ActionButtonJson actionButtonJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || actionButtonJson.label != null) {
            c9j5.AAP(actionButtonJson.label, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ActionButtonJson) && C7384Etj.areEqual(this.label, ((ActionButtonJson) obj).label));
    }

    public static /* synthetic */ ActionButtonJson copy$default(ActionButtonJson actionButtonJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionButtonJson.label;
        }
        return new ActionButtonJson(str);
    }

    public final String component1() {
        return this.label;
    }

    public final ActionButtonJson copy(String str) {
        return new ActionButtonJson(str);
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.label);
    }

    public final String toDomain() {
        return ProductDetailsPresentationKt.trimToNonEmpty(this.label);
    }

    public /* synthetic */ ActionButtonJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ActionButtonJson(String str) {
        this.label = str;
    }

    public /* synthetic */ ActionButtonJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public ActionButtonJson() {
        this(null);
    }
}
