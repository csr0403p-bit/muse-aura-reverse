package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.bugreport.AuraBugReportVmLogClient$createAndDownload$$inlined$executeJarvisRequest-Z6QaZII$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AuraBugReportVmLogClient$createAndDownload$$inlined$executeJarvisRequestZ6QaZII$default$1 extends AbstractC7559F3s implements Function0<C9hr<VmLogCreateRequestJson>> {
    public static final AuraBugReportVmLogClient$createAndDownload$$inlined$executeJarvisRequestZ6QaZII$default$1 INSTANCE = new AuraBugReportVmLogClient$createAndDownload$$inlined$executeJarvisRequestZ6QaZII$default$1();

    public AuraBugReportVmLogClient$createAndDownload$$inlined$executeJarvisRequestZ6QaZII$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<VmLogCreateRequestJson> invoke() {
        return VmLogCreateRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<VmLogCreateRequestJson> invoke() {
        return VmLogCreateRequestJson$$serializer.INSTANCE;
    }
}
