package com.facebook.aura.vds.compose.common;

import X.C06G;

/* loaded from: classes.dex */
public final class AuraDrawableSourceResource extends C06G implements AuraDrawableSource {
    public static final int $stable = 0;
    public final int resId;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AuraDrawableSourceResource) && this.resId == ((AuraDrawableSourceResource) obj).resId);
    }

    public static /* synthetic */ AuraDrawableSourceResource copy$default(AuraDrawableSourceResource auraDrawableSourceResource, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = auraDrawableSourceResource.resId;
        }
        return new AuraDrawableSourceResource(i);
    }

    public final int component1() {
        return this.resId;
    }

    public final AuraDrawableSourceResource copy(int i) {
        return new AuraDrawableSourceResource(i);
    }

    public final int getResId() {
        return this.resId;
    }

    public int hashCode() {
        return this.resId;
    }

    public AuraDrawableSourceResource(int i) {
        this.resId = i;
    }

    public String toString() {
        return super.toString();
    }
}
