package com.facebook.aura.appmodules;

import X.AbstractC5321DgF;
import X.BFI;
import X.C0881AGi;
import X.C3298CCu;
import X.C3299CCv;
import X.C3301CCy;
import X.C3302CDa;
import X.C3303CDb;
import X.C3306CDf;
import X.C3312CDl;
import X.C3313CDn;
import X.C3318CDx;
import X.C4JM;
import X.C7384Etj;
import X.C7cU;
import X.CCn;
import X.CCw;
import X.CCz;
import X.CDH;
import X.CDQ;
import X.CEC;
import X.CEH;
import X.CEN;
import X.EnumC3305CDe;
import X.F0C;
import android.content.Context;
import android.net.ConnectivityManager;
import com.facebook.aura.common.prefs.AuraPrefsStorage;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import java.util.Collections;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class AuraAppModules {
    public static final AuraAppModules INSTANCE = new AuraAppModules();
    public static final F0C manager$delegate = AbstractC5321DgF.A03(AuraAppModules$manager$2.INSTANCE);
    public static final F0C executor$delegate = AbstractC5321DgF.A03(AuraAppModules$executor$2.INSTANCE);
    public static final F0C playDownloaderExecutor$delegate = AbstractC5321DgF.A03(AuraAppModules$playDownloaderExecutor$2.INSTANCE);
    public static final F0C downloadManager$delegate = AbstractC5321DgF.A03(AuraAppModules$downloadManager$2.INSTANCE);

    public final void deferInstall(String str) {
        C7384Etj.A0Y(str, 0);
        CDH cdhA00 = CDH.A04.A00();
        cdhA00.A00.A05(C4JM.A00());
        ((AuraPlayModuleDownloadManager) downloadManager$delegate.getValue()).deferInstall(new C3306CDf(EnumC3305CDe.A03, Collections.singleton(str)));
    }

    public final boolean isDeclared(String str) {
        C7384Etj.A0Y(str, 0);
        return CCn.A00(str) >= 0;
    }

    public final boolean isInstalled(String str) {
        C7384Etj.A0Y(str, 0);
        String[] strArr = C4JM.A00().getApplicationInfo().splitNames;
        return strArr != null && BFI.A0J(str, strArr);
    }

    public final boolean isObtainable(String str) {
        C7384Etj.A0Y(str, 0);
        return CCn.A00(str) < 0 || isInstalled(str) || AuraInstallSourceDetector.INSTANCE.isPlayStoreInstall(C4JM.A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3302CDa createManager(Context context) {
        C7cU factory = AuraPrefsStorage.INSTANCE.getFactory();
        CCw cCwA00 = C3299CCv.A00(context, CCw.A01);
        C3301CCy c3301CCyA00 = C3301CCy.A05.A00(context, C3298CCu.A00(context), cCwA00);
        F0C f0c = downloadManager$delegate;
        AuraAppModuleDownloadActionManager auraAppModuleDownloadActionManager = new AuraAppModuleDownloadActionManager(context, factory, (AuraPlayModuleDownloadManager) f0c.getValue());
        C3312CDl c3312CDl = new C3312CDl(context, (ConnectivityManager) context.getSystemService(ConnectivityManager.class), auraAppModuleDownloadActionManager, c3301CCyA00);
        AuraPlayModuleDownloadManager auraPlayModuleDownloadManager = (AuraPlayModuleDownloadManager) f0c.getValue();
        F0C f0c2 = executor$delegate;
        Executor executorA06 = F0C.A06(f0c2);
        C0881AGi c0881AGi = C0881AGi.A00;
        return new C3302CDa(context, new C3303CDb(c3312CDl, new CDQ(c3301CCyA00), auraAppModuleDownloadActionManager, (AuraPlayModuleDownloadManager) f0c.getValue(), c0881AGi, F0C.A06(f0c2)), auraAppModuleDownloadActionManager, auraPlayModuleDownloadManager, c3301CCyA00, executorA06);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3313CDn createPlayDownloader(Context context, CCw cCw, CCz cCz, Executor executor) {
        if (!AuraInstallSourceDetector.INSTANCE.isPlayStoreInstall(context)) {
            return null;
        }
        return new C3313CDn(context, new CEN(), cCz, cCw, new C3318CDx(context, cCz, new CEC(context, new CEH(context))), executor);
    }

    private final AuraPlayModuleDownloadManager getDownloadManager() {
        return (AuraPlayModuleDownloadManager) downloadManager$delegate.getValue();
    }

    private final Executor getExecutor() {
        return F0C.A06(executor$delegate);
    }

    private final Executor getPlayDownloaderExecutor() {
        return F0C.A06(playDownloaderExecutor$delegate);
    }

    public final C3302CDa getManager() {
        return (C3302CDa) manager$delegate.getValue();
    }
}
