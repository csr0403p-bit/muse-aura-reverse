package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes.dex */
public final class HomeLinkOffer extends C06G {
    public static final int $stable = 8;
    public final AuraNavKey destination;
    public final String subtitle;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HomeLinkOffer) {
                HomeLinkOffer homeLinkOffer = (HomeLinkOffer) obj;
                if (!C7384Etj.areEqual(this.title, homeLinkOffer.title) || !C7384Etj.areEqual(this.subtitle, homeLinkOffer.subtitle) || !C7384Etj.areEqual(this.destination, homeLinkOffer.destination)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HomeLinkOffer copy$default(HomeLinkOffer homeLinkOffer, String str, String str2, AuraNavKey auraNavKey, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homeLinkOffer.title;
        }
        if ((i & 2) != 0) {
            str2 = homeLinkOffer.subtitle;
        }
        if ((i & 4) != 0) {
            auraNavKey = homeLinkOffer.destination;
        }
        return homeLinkOffer.copy(str, str2, auraNavKey);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final AuraNavKey component3() {
        return this.destination;
    }

    public final AuraNavKey getDestination() {
        return this.destination;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.destination, (AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle)) * 31);
    }

    public HomeLinkOffer(String str, String str2, AuraNavKey auraNavKey) {
        AnonymousClass003.A0v(str, auraNavKey);
        this.title = str;
        this.subtitle = str2;
        this.destination = auraNavKey;
    }

    public final HomeLinkOffer copy(String str, String str2, AuraNavKey auraNavKey) {
        AnonymousClass003.A0v(str, auraNavKey);
        return new HomeLinkOffer(str, str2, auraNavKey);
    }

    public String toString() {
        return super.toString();
    }
}
