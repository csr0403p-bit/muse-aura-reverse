package com.facebook.aura.model;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SpaceBuildCompletedWidgetData extends C06G implements HatchWidgetData {
    public final SpaceBuildCompletedPresentation card;
    public static final Companion Companion = new Companion();
    public static final int $stable = SpaceBuildCompletedPresentation.$stable;

    public final class Companion {
        public final C9hr<SpaceBuildCompletedWidgetData> serializer() {
            return SpaceBuildCompletedWidgetData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SpaceBuildCompletedWidgetData copy(SpaceBuildCompletedPresentation spaceBuildCompletedPresentation) {
        C7384Etj.A0Y(spaceBuildCompletedPresentation, 0);
        return new SpaceBuildCompletedWidgetData(spaceBuildCompletedPresentation);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SpaceBuildCompletedWidgetData) && C7384Etj.areEqual(this.card, ((SpaceBuildCompletedWidgetData) obj).card));
    }

    public /* synthetic */ SpaceBuildCompletedWidgetData(int i, SpaceBuildCompletedPresentation spaceBuildCompletedPresentation, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SpaceBuildCompletedWidgetData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.card = spaceBuildCompletedPresentation;
    }

    public static /* synthetic */ SpaceBuildCompletedWidgetData copy$default(SpaceBuildCompletedWidgetData spaceBuildCompletedWidgetData, SpaceBuildCompletedPresentation spaceBuildCompletedPresentation, int i, Object obj) {
        if ((i & 1) != 0) {
            spaceBuildCompletedPresentation = spaceBuildCompletedWidgetData.card;
        }
        C7384Etj.A0Y(spaceBuildCompletedPresentation, 0);
        return new SpaceBuildCompletedWidgetData(spaceBuildCompletedPresentation);
    }

    public final SpaceBuildCompletedPresentation component1() {
        return this.card;
    }

    public final SpaceBuildCompletedPresentation getCard() {
        return this.card;
    }

    public int hashCode() {
        return this.card.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public SpaceBuildCompletedWidgetData(SpaceBuildCompletedPresentation spaceBuildCompletedPresentation) {
        C7384Etj.A0Y(spaceBuildCompletedPresentation, 0);
        this.card = spaceBuildCompletedPresentation;
    }
}
