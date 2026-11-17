package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchTosBodyRun extends C06G {
    public final String text;
    public final String url;

    public HatchTosBodyRun(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
        this.url = str2;
    }

    public final HatchTosBodyRun copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new HatchTosBodyRun(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTosBodyRun) {
                HatchTosBodyRun hatchTosBodyRun = (HatchTosBodyRun) obj;
                if (!C7384Etj.areEqual(this.text, hatchTosBodyRun.text) || !C7384Etj.areEqual(this.url, hatchTosBodyRun.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchTosBodyRun copy$default(HatchTosBodyRun hatchTosBodyRun, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchTosBodyRun.text;
        }
        if ((i & 2) != 0) {
            str2 = hatchTosBodyRun.url;
        }
        C7384Etj.A0Y(str, 0);
        return new HatchTosBodyRun(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.url;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.text) + AnonymousClass006.A0G(this.url);
    }

    public String toString() {
        return super.toString();
    }
}
