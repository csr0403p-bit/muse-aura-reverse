package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;

/* loaded from: classes.dex */
public final class AuraInteractions extends C06G {
    public static final int $stable = 0;
    public final boolean buttonGroupDisabled;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AuraInteractions) && this.buttonGroupDisabled == ((AuraInteractions) obj).buttonGroupDisabled);
    }

    public static /* synthetic */ AuraInteractions copy$default(AuraInteractions auraInteractions, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = auraInteractions.buttonGroupDisabled;
        }
        return new AuraInteractions(z);
    }

    public final boolean component1() {
        return this.buttonGroupDisabled;
    }

    public final AuraInteractions copy(boolean z) {
        return new AuraInteractions(z);
    }

    public final boolean getButtonGroupDisabled() {
        return this.buttonGroupDisabled;
    }

    public int hashCode() {
        return this.buttonGroupDisabled ? 1231 : 1237;
    }

    public /* synthetic */ AuraInteractions(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public String toString() {
        return super.toString();
    }

    public AuraInteractions(boolean z) {
        this.buttonGroupDisabled = z;
    }

    public AuraInteractions() {
        this(false);
    }
}
