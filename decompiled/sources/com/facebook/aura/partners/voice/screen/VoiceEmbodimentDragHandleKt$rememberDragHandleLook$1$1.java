package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C20Q;
import X.C3UX;
import X.C3pU;
import X.C6v3;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.HwV;
import X.Hwg;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import com.facebook.aura.partners.voice.ui.HatchEmbodimentVideoKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$rememberDragHandleLook$1$1", f = "VoiceEmbodimentDragHandle.kt", l = {227}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceEmbodimentDragHandleKt$rememberDragHandleLook$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Boolean> $darkBackdrop$delegate;
    public final /* synthetic */ DragHandleLook $look;
    public final /* synthetic */ VoiceEmbodimentResize $resize;
    public final /* synthetic */ long $sampleSize;
    public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;
    public int label;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$rememberDragHandleLook$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<HwV<? extends VoiceDragHandleToneSource, ? extends VoiceDragHandleRestingGeometry, ? extends Integer>> {
        public final /* synthetic */ C1BO<Boolean> $darkBackdrop$delegate;
        public final /* synthetic */ VoiceEmbodimentResize $resize;
        public final /* synthetic */ long $sampleSize;
        public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoiceAvatarTakeoverState voiceAvatarTakeoverState, VoiceEmbodimentResize voiceEmbodimentResize, long j, C1BO<Boolean> c1bo) {
            super(0);
            this.$takeoverState = voiceAvatarTakeoverState;
            this.$resize = voiceEmbodimentResize;
            this.$sampleSize = j;
            this.$darkBackdrop$delegate = c1bo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final HwV<? extends VoiceDragHandleToneSource, ? extends VoiceDragHandleRestingGeometry, ? extends Integer> invoke() {
            int iIntValue;
            VoiceDragHandleToneSource dragHandleToneSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen = this.$takeoverState.getDragHandleToneSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen();
            VoiceDragHandleRestingGeometry voiceDragHandleRestingGeometryM1776restingGeometryTmRCtEA = this.$resize.m1776restingGeometryTmRCtEA(this.$sampleSize, this.$takeoverState.getHalfScreenMediaBounds$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen());
            if (C1BO.A0F(this.$darkBackdrop$delegate)) {
                iIntValue = VoiceAvatarTakeoverKt.DARK_CALL_BACKDROP;
            } else {
                Integer backdropColor = this.$takeoverState.getBackdropColor();
                iIntValue = backdropColor != null ? backdropColor.intValue() : HatchEmbodimentVideoKt.HATCH_VIDEO_FALLBACK_BACKDROP;
            }
            return new HwV<>(dragHandleToneSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen, voiceDragHandleRestingGeometryM1776restingGeometryTmRCtEA, Integer.valueOf(iIntValue));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$rememberDragHandleLook$1$1$2", f = "VoiceEmbodimentDragHandle.kt", l = {231, 241, HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$rememberDragHandleLook$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<HwV<? extends VoiceDragHandleToneSource, ? extends VoiceDragHandleRestingGeometry, ? extends Integer>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ DragHandleLook $look;
        public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;
        public int I$0;
        public int I$1;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$rememberDragHandleLook$1$1$2$1", f = "VoiceEmbodimentDragHandle.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$rememberDragHandleLook$1$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super VoiceDragHandleTones>, Object> {
            public final /* synthetic */ int $backdrop;
            public final /* synthetic */ VoiceDragHandleRestingGeometry $geometry;
            public final /* synthetic */ DragHandleLook $look;
            public final /* synthetic */ VoiceDragHandleToneSource $source;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VoiceDragHandleToneSource voiceDragHandleToneSource, VoiceDragHandleRestingGeometry voiceDragHandleRestingGeometry, int i, DragHandleLook dragHandleLook, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$source = voiceDragHandleToneSource;
                this.$geometry = voiceDragHandleRestingGeometry;
                this.$backdrop = i;
                this.$look = dragHandleLook;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$source, this.$geometry, this.$backdrop, this.$look, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                try {
                    return VoiceDragHandleToneKt.measureDragHandleTones(this.$source, this.$geometry, this.$backdrop, this.$look.candidates);
                } catch (RuntimeException e) {
                    CFK.A0K(VoiceEmbodimentDragHandleKt.TAG, e, "Drag handle tone measurement failed");
                    return null;
                }
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super VoiceDragHandleTones> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VoiceAvatarTakeoverState voiceAvatarTakeoverState, DragHandleLook dragHandleLook, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$takeoverState = voiceAvatarTakeoverState;
            this.$look = dragHandleLook;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$takeoverState, this.$look, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(HwV<? extends VoiceDragHandleToneSource, ? extends VoiceDragHandleRestingGeometry, ? extends Integer> hwV, HtJ<? super Unit> htJ) {
            return invoke2((HwV<VoiceDragHandleToneSource, VoiceDragHandleRestingGeometry, Integer>) hwV, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 277
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$rememberDragHandleLook$1$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HwV<VoiceDragHandleToneSource, VoiceDragHandleRestingGeometry, Integer> hwV, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(hwV, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentDragHandleKt$rememberDragHandleLook$1$1(VoiceAvatarTakeoverState voiceAvatarTakeoverState, VoiceEmbodimentResize voiceEmbodimentResize, long j, C1BO<Boolean> c1bo, DragHandleLook dragHandleLook, HtJ<? super VoiceEmbodimentDragHandleKt$rememberDragHandleLook$1$1> htJ) {
        super(2, htJ);
        this.$takeoverState = voiceAvatarTakeoverState;
        this.$resize = voiceEmbodimentResize;
        this.$sampleSize = j;
        this.$darkBackdrop$delegate = c1bo;
        this.$look = dragHandleLook;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceEmbodimentDragHandleKt$rememberDragHandleLook$1$1(this.$takeoverState, this.$resize, this.$sampleSize, this.$darkBackdrop$delegate, this.$look, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q c20qA01 = GDB.A01(C6v3.A01(new AnonymousClass1(this.$takeoverState, this.$resize, this.$sampleSize, this.$darkBackdrop$delegate)));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$takeoverState, this.$look, null);
            this.label = 1;
            if (C3pU.A00(this, anonymousClass2, c20qA01) == enumC10460Hji) {
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

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((VoiceEmbodimentDragHandleKt$rememberDragHandleLook$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
