package com.facebook.aura.vds.compose.swipeable;

import X.ART;
import X.AT3;
import X.AbstractC7559F3s;
import X.C16Z;
import X.C7384Etj;
import X.G0U;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraRecordingSwipeableCardKt$OnDemandRecordingContent$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ GraphicsLayer $graphicsLayer;
    public final /* synthetic */ boolean $isSwipeActive;

    /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraRecordingSwipeableCardKt$OnDemandRecordingContent$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
        public final /* synthetic */ C16Z $this_drawWithContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C16Z c16z) {
            super(1);
            this.$this_drawWithContent = c16z;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
            this.$this_drawWithContent.A9O();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AT3 at3) {
            this.$this_drawWithContent.A9O();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C7384Etj.A0Y(c16z, 0);
        if (this.$isSwipeActive) {
            ART.A04(c16z, this.$graphicsLayer, new AnonymousClass1(c16z));
        }
        c16z.A9O();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraRecordingSwipeableCardKt$OnDemandRecordingContent$1$1(boolean z, GraphicsLayer graphicsLayer) {
        super(1);
        this.$isSwipeActive = z;
        this.$graphicsLayer = graphicsLayer;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
