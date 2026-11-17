package com.facebook.aura.conversation.repo;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class StefiFeedbackResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean accepted;

    public final class Companion {
        public final C9hr<StefiFeedbackResponseJson> serializer() {
            return StefiFeedbackResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(StefiFeedbackResponseJson stefiFeedbackResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || stefiFeedbackResponseJson.accepted) {
            c9j5.AA7(c9iZ, 0, stefiFeedbackResponseJson.accepted);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StefiFeedbackResponseJson) && this.accepted == ((StefiFeedbackResponseJson) obj).accepted);
    }

    public static /* synthetic */ StefiFeedbackResponseJson copy$default(StefiFeedbackResponseJson stefiFeedbackResponseJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = stefiFeedbackResponseJson.accepted;
        }
        return new StefiFeedbackResponseJson(z);
    }

    public final boolean component1() {
        return this.accepted;
    }

    public final StefiFeedbackResponseJson copy(boolean z) {
        return new StefiFeedbackResponseJson(z);
    }

    public final boolean getAccepted() {
        return this.accepted;
    }

    public int hashCode() {
        return this.accepted ? 1231 : 1237;
    }

    public /* synthetic */ StefiFeedbackResponseJson(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.accepted = false;
        } else {
            this.accepted = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public StefiFeedbackResponseJson(boolean z) {
        this.accepted = z;
    }

    public /* synthetic */ StefiFeedbackResponseJson(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public StefiFeedbackResponseJson() {
        this(false);
    }
}
