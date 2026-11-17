package com.facebook.aura.subscription.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10571Hud;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import com.facebook.aura.utils.navigation.SecureUriKt;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$2$1", f = "AuraSubscriptionUsageBottomSheet.kt", l = {118}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $errorToast;
    public final /* synthetic */ G0U<String, Unit> $showDismissToast;
    public final /* synthetic */ AuraSubscriptionUsageViewModel $viewModel;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$2$1(AuraSubscriptionUsageViewModel auraSubscriptionUsageViewModel, G0U<? super String, Unit> g0u, String str, Context context, HtJ<? super AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$2$1> htJ) {
        super(2, htJ);
        this.$viewModel = auraSubscriptionUsageViewModel;
        this.$showDismissToast = g0u;
        this.$errorToast = str;
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$2$1 auraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$2$1 = new AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$2$1(this.$viewModel, this.$showDismissToast, this.$errorToast, this.$context, htJ);
        auraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$2$1.L$0 = obj;
        return auraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$2$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        final C3UX c3ux = (C3UX) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<AuraSubscriptionUsageViewModel.PaymentPortalEvent> c22i = this.$viewModel.paymentPortalEvent;
            final G0U<String, Unit> g0u = this.$showDismissToast;
            final String str = this.$errorToast;
            final Context context = this.$context;
            C20Z<? super AuraSubscriptionUsageViewModel.PaymentPortalEvent> c20z = new C20Z() { // from class: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$2$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((AuraSubscriptionUsageViewModel.PaymentPortalEvent) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(AuraSubscriptionUsageViewModel.PaymentPortalEvent paymentPortalEvent, HtJ<? super Unit> htJ) {
                    G0U<String, Unit> g0u2;
                    String str2;
                    Object c10571Hud;
                    if (paymentPortalEvent instanceof AuraSubscriptionUsageViewModel.PaymentPortalEvent.Open) {
                        try {
                            SecureUriKt.openInApp(SecureUriKt.asSecureUri(((AuraSubscriptionUsageViewModel.PaymentPortalEvent.Open) paymentPortalEvent).url), context);
                            c10571Hud = Unit.INSTANCE;
                        } catch (Throwable th) {
                            c10571Hud = new C10571Hud(th);
                        }
                        g0u2 = g0u;
                        str2 = str;
                        if (HsJ.A00(c10571Hud) != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (C7384Etj.areEqual(paymentPortalEvent, AuraSubscriptionUsageViewModel.PaymentPortalEvent.Error.INSTANCE)) {
                        g0u2 = g0u;
                        str2 = str;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    g0u2.invoke(str2);
                    return Unit.INSTANCE;
                }
            };
            this.L$0 = null;
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
