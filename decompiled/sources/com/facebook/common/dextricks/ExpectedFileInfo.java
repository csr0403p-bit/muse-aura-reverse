package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BV4;
import X.C3cG;
import X.C60O;
import com.facebook.aura.library.repo.UnifiedArtifactsRepositoryKt;
import com.facebook.common.dextricks.DexManifest;
import java.io.File;

/* loaded from: classes5.dex */
public class ExpectedFileInfo {
    public final boolean coldstart;
    public final DexManifest.Dex dex;
    public final File dexFile;
    public final String dexName;
    public final boolean extended;
    public CompilationType mCompType;
    public boolean mIsOptional;
    public final int ordinal;
    public final boolean primary;
    public final String rawFile;
    public final boolean scroll;

    public enum CompilationType {
        ALL(UnifiedArtifactsRepositoryKt.COLLECTION_ALL),
        PGO("pgo"),
        NONE("none"),
        UNKNOWN("unknown");

        public final String mFriendlyName;

        public String getFriendlyName() {
            return this.mFriendlyName;
        }

        CompilationType(String str) {
            this.mFriendlyName = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return getFriendlyName();
        }
    }

    public ExpectedFileInfo(String str) {
        this(null, null, null, str, CompilationType.NONE);
    }

    public static ExpectedFileInfo[] convertTo(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        ExpectedFileInfo[] expectedFileInfoArr = new ExpectedFileInfo[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            expectedFileInfoArr[i] = str != null ? new ExpectedFileInfo(str) : null;
        }
        return expectedFileInfoArr;
    }

    public static CompilationType checkIsValidCompType(CompilationType compilationType) {
        if (compilationType != null) {
            return compilationType;
        }
        Mlog.w("Comp type cannot be null defaulting to unknown", BV4.A1W());
        return CompilationType.UNKNOWN;
    }

    public static ExpectedFileInfo makeOdexFromName(String str) {
        return new ExpectedFileInfo(str);
    }

    public DexManifest.Dex getDex() {
        return this.dex;
    }

    public boolean isNonRootDex() {
        return (this.dex == null || this.dexFile == null) ? false : true;
    }

    public boolean isOptional() {
        return this.mIsOptional;
    }

    public boolean isRawFile() {
        return AnonymousClass002.A1X(this.rawFile);
    }

    public boolean isRootDex() {
        return (this.dex == null || this.dexName == null) ? false : true;
    }

    public String toExpectedFileString() {
        if (AnonymousClass002.A1X(this.rawFile)) {
            return this.rawFile;
        }
        if (isRootDex()) {
            return this.dexName;
        }
        throw C3cG.A0Q("Cannot generated an expected string");
    }

    public String toString() {
        String str;
        String path;
        StringBuilder sbA0x = C60O.A0x("[Expected File Info: ");
        if (!AnonymousClass002.A1X(this.rawFile)) {
            if (isRootDex()) {
                sbA0x.append("Dex Name: ");
                path = this.dexName;
            } else if (isNonRootDex()) {
                sbA0x.append("Dex File: ");
                File file = this.dexFile;
                file.getClass();
                path = file.getPath();
            } else {
                str = "ERROR!";
            }
            sbA0x.append(path);
            sbA0x.append("Compilation Type: ");
            sbA0x.append(this.mCompType);
            return AnonymousClass001.A0v(" ]", sbA0x);
        }
        sbA0x.append("Raw File: ");
        str = this.rawFile;
        sbA0x.append(str);
        return AnonymousClass001.A0v(" ]", sbA0x);
    }

    public ExpectedFileInfo setIsOptional(boolean z) {
        this.mIsOptional = z;
        return this;
    }

    public ExpectedFileInfo(DexManifest.Dex dex, String str, CompilationType compilationType) {
        this(dex, str, null, null, compilationType);
    }

    public static String[] convertTo(ExpectedFileInfo[] expectedFileInfoArr) {
        String expectedFileString;
        if (expectedFileInfoArr == null) {
            return null;
        }
        int length = expectedFileInfoArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            ExpectedFileInfo expectedFileInfo = expectedFileInfoArr[i];
            if (expectedFileInfo != null) {
                expectedFileString = expectedFileInfo.toExpectedFileString();
            } else {
                expectedFileString = null;
            }
            strArr[i] = expectedFileString;
        }
        return strArr;
    }

    public ExpectedFileInfo setIsOptional() {
        this.mIsOptional = true;
        return this;
    }

    public ExpectedFileInfo(DexManifest.Dex dex, String str, File file, String str2, CompilationType compilationType, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.dex = dex;
        this.dexName = str;
        this.dexFile = file;
        this.rawFile = str2;
        this.mCompType = checkIsValidCompType(compilationType);
        this.ordinal = i;
        this.primary = z;
        this.coldstart = z2;
        this.extended = z3;
        this.scroll = z4;
        this.mIsOptional = z5;
    }

    public ExpectedFileInfo(DexManifest.Dex dex, String str, File file, String str2, CompilationType compilationType) {
        this(dex, str, file, str2, compilationType, -1, false, false, false, false, false);
    }

    public ExpectedFileInfo(DexManifest.Dex dex, String str) {
        this(dex, str, CompilationType.UNKNOWN);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExpectedFileInfo(DexManifest.Dex dex, CompilationType compilationType) {
        String strMakeDexName;
        if (dex != null) {
            strMakeDexName = dex.makeDexName();
        } else {
            strMakeDexName = null;
        }
        this(dex, strMakeDexName, compilationType);
    }

    public ExpectedFileInfo(DexManifest.Dex dex) {
        this(dex, CompilationType.UNKNOWN);
    }
}
