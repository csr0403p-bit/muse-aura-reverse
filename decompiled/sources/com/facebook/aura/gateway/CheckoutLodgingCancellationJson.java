package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

@Serializable
/* loaded from: classes2.dex */
public final class CheckoutLodgingCancellationJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String description;
    public final Boolean free_cancellation;
    public final String free_cancellation_until;
    public final JsonElement penalties;
    public final String policy_text;
    public final Boolean refundable;

    public final class Companion {
        public final C9hr<CheckoutLodgingCancellationJson> serializer() {
            return CheckoutLodgingCancellationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CheckoutLodgingCancellationJson() {
        this(null, null, null, null, null, null);
    }

    public static /* synthetic */ CheckoutLodgingCancellationJson copy$default(CheckoutLodgingCancellationJson checkoutLodgingCancellationJson, Boolean bool, Boolean bool2, String str, String str2, JsonElement jsonElement, String str3, int i, Object obj) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str4 = str;
        String str5 = str2;
        JsonElement jsonElement2 = jsonElement;
        String str6 = str3;
        if ((i & 1) != 0) {
            bool3 = checkoutLodgingCancellationJson.refundable;
        }
        if ((i & 2) != 0) {
            bool4 = checkoutLodgingCancellationJson.free_cancellation;
        }
        if ((i & 4) != 0) {
            str4 = checkoutLodgingCancellationJson.free_cancellation_until;
        }
        if ((i & 8) != 0) {
            str5 = checkoutLodgingCancellationJson.policy_text;
        }
        if ((i & 16) != 0) {
            jsonElement2 = checkoutLodgingCancellationJson.penalties;
        }
        if ((i & 32) != 0) {
            str6 = checkoutLodgingCancellationJson.description;
        }
        return new CheckoutLodgingCancellationJson(bool3, bool4, str4, str5, jsonElement2, str6);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutLodgingCancellationJson checkoutLodgingCancellationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || checkoutLodgingCancellationJson.refundable != null) {
            c9j5.AAP(checkoutLodgingCancellationJson.refundable, C07839ix.A00, c9iZ, 0);
        }
        if (zAfR || checkoutLodgingCancellationJson.free_cancellation != null) {
            c9j5.AAP(checkoutLodgingCancellationJson.free_cancellation, C07839ix.A00, c9iZ, 1);
        }
        if (zAfR || checkoutLodgingCancellationJson.free_cancellation_until != null) {
            c9j5.AAP(checkoutLodgingCancellationJson.free_cancellation_until, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || checkoutLodgingCancellationJson.policy_text != null) {
            c9j5.AAP(checkoutLodgingCancellationJson.policy_text, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || checkoutLodgingCancellationJson.penalties != null) {
            c9j5.AAP(checkoutLodgingCancellationJson.penalties, JsonElementSerializer.A00, c9iZ, 4);
        }
        if (zAfR || checkoutLodgingCancellationJson.description != null) {
            c9j5.AAP(checkoutLodgingCancellationJson.description, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingCancellationJson) {
                CheckoutLodgingCancellationJson checkoutLodgingCancellationJson = (CheckoutLodgingCancellationJson) obj;
                if (!C7384Etj.areEqual(this.refundable, checkoutLodgingCancellationJson.refundable) || !C7384Etj.areEqual(this.free_cancellation, checkoutLodgingCancellationJson.free_cancellation) || !C7384Etj.areEqual(this.free_cancellation_until, checkoutLodgingCancellationJson.free_cancellation_until) || !C7384Etj.areEqual(this.policy_text, checkoutLodgingCancellationJson.policy_text) || !C7384Etj.areEqual(this.penalties, checkoutLodgingCancellationJson.penalties) || !C7384Etj.areEqual(this.description, checkoutLodgingCancellationJson.description)) {
                }
            }
            return false;
        }
        return true;
    }

    public final Boolean component1() {
        return this.refundable;
    }

    public final Boolean component2() {
        return this.free_cancellation;
    }

    public final String component3() {
        return this.free_cancellation_until;
    }

    public final String component4() {
        return this.policy_text;
    }

    public final JsonElement component5() {
        return this.penalties;
    }

    public final String component6() {
        return this.description;
    }

    public final CheckoutLodgingCancellationJson copy(Boolean bool, Boolean bool2, String str, String str2, JsonElement jsonElement, String str3) {
        return new CheckoutLodgingCancellationJson(bool, bool2, str, str2, jsonElement, str3);
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getFree_cancellation() {
        return this.free_cancellation;
    }

    public final String getFree_cancellation_until() {
        return this.free_cancellation_until;
    }

    public final JsonElement getPenalties() {
        return this.penalties;
    }

    public final String getPolicy_text() {
        return this.policy_text;
    }

    public final Boolean getRefundable() {
        return this.refundable;
    }

    public int hashCode() {
        return (((((((((AnonymousClass006.A0D(this.refundable) * 31) + AnonymousClass006.A0D(this.free_cancellation)) * 31) + AnonymousClass006.A0G(this.free_cancellation_until)) * 31) + AnonymousClass006.A0G(this.policy_text)) * 31) + AnonymousClass006.A0D(this.penalties)) * 31) + AnonymousClass005.A0H(this.description);
    }

    public final CheckoutLodgingCancellation toDomain() {
        List list;
        String str = this.free_cancellation_until;
        String strTrimToNonEmpty = str != null ? HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str) : null;
        String str2 = this.policy_text;
        String strTrimToNonEmpty2 = str2 != null ? HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str2) : null;
        Boolean bool = this.refundable;
        if (bool == null && this.free_cancellation == null && strTrimToNonEmpty == null && strTrimToNonEmpty2 == null) {
            return null;
        }
        Boolean bool2 = this.free_cancellation;
        JsonElement jsonElement = this.penalties;
        if (!(jsonElement instanceof JsonArray) || (list = (JsonArray) jsonElement) == null) {
            list = C0881AGi.A00;
        }
        boolean z = false;
        if (!(list instanceof Collection) || !C3cG.A1N(list)) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next() instanceof JsonObject) {
                    z = true;
                    break;
                }
            }
        }
        String str3 = this.description;
        return new CheckoutLodgingCancellation(bool, bool2, strTrimToNonEmpty, strTrimToNonEmpty2, z, str3 != null ? HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str3) : null);
    }

    public String toString() {
        return super.toString();
    }

    public CheckoutLodgingCancellationJson(Boolean bool, Boolean bool2, String str, String str2, JsonElement jsonElement, String str3) {
        this.refundable = bool;
        this.free_cancellation = bool2;
        this.free_cancellation_until = str;
        this.policy_text = str2;
        this.penalties = jsonElement;
        this.description = str3;
    }

    public /* synthetic */ CheckoutLodgingCancellationJson(Boolean bool, Boolean bool2, String str, String str2, JsonElement jsonElement, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : jsonElement, (i & 32) != 0 ? null : str3);
    }

    public /* synthetic */ CheckoutLodgingCancellationJson(int i, Boolean bool, Boolean bool2, String str, String str2, JsonElement jsonElement, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.refundable = null;
        } else {
            this.refundable = bool;
        }
        if ((i & 2) == 0) {
            this.free_cancellation = null;
        } else {
            this.free_cancellation = bool2;
        }
        if ((i & 4) == 0) {
            this.free_cancellation_until = null;
        } else {
            this.free_cancellation_until = str;
        }
        if ((i & 8) == 0) {
            this.policy_text = null;
        } else {
            this.policy_text = str2;
        }
        if ((i & 16) == 0) {
            this.penalties = null;
        } else {
            this.penalties = jsonElement;
        }
        if ((i & 32) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
    }
}
