package com.hatch.browser.core;

import X.C06H;
import X.C7384Etj;
import com.sun.jna.Structure;

@Structure.FieldOrder({"uniffiFree", "uniffiClone", "publish"})
/* loaded from: classes6.dex */
public class UniffiVTableCallbackInterfaceBrowserHostDownloads extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceBrowserHostDownloadsMethod0 publish;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    public UniffiVTableCallbackInterfaceBrowserHostDownloads() {
        this(null, null, null);
    }

    public final void uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(UniffiVTableCallbackInterfaceBrowserHostDownloads uniffiVTableCallbackInterfaceBrowserHostDownloads) {
        C7384Etj.A0Y(uniffiVTableCallbackInterfaceBrowserHostDownloads, 0);
        this.uniffiFree = uniffiVTableCallbackInterfaceBrowserHostDownloads.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceBrowserHostDownloads.uniffiClone;
        this.publish = uniffiVTableCallbackInterfaceBrowserHostDownloads.publish;
    }

    public final class UniffiByValue extends UniffiVTableCallbackInterfaceBrowserHostDownloads implements Structure.ByValue {
        public static final int $stable = 8;

        public UniffiByValue() {
            this(null, null, null);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostDownloadsMethod0 uniffiCallbackInterfaceBrowserHostDownloadsMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceBrowserHostDownloadsMethod0);
        }

        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostDownloadsMethod0 uniffiCallbackInterfaceBrowserHostDownloadsMethod0, int i, C06H c06h) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBrowserHostDownloadsMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceBrowserHostDownloads(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostDownloadsMethod0 uniffiCallbackInterfaceBrowserHostDownloadsMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.publish = uniffiCallbackInterfaceBrowserHostDownloadsMethod0;
    }

    public /* synthetic */ UniffiVTableCallbackInterfaceBrowserHostDownloads(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBrowserHostDownloadsMethod0 uniffiCallbackInterfaceBrowserHostDownloadsMethod0, int i, C06H c06h) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBrowserHostDownloadsMethod0);
    }
}
