package com.facebook.aura.network.api;

import X.C7384Etj;
import X.FGI;
import android.net.Uri;

/* loaded from: classes.dex */
public interface StefiMusePath extends StefiPath {

    /* loaded from: classes3.dex */
    public interface Extension extends StefiMusePath {
    }

    public final class ResolvePromptId implements StefiMusePath {
        public final String promptId;

        public ResolvePromptId(String str) {
            C7384Etj.A0Y(str, 0);
            this.promptId = str;
        }

        public final ResolvePromptId copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ResolvePromptId(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ResolvePromptId) && C7384Etj.areEqual(this.promptId, ((ResolvePromptId) obj).promptId));
        }

        public static /* synthetic */ ResolvePromptId copy$default(ResolvePromptId resolvePromptId, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resolvePromptId.promptId;
            }
            C7384Etj.A0Y(str, 0);
            return new ResolvePromptId(str);
        }

        public final String component1() {
            return this.promptId;
        }

        public final String getPromptId() {
            return this.promptId;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return FGI.A0M("/muse/prompts/", Uri.encode(this.promptId));
        }

        public int hashCode() {
            return this.promptId.hashCode();
        }

        public String toString() {
            return FGI.A0U("ResolvePromptId(promptId=", this.promptId, ")");
        }
    }
}
