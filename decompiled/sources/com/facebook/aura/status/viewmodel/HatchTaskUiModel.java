package com.facebook.aura.status.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchTaskUiModel extends C06G {
    public final TaskCategory category;
    public final boolean enabled;
    public final String executionTarget;
    public final String id;
    public final String mode;
    public final String path;
    public final String subtitle;
    public final String timeText;
    public final String title;

    public static /* synthetic */ HatchTaskUiModel copy$default(HatchTaskUiModel hatchTaskUiModel, String str, String str2, String str3, TaskCategory taskCategory, String str4, boolean z, String str5, String str6, String str7, int i, Object obj) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        TaskCategory taskCategory2 = taskCategory;
        String str11 = str4;
        boolean z2 = z;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        if ((i & 1) != 0) {
            str8 = hatchTaskUiModel.id;
        }
        if ((i & 2) != 0) {
            str9 = hatchTaskUiModel.title;
        }
        if ((i & 4) != 0) {
            str10 = hatchTaskUiModel.path;
        }
        if ((i & 8) != 0) {
            taskCategory2 = hatchTaskUiModel.category;
        }
        if ((i & 16) != 0) {
            str11 = hatchTaskUiModel.mode;
        }
        if ((i & 32) != 0) {
            z2 = hatchTaskUiModel.enabled;
        }
        if ((i & 64) != 0) {
            str12 = hatchTaskUiModel.subtitle;
        }
        if ((i & 128) != 0) {
            str13 = hatchTaskUiModel.timeText;
        }
        if ((i & 256) != 0) {
            str14 = hatchTaskUiModel.executionTarget;
        }
        AnonymousClass005.A0y(str8, str9, taskCategory2);
        return new HatchTaskUiModel(str8, str9, str10, taskCategory2, str11, z2, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTaskUiModel) {
                HatchTaskUiModel hatchTaskUiModel = (HatchTaskUiModel) obj;
                if (!C7384Etj.areEqual(this.id, hatchTaskUiModel.id) || !C7384Etj.areEqual(this.title, hatchTaskUiModel.title) || !C7384Etj.areEqual(this.path, hatchTaskUiModel.path) || this.category != hatchTaskUiModel.category || !C7384Etj.areEqual(this.mode, hatchTaskUiModel.mode) || this.enabled != hatchTaskUiModel.enabled || !C7384Etj.areEqual(this.subtitle, hatchTaskUiModel.subtitle) || !C7384Etj.areEqual(this.timeText, hatchTaskUiModel.timeText) || !C7384Etj.areEqual(this.executionTarget, hatchTaskUiModel.executionTarget)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.path;
    }

    public final TaskCategory component4() {
        return this.category;
    }

    public final String component5() {
        return this.mode;
    }

    public final boolean component6() {
        return this.enabled;
    }

    public final String component7() {
        return this.subtitle;
    }

    public final String component8() {
        return this.timeText;
    }

    public final String component9() {
        return this.executionTarget;
    }

    public final TaskCategory getCategory() {
        return this.category;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getExecutionTarget() {
        return this.executionTarget;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTimeText() {
        return this.timeText;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((C0KA.A01((AnonymousClass005.A0F(this.category, (AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0G(this.path)) * 31) + AnonymousClass006.A0G(this.mode)) * 31, this.enabled) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.timeText)) * 31) + AnonymousClass005.A0H(this.executionTarget);
    }

    public HatchTaskUiModel(String str, String str2, String str3, TaskCategory taskCategory, String str4, boolean z, String str5, String str6, String str7) {
        AnonymousClass005.A0y(str, str2, taskCategory);
        this.id = str;
        this.title = str2;
        this.path = str3;
        this.category = taskCategory;
        this.mode = str4;
        this.enabled = z;
        this.subtitle = str5;
        this.timeText = str6;
        this.executionTarget = str7;
    }

    public final HatchTaskUiModel copy(String str, String str2, String str3, TaskCategory taskCategory, String str4, boolean z, String str5, String str6, String str7) {
        AnonymousClass005.A0y(str, str2, taskCategory);
        return new HatchTaskUiModel(str, str2, str3, taskCategory, str4, z, str5, str6, str7);
    }

    public String toString() {
        return super.toString();
    }
}
