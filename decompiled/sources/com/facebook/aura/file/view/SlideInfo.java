package com.facebook.aura.file.view;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class SlideInfo extends C06G {
    public static final int $stable = 0;
    public final String absolutePath;
    public final String id;
    public final String pageTitle;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SlideInfo) {
                SlideInfo slideInfo = (SlideInfo) obj;
                if (!C7384Etj.areEqual(this.id, slideInfo.id) || !C7384Etj.areEqual(this.pageTitle, slideInfo.pageTitle) || !C7384Etj.areEqual(this.absolutePath, slideInfo.absolutePath)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SlideInfo copy$default(SlideInfo slideInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slideInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = slideInfo.pageTitle;
        }
        if ((i & 4) != 0) {
            str3 = slideInfo.absolutePath;
        }
        return slideInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.pageTitle;
    }

    public final String component3() {
        return this.absolutePath;
    }

    public final String getAbsolutePath() {
        return this.absolutePath;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.absolutePath, AnonymousClass005.A0I(this.pageTitle, AnonymousClass001.A0G(this.id)));
    }

    public SlideInfo(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.id = str;
        this.pageTitle = str2;
        this.absolutePath = str3;
    }

    public final SlideInfo copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new SlideInfo(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
