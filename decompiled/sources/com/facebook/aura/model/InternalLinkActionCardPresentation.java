package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
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
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes.dex */
public final class InternalLinkActionCardPresentation extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String accountId;
    public final String actionLabel;
    public final List<String> authProviders;
    public final String connectorId;
    public final String imageUrl;
    public final String scopeKey;
    public final String subtitle;
    public final String title;
    public final String type;
    public final String url;
    public final boolean walletSetup;
    public final List<WalletSetupOption> walletSetupOptions;

    public final class Companion {
        public final C9hr<InternalLinkActionCardPresentation> serializer() {
            return InternalLinkActionCardPresentation$$serializer.INSTANCE;
        }

        public final InternalLinkActionCardPresentation fromJson(JsonElement jsonElement) {
            return InternalLinkActionCardPresentationJsonKt.parseInternalLinkActionCardPresentation(jsonElement);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, InternalLinkActionCardPresentation$Companion$$childSerializers$1.INSTANCE), null, null, null, AbstractC5321DgF.A02(num, InternalLinkActionCardPresentation$Companion$$childSerializers$2.INSTANCE)};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InternalLinkActionCardPresentation) {
                InternalLinkActionCardPresentation internalLinkActionCardPresentation = (InternalLinkActionCardPresentation) obj;
                if (!C7384Etj.areEqual(this.title, internalLinkActionCardPresentation.title) || !C7384Etj.areEqual(this.subtitle, internalLinkActionCardPresentation.subtitle) || !C7384Etj.areEqual(this.imageUrl, internalLinkActionCardPresentation.imageUrl) || !C7384Etj.areEqual(this.type, internalLinkActionCardPresentation.type) || !C7384Etj.areEqual(this.connectorId, internalLinkActionCardPresentation.connectorId) || !C7384Etj.areEqual(this.scopeKey, internalLinkActionCardPresentation.scopeKey) || !C7384Etj.areEqual(this.url, internalLinkActionCardPresentation.url) || !C7384Etj.areEqual(this.authProviders, internalLinkActionCardPresentation.authProviders) || !C7384Etj.areEqual(this.accountId, internalLinkActionCardPresentation.accountId) || this.walletSetup != internalLinkActionCardPresentation.walletSetup || !C7384Etj.areEqual(this.actionLabel, internalLinkActionCardPresentation.actionLabel) || !C7384Etj.areEqual(this.walletSetupOptions, internalLinkActionCardPresentation.walletSetupOptions)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InternalLinkActionCardPresentation copy$default(InternalLinkActionCardPresentation internalLinkActionCardPresentation, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, boolean z, String str9, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internalLinkActionCardPresentation.title;
        }
        if ((i & 2) != 0) {
            str2 = internalLinkActionCardPresentation.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = internalLinkActionCardPresentation.imageUrl;
        }
        if ((i & 8) != 0) {
            str4 = internalLinkActionCardPresentation.type;
        }
        if ((i & 16) != 0) {
            str5 = internalLinkActionCardPresentation.connectorId;
        }
        if ((i & 32) != 0) {
            str6 = internalLinkActionCardPresentation.scopeKey;
        }
        if ((i & 64) != 0) {
            str7 = internalLinkActionCardPresentation.url;
        }
        if ((i & 128) != 0) {
            list = internalLinkActionCardPresentation.authProviders;
        }
        if ((i & 256) != 0) {
            str8 = internalLinkActionCardPresentation.accountId;
        }
        if ((i & 512) != 0) {
            z = internalLinkActionCardPresentation.walletSetup;
        }
        if ((i & 1024) != 0) {
            str9 = internalLinkActionCardPresentation.actionLabel;
        }
        if ((i & 2048) != 0) {
            list2 = internalLinkActionCardPresentation.walletSetupOptions;
        }
        return internalLinkActionCardPresentation.copy(str, str2, str3, str4, str5, str6, str7, list, str8, z, str9, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(InternalLinkActionCardPresentation internalLinkActionCardPresentation, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(internalLinkActionCardPresentation.title, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || internalLinkActionCardPresentation.subtitle != null) {
            c9j5.AAP(internalLinkActionCardPresentation.subtitle, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || internalLinkActionCardPresentation.imageUrl != null) {
            c9j5.AAP(internalLinkActionCardPresentation.imageUrl, C07779iq.A01, c9iZ, 2);
        }
        c9j5.AAV(internalLinkActionCardPresentation.type, c9iZ, 3);
        if (zAfR || internalLinkActionCardPresentation.connectorId != null) {
            c9j5.AAP(internalLinkActionCardPresentation.connectorId, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || internalLinkActionCardPresentation.scopeKey != null) {
            c9j5.AAP(internalLinkActionCardPresentation.scopeKey, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || internalLinkActionCardPresentation.url != null) {
            c9j5.AAP(internalLinkActionCardPresentation.url, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || !C7384Etj.areEqual(internalLinkActionCardPresentation.authProviders, C0881AGi.A00)) {
            c9j5.AAQ(internalLinkActionCardPresentation.authProviders, C06G.A0e(f0cArr, 7), c9iZ, 7);
        }
        if (zAfR || internalLinkActionCardPresentation.accountId != null) {
            c9j5.AAP(internalLinkActionCardPresentation.accountId, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || internalLinkActionCardPresentation.walletSetup) {
            c9j5.AA7(c9iZ, 9, internalLinkActionCardPresentation.walletSetup);
        }
        if (zAfR || internalLinkActionCardPresentation.actionLabel != null) {
            c9j5.AAP(internalLinkActionCardPresentation.actionLabel, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || !C7384Etj.areEqual(internalLinkActionCardPresentation.walletSetupOptions, C0881AGi.A00)) {
            c9j5.AAQ(internalLinkActionCardPresentation.walletSetupOptions, C06G.A0e(f0cArr, 11), c9iZ, 11);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final boolean component10() {
        return this.walletSetup;
    }

    public final String component11() {
        return this.actionLabel;
    }

    public final List<WalletSetupOption> component12() {
        return this.walletSetupOptions;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.connectorId;
    }

    public final String component6() {
        return this.scopeKey;
    }

    public final String component7() {
        return this.url;
    }

    public final List<String> component8() {
        return this.authProviders;
    }

    public final String component9() {
        return this.accountId;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getActionLabel() {
        return this.actionLabel;
    }

    public final List<String> getAuthProviders() {
        return this.authProviders;
    }

    public final String getConnectorId() {
        return this.connectorId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getScopeKey() {
        return this.scopeKey;
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

    public final String getUrl() {
        return this.url;
    }

    public final boolean getWalletSetup() {
        return this.walletSetup;
    }

    public final List<WalletSetupOption> getWalletSetupOptions() {
        return this.walletSetupOptions;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.walletSetupOptions, (C0KA.A01((AnonymousClass005.A0F(this.authProviders, (((((AnonymousClass005.A0I(this.type, (((AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.imageUrl)) * 31) + AnonymousClass006.A0G(this.connectorId)) * 31) + AnonymousClass006.A0G(this.scopeKey)) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass006.A0G(this.accountId)) * 31, this.walletSetup) + AnonymousClass005.A0H(this.actionLabel)) * 31);
    }

    public InternalLinkActionCardPresentation(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list, String str8, boolean z, String str9, List<WalletSetupOption> list2) {
        AnonymousClass003.A0w(str, str4);
        AnonymousClass002.A1G(list, 7, list2);
        this.title = str;
        this.subtitle = str2;
        this.imageUrl = str3;
        this.type = str4;
        this.connectorId = str5;
        this.scopeKey = str6;
        this.url = str7;
        this.authProviders = list;
        this.accountId = str8;
        this.walletSetup = z;
        this.actionLabel = str9;
        this.walletSetupOptions = list2;
    }

    public final InternalLinkActionCardPresentation copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list, String str8, boolean z, String str9, List<WalletSetupOption> list2) {
        AnonymousClass003.A0w(str, str4);
        AnonymousClass002.A1G(list, 7, list2);
        return new InternalLinkActionCardPresentation(str, str2, str3, str4, str5, str6, str7, list, str8, z, str9, list2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ InternalLinkActionCardPresentation(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, boolean z, String str9, List list2, C2hx c2hx) {
        if (9 != (i & 9)) {
            C9iI.A00(InternalLinkActionCardPresentation$$serializer.descriptor, i, 9);
            throw F60.createAndThrow();
        }
        this.title = str;
        if ((i & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str3;
        }
        this.type = str4;
        if ((i & 16) == 0) {
            this.connectorId = null;
        } else {
            this.connectorId = str5;
        }
        if ((i & 32) == 0) {
            this.scopeKey = null;
        } else {
            this.scopeKey = str6;
        }
        if ((i & 64) == 0) {
            this.url = null;
        } else {
            this.url = str7;
        }
        if ((i & 128) == 0) {
            this.authProviders = C0881AGi.A00;
        } else {
            this.authProviders = list;
        }
        if ((i & 256) == 0) {
            this.accountId = null;
        } else {
            this.accountId = str8;
        }
        if ((i & 512) == 0) {
            this.walletSetup = false;
        } else {
            this.walletSetup = z;
        }
        if ((i & 1024) == 0) {
            this.actionLabel = null;
        } else {
            this.actionLabel = str9;
        }
        if ((i & 2048) == 0) {
            this.walletSetupOptions = C0881AGi.A00;
        } else {
            this.walletSetupOptions = list2;
        }
    }

    public /* synthetic */ InternalLinkActionCardPresentation(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, boolean z, String str9, List list2, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? C0881AGi.A00 : list, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? C0881AGi.A00 : list2);
    }
}
