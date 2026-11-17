package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C10571Hud;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.C9sU;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.maps.model.HatchMapScene$$serializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* loaded from: classes3.dex */
public final class LocalMapWidgetDataSerializer implements C9hr<LocalMapWidgetData> {
    public static final int $stable = 0;
    public static final LocalMapWidgetDataSerializer INSTANCE = new LocalMapWidgetDataSerializer();
    public static final C9iZ descriptor = LocalMapWidgetDataSerializer$Surrogate$$serializer.descriptor;

    @Serializable
    public final class Surrogate extends C06G {
        public static final Companion Companion = new Companion();
        public final String html;
        public final String path;
        public final JsonElement scene;

        public final class Companion {
            public final C9hr<Surrogate> serializer() {
                return LocalMapWidgetDataSerializer$Surrogate$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public Surrogate(String str, String str2, JsonElement jsonElement) {
            C7384Etj.A0Y(str, 0);
            this.html = str;
            this.path = str2;
            this.scene = jsonElement;
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(Surrogate surrogate, C9j5 c9j5, C9iZ c9iZ) {
            boolean zAfR = c9j5.AfR();
            if (zAfR || !C3cH.A1Q(surrogate.html)) {
                c9j5.AAV(surrogate.html, c9iZ, 0);
            }
            if (zAfR || surrogate.path != null) {
                c9j5.AAP(surrogate.path, C07779iq.A01, c9iZ, 1);
            }
            if (zAfR || surrogate.scene != null) {
                c9j5.AAP(surrogate.scene, JsonElementSerializer.A00, c9iZ, 2);
            }
        }

        public final Surrogate copy(String str, String str2, JsonElement jsonElement) {
            C7384Etj.A0Y(str, 0);
            return new Surrogate(str, str2, jsonElement);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Surrogate) {
                    Surrogate surrogate = (Surrogate) obj;
                    if (!C7384Etj.areEqual(this.html, surrogate.html) || !C7384Etj.areEqual(this.path, surrogate.path) || !C7384Etj.areEqual(this.scene, surrogate.scene)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, JsonElement jsonElement, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.html;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.path;
            }
            if ((i & 4) != 0) {
                jsonElement = surrogate.scene;
            }
            return surrogate.copy(str, str2, jsonElement);
        }

        public final String component1() {
            return this.html;
        }

        public final String component2() {
            return this.path;
        }

        public final JsonElement component3() {
            return this.scene;
        }

        public final String getHtml() {
            return this.html;
        }

        public final String getPath() {
            return this.path;
        }

        public final JsonElement getScene() {
            return this.scene;
        }

        public int hashCode() {
            return ((AnonymousClass001.A0G(this.html) + AnonymousClass006.A0G(this.path)) * 31) + C3cH.A02(this.scene);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, JsonElement jsonElement, C2hx c2hx) {
            this.html = C3cG.A0Z(i, str);
            if ((i & 2) == 0) {
                this.path = null;
            } else {
                this.path = str2;
            }
            if ((i & 4) == 0) {
                this.scene = null;
            } else {
                this.scene = jsonElement;
            }
        }

        public /* synthetic */ Surrogate(String str, String str2, JsonElement jsonElement, int i, C06H c06h) {
            this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : jsonElement);
        }

        public Surrogate() {
            this("", null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Hud] */
    @Override // X.C9jG
    public LocalMapWidgetData deserialize(InterfaceC07829iw interfaceC07829iw) {
        HatchMapScene hatchMapSceneA0s;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        Surrogate surrogate = (Surrogate) interfaceC07829iw.A8b(LocalMapWidgetDataSerializer$Surrogate$$serializer.INSTANCE);
        String str = surrogate.html;
        String str2 = surrogate.path;
        JsonElement jsonElement = surrogate.scene;
        if (jsonElement != null) {
            try {
                C9sU c9sU = HatchJsonKt.HatchJson;
                int i = HatchMapScene.$stable;
                hatchMapSceneA0s = (HatchMapScene) c9sU.A01(HatchMapScene$$serializer.INSTANCE, jsonElement);
            } catch (Throwable th) {
                hatchMapSceneA0s = C3cG.A0s(th);
            }
            hatchMapScene = hatchMapSceneA0s instanceof C10571Hud ? null : hatchMapSceneA0s;
        }
        return new LocalMapWidgetData(str, str2, hatchMapScene);
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Hud] */
    @Override // X.C9hv
    public void serialize(InterfaceC07789is interfaceC07789is, LocalMapWidgetData localMapWidgetData) {
        JsonElement jsonElementA0s;
        AnonymousClass003.A0u(interfaceC07789is, localMapWidgetData);
        LocalMapWidgetDataSerializer$Surrogate$$serializer localMapWidgetDataSerializer$Surrogate$$serializer = LocalMapWidgetDataSerializer$Surrogate$$serializer.INSTANCE;
        String str = localMapWidgetData.html;
        String str2 = localMapWidgetData.path;
        HatchMapScene hatchMapScene = localMapWidgetData.scene;
        if (hatchMapScene != null) {
            try {
                C9sU c9sU = HatchJsonKt.HatchJson;
                int i = HatchMapScene.$stable;
                jsonElementA0s = c9sU.A03(hatchMapScene, HatchMapScene$$serializer.INSTANCE);
            } catch (Throwable th) {
                jsonElementA0s = C3cG.A0s(th);
            }
            jsonElement = jsonElementA0s instanceof C10571Hud ? null : jsonElementA0s;
        }
        interfaceC07789is.AAR(new Surrogate(str, str2, jsonElement), localMapWidgetDataSerializer$Surrogate$$serializer);
    }
}
