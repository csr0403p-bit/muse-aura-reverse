package com.facebook.aura.subscription.model;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$emitPaymentPortal$url$1", f = "AuraSubscriptionUsageViewModel.kt", l = {HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraSubscriptionUsageViewModel$emitPaymentPortal$url$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
    public int label;
    public final /* synthetic */ AuraSubscriptionUsageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageViewModel$emitPaymentPortal$url$1(AuraSubscriptionUsageViewModel auraSubscriptionUsageViewModel, HtJ<? super AuraSubscriptionUsageViewModel$emitPaymentPortal$url$1> htJ) {
        super(2, htJ);
        this.this$0 = auraSubscriptionUsageViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraSubscriptionUsageViewModel$emitPaymentPortal$url$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AuraSubscriptionRepository auraSubscriptionRepository = this.this$0.repository;
            this.label = 1;
            obj = auraSubscriptionRepository.fetchPaymentPortalUrl(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
        return new AuraSubscriptionUsageViewModel$emitPaymentPortal$url$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
