package com.facebook.aura.partners.accountlinking.nativeauthlogging;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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

@Serializable
/* loaded from: classes4.dex */
public final class NativeAuthAppStartDataRequestJson extends C06G {
    public final List<NativeAuthAccountJson> accounts;
    public final NativeAuthWaEligibilityFlagsJson wa_eligibility_flags;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, NativeAuthAppStartDataRequestJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<NativeAuthAppStartDataRequestJson> serializer() {
            return NativeAuthAppStartDataRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public NativeAuthAppStartDataRequestJson(List<NativeAuthAccountJson> list, NativeAuthWaEligibilityFlagsJson nativeAuthWaEligibilityFlagsJson) {
        C7384Etj.A0Y(list, 0);
        this.accounts = list;
        this.wa_eligibility_flags = nativeAuthWaEligibilityFlagsJson;
    }

    public final NativeAuthAppStartDataRequestJson copy(List<NativeAuthAccountJson> list, NativeAuthWaEligibilityFlagsJson nativeAuthWaEligibilityFlagsJson) {
        C7384Etj.A0Y(list, 0);
        return new NativeAuthAppStartDataRequestJson(list, nativeAuthWaEligibilityFlagsJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeAuthAppStartDataRequestJson) {
                NativeAuthAppStartDataRequestJson nativeAuthAppStartDataRequestJson = (NativeAuthAppStartDataRequestJson) obj;
                if (!C7384Etj.areEqual(this.accounts, nativeAuthAppStartDataRequestJson.accounts) || !C7384Etj.areEqual(this.wa_eligibility_flags, nativeAuthAppStartDataRequestJson.wa_eligibility_flags)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NativeAuthAppStartDataRequestJson copy$default(NativeAuthAppStartDataRequestJson nativeAuthAppStartDataRequestJson, List list, NativeAuthWaEligibilityFlagsJson nativeAuthWaEligibilityFlagsJson, int i, Object obj) {
        if ((i & 1) != 0) {
            list = nativeAuthAppStartDataRequestJson.accounts;
        }
        if ((i & 2) != 0) {
            nativeAuthWaEligibilityFlagsJson = nativeAuthAppStartDataRequestJson.wa_eligibility_flags;
        }
        C7384Etj.A0Y(list, 0);
        return new NativeAuthAppStartDataRequestJson(list, nativeAuthWaEligibilityFlagsJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_accountlinking_nativeauthlogging_nativeauthlogging(NativeAuthAppStartDataRequestJson nativeAuthAppStartDataRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(nativeAuthAppStartDataRequestJson.accounts, C3cH.A15($childSerializers, 0), c9iZ, 0);
        if (c9j5.AfR() || nativeAuthAppStartDataRequestJson.wa_eligibility_flags != null) {
            c9j5.AAP(nativeAuthAppStartDataRequestJson.wa_eligibility_flags, NativeAuthWaEligibilityFlagsJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public final List<NativeAuthAccountJson> component1() {
        return this.accounts;
    }

    public final NativeAuthWaEligibilityFlagsJson component2() {
        return this.wa_eligibility_flags;
    }

    public final List<NativeAuthAccountJson> getAccounts() {
        return this.accounts;
    }

    public final NativeAuthWaEligibilityFlagsJson getWa_eligibility_flags() {
        return this.wa_eligibility_flags;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.accounts) + AnonymousClass006.A0D(this.wa_eligibility_flags);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NativeAuthAppStartDataRequestJson(int i, List list, NativeAuthWaEligibilityFlagsJson nativeAuthWaEligibilityFlagsJson, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(NativeAuthAppStartDataRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.accounts = list;
        this.wa_eligibility_flags = (i & 2) == 0 ? null : nativeAuthWaEligibilityFlagsJson;
    }

    public /* synthetic */ NativeAuthAppStartDataRequestJson(List list, NativeAuthWaEligibilityFlagsJson nativeAuthWaEligibilityFlagsJson, int i, C06H c06h) {
        this(list, (i & 2) != 0 ? null : nativeAuthWaEligibilityFlagsJson);
    }
}
