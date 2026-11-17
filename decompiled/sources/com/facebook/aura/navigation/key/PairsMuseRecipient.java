package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PairsMuseRecipient extends C06G {
    public static final Companion Companion = new Companion();
    public final String appTarget;
    public final String recipientId;
    public final String recipientType;
    public final String senderAccountId;

    public final class Companion {
        public final C9hr<PairsMuseRecipient> serializer() {
            return PairsMuseRecipient$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_keys_keys(PairsMuseRecipient pairsMuseRecipient, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(pairsMuseRecipient.appTarget, c9iZ, 0);
        c9j5.AAV(pairsMuseRecipient.recipientType, c9iZ, 1);
        c9j5.AAV(pairsMuseRecipient.recipientId, c9iZ, 2);
        c9j5.AAV(pairsMuseRecipient.senderAccountId, c9iZ, 3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PairsMuseRecipient) {
                PairsMuseRecipient pairsMuseRecipient = (PairsMuseRecipient) obj;
                if (!C7384Etj.areEqual(this.appTarget, pairsMuseRecipient.appTarget) || !C7384Etj.areEqual(this.recipientType, pairsMuseRecipient.recipientType) || !C7384Etj.areEqual(this.recipientId, pairsMuseRecipient.recipientId) || !C7384Etj.areEqual(this.senderAccountId, pairsMuseRecipient.senderAccountId)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ PairsMuseRecipient(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(PairsMuseRecipient$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.appTarget = str;
        this.recipientType = str2;
        this.recipientId = str3;
        this.senderAccountId = str4;
    }

    public static /* synthetic */ PairsMuseRecipient copy$default(PairsMuseRecipient pairsMuseRecipient, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pairsMuseRecipient.appTarget;
        }
        if ((i & 2) != 0) {
            str2 = pairsMuseRecipient.recipientType;
        }
        if ((i & 4) != 0) {
            str3 = pairsMuseRecipient.recipientId;
        }
        if ((i & 8) != 0) {
            str4 = pairsMuseRecipient.senderAccountId;
        }
        return pairsMuseRecipient.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.appTarget;
    }

    public final String component2() {
        return this.recipientType;
    }

    public final String component3() {
        return this.recipientId;
    }

    public final String component4() {
        return this.senderAccountId;
    }

    public final String getAppTarget() {
        return this.appTarget;
    }

    public final String getRecipientId() {
        return this.recipientId;
    }

    public final String getRecipientType() {
        return this.recipientType;
    }

    public final String getSenderAccountId() {
        return this.senderAccountId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.senderAccountId, AnonymousClass005.A0I(this.recipientId, AnonymousClass005.A0I(this.recipientType, AnonymousClass001.A0G(this.appTarget))));
    }

    public final PairsMuseRecipient copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new PairsMuseRecipient(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public PairsMuseRecipient(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.appTarget = str;
        this.recipientType = str2;
        this.recipientId = str3;
        this.senderAccountId = str4;
    }
}
