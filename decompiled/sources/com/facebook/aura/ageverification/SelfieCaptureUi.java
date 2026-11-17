package com.facebook.aura.ageverification;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class SelfieCaptureUi extends C06G {
    public static final int $stable = 0;
    public final boolean bodyIsError;
    public final Integer bodyRes;
    public final int titleRes;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SelfieCaptureUi) {
                SelfieCaptureUi selfieCaptureUi = (SelfieCaptureUi) obj;
                if (this.titleRes != selfieCaptureUi.titleRes || !C7384Etj.areEqual(this.bodyRes, selfieCaptureUi.bodyRes) || this.bodyIsError != selfieCaptureUi.bodyIsError) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SelfieCaptureUi copy$default(SelfieCaptureUi selfieCaptureUi, int i, Integer num, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = selfieCaptureUi.titleRes;
        }
        if ((i2 & 2) != 0) {
            num = selfieCaptureUi.bodyRes;
        }
        if ((i2 & 4) != 0) {
            z = selfieCaptureUi.bodyIsError;
        }
        return new SelfieCaptureUi(i, num, z);
    }

    public final int component1() {
        return this.titleRes;
    }

    public final Integer component2() {
        return this.bodyRes;
    }

    public final boolean component3() {
        return this.bodyIsError;
    }

    public final SelfieCaptureUi copy(int i, Integer num, boolean z) {
        return new SelfieCaptureUi(i, num, z);
    }

    public final boolean getBodyIsError() {
        return this.bodyIsError;
    }

    public final Integer getBodyRes() {
        return this.bodyRes;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public int hashCode() {
        return C0KA.A00(((this.titleRes * 31) + AnonymousClass006.A0D(this.bodyRes)) * 31, this.bodyIsError);
    }

    public SelfieCaptureUi(int i, Integer num, boolean z) {
        this.titleRes = i;
        this.bodyRes = num;
        this.bodyIsError = z;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SelfieCaptureUi(int i, Integer num, boolean z, int i2, C06H c06h) {
        this(i, num, AnonymousClass005.A1O(i2, z));
    }
}
