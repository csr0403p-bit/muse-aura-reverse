package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class AuraModeOverrideHolder extends C06G {
    public static final int $stable = 0;
    public final AuraModeOverride dark;
    public final AuraModeOverride light;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraModeOverrideHolder) {
                AuraModeOverrideHolder auraModeOverrideHolder = (AuraModeOverrideHolder) obj;
                if (!C7384Etj.areEqual(this.light, auraModeOverrideHolder.light) || !C7384Etj.areEqual(this.dark, auraModeOverrideHolder.dark)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraModeOverrideHolder copy$default(AuraModeOverrideHolder auraModeOverrideHolder, AuraModeOverride auraModeOverride, AuraModeOverride auraModeOverride2, int i, Object obj) {
        if ((i & 1) != 0) {
            auraModeOverride = auraModeOverrideHolder.light;
        }
        if ((i & 2) != 0) {
            auraModeOverride2 = auraModeOverrideHolder.dark;
        }
        AnonymousClass003.A0u(auraModeOverride, auraModeOverride2);
        return new AuraModeOverrideHolder(auraModeOverride, auraModeOverride2);
    }

    public final AuraModeOverride component1() {
        return this.light;
    }

    public final AuraModeOverride component2() {
        return this.dark;
    }

    public final AuraModeOverride getDark() {
        return this.dark;
    }

    public final AuraModeOverride getLight() {
        return this.light;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.dark, AnonymousClass005.A0E(this.light));
    }

    public AuraModeOverrideHolder(AuraModeOverride auraModeOverride, AuraModeOverride auraModeOverride2) {
        AnonymousClass003.A0u(auraModeOverride, auraModeOverride2);
        this.light = auraModeOverride;
        this.dark = auraModeOverride2;
    }

    public final AuraModeOverrideHolder copy(AuraModeOverride auraModeOverride, AuraModeOverride auraModeOverride2) {
        AnonymousClass003.A0u(auraModeOverride, auraModeOverride2);
        return new AuraModeOverrideHolder(auraModeOverride, auraModeOverride2);
    }

    public String toString() {
        return super.toString();
    }
}
