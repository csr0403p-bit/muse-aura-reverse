package com.facebook.aura.localbrowser;

import X.AbstractC7606F5t;
import X.AnonymousClass005;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C8j5;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes4.dex */
public final class ManagedBrowserObservationJson {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final boolean checkout_signal;
    public final ManagedBrowserDocumentJson document;
    public final boolean frame_coverage_complete;
    public final String readiness;
    public final boolean sensitive_output_suppressed;
    public final boolean shadow_coverage_complete;
    public final JsonElement snapshot;
    public final String title;
    public final String url;
    public final ManagedBrowserViewportJson viewport;

    public final class Companion {
        public final C9hr<ManagedBrowserObservationJson> serializer() {
            return ManagedBrowserObservationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ManagedBrowserObservationJson) {
                ManagedBrowserObservationJson managedBrowserObservationJson = (ManagedBrowserObservationJson) obj;
                if (!C7384Etj.areEqual(this.document, managedBrowserObservationJson.document) || !C7384Etj.areEqual(this.url, managedBrowserObservationJson.url) || !C7384Etj.areEqual(this.title, managedBrowserObservationJson.title) || !C7384Etj.areEqual(this.viewport, managedBrowserObservationJson.viewport) || !C7384Etj.areEqual(this.readiness, managedBrowserObservationJson.readiness) || !C7384Etj.areEqual(this.snapshot, managedBrowserObservationJson.snapshot) || this.frame_coverage_complete != managedBrowserObservationJson.frame_coverage_complete || this.shadow_coverage_complete != managedBrowserObservationJson.shadow_coverage_complete || this.checkout_signal != managedBrowserObservationJson.checkout_signal || this.sensitive_output_suppressed != managedBrowserObservationJson.sensitive_output_suppressed) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ManagedBrowserObservationJson(int i, ManagedBrowserDocumentJson managedBrowserDocumentJson, String str, String str2, ManagedBrowserViewportJson managedBrowserViewportJson, String str3, JsonElement jsonElement, boolean z, boolean z2, boolean z3, boolean z4, C2hx c2hx) {
        if (1023 != (i & 1023)) {
            C9iI.A00(ManagedBrowserObservationJson$$serializer.descriptor, i, 1023);
            throw F60.createAndThrow();
        }
        this.document = managedBrowserDocumentJson;
        this.url = str;
        this.title = str2;
        this.viewport = managedBrowserViewportJson;
        this.readiness = str3;
        this.snapshot = jsonElement;
        this.frame_coverage_complete = z;
        this.shadow_coverage_complete = z2;
        this.checkout_signal = z3;
        this.sensitive_output_suppressed = z4;
    }

    public static /* synthetic */ ManagedBrowserObservationJson copy$default(ManagedBrowserObservationJson managedBrowserObservationJson, ManagedBrowserDocumentJson managedBrowserDocumentJson, String str, String str2, ManagedBrowserViewportJson managedBrowserViewportJson, String str3, JsonElement jsonElement, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            managedBrowserDocumentJson = managedBrowserObservationJson.document;
        }
        if ((i & 2) != 0) {
            str = managedBrowserObservationJson.url;
        }
        if ((i & 4) != 0) {
            str2 = managedBrowserObservationJson.title;
        }
        if ((i & 8) != 0) {
            managedBrowserViewportJson = managedBrowserObservationJson.viewport;
        }
        if ((i & 16) != 0) {
            str3 = managedBrowserObservationJson.readiness;
        }
        if ((i & 32) != 0) {
            jsonElement = managedBrowserObservationJson.snapshot;
        }
        if ((i & 64) != 0) {
            z = managedBrowserObservationJson.frame_coverage_complete;
        }
        if ((i & 128) != 0) {
            z2 = managedBrowserObservationJson.shadow_coverage_complete;
        }
        if ((i & 256) != 0) {
            z3 = managedBrowserObservationJson.checkout_signal;
        }
        if ((i & 512) != 0) {
            z4 = managedBrowserObservationJson.sensitive_output_suppressed;
        }
        return managedBrowserObservationJson.copy(managedBrowserDocumentJson, str, str2, managedBrowserViewportJson, str3, jsonElement, z, z2, z3, z4);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(ManagedBrowserObservationJson managedBrowserObservationJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(managedBrowserObservationJson.document, ManagedBrowserDocumentJson$$serializer.INSTANCE, c9iZ, 0);
        c9j5.AAV(managedBrowserObservationJson.url, c9iZ, 1);
        c9j5.AAV(managedBrowserObservationJson.title, c9iZ, 2);
        c9j5.AAQ(managedBrowserObservationJson.viewport, ManagedBrowserViewportJson$$serializer.INSTANCE, c9iZ, 3);
        c9j5.AAV(managedBrowserObservationJson.readiness, c9iZ, 4);
        c9j5.AAQ(managedBrowserObservationJson.snapshot, JsonElementSerializer.A00, c9iZ, 5);
        c9j5.AA7(c9iZ, 6, managedBrowserObservationJson.frame_coverage_complete);
        c9j5.AA7(c9iZ, 7, managedBrowserObservationJson.shadow_coverage_complete);
        c9j5.AA7(c9iZ, 8, managedBrowserObservationJson.checkout_signal);
        c9j5.AA7(c9iZ, 9, managedBrowserObservationJson.sensitive_output_suppressed);
    }

    public final ManagedBrowserDocumentJson component1() {
        return this.document;
    }

    public final boolean component10() {
        return this.sensitive_output_suppressed;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.title;
    }

    public final ManagedBrowserViewportJson component4() {
        return this.viewport;
    }

    public final String component5() {
        return this.readiness;
    }

    public final JsonElement component6() {
        return this.snapshot;
    }

    public final boolean component7() {
        return this.frame_coverage_complete;
    }

    public final boolean component8() {
        return this.shadow_coverage_complete;
    }

    public final boolean component9() {
        return this.checkout_signal;
    }

    public final boolean getCheckout_signal() {
        return this.checkout_signal;
    }

    public final ManagedBrowserDocumentJson getDocument() {
        return this.document;
    }

    public final boolean getFrame_coverage_complete() {
        return this.frame_coverage_complete;
    }

    public final String getReadiness() {
        return this.readiness;
    }

    public final boolean getSensitive_output_suppressed() {
        return this.sensitive_output_suppressed;
    }

    public final boolean getShadow_coverage_complete() {
        return this.shadow_coverage_complete;
    }

    public final JsonElement getSnapshot() {
        return this.snapshot;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final ManagedBrowserViewportJson getViewport() {
        return this.viewport;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.snapshot, AnonymousClass005.A0I(this.readiness, AnonymousClass005.A0F(this.viewport, AnonymousClass005.A0I(this.title, AnonymousClass005.A0I(this.url, AnonymousClass005.A0E(this.document)))))), this.frame_coverage_complete), this.shadow_coverage_complete), this.checkout_signal), this.sensitive_output_suppressed);
    }

    public String toString() {
        ManagedBrowserDocumentJson managedBrowserDocumentJson = this.document;
        String str = this.url;
        String str2 = this.title;
        ManagedBrowserViewportJson managedBrowserViewportJson = this.viewport;
        String str3 = this.readiness;
        JsonElement jsonElement = this.snapshot;
        boolean z = this.frame_coverage_complete;
        boolean z2 = this.shadow_coverage_complete;
        boolean z3 = this.checkout_signal;
        boolean z4 = this.sensitive_output_suppressed;
        StringBuilder sbA0f = C3cG.A0f(managedBrowserDocumentJson, "ManagedBrowserObservationJson(document=");
        sbA0f.append(", url=");
        sbA0f.append(str);
        sbA0f.append(", title=");
        sbA0f.append(str2);
        sbA0f.append(", viewport=");
        sbA0f.append(managedBrowserViewportJson);
        sbA0f.append(", readiness=");
        sbA0f.append(str3);
        sbA0f.append(AbstractC7606F5t.A00(8));
        sbA0f.append(jsonElement);
        sbA0f.append(", frame_coverage_complete=");
        sbA0f.append(z);
        sbA0f.append(", shadow_coverage_complete=");
        sbA0f.append(z2);
        sbA0f.append(", checkout_signal=");
        sbA0f.append(z3);
        return C8j5.A0W(", sensitive_output_suppressed=", sbA0f, z4);
    }

    public final ManagedBrowserObservationJson copy(ManagedBrowserDocumentJson managedBrowserDocumentJson, String str, String str2, ManagedBrowserViewportJson managedBrowserViewportJson, String str3, JsonElement jsonElement, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass005.A17(managedBrowserDocumentJson, str, str2, managedBrowserViewportJson, str3);
        C7384Etj.A0Y(jsonElement, 5);
        return new ManagedBrowserObservationJson(managedBrowserDocumentJson, str, str2, managedBrowserViewportJson, str3, jsonElement, z, z2, z3, z4);
    }

    public ManagedBrowserObservationJson(ManagedBrowserDocumentJson managedBrowserDocumentJson, String str, String str2, ManagedBrowserViewportJson managedBrowserViewportJson, String str3, JsonElement jsonElement, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass005.A17(managedBrowserDocumentJson, str, str2, managedBrowserViewportJson, str3);
        C7384Etj.A0Y(jsonElement, 5);
        this.document = managedBrowserDocumentJson;
        this.url = str;
        this.title = str2;
        this.viewport = managedBrowserViewportJson;
        this.readiness = str3;
        this.snapshot = jsonElement;
        this.frame_coverage_complete = z;
        this.shadow_coverage_complete = z2;
        this.checkout_signal = z3;
        this.sensitive_output_suppressed = z4;
    }
}
