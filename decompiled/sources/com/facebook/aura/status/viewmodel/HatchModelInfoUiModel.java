package com.facebook.aura.status.viewmodel;

import X.AnonymousClass001;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchModelInfoUiModel extends C06G {
    public final int contextTotal;
    public final int contextUsed;
    public final String modelName;
    public final int tokensIn;
    public final int tokensOut;

    public HatchModelInfoUiModel(int i, int i2, int i3, int i4, String str) {
        C7384Etj.A0Y(str, 4);
        this.tokensIn = i;
        this.tokensOut = i2;
        this.contextUsed = i3;
        this.contextTotal = i4;
        this.modelName = str;
    }

    public final HatchModelInfoUiModel copy(int i, int i2, int i3, int i4, String str) {
        C7384Etj.A0Y(str, 4);
        return new HatchModelInfoUiModel(i, i2, i3, i4, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchModelInfoUiModel) {
                HatchModelInfoUiModel hatchModelInfoUiModel = (HatchModelInfoUiModel) obj;
                if (this.tokensIn != hatchModelInfoUiModel.tokensIn || this.tokensOut != hatchModelInfoUiModel.tokensOut || this.contextUsed != hatchModelInfoUiModel.contextUsed || this.contextTotal != hatchModelInfoUiModel.contextTotal || !C7384Etj.areEqual(this.modelName, hatchModelInfoUiModel.modelName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchModelInfoUiModel copy$default(HatchModelInfoUiModel hatchModelInfoUiModel, int i, int i2, int i3, int i4, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = hatchModelInfoUiModel.tokensIn;
        }
        if ((i5 & 2) != 0) {
            i2 = hatchModelInfoUiModel.tokensOut;
        }
        if ((i5 & 4) != 0) {
            i3 = hatchModelInfoUiModel.contextUsed;
        }
        if ((i5 & 8) != 0) {
            i4 = hatchModelInfoUiModel.contextTotal;
        }
        if ((i5 & 16) != 0) {
            str = hatchModelInfoUiModel.modelName;
        }
        return hatchModelInfoUiModel.copy(i, i2, i3, i4, str);
    }

    public final int component1() {
        return this.tokensIn;
    }

    public final int component2() {
        return this.tokensOut;
    }

    public final int component3() {
        return this.contextUsed;
    }

    public final int component4() {
        return this.contextTotal;
    }

    public final String component5() {
        return this.modelName;
    }

    public final int getContextTotal() {
        return this.contextTotal;
    }

    public final int getContextUsed() {
        return this.contextUsed;
    }

    public final String getModelName() {
        return this.modelName;
    }

    public final int getTokensIn() {
        return this.tokensIn;
    }

    public final int getTokensOut() {
        return this.tokensOut;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.modelName, ((((((this.tokensIn * 31) + this.tokensOut) * 31) + this.contextUsed) * 31) + this.contextTotal) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
