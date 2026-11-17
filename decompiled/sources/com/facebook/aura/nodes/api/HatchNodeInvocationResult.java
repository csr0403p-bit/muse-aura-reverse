package com.facebook.aura.nodes.api;

import X.AnonymousClass003;
import X.C7384Etj;
import X.HtJ;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public interface HatchNodeInvocationResult {

    public abstract class Deferred implements AutoCloseable, HatchNodeInvocationResult {
        public abstract Object encode(HtJ<? super JsonObject> htJ);
    }

    public final class Failure implements HatchNodeInvocationResult {
        public final String code;
        public final String message;

        public final String getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public Failure(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.code = str;
            this.message = str2;
        }
    }

    public final class Success implements HatchNodeInvocationResult {
        public final JsonObject payload;

        public Success(JsonObject jsonObject) {
            C7384Etj.A0Y(jsonObject, 0);
            this.payload = jsonObject;
        }

        public final JsonObject getPayload() {
            return this.payload;
        }
    }
}
