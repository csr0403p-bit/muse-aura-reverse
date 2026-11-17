package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.Ey9;
import X.G0U;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentPaintedMedia;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStateReason;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentVisibilityKt;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentVisibilityTracker {
    public int backgroundEntries;
    public final Function0<Long> clock;
    public long connectedAtMs;
    public VoiceEmbodimentPaintedMedia media;
    public int mediaChanges;
    public final long[] mediaMs;
    public final G0U<VoiceEmbodimentTransition, Unit> onTransition;
    public VoiceEmbodimentPlacement placement;
    public int placementChanges;
    public final long[] placementMs;
    public int rows;
    public boolean running;
    public long stateSinceMs;
    public boolean truncated;

    public final void reset() {
        this.running = false;
        this.connectedAtMs = 0L;
        this.stateSinceMs = 0L;
        long[] jArr = this.placementMs;
        Arrays.fill(jArr, 0, jArr.length, 0L);
        long[] jArr2 = this.mediaMs;
        Arrays.fill(jArr2, 0, jArr2.length, 0L);
        this.placementChanges = 0;
        this.mediaChanges = 0;
        this.backgroundEntries = 0;
        this.rows = 0;
        this.truncated = false;
    }

    public final void start() {
        if (this.running) {
            return;
        }
        this.running = true;
        long jA05 = C3cG.A05(this.clock.invoke());
        this.connectedAtMs = jA05;
        this.stateSinceMs = jA05;
        VoiceEmbodimentPlacement voiceEmbodimentPlacement = this.placement;
        if (voiceEmbodimentPlacement == VoiceEmbodimentPlacement.BACKGROUND) {
            this.backgroundEntries++;
        }
        emit("none", voiceEmbodimentPlacement.getValue(), "none", this.media.getValue(), VoiceEmbodimentStateReason.CALL_CONNECTED, 0L);
    }

    public final void update(VoiceEmbodimentPlacement voiceEmbodimentPlacement, VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia, VoiceEmbodimentStateReason voiceEmbodimentStateReason) {
        AnonymousClass005.A0x(voiceEmbodimentPlacement, voiceEmbodimentPaintedMedia, voiceEmbodimentStateReason);
        if (voiceEmbodimentPlacement == this.placement && voiceEmbodimentPaintedMedia == this.media) {
            return;
        }
        if (!this.running) {
            this.placement = voiceEmbodimentPlacement;
            this.media = voiceEmbodimentPaintedMedia;
            return;
        }
        long jAccumulate = accumulate();
        VoiceEmbodimentPlacement voiceEmbodimentPlacement2 = this.placement;
        if (voiceEmbodimentPlacement != voiceEmbodimentPlacement2) {
            this.placementChanges++;
            if (voiceEmbodimentPlacement == VoiceEmbodimentPlacement.BACKGROUND) {
                this.backgroundEntries++;
            }
        }
        VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia2 = this.media;
        if (voiceEmbodimentPaintedMedia != voiceEmbodimentPaintedMedia2) {
            this.mediaChanges++;
        }
        this.placement = voiceEmbodimentPlacement;
        this.media = voiceEmbodimentPaintedMedia;
        emit(voiceEmbodimentPlacement2.getValue(), voiceEmbodimentPlacement.getValue(), voiceEmbodimentPaintedMedia2.getValue(), voiceEmbodimentPaintedMedia.getValue(), voiceEmbodimentStateReason, jAccumulate);
    }

    private final long accumulate() {
        long jA05 = C3cG.A05(this.clock.invoke());
        long j = jA05 - this.stateSinceMs;
        if (j < 0) {
            j = 0;
        }
        long[] jArr = this.placementMs;
        VoiceEmbodimentPlacement voiceEmbodimentPlacement = this.placement;
        int iOrdinal = voiceEmbodimentPlacement.ordinal();
        jArr[iOrdinal] = jArr[iOrdinal] + j;
        if (VoiceEmbodimentVisibilityKt.getShowsEmbodiment(voiceEmbodimentPlacement)) {
            long[] jArr2 = this.mediaMs;
            int iOrdinal2 = this.media.ordinal();
            jArr2[iOrdinal2] = jArr2[iOrdinal2] + j;
        }
        this.stateSinceMs = jA05;
        return j;
    }

    private final void emit(String str, String str2, String str3, String str4, VoiceEmbodimentStateReason voiceEmbodimentStateReason, long j) {
        int i = this.rows;
        if (i >= 200) {
            this.truncated = true;
            return;
        }
        G0U<VoiceEmbodimentTransition, Unit> g0u = this.onTransition;
        long j2 = this.stateSinceMs - this.connectedAtMs;
        if (j2 < 0) {
            j2 = 0;
        }
        g0u.invoke(new VoiceEmbodimentTransition(i, j2, str, str2, str3, str4, voiceEmbodimentStateReason, j));
        this.rows++;
    }

    public final boolean isRunning() {
        return this.running;
    }

    public final VoiceEmbodimentVisibilityTotals stop() {
        if (!this.running) {
            return null;
        }
        emit(this.placement.getValue(), "none", this.media.getValue(), "none", VoiceEmbodimentStateReason.CALL_END, accumulate());
        this.running = false;
        Ey9<VoiceEmbodimentPlacement> entries = VoiceEmbodimentPlacement.getEntries();
        int iA03 = C3cG.A03(entries, 10);
        if (iA03 < 16) {
            iA03 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA03);
        for (VoiceEmbodimentPlacement voiceEmbodimentPlacement : entries) {
            linkedHashMap.put(voiceEmbodimentPlacement, Long.valueOf(this.placementMs[voiceEmbodimentPlacement.ordinal()]));
        }
        Ey9<VoiceEmbodimentPaintedMedia> entries2 = VoiceEmbodimentPaintedMedia.getEntries();
        int iA032 = C3cG.A03(entries2, 10);
        if (iA032 < 16) {
            iA032 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA032);
        for (VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia : entries2) {
            linkedHashMap2.put(voiceEmbodimentPaintedMedia, Long.valueOf(this.mediaMs[voiceEmbodimentPaintedMedia.ordinal()]));
        }
        return new VoiceEmbodimentVisibilityTotals(linkedHashMap, linkedHashMap2, this.placementChanges, this.mediaChanges, this.backgroundEntries, this.rows, this.truncated);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceEmbodimentVisibilityTracker(Function0<Long> function0, G0U<? super VoiceEmbodimentTransition, Unit> g0u) {
        AnonymousClass003.A0u(function0, g0u);
        this.clock = function0;
        this.onTransition = g0u;
        this.placement = VoiceEmbodimentPlacement.UNAVAILABLE;
        this.media = VoiceEmbodimentPaintedMedia.NONE;
        this.placementMs = new long[VoiceEmbodimentPlacement.getEntries().size()];
        this.mediaMs = new long[VoiceEmbodimentPaintedMedia.getEntries().size()];
    }
}
