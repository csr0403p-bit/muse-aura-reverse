package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class InternalLinkActionCardDataJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String account_id;
    public final String action_label;
    public final List<String> auth_providers;
    public final String connector_id;
    public final String scope_key;
    public final String url;
    public final boolean wallet_setup;
    public final List<WalletSetupOptionJson> wallet_setup_options;

    public final class Companion {
        public final C9hr<InternalLinkActionCardDataJson> serializer() {
            return InternalLinkActionCardDataJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, AbstractC5321DgF.A02(num, InternalLinkActionCardDataJson$Companion$$childSerializers$1.INSTANCE), null, null, null, AbstractC5321DgF.A02(num, InternalLinkActionCardDataJson$Companion$$childSerializers$2.INSTANCE)};
    }

    public InternalLinkActionCardDataJson(String str, String str2, String str3, List<String> list, String str4, boolean z, String str5, List<WalletSetupOptionJson> list2) {
        C60O.A1M(list, 3, list2);
        this.connector_id = str;
        this.scope_key = str2;
        this.url = str3;
        this.auth_providers = list;
        this.account_id = str4;
        this.wallet_setup = z;
        this.action_label = str5;
        this.wallet_setup_options = list2;
    }

    public final InternalLinkActionCardDataJson copy(String str, String str2, String str3, List<String> list, String str4, boolean z, String str5, List<WalletSetupOptionJson> list2) {
        C60O.A1M(list, 3, list2);
        return new InternalLinkActionCardDataJson(str, str2, str3, list, str4, z, str5, list2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InternalLinkActionCardDataJson) {
                InternalLinkActionCardDataJson internalLinkActionCardDataJson = (InternalLinkActionCardDataJson) obj;
                if (!C7384Etj.areEqual(this.connector_id, internalLinkActionCardDataJson.connector_id) || !C7384Etj.areEqual(this.scope_key, internalLinkActionCardDataJson.scope_key) || !C7384Etj.areEqual(this.url, internalLinkActionCardDataJson.url) || !C7384Etj.areEqual(this.auth_providers, internalLinkActionCardDataJson.auth_providers) || !C7384Etj.areEqual(this.account_id, internalLinkActionCardDataJson.account_id) || this.wallet_setup != internalLinkActionCardDataJson.wallet_setup || !C7384Etj.areEqual(this.action_label, internalLinkActionCardDataJson.action_label) || !C7384Etj.areEqual(this.wallet_setup_options, internalLinkActionCardDataJson.wallet_setup_options)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InternalLinkActionCardDataJson copy$default(InternalLinkActionCardDataJson internalLinkActionCardDataJson, String str, String str2, String str3, List list, String str4, boolean z, String str5, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internalLinkActionCardDataJson.connector_id;
        }
        if ((i & 2) != 0) {
            str2 = internalLinkActionCardDataJson.scope_key;
        }
        if ((i & 4) != 0) {
            str3 = internalLinkActionCardDataJson.url;
        }
        if ((i & 8) != 0) {
            list = internalLinkActionCardDataJson.auth_providers;
        }
        if ((i & 16) != 0) {
            str4 = internalLinkActionCardDataJson.account_id;
        }
        if ((i & 32) != 0) {
            z = internalLinkActionCardDataJson.wallet_setup;
        }
        if ((i & 64) != 0) {
            str5 = internalLinkActionCardDataJson.action_label;
        }
        if ((i & 128) != 0) {
            list2 = internalLinkActionCardDataJson.wallet_setup_options;
        }
        return internalLinkActionCardDataJson.copy(str, str2, str3, list, str4, z, str5, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(InternalLinkActionCardDataJson internalLinkActionCardDataJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || internalLinkActionCardDataJson.connector_id != null) {
            c9j5.AAP(internalLinkActionCardDataJson.connector_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || internalLinkActionCardDataJson.scope_key != null) {
            c9j5.AAP(internalLinkActionCardDataJson.scope_key, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || internalLinkActionCardDataJson.url != null) {
            c9j5.AAP(internalLinkActionCardDataJson.url, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(internalLinkActionCardDataJson.auth_providers)) {
            c9j5.AAQ(internalLinkActionCardDataJson.auth_providers, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || internalLinkActionCardDataJson.account_id != null) {
            c9j5.AAP(internalLinkActionCardDataJson.account_id, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || internalLinkActionCardDataJson.wallet_setup) {
            c9j5.AA7(c9iZ, 5, internalLinkActionCardDataJson.wallet_setup);
        }
        if (zAfR || internalLinkActionCardDataJson.action_label != null) {
            c9j5.AAP(internalLinkActionCardDataJson.action_label, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || !C3cG.A1L(internalLinkActionCardDataJson.wallet_setup_options)) {
            c9j5.AAQ(internalLinkActionCardDataJson.wallet_setup_options, C3cH.A15(f0cArr, 7), c9iZ, 7);
        }
    }

    public final String component1() {
        return this.connector_id;
    }

    public final String component2() {
        return this.scope_key;
    }

    public final String component3() {
        return this.url;
    }

    public final List<String> component4() {
        return this.auth_providers;
    }

    public final String component5() {
        return this.account_id;
    }

    public final boolean component6() {
        return this.wallet_setup;
    }

    public final String component7() {
        return this.action_label;
    }

    public final List<WalletSetupOptionJson> component8() {
        return this.wallet_setup_options;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getAction_label() {
        return this.action_label;
    }

    public final List<String> getAuth_providers() {
        return this.auth_providers;
    }

    public final String getConnector_id() {
        return this.connector_id;
    }

    public final String getScope_key() {
        return this.scope_key;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean getWallet_setup() {
        return this.wallet_setup;
    }

    public final List<WalletSetupOptionJson> getWallet_setup_options() {
        return this.wallet_setup_options;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.wallet_setup_options, (C0KA.A01((AnonymousClass005.A0F(this.auth_providers, ((((AnonymousClass006.A0G(this.connector_id) * 31) + AnonymousClass006.A0G(this.scope_key)) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass006.A0G(this.account_id)) * 31, this.wallet_setup) + AnonymousClass005.A0H(this.action_label)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ InternalLinkActionCardDataJson(String str, String str2, String str3, List list, String str4, boolean z, String str5, List list2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? C0881AGi.A00 : list, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? C0881AGi.A00 : list2);
    }

    public /* synthetic */ InternalLinkActionCardDataJson(int i, String str, String str2, String str3, List list, String str4, boolean z, String str5, List list2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.connector_id = null;
        } else {
            this.connector_id = str;
        }
        if ((i & 2) == 0) {
            this.scope_key = null;
        } else {
            this.scope_key = str2;
        }
        if ((i & 4) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
        if ((i & 8) == 0) {
            this.auth_providers = C0881AGi.A00;
        } else {
            this.auth_providers = list;
        }
        if ((i & 16) == 0) {
            this.account_id = null;
        } else {
            this.account_id = str4;
        }
        if ((i & 32) == 0) {
            this.wallet_setup = false;
        } else {
            this.wallet_setup = z;
        }
        if ((i & 64) == 0) {
            this.action_label = null;
        } else {
            this.action_label = str5;
        }
        if ((i & 128) == 0) {
            this.wallet_setup_options = C0881AGi.A00;
        } else {
            this.wallet_setup_options = list2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InternalLinkActionCardDataJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(null, null, null, c0881AGi, null, false, null, c0881AGi);
    }
}
