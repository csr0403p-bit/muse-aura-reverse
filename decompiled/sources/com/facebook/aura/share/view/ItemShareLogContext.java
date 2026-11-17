package com.facebook.aura.share.view;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes.dex */
public final class ItemShareLogContext extends C06G {
    public static final int $stable = 0;
    public final HatchScreen screen;
    public final HatchSubsurface subsurface;
    public final HatchSurface surface;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ItemShareLogContext) {
                ItemShareLogContext itemShareLogContext = (ItemShareLogContext) obj;
                if (this.surface != itemShareLogContext.surface || this.subsurface != itemShareLogContext.subsurface || this.screen != itemShareLogContext.screen) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ItemShareLogContext copy$default(ItemShareLogContext itemShareLogContext, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSurface = itemShareLogContext.surface;
        }
        if ((i & 2) != 0) {
            hatchSubsurface = itemShareLogContext.subsurface;
        }
        if ((i & 4) != 0) {
            hatchScreen = itemShareLogContext.screen;
        }
        return itemShareLogContext.copy(hatchSurface, hatchSubsurface, hatchScreen);
    }

    public final HatchSurface component1() {
        return this.surface;
    }

    public final HatchSubsurface component2() {
        return this.subsurface;
    }

    public final HatchScreen component3() {
        return this.screen;
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

    public int hashCode() {
        return AnonymousClass005.A0G(this.screen, (AnonymousClass005.A0E(this.surface) + AnonymousClass006.A0D(this.subsurface)) * 31);
    }

    public ItemShareLogContext(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen) {
        AnonymousClass003.A0v(hatchSurface, hatchScreen);
        this.surface = hatchSurface;
        this.subsurface = hatchSubsurface;
        this.screen = hatchScreen;
    }

    public final ItemShareLogContext copy(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen) {
        AnonymousClass003.A0v(hatchSurface, hatchScreen);
        return new ItemShareLogContext(hatchSurface, hatchSubsurface, hatchScreen);
    }

    public String toString() {
        return super.toString();
    }
}
