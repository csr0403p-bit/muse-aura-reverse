package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import com.facebook.aura.gateway.store.VmEntryV2Json;
import com.facebook.aura.gateway.store.VmEntryV2Json$$serializer;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class FetchLeasedVmV2ResponseJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends VmEntryV2Json>>> {
    public static final FetchLeasedVmV2ResponseJson$Companion$$childSerializers$1 INSTANCE = new FetchLeasedVmV2ResponseJson$Companion$$childSerializers$1();

    public FetchLeasedVmV2ResponseJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends VmEntryV2Json>> invoke() {
        return C3cG.A19(VmEntryV2Json$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends VmEntryV2Json>> invoke() {
        return C3cG.A19(VmEntryV2Json$$serializer.INSTANCE);
    }
}
