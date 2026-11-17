package com.facebook.aura.spaces.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class SpacesResponse extends C06G {
    public final AHD<SpaceCard> cards;
    public final int count;
    public final boolean ok;

    public SpacesResponse(boolean z, AHD<SpaceCard> ahd, int i) {
        C7384Etj.A0Y(ahd, 1);
        this.ok = z;
        this.cards = ahd;
        this.count = i;
    }

    public final SpacesResponse copy(boolean z, AHD<SpaceCard> ahd, int i) {
        C7384Etj.A0Y(ahd, 1);
        return new SpacesResponse(z, ahd, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpacesResponse) {
                SpacesResponse spacesResponse = (SpacesResponse) obj;
                if (this.ok != spacesResponse.ok || !C7384Etj.areEqual(this.cards, spacesResponse.cards) || this.count != spacesResponse.count) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpacesResponse copy$default(SpacesResponse spacesResponse, boolean z, AHD ahd, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = spacesResponse.ok;
        }
        if ((i2 & 2) != 0) {
            ahd = spacesResponse.cards;
        }
        if ((i2 & 4) != 0) {
            i = spacesResponse.count;
        }
        return spacesResponse.copy(z, ahd, i);
    }

    public final boolean component1() {
        return this.ok;
    }

    public final AHD<SpaceCard> component2() {
        return this.cards;
    }

    public final int component3() {
        return this.count;
    }

    public final AHD<SpaceCard> getCards() {
        return this.cards;
    }

    public final int getCount() {
        return this.count;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.cards, C0KA.A02(this.ok)) + this.count;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpacesResponse(boolean z, AHD ahd, int i, int i2, C06H c06h) {
        this(AnonymousClass001.A1P(i2, z), (i2 & 2) != 0 ? AHI.A01 : ahd, (i2 & 4) != 0 ? 0 : i);
    }

    public SpacesResponse() {
        this(false, AHI.A01, 0);
    }
}
