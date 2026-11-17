package com.facebook.aura.partners.voice.ui;

import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import android.net.Uri;
import com.facebook.aura.common.video.HatchVideoPlayer;

/* loaded from: classes4.dex */
public final class EmbodimentClip extends C06G {
    public static final int $stable = 8;
    public final EmbodimentClipKind kind;
    public final HatchVideoPlayer.ResizeMode resizeMode;
    public final Uri uri;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmbodimentClip) {
                EmbodimentClip embodimentClip = (EmbodimentClip) obj;
                if (this.kind != embodimentClip.kind || !C7384Etj.areEqual(this.uri, embodimentClip.uri) || this.resizeMode != embodimentClip.resizeMode) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmbodimentClip copy$default(EmbodimentClip embodimentClip, EmbodimentClipKind embodimentClipKind, Uri uri, HatchVideoPlayer.ResizeMode resizeMode, int i, Object obj) {
        if ((i & 1) != 0) {
            embodimentClipKind = embodimentClip.kind;
        }
        if ((i & 2) != 0) {
            uri = embodimentClip.uri;
        }
        if ((i & 4) != 0) {
            resizeMode = embodimentClip.resizeMode;
        }
        return embodimentClip.copy(embodimentClipKind, uri, resizeMode);
    }

    public final EmbodimentClipKind component1() {
        return this.kind;
    }

    public final Uri component2() {
        return this.uri;
    }

    public final HatchVideoPlayer.ResizeMode component3() {
        return this.resizeMode;
    }

    public final EmbodimentClipKind getKind() {
        return this.kind;
    }

    public final HatchVideoPlayer.ResizeMode getResizeMode() {
        return this.resizeMode;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.resizeMode, AnonymousClass005.A0F(this.uri, AnonymousClass005.A0E(this.kind)));
    }

    public EmbodimentClip(EmbodimentClipKind embodimentClipKind, Uri uri, HatchVideoPlayer.ResizeMode resizeMode) {
        AnonymousClass005.A0x(embodimentClipKind, uri, resizeMode);
        this.kind = embodimentClipKind;
        this.uri = uri;
        this.resizeMode = resizeMode;
    }

    public final EmbodimentClip copy(EmbodimentClipKind embodimentClipKind, Uri uri, HatchVideoPlayer.ResizeMode resizeMode) {
        AnonymousClass005.A0x(embodimentClipKind, uri, resizeMode);
        return new EmbodimentClip(embodimentClipKind, uri, resizeMode);
    }

    public String toString() {
        return super.toString();
    }
}
