package com.facebook.aura.skills.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C8eM;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.skills.model.ConnectorCatalogQuery;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.repo.HatchConnectorCatalogRepository$prefetchCategoryPages$1$1", f = "HatchConnectorCatalogRepository.kt", l = {555, 314}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConnectorCatalogRepository$prefetchCategoryPages$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $categoryId;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ HatchConnectorCatalogRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCatalogRepository$prefetchCategoryPages$1$1(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, String str, HtJ<? super HatchConnectorCatalogRepository$prefetchCategoryPages$1$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchConnectorCatalogRepository;
        this.$categoryId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConnectorCatalogRepository$prefetchCategoryPages$1$1(this.this$0, this.$categoryId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HatchConnectorCatalogRepository hatchConnectorCatalogRepository;
        C8eM c8eM;
        String str;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                hatchConnectorCatalogRepository = this.this$0;
                c8eM = hatchConnectorCatalogRepository.categoryPrefetchSemaphore;
                str = this.$categoryId;
                this.L$0 = c8eM;
                this.L$1 = str;
                this.L$2 = hatchConnectorCatalogRepository;
                this.label = 1;
                if (c8eM.A2u(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    c8eM = (C8eM) this.L$0;
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                hatchConnectorCatalogRepository = (HatchConnectorCatalogRepository) this.L$2;
                str = (String) this.L$1;
                c8eM = (C8eM) this.L$0;
                Hwg.A00(obj);
            }
            ConnectorCatalogQuery.Category category = new ConnectorCatalogQuery.Category(str);
            if (!hatchConnectorCatalogRepository.hasRecentPage(category)) {
                this.L$0 = c8eM;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                if (hatchConnectorCatalogRepository.m2121fetchQueryPage0E7RQCE(category, null, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        } finally {
            c8eM.release();
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConnectorCatalogRepository$prefetchCategoryPages$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
