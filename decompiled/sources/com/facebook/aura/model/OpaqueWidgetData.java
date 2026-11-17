package com.facebook.aura.model;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class OpaqueWidgetData extends C06G implements HatchWidgetData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String dataJson;

    public final class Companion {
        public final C9hr<OpaqueWidgetData> serializer() {
            return OpaqueWidgetData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final OpaqueWidgetData copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new OpaqueWidgetData(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OpaqueWidgetData) && C7384Etj.areEqual(this.dataJson, ((OpaqueWidgetData) obj).dataJson));
    }

    public /* synthetic */ OpaqueWidgetData(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(OpaqueWidgetData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.dataJson = str;
    }

    public static /* synthetic */ OpaqueWidgetData copy$default(OpaqueWidgetData opaqueWidgetData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = opaqueWidgetData.dataJson;
        }
        C7384Etj.A0Y(str, 0);
        return new OpaqueWidgetData(str);
    }

    public final String component1() {
        return this.dataJson;
    }

    public final String getDataJson() {
        return this.dataJson;
    }

    public int hashCode() {
        return this.dataJson.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public OpaqueWidgetData(String str) {
        C7384Etj.A0Y(str, 0);
        this.dataJson = str;
    }
}
