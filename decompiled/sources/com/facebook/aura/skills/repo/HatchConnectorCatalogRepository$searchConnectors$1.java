package com.facebook.aura.skills.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository", f = "HatchConnectorCatalogRepository.kt", l = {577}, m = "searchConnectors-BWLJW6A", v = 2)
/* loaded from: classes.dex */
public final class HatchConnectorCatalogRepository$searchConnectors$1 extends HzP {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchConnectorCatalogRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCatalogRepository$searchConnectors$1(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, HtJ<? super HatchConnectorCatalogRepository$searchConnectors$1> htJ) {
        super(htJ);
        this.this$0 = hatchConnectorCatalogRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m2116searchConnectorsBWLJW6A(null, null, null, this));
    }
}
