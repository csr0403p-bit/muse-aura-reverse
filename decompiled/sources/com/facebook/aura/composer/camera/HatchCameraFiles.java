package com.facebook.aura.composer.camera;

import X.AGH;
import X.AbstractC3358CGz;
import X.AbstractC6540EDv;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.BXe;
import X.C3cG;
import X.C4JM;
import X.C6533EDj;
import X.C6537EDs;
import X.C6541EDw;
import X.C7384Etj;
import X.CD4;
import X.CDZ;
import X.CFK;
import X.CH0;
import X.ED8;
import X.EDB;
import X.EDD;
import X.EDP;
import X.EDQ;
import X.EDR;
import X.EDS;
import X.EDW;
import X.EDa;
import X.EE9;
import X.FGI;
import X.InterfaceC6536EDr;
import X.InterfaceC6544EDz;
import android.app.Application;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.bugreport.AuraBugReportSender;
import com.facebook.aura.model.HatchFileProviderUtil;
import java.io.File;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class HatchCameraFiles {
    public static final int $stable = 0;
    public static final HatchCameraFiles INSTANCE = new HatchCameraFiles();
    public static final HatchCameraFiles$cask$1 cask;
    public static final HatchCameraFiles$cleanup$1 cleanup;
    public static final Application context;
    public static final HatchCameraStorageDependencies dependencies;
    public static final EDR provider;

    public final synchronized void clear$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(String str) {
        C7384Etj.A0Y(str, 0);
        HatchCameraFiles$cask$1 hatchCameraFiles$cask$1 = cask;
        EDP edp = SC.temp_file_scoped;
        C7384Etj.A0V(edp);
        File withoutInit = hatchCameraFiles$cask$1.getWithoutInit(edp, new BXe(str), (C6537EDs) null);
        try {
            File[] fileArrListFiles = withoutInit.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    HatchCameraFiles hatchCameraFiles = INSTANCE;
                    C7384Etj.A0X(file);
                    hatchCameraFiles.revoke$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(file);
                }
            }
        } finally {
            EDR edr = provider;
            EDB.A00(edr.A01.getWithoutInit(edp.A00, new BXe(str), (C6537EDs) null));
            try {
                ED8 store = dependencies.getStore("tempfiles");
                String canonicalPath = withoutInit.getCanonicalPath();
                C7384Etj.A0U(canonicalPath);
                store.A00(canonicalPath);
            } catch (IOException e) {
                CFK.A0A("HatchCameraFiles", "Could not remove camera cleanup metadata", e);
            }
        }
    }

    public final synchronized File create$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(AbstractC3358CGz abstractC3358CGz) {
        EDS eds;
        C7384Etj.A0Y(abstractC3358CGz, 0);
        if (!AuraSessionManager.INSTANCE.isCurrentSession(abstractC3358CGz)) {
            throw C3cG.A0Q("Camera session has ended");
        }
        cleanup.requestCleanup();
        EDR edr = provider;
        EDP edp = SC.temp_file_scoped;
        C7384Etj.A0V(edp);
        BXe bXe = new BXe(((CH0) abstractC3358CGz).A01);
        String strA0M = FGI.A0M(AnonymousClass002.A0k(), AuraBugReportSender.DEFAULT_IMAGE_EXTENSION);
        int i = edp.A00;
        EDa eDa = edr.A01;
        InterfaceC6544EDz interfaceC6544EDz = edr.A00;
        String strA01 = AbstractC6540EDv.A01(i);
        if (strA01 == null || strA01.length() == 0) {
            throw C3cG.A0Q("Empty label");
        }
        C6533EDj c6533EDjAKs = interfaceC6544EDz.AKs(i);
        try {
            String canonicalPath = eDa.get(i, bXe, new C6537EDs(AGH.A05(C3cG.A0r("tempfiles", new EDQ((int) (c6533EDjAKs == null ? 0L : c6533EDjAKs.A00 / 86400)))))).getCanonicalPath();
            C7384Etj.A0X(canonicalPath);
            try {
                String path = new CD4(new CDZ(canonicalPath), new File(canonicalPath, strA0M), true).getPath();
                C7384Etj.A0U(path);
                eds = new EDS(path);
                if (eds.exists()) {
                    eds.setLastModified(System.currentTimeMillis());
                }
                if (!eds.createNewFile()) {
                    throw C3cG.A0Q("Could not create camera output");
                }
            } catch (IOException e) {
                throw new SecurityException(e);
            } catch (IllegalStateException e2) {
                throw new SecurityException(e2);
            }
        } catch (IOException e3) {
            throw BV4.A0d("Failed to create SecureFile", e3);
        }
        return eds;
    }

    public final void delete$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(File file) {
        C7384Etj.A0Y(file, 0);
        revoke$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(file);
        file.delete();
    }

    public final synchronized void evictExpired() {
        cleanup.requestCleanup();
    }

    public final synchronized File resolve$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(String str, String str2) {
        HatchCameraFiles$cask$1 hatchCameraFiles$cask$1;
        EDP edp;
        AnonymousClass003.A0u(str, str2);
        if (str2.length() <= 0 || !str2.equals(BV4.A0G(str2).getName())) {
            throw BV4.A0O();
        }
        hatchCameraFiles$cask$1 = cask;
        edp = SC.temp_file_scoped;
        C7384Etj.A0V(edp);
        return C3cG.A0O(hatchCameraFiles$cask$1.getWithoutInit(edp, new BXe(str), (C6537EDs) null), str2);
    }

    public final void revoke$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(File file) {
        C7384Etj.A0Y(file, 0);
        try {
            Application application = context;
            application.revokeUriPermission(HatchFileProviderUtil.INSTANCE.getUriForFile(application, file), 3);
        } catch (RuntimeException e) {
            CFK.A0A("HatchCameraFiles", "Could not revoke camera URI grant", e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.aura.composer.camera.HatchCameraFiles$cleanup$1] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.EDa, com.facebook.aura.composer.camera.HatchCameraFiles$cask$1] */
    static {
        final Application applicationA00 = C4JM.A00();
        context = applicationA00;
        final HatchCameraStorageDependencies hatchCameraStorageDependencies = new HatchCameraStorageDependencies(applicationA00);
        dependencies = hatchCameraStorageDependencies;
        cleanup = new EDD<HatchCameraStorageDependencies>(hatchCameraStorageDependencies) { // from class: com.facebook.aura.composer.camera.HatchCameraFiles$cleanup$1
            @Override // X.EDD
            public void onPathRequested(EDW edw, EDQ edq, File file) {
                AnonymousClass005.A0x(edw, edq, file);
                storeData(edw, edq, file);
            }

            @Override // X.EDD, X.InterfaceC6536EDr
            public /* bridge */ /* synthetic */ void onPathRequested(EDW edw, EE9 ee9, File file) {
                onPathRequested(edw, (EDQ) ee9, file);
            }
        };
        ?? r2 = new EDa(applicationA00) { // from class: com.facebook.aura.composer.camera.HatchCameraFiles$cask$1
            @Override // X.EDa, X.InterfaceC6539EDu
            public InterfaceC6536EDr<EE9> controllerForPlugin(final EE9 ee9) {
                C7384Etj.A0Y(ee9, 0);
                if (ee9 instanceof EDQ) {
                    return new InterfaceC6536EDr() { // from class: com.facebook.aura.composer.camera.HatchCameraFiles$cask$1$controllerForPlugin$1
                        @Override // X.InterfaceC6536EDr
                        public final void onPathRequested(EDW edw, EE9 ee92, File file) {
                            AnonymousClass003.A0v(edw, file);
                            HatchCameraFiles.cleanup.onPathRequested(edw, (EDQ) ee9, file);
                        }
                    };
                }
                return null;
            }
        };
        cask = r2;
        provider = new EDR(r2, new C6541EDw());
    }
}
