package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cJ;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.F0C;
import X.F60;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthSsoAccountInfoRequestJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<AuthSsoAccountInfoEntryJson> accounts;
    public final String device_id;
    public final List<String> drawn_saved_account_ids;
    public final String id_for_aymh;
    public final List<String> supported_disclosure_presentations;
    public final List<String> supported_landing_presentations;
    public final String waterfall_id;

    public final class Companion {
        public final C9hr<AuthSsoAccountInfoRequestJson> serializer() {
            return AuthSsoAccountInfoRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, AuthSsoAccountInfoRequestJson$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, AuthSsoAccountInfoRequestJson$Companion$$childSerializers$2.INSTANCE), null, null, AbstractC5321DgF.A02(num, AuthSsoAccountInfoRequestJson$Companion$$childSerializers$3.INSTANCE), AbstractC5321DgF.A02(num, AuthSsoAccountInfoRequestJson$Companion$$childSerializers$4.INSTANCE)};
    }

    public final AuthSsoAccountInfoRequestJson copy(List<AuthSsoAccountInfoEntryJson> list, String str, List<String> list2, String str2, String str3, List<String> list3, List<String> list4) {
        C7384Etj.A0Y(list, 0);
        AnonymousClass003.A0z(list3, list4);
        return new AuthSsoAccountInfoRequestJson(list, str, list2, str2, str3, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthSsoAccountInfoRequestJson) {
                AuthSsoAccountInfoRequestJson authSsoAccountInfoRequestJson = (AuthSsoAccountInfoRequestJson) obj;
                if (!C7384Etj.areEqual(this.accounts, authSsoAccountInfoRequestJson.accounts) || !C7384Etj.areEqual(this.id_for_aymh, authSsoAccountInfoRequestJson.id_for_aymh) || !C7384Etj.areEqual(this.drawn_saved_account_ids, authSsoAccountInfoRequestJson.drawn_saved_account_ids) || !C7384Etj.areEqual(this.device_id, authSsoAccountInfoRequestJson.device_id) || !C7384Etj.areEqual(this.waterfall_id, authSsoAccountInfoRequestJson.waterfall_id) || !C7384Etj.areEqual(this.supported_disclosure_presentations, authSsoAccountInfoRequestJson.supported_disclosure_presentations) || !C7384Etj.areEqual(this.supported_landing_presentations, authSsoAccountInfoRequestJson.supported_landing_presentations)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AuthSsoAccountInfoRequestJson(int i, List list, String str, List list2, String str2, String str3, List list3, List list4, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(AuthSsoAccountInfoRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.accounts = list;
        if ((i & 2) == 0) {
            this.id_for_aymh = null;
        } else {
            this.id_for_aymh = str;
        }
        if ((i & 4) == 0) {
            this.drawn_saved_account_ids = null;
        } else {
            this.drawn_saved_account_ids = list2;
        }
        if ((i & 8) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str2;
        }
        if ((i & 16) == 0) {
            this.waterfall_id = null;
        } else {
            this.waterfall_id = str3;
        }
        if ((i & 32) == 0) {
            Set set = HatchDisclosurePresentation.DRAWN;
            ArrayList arrayListA0m = AnonymousClass002.A0m(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C3cJ.A0r(arrayListA0m, it);
            }
            this.supported_disclosure_presentations = arrayListA0m;
        } else {
            this.supported_disclosure_presentations = list3;
        }
        if ((i & 64) != 0) {
            this.supported_landing_presentations = list4;
            return;
        }
        Set set2 = HatchLandingPresentation.DRAWN;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(set2);
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            C3cJ.A0s(arrayListA0m2, it2);
        }
        this.supported_landing_presentations = arrayListA0m2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthSsoAccountInfoRequestJson copy$default(AuthSsoAccountInfoRequestJson authSsoAccountInfoRequestJson, List list, String str, List list2, String str2, String str3, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = authSsoAccountInfoRequestJson.accounts;
        }
        if ((i & 2) != 0) {
            str = authSsoAccountInfoRequestJson.id_for_aymh;
        }
        if ((i & 4) != 0) {
            list2 = authSsoAccountInfoRequestJson.drawn_saved_account_ids;
        }
        if ((i & 8) != 0) {
            str2 = authSsoAccountInfoRequestJson.device_id;
        }
        if ((i & 16) != 0) {
            str3 = authSsoAccountInfoRequestJson.waterfall_id;
        }
        if ((i & 32) != 0) {
            list3 = authSsoAccountInfoRequestJson.supported_disclosure_presentations;
        }
        if ((i & 64) != 0) {
            list4 = authSsoAccountInfoRequestJson.supported_landing_presentations;
        }
        return authSsoAccountInfoRequestJson.copy(list, str, list2, str2, str3, list3, list4);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(com.facebook.aura.login.nativeflow.AuthSsoAccountInfoRequestJson r7, X.C9j5 r8, X.C9iZ r9) {
        /*
            X.F0C<X.9hr<java.lang.Object>>[] r4 = com.facebook.aura.login.nativeflow.AuthSsoAccountInfoRequestJson.$childSerializers
            r2 = 0
            X.9hv r1 = X.C3cH.A15(r4, r2)
            java.util.List<com.facebook.aura.login.nativeflow.AuthSsoAccountInfoEntryJson> r0 = r7.accounts
            r8.AAQ(r0, r1, r9, r2)
            r2 = 1
            boolean r6 = r8.AfR()
            if (r6 != 0) goto L17
            java.lang.String r0 = r7.id_for_aymh
            if (r0 == 0) goto L1e
        L17:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r7.id_for_aymh
            r8.AAP(r0, r1, r9, r2)
        L1e:
            r2 = 2
            if (r6 != 0) goto L25
            java.util.List<java.lang.String> r0 = r7.drawn_saved_account_ids
            if (r0 == 0) goto L2e
        L25:
            X.9hv r1 = X.C3cH.A15(r4, r2)
            java.util.List<java.lang.String> r0 = r7.drawn_saved_account_ids
            r8.AAP(r0, r1, r9, r2)
        L2e:
            r2 = 3
            if (r6 != 0) goto L35
            java.lang.String r0 = r7.device_id
            if (r0 == 0) goto L3c
        L35:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r7.device_id
            r8.AAP(r0, r1, r9, r2)
        L3c:
            r2 = 4
            if (r6 != 0) goto L43
            java.lang.String r0 = r7.waterfall_id
            if (r0 == 0) goto L4a
        L43:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r7.waterfall_id
            r8.AAP(r0, r1, r9, r2)
        L4a:
            r5 = 5
            if (r6 != 0) goto L6b
            java.util.List<java.lang.String> r3 = r7.supported_disclosure_presentations
            java.util.Set r0 = com.facebook.aura.login.nativeflow.HatchDisclosurePresentation.access$getDRAWN$cp()
            java.util.ArrayList r2 = X.AnonymousClass002.A0m(r0)
            java.util.Iterator r1 = r0.iterator()
        L5b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L65
            X.C3cJ.A0r(r2, r1)
            goto L5b
        L65:
            boolean r0 = X.C7384Etj.areEqual(r3, r2)
            if (r0 != 0) goto L74
        L6b:
            X.9hv r1 = X.C3cH.A15(r4, r5)
            java.util.List<java.lang.String> r0 = r7.supported_disclosure_presentations
            r8.AAQ(r0, r1, r9, r5)
        L74:
            r5 = 6
            if (r6 != 0) goto L95
            java.util.List<java.lang.String> r3 = r7.supported_landing_presentations
            java.util.Set r0 = com.facebook.aura.login.nativeflow.HatchLandingPresentation.access$getDRAWN$cp()
            java.util.ArrayList r2 = X.AnonymousClass002.A0m(r0)
            java.util.Iterator r1 = r0.iterator()
        L85:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8f
            X.C3cJ.A0s(r2, r1)
            goto L85
        L8f:
            boolean r0 = X.C7384Etj.areEqual(r3, r2)
            if (r0 != 0) goto L9e
        L95:
            X.9hv r1 = X.C3cH.A15(r4, r5)
            java.util.List<java.lang.String> r0 = r7.supported_landing_presentations
            r8.AAQ(r0, r1, r9, r5)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.AuthSsoAccountInfoRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(com.facebook.aura.login.nativeflow.AuthSsoAccountInfoRequestJson, X.9j5, X.9iZ):void");
    }

    public final List<AuthSsoAccountInfoEntryJson> component1() {
        return this.accounts;
    }

    public final String component2() {
        return this.id_for_aymh;
    }

    public final List<String> component3() {
        return this.drawn_saved_account_ids;
    }

    public final String component4() {
        return this.device_id;
    }

    public final String component5() {
        return this.waterfall_id;
    }

    public final List<String> component6() {
        return this.supported_disclosure_presentations;
    }

    public final List<String> component7() {
        return this.supported_landing_presentations;
    }

    public final List<AuthSsoAccountInfoEntryJson> getAccounts() {
        return this.accounts;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final List<String> getDrawn_saved_account_ids() {
        return this.drawn_saved_account_ids;
    }

    public final String getId_for_aymh() {
        return this.id_for_aymh;
    }

    public final List<String> getSupported_disclosure_presentations() {
        return this.supported_disclosure_presentations;
    }

    public final List<String> getSupported_landing_presentations() {
        return this.supported_landing_presentations;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.supported_landing_presentations, AnonymousClass005.A0F(this.supported_disclosure_presentations, (((((((AnonymousClass005.A0E(this.accounts) + AnonymousClass006.A0G(this.id_for_aymh)) * 31) + AnonymousClass006.A0D(this.drawn_saved_account_ids)) * 31) + AnonymousClass006.A0G(this.device_id)) * 31) + AnonymousClass005.A0H(this.waterfall_id)) * 31));
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public /* synthetic */ AuthSsoAccountInfoRequestJson(List list, String str, List list2, String str2, String str3, List list3, List list4, int i, C06H c06h) {
        str = (i & 2) != 0 ? null : str;
        list2 = (i & 4) != 0 ? null : list2;
        str2 = (i & 8) != 0 ? null : str2;
        str3 = (i & 16) != 0 ? null : str3;
        if ((i & 32) != 0) {
            Set set = HatchDisclosurePresentation.DRAWN;
            list3 = AnonymousClass002.A0m(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C3cJ.A0r(list3, it);
            }
        }
        if ((i & 64) != 0) {
            Set set2 = HatchLandingPresentation.DRAWN;
            list4 = AnonymousClass002.A0m(set2);
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                C3cJ.A0s(list4, it2);
            }
        }
        this(list, str, list2, str2, str3, list3, list4);
    }

    public AuthSsoAccountInfoRequestJson(List<AuthSsoAccountInfoEntryJson> list, String str, List<String> list2, String str2, String str3, List<String> list3, List<String> list4) {
        C7384Etj.A0Y(list, 0);
        AnonymousClass003.A0z(list3, list4);
        this.accounts = list;
        this.id_for_aymh = str;
        this.drawn_saved_account_ids = list2;
        this.device_id = str2;
        this.waterfall_id = str3;
        this.supported_disclosure_presentations = list3;
        this.supported_landing_presentations = list4;
    }
}
