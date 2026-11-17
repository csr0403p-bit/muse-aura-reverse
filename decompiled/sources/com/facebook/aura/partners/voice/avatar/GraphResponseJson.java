package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class GraphResponseJson<T> extends C06G {
    public static final C9iZ $cachedDescriptor;
    public static final Companion Companion = new Companion();
    public final T data;
    public final JsonElement errors;

    static {
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.partners.voice.avatar.GraphResponseJson", null, 2);
        c9iKA1C.A08("data", true);
        c9iKA1C.A08("errors", true);
        $cachedDescriptor = c9iKA1C;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(GraphResponseJson graphResponseJson, C9j5 c9j5, C9iZ c9iZ, C9hr c9hr) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || graphResponseJson.data != null) {
            c9j5.AAP(graphResponseJson.data, c9hr, c9iZ, 0);
        }
        if (zAfR || graphResponseJson.errors != null) {
            c9j5.AAP(graphResponseJson.errors, JsonElementSerializer.A00, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraphResponseJson) {
                GraphResponseJson graphResponseJson = (GraphResponseJson) obj;
                if (!C7384Etj.areEqual(this.data, graphResponseJson.data) || !C7384Etj.areEqual(this.errors, graphResponseJson.errors)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GraphResponseJson copy$default(GraphResponseJson graphResponseJson, Object obj, JsonElement jsonElement, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = graphResponseJson.data;
        }
        if ((i & 2) != 0) {
            jsonElement = graphResponseJson.errors;
        }
        return new GraphResponseJson(obj, jsonElement);
    }

    public final T component1() {
        return this.data;
    }

    public final JsonElement component2() {
        return this.errors;
    }

    public final GraphResponseJson<T> copy(T t, JsonElement jsonElement) {
        return new GraphResponseJson<>(t, jsonElement);
    }

    public final T getData() {
        return this.data;
    }

    public final JsonElement getErrors() {
        return this.errors;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.data) * 31) + C3cH.A02(this.errors);
    }

    public final class Companion {
        public final <T> C9hr<GraphResponseJson<T>> serializer(C9hr<T> c9hr) {
            C7384Etj.A0Y(c9hr, 0);
            return new GraphResponseJson$$serializer(c9hr);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public GraphResponseJson(T t, JsonElement jsonElement) {
        this.data = t;
        this.errors = jsonElement;
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ GraphResponseJson(int i, Object obj, JsonElement jsonElement, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.data = null;
        } else {
            this.data = obj;
        }
        if ((i & 2) == 0) {
            this.errors = null;
        } else {
            this.errors = jsonElement;
        }
    }

    public /* synthetic */ GraphResponseJson(Object obj, JsonElement jsonElement, int i, C06H c06h) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : jsonElement);
    }

    public GraphResponseJson() {
        this(null, null);
    }
}
