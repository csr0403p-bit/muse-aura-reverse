package com.facebook.aura.partners.voice.screen;

import X.AaC;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.C8j4;

/* loaded from: classes4.dex */
public final class VoiceDragHandleRestingGeometry extends C06G {
    public static final int $stable = 0;
    public final long fullScreenHandleCenter;
    public final AaC fullScreenMedia;
    public final long halfScreenHandleCenter;
    public final AaC halfScreenMedia;
    public final long sampleSize;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceDragHandleRestingGeometry) {
                VoiceDragHandleRestingGeometry voiceDragHandleRestingGeometry = (VoiceDragHandleRestingGeometry) obj;
                if (!C7384Etj.areEqual(this.halfScreenMedia, voiceDragHandleRestingGeometry.halfScreenMedia) || !C7384Etj.areEqual(this.fullScreenMedia, voiceDragHandleRestingGeometry.fullScreenMedia) || this.halfScreenHandleCenter != voiceDragHandleRestingGeometry.halfScreenHandleCenter || this.fullScreenHandleCenter != voiceDragHandleRestingGeometry.fullScreenHandleCenter || this.sampleSize != voiceDragHandleRestingGeometry.sampleSize) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-oI1CydQ$default, reason: not valid java name */
    public static /* synthetic */ VoiceDragHandleRestingGeometry m1759copyoI1CydQ$default(VoiceDragHandleRestingGeometry voiceDragHandleRestingGeometry, AaC aaC, AaC aaC2, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            aaC = voiceDragHandleRestingGeometry.halfScreenMedia;
        }
        if ((i & 2) != 0) {
            aaC2 = voiceDragHandleRestingGeometry.fullScreenMedia;
        }
        if ((i & 4) != 0) {
            j = voiceDragHandleRestingGeometry.halfScreenHandleCenter;
        }
        if ((i & 8) != 0) {
            j2 = voiceDragHandleRestingGeometry.fullScreenHandleCenter;
        }
        if ((i & 16) != 0) {
            j3 = voiceDragHandleRestingGeometry.sampleSize;
        }
        return voiceDragHandleRestingGeometry.m1763copyoI1CydQ(aaC, aaC2, j, j2, j3);
    }

    public final AaC component1() {
        return this.halfScreenMedia;
    }

    public final AaC component2() {
        return this.fullScreenMedia;
    }

    /* renamed from: component3-F1C5BW0, reason: not valid java name */
    public final long m1760component3F1C5BW0() {
        return this.halfScreenHandleCenter;
    }

    /* renamed from: component4-F1C5BW0, reason: not valid java name */
    public final long m1761component4F1C5BW0() {
        return this.fullScreenHandleCenter;
    }

    /* renamed from: component5-NH-jbRc, reason: not valid java name */
    public final long m1762component5NHjbRc() {
        return this.sampleSize;
    }

    /* renamed from: getFullScreenHandleCenter-F1C5BW0, reason: not valid java name */
    public final long m1764getFullScreenHandleCenterF1C5BW0() {
        return this.fullScreenHandleCenter;
    }

    public final AaC getFullScreenMedia() {
        return this.fullScreenMedia;
    }

    /* renamed from: getHalfScreenHandleCenter-F1C5BW0, reason: not valid java name */
    public final long m1765getHalfScreenHandleCenterF1C5BW0() {
        return this.halfScreenHandleCenter;
    }

    public final AaC getHalfScreenMedia() {
        return this.halfScreenMedia;
    }

    /* renamed from: getSampleSize-NH-jbRc, reason: not valid java name */
    public final long m1766getSampleSizeNHjbRc() {
        return this.sampleSize;
    }

    public int hashCode() {
        return C8j4.A0B(this.sampleSize, AnonymousClass006.A06(this.fullScreenHandleCenter, AnonymousClass006.A06(this.halfScreenHandleCenter, AnonymousClass005.A0F(this.fullScreenMedia, AnonymousClass005.A0E(this.halfScreenMedia)))));
    }

    public VoiceDragHandleRestingGeometry(AaC aaC, AaC aaC2, long j, long j2, long j3) {
        AnonymousClass003.A0u(aaC, aaC2);
        this.halfScreenMedia = aaC;
        this.fullScreenMedia = aaC2;
        this.halfScreenHandleCenter = j;
        this.fullScreenHandleCenter = j2;
        this.sampleSize = j3;
    }

    /* renamed from: copy-oI1CydQ, reason: not valid java name */
    public final VoiceDragHandleRestingGeometry m1763copyoI1CydQ(AaC aaC, AaC aaC2, long j, long j2, long j3) {
        AnonymousClass003.A0u(aaC, aaC2);
        return new VoiceDragHandleRestingGeometry(aaC, aaC2, j, j2, j3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceDragHandleRestingGeometry(AaC aaC, AaC aaC2, long j, long j2, long j3, C06H c06h) {
        this(aaC, aaC2, j, j2, j3);
    }
}
