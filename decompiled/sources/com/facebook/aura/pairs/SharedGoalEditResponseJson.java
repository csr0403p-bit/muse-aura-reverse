package com.facebook.aura.pairs;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SharedGoalEditResponseJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final SharedGoalEditResultJson result;

    public final class Companion {
        public final C9hr<SharedGoalEditResponseJson> serializer() {
            return SharedGoalEditResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(SharedGoalEditResponseJson sharedGoalEditResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || sharedGoalEditResponseJson.result != null) {
            c9j5.AAP(sharedGoalEditResponseJson.result, SharedGoalEditResultJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SharedGoalEditResponseJson) && C7384Etj.areEqual(this.result, ((SharedGoalEditResponseJson) obj).result));
    }

    public static /* synthetic */ SharedGoalEditResponseJson copy$default(SharedGoalEditResponseJson sharedGoalEditResponseJson, SharedGoalEditResultJson sharedGoalEditResultJson, int i, Object obj) {
        if ((i & 1) != 0) {
            sharedGoalEditResultJson = sharedGoalEditResponseJson.result;
        }
        return new SharedGoalEditResponseJson(sharedGoalEditResultJson);
    }

    public final SharedGoalEditResultJson component1() {
        return this.result;
    }

    public final SharedGoalEditResponseJson copy(SharedGoalEditResultJson sharedGoalEditResultJson) {
        return new SharedGoalEditResponseJson(sharedGoalEditResultJson);
    }

    public final SharedGoalEditResultJson getResult() {
        return this.result;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.result);
    }

    public /* synthetic */ SharedGoalEditResponseJson(int i, SharedGoalEditResultJson sharedGoalEditResultJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.result = null;
        } else {
            this.result = sharedGoalEditResultJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public SharedGoalEditResponseJson(SharedGoalEditResultJson sharedGoalEditResultJson) {
        this.result = sharedGoalEditResultJson;
    }

    public /* synthetic */ SharedGoalEditResponseJson(SharedGoalEditResultJson sharedGoalEditResultJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : sharedGoalEditResultJson);
    }

    public SharedGoalEditResponseJson() {
        this(null);
    }
}
