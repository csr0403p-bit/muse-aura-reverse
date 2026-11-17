package com.hatch.browser.core;

import X.C06H;
import X.C7384Etj;
import com.sun.jna.Structure;

@Structure.FieldOrder({"uniffiFree", "uniffiClone", "check"})
/* loaded from: classes6.dex */
public class UniffiVTableCallbackInterfaceBrowserHostBlocklist extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceBrowserHostBlocklistMethod0 check;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    public UniffiVTableCallbackInterfaceBrowserHostBlocklist() {
        this(null, null, null);
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiVTableCallbackInterfaceBrowserHostBlocklist uniffiVTableCallbackInterfaceBrowserHostBlocklist) {
        C7384Etj.A0Y(uniffiVTableCallbackInterfaceBrowserHostBlocklist, 0);
        this.uniffiFree = uniffiVTableCallbackInterfaceBrowserHostBlocklist.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceBrowserHostBlocklist.uniffiClone;
        this.check = uniffiVTableCallbackInterfaceBrowserHostBlocklist.check;
    }

    public final class UniffiByValue extends UniffiVTableCallbackInterfaceBrowserHostBlocklist implements Structure.ByValue {
        public static final int $stable = 8;

        public UniffiByValue() {
            this(null, null, null);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostBlocklistMethod0 uniffiCallbackInterfaceBrowserHostBlocklistMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceBrowserHostBlocklistMethod0);
        }

        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostBlocklistMethod0 uniffiCallbackInterfaceBrowserHostBlocklistMethod0, int i, C06H c06h) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBrowserHostBlocklistMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceBrowserHostBlocklist(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostBlocklistMethod0 uniffiCallbackInterfaceBrowserHostBlocklistMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.check = uniffiCallbackInterfaceBrowserHostBlocklistMethod0;
    }

    public /* synthetic */ UniffiVTableCallbackInterfaceBrowserHostBlocklist(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostBlocklistMethod0 uniffiCallbackInterfaceBrowserHostBlocklistMethod0, int i, C06H c06h) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBrowserHostBlocklistMethod0);
    }
}
