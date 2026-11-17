package com.facebook.aura.vds.compose.theme;

import X.C06G;

/* loaded from: classes.dex */
public final class AuraDrawables extends C06G {
    public static final int $stable = 0;
    public final int checkboxChecked;
    public final int checkboxUnchecked;
    public final int radioChecked;
    public final int radioUnchecked;
    public final int spinnerLarge;
    public final int spinnerSmall;

    public static /* synthetic */ AuraDrawables copy$default(AuraDrawables auraDrawables, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        int i8 = i;
        int i9 = i2;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        int i13 = i6;
        if ((i7 & 1) != 0) {
            i8 = auraDrawables.spinnerSmall;
        }
        if ((i7 & 2) != 0) {
            i9 = auraDrawables.spinnerLarge;
        }
        if ((i7 & 4) != 0) {
            i10 = auraDrawables.checkboxChecked;
        }
        if ((i7 & 8) != 0) {
            i11 = auraDrawables.checkboxUnchecked;
        }
        if ((i7 & 16) != 0) {
            i12 = auraDrawables.radioChecked;
        }
        if ((i7 & 32) != 0) {
            i13 = auraDrawables.radioUnchecked;
        }
        return new AuraDrawables(i8, i9, i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraDrawables) {
                AuraDrawables auraDrawables = (AuraDrawables) obj;
                if (this.spinnerSmall != auraDrawables.spinnerSmall || this.spinnerLarge != auraDrawables.spinnerLarge || this.checkboxChecked != auraDrawables.checkboxChecked || this.checkboxUnchecked != auraDrawables.checkboxUnchecked || this.radioChecked != auraDrawables.radioChecked || this.radioUnchecked != auraDrawables.radioUnchecked) {
                }
            }
            return false;
        }
        return true;
    }

    public final int component1() {
        return this.spinnerSmall;
    }

    public final int component2() {
        return this.spinnerLarge;
    }

    public final int component3() {
        return this.checkboxChecked;
    }

    public final int component4() {
        return this.checkboxUnchecked;
    }

    public final int component5() {
        return this.radioChecked;
    }

    public final int component6() {
        return this.radioUnchecked;
    }

    public final AuraDrawables copy(int i, int i2, int i3, int i4, int i5, int i6) {
        return new AuraDrawables(i, i2, i3, i4, i5, i6);
    }

    public final int getCheckboxChecked() {
        return this.checkboxChecked;
    }

    public final int getCheckboxUnchecked() {
        return this.checkboxUnchecked;
    }

    public final int getRadioChecked() {
        return this.radioChecked;
    }

    public final int getRadioUnchecked() {
        return this.radioUnchecked;
    }

    public final int getSpinnerLarge() {
        return this.spinnerLarge;
    }

    public final int getSpinnerSmall() {
        return this.spinnerSmall;
    }

    public int hashCode() {
        return (((((((((this.spinnerSmall * 31) + this.spinnerLarge) * 31) + this.checkboxChecked) * 31) + this.checkboxUnchecked) * 31) + this.radioChecked) * 31) + this.radioUnchecked;
    }

    public AuraDrawables(int i, int i2, int i3, int i4, int i5, int i6) {
        this.spinnerSmall = i;
        this.spinnerLarge = i2;
        this.checkboxChecked = i3;
        this.checkboxUnchecked = i4;
        this.radioChecked = i5;
        this.radioUnchecked = i6;
    }

    public String toString() {
        return super.toString();
    }
}
