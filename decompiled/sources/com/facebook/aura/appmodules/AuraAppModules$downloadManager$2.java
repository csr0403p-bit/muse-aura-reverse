package com.facebook.aura.appmodules;

import X.AbstractC7559F3s;
import X.C3298CCu;
import X.C3299CCv;
import X.C4JM;
import X.CCw;
import X.F0C;
import android.app.Application;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraAppModules$downloadManager$2 extends AbstractC7559F3s implements Function0<AuraPlayModuleDownloadManager> {
    public static final AuraAppModules$downloadManager$2 INSTANCE = new AuraAppModules$downloadManager$2();

    public AuraAppModules$downloadManager$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraPlayModuleDownloadManager invoke() {
        Application applicationA00 = C4JM.A00();
        return new AuraPlayModuleDownloadManager(AuraAppModules.INSTANCE.createPlayDownloader(applicationA00, C3299CCv.A00(applicationA00, CCw.A01), C3298CCu.A00(applicationA00), F0C.A06(AuraAppModules.playDownloaderExecutor$delegate)));
    }
}
