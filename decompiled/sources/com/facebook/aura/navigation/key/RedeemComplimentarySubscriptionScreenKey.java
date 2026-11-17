package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.F0C;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class RedeemComplimentarySubscriptionScreenKey extends C06G implements AuraFullScreenNavKey {
    public final ComplimentaryRedeemEntryPoint entryPoint;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, RedeemComplimentarySubscriptionScreenKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<RedeemComplimentarySubscriptionScreenKey> serializer() {
            return RedeemComplimentarySubscriptionScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final RedeemComplimentarySubscriptionScreenKey copy(ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint) {
        C7384Etj.A0Y(complimentaryRedeemEntryPoint, 0);
        return new RedeemComplimentarySubscriptionScreenKey(complimentaryRedeemEntryPoint);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RedeemComplimentarySubscriptionScreenKey) && this.entryPoint == ((RedeemComplimentarySubscriptionScreenKey) obj).entryPoint);
    }

    public /* synthetic */ RedeemComplimentarySubscriptionScreenKey(int i, ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(RedeemComplimentarySubscriptionScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.entryPoint = complimentaryRedeemEntryPoint;
    }

    public static /* synthetic */ RedeemComplimentarySubscriptionScreenKey copy$default(RedeemComplimentarySubscriptionScreenKey redeemComplimentarySubscriptionScreenKey, ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            complimentaryRedeemEntryPoint = redeemComplimentarySubscriptionScreenKey.entryPoint;
        }
        C7384Etj.A0Y(complimentaryRedeemEntryPoint, 0);
        return new RedeemComplimentarySubscriptionScreenKey(complimentaryRedeemEntryPoint);
    }

    public final ComplimentaryRedeemEntryPoint component1() {
        return this.entryPoint;
    }

    public final ComplimentaryRedeemEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public int hashCode() {
        return this.entryPoint.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public RedeemComplimentarySubscriptionScreenKey(ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint) {
        C7384Etj.A0Y(complimentaryRedeemEntryPoint, 0);
        this.entryPoint = complimentaryRedeemEntryPoint;
    }
}
