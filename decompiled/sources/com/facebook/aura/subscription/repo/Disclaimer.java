package com.facebook.aura.subscription.repo;

import X.AHD;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BO6;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class Disclaimer extends C06G {
    public static final int $stable = 0;
    public final AHD<DisclaimerRun> runs;
    public final BO6<String, String> urlsByToken;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Disclaimer) {
                Disclaimer disclaimer = (Disclaimer) obj;
                if (!C7384Etj.areEqual(this.runs, disclaimer.runs) || !C7384Etj.areEqual(this.urlsByToken, disclaimer.urlsByToken)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ Disclaimer copy$default(Disclaimer disclaimer, AHD ahd, BO6 bo6, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = disclaimer.runs;
        }
        if ((i & 2) != 0) {
            bo6 = disclaimer.urlsByToken;
        }
        AnonymousClass003.A0u(ahd, bo6);
        return new Disclaimer(ahd, bo6);
    }

    public final AHD<DisclaimerRun> component1() {
        return this.runs;
    }

    public final BO6<String, String> component2() {
        return this.urlsByToken;
    }

    public final AHD<DisclaimerRun> getRuns() {
        return this.runs;
    }

    public final BO6<String, String> getUrlsByToken() {
        return this.urlsByToken;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.urlsByToken, AnonymousClass005.A0E(this.runs));
    }

    public Disclaimer(AHD<DisclaimerRun> ahd, BO6<String, String> bo6) {
        AnonymousClass003.A0u(ahd, bo6);
        this.runs = ahd;
        this.urlsByToken = bo6;
    }

    public final Disclaimer copy(AHD<DisclaimerRun> ahd, BO6<String, String> bo6) {
        AnonymousClass003.A0u(ahd, bo6);
        return new Disclaimer(ahd, bo6);
    }

    public String toString() {
        return super.toString();
    }
}
