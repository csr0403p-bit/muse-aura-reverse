package com.facebook.traffic.knob;

import X.C60O;
import java.util.Set;

/* loaded from: classes5.dex */
public final class HttpHeaderOptions {
    public final Set<String> allowListByFieldId;
    public final boolean includeAlternateEstimators;
    public final String prependStr;

    public final class Builder {
        public Set<String> allowListByFieldId = C60O.A13();
        public boolean includeAlternateEstimators = false;
        public String prependStr = "";

        public HttpHeaderOptions build() {
            return new HttpHeaderOptions(this);
        }

        public Builder allowListByFieldId(Set<String> set) {
            this.allowListByFieldId = set;
            return this;
        }

        public Builder includeAlternateEstimators(boolean z) {
            this.includeAlternateEstimators = z;
            return this;
        }

        public Builder prependStr(String str) {
            this.prependStr = str;
            return this;
        }
    }

    public HttpHeaderOptions(Set set) {
        this.allowListByFieldId = set;
        this.includeAlternateEstimators = false;
        this.prependStr = "x-fb-abr-";
    }

    public Set<String> getAllowListByFieldId() {
        return this.allowListByFieldId;
    }

    public String getPrependStr() {
        return this.prependStr;
    }

    public boolean includeAlternateEstimators() {
        return this.includeAlternateEstimators;
    }

    public HttpHeaderOptions(Builder builder) {
        this.allowListByFieldId = builder.allowListByFieldId;
        this.includeAlternateEstimators = builder.includeAlternateEstimators;
        this.prependStr = builder.prependStr;
    }
}
