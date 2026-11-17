package com.facebook.aura.common.video;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class PlaybackLoadDebugInfo extends C06G {
    public static final int $stable = 0;
    public final PlaybackLoadSource loadSource;
    public final boolean startCachedApprox;
    public final String videoKeyHash;
    public final boolean wasUriPrefetched;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlaybackLoadDebugInfo) {
                PlaybackLoadDebugInfo playbackLoadDebugInfo = (PlaybackLoadDebugInfo) obj;
                if (this.loadSource != playbackLoadDebugInfo.loadSource || this.wasUriPrefetched != playbackLoadDebugInfo.wasUriPrefetched || this.startCachedApprox != playbackLoadDebugInfo.startCachedApprox || !C7384Etj.areEqual(this.videoKeyHash, playbackLoadDebugInfo.videoKeyHash)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PlaybackLoadDebugInfo copy$default(PlaybackLoadDebugInfo playbackLoadDebugInfo, PlaybackLoadSource playbackLoadSource, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            playbackLoadSource = playbackLoadDebugInfo.loadSource;
        }
        if ((i & 2) != 0) {
            z = playbackLoadDebugInfo.wasUriPrefetched;
        }
        if ((i & 4) != 0) {
            z2 = playbackLoadDebugInfo.startCachedApprox;
        }
        if ((i & 8) != 0) {
            str = playbackLoadDebugInfo.videoKeyHash;
        }
        AnonymousClass003.A0w(playbackLoadSource, str);
        return new PlaybackLoadDebugInfo(playbackLoadSource, z, z2, str);
    }

    public final PlaybackLoadSource component1() {
        return this.loadSource;
    }

    public final boolean component2() {
        return this.wasUriPrefetched;
    }

    public final boolean component3() {
        return this.startCachedApprox;
    }

    public final String component4() {
        return this.videoKeyHash;
    }

    public final PlaybackLoadSource getLoadSource() {
        return this.loadSource;
    }

    public final boolean getStartCachedApprox() {
        return this.startCachedApprox;
    }

    public final String getVideoKeyHash() {
        return this.videoKeyHash;
    }

    public final boolean getWasUriPrefetched() {
        return this.wasUriPrefetched;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.videoKeyHash, C0KA.A01(C0KA.A01(AnonymousClass005.A0E(this.loadSource), this.wasUriPrefetched), this.startCachedApprox));
    }

    public PlaybackLoadDebugInfo(PlaybackLoadSource playbackLoadSource, boolean z, boolean z2, String str) {
        AnonymousClass003.A0w(playbackLoadSource, str);
        this.loadSource = playbackLoadSource;
        this.wasUriPrefetched = z;
        this.startCachedApprox = z2;
        this.videoKeyHash = str;
    }

    public final PlaybackLoadDebugInfo copy(PlaybackLoadSource playbackLoadSource, boolean z, boolean z2, String str) {
        AnonymousClass003.A0w(playbackLoadSource, str);
        return new PlaybackLoadDebugInfo(playbackLoadSource, z, z2, str);
    }

    public String toString() {
        return super.toString();
    }
}
