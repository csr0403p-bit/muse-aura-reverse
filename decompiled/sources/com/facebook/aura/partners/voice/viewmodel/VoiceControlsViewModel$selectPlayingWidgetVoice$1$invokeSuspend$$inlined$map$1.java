package com.facebook.aura.partners.voice.viewmodel;

import X.C20Q;
import X.C20Z;
import X.HtJ;
import X.HzP;
import com.facebook.aura.model.VoiceOptionData;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1 implements C20Q<VoiceOptionData> {
    public final /* synthetic */ List $options$inlined;
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;
    public final /* synthetic */ VoiceControlsViewModel this$0;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1", f = "VoiceControlsViewModel.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1$1, reason: invalid class name */
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
            return VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ List $options$inlined;
        public final /* synthetic */ C20Z $this_unsafeFlow;
        public final /* synthetic */ VoiceControlsViewModel this$0;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1$2", f = "VoiceControlsViewModel.kt", l = {217}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

        public AnonymousClass2(C20Z c20z, List list, VoiceControlsViewModel voiceControlsViewModel) {
            this.$this_unsafeFlow = c20z;
            this.$options$inlined = list;
            this.this$0 = voiceControlsViewModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r10, X.HtJ r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L7d
                r7 = r11
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1$2$1 r7 = (com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                int r2 = r7.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L7d
                int r2 = r2 - r1
                r7.label = r2
            L12:
                java.lang.Object r1 = r7.result
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r8 = 1
                if (r0 == 0) goto L23
                if (r0 != r8) goto L83
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L23:
                X.Hwg.A00(r1)
                X.20Z r5 = r9.$this_unsafeFlow
                com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayback r10 = (com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayback) r10
                r4 = 0
                if (r10 == 0) goto L7b
                com.facebook.aura.partners.voice.viewmodel.VoicePreviewKey r0 = r10.key
                java.lang.String r2 = r0.ownerId
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel r1 = r9.this$0
                int r0 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.$stable
                java.lang.String r0 = r1.previewOwnerId
                boolean r0 = X.C7384Etj.areEqual(r2, r0)
                if (r0 == 0) goto L7b
                com.facebook.aura.partners.voice.viewmodel.VoicePreviewPhase r1 = r10.phase
                com.facebook.aura.partners.voice.viewmodel.VoicePreviewPhase r0 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewPhase.PLAYING
                if (r1 != r0) goto L7b
            L43:
                java.util.List r0 = r9.$options$inlined
                java.util.Iterator r3 = r0.iterator()
            L49:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L67
                java.lang.Object r2 = r3.next()
                r0 = r2
                com.facebook.aura.model.VoiceOptionData r0 = (com.facebook.aura.model.VoiceOptionData) r0
                java.lang.String r1 = r0.voiceId
                if (r10 == 0) goto L79
                com.facebook.aura.partners.voice.viewmodel.VoicePreviewKey r0 = r10.key
                if (r0 == 0) goto L79
                java.lang.String r0 = r0.voiceId
            L60:
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L49
                r4 = r2
            L67:
                r0 = 0
                r7.L$0 = r0
                r7.L$1 = r0
                r7.L$2 = r0
                r7.L$3 = r0
                r7.label = r8
                java.lang.Object r0 = r5.emit(r4, r7)
                if (r0 != r6) goto L20
                return r6
            L79:
                r0 = r4
                goto L60
            L7b:
                r10 = r4
                goto L43
            L7d:
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1$2$1 r7 = new com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1$2$1
                r7.<init>(r11)
                goto L12
            L83:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1(C20Q c20q, List list, VoiceControlsViewModel voiceControlsViewModel) {
        this.$this_unsafeTransform$inlined = c20q;
        this.$options$inlined = list;
        this.this$0 = voiceControlsViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super com.facebook.aura.model.VoiceOptionData> r8, X.HtJ r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1.AnonymousClass1
            if (r0 == 0) goto L41
            r6 = r9
            com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1$1 r6 = (com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1.AnonymousClass1) r6
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
            java.util.List r2 = r7.$options$inlined
            com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel r0 = r7.this$0
            com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1$2 r1 = new com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1$2
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
            com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1$1 r6 = new com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1$1
            r6.<init>(r9)
            goto L12
        L47:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
