package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AgeVerificationStartResponseJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends AgeVerificationUploadJson>>> {
    public static final AgeVerificationStartResponseJson$Companion$$childSerializers$1 INSTANCE = new AgeVerificationStartResponseJson$Companion$$childSerializers$1();

    public AgeVerificationStartResponseJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends AgeVerificationUploadJson>> invoke() {
        return C3cG.A19(AgeVerificationUploadJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends AgeVerificationUploadJson>> invoke() {
        return C3cG.A19(AgeVerificationUploadJson$$serializer.INSTANCE);
    }
}
