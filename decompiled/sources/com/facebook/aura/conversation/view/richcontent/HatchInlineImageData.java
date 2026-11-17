package com.facebook.aura.conversation.view.richcontent;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchInlineImageData extends C06G {
    public static final int $stable = 0;
    public final String alt;
    public final boolean deleted;
    public final String url;
    public final String workspacePath;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchInlineImageData) {
                HatchInlineImageData hatchInlineImageData = (HatchInlineImageData) obj;
                if (!C7384Etj.areEqual(this.url, hatchInlineImageData.url) || !C7384Etj.areEqual(this.alt, hatchInlineImageData.alt) || this.deleted != hatchInlineImageData.deleted || !C7384Etj.areEqual(this.workspacePath, hatchInlineImageData.workspacePath)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchInlineImageData copy$default(HatchInlineImageData hatchInlineImageData, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchInlineImageData.url;
        }
        if ((i & 2) != 0) {
            str2 = hatchInlineImageData.alt;
        }
        if ((i & 4) != 0) {
            z = hatchInlineImageData.deleted;
        }
        if ((i & 8) != 0) {
            str3 = hatchInlineImageData.workspacePath;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchInlineImageData(str, str2, z, str3);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.alt;
    }

    public final boolean component3() {
        return this.deleted;
    }

    public final String component4() {
        return this.workspacePath;
    }

    public final String getAlt() {
        return this.alt;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getWorkspacePath() {
        return this.workspacePath;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass005.A0I(this.alt, AnonymousClass001.A0G(this.url)), this.deleted) + AnonymousClass006.A0G(this.workspacePath);
    }

    public HatchInlineImageData(String str, String str2, boolean z, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.url = str;
        this.alt = str2;
        this.deleted = z;
        this.workspacePath = str3;
    }

    public final HatchInlineImageData copy(String str, String str2, boolean z, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new HatchInlineImageData(str, str2, z, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchInlineImageData(String str, String str2, boolean z, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass005.A1O(i, z), AnonymousClass006.A0u(i, str3));
    }
}
