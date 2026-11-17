package com.facebook.aura.vmbrowser.runtime;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06H;
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
public final class BrowserClipboardCopyRequestJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String expected_takeover_id;
    public final String operation_id;

    public final class Companion {
        public final C9hr<BrowserClipboardCopyRequestJson> serializer() {
            return BrowserClipboardCopyRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(BrowserClipboardCopyRequestJson browserClipboardCopyRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(browserClipboardCopyRequestJson.operation_id, c9iZ, 0);
        c9j5.AAV(browserClipboardCopyRequestJson.expected_takeover_id, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserClipboardCopyRequestJson) {
                BrowserClipboardCopyRequestJson browserClipboardCopyRequestJson = (BrowserClipboardCopyRequestJson) obj;
                if (!C7384Etj.areEqual(this.operation_id, browserClipboardCopyRequestJson.operation_id) || !C7384Etj.areEqual(this.expected_takeover_id, browserClipboardCopyRequestJson.expected_takeover_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserClipboardCopyRequestJson copy$default(BrowserClipboardCopyRequestJson browserClipboardCopyRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserClipboardCopyRequestJson.operation_id;
        }
        if ((i & 2) != 0) {
            str2 = browserClipboardCopyRequestJson.expected_takeover_id;
        }
        AnonymousClass003.A0u(str, str2);
        return new BrowserClipboardCopyRequestJson(str, str2);
    }

    public final String component1() {
        return this.operation_id;
    }

    public final String component2() {
        return this.expected_takeover_id;
    }

    public final String getExpected_takeover_id() {
        return this.expected_takeover_id;
    }

    public final String getOperation_id() {
        return this.operation_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.expected_takeover_id, AnonymousClass001.A0G(this.operation_id));
    }

    public String toString() {
        return FGI.A0h("BrowserClipboardCopyRequestJson(operation_id=", this.operation_id, ", expected_takeover_id=", this.expected_takeover_id, ")");
    }

    public BrowserClipboardCopyRequestJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.operation_id = str;
        this.expected_takeover_id = str2;
    }

    public final BrowserClipboardCopyRequestJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new BrowserClipboardCopyRequestJson(str, str2);
    }

    public /* synthetic */ BrowserClipboardCopyRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(BrowserClipboardCopyRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.operation_id = str;
        this.expected_takeover_id = str2;
    }
}
