package com.facebook.common.dextricks;

import X.BV4;
import X.BV5;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.OdexSchemeNoop;
import java.io.File;
import java.io.IOException;

/* loaded from: classes5.dex */
public class OdexSchemeUncompressedExo extends OdexScheme {
    public final DexManifest dexManifest;
    public final ResProvider resProvider;

    public OdexSchemeUncompressedExo(DexManifest dexManifest, ResProvider resProvider) {
        super(0, new String[0]);
        this.dexManifest = dexManifest;
        this.resProvider = resProvider;
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration) throws InterruptedException, IOException {
        for (DexManifest.Dex dex : this.dexManifest.dexes) {
            String filePath = this.resProvider.getFilePath(dex.assetName);
            if (filePath == null) {
                throw BV5.A0M("Could not find dex file ", dex.assetName);
            }
            classLoaderConfiguration.addDex(BV4.A0G(filePath), false);
        }
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeUncompressedExo";
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new OdexSchemeNoop.NoopCompiler();
    }
}
