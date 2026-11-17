package com.facebook.aura.productactions.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BLG;
import X.C10571Hud;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.shopping.model.ShoppingSaveTarget;
import com.facebook.aura.shopping.repo.HatchSavedProductsRepository;
import com.facebook.aura.shopping.repo.SavedProductState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class ProductSaveAction {
    public static final int $stable = 8;
    public final BLG<Boolean> _isSaved;
    public final String hostMessageId;
    public final C1BN<Boolean> isSaved;
    public final String productId;
    public final HatchSavedProductsRepository repository;
    public SavedProductState savedState;
    public final C3UX scope;
    public final String sessionId;
    public final ShoppingSaveTarget target;
    public HoC toggleJob;

    @DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductSaveAction$1", f = "ProductSaveAction.kt", l = {50}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.productactions.impl.ProductSaveAction$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ProductSaveAction.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ProductSaveAction.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ProductSaveAction productSaveAction = ProductSaveAction.this;
                this.label = 1;
                if (productSaveAction.readSavedState(this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductSaveAction", f = "ProductSaveAction.kt", l = {55, 57}, m = "readSavedState", v = 2)
    /* renamed from: com.facebook.aura.productactions.impl.ProductSaveAction$readSavedState$1, reason: invalid class name and case insensitive filesystem */
    public final class C134401 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int label;
        public /* synthetic */ Object result;

        public C134401(HtJ<? super C134401> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductSaveAction.this.readSavedState(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductSaveAction$toggle$1", f = "ProductSaveAction.kt", l = {72, 72}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.productactions.impl.ProductSaveAction$toggle$1, reason: invalid class name and case insensitive filesystem */
    public final class C134411 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ SavedProductState $current;
        public final /* synthetic */ G0U<Boolean, Unit> $onDone;
        public Object L$0;
        public int label;
        public final /* synthetic */ ProductSaveAction this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C134411(SavedProductState savedProductState, ProductSaveAction productSaveAction, G0U<? super Boolean, Unit> g0u, HtJ<? super C134411> htJ) {
            super(2, htJ);
            this.$current = savedProductState;
            this.this$0 = productSaveAction;
            this.$onDone = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C134411(this.$current, this.this$0, this.$onDone, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM2015unsavegIAlus;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                String str = this.$current.itemId;
                ProductSaveAction productSaveAction = this.this$0;
                HatchSavedProductsRepository hatchSavedProductsRepository = productSaveAction.repository;
                if (str == null) {
                    ShoppingSaveTarget shoppingSaveTarget = productSaveAction.target;
                    String str2 = productSaveAction.sessionId;
                    this.L$0 = null;
                    this.label = 1;
                    objM2015unsavegIAlus = hatchSavedProductsRepository.m2014save0E7RQCE(shoppingSaveTarget, str2, this);
                } else {
                    this.L$0 = null;
                    this.label = 2;
                    objM2015unsavegIAlus = hatchSavedProductsRepository.m2015unsavegIAlus(str, this);
                }
                if (objM2015unsavegIAlus == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw AnonymousClass001.A0n();
                }
                objM2015unsavegIAlus = AnonymousClass001.A0q(obj);
            }
            ProductSaveAction productSaveAction2 = this.this$0;
            Object obj2 = this.$current;
            boolean z = objM2015unsavegIAlus instanceof C10571Hud;
            if (!z) {
                obj2 = objM2015unsavegIAlus;
            }
            productSaveAction2.publish((SavedProductState) obj2);
            G0U<Boolean, Unit> g0u = this.$onDone;
            if (!z) {
                AnonymousClass001.A1K(AnonymousClass002.A1X(((SavedProductState) objM2015unsavegIAlus).itemId), g0u);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134411) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void toggle(G0U<? super Boolean, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        SavedProductState savedProductState = this.savedState;
        if (savedProductState != null) {
            HoC hoC = this.toggleJob;
            if (hoC == null || !hoC.isActive()) {
                boolean z = !AnonymousClass002.A1X(savedProductState.itemId);
                C9286GCn.A00(null, Boolean.valueOf(z), (C9286GCn) this._isSaved);
                logToggle(z);
                this.toggleJob = AnonymousClass001.A11(new C134411(savedProductState, this, g0u, null), this.scope);
            }
        }
    }

    private final void logToggle(boolean z) {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.SHOPPING;
        HatchScreen hatchScreen = HatchScreen.PRODUCT_DETAIL;
        HatchComponent hatchComponent = HatchComponent.SAVE_BUTTON;
        String str = this.productId;
        String str2 = this.hostMessageId;
        hatchInteractionLogger.logToggle(z, hatchSurface, null, hatchScreen, hatchComponent, str, str2 != null ? AnonymousClass007.A0c(HatchMetadataKey.HOST_MESSAGE_ID, str2) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publish(SavedProductState savedProductState) {
        this.savedState = savedProductState;
        AnonymousClass004.A1D(AnonymousClass002.A1X(savedProductState.itemId), this._isSaved);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028 A[PHI: r1 r4 r5
  0x0028: PHI (r1v3 java.lang.Object) = (r1v5 java.lang.Object), (r1v6 java.lang.Object) binds: [B:27:0x006d, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r4v4 int) = (r4v2 int), (r4v6 int) binds: [B:27:0x006d, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r5v5 int) = (r5v2 int), (r5v8 int) binds: [B:27:0x006d, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006d -> B:12:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readSavedState(X.HtJ<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.facebook.aura.productactions.impl.ProductSaveAction.C134401
            if (r0 == 0) goto L81
            r9 = r11
            com.facebook.aura.productactions.impl.ProductSaveAction$readSavedState$1 r9 = (com.facebook.aura.productactions.impl.ProductSaveAction.C134401) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L81
            int r2 = r2 - r1
            r9.label = r2
        L12:
            java.lang.Object r1 = r9.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L7a
            if (r0 == r6) goto L70
            if (r0 != r7) goto L8a
            int r5 = r9.I$1
            int r4 = r9.I$0
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L28:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L34
            r0 = r1
            com.facebook.aura.shopping.repo.SavedProductState r0 = (com.facebook.aura.shopping.repo.SavedProductState) r0
            r10.publish(r0)
        L34:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 == 0) goto L87
            boolean r0 = com.facebook.aura.productactions.impl.ProductSaveActionKt.isTransient(r0)
            if (r0 == 0) goto L87
            int r5 = r5 + 1
            if (r5 >= r4) goto L87
            if (r5 <= 0) goto L7f
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = (long) r5
            long r0 = r0 * r2
            r9.I$0 = r4
            r9.I$1 = r5
            r9.I$2 = r5
            r9.label = r6
            java.lang.Object r0 = X.C7Bq.A01(r0, r9)
            if (r0 == r8) goto L6f
            r0 = r5
        L59:
            r3 = r5
            r5 = r0
        L5b:
            com.facebook.aura.shopping.repo.HatchSavedProductsRepository r2 = r10.repository
            com.facebook.aura.shopping.model.ShoppingSaveTarget r1 = r10.target
            java.lang.String r0 = r10.sessionId
            r9.I$0 = r4
            r9.I$1 = r5
            r9.I$2 = r3
            r9.label = r7
            java.lang.Object r1 = r2.m2013fetchState0E7RQCE(r1, r0, r9)
            if (r1 != r8) goto L28
        L6f:
            return r8
        L70:
            int r5 = r9.I$2
            int r0 = r9.I$1
            int r4 = r9.I$0
            X.Hwg.A00(r1)
            goto L59
        L7a:
            X.Hwg.A00(r1)
            r5 = 0
            r4 = 3
        L7f:
            r3 = r5
            goto L5b
        L81:
            com.facebook.aura.productactions.impl.ProductSaveAction$readSavedState$1 r9 = new com.facebook.aura.productactions.impl.ProductSaveAction$readSavedState$1
            r9.<init>(r11)
            goto L12
        L87:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L8a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.productactions.impl.ProductSaveAction.readSavedState(X.HtJ):java.lang.Object");
    }

    public final C1BN<Boolean> isSaved() {
        return this.isSaved;
    }

    public ProductSaveAction(C3UX c3ux, ShoppingSaveTarget shoppingSaveTarget, String str, String str2, String str3, HatchSavedProductsRepository hatchSavedProductsRepository) {
        AnonymousClass005.A0y(c3ux, shoppingSaveTarget, str2);
        C7384Etj.A0Y(hatchSavedProductsRepository, 5);
        this.scope = c3ux;
        this.target = shoppingSaveTarget;
        this.sessionId = str;
        this.productId = str2;
        this.hostMessageId = str3;
        this.repository = hatchSavedProductsRepository;
        C9286GCn c9286GCnA01 = HnJ.A01(null);
        this._isSaved = c9286GCnA01;
        this.isSaved = C3cG.A11(c9286GCnA01);
        AnonymousClass001.A1J(new AnonymousClass1(null), c3ux);
    }
}
