package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class DisclaimerRun extends C06G {
    public static final int $stable = 0;
    public final String text;
    public final String token;

    public DisclaimerRun(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
        this.token = str2;
    }

    public final DisclaimerRun copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new DisclaimerRun(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DisclaimerRun) {
                DisclaimerRun disclaimerRun = (DisclaimerRun) obj;
                if (!C7384Etj.areEqual(this.text, disclaimerRun.text) || !C7384Etj.areEqual(this.token, disclaimerRun.token)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DisclaimerRun copy$default(DisclaimerRun disclaimerRun, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = disclaimerRun.text;
        }
        if ((i & 2) != 0) {
            str2 = disclaimerRun.token;
        }
        C7384Etj.A0Y(str, 0);
        return new DisclaimerRun(str, str2);
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
