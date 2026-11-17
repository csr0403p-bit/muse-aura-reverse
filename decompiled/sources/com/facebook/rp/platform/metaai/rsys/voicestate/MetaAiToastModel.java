package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AbstractC05553uI;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public final class MetaAiToastModel extends C06G {

    @Deprecated
    public static final String SUPPORT_CATEGORY = "support";

    @SerializedName("action_label")
    public final String actionLabel;

    @SerializedName("action_url")
    public final String actionUrl;

    @SerializedName("category")
    public final String category;

    @SerializedName("title")
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaAiToastModel) {
                MetaAiToastModel metaAiToastModel = (MetaAiToastModel) obj;
                if (!C7384Etj.areEqual(this.title, metaAiToastModel.title) || !C7384Etj.areEqual(this.actionLabel, metaAiToastModel.actionLabel) || !C7384Etj.areEqual(this.actionUrl, metaAiToastModel.actionUrl) || !C7384Etj.areEqual(this.category, metaAiToastModel.category)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MetaAiToastModel copy$default(MetaAiToastModel metaAiToastModel, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metaAiToastModel.title;
        }
        if ((i & 2) != 0) {
            str2 = metaAiToastModel.actionLabel;
        }
        if ((i & 4) != 0) {
            str3 = metaAiToastModel.actionUrl;
        }
        if ((i & 8) != 0) {
            str4 = metaAiToastModel.category;
        }
        return new MetaAiToastModel(str, str2, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.actionLabel;
    }

    public final String component3() {
        return this.actionUrl;
    }

    public final String component4() {
        return this.category;
    }

    public final MetaAiToastModel copy(String str, String str2, String str3, String str4) {
        return new MetaAiToastModel(str, str2, str3, str4);
    }

    public final AbstractC05553uI getAction() {
        final String str;
        final String str2;
        final String str3 = this.title;
        if (str3 == null || C7BY.A0j(str3) || (str = this.actionLabel) == null || C7BY.A0j(str) || (str2 = this.actionUrl) == null || C7BY.A0j(str2) || !SUPPORT_CATEGORY.equals(this.category)) {
            return null;
        }
        return new AbstractC05553uI(str3, str, str2) { // from class: X.4JP
            public final String A00;
            public final String A01;
            public final String A02;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C4JP) {
                        C4JP c4jp = (C4JP) obj;
                        if (!C7384Etj.areEqual(this.A02, c4jp.A02) || !C7384Etj.areEqual(this.A00, c4jp.A00) || !C7384Etj.areEqual(this.A01, c4jp.A01)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return AnonymousClass001.A0H(this.A01, AnonymousClass005.A0I(this.A00, AnonymousClass001.A0G(this.A02)));
            }

            {
                this.A02 = str3;
                this.A00 = str;
                this.A01 = str2;
            }
        };
    }

    public final String getActionLabel() {
        return this.actionLabel;
    }

    public final String getActionUrl() {
        return this.actionUrl;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.actionLabel)) * 31) + AnonymousClass006.A0G(this.actionUrl)) * 31) + AnonymousClass005.A0H(this.category);
    }

    public final String invalidActionReason() {
        String str = this.category;
        if (!SUPPORT_CATEGORY.equals(str)) {
            if (str == null) {
                str = HatchCcvLoggingKt.NO_POSTAL_FIELD;
            }
            return FGI.A0M("unsupported_category=", str);
        }
        String str2 = this.title;
        if (str2 == null || C7BY.A0j(str2)) {
            return "missing_title";
        }
        String str3 = this.actionLabel;
        if (str3 == null || C7BY.A0j(str3)) {
            return "missing_action_label";
        }
        String str4 = this.actionUrl;
        return (str4 == null || C7BY.A0j(str4)) ? "missing_action_url" : "unknown";
    }

    public String toString() {
        return FGI.A0m("MetaAiToastModel(title=", this.title, ", actionLabel=", this.actionLabel, ", actionUrl=", this.actionUrl, ", category=", this.category, ")");
    }

    public MetaAiToastModel(String str, String str2, String str3, String str4) {
        this.title = str;
        this.actionLabel = str2;
        this.actionUrl = str3;
        this.category = str4;
    }

    public /* synthetic */ MetaAiToastModel(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public MetaAiToastModel() {
        this(null, null, null, null);
    }
}
