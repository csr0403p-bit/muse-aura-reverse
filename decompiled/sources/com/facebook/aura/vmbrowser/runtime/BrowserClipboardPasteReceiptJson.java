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
public final class BrowserClipboardPasteReceiptJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String operation_id;
    public final String outcome;

    public final class Companion {
        public final C9hr<BrowserClipboardPasteReceiptJson> serializer() {
            return BrowserClipboardPasteReceiptJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(BrowserClipboardPasteReceiptJson browserClipboardPasteReceiptJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(browserClipboardPasteReceiptJson.operation_id, c9iZ, 0);
        c9j5.AAV(browserClipboardPasteReceiptJson.outcome, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserClipboardPasteReceiptJson) {
                BrowserClipboardPasteReceiptJson browserClipboardPasteReceiptJson = (BrowserClipboardPasteReceiptJson) obj;
                if (!C7384Etj.areEqual(this.operation_id, browserClipboardPasteReceiptJson.operation_id) || !C7384Etj.areEqual(this.outcome, browserClipboardPasteReceiptJson.outcome)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserClipboardPasteReceiptJson copy$default(BrowserClipboardPasteReceiptJson browserClipboardPasteReceiptJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserClipboardPasteReceiptJson.operation_id;
        }
        if ((i & 2) != 0) {
            str2 = browserClipboardPasteReceiptJson.outcome;
        }
        AnonymousClass003.A0u(str, str2);
        return new BrowserClipboardPasteReceiptJson(str, str2);
    }

    public final String component1() {
        return this.operation_id;
    }

    public final String component2() {
        return this.outcome;
    }

    public final String getOperation_id() {
        return this.operation_id;
    }

    public final String getOutcome() {
        return this.outcome;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.outcome, AnonymousClass001.A0G(this.operation_id));
    }

    public String toString() {
        return FGI.A0h("BrowserClipboardPasteReceiptJson(operation_id=", this.operation_id, ", outcome=", this.outcome, ")");
    }

    public BrowserClipboardPasteReceiptJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.operation_id = str;
        this.outcome = str2;
    }

    public final BrowserClipboardPasteReceiptJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new BrowserClipboardPasteReceiptJson(str, str2);
    }

    public /* synthetic */ BrowserClipboardPasteReceiptJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(BrowserClipboardPasteReceiptJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.operation_id = str;
        this.outcome = str2;
    }
}
