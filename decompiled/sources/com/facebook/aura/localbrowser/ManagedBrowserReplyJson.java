package com.facebook.aura.localbrowser;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ManagedBrowserReplyJson {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String assistance;
    public final ManagedBrowserControlReceiptJson control;
    public final ManagedBrowserDocumentJson document;
    public final String effect;
    public final ManagedBrowserFenceJson fence;
    public final ManagedBrowserObservationJson observation;
    public final ManagedBrowserActionReceiptJson receipt;

    public final class Companion {
        public final C9hr<ManagedBrowserReplyJson> serializer() {
            return ManagedBrowserReplyJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ManagedBrowserReplyJson copy$default(ManagedBrowserReplyJson managedBrowserReplyJson, ManagedBrowserFenceJson managedBrowserFenceJson, String str, ManagedBrowserDocumentJson managedBrowserDocumentJson, ManagedBrowserControlReceiptJson managedBrowserControlReceiptJson, ManagedBrowserActionReceiptJson managedBrowserActionReceiptJson, ManagedBrowserObservationJson managedBrowserObservationJson, String str2, int i, Object obj) {
        ManagedBrowserFenceJson managedBrowserFenceJson2 = managedBrowserFenceJson;
        String str3 = str;
        ManagedBrowserDocumentJson managedBrowserDocumentJson2 = managedBrowserDocumentJson;
        ManagedBrowserControlReceiptJson managedBrowserControlReceiptJson2 = managedBrowserControlReceiptJson;
        ManagedBrowserActionReceiptJson managedBrowserActionReceiptJson2 = managedBrowserActionReceiptJson;
        ManagedBrowserObservationJson managedBrowserObservationJson2 = managedBrowserObservationJson;
        String str4 = str2;
        if ((i & 1) != 0) {
            managedBrowserFenceJson2 = managedBrowserReplyJson.fence;
        }
        if ((i & 2) != 0) {
            str3 = managedBrowserReplyJson.effect;
        }
        if ((i & 4) != 0) {
            managedBrowserDocumentJson2 = managedBrowserReplyJson.document;
        }
        if ((i & 8) != 0) {
            managedBrowserControlReceiptJson2 = managedBrowserReplyJson.control;
        }
        if ((i & 16) != 0) {
            managedBrowserActionReceiptJson2 = managedBrowserReplyJson.receipt;
        }
        if ((i & 32) != 0) {
            managedBrowserObservationJson2 = managedBrowserReplyJson.observation;
        }
        if ((i & 64) != 0) {
            str4 = managedBrowserReplyJson.assistance;
        }
        AnonymousClass003.A0u(managedBrowserFenceJson2, str3);
        return new ManagedBrowserReplyJson(managedBrowserFenceJson2, str3, managedBrowserDocumentJson2, managedBrowserControlReceiptJson2, managedBrowserActionReceiptJson2, managedBrowserObservationJson2, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ManagedBrowserReplyJson) {
                ManagedBrowserReplyJson managedBrowserReplyJson = (ManagedBrowserReplyJson) obj;
                if (!C7384Etj.areEqual(this.fence, managedBrowserReplyJson.fence) || !C7384Etj.areEqual(this.effect, managedBrowserReplyJson.effect) || !C7384Etj.areEqual(this.document, managedBrowserReplyJson.document) || !C7384Etj.areEqual(this.control, managedBrowserReplyJson.control) || !C7384Etj.areEqual(this.receipt, managedBrowserReplyJson.receipt) || !C7384Etj.areEqual(this.observation, managedBrowserReplyJson.observation) || !C7384Etj.areEqual(this.assistance, managedBrowserReplyJson.assistance)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(ManagedBrowserReplyJson managedBrowserReplyJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(managedBrowserReplyJson.fence, ManagedBrowserFenceJson$$serializer.INSTANCE, c9iZ, 0);
        c9j5.AAV(managedBrowserReplyJson.effect, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || managedBrowserReplyJson.document != null) {
            c9j5.AAP(managedBrowserReplyJson.document, ManagedBrowserDocumentJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || managedBrowserReplyJson.control != null) {
            c9j5.AAP(managedBrowserReplyJson.control, ManagedBrowserControlReceiptJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || managedBrowserReplyJson.receipt != null) {
            c9j5.AAP(managedBrowserReplyJson.receipt, ManagedBrowserActionReceiptJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || managedBrowserReplyJson.observation != null) {
            c9j5.AAP(managedBrowserReplyJson.observation, ManagedBrowserObservationJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || managedBrowserReplyJson.assistance != null) {
            c9j5.AAP(managedBrowserReplyJson.assistance, C07779iq.A01, c9iZ, 6);
        }
    }

    public final ManagedBrowserFenceJson component1() {
        return this.fence;
    }

    public final String component2() {
        return this.effect;
    }

    public final ManagedBrowserDocumentJson component3() {
        return this.document;
    }

    public final ManagedBrowserControlReceiptJson component4() {
        return this.control;
    }

    public final ManagedBrowserActionReceiptJson component5() {
        return this.receipt;
    }

    public final ManagedBrowserObservationJson component6() {
        return this.observation;
    }

    public final String component7() {
        return this.assistance;
    }

    public final String getAssistance() {
        return this.assistance;
    }

    public final ManagedBrowserControlReceiptJson getControl() {
        return this.control;
    }

    public final ManagedBrowserDocumentJson getDocument() {
        return this.document;
    }

    public final String getEffect() {
        return this.effect;
    }

    public final ManagedBrowserFenceJson getFence() {
        return this.fence;
    }

    public final ManagedBrowserObservationJson getObservation() {
        return this.observation;
    }

    public final ManagedBrowserActionReceiptJson getReceipt() {
        return this.receipt;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0I(this.effect, AnonymousClass005.A0E(this.fence)) + AnonymousClass006.A0D(this.document)) * 31) + AnonymousClass006.A0D(this.control)) * 31) + AnonymousClass006.A0D(this.receipt)) * 31) + AnonymousClass006.A0D(this.observation)) * 31) + AnonymousClass005.A0H(this.assistance);
    }

    public String toString() {
        ManagedBrowserFenceJson managedBrowserFenceJson = this.fence;
        String str = this.effect;
        ManagedBrowserDocumentJson managedBrowserDocumentJson = this.document;
        ManagedBrowserControlReceiptJson managedBrowserControlReceiptJson = this.control;
        ManagedBrowserActionReceiptJson managedBrowserActionReceiptJson = this.receipt;
        ManagedBrowserObservationJson managedBrowserObservationJson = this.observation;
        String str2 = this.assistance;
        StringBuilder sbA0f = C3cG.A0f(managedBrowserFenceJson, "ManagedBrowserReplyJson(fence=");
        sbA0f.append(", effect=");
        sbA0f.append(str);
        sbA0f.append(", document=");
        sbA0f.append(managedBrowserDocumentJson);
        sbA0f.append(", control=");
        sbA0f.append(managedBrowserControlReceiptJson);
        sbA0f.append(", receipt=");
        sbA0f.append(managedBrowserActionReceiptJson);
        sbA0f.append(", observation=");
        sbA0f.append(managedBrowserObservationJson);
        return C3cJ.A0N(", assistance=", str2, sbA0f);
    }

    public ManagedBrowserReplyJson(ManagedBrowserFenceJson managedBrowserFenceJson, String str, ManagedBrowserDocumentJson managedBrowserDocumentJson, ManagedBrowserControlReceiptJson managedBrowserControlReceiptJson, ManagedBrowserActionReceiptJson managedBrowserActionReceiptJson, ManagedBrowserObservationJson managedBrowserObservationJson, String str2) {
        AnonymousClass003.A0u(managedBrowserFenceJson, str);
        this.fence = managedBrowserFenceJson;
        this.effect = str;
        this.document = managedBrowserDocumentJson;
        this.control = managedBrowserControlReceiptJson;
        this.receipt = managedBrowserActionReceiptJson;
        this.observation = managedBrowserObservationJson;
        this.assistance = str2;
    }

    public final ManagedBrowserReplyJson copy(ManagedBrowserFenceJson managedBrowserFenceJson, String str, ManagedBrowserDocumentJson managedBrowserDocumentJson, ManagedBrowserControlReceiptJson managedBrowserControlReceiptJson, ManagedBrowserActionReceiptJson managedBrowserActionReceiptJson, ManagedBrowserObservationJson managedBrowserObservationJson, String str2) {
        AnonymousClass003.A0u(managedBrowserFenceJson, str);
        return new ManagedBrowserReplyJson(managedBrowserFenceJson, str, managedBrowserDocumentJson, managedBrowserControlReceiptJson, managedBrowserActionReceiptJson, managedBrowserObservationJson, str2);
    }

    public /* synthetic */ ManagedBrowserReplyJson(ManagedBrowserFenceJson managedBrowserFenceJson, String str, ManagedBrowserDocumentJson managedBrowserDocumentJson, ManagedBrowserControlReceiptJson managedBrowserControlReceiptJson, ManagedBrowserActionReceiptJson managedBrowserActionReceiptJson, ManagedBrowserObservationJson managedBrowserObservationJson, String str2, int i, C06H c06h) {
        this(managedBrowserFenceJson, str, (i & 4) != 0 ? null : managedBrowserDocumentJson, (i & 8) != 0 ? null : managedBrowserControlReceiptJson, (i & 16) != 0 ? null : managedBrowserActionReceiptJson, (i & 32) != 0 ? null : managedBrowserObservationJson, (i & 64) != 0 ? null : str2);
    }

    public /* synthetic */ ManagedBrowserReplyJson(int i, ManagedBrowserFenceJson managedBrowserFenceJson, String str, ManagedBrowserDocumentJson managedBrowserDocumentJson, ManagedBrowserControlReceiptJson managedBrowserControlReceiptJson, ManagedBrowserActionReceiptJson managedBrowserActionReceiptJson, ManagedBrowserObservationJson managedBrowserObservationJson, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ManagedBrowserReplyJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.fence = managedBrowserFenceJson;
        this.effect = str;
        if ((i & 4) == 0) {
            this.document = null;
        } else {
            this.document = managedBrowserDocumentJson;
        }
        if ((i & 8) == 0) {
            this.control = null;
        } else {
            this.control = managedBrowserControlReceiptJson;
        }
        if ((i & 16) == 0) {
            this.receipt = null;
        } else {
            this.receipt = managedBrowserActionReceiptJson;
        }
        if ((i & 32) == 0) {
            this.observation = null;
        } else {
            this.observation = managedBrowserObservationJson;
        }
        if ((i & 64) == 0) {
            this.assistance = null;
        } else {
            this.assistance = str2;
        }
    }
}
