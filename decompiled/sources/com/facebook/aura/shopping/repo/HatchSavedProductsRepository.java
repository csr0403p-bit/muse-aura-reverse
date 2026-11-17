package com.facebook.aura.shopping.repo;

import X.AbstractC3358CGz;
import X.C06H;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.InterfaceC7549F2g;
import com.facebook.aura.shopping.model.ShoppingSaveTarget;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class HatchSavedProductsRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final ConcurrentHashMap<ShoppingSaveTarget, SavedProductState> knownStates;
    public final AbstractC3358CGz userSession;

    public final SavedProductState knownState(ShoppingSaveTarget shoppingSaveTarget) {
        C7384Etj.A0Y(shoppingSaveTarget, 0);
        return this.knownStates.get(shoppingSaveTarget);
    }

    private final SavedProductState toState(SavedStateResponseJson savedStateResponseJson) {
        String str = savedStateResponseJson.item_id;
        String str2 = null;
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        if (savedStateResponseJson.saved) {
            if (str == null) {
                throw C3cG.A0Q("Saved response has no item_id");
            }
            str2 = str;
        }
        return new SavedProductState(str2);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.knownStates.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* renamed from: fetchState-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2013fetchState0E7RQCE(com.facebook.aura.shopping.model.ShoppingSaveTarget r23, java.lang.String r24, X.HtJ<? super X.HsJ<com.facebook.aura.shopping.repo.SavedProductState>> r25) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.repo.HatchSavedProductsRepository.m2013fetchState0E7RQCE(com.facebook.aura.shopping.model.ShoppingSaveTarget, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* renamed from: save-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2014save0E7RQCE(com.facebook.aura.shopping.model.ShoppingSaveTarget r26, java.lang.String r27, X.HtJ<? super X.HsJ<com.facebook.aura.shopping.repo.SavedProductState>> r28) {
        /*
            r25 = this;
            r3 = r26
            r6 = r28
            boolean r0 = r6 instanceof com.facebook.aura.shopping.repo.HatchSavedProductsRepository$save$1
            r4 = r25
            if (r0 == 0) goto L92
            r2 = r6
            com.facebook.aura.shopping.repo.HatchSavedProductsRepository$save$1 r2 = (com.facebook.aura.shopping.repo.HatchSavedProductsRepository$save$1) r2
            int r5 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r1
            if (r0 == 0) goto L92
            int r5 = r5 - r1
            r2.label = r5
        L18:
            java.lang.Object r6 = r2.result
            X.Hji r0 = X.EnumC10460Hji.A02
            int r5 = r2.label
            r1 = 1
            if (r5 == 0) goto L30
            if (r5 != r1) goto L9f
            java.lang.Object r3 = r2.L$0
            java.lang.Object r0 = X.AnonymousClass001.A0q(r6)
        L29:
            boolean r1 = r0 instanceof X.C10571Hud
            r1 = r1 ^ 1
            if (r1 == 0) goto La9
            goto L98
        L30:
            X.Hwg.A00(r6)
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.shopping.repo.ShoppingJarvisPath$SavedDefault r10 = com.facebook.aura.shopping.repo.ShoppingJarvisPath.SavedDefault.INSTANCE
            r5 = r27
            com.facebook.aura.shopping.repo.SavedDefaultRequestJson r11 = com.facebook.aura.shopping.repo.HatchSavedProductsJsonKt.toRequestJson(r3, r5)
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r13 = r4.userSession
            r9 = 0
            X.HxE[] r5 = new X.HxE[r9]
            java.util.Set r17 = X.AnonymousClass004.A18()
            X.9jH r20 = X.C9jH.A00
            com.facebook.aura.shopping.repo.HatchSavedProductsRepository$save-0E7RQCE$$inlined$executeJarvisRequest-Z6QaZII$default$1 r7 = com.facebook.aura.shopping.repo.HatchSavedProductsRepository$save0E7RQCE$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.shopping.repo.HatchSavedProductsRepository$save-0E7RQCE$$inlined$executeJarvisRequest-Z6QaZII$default$2 r8 = com.facebook.aura.shopping.repo.HatchSavedProductsRepository$save0E7RQCE$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r2.L$0 = r3
            r14 = 0
            r2.L$1 = r14
            r2.L$2 = r14
            r2.L$3 = r14
            r2.L$4 = r14
            r2.L$5 = r14
            r2.L$6 = r14
            r2.L$7 = r14
            r2.L$8 = r14
            r2.L$9 = r14
            r2.I$0 = r1
            r2.I$1 = r1
            r2.I$2 = r9
            r2.I$3 = r1
            r2.I$4 = r9
            r2.I$5 = r9
            r2.I$6 = r9
            r2.label = r1
            r15 = r14
            r19 = r1
            r21 = r14
            r22 = r9
            r23 = r1
            r24 = r9
            r25 = r9
            r26 = r14
            r27 = r9
            r28 = r2
            r18 = r1
            r16 = r5
            java.lang.Object r1 = r6.m1599executeJarvisRequestWithFof5HsY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r1 == r0) goto Lb4
            r0 = r1
            goto L29
        L92:
            com.facebook.aura.shopping.repo.HatchSavedProductsRepository$save$1 r2 = new com.facebook.aura.shopping.repo.HatchSavedProductsRepository$save$1
            r2.<init>(r4, r6)
            goto L18
        L98:
            com.facebook.aura.shopping.repo.SavedStateResponseJson r0 = (com.facebook.aura.shopping.repo.SavedStateResponseJson) r0     // Catch: java.lang.Throwable -> La4
            com.facebook.aura.shopping.repo.SavedProductState r0 = r4.toState(r0)     // Catch: java.lang.Throwable -> La4
            goto La9
        L9f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        La4:
            r0 = move-exception
            X.Hud r0 = X.C3cG.A0s(r0)
        La9:
            boolean r1 = r0 instanceof X.C10571Hud
            r1 = r1 ^ 1
            if (r1 == 0) goto Lb4
            java.util.concurrent.ConcurrentHashMap<com.facebook.aura.shopping.model.ShoppingSaveTarget, com.facebook.aura.shopping.repo.SavedProductState> r1 = r4.knownStates
            r1.put(r3, r0)
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.repo.HatchSavedProductsRepository.m2014save0E7RQCE(com.facebook.aura.shopping.model.ShoppingSaveTarget, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* renamed from: unsave-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2015unsavegIAlus(java.lang.String r19, X.HtJ<? super X.HsJ<com.facebook.aura.shopping.repo.SavedProductState>> r20) {
        /*
            r18 = this;
            r3 = r19
            r6 = r20
            boolean r0 = r6 instanceof com.facebook.aura.shopping.repo.HatchSavedProductsRepository$unsave$1
            r1 = r18
            if (r0 == 0) goto L73
            r4 = r6
            com.facebook.aura.shopping.repo.HatchSavedProductsRepository$unsave$1 r4 = (com.facebook.aura.shopping.repo.HatchSavedProductsRepository$unsave$1) r4
            int r5 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r2
            if (r0 == 0) goto L73
            int r5 = r5 - r2
            r4.label = r5
        L18:
            java.lang.Object r5 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r15 = 1
            if (r0 == 0) goto L32
            if (r0 != r15) goto L99
            java.lang.Object r3 = r4.L$0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = X.AnonymousClass001.A0q(r5)
        L2b:
            boolean r0 = r4 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L85
            goto L79
        L32:
            com.facebook.aura.network.http.HatchHttpApi r5 = X.C60O.A06(r5)
            com.facebook.aura.shopping.repo.ShoppingJarvisPath$SavedItem r8 = new com.facebook.aura.shopping.repo.ShoppingJarvisPath$SavedItem
            r8.<init>(r3)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.DELETE
            X.CGz r10 = r1.userSession
            r7 = 0
            X.HxE[] r12 = new X.HxE[r7]
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r16 = X.C9jH.A00
            com.facebook.aura.shopping.repo.HatchSavedProductsRepository$unsave-gIAlu-s$$inlined$executeJarvisRequest-1iavgos$default$1 r6 = com.facebook.aura.shopping.repo.HatchSavedProductsRepository$unsavegIAlus$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r4.L$0 = r3
            r11 = 0
            r4.L$1 = r11
            r4.L$2 = r11
            r4.L$3 = r11
            r4.L$4 = r11
            r4.L$5 = r11
            r4.L$6 = r11
            r4.L$7 = r11
            r4.I$0 = r15
            r4.I$1 = r15
            r4.I$2 = r7
            r4.label = r15
            r13 = r11
            r17 = r15
            r18 = r11
            r19 = r7
            r20 = r4
            java.lang.Object r4 = r5.m1595executeBodylessJarvisRequestWithp3iPjrY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r4 != r2) goto L2b
            return r2
        L73:
            com.facebook.aura.shopping.repo.HatchSavedProductsRepository$unsave$1 r4 = new com.facebook.aura.shopping.repo.HatchSavedProductsRepository$unsave$1
            r4.<init>(r1, r6)
            goto L18
        L79:
            com.facebook.aura.shopping.repo.SavedStateResponseJson r4 = (com.facebook.aura.shopping.repo.SavedStateResponseJson) r4     // Catch: java.lang.Throwable -> L80
            com.facebook.aura.shopping.repo.SavedProductState r4 = r1.toState(r4)     // Catch: java.lang.Throwable -> L80
            goto L85
        L80:
            r0 = move-exception
            X.Hud r4 = X.C3cG.A0s(r0)
        L85:
            boolean r0 = r4 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L98
            r2 = r4
            com.facebook.aura.shopping.repo.SavedProductState r2 = (com.facebook.aura.shopping.repo.SavedProductState) r2
            java.util.concurrent.ConcurrentHashMap<com.facebook.aura.shopping.model.ShoppingSaveTarget, com.facebook.aura.shopping.repo.SavedProductState> r1 = r1.knownStates
            com.facebook.aura.shopping.repo.HatchSavedProductsRepository$unsave$3$1 r0 = new com.facebook.aura.shopping.repo.HatchSavedProductsRepository$unsave$3$1
            r0.<init>()
            r1.replaceAll(r0)
        L98:
            return r4
        L99:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.repo.HatchSavedProductsRepository.m2015unsavegIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final HatchSavedProductsRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchSavedProductsRepository) abstractC3358CGz.A03(HatchSavedProductsRepository.class, new HatchSavedProductsRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchSavedProductsRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.knownStates = C60O.A1C();
    }

    public /* synthetic */ HatchSavedProductsRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
