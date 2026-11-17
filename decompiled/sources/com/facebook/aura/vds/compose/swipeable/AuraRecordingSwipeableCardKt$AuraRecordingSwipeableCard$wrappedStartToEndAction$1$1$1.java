package com.facebook.aura.vds.compose.swipeable;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.B10;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC2178B0w;
import android.graphics.Bitmap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraRecordingSwipeableCardKt$AuraRecordingSwipeableCard$wrappedStartToEndAction$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<Bitmap, Unit> $action;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ boolean $enableRecording;
    public final /* synthetic */ GraphicsLayer $graphicsLayer;

    @DebugMetadata(c = "com.facebook.aura.vds.compose.swipeable.AuraRecordingSwipeableCardKt$AuraRecordingSwipeableCard$wrappedStartToEndAction$1$1$1$1", f = "AuraRecordingSwipeableCard.kt", l = {90}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraRecordingSwipeableCardKt$AuraRecordingSwipeableCard$wrappedStartToEndAction$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<Bitmap, Unit> $action;
        public final /* synthetic */ boolean $enableRecording;
        public final /* synthetic */ GraphicsLayer $graphicsLayer;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z, GraphicsLayer graphicsLayer, G0U<? super Bitmap, Unit> g0u, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$enableRecording = z;
            this.$graphicsLayer = graphicsLayer;
            this.$action = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$enableRecording, this.$graphicsLayer, this.$action, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            GraphicsLayer graphicsLayer;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            Bitmap bitmapA00 = null;
            if (i == 0) {
                Hwg.A00(obj);
                if (this.$enableRecording && (graphicsLayer = this.$graphicsLayer) != null) {
                    this.label = 1;
                    obj = graphicsLayer.A08(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                this.$action.invoke(bitmapA00);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            bitmapA00 = B10.A00((InterfaceC2178B0w) obj);
            this.$action.invoke(bitmapA00);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraRecordingSwipeableCardKt$AuraRecordingSwipeableCard$wrappedStartToEndAction$1$1$1(C3UX c3ux, boolean z, GraphicsLayer graphicsLayer, G0U<? super Bitmap, Unit> g0u) {
        super(0);
        this.$coroutineScope = c3ux;
        this.$enableRecording = z;
        this.$graphicsLayer = graphicsLayer;
        this.$action = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1J(new AnonymousClass1(this.$enableRecording, this.$graphicsLayer, this.$action, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
