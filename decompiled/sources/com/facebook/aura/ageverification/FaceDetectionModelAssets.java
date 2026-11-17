package com.facebook.aura.ageverification;

import X.A6B;
import X.AbstractC0875AGb;
import X.BY3;
import X.C03;
import X.C3298CCu;
import X.C3299CCv;
import X.C3301CCy;
import X.C3cG;
import X.C7384Etj;
import X.C7591F5e;
import X.C79;
import X.C7BY;
import X.CCn;
import X.CCw;
import X.CD3;
import X.CDH;
import X.CDI;
import X.CFK;
import X.FGI;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.loader.AssetsProvider;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes5.dex */
public final class FaceDetectionModelAssets {
    public static final int $stable = 0;
    public static final FaceDetectionModelAssets INSTANCE = new FaceDetectionModelAssets();
    public static volatile boolean installed;

    public final class UnpackedAssetsProvider implements AssetsProvider {
        public final File root;

        public UnpackedAssetsProvider(File file) {
            C7384Etj.A0Y(file, 0);
            this.root = file;
        }

        @Override // android.content.res.loader.AssetsProvider
        public AssetFileDescriptor loadAssetFd(String str, int i) throws IOException {
            C7384Etj.A0Y(str, 0);
            File fileFindAsset = FaceDetectionModelAssets.INSTANCE.findAsset(this.root, str);
            if (fileFindAsset == null) {
                return null;
            }
            try {
                return new AssetFileDescriptor(ParcelFileDescriptor.open(fileFindAsset, 268435456), 0L, -1L);
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
    }

    private final synchronized boolean install(Context context) {
        boolean z = true;
        if (!installed) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    C3301CCy c3301CCyA00 = C3301CCy.A05.A00(context, C3298CCu.A00(context), C3299CCv.A00(context, CCw.A01));
                    Context context2 = c3301CCyA00.A00;
                    File file = CD3.A00(context2, FaceDetectionModuleKt.FACE_DETECTION_MODULE).A01;
                    if (file == null) {
                        if (C03.A00(context2)) {
                            BY3 by3A01 = CCn.A01(FaceDetectionModuleKt.FACE_DETECTION_MODULE);
                            BY3 by3 = BY3.A03;
                            if (by3A01 == by3) {
                                if (CCn.A01(FaceDetectionModuleKt.FACE_DETECTION_MODULE) != by3 || CDI.A01(CDH.A04.A00().A00, C79.A00, FaceDetectionModuleKt.FACE_DETECTION_MODULE) == null) {
                                    CFK.A0H("VoltronModuleManager", "Hash not found for module %s", FaceDetectionModuleKt.FACE_DETECTION_MODULE);
                                } else {
                                    file = c3301CCyA00.A01.A02(context2, FaceDetectionModuleKt.FACE_DETECTION_MODULE).A01;
                                    if (file != null) {
                                    }
                                }
                            }
                        }
                    }
                    if (file.exists()) {
                        File fileA0O = C3cG.A0O(c3301CCyA00.A01.A01(FaceDetectionModuleKt.FACE_DETECTION_MODULE), FaceDetectionModelAssetsKt.EXTRACTED_DIR);
                        unpackModels(context, file, C3cG.A0O(fileA0O, FaceDetectionModelAssetsKt.MODELS_DIR));
                        addToAssets(context, fileA0O);
                        installed = true;
                    }
                } catch (IOException e) {
                    CFK.A0A(FaceDetectionModelAssetsKt.TAG, "Failed to install the models from mlkit_face_detection", e);
                    z = false;
                    return z;
                } catch (RuntimeException e2) {
                    CFK.A0A(FaceDetectionModelAssetsKt.TAG, "Failed to install the models from mlkit_face_detection", e2);
                    z = false;
                    return z;
                }
            }
            return false;
        }
        return z;
    }

    public final boolean ensureAvailable(Context context) {
        C7384Etj.A0Y(context, 0);
        return hasEngineModels(context) || (install(context) && hasEngineModels(context));
    }

    private final void addToAssets(Context context, File file) {
        ResourcesLoader resourcesLoader = new ResourcesLoader();
        resourcesLoader.addProvider(ResourcesProvider.empty(new UnpackedAssetsProvider(file)));
        context.getResources().addLoaders(resourcesLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File findAsset(File file, String str) throws IOException {
        File fileA0O = C3cG.A0O(file, C7BY.A0K(FaceDetectionModelAssetsKt.ASSETS_DIR, str));
        if (fileA0O.isFile()) {
            String canonicalPath = fileA0O.getCanonicalPath();
            C7384Etj.A0U(canonicalPath);
            if (canonicalPath.startsWith(FGI.A0M(file.getCanonicalPath(), File.separator))) {
                return fileA0O;
            }
        }
        return null;
    }

    private final List<String> modelNames(File file) throws IOException {
        ZipFile zipFile = new ZipFile(file);
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            C7384Etj.A0U(enumerationEntries);
            List<String> listA02 = A6B.A02(A6B.A03(FaceDetectionModelAssets$modelNames$1$4.INSTANCE, A6B.A08(new FaceDetectionModelAssets$modelNames$1$3("assets/mlkit_face_detection/models_bundled/"), A6B.A03(new FaceDetectionModelAssets$modelNames$1$2("assets/mlkit_face_detection/models_bundled/"), A6B.A08(FaceDetectionModelAssets$modelNames$1$1.INSTANCE, AbstractC0875AGb.A09(new C7591F5e(enumerationEntries)))))));
            zipFile.close();
            return listA02;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x026b, code lost:
    
        if (r11 != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x026e, code lost:
    
        r12 = r12.getParentFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0273, code lost:
    
        r13 = r12.listFiles();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0277, code lost:
    
        if (r13 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0279, code lost:
    
        r12 = r13.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x027d, code lost:
    
        X.CFK.A0H("AppUnpacker", "File in parent directory after: %s", r13[r11].getName());
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x028f, code lost:
    
        X.CFK.A06("AppUnpacker", "The folder is empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0294, code lost:
    
        r11 = r10.toString();
        X.CFK.A04("AppUnpacker", X.FGI.A0d(r11, ", stack: ", android.util.Log.getStackTraceString(r14), " end of stack.\n"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02a9, code lost:
    
        if (r3 != 1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02af, code lost:
    
        if (r0.mkdirs() != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02bd, code lost:
    
        r3 = 1;
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02bf, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02cd, code lost:
    
        if (r0.mkdirs() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02d3, code lost:
    
        if (r0.isDirectory() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02db, code lost:
    
        throw X.BV4.A0K("Could not create the destination directory");
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02dc, code lost:
    
        r6.A03.execute(new X.RunnableC3295CCj(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02fe, code lost:
    
        X.CCi.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0301, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:?, code lost:
    
        throw new java.io.IOException("Interrupted while retrying directory creation", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:?, code lost:
    
        throw new java.io.FileNotFoundException(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:?, code lost:
    
        throw new java.io.FileNotFoundException(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0100, code lost:
    
        X.CCi.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0107, code lost:
    
        if (r0.mkdirs() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010d, code lost:
    
        if (r0.isDirectory() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0111, code lost:
    
        java.lang.Thread.sleep(100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0116, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0117, code lost:
    
        X.BV4.A1A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0123, code lost:
    
        r13 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012c, code lost:
    
        if (r13 >= r0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
    
        r12 = r4[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0130, code lost:
    
        r14 = (X.C3296CCo) r12;
        r0 = r14.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013f, code lost:
    
        if (r0.exists() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0141, code lost:
    
        r10 = new java.util.zip.ZipFile(r0);
        r11 = r14.A01;
        r9 = r10.getEntry(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014c, code lost:
    
        if (r9 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014e, code lost:
    
        r9 = r10.getInputStream(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0152, code lost:
    
        if (r9 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0154, code lost:
    
        r11 = new X.C3203C3d(r14, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0159, code lost:
    
        r0 = r12.A00;
        X.C1H.A00(r0);
        r16 = X.BV4.A0I(r0);
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
    
        r15 = r11.read(r0, 0, java.lang.Math.min(Integer.MAX_VALUE - r10, 16384));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0175, code lost:
    
        if (r15 == (-1)) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0177, code lost:
    
        r16.write(r0, 0, r15);
        r10 = r10 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017f, code lost:
    
        if (r10 >= Integer.MAX_VALUE) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0182, code lost:
    
        r16.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0185, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018a, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        r16.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x018f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0190, code lost:
    
        java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0193, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0194, code lost:
    
        r16 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0195, code lost:
    
        r10 = r16.getMessage();
        X.C1H.A00(r10);
        r13 = X.FGI.A0M(", ", X.C2F.A00(r12));
        r14 = X.FGI.A0d(", unpacker failed to unpack ", r12.A02, " to ", r12.A01);
        r0 = r12.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b4, code lost:
    
        if (r0 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b6, code lost:
    
        r0 = X.FGI.A0M(" at ", r0.getCanonicalPath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
    
        r12 = X.FGI.A0d(r10, r13, r14, r0);
        X.CFK.A04("AppUnpacker", X.FGI.A0d(r12, ", stack: ", android.util.Log.getStackTraceString(r16), " end of stack.\n"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d8, code lost:
    
        throw new java.io.FileNotFoundException(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d9, code lost:
    
        r0 = " with no destination file";
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01dc, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01dd, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e1, code lost:
    
        r9 = X.BV4.A0K(X.FGI.A0d("Failed to get input stream for ", r11, " from Voltron module ", r0.getCanonicalPath()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01f2, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0205, code lost:
    
        r9 = new java.io.FileNotFoundException(X.FGI.A0M("Voltron module does not exist: ", r0.getCanonicalPath()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0215, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0216, code lost:
    
        java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x021a, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x021b, code lost:
    
        r0 = r14.getMessage();
        X.C1H.A00(r0);
        r10 = X.C60O.A0x(r0);
        r9 = X.C60O.A0w();
        r9.append(", directory path: ");
        r9.append(r0.getCanonicalPath());
        r9.append(" exists: ");
        r9.append(r0.exists());
        r10.append(X.C60P.A1O(", retry count: ", r9, r3));
        r12 = r0.getParentFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x024f, code lost:
    
        if (r12 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0251, code lost:
    
        r11 = r12.exists();
        r0 = r12.getCanonicalPath();
        r9 = X.C3cG.A0g(", parent directory path: ");
        r9.append(r0);
        r10.append(X.C60P.A1P(" exists: ", r9, r11));
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void unpackModels(android.content.Context r23, java.io.File r24, java.io.File r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.FaceDetectionModelAssets.unpackModels(android.content.Context, java.io.File, java.io.File):void");
    }

    private final boolean hasEngineModels(Context context) throws IOException {
        try {
            context.getAssets().open(FaceDetectionModelAssetsKt.ENGINE_MODEL_ASSET).close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
