package com.facebook.aura.settings;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class TrainingObjectionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String status;

    public final class Companion {
        public final C9hr<TrainingObjectionJson> serializer() {
            return TrainingObjectionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(TrainingObjectionJson trainingObjectionJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || trainingObjectionJson.status != null) {
            c9j5.AAP(trainingObjectionJson.status, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TrainingObjectionJson) && C7384Etj.areEqual(this.status, ((TrainingObjectionJson) obj).status));
    }

    public static /* synthetic */ TrainingObjectionJson copy$default(TrainingObjectionJson trainingObjectionJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trainingObjectionJson.status;
        }
        return new TrainingObjectionJson(str);
    }

    public final String component1() {
        return this.status;
    }

    public final TrainingObjectionJson copy(String str) {
        return new TrainingObjectionJson(str);
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.status);
    }

    public /* synthetic */ TrainingObjectionJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public String toString() {
        return super.toString();
    }

    public TrainingObjectionJson(String str) {
        this.status = str;
    }

    public /* synthetic */ TrainingObjectionJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.status = null;
        } else {
            this.status = str;
        }
    }

    public TrainingObjectionJson() {
        this(null);
    }
}
