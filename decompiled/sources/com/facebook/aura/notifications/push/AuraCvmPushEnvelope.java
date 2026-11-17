package com.facebook.aura.notifications.push;

import X.AbstractC2258BHp;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import com.facebook.aura.notifications.push.AuraCvmPushEnvelopeParseResult;
import com.facebook.aura.spaces.repo.HatchSpacesDataSourceKt;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class AuraCvmPushEnvelope extends C06G {
    public static final Companion Companion = new Companion();
    public static final Set<String> markerKeys = C60O.A1B(HatchSpacesDataSourceKt.VERSION_QUERY_PARAM, "header", "nonce", "ct");
    public final String ciphertext;
    public final String header;
    public final String nonce;
    public final String version;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraCvmPushEnvelope) {
                AuraCvmPushEnvelope auraCvmPushEnvelope = (AuraCvmPushEnvelope) obj;
                if (!C7384Etj.areEqual(this.version, auraCvmPushEnvelope.version) || !C7384Etj.areEqual(this.header, auraCvmPushEnvelope.header) || !C7384Etj.areEqual(this.nonce, auraCvmPushEnvelope.nonce) || !C7384Etj.areEqual(this.ciphertext, auraCvmPushEnvelope.ciphertext)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraCvmPushEnvelope copy$default(AuraCvmPushEnvelope auraCvmPushEnvelope, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = auraCvmPushEnvelope.version;
        }
        if ((i & 2) != 0) {
            str2 = auraCvmPushEnvelope.header;
        }
        if ((i & 4) != 0) {
            str3 = auraCvmPushEnvelope.nonce;
        }
        if ((i & 8) != 0) {
            str4 = auraCvmPushEnvelope.ciphertext;
        }
        return auraCvmPushEnvelope.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.header;
    }

    public final String component3() {
        return this.nonce;
    }

    public final String component4() {
        return this.ciphertext;
    }

    public final String getCiphertext() {
        return this.ciphertext;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.ciphertext, AnonymousClass005.A0I(this.nonce, AnonymousClass005.A0I(this.header, AnonymousClass001.A0G(this.version))));
    }

    public final class Companion {
        public final AuraCvmPushEnvelopeParseResult parse(Map<String, String> map) {
            AuraCvmPushEnvelopeParseResult auraCvmPushEnvelopeParseResult;
            C7384Etj.A0Y(map, 0);
            Set<String> set = AuraCvmPushEnvelope.markerKeys;
            LinkedHashSet linkedHashSetA0k = C3cG.A0k();
            for (String str : set) {
                if (map.containsKey(str)) {
                    linkedHashSetA0k.add(str);
                }
            }
            if (linkedHashSetA0k.isEmpty()) {
                auraCvmPushEnvelopeParseResult = AuraCvmPushEnvelopeParseResult.Absent.INSTANCE;
            } else {
                if (linkedHashSetA0k.equals(set)) {
                    return new AuraCvmPushEnvelopeParseResult.Present(new AuraCvmPushEnvelope((String) AbstractC2258BHp.A0L(HatchSpacesDataSourceKt.VERSION_QUERY_PARAM, map), (String) AbstractC2258BHp.A0L("header", map), (String) AbstractC2258BHp.A0L("nonce", map), (String) AbstractC2258BHp.A0L("ct", map)));
                }
                auraCvmPushEnvelopeParseResult = AuraCvmPushEnvelopeParseResult.Malformed.INSTANCE;
            }
            return auraCvmPushEnvelopeParseResult;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraCvmPushEnvelope(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.version = str;
        this.header = str2;
        this.nonce = str3;
        this.ciphertext = str4;
    }

    public final AuraCvmPushEnvelope copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new AuraCvmPushEnvelope(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }
}
