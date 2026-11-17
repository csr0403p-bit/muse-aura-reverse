package com.meta.maps.fancypins;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV3;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C5323DgH;
import X.C60R;
import X.C7384Etj;
import X.C9jH;
import X.F0C;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FancyPinPresentation {
    public final String activeVariantId;
    public final FancyPinBlueprint blueprint;
    public final PinLayout layout;
    public final F0C<Map<String, Map<String, FancyPinErasedPartConfiguration>>> partConfigurations;
    public final FancyPin pin;
    public final Map<String, Object> properties;
    public final long registrationRevision;
    public final FancyPinRuntimeClusterContext runtimeCluster;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FancyPinPresentation) {
                FancyPinPresentation fancyPinPresentation = (FancyPinPresentation) obj;
                if (!C7384Etj.areEqual(this.pin, fancyPinPresentation.pin) || !C7384Etj.areEqual(this.blueprint, fancyPinPresentation.blueprint) || !C7384Etj.areEqual(this.activeVariantId, fancyPinPresentation.activeVariantId) || !C7384Etj.areEqual(this.layout, fancyPinPresentation.layout) || this.registrationRevision != fancyPinPresentation.registrationRevision || !C7384Etj.areEqual(this.properties, fancyPinPresentation.properties) || !C7384Etj.areEqual(this.partConfigurations, fancyPinPresentation.partConfigurations) || !C7384Etj.areEqual(this.runtimeCluster, fancyPinPresentation.runtimeCluster)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ FancyPinPresentation(FancyPin fancyPin, FancyPinBlueprint fancyPinBlueprint, String str, PinLayout pinLayout, long j, Map map, F0C f0c, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext, int i, C06H c06h) {
        this(fancyPin, fancyPinBlueprint, str, pinLayout, j, (i & 32) != 0 ? FancyPinMeasurerKt.decodeProperties(fancyPin) : map, (i & 64) != 0 ? new C5323DgH(C9jH.A00) : f0c, (i & 128) != 0 ? null : fancyPinRuntimeClusterContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FancyPinPresentation copy$default(FancyPinPresentation fancyPinPresentation, FancyPin fancyPin, FancyPinBlueprint fancyPinBlueprint, String str, PinLayout pinLayout, long j, Map map, F0C f0c, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext, int i, Object obj) {
        if ((i & 1) != 0) {
            fancyPin = fancyPinPresentation.pin;
        }
        if ((i & 2) != 0) {
            fancyPinBlueprint = fancyPinPresentation.blueprint;
        }
        if ((i & 4) != 0) {
            str = fancyPinPresentation.activeVariantId;
        }
        if ((i & 8) != 0) {
            pinLayout = fancyPinPresentation.layout;
        }
        if ((i & 16) != 0) {
            j = fancyPinPresentation.registrationRevision;
        }
        if ((i & 32) != 0) {
            map = fancyPinPresentation.properties;
        }
        if ((i & 64) != 0) {
            f0c = fancyPinPresentation.partConfigurations;
        }
        if ((i & 128) != 0) {
            fancyPinRuntimeClusterContext = fancyPinPresentation.runtimeCluster;
        }
        return fancyPinPresentation.copy(fancyPin, fancyPinBlueprint, str, pinLayout, j, map, f0c, fancyPinRuntimeClusterContext);
    }

    public final FancyPin component1() {
        return this.pin;
    }

    public final FancyPinBlueprint component2() {
        return this.blueprint;
    }

    public final String component3() {
        return this.activeVariantId;
    }

    public final PinLayout component4() {
        return this.layout;
    }

    public final long component5() {
        return this.registrationRevision;
    }

    public final Map<String, Object> component6() {
        return this.properties;
    }

    public final F0C<Map<String, Map<String, FancyPinErasedPartConfiguration>>> component7$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.partConfigurations;
    }

    public final FancyPinRuntimeClusterContext component8() {
        return this.runtimeCluster;
    }

    public final String getActiveVariantId() {
        return this.activeVariantId;
    }

    public final FancyPinBlueprint getBlueprint() {
        return this.blueprint;
    }

    public final PinLayout getLayout() {
        return this.layout;
    }

    public final F0C<Map<String, Map<String, FancyPinErasedPartConfiguration>>> getPartConfigurations$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.partConfigurations;
    }

    public final FancyPin getPin() {
        return this.pin;
    }

    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    public final long getRegistrationRevision() {
        return this.registrationRevision;
    }

    public final Map<String, Map<String, FancyPinErasedPartConfiguration>> getResolvedPartConfigurations() {
        return this.partConfigurations.getValue();
    }

    public final FancyPinRuntimeClusterContext getRuntimeCluster() {
        return this.runtimeCluster;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.partConfigurations, AnonymousClass005.A0F(this.properties, C60R.A00(this.registrationRevision, AnonymousClass005.A0F(this.layout, AnonymousClass005.A0I(this.activeVariantId, AnonymousClass005.A0F(this.blueprint, AnonymousClass005.A0E(this.pin))))))) + AnonymousClass006.A0D(this.runtimeCluster);
    }

    public String toString() {
        FancyPin fancyPin = this.pin;
        FancyPinBlueprint fancyPinBlueprint = this.blueprint;
        String str = this.activeVariantId;
        PinLayout pinLayout = this.layout;
        long j = this.registrationRevision;
        Map<String, Object> map = this.properties;
        F0C<Map<String, Map<String, FancyPinErasedPartConfiguration>>> f0c = this.partConfigurations;
        FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext = this.runtimeCluster;
        StringBuilder sbA0f = C3cG.A0f(fancyPin, "FancyPinPresentation(pin=");
        sbA0f.append(", blueprint=");
        sbA0f.append(fancyPinBlueprint);
        sbA0f.append(", activeVariantId=");
        sbA0f.append(str);
        sbA0f.append(", layout=");
        sbA0f.append(pinLayout);
        sbA0f.append(", registrationRevision=");
        sbA0f.append(j);
        sbA0f.append(BV3.A00(20));
        sbA0f.append(map);
        sbA0f.append(", partConfigurations=");
        sbA0f.append(f0c);
        return C3cJ.A0L(fancyPinRuntimeClusterContext, ", runtimeCluster=", sbA0f);
    }

    public final FancyPinPresentation copy(FancyPin fancyPin, FancyPinBlueprint fancyPinBlueprint, String str, PinLayout pinLayout, long j, Map<String, ? extends Object> map, F0C<? extends Map<String, ? extends Map<String, ? extends FancyPinErasedPartConfiguration>>> f0c, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext) {
        AnonymousClass005.A14(fancyPin, fancyPinBlueprint, str, pinLayout);
        AnonymousClass003.A0z(map, f0c);
        return new FancyPinPresentation(fancyPin, fancyPinBlueprint, str, pinLayout, j, map, f0c, fancyPinRuntimeClusterContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FancyPinPresentation(FancyPin fancyPin, FancyPinBlueprint fancyPinBlueprint, String str, PinLayout pinLayout, long j, Map<String, ? extends Object> map, F0C<? extends Map<String, ? extends Map<String, ? extends FancyPinErasedPartConfiguration>>> f0c, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext) {
        AnonymousClass005.A14(fancyPin, fancyPinBlueprint, str, pinLayout);
        AnonymousClass003.A0z(map, f0c);
        this.pin = fancyPin;
        this.blueprint = fancyPinBlueprint;
        this.activeVariantId = str;
        this.layout = pinLayout;
        this.registrationRevision = j;
        this.properties = map;
        this.partConfigurations = f0c;
        this.runtimeCluster = fancyPinRuntimeClusterContext;
    }
}
