package com.facebook.aura.permissions.defaults;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.F0C;
import X.F60;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SetConfidentialVmSettingsRequestJson extends C06G {
    public final Map<String, String> confidential_vm;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, SetConfidentialVmSettingsRequestJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final SetConfidentialVmSettingsRequestJson of(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            F0C<C9hr<Object>>[] f0cArr = SetConfidentialVmSettingsRequestJson.$childSerializers;
            return new SetConfidentialVmSettingsRequestJson(AnonymousClass006.A10(str, z ? ConfidentialVmSettingsJsonKt.MODE_ALLOW : ConfidentialVmSettingsJsonKt.MODE_DENY));
        }

        public final C9hr<SetConfidentialVmSettingsRequestJson> serializer() {
            return SetConfidentialVmSettingsRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SetConfidentialVmSettingsRequestJson copy(Map<String, String> map) {
        C7384Etj.A0Y(map, 0);
        return new SetConfidentialVmSettingsRequestJson(map);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SetConfidentialVmSettingsRequestJson) && C7384Etj.areEqual(this.confidential_vm, ((SetConfidentialVmSettingsRequestJson) obj).confidential_vm));
    }

    public /* synthetic */ SetConfidentialVmSettingsRequestJson(int i, Map map, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SetConfidentialVmSettingsRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.confidential_vm = map;
    }

    public static /* synthetic */ SetConfidentialVmSettingsRequestJson copy$default(SetConfidentialVmSettingsRequestJson setConfidentialVmSettingsRequestJson, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = setConfidentialVmSettingsRequestJson.confidential_vm;
        }
        C7384Etj.A0Y(map, 0);
        return new SetConfidentialVmSettingsRequestJson(map);
    }

    public final Map<String, String> component1() {
        return this.confidential_vm;
    }

    public final Map<String, String> getConfidential_vm() {
        return this.confidential_vm;
    }

    public int hashCode() {
        return this.confidential_vm.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public SetConfidentialVmSettingsRequestJson(Map<String, String> map) {
        C7384Etj.A0Y(map, 0);
        this.confidential_vm = map;
    }
}
