package com.hatch.browser.core;

import X.C06H;
import X.C7384Etj;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.sun.jna.Structure;

@Structure.FieldOrder({"uniffiFree", "uniffiClone", AgeCheckFunnelLogging.KEY_STAGE, BrowserOperationCatalogKt.READ, "release"})
/* loaded from: classes6.dex */
public class UniffiVTableCallbackInterfaceBrowserHostFiles extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceBrowserHostFilesMethod1 read;
    public UniffiCallbackInterfaceBrowserHostFilesMethod2 release;
    public UniffiCallbackInterfaceBrowserHostFilesMethod0 stage;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    public UniffiVTableCallbackInterfaceBrowserHostFiles() {
        this(null, null, null, null, null);
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiVTableCallbackInterfaceBrowserHostFiles uniffiVTableCallbackInterfaceBrowserHostFiles) {
        C7384Etj.A0Y(uniffiVTableCallbackInterfaceBrowserHostFiles, 0);
        this.uniffiFree = uniffiVTableCallbackInterfaceBrowserHostFiles.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceBrowserHostFiles.uniffiClone;
        this.stage = uniffiVTableCallbackInterfaceBrowserHostFiles.stage;
        this.read = uniffiVTableCallbackInterfaceBrowserHostFiles.read;
        this.release = uniffiVTableCallbackInterfaceBrowserHostFiles.release;
    }

    public final class UniffiByValue extends UniffiVTableCallbackInterfaceBrowserHostFiles implements Structure.ByValue {
        public static final int $stable = 8;

        public UniffiByValue() {
            this(null, null, null, null, null);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostFilesMethod0 uniffiCallbackInterfaceBrowserHostFilesMethod0, UniffiCallbackInterfaceBrowserHostFilesMethod1 uniffiCallbackInterfaceBrowserHostFilesMethod1, UniffiCallbackInterfaceBrowserHostFilesMethod2 uniffiCallbackInterfaceBrowserHostFilesMethod2) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceBrowserHostFilesMethod0, uniffiCallbackInterfaceBrowserHostFilesMethod1, uniffiCallbackInterfaceBrowserHostFilesMethod2);
        }

        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostFilesMethod0 uniffiCallbackInterfaceBrowserHostFilesMethod0, UniffiCallbackInterfaceBrowserHostFilesMethod1 uniffiCallbackInterfaceBrowserHostFilesMethod1, UniffiCallbackInterfaceBrowserHostFilesMethod2 uniffiCallbackInterfaceBrowserHostFilesMethod2, int i, C06H c06h) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBrowserHostFilesMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceBrowserHostFilesMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceBrowserHostFilesMethod2);
        }
    }

    public UniffiVTableCallbackInterfaceBrowserHostFiles(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostFilesMethod0 uniffiCallbackInterfaceBrowserHostFilesMethod0, UniffiCallbackInterfaceBrowserHostFilesMethod1 uniffiCallbackInterfaceBrowserHostFilesMethod1, UniffiCallbackInterfaceBrowserHostFilesMethod2 uniffiCallbackInterfaceBrowserHostFilesMethod2) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.stage = uniffiCallbackInterfaceBrowserHostFilesMethod0;
        this.read = uniffiCallbackInterfaceBrowserHostFilesMethod1;
        this.release = uniffiCallbackInterfaceBrowserHostFilesMethod2;
    }

    public /* synthetic */ UniffiVTableCallbackInterfaceBrowserHostFiles(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostFilesMethod0 uniffiCallbackInterfaceBrowserHostFilesMethod0, UniffiCallbackInterfaceBrowserHostFilesMethod1 uniffiCallbackInterfaceBrowserHostFilesMethod1, UniffiCallbackInterfaceBrowserHostFilesMethod2 uniffiCallbackInterfaceBrowserHostFilesMethod2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBrowserHostFilesMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceBrowserHostFilesMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceBrowserHostFilesMethod2);
    }
}
