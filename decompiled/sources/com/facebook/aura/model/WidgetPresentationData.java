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
public final class WidgetPresentationData extends C06G implements HatchPresentationData {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final HatchWidget widget;

    public final class Companion {
        public final C9hr<WidgetPresentationData> serializer() {
            return WidgetPresentationData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final WidgetPresentationData copy(HatchWidget hatchWidget) {
        C7384Etj.A0Y(hatchWidget, 0);
        return new WidgetPresentationData(hatchWidget);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof WidgetPresentationData) && C7384Etj.areEqual(this.widget, ((WidgetPresentationData) obj).widget));
    }

    public /* synthetic */ WidgetPresentationData(int i, HatchWidget hatchWidget, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(WidgetPresentationData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.widget = hatchWidget;
    }

    public static /* synthetic */ WidgetPresentationData copy$default(WidgetPresentationData widgetPresentationData, HatchWidget hatchWidget, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchWidget = widgetPresentationData.widget;
        }
        C7384Etj.A0Y(hatchWidget, 0);
        return new WidgetPresentationData(hatchWidget);
    }

    public final HatchWidget component1() {
        return this.widget;
    }

    public final HatchWidget getWidget() {
        return this.widget;
    }

    public int hashCode() {
        return this.widget.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public WidgetPresentationData(HatchWidget hatchWidget) {
        C7384Etj.A0Y(hatchWidget, 0);
        this.widget = hatchWidget;
    }
}
