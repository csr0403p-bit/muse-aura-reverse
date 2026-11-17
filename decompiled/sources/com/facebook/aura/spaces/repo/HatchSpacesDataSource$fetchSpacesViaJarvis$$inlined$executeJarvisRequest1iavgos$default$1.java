package com.facebook.aura.spaces.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.spaces.repo.HatchSpacesDataSource$fetchSpacesViaJarvis$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class HatchSpacesDataSource$fetchSpacesViaJarvis$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<SpacesV2PayloadJson>> {
    public static final HatchSpacesDataSource$fetchSpacesViaJarvis$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new HatchSpacesDataSource$fetchSpacesViaJarvis$$inlined$executeJarvisRequest1iavgos$default$1();

    public HatchSpacesDataSource$fetchSpacesViaJarvis$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<SpacesV2PayloadJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = SpacesV2PayloadJson.$childSerializers;
        return SpacesV2PayloadJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<SpacesV2PayloadJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = SpacesV2PayloadJson.$childSerializers;
        return SpacesV2PayloadJson$$serializer.INSTANCE;
    }
}
