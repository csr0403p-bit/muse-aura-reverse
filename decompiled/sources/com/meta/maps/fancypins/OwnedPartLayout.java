package com.meta.maps.fancypins;

import X.AnonymousClass003;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class OwnedPartLayout {
    public static final Companion Companion = new Companion();
    public final double alpha;
    public final String id;
    public final int placementIndex;
    public final OwnedRect rect;
    public final int zIndex;

    public final class Companion {
        public final OwnedPartLayout from(PartLayout partLayout) {
            C7384Etj.A0Y(partLayout, 0);
            return new OwnedPartLayout(partLayout.id, OwnedRect.Companion.from(partLayout.rect), partLayout.zIndex, partLayout.alpha, partLayout.placementIndex);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final PartLayout materialize() {
        return new PartLayout(this.id, this.rect.materialize(), this.zIndex, this.alpha, this.placementIndex);
    }

    public OwnedPartLayout(String str, OwnedRect ownedRect, int i, double d, int i2) {
        AnonymousClass003.A0u(str, ownedRect);
        this.id = str;
        this.rect = ownedRect;
        this.zIndex = i;
        this.alpha = d;
        this.placementIndex = i2;
    }
}
