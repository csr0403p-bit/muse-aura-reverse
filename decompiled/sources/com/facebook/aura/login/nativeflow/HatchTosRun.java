package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchTosRun extends C06G {
    public final String text;
    public final String token;

    public HatchTosRun(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
        this.token = str2;
    }

    public final HatchTosRun copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new HatchTosRun(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTosRun) {
                HatchTosRun hatchTosRun = (HatchTosRun) obj;
                if (!C7384Etj.areEqual(this.text, hatchTosRun.text) || !C7384Etj.areEqual(this.token, hatchTosRun.token)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchTosRun copy$default(HatchTosRun hatchTosRun, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchTosRun.text;
        }
        if ((i & 2) != 0) {
            str2 = hatchTosRun.token;
        }
        C7384Etj.A0Y(str, 0);
        return new HatchTosRun(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.token;
    }

    public final String getText() {
        return this.text;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.text) + AnonymousClass006.A0G(this.token);
    }

    public String toString() {
        return super.toString();
    }
}
