package com.facebook.pando;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridClassBase;
import java.util.Set;

/* loaded from: classes5.dex */
public final class TypeModelField$WithJNI extends HybridClassBase {
    public static final Companion Companion = new Companion();
    public Set cachedFieldSet;
    public final String name;
    public final Class<? extends TreeWithGraphQL> treeClass;

    public TypeModelField$WithJNI(String str) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
        this.treeClass = TreeWithGraphQL.class;
    }

    public static final native Set<TypeModelField$WithJNI> fieldSetForFragmentNameNative(int i, PandoBuildConfigFlatbufferAssetReaderJNI pandoBuildConfigFlatbufferAssetReaderJNI);

    private final native Set<TypeModelField$WithJNI> fieldSetNative();

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public final Set<TypeModelField$WithJNI> fieldSetForFragmentNameNative(int i, PandoBuildConfigFlatbufferAssetReaderJNI pandoBuildConfigFlatbufferAssetReaderJNI) {
            return TypeModelField$WithJNI.fieldSetForFragmentNameNative(i, pandoBuildConfigFlatbufferAssetReaderJNI);
        }

        public Companion() {
        }
    }

    static {
        ETi.loadLibrary("pando-graphql-jni");
    }

    public Set fieldSet() {
        Set set = this.cachedFieldSet;
        if (set != null) {
            return set;
        }
        Set<TypeModelField$WithJNI> setFieldSetNative = fieldSetNative();
        this.cachedFieldSet = setFieldSetNative;
        return setFieldSetNative;
    }

    public final Set getCachedFieldSet() {
        return this.cachedFieldSet;
    }

    public String getName() {
        return this.name;
    }

    public Class<? extends TreeWithGraphQL> getTreeClass() {
        return this.treeClass;
    }

    public final void setCachedFieldSet(Set set) {
        this.cachedFieldSet = set;
    }
}
