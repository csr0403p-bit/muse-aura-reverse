package com.facebook.aura.status.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;

/* loaded from: classes.dex */
public final class OutOfCreditsCta extends C06G {
    public final String currentTier;
    public final AuraSubscriptionPage destination;
    public final Boolean isPaidTier;
    public final String label;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OutOfCreditsCta) {
                OutOfCreditsCta outOfCreditsCta = (OutOfCreditsCta) obj;
                if (!C7384Etj.areEqual(this.label, outOfCreditsCta.label) || !C7384Etj.areEqual(this.destination, outOfCreditsCta.destination) || !C7384Etj.areEqual(this.isPaidTier, outOfCreditsCta.isPaidTier) || !C7384Etj.areEqual(this.currentTier, outOfCreditsCta.currentTier)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OutOfCreditsCta copy$default(OutOfCreditsCta outOfCreditsCta, String str, AuraSubscriptionPage auraSubscriptionPage, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = outOfCreditsCta.label;
        }
        if ((i & 2) != 0) {
            auraSubscriptionPage = outOfCreditsCta.destination;
        }
        if ((i & 4) != 0) {
            bool = outOfCreditsCta.isPaidTier;
        }
        if ((i & 8) != 0) {
            str2 = outOfCreditsCta.currentTier;
        }
        AnonymousClass003.A0u(str, auraSubscriptionPage);
        return new OutOfCreditsCta(str, auraSubscriptionPage, bool, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final AuraSubscriptionPage component2() {
        return this.destination;
    }

    public final Boolean component3() {
        return this.isPaidTier;
    }

    public final String component4() {
        return this.currentTier;
    }

    public final String getCurrentTier() {
        return this.currentTier;
    }

    public final AuraSubscriptionPage getDestination() {
        return this.destination;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.destination, AnonymousClass001.A0G(this.label)) + AnonymousClass006.A0D(this.isPaidTier)) * 31) + AnonymousClass005.A0H(this.currentTier);
    }

    public final Boolean isPaidTier() {
        return this.isPaidTier;
    }

    public OutOfCreditsCta(String str, AuraSubscriptionPage auraSubscriptionPage, Boolean bool, String str2) {
        AnonymousClass003.A0u(str, auraSubscriptionPage);
        this.label = str;
        this.destination = auraSubscriptionPage;
        this.isPaidTier = bool;
        this.currentTier = str2;
    }

    public final OutOfCreditsCta copy(String str, AuraSubscriptionPage auraSubscriptionPage, Boolean bool, String str2) {
        AnonymousClass003.A0u(str, auraSubscriptionPage);
        return new OutOfCreditsCta(str, auraSubscriptionPage, bool, str2);
    }

    public String toString() {
        return super.toString();
    }
}
