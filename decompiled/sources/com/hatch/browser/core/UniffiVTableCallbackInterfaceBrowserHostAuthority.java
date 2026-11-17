package com.hatch.browser.core;

import X.C06H;
import X.C7384Etj;
import com.sun.jna.Structure;

@Structure.FieldOrder({"uniffiFree", "uniffiClone", "authorize"})
/* loaded from: classes6.dex */
public class UniffiVTableCallbackInterfaceBrowserHostAuthority extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceBrowserHostAuthorityMethod0 authorize;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    public UniffiVTableCallbackInterfaceBrowserHostAuthority() {
        this(null, null, null);
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiVTableCallbackInterfaceBrowserHostAuthority uniffiVTableCallbackInterfaceBrowserHostAuthority) {
        C7384Etj.A0Y(uniffiVTableCallbackInterfaceBrowserHostAuthority, 0);
        this.uniffiFree = uniffiVTableCallbackInterfaceBrowserHostAuthority.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceBrowserHostAuthority.uniffiClone;
        this.authorize = uniffiVTableCallbackInterfaceBrowserHostAuthority.authorize;
    }

    public final class UniffiByValue extends UniffiVTableCallbackInterfaceBrowserHostAuthority implements Structure.ByValue {
        public static final int $stable = 8;

        public UniffiByValue() {
            this(null, null, null);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostAuthorityMethod0 uniffiCallbackInterfaceBrowserHostAuthorityMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceBrowserHostAuthorityMethod0);
        }

        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostAuthorityMethod0 uniffiCallbackInterfaceBrowserHostAuthorityMethod0, int i, C06H c06h) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBrowserHostAuthorityMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceBrowserHostAuthority(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostAuthorityMethod0 uniffiCallbackInterfaceBrowserHostAuthorityMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.authorize = uniffiCallbackInterfaceBrowserHostAuthorityMethod0;
    }

    public /* synthetic */ UniffiVTableCallbackInterfaceBrowserHostAuthority(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostAuthorityMethod0 uniffiCallbackInterfaceBrowserHostAuthorityMethod0, int i, C06H c06h) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBrowserHostAuthorityMethod0);
    }
}
