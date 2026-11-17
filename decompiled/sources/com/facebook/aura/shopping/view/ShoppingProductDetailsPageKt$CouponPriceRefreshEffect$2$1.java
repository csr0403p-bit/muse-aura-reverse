package com.facebook.aura.shopping.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BLG;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C5303Dfm;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.F2N;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.shopping.view.ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$2$1", f = "ShoppingProductDetailsPage.kt", l = {HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ F2N $lifecycle;
    public final /* synthetic */ ShoppingProductDetailsViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$2$1(F2N f2n, ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, HtJ<? super ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$2$1> htJ) {
        super(2, htJ);
        this.$lifecycle = f2n;
        this.$viewModel = shoppingProductDetailsViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$2$1(this.$lifecycle, this.$viewModel, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            BLG<EnumC10573Huf> blg = ((C5303Dfm) this.$lifecycle).A06;
            final ShoppingProductDetailsViewModel shoppingProductDetailsViewModel = this.$viewModel;
            C20Z<? super EnumC10573Huf> c20z = new C20Z() { // from class: com.facebook.aura.shopping.view.ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$2$1.1
                public final Object emit(EnumC10573Huf enumC10573Huf, HtJ<? super Unit> htJ) {
                    boolean zA00 = enumC10573Huf.A00(EnumC10573Huf.A06);
                    ShoppingProductDetailsViewModel shoppingProductDetailsViewModel2 = shoppingProductDetailsViewModel;
                    if (zA00) {
                        shoppingProductDetailsViewModel2.onLifecycleStarted();
                    } else {
                        shoppingProductDetailsViewModel2.onLifecycleStopped();
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((EnumC10573Huf) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (blg.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw C3cG.A0p();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
