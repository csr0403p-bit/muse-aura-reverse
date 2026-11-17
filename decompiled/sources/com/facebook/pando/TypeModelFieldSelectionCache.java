package com.facebook.pando;

import X.AbstractC3081BxN;
import X.C5120DZw;
import X.C7384Etj;
import X.ETi;
import X.F60;
import com.facebook.jni.HybridClassBase;

/* loaded from: classes5.dex */
public final class TypeModelFieldSelectionCache extends HybridClassBase {
    public PandoBuildConfigFlatbufferAssetReaderJNI flatbufferAssetReaderJNI;

    public static final native TypeModelFieldSelectionCache create();

    public final native int[] fieldHashSetForFragmentNameNative(int i, PandoBuildConfigFlatbufferAssetReaderJNI pandoBuildConfigFlatbufferAssetReaderJNI);

    public final native int[] fieldHashSetForHashCodeNative(int i, PandoBuildConfigFlatbufferAssetReaderJNI pandoBuildConfigFlatbufferAssetReaderJNI);

    public final TypeModelFieldSelectionCache initialize(String str) {
        C7384Etj.A0Y(str, 0);
        this.flatbufferAssetReaderJNI = C5120DZw.A00(AbstractC3081BxN.A00().A02(str));
        return this;
    }

    static {
        ETi.loadLibrary("pando-graphql-jni");
    }

    public final int[] fieldHashSetForFieldName(int i) {
        PandoBuildConfigFlatbufferAssetReaderJNI pandoBuildConfigFlatbufferAssetReaderJNI = this.flatbufferAssetReaderJNI;
        if (pandoBuildConfigFlatbufferAssetReaderJNI != null) {
            return fieldHashSetForHashCodeNative(i, pandoBuildConfigFlatbufferAssetReaderJNI);
        }
        C7384Etj.A0b("flatbufferAssetReaderJNI");
        throw F60.createAndThrow();
    }

    public final int[] fieldHashSetForFragmentName(int i) {
        PandoBuildConfigFlatbufferAssetReaderJNI pandoBuildConfigFlatbufferAssetReaderJNI = this.flatbufferAssetReaderJNI;
        if (pandoBuildConfigFlatbufferAssetReaderJNI != null) {
            return fieldHashSetForFragmentNameNative(i, pandoBuildConfigFlatbufferAssetReaderJNI);
        }
        C7384Etj.A0b("flatbufferAssetReaderJNI");
        throw F60.createAndThrow();
    }
}
