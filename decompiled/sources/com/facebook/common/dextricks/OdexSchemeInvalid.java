package com.facebook.common.dextricks;

import X.C8j3;
import X.FGI;
import com.facebook.common.dextricks.OdexScheme;
import java.io.File;

/* loaded from: classes5.dex */
public final class OdexSchemeInvalid extends OdexScheme {
    public final long mStatus;

    public OdexSchemeInvalid(long j) {
        super(2, new String[0]);
        this.mStatus = j;
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration) {
        throw C8j3.A18(FGI.A0M("invalid state: ", Long.toHexString(this.mStatus)));
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeInvalid";
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        throw C8j3.A18(FGI.A0M("invalid state: ", Long.toHexString(this.mStatus)));
    }
}
