package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.bugreport.AuraBugReportVmLogClient$createAndDownload$$inlined$executeJarvisRequest-Z6QaZII$default$2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AuraBugReportVmLogClient$createAndDownload$$inlined$executeJarvisRequestZ6QaZII$default$2 extends AbstractC7559F3s implements Function0<C9hr<VmLogDescriptorJson>> {
    public static final AuraBugReportVmLogClient$createAndDownload$$inlined$executeJarvisRequestZ6QaZII$default$2 INSTANCE = new AuraBugReportVmLogClient$createAndDownload$$inlined$executeJarvisRequestZ6QaZII$default$2();

    public AuraBugReportVmLogClient$createAndDownload$$inlined$executeJarvisRequestZ6QaZII$default$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<VmLogDescriptorJson> invoke() {
        return VmLogDescriptorJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<VmLogDescriptorJson> invoke() {
        return VmLogDescriptorJson$$serializer.INSTANCE;
    }
}
