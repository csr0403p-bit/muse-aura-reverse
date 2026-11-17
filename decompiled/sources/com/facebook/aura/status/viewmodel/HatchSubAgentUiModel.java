package com.facebook.aura.status.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchSubAgentUiModel extends C06G {
    public final String id;
    public final String name;
    public final String toolActivity;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSubAgentUiModel) {
                HatchSubAgentUiModel hatchSubAgentUiModel = (HatchSubAgentUiModel) obj;
                if (!C7384Etj.areEqual(this.id, hatchSubAgentUiModel.id) || !C7384Etj.areEqual(this.name, hatchSubAgentUiModel.name) || !C7384Etj.areEqual(this.toolActivity, hatchSubAgentUiModel.toolActivity)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSubAgentUiModel copy$default(HatchSubAgentUiModel hatchSubAgentUiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchSubAgentUiModel.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchSubAgentUiModel.name;
        }
        if ((i & 4) != 0) {
            str3 = hatchSubAgentUiModel.toolActivity;
        }
        return hatchSubAgentUiModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.toolActivity;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getToolActivity() {
        return this.toolActivity;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0G(this.toolActivity);
    }

    public HatchSubAgentUiModel(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.name = str2;
        this.toolActivity = str3;
    }

    public final HatchSubAgentUiModel copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new HatchSubAgentUiModel(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
