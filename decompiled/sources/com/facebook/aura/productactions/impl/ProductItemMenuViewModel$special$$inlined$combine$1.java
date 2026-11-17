package com.facebook.aura.productactions.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0W;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class ProductItemMenuViewModel$special$$inlined$combine$1 implements C20Q<ProductItemMenuUiState> {
    public final /* synthetic */ C20Q[] $flowArray$inlined;
    public final /* synthetic */ ProductItemMenuViewModel this$0;

    @DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductItemMenuViewModel$special$$inlined$combine$1", f = "ProductItemMenuViewModel.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.productactions.impl.ProductItemMenuViewModel$special$$inlined$combine$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductItemMenuViewModel$special$$inlined$combine$1.this.collect(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductItemMenuViewModel$special$$inlined$combine$1$3", f = "ProductItemMenuViewModel.kt", l = {288}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.productactions.impl.ProductItemMenuViewModel$special$$inlined$combine$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0W<C20Z<? super ProductItemMenuUiState>, ProductMenuActionUiState[], HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public Object L$2;
        public int label;
        public final /* synthetic */ ProductItemMenuViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HtJ htJ, ProductItemMenuViewModel productItemMenuViewModel) {
            super(3, htJ);
            this.this$0 = productItemMenuViewModel;
        }

        @Override // X.G0W
        public final Object invoke(C20Z<? super ProductItemMenuUiState> c20z, ProductMenuActionUiState[] productMenuActionUiStateArr, HtJ<? super Unit> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ, this.this$0);
            anonymousClass3.L$0 = c20z;
            anonymousClass3.L$1 = productMenuActionUiStateArr;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C20Z c20z = (C20Z) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ProductItemMenuViewModel productItemMenuViewModel = this.this$0;
                C7384Etj.A0Y(objArr, 0);
                ProductItemMenuUiState productItemMenuUiStateState = productItemMenuViewModel.state(Arrays.asList(objArr));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (c20z.emit(productItemMenuUiStateState, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public ProductItemMenuViewModel$special$$inlined$combine$1(C20Q[] c20qArr, ProductItemMenuViewModel productItemMenuViewModel) {
        this.$flowArray$inlined = c20qArr;
        this.this$0 = productItemMenuViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super com.facebook.aura.productactions.impl.ProductItemMenuUiState> r9, X.HtJ r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.productactions.impl.ProductItemMenuViewModel$special$$inlined$combine$1.AnonymousClass1
            if (r0 == 0) goto L44
            r7 = r10
            com.facebook.aura.productactions.impl.ProductItemMenuViewModel$special$$inlined$combine$1$1 r7 = (com.facebook.aura.productactions.impl.ProductItemMenuViewModel$special$$inlined$combine$1.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L23
            if (r0 != r5) goto L4a
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L23:
            X.Hwg.A00(r1)
            X.20Q[] r4 = r8.$flowArray$inlined
            com.facebook.aura.productactions.impl.ProductItemMenuViewModel$special$$inlined$combine$1$2 r3 = new com.facebook.aura.productactions.impl.ProductItemMenuViewModel$special$$inlined$combine$1$2
            r3.<init>()
            r2 = 0
            com.facebook.aura.productactions.impl.ProductItemMenuViewModel r1 = r8.this$0
            com.facebook.aura.productactions.impl.ProductItemMenuViewModel$special$$inlined$combine$1$3 r0 = new com.facebook.aura.productactions.impl.ProductItemMenuViewModel$special$$inlined$combine$1$3
            r0.<init>(r2, r1)
            r7.L$0 = r2
            r7.L$1 = r2
            r7.L$2 = r2
            r7.label = r5
            java.lang.Object r0 = X.C4vq.A00(r7, r3, r0, r9, r4)
            if (r0 != r6) goto L20
            return r6
        L44:
            com.facebook.aura.productactions.impl.ProductItemMenuViewModel$special$$inlined$combine$1$1 r7 = new com.facebook.aura.productactions.impl.ProductItemMenuViewModel$special$$inlined$combine$1$1
            r7.<init>(r10)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.productactions.impl.ProductItemMenuViewModel$special$$inlined$combine$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
