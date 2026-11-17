package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchTwoFactorChallenge extends C06G {
    public final String linkingTosContentVersion;
    public final List<HatchTwoFactorMethod> methods;
    public final HatchTwoFactorSourceApp sourceApp;
    public final String state;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTwoFactorChallenge) {
                HatchTwoFactorChallenge hatchTwoFactorChallenge = (HatchTwoFactorChallenge) obj;
                if (!C7384Etj.areEqual(this.state, hatchTwoFactorChallenge.state) || !C7384Etj.areEqual(this.methods, hatchTwoFactorChallenge.methods) || this.sourceApp != hatchTwoFactorChallenge.sourceApp || !C7384Etj.areEqual(this.linkingTosContentVersion, hatchTwoFactorChallenge.linkingTosContentVersion)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchTwoFactorChallenge copy$default(HatchTwoFactorChallenge hatchTwoFactorChallenge, String str, List list, HatchTwoFactorSourceApp hatchTwoFactorSourceApp, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchTwoFactorChallenge.state;
        }
        if ((i & 2) != 0) {
            list = hatchTwoFactorChallenge.methods;
        }
        if ((i & 4) != 0) {
            hatchTwoFactorSourceApp = hatchTwoFactorChallenge.sourceApp;
        }
        if ((i & 8) != 0) {
            str2 = hatchTwoFactorChallenge.linkingTosContentVersion;
        }
        AnonymousClass003.A0u(str, list);
        return new HatchTwoFactorChallenge(str, list, hatchTwoFactorSourceApp, str2);
    }

    public final String component1() {
        return this.state;
    }

    public final List<HatchTwoFactorMethod> component2() {
        return this.methods;
    }

    public final HatchTwoFactorSourceApp component3() {
        return this.sourceApp;
    }

    public final String component4() {
        return this.linkingTosContentVersion;
    }

    public final String getLinkingTosContentVersion() {
        return this.linkingTosContentVersion;
    }

    public final List<HatchTwoFactorMethod> getMethods() {
        return this.methods;
    }

    public final HatchTwoFactorSourceApp getSourceApp() {
        return this.sourceApp;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.methods, AnonymousClass001.A0G(this.state)) + AnonymousClass006.A0D(this.sourceApp)) * 31) + AnonymousClass005.A0H(this.linkingTosContentVersion);
    }

    public HatchTwoFactorChallenge(String str, List<HatchTwoFactorMethod> list, HatchTwoFactorSourceApp hatchTwoFactorSourceApp, String str2) {
        AnonymousClass003.A0u(str, list);
        this.state = str;
        this.methods = list;
        this.sourceApp = hatchTwoFactorSourceApp;
        this.linkingTosContentVersion = str2;
    }

    public final HatchTwoFactorChallenge copy(String str, List<HatchTwoFactorMethod> list, HatchTwoFactorSourceApp hatchTwoFactorSourceApp, String str2) {
        AnonymousClass003.A0u(str, list);
        return new HatchTwoFactorChallenge(str, list, hatchTwoFactorSourceApp, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchTwoFactorChallenge(String str, List list, HatchTwoFactorSourceApp hatchTwoFactorSourceApp, String str2, int i, C06H c06h) {
        this(str, list, (i & 4) != 0 ? null : hatchTwoFactorSourceApp, (i & 8) != 0 ? null : str2);
    }
}
