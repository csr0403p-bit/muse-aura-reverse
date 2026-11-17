package com.facebook.aura.nodes.json;

import X.AGH;
import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07839ix;
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
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CapabilitiesJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final Map<String, DataSourceCapabilityJson> data_sources;
    public final Map<String, DeviceCommandCapabilityJson> device_commands;
    public final Map<String, DeviceCommandCapabilityJson> hatch_app_commands;
    public final RenderingCapabilitiesJson rendering;
    public final Boolean voice_entrypoint_enabled;

    public final class Companion {
        public final C9hr<CapabilitiesJson> serializer() {
            return CapabilitiesJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, CapabilitiesJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, CapabilitiesJson$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, CapabilitiesJson$Companion$$childSerializers$3.INSTANCE), null, null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CapabilitiesJson) {
                CapabilitiesJson capabilitiesJson = (CapabilitiesJson) obj;
                if (!C7384Etj.areEqual(this.data_sources, capabilitiesJson.data_sources) || !C7384Etj.areEqual(this.device_commands, capabilitiesJson.device_commands) || !C7384Etj.areEqual(this.hatch_app_commands, capabilitiesJson.hatch_app_commands) || !C7384Etj.areEqual(this.rendering, capabilitiesJson.rendering) || !C7384Etj.areEqual(this.voice_entrypoint_enabled, capabilitiesJson.voice_entrypoint_enabled)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CapabilitiesJson copy$default(CapabilitiesJson capabilitiesJson, Map map, Map map2, Map map3, RenderingCapabilitiesJson renderingCapabilitiesJson, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            map = capabilitiesJson.data_sources;
        }
        if ((i & 2) != 0) {
            map2 = capabilitiesJson.device_commands;
        }
        if ((i & 4) != 0) {
            map3 = capabilitiesJson.hatch_app_commands;
        }
        if ((i & 8) != 0) {
            renderingCapabilitiesJson = capabilitiesJson.rendering;
        }
        if ((i & 16) != 0) {
            bool = capabilitiesJson.voice_entrypoint_enabled;
        }
        return capabilitiesJson.copy(map, map2, map3, renderingCapabilitiesJson, bool);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(CapabilitiesJson capabilitiesJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAQ(capabilitiesJson.data_sources, C3cH.A15(f0cArr, 0), c9iZ, 0);
        c9j5.AAQ(capabilitiesJson.device_commands, C3cH.A15(f0cArr, 1), c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1M(capabilitiesJson.hatch_app_commands)) {
            c9j5.AAQ(capabilitiesJson.hatch_app_commands, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || capabilitiesJson.rendering != null) {
            c9j5.AAP(capabilitiesJson.rendering, RenderingCapabilitiesJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || capabilitiesJson.voice_entrypoint_enabled != null) {
            c9j5.AAP(capabilitiesJson.voice_entrypoint_enabled, C07839ix.A00, c9iZ, 4);
        }
    }

    public final Map<String, DataSourceCapabilityJson> component1() {
        return this.data_sources;
    }

    public final Map<String, DeviceCommandCapabilityJson> component2() {
        return this.device_commands;
    }

    public final Map<String, DeviceCommandCapabilityJson> component3() {
        return this.hatch_app_commands;
    }

    public final RenderingCapabilitiesJson component4() {
        return this.rendering;
    }

    public final Boolean component5() {
        return this.voice_entrypoint_enabled;
    }

    public final Map<String, DataSourceCapabilityJson> getData_sources() {
        return this.data_sources;
    }

    public final Map<String, DeviceCommandCapabilityJson> getDevice_commands() {
        return this.device_commands;
    }

    public final Map<String, DeviceCommandCapabilityJson> getHatch_app_commands() {
        return this.hatch_app_commands;
    }

    public final RenderingCapabilitiesJson getRendering() {
        return this.rendering;
    }

    public final Boolean getVoice_entrypoint_enabled() {
        return this.voice_entrypoint_enabled;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.hatch_app_commands, AnonymousClass005.A0F(this.device_commands, AnonymousClass005.A0E(this.data_sources))) + AnonymousClass006.A0D(this.rendering)) * 31) + C3cH.A02(this.voice_entrypoint_enabled);
    }

    public CapabilitiesJson(Map<String, DataSourceCapabilityJson> map, Map<String, DeviceCommandCapabilityJson> map2, Map<String, DeviceCommandCapabilityJson> map3, RenderingCapabilitiesJson renderingCapabilitiesJson, Boolean bool) {
        AnonymousClass005.A0x(map, map2, map3);
        this.data_sources = map;
        this.device_commands = map2;
        this.hatch_app_commands = map3;
        this.rendering = renderingCapabilitiesJson;
        this.voice_entrypoint_enabled = bool;
    }

    public final CapabilitiesJson copy(Map<String, DataSourceCapabilityJson> map, Map<String, DeviceCommandCapabilityJson> map2, Map<String, DeviceCommandCapabilityJson> map3, RenderingCapabilitiesJson renderingCapabilitiesJson, Boolean bool) {
        AnonymousClass005.A0x(map, map2, map3);
        return new CapabilitiesJson(map, map2, map3, renderingCapabilitiesJson, bool);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CapabilitiesJson(Map map, Map map2, Map map3, RenderingCapabilitiesJson renderingCapabilitiesJson, Boolean bool, int i, C06H c06h) {
        this(map, map2, C3cH.A0o(map3, i & 4), (i & 8) != 0 ? null : renderingCapabilitiesJson, (i & 16) != 0 ? null : bool);
    }

    public /* synthetic */ CapabilitiesJson(int i, Map map, Map map2, Map map3, RenderingCapabilitiesJson renderingCapabilitiesJson, Boolean bool, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(CapabilitiesJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.data_sources = map;
        this.device_commands = map2;
        this.hatch_app_commands = (i & 4) == 0 ? AGH.A0E() : map3;
        if ((i & 8) == 0) {
            this.rendering = null;
        } else {
            this.rendering = renderingCapabilitiesJson;
        }
        if ((i & 16) == 0) {
            this.voice_entrypoint_enabled = null;
        } else {
            this.voice_entrypoint_enabled = bool;
        }
    }
}
