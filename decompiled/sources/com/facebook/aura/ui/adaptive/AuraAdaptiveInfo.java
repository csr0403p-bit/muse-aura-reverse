package com.facebook.aura.ui.adaptive;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;

/* loaded from: classes3.dex */
public final class AuraAdaptiveInfo extends C06G {
    public static final int $stable = 0;
    public final AuraHeightClass heightClass;
    public final AuraWidthClass widthClass;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraAdaptiveInfo) {
                AuraAdaptiveInfo auraAdaptiveInfo = (AuraAdaptiveInfo) obj;
                if (this.widthClass != auraAdaptiveInfo.widthClass || this.heightClass != auraAdaptiveInfo.heightClass) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraAdaptiveInfo copy$default(AuraAdaptiveInfo auraAdaptiveInfo, AuraWidthClass auraWidthClass, AuraHeightClass auraHeightClass, int i, Object obj) {
        if ((i & 1) != 0) {
            auraWidthClass = auraAdaptiveInfo.widthClass;
        }
        if ((i & 2) != 0) {
            auraHeightClass = auraAdaptiveInfo.heightClass;
        }
        AnonymousClass003.A0u(auraWidthClass, auraHeightClass);
        return new AuraAdaptiveInfo(auraWidthClass, auraHeightClass);
    }

    public final AuraWidthClass component1() {
        return this.widthClass;
    }

    public final AuraHeightClass component2() {
        return this.heightClass;
    }

    public final AuraHeightClass getHeightClass() {
        return this.heightClass;
    }

    public final AuraWidthClass getWidthClass() {
        return this.widthClass;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.heightClass, AnonymousClass005.A0E(this.widthClass));
    }

    public final boolean isCompact() {
        return this.widthClass == AuraWidthClass.Compact;
    }

    public final boolean isTwoPane() {
        return this.widthClass.compareTo(AuraWidthClass.Expanded) >= 0;
    }

    public AuraAdaptiveInfo(AuraWidthClass auraWidthClass, AuraHeightClass auraHeightClass) {
        AnonymousClass003.A0u(auraWidthClass, auraHeightClass);
        this.widthClass = auraWidthClass;
        this.heightClass = auraHeightClass;
    }

    public final AuraAdaptiveInfo copy(AuraWidthClass auraWidthClass, AuraHeightClass auraHeightClass) {
        AnonymousClass003.A0u(auraWidthClass, auraHeightClass);
        return new AuraAdaptiveInfo(auraWidthClass, auraHeightClass);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraAdaptiveInfo(AuraWidthClass auraWidthClass, AuraHeightClass auraHeightClass, int i, C06H c06h) {
        this((i & 1) != 0 ? AuraWidthClass.Compact : auraWidthClass, (i & 2) != 0 ? AuraHeightClass.Medium : auraHeightClass);
    }

    public AuraAdaptiveInfo() {
        this(AuraWidthClass.Compact, AuraHeightClass.Medium);
    }
}
