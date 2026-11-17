package com.facebook.aura.vmbrowser.runtime;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
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
public final class BrowserClipboardCopyReceiptJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String operation_id;
    public final String outcome;
    public final String reason;
    public final String text;

    public final class Companion {
        public final C9hr<BrowserClipboardCopyReceiptJson> serializer() {
            return BrowserClipboardCopyReceiptJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(BrowserClipboardCopyReceiptJson browserClipboardCopyReceiptJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(browserClipboardCopyReceiptJson.operation_id, c9iZ, 0);
        c9j5.AAV(browserClipboardCopyReceiptJson.outcome, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || browserClipboardCopyReceiptJson.text != null) {
            c9j5.AAP(browserClipboardCopyReceiptJson.text, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || browserClipboardCopyReceiptJson.reason != null) {
            c9j5.AAP(browserClipboardCopyReceiptJson.reason, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserClipboardCopyReceiptJson) {
                BrowserClipboardCopyReceiptJson browserClipboardCopyReceiptJson = (BrowserClipboardCopyReceiptJson) obj;
                if (!C7384Etj.areEqual(this.operation_id, browserClipboardCopyReceiptJson.operation_id) || !C7384Etj.areEqual(this.outcome, browserClipboardCopyReceiptJson.outcome) || !C7384Etj.areEqual(this.text, browserClipboardCopyReceiptJson.text) || !C7384Etj.areEqual(this.reason, browserClipboardCopyReceiptJson.reason)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserClipboardCopyReceiptJson copy$default(BrowserClipboardCopyReceiptJson browserClipboardCopyReceiptJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserClipboardCopyReceiptJson.operation_id;
        }
        if ((i & 2) != 0) {
            str2 = browserClipboardCopyReceiptJson.outcome;
        }
        if ((i & 4) != 0) {
            str3 = browserClipboardCopyReceiptJson.text;
        }
        if ((i & 8) != 0) {
            str4 = browserClipboardCopyReceiptJson.reason;
        }
        AnonymousClass003.A0u(str, str2);
        return new BrowserClipboardCopyReceiptJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.operation_id;
    }

    public final String component2() {
        return this.outcome;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.reason;
    }

    public final String getOperation_id() {
        return this.operation_id;
    }

    public final String getOutcome() {
        return this.outcome;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.outcome, AnonymousClass001.A0G(this.operation_id)) + AnonymousClass006.A0G(this.text)) * 31) + AnonymousClass005.A0H(this.reason);
    }

    public String toString() {
        return FGI.A0m("BrowserClipboardCopyReceiptJson(operation_id=", this.operation_id, ", outcome=", this.outcome, ", text=", this.text, ", reason=", this.reason, ")");
    }

    public BrowserClipboardCopyReceiptJson(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        this.operation_id = str;
        this.outcome = str2;
        this.text = str3;
        this.reason = str4;
    }

    public final BrowserClipboardCopyReceiptJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        return new BrowserClipboardCopyReceiptJson(str, str2, str3, str4);
    }

    public /* synthetic */ BrowserClipboardCopyReceiptJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(BrowserClipboardCopyReceiptJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.operation_id = str;
        this.outcome = str2;
        if ((i & 4) == 0) {
            this.text = null;
        } else {
            this.text = str3;
        }
        if ((i & 8) == 0) {
            this.reason = null;
        } else {
            this.reason = str4;
        }
    }

    public /* synthetic */ BrowserClipboardCopyReceiptJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
