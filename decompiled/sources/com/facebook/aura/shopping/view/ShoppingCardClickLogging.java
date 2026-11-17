package com.facebook.aura.shopping.view;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BO6;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;

/* loaded from: classes4.dex */
public final class ShoppingCardClickLogging extends C06G {
    public static final int $stable = 0;
    public final HatchComponent component;
    public final BO6<String, String> metadata;
    public final HatchScreen screen;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCardClickLogging) {
                ShoppingCardClickLogging shoppingCardClickLogging = (ShoppingCardClickLogging) obj;
                if (this.screen != shoppingCardClickLogging.screen || this.component != shoppingCardClickLogging.component || !C7384Etj.areEqual(this.metadata, shoppingCardClickLogging.metadata)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingCardClickLogging copy$default(ShoppingCardClickLogging shoppingCardClickLogging, HatchScreen hatchScreen, HatchComponent hatchComponent, BO6 bo6, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchScreen = shoppingCardClickLogging.screen;
        }
        if ((i & 2) != 0) {
            hatchComponent = shoppingCardClickLogging.component;
        }
        if ((i & 4) != 0) {
            bo6 = shoppingCardClickLogging.metadata;
        }
        return shoppingCardClickLogging.copy(hatchScreen, hatchComponent, bo6);
    }

    public final HatchScreen component1() {
        return this.screen;
    }

    public final HatchComponent component2() {
        return this.component;
    }

    public final BO6<String, String> component3() {
        return this.metadata;
    }

    public final HatchComponent getComponent() {
        return this.component;
    }

    public final BO6<String, String> getMetadata() {
        return this.metadata;
    }

    public final HatchScreen getScreen() {
        return this.screen;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.component, AnonymousClass005.A0E(this.screen)) + AnonymousClass006.A0D(this.metadata);
    }

    public ShoppingCardClickLogging(HatchScreen hatchScreen, HatchComponent hatchComponent, BO6<String, String> bo6) {
        AnonymousClass003.A0u(hatchScreen, hatchComponent);
        this.screen = hatchScreen;
        this.component = hatchComponent;
        this.metadata = bo6;
    }

    public final ShoppingCardClickLogging copy(HatchScreen hatchScreen, HatchComponent hatchComponent, BO6<String, String> bo6) {
        AnonymousClass003.A0u(hatchScreen, hatchComponent);
        return new ShoppingCardClickLogging(hatchScreen, hatchComponent, bo6);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingCardClickLogging(HatchScreen hatchScreen, HatchComponent hatchComponent, BO6 bo6, int i, C06H c06h) {
        this((i & 1) != 0 ? HatchScreen.PRODUCT_LIST : hatchScreen, (i & 2) != 0 ? HatchComponent.PRODUCT_CARD : hatchComponent, (i & 4) != 0 ? null : bo6);
    }

    public ShoppingCardClickLogging() {
        this(HatchScreen.PRODUCT_LIST, HatchComponent.PRODUCT_CARD, null);
    }
}
