package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass003;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentPaintedMedia;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement;
import java.util.Map;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentVisibilityTotals {
    public final int backgroundEntries;
    public final int mediaChanges;
    public final Map<VoiceEmbodimentPaintedMedia, Long> mediaMs;
    public final int placementChanges;
    public final Map<VoiceEmbodimentPlacement, Long> placementMs;
    public final int timelineRows;
    public final boolean timelineTruncated;

    public final int getBackgroundEntries() {
        return this.backgroundEntries;
    }

    public final int getMediaChanges() {
        return this.mediaChanges;
    }

    public final Map<VoiceEmbodimentPaintedMedia, Long> getMediaMs() {
        return this.mediaMs;
    }

    public final int getPlacementChanges() {
        return this.placementChanges;
    }

    public final Map<VoiceEmbodimentPlacement, Long> getPlacementMs() {
        return this.placementMs;
    }

    public final int getTimelineRows() {
        return this.timelineRows;
    }

    public final boolean getTimelineTruncated() {
        return this.timelineTruncated;
    }

    public VoiceEmbodimentVisibilityTotals(Map<VoiceEmbodimentPlacement, Long> map, Map<VoiceEmbodimentPaintedMedia, Long> map2, int i, int i2, int i3, int i4, boolean z) {
        AnonymousClass003.A0u(map, map2);
        this.placementMs = map;
        this.mediaMs = map2;
        this.placementChanges = i;
        this.mediaChanges = i2;
        this.backgroundEntries = i3;
        this.timelineRows = i4;
        this.timelineTruncated = z;
    }
}
