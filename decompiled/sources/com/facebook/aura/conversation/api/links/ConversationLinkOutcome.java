package com.facebook.aura.conversation.api.links;

import X.AnonymousClass006;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlRoute;

/* loaded from: classes3.dex */
public interface ConversationLinkOutcome {

    public final class Failed implements ConversationLinkOutcome {
        public final HatchHtmlErrorCode code;
        public final String detail;

        public Failed(HatchHtmlErrorCode hatchHtmlErrorCode, String str) {
            C7384Etj.A0Y(hatchHtmlErrorCode, 0);
            this.code = hatchHtmlErrorCode;
            this.detail = str;
        }

        public final HatchHtmlErrorCode getCode() {
            return this.code;
        }

        public final String getDetail() {
            return this.detail;
        }

        public /* synthetic */ Failed(HatchHtmlErrorCode hatchHtmlErrorCode, String str, int i, C06H c06h) {
            this(hatchHtmlErrorCode, AnonymousClass006.A0s(i, str));
        }
    }

    public final class NotHandled implements ConversationLinkOutcome {
        public static final NotHandled INSTANCE = new NotHandled();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotHandled);
        }

        public String toString() {
            return "NotHandled";
        }

        public int hashCode() {
            return 1176361574;
        }
    }

    public final class Routed implements ConversationLinkOutcome {
        public final HatchHtmlRoute route;

        public Routed(HatchHtmlRoute hatchHtmlRoute) {
            C7384Etj.A0Y(hatchHtmlRoute, 0);
            this.route = hatchHtmlRoute;
        }

        public final HatchHtmlRoute getRoute() {
            return this.route;
        }
    }
}
