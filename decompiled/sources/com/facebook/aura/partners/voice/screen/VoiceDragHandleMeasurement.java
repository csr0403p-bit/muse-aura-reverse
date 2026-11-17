package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class VoiceDragHandleMeasurement extends C06G {
    public static final int $stable = 8;
    public final int backdropColor;
    public final VoiceDragHandleCandidates candidates;
    public final VoiceDragHandleRestingGeometry geometry;
    public final VoiceDragHandleToneSource source;
    public final VoiceDragHandleTones tones;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceDragHandleMeasurement) {
                VoiceDragHandleMeasurement voiceDragHandleMeasurement = (VoiceDragHandleMeasurement) obj;
                if (!C7384Etj.areEqual(this.source, voiceDragHandleMeasurement.source) || !C7384Etj.areEqual(this.geometry, voiceDragHandleMeasurement.geometry) || this.backdropColor != voiceDragHandleMeasurement.backdropColor || !C7384Etj.areEqual(this.candidates, voiceDragHandleMeasurement.candidates) || !C7384Etj.areEqual(this.tones, voiceDragHandleMeasurement.tones)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceDragHandleMeasurement copy$default(VoiceDragHandleMeasurement voiceDragHandleMeasurement, VoiceDragHandleToneSource voiceDragHandleToneSource, VoiceDragHandleRestingGeometry voiceDragHandleRestingGeometry, int i, VoiceDragHandleCandidates voiceDragHandleCandidates, VoiceDragHandleTones voiceDragHandleTones, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            voiceDragHandleToneSource = voiceDragHandleMeasurement.source;
        }
        if ((i2 & 2) != 0) {
            voiceDragHandleRestingGeometry = voiceDragHandleMeasurement.geometry;
        }
        if ((i2 & 4) != 0) {
            i = voiceDragHandleMeasurement.backdropColor;
        }
        if ((i2 & 8) != 0) {
            voiceDragHandleCandidates = voiceDragHandleMeasurement.candidates;
        }
        if ((i2 & 16) != 0) {
            voiceDragHandleTones = voiceDragHandleMeasurement.tones;
        }
        return voiceDragHandleMeasurement.copy(voiceDragHandleToneSource, voiceDragHandleRestingGeometry, i, voiceDragHandleCandidates, voiceDragHandleTones);
    }

    public final VoiceDragHandleToneSource component1() {
        return this.source;
    }

    public final VoiceDragHandleRestingGeometry component2() {
        return this.geometry;
    }

    public final int component3() {
        return this.backdropColor;
    }

    public final VoiceDragHandleCandidates component4() {
        return this.candidates;
    }

    public final VoiceDragHandleTones component5() {
        return this.tones;
    }

    public final int getBackdropColor() {
        return this.backdropColor;
    }

    public final VoiceDragHandleCandidates getCandidates() {
        return this.candidates;
    }

    public final VoiceDragHandleRestingGeometry getGeometry() {
        return this.geometry;
    }

    public final VoiceDragHandleToneSource getSource() {
        return this.source;
    }

    public final VoiceDragHandleTones getTones() {
        return this.tones;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.tones, AnonymousClass005.A0F(this.candidates, (AnonymousClass005.A0F(this.geometry, AnonymousClass005.A0E(this.source)) + this.backdropColor) * 31));
    }

    public VoiceDragHandleMeasurement(VoiceDragHandleToneSource voiceDragHandleToneSource, VoiceDragHandleRestingGeometry voiceDragHandleRestingGeometry, int i, VoiceDragHandleCandidates voiceDragHandleCandidates, VoiceDragHandleTones voiceDragHandleTones) {
        AnonymousClass005.A0y(voiceDragHandleToneSource, voiceDragHandleRestingGeometry, voiceDragHandleCandidates);
        C7384Etj.A0Y(voiceDragHandleTones, 4);
        this.source = voiceDragHandleToneSource;
        this.geometry = voiceDragHandleRestingGeometry;
        this.backdropColor = i;
        this.candidates = voiceDragHandleCandidates;
        this.tones = voiceDragHandleTones;
    }

    public final VoiceDragHandleMeasurement copy(VoiceDragHandleToneSource voiceDragHandleToneSource, VoiceDragHandleRestingGeometry voiceDragHandleRestingGeometry, int i, VoiceDragHandleCandidates voiceDragHandleCandidates, VoiceDragHandleTones voiceDragHandleTones) {
        AnonymousClass005.A0y(voiceDragHandleToneSource, voiceDragHandleRestingGeometry, voiceDragHandleCandidates);
        C7384Etj.A0Y(voiceDragHandleTones, 4);
        return new VoiceDragHandleMeasurement(voiceDragHandleToneSource, voiceDragHandleRestingGeometry, i, voiceDragHandleCandidates, voiceDragHandleTones);
    }

    public String toString() {
        return super.toString();
    }
}
