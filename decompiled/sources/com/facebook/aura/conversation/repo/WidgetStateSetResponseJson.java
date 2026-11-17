package com.facebook.aura.conversation.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C60O;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.model.WidgetStateMutationResult;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class WidgetStateSetResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean applied;
    public final JsonElement state;

    public final class Companion {
        public final C9hr<WidgetStateSetResponseJson> serializer() {
            return WidgetStateSetResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public WidgetStateSetResponseJson(boolean z, JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 1);
        this.applied = z;
        this.state = jsonElement;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(WidgetStateSetResponseJson widgetStateSetResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || widgetStateSetResponseJson.applied) {
            c9j5.AA7(c9iZ, 0, widgetStateSetResponseJson.applied);
        }
        if (zAfR || !C7384Etj.areEqual(widgetStateSetResponseJson.state, C60O.A1G())) {
            c9j5.AAQ(widgetStateSetResponseJson.state, JsonElementSerializer.A00, c9iZ, 1);
        }
    }

    public final WidgetStateSetResponseJson copy(boolean z, JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 1);
        return new WidgetStateSetResponseJson(z, jsonElement);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WidgetStateSetResponseJson) {
                WidgetStateSetResponseJson widgetStateSetResponseJson = (WidgetStateSetResponseJson) obj;
                if (this.applied != widgetStateSetResponseJson.applied || !C7384Etj.areEqual(this.state, widgetStateSetResponseJson.state)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WidgetStateSetResponseJson copy$default(WidgetStateSetResponseJson widgetStateSetResponseJson, boolean z, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            z = widgetStateSetResponseJson.applied;
        }
        if ((i & 2) != 0) {
            jsonElement = widgetStateSetResponseJson.state;
        }
        C7384Etj.A0Y(jsonElement, 1);
        return new WidgetStateSetResponseJson(z, jsonElement);
    }

    public final boolean component1() {
        return this.applied;
    }

    public final JsonElement component2() {
        return this.state;
    }

    public final boolean getApplied() {
        return this.applied;
    }

    public final JsonElement getState() {
        return this.state;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.state, C0KA.A02(this.applied));
    }

    public final WidgetStateMutationResult toDomain() {
        return new WidgetStateMutationResult(this.applied, HatchWidgetPresentationKt.normalizeJSONState(this.state));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WidgetStateSetResponseJson(int i, boolean z, JsonElement jsonElement, C2hx c2hx) {
        this.applied = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.state = C60O.A1G();
        } else {
            this.state = jsonElement;
        }
    }

    public /* synthetic */ WidgetStateSetResponseJson(boolean z, JsonElement jsonElement, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? C60O.A1G() : jsonElement);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WidgetStateSetResponseJson() {
        this(false, (JsonElement) null, 3, (C06H) (0 == true ? 1 : 0));
    }
}
