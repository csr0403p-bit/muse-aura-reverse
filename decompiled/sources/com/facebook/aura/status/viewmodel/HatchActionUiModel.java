package com.facebook.aura.status.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.ApQ;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchActionUiModel extends C06G {
    public final String id;
    public final boolean isVisible;
    public final ApQ richText;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchActionUiModel) {
                HatchActionUiModel hatchActionUiModel = (HatchActionUiModel) obj;
                if (!C7384Etj.areEqual(this.id, hatchActionUiModel.id) || !C7384Etj.areEqual(this.richText, hatchActionUiModel.richText) || this.isVisible != hatchActionUiModel.isVisible) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchActionUiModel copy$default(HatchActionUiModel hatchActionUiModel, String str, ApQ apQ, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchActionUiModel.id;
        }
        if ((i & 2) != 0) {
            apQ = hatchActionUiModel.richText;
        }
        if ((i & 4) != 0) {
            z = hatchActionUiModel.isVisible;
        }
        return hatchActionUiModel.copy(str, apQ, z);
    }

    public final String component1() {
        return this.id;
    }

    public final ApQ component2() {
        return this.richText;
    }

    public final boolean component3() {
        return this.isVisible;
    }

    public final String getId() {
        return this.id;
    }

    public final ApQ getRichText() {
        return this.richText;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.richText, AnonymousClass001.A0G(this.id)), this.isVisible);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public HatchActionUiModel(String str, ApQ apQ, boolean z) {
        AnonymousClass003.A0u(str, apQ);
        this.id = str;
        this.richText = apQ;
        this.isVisible = z;
    }

    public final HatchActionUiModel copy(String str, ApQ apQ, boolean z) {
        AnonymousClass003.A0u(str, apQ);
        return new HatchActionUiModel(str, apQ, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchActionUiModel(String str, ApQ apQ, boolean z, int i, C06H c06h) {
        this(str, apQ, (i & 4) != 0 ? true : z);
    }
}
