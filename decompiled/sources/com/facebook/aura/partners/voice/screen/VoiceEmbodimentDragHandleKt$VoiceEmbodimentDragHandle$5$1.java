package com.facebook.aura.partners.voice.screen;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.BHP;
import X.C1g2;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$5$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ String $expandLabel;
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ String $label;
    public final /* synthetic */ String $minimizeLabel;
    public final /* synthetic */ VoiceEmbodimentResize $resize;
    public final /* synthetic */ String $state;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$5$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ VoiceEmbodimentResize $resize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoiceEmbodimentResize voiceEmbodimentResize) {
            super(0);
            this.$resize = voiceEmbodimentResize;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$resize.step(false));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$5$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ VoiceEmbodimentResize $resize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VoiceEmbodimentResize voiceEmbodimentResize) {
            super(0);
            this.$resize = voiceEmbodimentResize;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$resize.step(true));
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        String str;
        Function0 anonymousClass2;
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        C1g2.A00(interfaceC0857A6e);
        AbstractC1564Ale.A08(interfaceC0857A6e, this.$label);
        AbstractC1564Ale.A09(interfaceC0857A6e, this.$state);
        if (this.$fullScreen.getExpanded()) {
            str = this.$minimizeLabel;
            anonymousClass2 = new AnonymousClass1(this.$resize);
        } else {
            str = this.$expandLabel;
            anonymousClass2 = new AnonymousClass2(this.$resize);
        }
        AbstractC1564Ale.A0C(interfaceC0857A6e, Collections.singletonList(new BHP(str, anonymousClass2)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$5$1(String str, String str2, VoiceAvatarFullScreenState voiceAvatarFullScreenState, String str3, String str4, VoiceEmbodimentResize voiceEmbodimentResize) {
        super(1);
        this.$label = str;
        this.$state = str2;
        this.$fullScreen = voiceAvatarFullScreenState;
        this.$minimizeLabel = str3;
        this.$expandLabel = str4;
        this.$resize = voiceEmbodimentResize;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
