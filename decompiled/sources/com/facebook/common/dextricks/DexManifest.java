package com.facebook.common.dextricks;

import X.BV5;
import X.BV6;
import X.C3cG;
import X.EnumC2380BWu;
import X.FGI;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class DexManifest {
    public static final String DEX_EXT = ".dex";
    public static final String ODEX_EXT = ".odex";
    public final Dex[] dexes;
    public final String id;
    public final boolean isArtMainStore;
    public final boolean isExoPackage;
    public final boolean locators;
    public final String[] requires;
    public final boolean rootRelative;
    public final EnumC2380BWu superpackExtension;
    public final int superpackFiles;

    public final class Dex {
        public final String assetName;
        public final String canaryClass;
        public final String hash;

        public String makeDexName() {
            return DexManifest.makeCompileUnitNameFromHashAndExtension(this.hash, DexManifest.DEX_EXT);
        }

        public String makeOdexName() {
            return DexManifest.makeCompileUnitNameFromHashAndExtension(this.hash, DexManifest.ODEX_EXT);
        }

        public String toString() {
            return String.format("<Dex assetName:[%s]>", this.assetName);
        }

        public Dex(String str, String str2, String str3) {
            this.assetName = str;
            this.hash = str2;
            this.canaryClass = str3;
        }
    }

    private boolean isUncompressedDex() {
        Dex[] dexArr = this.dexes;
        if (dexArr.length != 0) {
            return dexArr[0].assetName.endsWith(DEX_EXT);
        }
        return false;
    }

    public static String makeCompileUnitNameFromHashAndExtension(String str, String str2) {
        if (!str2.startsWith(".")) {
            str2 = FGI.A0M(".", str2);
        }
        return FGI.A0U("prog-", str, str2);
    }

    public static String makeDexNameFromHash(String str) {
        return makeCompileUnitNameFromHashAndExtension(str, DEX_EXT);
    }

    public static String makeOdexNameFromHash(String str) {
        return makeCompileUnitNameFromHashAndExtension(str, ODEX_EXT);
    }

    private void preloadDexClass() {
        Mlog.w("Preloading class %s", Dex.class.getName());
    }

    public boolean canLoadCanaryClass() throws ClassNotFoundException {
        if (this.isArtMainStore) {
            BV6.A1F("Art main store, not checking canary class");
            return true;
        }
        Dex[] dexArr = this.dexes;
        if (dexArr.length == 0) {
            return false;
        }
        String str = dexArr[0].canaryClass;
        try {
            Mlog.v("attempting to detect built-in ART multidex by classloading %s", str);
            Class.forName(this.dexes[0].canaryClass);
            Mlog.i("ART native multi-dex in use: found %s", str);
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            Mlog.i("ART multi-dex not in use: cannot load %s", str);
            return false;
        }
    }

    public boolean isArtMainStore() {
        return this.isArtMainStore;
    }

    public boolean isUncompressedExo() {
        return this.isExoPackage && isUncompressedDex();
    }

    public void verifyCanaryClasses() throws ClassNotFoundException {
        int i = 0;
        if (this.isArtMainStore) {
            BV6.A1F("Art main store, not verifying canary class");
            return;
        }
        while (true) {
            Dex[] dexArr = this.dexes;
            if (i >= dexArr.length) {
                return;
            }
            Class.forName(dexArr[i].canaryClass);
            i++;
        }
    }

    public DexManifest(boolean z) {
        this.dexes = new Dex[0];
        this.rootRelative = false;
        this.locators = false;
        this.superpackFiles = 0;
        this.superpackExtension = EnumC2380BWu.NONE;
        this.id = DexStoreUtils.MAIN_DEX_STORE_ID;
        this.requires = new String[0];
        this.isArtMainStore = true;
        this.isExoPackage = z;
    }

    public static DexManifest loadManifestFrom(ResProvider resProvider, String str, boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        InputStream inputStreamOpen = resProvider.open(str);
        try {
            DexManifest dexManifest = new DexManifest(inputStreamOpen, resProvider.isExoResProvider());
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            if (z && dexManifest.rootRelative) {
                resProvider.markRootRelative();
            }
            return dexManifest;
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public DexManifest(InputStream inputStream, boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        preloadDexClass();
        this.isExoPackage = z;
        ArrayList arrayListA0h = C3cG.A0h();
        EnumC2380BWu enumC2380BWu = EnumC2380BWu.NONE;
        String str = DexStoreUtils.MAIN_DEX_STORE_ID;
        ArrayList arrayListA0h2 = C3cG.A0h();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, HatchWebPageParserKt.UTF_8));
        boolean z2 = false;
        boolean z3 = false;
        int iA0F = 0;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    if (line.length() != 0) {
                        Mlog.v("Secondary program dex metadata: [%s]", line);
                        if (line.equals(".root_relative")) {
                            z2 = true;
                        } else if (line.equals(".locators")) {
                            z3 = true;
                        } else if (line.startsWith(".superpack_files")) {
                            iA0F = BV6.A0F(line.split(InviteCodeScratcherKt.CODE_SEPARATOR), 1);
                        } else if (line.startsWith(".superpack_extension")) {
                            String str2 = line.split(InviteCodeScratcherKt.CODE_SEPARATOR)[1];
                            if (!str2.isEmpty()) {
                                if (str2.equalsIgnoreCase("xz")) {
                                    enumC2380BWu = EnumC2380BWu.XZ;
                                } else if (!str2.equalsIgnoreCase("zst") && !str2.equalsIgnoreCase("zstd")) {
                                    if (str2.equalsIgnoreCase("spo")) {
                                        enumC2380BWu = EnumC2380BWu.OB;
                                    }
                                } else {
                                    enumC2380BWu = EnumC2380BWu.ZST;
                                }
                            }
                            enumC2380BWu = enumC2380BWu;
                        } else if (line.startsWith(".id")) {
                            str = line.split(InviteCodeScratcherKt.CODE_SEPARATOR)[1];
                        } else if (line.startsWith(".requires")) {
                            arrayListA0h2.add(line.split(InviteCodeScratcherKt.CODE_SEPARATOR)[1]);
                        } else if (line.startsWith(".")) {
                            Mlog.w("ignoring dex metadata pragma [%s]", line);
                        } else {
                            String[] strArrSplit = line.split(InviteCodeScratcherKt.CODE_SEPARATOR);
                            arrayListA0h.add(new Dex(strArrSplit[0], strArrSplit[1], strArrSplit[2]));
                        }
                    }
                } else {
                    bufferedReader.close();
                    this.rootRelative = z2;
                    this.locators = z3;
                    this.superpackFiles = iA0F;
                    this.superpackExtension = enumC2380BWu;
                    this.id = str;
                    this.requires = BV5.A1b(arrayListA0h2, arrayListA0h2.size());
                    this.dexes = (Dex[]) arrayListA0h.toArray(new Dex[arrayListA0h.size()]);
                    this.isArtMainStore = false;
                    return;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }
    }
}
