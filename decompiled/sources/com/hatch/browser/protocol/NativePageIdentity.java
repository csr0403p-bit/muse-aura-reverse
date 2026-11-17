package com.hatch.browser.protocol;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BV4;
import X.C06H;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes6.dex */
public abstract class NativePageIdentity {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class CdpTarget extends NativePageIdentity {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String browserInstanceId;
        public final String targetId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CdpTarget) {
                    CdpTarget cdpTarget = (CdpTarget) obj;
                    if (!C7384Etj.areEqual(this.browserInstanceId, cdpTarget.browserInstanceId) || !C7384Etj.areEqual(this.targetId, cdpTarget.targetId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ CdpTarget copy$default(CdpTarget cdpTarget, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cdpTarget.browserInstanceId;
            }
            if ((i & 2) != 0) {
                str2 = cdpTarget.targetId;
            }
            AnonymousClass003.A0u(str, str2);
            return new CdpTarget(str, str2);
        }

        public final String component1() {
            return this.browserInstanceId;
        }

        public final String component2() {
            return this.targetId;
        }

        public final String getBrowserInstanceId() {
            return this.browserInstanceId;
        }

        public final String getTargetId() {
            return this.targetId;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.targetId, AnonymousClass001.A0G(this.browserInstanceId));
        }

        public String toString() {
            return FGI.A0c("CdpTarget(browserInstanceId=", this.browserInstanceId, ", targetId=", this.targetId);
        }

        public CdpTarget(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.browserInstanceId = str;
            this.targetId = str2;
        }

        public final CdpTarget copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new CdpTarget(str, str2);
        }
    }

    public final class ChromeTab extends NativePageIdentity {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String browserInstanceId;
        public final int tabId;

        public ChromeTab(String str, int i) {
            C7384Etj.A0Y(str, 0);
            this.browserInstanceId = str;
            this.tabId = i;
        }

        /* renamed from: copy-Qn1smSk, reason: not valid java name */
        public final ChromeTab m3623copyQn1smSk(String str, int i) {
            C7384Etj.A0Y(str, 0);
            return new ChromeTab(str, i);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ChromeTab) {
                    ChromeTab chromeTab = (ChromeTab) obj;
                    if (!C7384Etj.areEqual(this.browserInstanceId, chromeTab.browserInstanceId) || this.tabId != chromeTab.tabId) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        /* renamed from: copy-Qn1smSk$default, reason: not valid java name */
        public static /* synthetic */ ChromeTab m3621copyQn1smSk$default(ChromeTab chromeTab, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = chromeTab.browserInstanceId;
            }
            if ((i2 & 2) != 0) {
                i = chromeTab.tabId;
            }
            C7384Etj.A0Y(str, 0);
            return new ChromeTab(str, i);
        }

        public final String component1() {
            return this.browserInstanceId;
        }

        /* renamed from: component2-pVg5ArA, reason: not valid java name */
        public final int m3622component2pVg5ArA() {
            return this.tabId;
        }

        public final String getBrowserInstanceId() {
            return this.browserInstanceId;
        }

        /* renamed from: getTabId-pVg5ArA, reason: not valid java name */
        public final int m3624getTabIdpVg5ArA() {
            return this.tabId;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.browserInstanceId) + this.tabId;
        }

        public String toString() {
            return FGI.A0c("ChromeTab(browserInstanceId=", this.browserInstanceId, ", tabId=", String.valueOf(BV4.A03(this.tabId)));
        }

        public /* synthetic */ ChromeTab(String str, int i, C06H c06h) {
            this(str, i);
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public NativePageIdentity() {
    }

    public /* synthetic */ NativePageIdentity(C06H c06h) {
    }
}
