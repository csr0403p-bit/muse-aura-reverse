package com.facebook.aura.browsertask.data;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.browsertask.data.HatchComputerRepository$loadContext-IoAF18A$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class HatchComputerRepository$loadContextIoAF18A$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<ComputerContextJson>> {
    public static final HatchComputerRepository$loadContextIoAF18A$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new HatchComputerRepository$loadContextIoAF18A$$inlined$executeJarvisRequest1iavgos$default$1();

    public HatchComputerRepository$loadContextIoAF18A$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<ComputerContextJson> invoke() {
        int i = ComputerContextJson.$stable;
        return ComputerContextJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<ComputerContextJson> invoke() {
        int i = ComputerContextJson.$stable;
        return ComputerContextJson$$serializer.INSTANCE;
    }
}
