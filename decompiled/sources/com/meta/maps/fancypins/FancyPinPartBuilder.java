package com.meta.maps.fancypins;

import X.AbstractC0878AGe;
import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AnonymousClass003;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import X.C9jH;
import X.G0U;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FancyPinPartBuilder {
    public boolean alwaysVisible;
    public Object attachedConfig;
    public FancyPinClusteringPolicy clustering;
    public RectInsets collisionInsets;
    public String dependsOn;
    public final String id;
    public boolean occupiesSpace;
    public RectInsets overlapInsets;
    public final List<FancyPinPlacement> placements;
    public int rank;
    public final LayoutSize size;
    public Map<String, String> style;

    public final void dependsOn(String str) {
        C7384Etj.A0Y(str, 0);
        this.dependsOn = str;
    }

    public final void placement(FancyPinPlacement fancyPinPlacement) {
        C7384Etj.A0Y(fancyPinPlacement, 0);
        this.placements.add(fancyPinPlacement);
    }

    public final void placements(G0U<? super FancyPinPlacementBuilder, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        List<FancyPinPlacement> list = this.placements;
        FancyPinPlacementBuilder fancyPinPlacementBuilder = new FancyPinPlacementBuilder();
        g0u.invoke(fancyPinPlacementBuilder);
        list.addAll(AbstractC0878AGe.A0X(fancyPinPlacementBuilder.placements));
    }

    public final void style(Map<String, String> map) {
        C7384Etj.A0Y(map, 0);
        this.style = AbstractC7607F5u.A14(map);
    }

    public final void styleMerging(Map<String, String> map) {
        C7384Etj.A0Y(map, 0);
        this.style = AbstractC7608F5v.A13(this.style, map);
    }

    public final void styleValue(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        LinkedHashMap linkedHashMapA14 = AbstractC7607F5u.A14(this.style);
        if (str2 == null) {
            linkedHashMapA14.remove(str);
        } else {
            linkedHashMapA14.put(str, str2);
        }
        this.style = linkedHashMapA14;
    }

    public static /* synthetic */ void alwaysVisible$default(FancyPinPartBuilder fancyPinPartBuilder, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        fancyPinPartBuilder.alwaysVisible = z;
    }

    public static /* synthetic */ void clustering$default(FancyPinPartBuilder fancyPinPartBuilder, String str, String str2, RectInsets rectInsets, int i, Object obj) {
        if ((i & 4) != 0) {
            rectInsets = null;
        }
        fancyPinPartBuilder.clustering(str, str2, rectInsets);
    }

    public final void alwaysVisible(boolean z) {
        this.alwaysVisible = z;
    }

    public final void attachedConfig(Object obj) {
        this.attachedConfig = obj;
    }

    public final FancyPinPart build$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return new FancyPinPart(this.id, this.size, this.placements, this.style, this.rank, this.dependsOn, this.collisionInsets, this.overlapInsets, this.alwaysVisible, this.occupiesSpace, this.clustering, this.attachedConfig);
    }

    public final void clustering(FancyPinClusteringPolicy fancyPinClusteringPolicy) {
        this.clustering = fancyPinClusteringPolicy;
    }

    public final void collisionInsets(double d) {
        this.collisionInsets = new RectInsets(d);
    }

    public final void occupiesSpace(boolean z) {
        this.occupiesSpace = z;
    }

    public final void overlapInsets(double d) {
        this.overlapInsets = new RectInsets(d);
    }

    public final void rank(int i) {
        this.rank = i;
    }

    public FancyPinPartBuilder(String str, LayoutSize layoutSize) {
        boolean zA1Y = C60P.A1Y(str, layoutSize);
        this.id = str;
        this.size = layoutSize;
        this.placements = C3cG.A0h();
        this.style = C9jH.A00;
        this.collisionInsets = RectInsets.ZERO;
        this.occupiesSpace = zA1Y;
    }

    public final void clustering(String str, String str2, RectInsets rectInsets) {
        AnonymousClass003.A0u(str, str2);
        this.clustering = new FancyPinClusteringPolicy(str, str2, rectInsets);
    }

    public final void collisionInsets(RectInsets rectInsets) {
        C7384Etj.A0Y(rectInsets, 0);
        this.collisionInsets = rectInsets;
    }

    public final void overlapInsets(RectInsets rectInsets) {
        this.overlapInsets = rectInsets;
    }

    public final void collisionInsets(double d, double d2, double d3, double d4) {
        this.collisionInsets = new RectInsets(d, d2, d3, d4);
    }

    public final void overlapInsets(double d, double d2, double d3, double d4) {
        this.overlapInsets = new RectInsets(d, d2, d3, d4);
    }
}
