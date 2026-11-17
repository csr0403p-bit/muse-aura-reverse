package com.facebook.aura.shopping.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BGK;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GBH;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchProductImageRecoveryKt$rememberProductImageRecovery$onLoadFailed$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ ProductImageRecoveryState $state;

    @DebugMetadata(c = "com.facebook.aura.shopping.view.HatchProductImageRecoveryKt$rememberProductImageRecovery$onLoadFailed$1$1$1", f = "HatchProductImageRecovery.kt", l = {141}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.view.HatchProductImageRecoveryKt$rememberProductImageRecovery$onLoadFailed$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ProductImageRecoveryState $state;
        public final /* synthetic */ String $url;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProductImageRecoveryState productImageRecoveryState, String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$state = productImageRecoveryState;
            this.$url = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$state, this.$url, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (GBH.A00(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            ProductImageRecoveryState productImageRecoveryState = this.$state;
            productImageRecoveryState.setFailedUrls(BGK.A02(this.$url, productImageRecoveryState.getFailedUrls()));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass001.A1J(new AnonymousClass1(this.$state, str, null), this.$scope);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductImageRecoveryKt$rememberProductImageRecovery$onLoadFailed$1$1(C3UX c3ux, ProductImageRecoveryState productImageRecoveryState) {
        super(1);
        this.$scope = c3ux;
        this.$state = productImageRecoveryState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
