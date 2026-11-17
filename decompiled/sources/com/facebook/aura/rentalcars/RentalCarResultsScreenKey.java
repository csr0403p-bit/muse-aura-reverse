package com.facebook.aura.rentalcars;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class RentalCarResultsScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String hostMessageId;
    public final String presentationId;
    public final String sessionId;

    public final class Companion {
        public final C9hr<RentalCarResultsScreenKey> serializer() {
            return RentalCarResultsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarResultsScreenKey) {
                RentalCarResultsScreenKey rentalCarResultsScreenKey = (RentalCarResultsScreenKey) obj;
                if (!C7384Etj.areEqual(this.sessionId, rentalCarResultsScreenKey.sessionId) || !C7384Etj.areEqual(this.hostMessageId, rentalCarResultsScreenKey.hostMessageId) || !C7384Etj.areEqual(this.presentationId, rentalCarResultsScreenKey.presentationId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RentalCarResultsScreenKey copy$default(RentalCarResultsScreenKey rentalCarResultsScreenKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalCarResultsScreenKey.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = rentalCarResultsScreenKey.hostMessageId;
        }
        if ((i & 4) != 0) {
            str3 = rentalCarResultsScreenKey.presentationId;
        }
        return rentalCarResultsScreenKey.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_rentalcars_impl_keys_keys(RentalCarResultsScreenKey rentalCarResultsScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAP(rentalCarResultsScreenKey.sessionId, C07779iq.A01, c9iZ, 0);
        c9j5.AAV(rentalCarResultsScreenKey.hostMessageId, c9iZ, 1);
        c9j5.AAV(rentalCarResultsScreenKey.presentationId, c9iZ, 2);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.hostMessageId;
    }

    public final String component3() {
        return this.presentationId;
    }

    public final String getHostMessageId() {
        return this.hostMessageId;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.presentationId, AnonymousClass005.A0I(this.hostMessageId, AnonymousClass006.A0G(this.sessionId) * 31));
    }

    public RentalCarResultsScreenKey(String str, String str2, String str3) {
        AnonymousClass003.A0x(str2, str3);
        this.sessionId = str;
        this.hostMessageId = str2;
        this.presentationId = str3;
    }

    public final RentalCarResultsScreenKey copy(String str, String str2, String str3) {
        AnonymousClass003.A0x(str2, str3);
        return new RentalCarResultsScreenKey(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RentalCarResultsScreenKey(int i, String str, String str2, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(RentalCarResultsScreenKey$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.sessionId = str;
        this.hostMessageId = str2;
        this.presentationId = str3;
    }
}
