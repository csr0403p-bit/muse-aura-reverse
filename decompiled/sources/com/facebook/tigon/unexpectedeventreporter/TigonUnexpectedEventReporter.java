package com.facebook.tigon.unexpectedeventreporter;

import X.AGH;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import X.ETi;
import X.InterfaceC3290C9q;
import java.util.Map;

/* loaded from: classes5.dex */
public final class TigonUnexpectedEventReporter {
    public static final TigonUnexpectedEventReporter INSTANCE = new TigonUnexpectedEventReporter();
    public static volatile InterfaceC3290C9q _reporter;

    public final class Builder {
        public final Map<String, String> annotations;
        public final String category;
        public final int markerId;
        public final InterfaceC3290C9q reporter;

        public Builder(int i, String str, InterfaceC3290C9q interfaceC3290C9q) {
            C7384Etj.A0Y(str, 1);
            this.markerId = i;
            this.category = str;
            this.reporter = interfaceC3290C9q;
            this.annotations = C3cG.A0j();
        }

        public final Map<String, String> getAnnotations() {
            return this.annotations;
        }

        public final String getCategory() {
            return this.category;
        }

        public final int getMarkerId() {
            return this.markerId;
        }

        public final InterfaceC3290C9q getReporter() {
            return this.reporter;
        }

        public final void report() {
            InterfaceC3290C9q interfaceC3290C9q = this.reporter;
            if (interfaceC3290C9q != null) {
                interfaceC3290C9q.report(this.markerId, this.category, AGH.A0A(this.annotations));
            }
        }

        public final void annotate(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.annotations.put(str, str2);
        }
    }

    public static final Builder getEventBuilder(int i, String str) {
        C7384Etj.A0Y(str, 1);
        return new Builder(i, str, _reporter);
    }

    public static final native void initializeNative();

    public final synchronized void initialize(InterfaceC3290C9q interfaceC3290C9q) {
        C7384Etj.A0Y(interfaceC3290C9q, 0);
        if (_reporter == null) {
            _reporter = interfaceC3290C9q;
        }
    }

    static {
        ETi.loadLibrary("tigon-ue-reporter");
        initializeNative();
    }
}
