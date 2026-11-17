package com.meta.maps.fancypins;

import X.AbstractC7607F5u;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Hr7;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FancyPinPart {
    public final boolean alwaysVisible;
    public final Object attachedConfig;
    public final FancyPinClusteringPolicy clustering;
    public final RectInsets collisionInsets;
    public final String dependsOn;
    public final String id;
    public final boolean occupiesSpace;
    public final RectInsets overlapInsets;
    public final List<FancyPinPlacement> placements;
    public final int rank;
    public final LayoutSize size;
    public final Map<String, String> style;

    public final boolean getAlwaysVisible() {
        return this.alwaysVisible;
    }

    public final Object getAttachedConfig() {
        return this.attachedConfig;
    }

    public final FancyPinClusteringPolicy getClustering() {
        return this.clustering;
    }

    public final RectInsets getCollisionInsets() {
        return this.collisionInsets;
    }

    public final String getDependsOn() {
        return this.dependsOn;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getOccupiesSpace() {
        return this.occupiesSpace;
    }

    public final RectInsets getOverlapInsets() {
        return this.overlapInsets;
    }

    public final List<FancyPinPlacement> getPlacements() {
        return this.placements;
    }

    public final int getRank() {
        return this.rank;
    }

    public final LayoutSize getSize() {
        return this.size;
    }

    public final Map<String, String> getStyle() {
        return this.style;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinPart(String str, LayoutSize layoutSize, List<FancyPinPlacement> list, Map<String, String> map) {
        this(str, layoutSize, list, map, 0, null, RectInsets.ZERO, null, false, true, null, null);
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(layoutSize, list, map, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinPart(String str, LayoutSize layoutSize, List<FancyPinPlacement> list, Map<String, String> map, int i) {
        this(str, layoutSize, list, map, i, null, RectInsets.ZERO, null, false, true, null, null);
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(layoutSize, list, map, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinPart(String str, LayoutSize layoutSize, List<FancyPinPlacement> list, Map<String, String> map, int i, String str2) {
        this(str, layoutSize, list, map, i, str2, RectInsets.ZERO, null, false, true, null, null);
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(layoutSize, list, map, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinPart(String str, LayoutSize layoutSize, List<FancyPinPlacement> list, Map<String, String> map, int i, String str2, RectInsets rectInsets) {
        this(str, layoutSize, list, map, i, str2, rectInsets, null, false, true, null, null);
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(layoutSize, list, map, 1);
        C7384Etj.A0Y(rectInsets, 6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinPart(String str, LayoutSize layoutSize, List<FancyPinPlacement> list, Map<String, String> map, int i, String str2, RectInsets rectInsets, RectInsets rectInsets2) {
        this(str, layoutSize, list, map, i, str2, rectInsets, rectInsets2, false, true, null, null);
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(layoutSize, list, map, 1);
        C7384Etj.A0Y(rectInsets, 6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinPart(String str, LayoutSize layoutSize, List<FancyPinPlacement> list, Map<String, String> map, int i, String str2, RectInsets rectInsets, RectInsets rectInsets2, boolean z) {
        this(str, layoutSize, list, map, i, str2, rectInsets, rectInsets2, z, true, null, null);
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(layoutSize, list, map, 1);
        C7384Etj.A0Y(rectInsets, 6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinPart(String str, LayoutSize layoutSize, List<FancyPinPlacement> list, Map<String, String> map, int i, String str2, RectInsets rectInsets, RectInsets rectInsets2, boolean z, boolean z2) {
        this(str, layoutSize, list, map, i, str2, rectInsets, rectInsets2, z, z2, null, null);
        AnonymousClass005.A14(str, layoutSize, list, map);
        C7384Etj.A0Y(rectInsets, 6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinPart(String str, LayoutSize layoutSize, List<FancyPinPlacement> list, Map<String, String> map, int i, String str2, RectInsets rectInsets, RectInsets rectInsets2, boolean z, boolean z2, FancyPinClusteringPolicy fancyPinClusteringPolicy) {
        this(str, layoutSize, list, map, i, str2, rectInsets, rectInsets2, z, z2, fancyPinClusteringPolicy, null);
        AnonymousClass005.A14(str, layoutSize, list, map);
        C7384Etj.A0Y(rectInsets, 6);
    }

    public FancyPinPart(String str, LayoutSize layoutSize, List<FancyPinPlacement> list, Map<String, String> map, int i, String str2, RectInsets rectInsets, RectInsets rectInsets2, boolean z, boolean z2, FancyPinClusteringPolicy fancyPinClusteringPolicy, Object obj) {
        AnonymousClass005.A14(str, layoutSize, list, map);
        C7384Etj.A0Y(rectInsets, 6);
        this.id = str;
        this.size = layoutSize;
        this.rank = i;
        this.dependsOn = str2;
        this.collisionInsets = rectInsets;
        this.overlapInsets = rectInsets2;
        this.alwaysVisible = z;
        this.occupiesSpace = z2;
        this.clustering = fancyPinClusteringPolicy;
        this.attachedConfig = obj;
        this.placements = Hr7.A1H(list);
        this.style = Collections.unmodifiableMap(AbstractC7607F5u.A14(map));
    }

    public /* synthetic */ FancyPinPart(String str, LayoutSize layoutSize, List list, Map map, int i, String str2, RectInsets rectInsets, RectInsets rectInsets2, boolean z, boolean z2, FancyPinClusteringPolicy fancyPinClusteringPolicy, Object obj, int i2, C06H c06h) {
        this(str, layoutSize, list, map, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? RectInsets.ZERO : rectInsets, (i2 & 128) != 0 ? null : rectInsets2, C3cG.A1K(i2 & 256, z), (i2 & 512) != 0 ? true : z2, (i2 & 1024) != 0 ? null : fancyPinClusteringPolicy, (i2 & 2048) != 0 ? null : obj);
    }
}
