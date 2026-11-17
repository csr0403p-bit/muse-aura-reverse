package com.facebook.aura.localbrowser.core;

import X.C7384Etj;
import X.C7438Evz;
import X.G0U;
import com.hatch.browser.protocol.Command;

/* loaded from: classes6.dex */
public final /* synthetic */ class BrowserOperationCatalog$specs$4 extends C7438Evz implements G0U<BrowserArgs, Command> {
    public static final BrowserOperationCatalog$specs$4 INSTANCE = new BrowserOperationCatalog$specs$4();

    public BrowserOperationCatalog$specs$4() {
        super(1, BrowserOperationCatalogKt.class, "waitCommand", "waitCommand(Lcom/facebook/aura/localbrowser/core/BrowserArgs;)Lcom/hatch/browser/protocol/Command;", 1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Command invoke(BrowserArgs browserArgs) {
        BrowserArgs browserArgs2 = browserArgs;
        C7384Etj.A0Y(browserArgs2, 0);
        return BrowserOperationCatalogKt.waitCommand(browserArgs2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Command invoke2(BrowserArgs browserArgs) {
        C7384Etj.A0Y(browserArgs, 0);
        return BrowserOperationCatalogKt.waitCommand(browserArgs);
    }
}
