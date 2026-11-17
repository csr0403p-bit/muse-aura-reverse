package com.facebook.aura.shopping.viewmodel;

import X.HtJ;
import X.HzP;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchPresentationData;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.ShoppingResultsPresentationData;
import com.facebook.aura.shopping.model.ShoppingResultsPresentation;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public abstract class ShoppingProductLookupKt {

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt", f = "ShoppingProductLookup.kt", l = {52}, m = "findShoppingCart", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt$findShoppingCart$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShoppingProductLookupKt.findShoppingCart(null, null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt", f = "ShoppingProductLookup.kt", l = {34, R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures}, m = "findShoppingProduct", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt$findShoppingProduct$1, reason: invalid class name and case insensitive filesystem */
    public final class C137781 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShoppingProductLookupKt.findShoppingProduct(null, null, null, null, this);
        }

        public C137781(HtJ<? super C137781> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt", f = "ShoppingProductLookup.kt", l = {23}, m = "findShoppingResults", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt$findShoppingResults$1, reason: invalid class name and case insensitive filesystem */
    public final class C137791 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShoppingProductLookupKt.findShoppingResults(null, null, null, null, this);
        }

        public C137791(HtJ<? super C137791> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object findShoppingCart(com.facebook.aura.conversation.offline.HatchOfflineConversationRepository r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, X.HtJ<? super com.facebook.aura.shopping.model.ShoppingCartPresentation> r9) {
        /*
            boolean r0 = r9 instanceof com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt.AnonymousClass1
            if (r0 == 0) goto L6c
            r4 = r9
            com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt$findShoppingCart$1 r4 = (com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L57
            if (r0 != r1) goto L72
            java.lang.Object r8 = r4.L$3
            X.Hwg.A00(r2)
        L22:
            com.facebook.aura.model.HatchMessage r2 = (com.facebook.aura.model.HatchMessage) r2
            r3 = 0
            if (r2 == 0) goto L54
            java.util.List<com.facebook.aura.model.HatchWidgetPresentation> r0 = r2.presentations
            if (r0 == 0) goto L54
            java.util.Iterator r2 = r0.iterator()
        L2f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.model.HatchWidgetPresentation r0 = (com.facebook.aura.model.HatchWidgetPresentation) r0
            java.lang.String r0 = r0.presentationId
            boolean r0 = X.C7384Etj.areEqual(r0, r8)
            if (r0 == 0) goto L2f
        L44:
            com.facebook.aura.model.HatchWidgetPresentation r1 = (com.facebook.aura.model.HatchWidgetPresentation) r1
            if (r1 == 0) goto L54
            com.facebook.aura.model.HatchPresentationData r1 = r1.data
            boolean r0 = r1 instanceof com.facebook.aura.model.ShoppingCartPresentationData
            if (r0 == 0) goto L54
            com.facebook.aura.model.ShoppingCartPresentationData r1 = (com.facebook.aura.model.ShoppingCartPresentationData) r1
            if (r1 == 0) goto L54
            com.facebook.aura.shopping.model.ShoppingCartPresentation r3 = r1.shoppingCart
        L54:
            return r3
        L55:
            r1 = r3
            goto L44
        L57:
            X.Hwg.A00(r2)
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r8
            r4.label = r1
            java.lang.Object r2 = r5.findMessage(r6, r7, r4)
            if (r2 != r3) goto L22
            return r3
        L6c:
            com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt$findShoppingCart$1 r4 = new com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt$findShoppingCart$1
            r4.<init>(r9)
            goto L12
        L72:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt.findShoppingCart(com.facebook.aura.conversation.offline.HatchOfflineConversationRepository, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object findShoppingProduct(com.facebook.aura.conversation.offline.HatchOfflineConversationRepository r9, java.lang.String r10, java.lang.String r11, com.facebook.aura.shopping.model.ShoppingProductSource r12, X.HtJ<? super com.facebook.aura.shopping.model.ShoppingResultProduct> r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt.findShoppingProduct(com.facebook.aura.conversation.offline.HatchOfflineConversationRepository, java.lang.String, java.lang.String, com.facebook.aura.shopping.model.ShoppingProductSource, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object findShoppingResults(com.facebook.aura.conversation.offline.HatchOfflineConversationRepository r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, X.HtJ<? super com.facebook.aura.shopping.model.ShoppingResultsPresentation> r9) {
        /*
            boolean r0 = r9 instanceof com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt.C137791
            if (r0 == 0) goto L41
            r4 = r9
            com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt$findShoppingResults$1 r4 = (com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt.C137791) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L49
            java.lang.Object r0 = r4.L$3
            java.lang.String r8 = X.C3cG.A0d(r0, r3)
        L23:
            com.facebook.aura.model.HatchMessage r3 = (com.facebook.aura.model.HatchMessage) r3
            if (r3 == 0) goto L47
            com.facebook.aura.shopping.model.ShoppingResultsPresentation r2 = shoppingResults(r3, r8)
            return r2
        L2c:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r8
            r4.label = r1
            java.lang.Object r3 = r5.findMessage(r6, r7, r4)
            if (r3 != r2) goto L23
            return r2
        L41:
            com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt$findShoppingResults$1 r4 = new com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt$findShoppingResults$1
            r4.<init>(r9)
            goto L12
        L47:
            r2 = 0
            return r2
        L49:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt.findShoppingResults(com.facebook.aura.conversation.offline.HatchOfflineConversationRepository, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public static final ShoppingResultsPresentation shoppingResults(HatchMessage hatchMessage, String str) {
        ShoppingResultsPresentationData shoppingResultsPresentationData;
        List<HatchWidgetPresentation> list = hatchMessage.presentations;
        if (list != null) {
            for (HatchWidgetPresentation hatchWidgetPresentation : list) {
                HatchPresentationData hatchPresentationData = hatchWidgetPresentation.data;
                if ((hatchPresentationData instanceof ShoppingResultsPresentationData) && (shoppingResultsPresentationData = (ShoppingResultsPresentationData) hatchPresentationData) != null && (str == null || str.equals(hatchWidgetPresentation.presentationId))) {
                    ShoppingResultsPresentation shoppingResultsPresentation = shoppingResultsPresentationData.shoppingResults;
                    if (shoppingResultsPresentation != null) {
                        return shoppingResultsPresentation;
                    }
                }
            }
        }
        return null;
    }
}
