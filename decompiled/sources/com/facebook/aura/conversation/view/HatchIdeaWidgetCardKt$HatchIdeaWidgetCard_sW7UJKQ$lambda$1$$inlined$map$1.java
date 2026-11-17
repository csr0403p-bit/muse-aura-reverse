package com.facebook.aura.conversation.view;

import X.C20Q;
import X.C20Z;
import X.HtJ;
import X.HzP;
import com.facebook.aura.explore.repo.IdeaCardExecutionState;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1 implements C20Q<IdeaCardExecutionState> {
    public final /* synthetic */ IdeaWidgetData $data$inlined;
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1", f = "HatchIdeaWidgetCard.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1$1, reason: invalid class name */
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
            return HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ IdeaWidgetData $data$inlined;
        public final /* synthetic */ C20Z $this_unsafeFlow;

        @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1$2", f = "HatchIdeaWidgetCard.kt", l = {217}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends HzP {
            public int I$0;
            public Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
            public Object L$4;
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

        public AnonymousClass2(C20Z c20z, IdeaWidgetData ideaWidgetData) {
            this.$this_unsafeFlow = c20z;
            this.$data$inlined = ideaWidgetData;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r9, X.HtJ r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L7f
                r6 = r10
                com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1$2$1 r6 = (com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                int r2 = r6.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L7f
                int r2 = r2 - r1
                r6.label = r2
            L12:
                java.lang.Object r1 = r6.result
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r7 = 1
                if (r0 == 0) goto L23
                if (r0 != r7) goto L85
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L23:
                X.Hwg.A00(r1)
                X.20Z r4 = r8.$this_unsafeFlow
                com.facebook.aura.explore.model.HatchExploreViewModel$IdeasUiState r9 = (com.facebook.aura.explore.model.HatchExploreViewModel.IdeasUiState) r9
                X.BO6<java.lang.String, com.facebook.aura.explore.repo.IdeaCardExecutionState> r1 = r9.executionStatuses
                com.facebook.aura.model.IdeaWidgetData r0 = r8.$data$inlined
                java.lang.String r0 = r0.ideaId
                java.lang.Object r1 = r1.get(r0)
                if (r1 != 0) goto L6d
                X.AHD<com.facebook.aura.explore.repo.IdeaCardSection> r0 = r9.sections
                X.8iN r1 = X.AbstractC0878AGe.A06(r0)
                com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard$executionStateFlow$1$1$1 r0 = com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard$executionStateFlow$1$1$1.INSTANCE
                X.AGX r0 = X.A6B.A05(r0, r1)
                X.BTQ r3 = new X.BTQ
                r3.<init>(r0)
            L47:
                boolean r0 = r3.hasNext()
                r2 = 0
                if (r0 == 0) goto L61
                java.lang.Object r2 = r3.next()
                r0 = r2
                com.facebook.aura.explore.repo.IdeaCard r0 = (com.facebook.aura.explore.repo.IdeaCard) r0
                java.lang.String r1 = r0.ideaCardId
                com.facebook.aura.model.IdeaWidgetData r0 = r8.$data$inlined
                java.lang.String r0 = r0.ideaId
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L47
            L61:
                com.facebook.aura.explore.repo.IdeaCard r2 = (com.facebook.aura.explore.repo.IdeaCard) r2
                if (r2 == 0) goto L6b
                com.facebook.aura.explore.repo.IdeaCardExecutionState r1 = r2.getServerExecutionState()
                if (r1 != 0) goto L6d
            L6b:
                com.facebook.aura.explore.repo.IdeaCardExecutionState r1 = com.facebook.aura.explore.repo.IdeaCardExecutionState.IDLE
            L6d:
                r0 = 0
                r6.L$0 = r0
                r6.L$1 = r0
                r6.L$2 = r0
                r6.L$3 = r0
                r6.label = r7
                java.lang.Object r0 = r4.emit(r1, r6)
                if (r0 != r5) goto L20
                return r5
            L7f:
                com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1$2$1 r6 = new com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1$2$1
                r6.<init>(r10)
                goto L12
            L85:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1(C20Q c20q, IdeaWidgetData ideaWidgetData) {
        this.$this_unsafeTransform$inlined = c20q;
        this.$data$inlined = ideaWidgetData;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super com.facebook.aura.explore.repo.IdeaCardExecutionState> r7, X.HtJ r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1.AnonymousClass1
            if (r0 == 0) goto L3f
            r5 = r8
            com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1$1 r5 = (com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L45
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.20Q r2 = r6.$this_unsafeTransform$inlined
            com.facebook.aura.model.IdeaWidgetData r0 = r6.$data$inlined
            com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1$2 r1 = new com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1$2
            r1.<init>(r7, r0)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r3
            java.lang.Object r0 = r2.collect(r1, r5)
            if (r0 != r4) goto L20
            return r4
        L3f:
            com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1$1 r5 = new com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1$1
            r5.<init>(r8)
            goto L12
        L45:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchIdeaWidgetCardKt$HatchIdeaWidgetCard_sW7UJKQ$lambda$1$$inlined$map$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
