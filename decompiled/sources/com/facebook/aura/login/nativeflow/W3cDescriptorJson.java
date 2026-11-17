package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class W3cDescriptorJson extends C06G {
    public final String id;
    public final List<String> transports;
    public final String type;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, W3cDescriptorJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<W3cDescriptorJson> serializer() {
            return W3cDescriptorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof W3cDescriptorJson) {
                W3cDescriptorJson w3cDescriptorJson = (W3cDescriptorJson) obj;
                if (!C7384Etj.areEqual(this.id, w3cDescriptorJson.id) || !C7384Etj.areEqual(this.type, w3cDescriptorJson.type) || !C7384Etj.areEqual(this.transports, w3cDescriptorJson.transports)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ W3cDescriptorJson copy$default(W3cDescriptorJson w3cDescriptorJson, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = w3cDescriptorJson.id;
        }
        if ((i & 2) != 0) {
            str2 = w3cDescriptorJson.type;
        }
        if ((i & 4) != 0) {
            list = w3cDescriptorJson.transports;
        }
        return w3cDescriptorJson.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(W3cDescriptorJson w3cDescriptorJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(w3cDescriptorJson.id, c9iZ, 0);
        c9j5.AAV(w3cDescriptorJson.type, c9iZ, 1);
        if (c9j5.AfR() || w3cDescriptorJson.transports != null) {
            c9j5.AAP(w3cDescriptorJson.transports, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.type;
    }

    public final List<String> component3() {
        return this.transports;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getTransports() {
        return this.transports;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.type, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0D(this.transports);
    }

    public W3cDescriptorJson(String str, String str2, List<String> list) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.type = str2;
        this.transports = list;
    }

    public final W3cDescriptorJson copy(String str, String str2, List<String> list) {
        AnonymousClass003.A0u(str, str2);
        return new W3cDescriptorJson(str, str2, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ W3cDescriptorJson(int i, String str, String str2, List list, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(W3cDescriptorJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.type = str2;
        this.transports = (i & 4) == 0 ? null : list;
    }

    public /* synthetic */ W3cDescriptorJson(String str, String str2, List list, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : list);
    }
}
