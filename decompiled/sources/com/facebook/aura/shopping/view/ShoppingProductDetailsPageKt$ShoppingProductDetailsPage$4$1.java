package com.facebook.aura.shopping.view;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C05663ul;
import X.C1BO;
import X.C3UX;
import X.C6v3;
import X.C7438Evz;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsNotice;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.shopping.view.ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$4$1", f = "ShoppingProductDetailsPage.kt", l = {98}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Boolean> $isSettledPage;
    public final /* synthetic */ ShoppingProductDetailsNotice $notice;
    public final /* synthetic */ C1BO<ShoppingProductDetailsUiState> $uiState$delegate;
    public final /* synthetic */ ShoppingProductDetailsViewModel $viewModel;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.shopping.view.ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$4$1$1", f = "ShoppingProductDetailsPage.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(z);
        }

        public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$4$1$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass2(Object obj) {
            super(0, obj, ShoppingProductDetailsViewModel.class, "onReloadTapped", "onReloadTapped()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ShoppingProductDetailsViewModel) this.receiver).onReloadTapped();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$4$1(ShoppingProductDetailsNotice shoppingProductDetailsNotice, Function0<Boolean> function0, ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, Context context, C1BO<ShoppingProductDetailsUiState> c1bo, HtJ<? super ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$4$1> htJ) {
        super(2, htJ);
        this.$notice = shoppingProductDetailsNotice;
        this.$isSettledPage = function0;
        this.$viewModel = shoppingProductDetailsViewModel;
        this.$context = context;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$4$1(this.$notice, this.$isSettledPage, this.$viewModel, this.$context, this.$uiState$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$notice != null) {
                C05663ul c05663ulA01 = C6v3.A01(this.$isSettledPage);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (AbstractC9777Gfy.A00(this, anonymousClass1, c05663ulA01) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$viewModel.onNoticeShown();
        ShoppingProductDetailsPageKt.showHydrationNoticeToast(this.$context, this.$notice, this.$uiState$delegate.getValue().presentation.productType, new AnonymousClass2(this.$viewModel));
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
