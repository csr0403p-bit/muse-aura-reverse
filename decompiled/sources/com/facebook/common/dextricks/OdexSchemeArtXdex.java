package com.facebook.common.dextricks;

import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.C8D;
import X.CBl;
import X.FGI;
import android.system.ErrnoException;
import android.system.Int64Ref;
import android.system.Os;
import android.system.StructStat;
import com.facebook.common.dextricks.DexManifest;
import java.io.File;
import java.io.FileDescriptor;
import java.util.List;

/* loaded from: classes5.dex */
public final class OdexSchemeArtXdex extends OdexSchemeArtTurbo {
    public static final long MIN_DISK_FREE_FOR_MIXED_MODE = 419430400;
    public static final String REGENERATE_SOFT_ERROR_CATEGORY = "OdexSchemeArtXdex_REGEN";
    public static final long STATE_DEX2OAT_CLASSPATH_SET = 2048;
    public static final long STATE_DEX2OAT_QUICKENING_NEEDED = 64;
    public static final long STATE_DEX2OAT_QUICK_ATTEMPTED = 512;
    public static final long STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED = 32768;
    public static final long STATE_DO_PERIODIC_PGO_COMP_FINISHED = 65536;
    public static final long STATE_DO_PERIODIC_PGO_COMP_NEEDED = 16384;
    public static final long STATE_MASK = 20720;
    public static final long STATE_MIXED_ATTEMPTED = 1024;
    public static final long STATE_MIXED_NEEDED = 128;
    public static final long STATE_OATMEAL_QUICKENING_NEEDED = 32;
    public static final long STATE_OATMEAL_QUICK_ATTEMPTED = 256;
    public static final long STATE_OPT_COMPLETED = 16;
    public static final long STATE_PGO_ATTEMPTED = 8192;
    public static final long STATE_PGO_NEEDED = 4096;
    public final DexManifest.Dex[] mDexes;
    public final boolean mIsLoadable;

    public static int A00(CBl cBl, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, int i) {
        int iSendfile = (int) Os.sendfile(fileDescriptor, fileDescriptor2, new Int64Ref(cBl.A00), i);
        if (iSendfile >= 0) {
            cBl.A00 = iSendfile;
        }
        return iSendfile;
    }

    public static boolean anyOptimizationDone(long j) {
        return AnonymousClass002.A1L(((j & STATE_MASK) > 0L ? 1 : ((j & STATE_MASK) == 0L ? 0 : -1)));
    }

    public static File getCannotTruncateDexFlagFile(File file) {
        return BV5.A0L(DexStoreUtils.IGNORE_DIRTY_CHECK_PREFIX, "cannot_trunc_dex.flg", file);
    }

    public static boolean getCannotTruncateDexesFlag(File file) {
        return BV5.A0L(DexStoreUtils.IGNORE_DIRTY_CHECK_PREFIX, "cannot_trunc_dex.flg", file).exists();
    }

    public static int getOdexFlags() {
        return 1;
    }

    private boolean needsTruncation(File file, int i) {
        return i >= 0 && !dexAppearsTruncated(file, i);
    }

    public static String oatNameFromDexName(String str) {
        if (str.contains(".")) {
            str = BV4.A0j(str, BV6.A0B(str));
        }
        return FGI.A0M(str, DexManifest.ODEX_EXT);
    }

