package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LocalMapTypedDataJson extends C06G {
    public static final int $stable = 8;
    public final List<LocalMapElementJson> elements;
    public final String motivation;
    public final Integer schema_version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, LocalMapTypedDataJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<LocalMapTypedDataJson> serializer() {
            return LocalMapTypedDataJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public LocalMapTypedDataJson(Integer num, String str, List<LocalMapElementJson> list) {
        C7384Etj.A0Y(list, 2);
        this.schema_version = num;
        this.motivation = str;
        this.elements = list;
    }

    public final LocalMapTypedDataJson copy(Integer num, String str, List<LocalMapElementJson> list) {
        C7384Etj.A0Y(list, 2);
        return new LocalMapTypedDataJson(num, str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalMapTypedDataJson) {
                LocalMapTypedDataJson localMapTypedDataJson = (LocalMapTypedDataJson) obj;
                if (!C7384Etj.areEqual(this.schema_version, localMapTypedDataJson.schema_version) || !C7384Etj.areEqual(this.motivation, localMapTypedDataJson.motivation) || !C7384Etj.areEqual(this.elements, localMapTypedDataJson.elements)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalMapTypedDataJson copy$default(LocalMapTypedDataJson localMapTypedDataJson, Integer num, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = localMapTypedDataJson.schema_version;
        }
        if ((i & 2) != 0) {
            str = localMapTypedDataJson.motivation;
        }
        if ((i & 4) != 0) {
            list = localMapTypedDataJson.elements;
        }
        return localMapTypedDataJson.copy(num, str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(LocalMapTypedDataJson localMapTypedDataJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || localMapTypedDataJson.schema_version != null) {
            c9j5.AAP(localMapTypedDataJson.schema_version, C07729ii.A00, c9iZ, 0);
        }
        if (zAfR || localMapTypedDataJson.motivation != null) {
            c9j5.AAP(localMapTypedDataJson.motivation, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(localMapTypedDataJson.elements)) {
            c9j5.AAQ(localMapTypedDataJson.elements, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final Integer component1() {
        return this.schema_version;
    }

    public final String component2() {
        return this.motivation;
    }

    public final List<LocalMapElementJson> component3() {
        return this.elements;
    }

    public final List<LocalMapElementJson> getElements() {
        return this.elements;
    }

    public final String getMotivation() {
        return this.motivation;
    }

    public final Integer getSchema_version() {
        return this.schema_version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.elements, ((AnonymousClass006.A0D(this.schema_version) * 31) + AnonymousClass005.A0H(this.motivation)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LocalMapTypedDataJson(int i, Integer num, String str, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.schema_version = null;
        } else {
            this.schema_version = num;
        }
        if ((i & 2) == 0) {
            this.motivation = null;
        } else {
            this.motivation = str;
        }
        if ((i & 4) == 0) {
            this.elements = C0881AGi.A00;
        } else {
            this.elements = list;
        }
    }

    public /* synthetic */ LocalMapTypedDataJson(Integer num, String str, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? C0881AGi.A00 : list);
    }

    public LocalMapTypedDataJson() {
        this(null, null, C0881AGi.A00);
    }
}
