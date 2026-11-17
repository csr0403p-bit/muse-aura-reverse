package com.facebook.traffic.knob;

import X.C60O;
import java.util.Set;

/* loaded from: classes5.dex */
public final class DebugStrOptions {
    public final Set<String> allowListByFieldId;

    public final class Builder {
        public Set<String> allowListByFieldId = C60O.A13();

        public DebugStrOptions build() {
            return new DebugStrOptions(this);
        }

        public Builder allowListByFieldId(Set<String> set) {
            this.allowListByFieldId = set;
            return this;
        }
    }

    public DebugStrOptions(Set set) {
        this.allowListByFieldId = set;
    }

    public Set<String> getAllowListByFieldId() {
        return this.allowListByFieldId;
    }

    public DebugStrOptions(Builder builder) {
        this.allowListByFieldId = builder.allowListByFieldId;
    }
}
