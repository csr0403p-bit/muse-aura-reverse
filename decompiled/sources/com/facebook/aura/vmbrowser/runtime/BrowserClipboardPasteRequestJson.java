package com.facebook.aura.vmbrowser.runtime;

import X.AnonymousClass001;
import X.AnonymousClass005;
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
public final class BrowserClipboardPasteRequestJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String expected_takeover_id;
    public final String operation_id;
    public final String text;

    public final class Companion {
        public final C9hr<BrowserClipboardPasteRequestJson> serializer() {
            return BrowserClipboardPasteRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(BrowserClipboardPasteRequestJson browserClipboardPasteRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(browserClipboardPasteRequestJson.operation_id, c9iZ, 0);
        c9j5.AAV(browserClipboardPasteRequestJson.expected_takeover_id, c9iZ, 1);
        c9j5.AAV(browserClipboardPasteRequestJson.text, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserClipboardPasteRequestJson) {
                BrowserClipboardPasteRequestJson browserClipboardPasteRequestJson = (BrowserClipboardPasteRequestJson) obj;
                if (!C7384Etj.areEqual(this.operation_id, browserClipboardPasteRequestJson.operation_id) || !C7384Etj.areEqual(this.expected_takeover_id, browserClipboardPasteRequestJson.expected_takeover_id) || !C7384Etj.areEqual(this.text, browserClipboardPasteRequestJson.text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserClipboardPasteRequestJson copy$default(BrowserClipboardPasteRequestJson browserClipboardPasteRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserClipboardPasteRequestJson.operation_id;
        }
        if ((i & 2) != 0) {
            str2 = browserClipboardPasteRequestJson.expected_takeover_id;
        }
        if ((i & 4) != 0) {
            str3 = browserClipboardPasteRequestJson.text;
        }
        return browserClipboardPasteRequestJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.operation_id;
    }

    public final String component2() {
        return this.expected_takeover_id;
    }

    public final String component3() {
        return this.text;
    }

    public final String getExpected_takeover_id() {
        return this.expected_takeover_id;
    }

    public final String getOperation_id() {
        return this.operation_id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.text, AnonymousClass005.A0I(this.expected_takeover_id, AnonymousClass001.A0G(this.operation_id)));
    }

    public String toString() {
        return FGI.A0k("BrowserClipboardPasteRequestJson(operation_id=", this.operation_id, ", expected_takeover_id=", this.expected_takeover_id, ", text=", this.text, ")");
    }

    public BrowserClipboardPasteRequestJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.operation_id = str;
        this.expected_takeover_id = str2;
        this.text = str3;
    }

    public final BrowserClipboardPasteRequestJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new BrowserClipboardPasteRequestJson(str, str2, str3);
    }

    public /* synthetic */ BrowserClipboardPasteRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(BrowserClipboardPasteRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.operation_id = str;
        this.expected_takeover_id = str2;
        this.text = str3;
    }
}
