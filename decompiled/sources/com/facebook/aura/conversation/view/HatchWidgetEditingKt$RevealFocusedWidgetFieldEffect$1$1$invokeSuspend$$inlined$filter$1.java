package com.facebook.aura.conversation.view;

import X.C1BO;
import X.C20Q;
import X.C20Z;
import X.C2A9;
import X.HtJ;
import X.HzP;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1 implements C20Q<C2A9> {
    public final /* synthetic */ C1BO $isEditingWidgetField$delegate$inlined;
    public final /* synthetic */ LazyListState $listState$inlined;
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1", f = "HatchWidgetEditing.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1$1, reason: invalid class name */
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
            return HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ C1BO $isEditingWidgetField$delegate$inlined;
        public final /* synthetic */ LazyListState $listState$inlined;
        public final /* synthetic */ C20Z $this_unsafeFlow;

        @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1$2", f = "HatchWidgetEditing.kt", l = {217}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends HzP {
            public int I$0;
            public Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(HtJ htJ) {
                super(htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(C20Z c20z, LazyListState lazyListState, C1BO c1bo) {
            this.$this_unsafeFlow = c20z;
            this.$listState$inlined = lazyListState;
            this.$isEditingWidgetField$delegate$inlined = c1bo;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, X.HtJ r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L50
                r4 = r7
                com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1$2$1 r4 = (com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L50
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r1 = r4.result
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r2 = 1
                if (r0 == 0) goto L23
                if (r0 != r2) goto L56
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L23:
                X.Hwg.A00(r1)
                X.20Z r1 = r5.$this_unsafeFlow
                X.1BO r0 = r5.$isEditingWidgetField$delegate$inlined
                java.lang.Object r0 = r0.getValue()
                kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
                boolean r0 = X.AnonymousClass003.A1Y(r0)
                if (r0 == 0) goto L20
                androidx.compose.foundation.lazy.LazyListState r0 = r5.$listState$inlined
                boolean r0 = r0.AOz()
                if (r0 != 0) goto L20
                r0 = 0
                r4.L$0 = r0
                r4.L$1 = r0
                r4.L$2 = r0
                r4.L$3 = r0
                r4.label = r2
                java.lang.Object r0 = r1.emit(r6, r4)
                if (r0 != r3) goto L20
                return r3
            L50:
                com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1$2$1 r4 = new com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1$2$1
                r4.<init>(r7)
                goto L12
            L56:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1(C20Q c20q, LazyListState lazyListState, C1BO c1bo) {
        this.$this_unsafeTransform$inlined = c20q;
        this.$listState$inlined = lazyListState;
        this.$isEditingWidgetField$delegate$inlined = c1bo;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super X.C2A9> r8, X.HtJ r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass1
            if (r0 == 0) goto L41
            r6 = r9
            com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1$1 r6 = (com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L23
            if (r0 != r4) goto L47
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L23:
            X.Hwg.A00(r1)
            X.20Q r3 = r7.$this_unsafeTransform$inlined
            androidx.compose.foundation.lazy.LazyListState r2 = r7.$listState$inlined
            X.1BO r0 = r7.$isEditingWidgetField$delegate$inlined
            com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1$2 r1 = new com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1$2
            r1.<init>(r8, r2, r0)
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.L$2 = r0
            r6.label = r4
            java.lang.Object r0 = r3.collect(r1, r6)
            if (r0 != r5) goto L20
            return r5
        L41:
            com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1$1 r6 = new com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1$1
            r6.<init>(r9)
            goto L12
        L47:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