    public static boolean optimizationCompleted(long j) {
        return AnonymousClass002.A1L(((j & 16) > 0L ? 1 : ((j & 16) == 0L ? 0 : -1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7 A[Catch: all -> 0x00ae, TRY_LEAVE, TryCatch #7 {all -> 0x00ae, blocks: (B:5:0x000d, B:7:0x0011, B:9:0x0015, B:10:0x001d, B:12:0x0024, B:14:0x0035, B:15:0x0037, B:17:0x003d, B:32:0x008c, B:33:0x00a6, B:24:0x0058, B:21:0x0047, B:23:0x004e, B:31:0x007d, B:28:0x006b, B:30:0x0072, B:34:0x00a7), top: B:54:0x000d, outer: #2, inners: #8, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void truncateWithBackup(java.io.File r10, java.io.File r11, int r12) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r9 = this;
            if (r12 < 0) goto Lc5
            com.facebook.common.dextricks.Fs.renameOrThrow(r10, r11)
            java.io.FileOutputStream r3 = X.BV4.A0I(r10)
            java.io.FileInputStream r4 = X.BV4.A0H(r11)     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = X.C8D.A01     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto La7
            boolean r0 = X.C8D.A00     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto La7
            java.io.FileDescriptor r11 = r3.getFD()     // Catch: java.lang.Throwable -> Lae
            java.io.FileDescriptor r10 = r4.getFD()     // Catch: java.lang.Throwable -> Lae
            int r0 = A03(r10)     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> L71 java.lang.Throwable -> Lae
            r9 = 0
            if (r0 < 0) goto L7d
            int r8 = java.lang.Math.min(r0, r12)     // Catch: java.lang.Throwable -> Lae
            r0 = 0
            X.CBl r5 = new X.CBl     // Catch: java.lang.Throwable -> Lae
            r5.<init>()     // Catch: java.lang.Throwable -> Lae
            r5.A00 = r0     // Catch: java.lang.Throwable -> Lae
            r7 = 0
            r2 = 0
        L33:
            if (r7 >= r8) goto L67
            int r0 = r8 - r7
            int r6 = A01(r5, r11, r10, r0)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L4d java.lang.Throwable -> Lae
            if (r6 < 0) goto L58
            int r7 = r7 + r6
            int r1 = r2 + 1
            r0 = 50
            if (r2 > r0) goto L8c
            r2 = r1
            goto L33
        L46:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> Lae
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lae
            goto La6
        L4d:
            r2 = move-exception
            java.lang.String r1 = "CopyUtils"
            java.lang.String r0 = "Failed to call send file for copy utils"
            android.util.Log.w(r1, r0, r2)     // Catch: java.lang.Throwable -> Lae
            X.C8D.A00 = r9     // Catch: java.lang.Throwable -> Lae
            r6 = -1
        L58:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lae
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = "Failed to send file. Ret: %d"
            java.io.IOException r1 = X.BV7.A0j(r0, r1)     // Catch: java.lang.Throwable -> Lae
            goto La6
        L67:
            if (r7 <= 0) goto La7
            goto Laa
        L6a:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> Lae
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lae
            goto La6
        L71:
            r2 = move-exception
            java.lang.String r1 = "CopyUtils"
            java.lang.String r0 = "Failed to call fstat st.size for copy utils"
            android.util.Log.w(r1, r0, r2)     // Catch: java.lang.Throwable -> Lae
            r0 = 0
            X.C8D.A00 = r0     // Catch: java.lang.Throwable -> Lae
            r0 = -1
        L7d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = "fstat st_size failed with value %d"
            java.io.IOException r1 = X.BV7.A0j(r0, r1)     // Catch: java.lang.Throwable -> Lae
            goto La6
        L8c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lae
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r2, r1, r0}     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = "Tried %d times to send file. Progress %d / %d sent: %d"
            java.io.IOException r1 = X.BV7.A0j(r0, r1)     // Catch: java.lang.Throwable -> Lae
        La6:
            throw r1     // Catch: java.lang.Throwable -> Lae
        La7:
            X.C8D.A00(r4, r3, r12)     // Catch: java.lang.Throwable -> Lae
        Laa:
            r4.close()     // Catch: java.lang.Throwable -> Lb8
            goto Lc2
        Lae:
            r1 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> Lb3
            goto Lb7
        Lb3:
            r0 = move-exception
            X.AbstractC7486Exp.A00(r1, r0)     // Catch: java.lang.Throwable -> Lb8
        Lb7:
            throw r1     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r1 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> Lbd
            throw r1
        Lbd:
            r0 = move-exception
            X.AbstractC7486Exp.A00(r1, r0)
            throw r1
        Lc2:
            r3.close()
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.truncateWithBackup(java.io.File, java.io.File, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x010d A[Catch: IOException -> 0x016e, TRY_LEAVE, TryCatch #1 {IOException -> 0x016e, blocks: (B:26:0x00fd, B:28:0x010d, B:31:0x0133, B:32:0x0150, B:29:0x0110), top: B:42:0x00fd, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0150 A[Catch: IOException -> 0x016e, TRY_LEAVE, TryCatch #1 {IOException -> 0x016e, blocks: (B:26:0x00fd, B:28:0x010d, B:31:0x0133, B:32:0x0150, B:29:0x0110), top: B:42:0x00fd, inners: #0 }] */
    @Override // com.facebook.common.dextricks.OdexSchemeArtTurbo, com.facebook.common.dextricks.OdexScheme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void configureClassLoader(java.io.File r25, com.facebook.common.dextricks.ClassLoaderConfiguration r26) throws java.lang.IllegalAccessException, java.lang.InterruptedException, java.io.IOException, java.lang.IllegalArgumentException, com.facebook.common.dextricks.DexStore.RecoverableDexException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.configureClassLoader(java.io.File, com.facebook.common.dextricks.ClassLoaderConfiguration):void");
    }

    @Override // com.facebook.common.dextricks.OdexSchemeArtTurbo, com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeArtXdex";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if ((r14 & 1024) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r6 = 1024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if ((r14 & 4096) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if ((r14 & 8192) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        r6 = r6 | 32768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if ((r14 & 1024) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        r6 = r6 | 8192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if ((r14 & 8192) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        r6 = r6 | 65536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if ((r14 & 2048) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        r6 = r6 | 16384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if ((r14 & 16384) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if ((r14 & 65536) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if ((r14 & com.facebook.common.dextricks.OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        r6 = 131072 | r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        if ((r14 & com.facebook.common.dextricks.OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        return r6 | 262144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if ((r14 & 128) != 0) goto L13;
     */
    @Override // com.facebook.common.dextricks.OdexScheme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int loadInformationalStatus(java.io.File r13, long r14) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.loadInformationalStatus(java.io.File, long):int");
    }

    public OdexSchemeArtXdex(DexManifest.Dex[] dexArr, long j) {
        super(1, OdexSchemeArtTurbo.makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, j)));
        this.mDexes = dexArr;
        this.mIsLoadable = AnonymousClass002.A1L(((j & STATE_MASK) > 0L ? 1 : ((j & STATE_MASK) == 0L ? 0 : -1)));
    }

    public static int A02(FileDescriptor fileDescriptor) throws ErrnoException {
        StructStat structStatFstat = Os.fstat(fileDescriptor);
        boolean z = C8D.A00;
        if (structStatFstat == null) {
            return -1;
        }
        return (int) structStatFstat.st_size;
    }

    public static boolean dexAppearsTruncated(File file, int i) {
        return BV7.A1R((file.length() > i ? 1 : (file.length() == i ? 0 : -1)));
    }

    private int getTruncatedSize(DexStore dexStore) {
        return dexStore.readConfig().artTruncatedDexSize;
    }

    public static List<ExpectedFileInfo> makeExpectedFileInfoList(DexManifest.Dex[] dexArr, long j) {
        boolean zAnyOptimizationDone = anyOptimizationDone(j);
        List<ExpectedFileInfo> listMakeExpectedFileInfoList = OdexSchemeArtTurbo.makeExpectedFileInfoList(dexArr, null);
        Mlog.i("makeExpectedFile: are oat around: %s expected files: %s", Boolean.valueOf(zAnyOptimizationDone), listMakeExpectedFileInfoList.toString());
        if (zAnyOptimizationDone) {
            listMakeExpectedFileInfoList.add(new ExpectedFileInfo(OdexSchemeArtTurbo.OREO_ODEX_DIR));
        }
        Mlog.i("makeExpectedFile: RETURN expected files: %s", listMakeExpectedFileInfoList.toString());
        return listMakeExpectedFileInfoList;
    }

    public static String[] makeExpectedFileList(DexManifest.Dex[] dexArr, long j) {
        return OdexSchemeArtTurbo.makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, j));
    }

    private boolean shouldTruncateDexesNow(File file, File file2, long j, int i) {
        if (needsTruncation(file2, i) && optimizationCompleted(j)) {
            return !getCannotTruncateDexesFlag(file);
        }
        return false;
    }

    public static boolean isOatFileStillValid(File file, long j, long j2) {
        return true;
    }
}
