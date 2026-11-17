package com.facebook.aura.conversation.view;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C1BO;
import X.C2Cx;
import X.C2Cy;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchCompactAudioPlayerKt$CompactAudioWaveformBars$1$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ C1BO<G0U<Float, Unit>> $currentOnScrubFinished$delegate;
    public final /* synthetic */ boolean $interactive;
    public final /* synthetic */ String $seekLabel;
    public final /* synthetic */ String $seekState;
    public final /* synthetic */ float $semanticsProgress;

    /* renamed from: com.facebook.aura.conversation.view.HatchCompactAudioPlayerKt$CompactAudioWaveformBars$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Float, Boolean> {
        public final /* synthetic */ C1BO<G0U<Float, Unit>> $currentOnScrubFinished$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C1BO<? extends G0U<? super Float, Unit>> c1bo) {
            super(1);
            this.$currentOnScrubFinished$delegate = c1bo;
        }

        public final Boolean invoke(float f) {
            boolean z;
            G0U g0uA0B = C1BO.A0B(this.$currentOnScrubFinished$delegate);
            if (g0uA0B != null) {
                g0uA0B.invoke(Float.valueOf(AnonymousClass003.A00(f)));
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
            return invoke(AnonymousClass001.A02(f));
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A08(interfaceC0857A6e, this.$seekLabel);
        AbstractC1564Ale.A09(interfaceC0857A6e, this.$seekState);
        C2Cx c2Cx = C2Cx.A03;
        C2Cy.A00(interfaceC0857A6e, this.$semanticsProgress);
        if (this.$interactive) {
            AbstractC1564Ale.A0D(interfaceC0857A6e, new AnonymousClass1(this.$currentOnScrubFinished$delegate));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCompactAudioPlayerKt$CompactAudioWaveformBars$1$1(String str, String str2, float f, boolean z, C1BO<? extends G0U<? super Float, Unit>> c1bo) {
        super(1);
        this.$seekLabel = str;
        this.$seekState = str2;
        this.$semanticsProgress = f;
        this.$interactive = z;
        this.$currentOnScrubFinished$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
