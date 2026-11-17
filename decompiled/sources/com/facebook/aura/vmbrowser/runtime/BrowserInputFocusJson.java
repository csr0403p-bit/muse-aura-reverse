package com.facebook.aura.vmbrowser.runtime;

import X.AnonymousClass001;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import X.FGI;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class BrowserInputFocusJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean focused;
    public final String takeover_id;

    public final class Companion {
        public final C9hr<BrowserInputFocusJson> serializer() {
            return BrowserInputFocusJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public BrowserInputFocusJson(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.takeover_id = str;
        this.focused = z;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(BrowserInputFocusJson browserInputFocusJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(browserInputFocusJson.takeover_id, c9iZ, 0);
        c9j5.AA7(c9iZ, 1, browserInputFocusJson.focused);
    }

    public final BrowserInputFocusJson copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new BrowserInputFocusJson(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserInputFocusJson) {
                BrowserInputFocusJson browserInputFocusJson = (BrowserInputFocusJson) obj;
                if (!C7384Etj.areEqual(this.takeover_id, browserInputFocusJson.takeover_id) || this.focused != browserInputFocusJson.focused) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserInputFocusJson copy$default(BrowserInputFocusJson browserInputFocusJson, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserInputFocusJson.takeover_id;
        }
        if ((i & 2) != 0) {
            z = browserInputFocusJson.focused;
        }
        C7384Etj.A0Y(str, 0);
        return new BrowserInputFocusJson(str, z);
    }

    public final String component1() {
        return this.takeover_id;
    }

    public final boolean component2() {
        return this.focused;
    }

    public final boolean getFocused() {
        return this.focused;
    }

    public final String getTakeover_id() {
        return this.takeover_id;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.takeover_id), this.focused);
    }

    public String toString() {
        return FGI.A0n("BrowserInputFocusJson(takeover_id=", this.takeover_id, ", focused=", ")", this.focused);
    }

    public /* synthetic */ BrowserInputFocusJson(int i, String str, boolean z, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(BrowserInputFocusJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.takeover_id = str;
        this.focused = z;
    }
}
