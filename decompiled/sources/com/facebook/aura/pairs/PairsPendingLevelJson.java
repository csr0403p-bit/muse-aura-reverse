package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C60R;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PairsPendingLevelJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long expires_at_ms;
    public final String preset;
    public final String state;

    public final class Companion {
        public final C9hr<PairsPendingLevelJson> serializer() {
            return PairsPendingLevelJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PairsPendingLevelJson pairsPendingLevelJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(pairsPendingLevelJson.preset, c9iZ, 0);
        c9j5.AAN(c9iZ, 1, pairsPendingLevelJson.expires_at_ms);
        c9j5.AAV(pairsPendingLevelJson.state, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PairsPendingLevelJson) {
                PairsPendingLevelJson pairsPendingLevelJson = (PairsPendingLevelJson) obj;
                if (!C7384Etj.areEqual(this.preset, pairsPendingLevelJson.preset) || this.expires_at_ms != pairsPendingLevelJson.expires_at_ms || !C7384Etj.areEqual(this.state, pairsPendingLevelJson.state)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PairsPendingLevelJson copy$default(PairsPendingLevelJson pairsPendingLevelJson, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pairsPendingLevelJson.preset;
        }
        if ((i & 2) != 0) {
            j = pairsPendingLevelJson.expires_at_ms;
        }
        if ((i & 4) != 0) {
            str2 = pairsPendingLevelJson.state;
        }
        return pairsPendingLevelJson.copy(str, j, str2);
    }

    public final String component1() {
        return this.preset;
    }

    public final long component2() {
        return this.expires_at_ms;
    }

    public final String component3() {
        return this.state;
    }

    public final long getExpires_at_ms() {
        return this.expires_at_ms;
    }

    public final String getPreset() {
        return this.preset;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.state, C60R.A00(this.expires_at_ms, AnonymousClass001.A0G(this.preset)));
    }

    public PairsPendingLevelJson(String str, long j, String str2) {
        AnonymousClass003.A0v(str, str2);
        this.preset = str;
        this.expires_at_ms = j;
        this.state = str2;
    }

    public final PairsPendingLevelJson copy(String str, long j, String str2) {
        AnonymousClass003.A0v(str, str2);
        return new PairsPendingLevelJson(str, j, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PairsPendingLevelJson(int i, String str, long j, String str2, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(PairsPendingLevelJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.preset = str;
        this.expires_at_ms = j;
        this.state = str2;
    }
}
