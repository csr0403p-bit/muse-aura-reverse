package com.facebook.aura.shopping.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ActionButtonsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final ActionButtonJson buy;
    public final ActionButtonJson website;

    public final class Companion {
        public final C9hr<ActionButtonsJson> serializer() {
            return ActionButtonsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(ActionButtonsJson actionButtonsJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || actionButtonsJson.buy != null) {
            c9j5.AAP(actionButtonsJson.buy, ActionButtonJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || actionButtonsJson.website != null) {
            c9j5.AAP(actionButtonsJson.website, ActionButtonJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActionButtonsJson) {
                ActionButtonsJson actionButtonsJson = (ActionButtonsJson) obj;
                if (!C7384Etj.areEqual(this.buy, actionButtonsJson.buy) || !C7384Etj.areEqual(this.website, actionButtonsJson.website)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActionButtonsJson copy$default(ActionButtonsJson actionButtonsJson, ActionButtonJson actionButtonJson, ActionButtonJson actionButtonJson2, int i, Object obj) {
        if ((i & 1) != 0) {
            actionButtonJson = actionButtonsJson.buy;
        }
        if ((i & 2) != 0) {
            actionButtonJson2 = actionButtonsJson.website;
        }
        return new ActionButtonsJson(actionButtonJson, actionButtonJson2);
    }

    public final ActionButtonJson component1() {
        return this.buy;
    }

    public final ActionButtonJson component2() {
        return this.website;
    }

    public final ActionButtonsJson copy(ActionButtonJson actionButtonJson, ActionButtonJson actionButtonJson2) {
        return new ActionButtonsJson(actionButtonJson, actionButtonJson2);
    }

    public final ActionButtonJson getBuy() {
        return this.buy;
    }

    public final ActionButtonJson getWebsite() {
        return this.website;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.buy) * 31) + C3cH.A02(this.website);
    }

    public ActionButtonsJson(ActionButtonJson actionButtonJson, ActionButtonJson actionButtonJson2) {
        this.buy = actionButtonJson;
        this.website = actionButtonJson2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActionButtonsJson(int i, ActionButtonJson actionButtonJson, ActionButtonJson actionButtonJson2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.buy = null;
        } else {
            this.buy = actionButtonJson;
        }
        if ((i & 2) == 0) {
            this.website = null;
        } else {
            this.website = actionButtonJson2;
        }
    }

    public /* synthetic */ ActionButtonsJson(ActionButtonJson actionButtonJson, ActionButtonJson actionButtonJson2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : actionButtonJson, (i & 2) != 0 ? null : actionButtonJson2);
    }

    public ActionButtonsJson() {
        this(null, null);
    }
}
