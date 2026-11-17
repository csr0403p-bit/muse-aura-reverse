package com.facebook.aura.partners.voice.ui;

import X.AWA;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.B10;
import X.B1T;
import X.C3UX;
import X.C3cG;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.InterfaceC2178B0w;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.ui.EmbodimentReferenceFramingKt$rememberEmbodimentReferencePlaceholder$1$1", f = "EmbodimentReferenceFraming.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class EmbodimentReferenceFramingKt$rememberEmbodimentReferencePlaceholder$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC2178B0w $frame;
    public final /* synthetic */ VoiceEmbodimentMedia.ReferenceFraming $framing;
    public final /* synthetic */ MutableState<InterfaceC2178B0w> $placeholder$delegate;
    public final /* synthetic */ long $viewport;
    public Object L$0;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.ui.EmbodimentReferenceFramingKt$rememberEmbodimentReferencePlaceholder$1$1$1", f = "EmbodimentReferenceFraming.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.ui.EmbodimentReferenceFramingKt$rememberEmbodimentReferencePlaceholder$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super InterfaceC2178B0w>, Object> {
        public final /* synthetic */ InterfaceC2178B0w $frame;
        public final /* synthetic */ VoiceEmbodimentMedia.ReferenceFraming $framing;
        public final /* synthetic */ long $viewport;
        public int label;

        /* renamed from: com.facebook.aura.partners.voice.ui.EmbodimentReferenceFramingKt$rememberEmbodimentReferencePlaceholder$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03241 extends AbstractC7559F3s implements Function0<InterfaceC2178B0w> {
            public final /* synthetic */ InterfaceC2178B0w $frame;
            public final /* synthetic */ VoiceEmbodimentMedia.ReferenceFraming $framing;
            public final /* synthetic */ long $viewport;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03241(InterfaceC2178B0w interfaceC2178B0w, long j, VoiceEmbodimentMedia.ReferenceFraming referenceFraming) {
                super(0);
                this.$frame = interfaceC2178B0w;
                this.$viewport = j;
                this.$framing = referenceFraming;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final InterfaceC2178B0w invoke() {
                Bitmap bitmapM1805frameEmbodimentBitmapeZhPAX0 = EmbodimentReferenceFramingKt.m1805frameEmbodimentBitmapeZhPAX0(B10.A00(this.$frame), this.$viewport, this.$framing, false, 0.0f);
                if (bitmapM1805frameEmbodimentBitmapeZhPAX0 != null) {
                    return new B1T(bitmapM1805frameEmbodimentBitmapeZhPAX0);
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC2178B0w interfaceC2178B0w, long j, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$frame = interfaceC2178B0w;
            this.$viewport = j;
            this.$framing = referenceFraming;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$frame, this.$viewport, this.$framing, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return HatchEmbodimentMediaKt.captureEmbodimentFrame(new C03241(this.$frame, this.$viewport, this.$framing));
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super InterfaceC2178B0w> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbodimentReferenceFramingKt$rememberEmbodimentReferencePlaceholder$1$1(InterfaceC2178B0w interfaceC2178B0w, long j, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, MutableState<InterfaceC2178B0w> mutableState, HtJ<? super EmbodimentReferenceFramingKt$rememberEmbodimentReferencePlaceholder$1$1> htJ) {
        super(2, htJ);
        this.$frame = interfaceC2178B0w;
        this.$viewport = j;
        this.$framing = referenceFraming;
        this.$placeholder$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new EmbodimentReferenceFramingKt$rememberEmbodimentReferencePlaceholder$1$1(this.$frame, this.$viewport, this.$framing, this.$placeholder$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$frame != null && !AWA.A06(this.$viewport)) {
                mutableState = this.$placeholder$delegate;
                C78T c78tA0v = C3cG.A0v();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$frame, this.$viewport, this.$framing, null);
                this.L$0 = mutableState;
                this.label = 1;
                obj = GAo.A00(this, c78tA0v, anonymousClass1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        mutableState = (MutableState) this.L$0;
        Hwg.A00(obj);
        mutableState.Af8(obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((EmbodimentReferenceFramingKt$rememberEmbodimentReferencePlaceholder$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
