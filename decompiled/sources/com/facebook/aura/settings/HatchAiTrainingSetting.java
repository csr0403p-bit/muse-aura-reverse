package com.facebook.aura.settings;

import X.C06G;
import X.C0KA;

/* loaded from: classes.dex */
public final class HatchAiTrainingSetting extends C06G {
    public static final int $stable = 0;
    public final boolean isEnabled;
    public final boolean isObjectionFiled;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAiTrainingSetting) {
                HatchAiTrainingSetting hatchAiTrainingSetting = (HatchAiTrainingSetting) obj;
                if (this.isEnabled != hatchAiTrainingSetting.isEnabled || this.isObjectionFiled != hatchAiTrainingSetting.isObjectionFiled) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAiTrainingSetting copy$default(HatchAiTrainingSetting hatchAiTrainingSetting, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hatchAiTrainingSetting.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = hatchAiTrainingSetting.isObjectionFiled;
        }
        return new HatchAiTrainingSetting(z, z2);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final boolean component2() {
        return this.isObjectionFiled;
    }

    public final HatchAiTrainingSetting copy(boolean z, boolean z2) {
        return new HatchAiTrainingSetting(z, z2);
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A02(this.isEnabled), this.isObjectionFiled);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isLockedOff() {
        return this.isObjectionFiled && !this.isEnabled;
    }

    public final boolean isObjectionFiled() {
        return this.isObjectionFiled;
    }

    public HatchAiTrainingSetting(boolean z, boolean z2) {
        this.isEnabled = z;
        this.isObjectionFiled = z2;
    }

    public String toString() {
        return super.toString();
    }
}
