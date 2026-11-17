package com.hatch.browser.core;

import X.C06H;
import X.C7384Etj;
import com.facebook.aura.permissions.defaults.ConfidentialVmSettingsJsonKt;
import com.sun.jna.Structure;

@Structure.FieldOrder({"uniffiFree", "uniffiClone", ConfidentialVmSettingsJsonKt.MODE_ALLOW})
/* loaded from: classes6.dex */
public class UniffiVTableCallbackInterfaceBrowserHostNativeControls extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceBrowserHostNativeControlsMethod0 allow;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    public UniffiVTableCallbackInterfaceBrowserHostNativeControls() {
        this(null, null, null);
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiVTableCallbackInterfaceBrowserHostNativeControls uniffiVTableCallbackInterfaceBrowserHostNativeControls) {
        C7384Etj.A0Y(uniffiVTableCallbackInterfaceBrowserHostNativeControls, 0);
        this.uniffiFree = uniffiVTableCallbackInterfaceBrowserHostNativeControls.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceBrowserHostNativeControls.uniffiClone;
        this.allow = uniffiVTableCallbackInterfaceBrowserHostNativeControls.allow;
    }

    public final class UniffiByValue extends UniffiVTableCallbackInterfaceBrowserHostNativeControls implements Structure.ByValue {
        public static final int $stable = 8;

        public UniffiByValue() {
            this(null, null, null);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostNativeControlsMethod0 uniffiCallbackInterfaceBrowserHostNativeControlsMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceBrowserHostNativeControlsMethod0);
        }

        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostNativeControlsMethod0 uniffiCallbackInterfaceBrowserHostNativeControlsMethod0, int i, C06H c06h) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBrowserHostNativeControlsMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceBrowserHostNativeControls(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostNativeControlsMethod0 uniffiCallbackInterfaceBrowserHostNativeControlsMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.allow = uniffiCallbackInterfaceBrowserHostNativeControlsMethod0;
    }

    public /* synthetic */ UniffiVTableCallbackInterfaceBrowserHostNativeControls(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostNativeControlsMethod0 uniffiCallbackInterfaceBrowserHostNativeControlsMethod0, int i, C06H c06h) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBrowserHostNativeControlsMethod0);
    }
}
