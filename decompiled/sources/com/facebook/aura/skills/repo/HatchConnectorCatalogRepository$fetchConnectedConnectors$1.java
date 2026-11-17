package com.facebook.aura.skills.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository", f = "HatchConnectorCatalogRepository.kt", l = {422}, m = "fetchConnectedConnectors-IoAF18A", v = 2)
/* loaded from: classes.dex */
public final class HatchConnectorCatalogRepository$fetchConnectedConnectors$1 extends HzP {
    public long J$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchConnectorCatalogRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCatalogRepository$fetchConnectedConnectors$1(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, HtJ<? super HatchConnectorCatalogRepository$fetchConnectedConnectors$1> htJ) {
        super(htJ);
        this.this$0 = hatchConnectorCatalogRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m2118fetchConnectedConnectorsIoAF18A(this));
    }
}
