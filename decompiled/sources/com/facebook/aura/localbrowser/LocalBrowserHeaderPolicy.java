package com.facebook.aura.localbrowser;

import X.AGH;
import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C9jH;
import com.facebook.aura.localbrowser.core.BrowserEngine;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public final class LocalBrowserHeaderPolicy {
    public static final int $stable = 8;
    public boolean closed;
    public final LinkedHashSet<BrowserEngine> engines;
    public byte[] installed;
    public final Object lock;
    public final Function0<Unit> onInconsistent;
    public final String runtimeId;

    public final void attach(BrowserEngine browserEngine) {
        C7384Etj.A0Y(browserEngine, 0);
        synchronized (this.lock) {
            checkOpen();
            browserEngine.enableHeaderPolicy(this.runtimeId);
            byte[] bArr = this.installed;
            if (bArr != null) {
                LocalBrowserBlockedPolicyKt.policyReceipt(browserEngine.setHeaderPolicy(bArr), this.runtimeId);
            }
            this.engines.add(browserEngine);
        }
    }

    public final void detach(BrowserEngine browserEngine) {
        C7384Etj.A0Y(browserEngine, 0);
        synchronized (this.lock) {
            this.engines.remove(browserEngine);
        }
    }

    public final JsonObject install(JsonObject jsonObject) throws LocalBrowserEndpointFailure {
        JsonObject jsonObjectPolicyReceipt;
        C7384Etj.A0Y(jsonObject, 0);
        synchronized (this.lock) {
            checkOpen();
            BrowserEngine browserEngine = (BrowserEngine) AbstractC0878AGe.A0C(this.engines);
            if (browserEngine == null) {
                C9jH c9jHA0E = AGH.A0E();
                throw new LocalBrowserEndpointFailure("header_policy_unavailable", false, null, null, c9jHA0E, c9jHA0E);
            }
            String string = jsonObject.toString();
            C7384Etj.A0Y(string, 0);
            byte[] bArrA1S = C3cG.A1S(string);
            jsonObjectPolicyReceipt = LocalBrowserBlockedPolicyKt.policyReceipt(browserEngine.setHeaderPolicy(bArrA1S), this.runtimeId);
            try {
                Iterator it = AbstractC0878AGe.A0Z(this.engines, 1).iterator();
                while (it.hasNext()) {
                    if (!LocalBrowserBlockedPolicyKt.policyReceipt(((BrowserEngine) it.next()).setHeaderPolicy(bArrA1S), this.runtimeId).equals(jsonObjectPolicyReceipt)) {
                        throw C3cG.A0Q("Check failed.");
                    }
                }
                this.installed = bArrA1S;
            } catch (Exception unused) {
                this.closed = true;
                this.onInconsistent.invoke();
                C9jH c9jHA0E2 = AGH.A0E();
                throw new LocalBrowserEndpointFailure("header_policy_unavailable", true, null, null, c9jHA0E2, c9jHA0E2);
            }
        }
        return jsonObjectPolicyReceipt;
    }

    private final void checkOpen() throws LocalBrowserEndpointFailure {
        if (this.closed) {
            throw C3cI.A0E("header_policy_unavailable");
        }
    }

    public final void close() {
        synchronized (this.lock) {
            this.closed = true;
            this.installed = null;
            this.engines.clear();
        }
    }

    public final JsonObject inventory() {
        byte[] bArrHeaderPolicyInventory;
        JsonObject jsonObjectPolicyReceipt;
        synchronized (this.lock) {
            checkOpen();
            BrowserEngine browserEngine = (BrowserEngine) AbstractC0878AGe.A0C(this.engines);
            if (browserEngine == null || (bArrHeaderPolicyInventory = browserEngine.headerPolicyInventory()) == null) {
                C9jH c9jHA0E = AGH.A0E();
                throw new LocalBrowserEndpointFailure("header_policy_unavailable", false, null, null, c9jHA0E, c9jHA0E);
            }
            jsonObjectPolicyReceipt = LocalBrowserBlockedPolicyKt.policyReceipt(bArrHeaderPolicyInventory, this.runtimeId);
        }
        return jsonObjectPolicyReceipt;
    }

    public LocalBrowserHeaderPolicy(String str, Function0<Unit> function0) {
        AnonymousClass003.A0u(str, function0);
        this.runtimeId = str;
        this.onInconsistent = function0;
        this.lock = C3cG.A0T();
        this.engines = C3cG.A0k();
    }
}
