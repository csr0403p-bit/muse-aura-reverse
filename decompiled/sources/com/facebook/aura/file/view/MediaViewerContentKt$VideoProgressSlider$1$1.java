package com.facebook.aura.file.view;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C2Cx;
import X.C2Cy;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$VideoProgressSlider$1$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ G0U<Float, Unit> $onProgressChanged;
    public final /* synthetic */ G0U<Float, Unit> $onSeekFinished;
    public final /* synthetic */ float $progress;

    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$VideoProgressSlider$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Float, Boolean> {
        public final /* synthetic */ G0U<Float, Unit> $onProgressChanged;
        public final /* synthetic */ G0U<Float, Unit> $onSeekFinished;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0U<? super Float, Unit> g0u, G0U<? super Float, Unit> g0u2) {
            super(1);
            this.$onProgressChanged = g0u;
            this.$onSeekFinished = g0u2;
        }

        public final Boolean invoke(float f) {
            float fA00 = AnonymousClass003.A00(f);
            G0U<Float, Unit> g0u = this.$onProgressChanged;
            Float fValueOf = Float.valueOf(fA00);
            g0u.invoke(fValueOf);
            this.$onSeekFinished.invoke(fValueOf);
            return AnonymousClass001.A0i();
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
            return invoke(AnonymousClass001.A02(f));
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        C2Cx c2Cx = C2Cx.A03;
        C2Cy.A00(interfaceC0857A6e, this.$progress);
        AbstractC1564Ale.A0D(interfaceC0857A6e, new AnonymousClass1(this.$onProgressChanged, this.$onSeekFinished));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$VideoProgressSlider$1$1(float f, G0U<? super Float, Unit> g0u, G0U<? super Float, Unit> g0u2) {
        super(1);
        this.$progress = f;
        this.$onProgressChanged = g0u;
        this.$onSeekFinished = g0u2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
