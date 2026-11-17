package com.facebook.aura.file.utils;

import X.C06H;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes.dex */
public final class HatchSaveLogOrigin {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final HatchComponent component;
    public final String mediaType;
    public final HatchScreen screen;
    public final HatchSubsurface subsurface;
    public final HatchSurface surface;

    public final HatchComponent getComponent() {
        return this.component;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final HatchScreen getScreen() {
        return this.screen;
    }

    public final HatchSubsurface getSubsurface() {
        return this.subsurface;
    }

    public final HatchSurface getSurface() {
        return this.surface;
    }

    public final class Companion {
        public final HatchSaveLogOrigin mediaViewer(String str) {
            C7384Etj.A0Y(str, 0);
            return new HatchSaveLogOrigin(HatchSurface.MEDIA_VIEWER, HatchSubsurface.MEDIA_CONTROLS, HatchScreen.MEDIA_FULLSCREEN, HatchComponent.SAVE_BUTTON, str);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchSaveLogOrigin(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str) {
        this.surface = hatchSurface;
        this.subsurface = hatchSubsurface;
        this.screen = hatchScreen;
        this.component = hatchComponent;
        this.mediaType = str;
    }

    public /* synthetic */ HatchSaveLogOrigin(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, HatchComponent hatchComponent, String str, C06H c06h) {
        this(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str);
    }
}
