package com.facebook.aura.partners.voice.ui;

import X.C06H;
import X.C7384Etj;
import X.InterfaceC2178B0w;

/* loaded from: classes4.dex */
public final class RetainedActivityCover {
    public static final int $stable = 8;
    public final EmbodimentClipKind clipKind;
    public final InterfaceC2178B0w frame;
    public final int loadGeneration;
    public final long viewport;

    public RetainedActivityCover(InterfaceC2178B0w interfaceC2178B0w, int i, EmbodimentClipKind embodimentClipKind, long j) {
        C7384Etj.A0Y(interfaceC2178B0w, 0);
        this.frame = interfaceC2178B0w;
        this.loadGeneration = i;
        this.clipKind = embodimentClipKind;
        this.viewport = j;
    }

    public final EmbodimentClipKind getClipKind() {
        return this.clipKind;
    }

    public final InterfaceC2178B0w getFrame() {
        return this.frame;
    }

    public final int getLoadGeneration() {
        return this.loadGeneration;
    }

    /* renamed from: getViewport-NH-jbRc, reason: not valid java name */
    public final long m1818getViewportNHjbRc() {
        return this.viewport;
    }

    public /* synthetic */ RetainedActivityCover(InterfaceC2178B0w interfaceC2178B0w, int i, EmbodimentClipKind embodimentClipKind, long j, C06H c06h) {
        this(interfaceC2178B0w, i, embodimentClipKind, j);
    }
}
