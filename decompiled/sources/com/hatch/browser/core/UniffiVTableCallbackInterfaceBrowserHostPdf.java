package com.hatch.browser.core;

import X.C06H;
import X.C7384Etj;
import com.sun.jna.Structure;

@Structure.FieldOrder({"uniffiFree", "uniffiClone", "print"})
/* loaded from: classes6.dex */
public class UniffiVTableCallbackInterfaceBrowserHostPdf extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceBrowserHostPdfMethod0 print;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    public UniffiVTableCallbackInterfaceBrowserHostPdf() {
        this(null, null, null);
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiVTableCallbackInterfaceBrowserHostPdf uniffiVTableCallbackInterfaceBrowserHostPdf) {
        C7384Etj.A0Y(uniffiVTableCallbackInterfaceBrowserHostPdf, 0);
        this.uniffiFree = uniffiVTableCallbackInterfaceBrowserHostPdf.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceBrowserHostPdf.uniffiClone;
        this.print = uniffiVTableCallbackInterfaceBrowserHostPdf.print;
    }

    public final class UniffiByValue extends UniffiVTableCallbackInterfaceBrowserHostPdf implements Structure.ByValue {
        public static final int $stable = 8;

        public UniffiByValue() {
            this(null, null, null);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostPdfMethod0 uniffiCallbackInterfaceBrowserHostPdfMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceBrowserHostPdfMethod0);
        }

        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostPdfMethod0 uniffiCallbackInterfaceBrowserHostPdfMethod0, int i, C06H c06h) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBrowserHostPdfMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceBrowserHostPdf(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostPdfMethod0 uniffiCallbackInterfaceBrowserHostPdfMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.print = uniffiCallbackInterfaceBrowserHostPdfMethod0;
    }

    public /* synthetic */ UniffiVTableCallbackInterfaceBrowserHostPdf(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostPdfMethod0 uniffiCallbackInterfaceBrowserHostPdfMethod0, int i, C06H c06h) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBrowserHostPdfMethod0);
    }
}
