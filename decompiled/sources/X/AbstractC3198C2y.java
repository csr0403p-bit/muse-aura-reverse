package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.util.Log;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.common.build.BuildConstants;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.C2y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3198C2y extends C3H {
    public String[] A00;
    public final Context A01;
    public final boolean A02;

    public AbstractC3198C2y(Context context) {
        super(BV4.A0G(FGI.A0U(context.getApplicationInfo().dataDir, CustomConnectorRegisterRepositoryKt.ROOT_PATH, "lib-main")), 1);
        this.A01 = context;
        this.A02 = false;
    }

    private void A01(byte[] bArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        RandomAccessFile randomAccessFileA0M = BV4.A0M(C3cG.A0O(super.A01, "dso_deps"));
        try {
            randomAccessFileA0M.write(bArr);
            randomAccessFileA0M.setLength(randomAccessFileA0M.getFilePointer());
            randomAccessFileA0M.close();
        } catch (Throwable th) {
            try {
                randomAccessFileA0M.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    private final C2x A09() {
        if (this instanceof C3206C3h) {
            return new C3207C3i((C3206C3h) this);
        }
        if (this instanceof C3Y) {
            C3Y c3y = (C3Y) this;
            return new C3Z(c3y, c3y);
        }
        if (!(this instanceof C38)) {
            return new C3W((C3X) this);
        }
        C38 c38 = (C38) this;
        return new C36(c38, c38);
    }

    private final byte[] A0A() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Parcel parcelObtain;
        byte[] bArrMarshall;
        Parcel parcelObtain2;
        String str;
        if (this instanceof C3206C3h) {
            str = ((C3206C3h) this).A03;
        } else {
            if (!(this instanceof C3s)) {
                if (this instanceof C3X) {
                    C3X c3x = (C3X) this;
                    parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain2.writeByte((byte) 3);
                        Context context = ((AbstractC3198C2y) c3x).A01;
                        PackageManager packageManager = context.getPackageManager();
                        int i = 0;
                        if (packageManager != null) {
                            try {
                                i = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                            }
                        }
                        parcelObtain2.writeInt(i);
                        ArrayList<C3Y> arrayList = c3x.A01;
                        parcelObtain2.writeInt(arrayList.size());
                        Iterator<C3Y> it = arrayList.iterator();
                        while (it.hasNext()) {
                            parcelObtain2.writeByteArray(it.next().A0A());
                        }
                        String str2 = context.getApplicationInfo().sourceDir;
                        if (str2 == null) {
                            parcelObtain2.writeByte((byte) 1);
                            bArrMarshall = parcelObtain2.marshall();
                        } else {
                            File canonicalFile = BV4.A0G(str2).getCanonicalFile();
                            if (canonicalFile.exists()) {
                                parcelObtain2.writeByte((byte) 2);
                                parcelObtain2.writeString(canonicalFile.getPath());
                                parcelObtain2.writeLong(canonicalFile.lastModified());
                                bArrMarshall = parcelObtain2.marshall();
                            } else {
                                parcelObtain2.writeByte((byte) 1);
                                bArrMarshall = parcelObtain2.marshall();
                            }
                        }
                    } finally {
                    }
                } else {
                    parcelObtain = Parcel.obtain();
                    C2x c2xA09 = A09();
                    try {
                        C30[] c30ArrA01 = c2xA09.A01();
                        parcelObtain.writeInt(c30ArrA01.length);
                        for (C30 c30 : c30ArrA01) {
                            parcelObtain.writeString(c30.A01);
                            parcelObtain.writeString(c30.A00);
                        }
                        c2xA09.close();
                        bArrMarshall = parcelObtain.marshall();
                    } catch (Throwable th) {
                        try {
                            c2xA09.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                }
                parcelObtain.recycle();
                return bArrMarshall;
            }
            str = ((C3s) this).A00;
        }
        parcelObtain2 = Parcel.obtain();
        try {
            BuildConstants.A01();
            BuildConstants.A01();
            BuildConstants.A01();
            parcelObtain2.writeLong(1114131228L);
            parcelObtain2.writeString(str);
            return parcelObtain2.marshall();
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0274 A[Catch: all -> 0x02c3, TryCatch #1 {all -> 0x02c3, blocks: (B:15:0x004d, B:17:0x005a, B:19:0x0060, B:20:0x006c, B:21:0x006d, B:24:0x0082, B:25:0x0088, B:32:0x00b3, B:34:0x00ba, B:43:0x00f3, B:127:0x0254, B:129:0x025f, B:58:0x011c, B:61:0x012b, B:66:0x013f, B:67:0x0142, B:68:0x0145, B:131:0x026f, B:133:0x0274, B:134:0x0277, B:136:0x0282, B:137:0x0295, B:63:0x0137, B:126:0x024f, B:48:0x0100, B:53:0x010d, B:52:0x010a, B:55:0x010f, B:124:0x0249, B:47:0x00fb, B:35:0x00bf, B:37:0x00c9, B:39:0x00cf, B:41:0x00de), top: B:161:0x004d, outer: #0, inners: #10, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0282 A[Catch: all -> 0x02c3, TryCatch #1 {all -> 0x02c3, blocks: (B:15:0x004d, B:17:0x005a, B:19:0x0060, B:20:0x006c, B:21:0x006d, B:24:0x0082, B:25:0x0088, B:32:0x00b3, B:34:0x00ba, B:43:0x00f3, B:127:0x0254, B:129:0x025f, B:58:0x011c, B:61:0x012b, B:66:0x013f, B:67:0x0142, B:68:0x0145, B:131:0x026f, B:133:0x0274, B:134:0x0277, B:136:0x0282, B:137:0x0295, B:63:0x0137, B:126:0x024f, B:48:0x0100, B:53:0x010d, B:52:0x010a, B:55:0x010f, B:124:0x0249, B:47:0x00fb, B:35:0x00bf, B:37:0x00c9, B:39:0x00cf, B:41:0x00de), top: B:161:0x004d, outer: #0, inners: #10, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0295 A[Catch: all -> 0x02c3, TRY_LEAVE, TryCatch #1 {all -> 0x02c3, blocks: (B:15:0x004d, B:17:0x005a, B:19:0x0060, B:20:0x006c, B:21:0x006d, B:24:0x0082, B:25:0x0088, B:32:0x00b3, B:34:0x00ba, B:43:0x00f3, B:127:0x0254, B:129:0x025f, B:58:0x011c, B:61:0x012b, B:66:0x013f, B:67:0x0142, B:68:0x0145, B:131:0x026f, B:133:0x0274, B:134:0x0277, B:136:0x0282, B:137:0x0295, B:63:0x0137, B:126:0x024f, B:48:0x0100, B:53:0x010d, B:52:0x010a, B:55:0x010f, B:124:0x0249, B:47:0x00fb, B:35:0x00bf, B:37:0x00c9, B:39:0x00cf, B:41:0x00de), top: B:161:0x004d, outer: #0, inners: #10, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2 A[PHI: r1
  0x00f2: PHI (r1v37 java.lang.StringBuilder) = (r1v39 java.lang.StringBuilder), (r1v40 java.lang.StringBuilder), (r1v41 java.lang.StringBuilder) binds: [B:36:0x00c7, B:41:0x00de, B:38:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0114 A[PHI: r1
  0x0114: PHI (r1v5 'e' ??) = (r1v0 'e' ??), (r1v28 'e' ??), (r1v30 'e' ??), (r1v31 'e' ??) binds: [B:23:0x0080, B:55:0x010f, B:48:0x0100, B:33:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137 A[Catch: all -> 0x02c3, TRY_ENTER, TryCatch #1 {all -> 0x02c3, blocks: (B:15:0x004d, B:17:0x005a, B:19:0x0060, B:20:0x006c, B:21:0x006d, B:24:0x0082, B:25:0x0088, B:32:0x00b3, B:34:0x00ba, B:43:0x00f3, B:127:0x0254, B:129:0x025f, B:58:0x011c, B:61:0x012b, B:66:0x013f, B:67:0x0142, B:68:0x0145, B:131:0x026f, B:133:0x0274, B:134:0x0277, B:136:0x0282, B:137:0x0295, B:63:0x0137, B:126:0x024f, B:48:0x0100, B:53:0x010d, B:52:0x010a, B:55:0x010f, B:124:0x0249, B:47:0x00fb, B:35:0x00bf, B:37:0x00c9, B:39:0x00cf, B:41:0x00de), top: B:161:0x004d, outer: #0, inners: #10, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d A[Catch: all -> 0x0248, TryCatch #6 {all -> 0x0248, blocks: (B:62:0x012f, B:69:0x0149, B:71:0x014d, B:73:0x0158, B:74:0x015f, B:75:0x0165, B:78:0x016f, B:80:0x0195, B:81:0x01a1, B:86:0x01c7, B:92:0x01d7, B:91:0x01d4, B:121:0x0242, B:122:0x0247, B:93:0x01d8, B:95:0x01dc, B:96:0x01e4, B:98:0x01e8, B:100:0x01f5, B:110:0x0212, B:111:0x021d, B:113:0x0223, B:115:0x0233, B:119:0x023d, B:114:0x022e, B:117:0x0238), top: B:167:0x012f, outer: #11, inners: #5, #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d8 A[Catch: all -> 0x0248, TRY_ENTER, TryCatch #6 {all -> 0x0248, blocks: (B:62:0x012f, B:69:0x0149, B:71:0x014d, B:73:0x0158, B:74:0x015f, B:75:0x0165, B:78:0x016f, B:80:0x0195, B:81:0x01a1, B:86:0x01c7, B:92:0x01d7, B:91:0x01d4, B:121:0x0242, B:122:0x0247, B:93:0x01d8, B:95:0x01dc, B:96:0x01e4, B:98:0x01e8, B:100:0x01f5, B:110:0x0212, B:111:0x021d, B:113:0x0223, B:115:0x0233, B:119:0x023d, B:114:0x022e, B:117:0x0238), top: B:167:0x012f, outer: #11, inners: #5, #14, #16 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.C2x, X.C3Z] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.RandomAccessFile] */
    @Override // X.C3g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A08(int r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC3198C2y.A08(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.C2x] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.C2x] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final C30[] A0B() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C30[] c30ArrA01;
        ?? r0 = this instanceof C3X;
        try {
            if (r0 != 0) {
                C3Y c3y = (C3Y) BV6.A0m(((C3X) this).A01);
                C3Z c3z = new C3Z(c3y, c3y);
                c30ArrA01 = c3z.A01();
                r0 = c3z;
            } else {
                C2x c2xA09 = A09();
                c30ArrA01 = c2xA09.A01();
                r0 = c2xA09;
            }
            r0.close();
            return c30ArrA01;
        } catch (Throwable th) {
            try {
                r0.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public static void A00(File file, byte b, boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        try {
            RandomAccessFile randomAccessFileA0M = BV4.A0M(file);
            try {
                randomAccessFileA0M.seek(0L);
                randomAccessFileA0M.write(b);
                randomAccessFileA0M.setLength(randomAccessFileA0M.getFilePointer());
                if (z) {
                    randomAccessFileA0M.getFD().sync();
                }
                randomAccessFileA0M.close();
            } finally {
            }
        } catch (SyncFailedException e) {
            Log.w("fb-UnpackingSoSource", "state file sync failed", e);
        }
    }

    private void A02(C30[] c30Arr) throws IOException {
        HashSet hashSetA13 = C60O.A13();
        for (C30 c30 : c30Arr) {
            hashSetA13.add(c30.A01);
        }
        C3199C2z c3199C2z = new C3199C2z(this, hashSetA13);
        File file = super.A01;
        File[] fileArrListFiles = file.listFiles(c3199C2z);
        if (fileArrListFiles == null) {
            throw BV8.A0j(file, "unable to list directory ");
        }
        for (File file2 : fileArrListFiles) {
            C35.A01("fb-UnpackingSoSource", AnonymousClass007.A0a("Deleting ", file2));
            C2D.A03(file2);
        }
    }

    public AbstractC3198C2y(Context context, File file, boolean z, boolean z2) {
        super(file, z ? 1 : 0);
        this.A01 = context;
        this.A02 = z2;
    }
}
