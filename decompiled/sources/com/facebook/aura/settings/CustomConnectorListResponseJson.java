package com.facebook.aura.settings;

import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CustomConnectorListResponseJson extends C06G {
    public static final int $stable = 8;
    public final List<CustomConnectorListItemJson> connectors;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, CustomConnectorListResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<CustomConnectorListResponseJson> serializer() {
            return CustomConnectorListResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final CustomConnectorListResponseJson copy(List<CustomConnectorListItemJson> list) {
        C7384Etj.A0Y(list, 0);
        return new CustomConnectorListResponseJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CustomConnectorListResponseJson) && C7384Etj.areEqual(this.connectors, ((CustomConnectorListResponseJson) obj).connectors));
    }

    public static /* synthetic */ CustomConnectorListResponseJson copy$default(CustomConnectorListResponseJson customConnectorListResponseJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = customConnectorListResponseJson.connectors;
        }
        C7384Etj.A0Y(list, 0);
        return new CustomConnectorListResponseJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(CustomConnectorListResponseJson customConnectorListResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(customConnectorListResponseJson.connectors)) {
            c9j5.AAQ(customConnectorListResponseJson.connectors, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<CustomConnectorListItemJson> component1() {
        return this.connectors;
    }

    public final List<CustomConnectorListItemJson> getConnectors() {
        return this.connectors;
    }

    public int hashCode() {
        return this.connectors.hashCode();
    }

    public /* synthetic */ CustomConnectorListResponseJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.connectors = C0881AGi.A00;
        } else {
            this.connectors = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public CustomConnectorListResponseJson(List<CustomConnectorListItemJson> list) {
        C7384Etj.A0Y(list, 0);
        this.connectors = list;
    }

    public /* synthetic */ CustomConnectorListResponseJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public CustomConnectorListResponseJson() {
        this(C0881AGi.A00);
    }
}
