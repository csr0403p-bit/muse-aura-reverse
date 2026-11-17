package com.hatch.browser.core;

import X.C06H;
import X.C7384Etj;
import com.sun.jna.Structure;

@Structure.FieldOrder({"uniffiFree", "uniffiClone", "closePage"})
/* loaded from: classes6.dex */
public class UniffiVTableCallbackInterfaceBrowserHostPageClose extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceBrowserHostPageCloseMethod0 closePage;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    public UniffiVTableCallbackInterfaceBrowserHostPageClose() {
        this(null, null, null);
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiVTableCallbackInterfaceBrowserHostPageClose uniffiVTableCallbackInterfaceBrowserHostPageClose) {
        C7384Etj.A0Y(uniffiVTableCallbackInterfaceBrowserHostPageClose, 0);
        this.uniffiFree = uniffiVTableCallbackInterfaceBrowserHostPageClose.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceBrowserHostPageClose.uniffiClone;
        this.closePage = uniffiVTableCallbackInterfaceBrowserHostPageClose.closePage;
    }

    public final class UniffiByValue extends UniffiVTableCallbackInterfaceBrowserHostPageClose implements Structure.ByValue {
        public static final int $stable = 8;

        public UniffiByValue() {
            this(null, null, null);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostPageCloseMethod0 uniffiCallbackInterfaceBrowserHostPageCloseMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceBrowserHostPageCloseMethod0);
        }

        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostPageCloseMethod0 uniffiCallbackInterfaceBrowserHostPageCloseMethod0, int i, C06H c06h) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBrowserHostPageCloseMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceBrowserHostPageClose(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostPageCloseMethod0 uniffiCallbackInterfaceBrowserHostPageCloseMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.closePage = uniffiCallbackInterfaceBrowserHostPageCloseMethod0;
    }

    public /* synthetic */ UniffiVTableCallbackInterfaceBrowserHostPageClose(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostPageCloseMethod0 uniffiCallbackInterfaceBrowserHostPageCloseMethod0, int i, C06H c06h) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBrowserHostPageCloseMethod0);
    }
}
