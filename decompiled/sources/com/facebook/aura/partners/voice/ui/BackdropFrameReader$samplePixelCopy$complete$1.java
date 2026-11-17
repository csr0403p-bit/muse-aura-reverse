package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C7384Etj;
import X.F60;
import X.G0U;
import X.G0V;
import android.graphics.Bitmap;
import android.os.Handler;
import com.facebook.aura.partners.voice.ui.BackdropFrameReader;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BackdropFrameReader$samplePixelCopy$complete$1 extends AbstractC7559F3s implements G0V<Integer, Boolean, Unit> {
    public final /* synthetic */ Handler $callbackHandler;
    public final /* synthetic */ BackdropFrameReader.SampleKind $kind;
    public final /* synthetic */ G0U<BackdropFrameReader.PixelCopyColorResult, Unit> $onResult;
    public final /* synthetic */ G0U<Bitmap, Integer> $readColor;
    public final /* synthetic */ int $requestGeneration;
    public final /* synthetic */ AtomicBoolean $resultCompleted;
    public final /* synthetic */ Bitmap $target;
    public final /* synthetic */ AtomicBoolean $targetReconciled;
    public final /* synthetic */ C10543Hqv<Runnable> $timeout;
    public final /* synthetic */ BackdropFrameReader this$0;

    public final void invoke(Integer num, boolean z) {
        Integer numInvoke = null;
        if (z) {
            Handler handler = this.$callbackHandler;
            Runnable runnable = this.$timeout.element;
            if (runnable == null) {
                C7384Etj.A0b("timeout");
                throw F60.createAndThrow();
            }
            handler.removeCallbacks(runnable);
        }
        boolean z2 = false;
        boolean zCompareAndSet = this.$resultCompleted.compareAndSet(false, true);
        if (z) {
            if (!this.$targetReconciled.compareAndSet(false, true)) {
                return;
            }
            if (this.$requestGeneration != this.this$0.generation) {
                this.$target.recycle();
                return;
            }
            if (!zCompareAndSet) {
                this.this$0.cacheBitmap(this.$kind, this.$target);
                return;
            }
            if (num != null && num.intValue() == 0) {
                z2 = true;
                numInvoke = this.$readColor.invoke(this.$target);
            }
            this.this$0.cacheBitmap(this.$kind, this.$target);
        } else if (!zCompareAndSet || this.$requestGeneration != this.this$0.generation) {
            return;
        }
        this.$onResult.invoke(new BackdropFrameReader.PixelCopyColorResult(z2, numInvoke));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackdropFrameReader$samplePixelCopy$complete$1(Handler handler, C10543Hqv<Runnable> c10543Hqv, AtomicBoolean atomicBoolean, int i, BackdropFrameReader backdropFrameReader, G0U<? super BackdropFrameReader.PixelCopyColorResult, Unit> g0u, AtomicBoolean atomicBoolean2, Bitmap bitmap, BackdropFrameReader.SampleKind sampleKind, G0U<? super Bitmap, Integer> g0u2) {
        super(2);
        this.$callbackHandler = handler;
        this.$timeout = c10543Hqv;
        this.$resultCompleted = atomicBoolean;
        this.$requestGeneration = i;
        this.this$0 = backdropFrameReader;
        this.$onResult = g0u;
        this.$targetReconciled = atomicBoolean2;
        this.$target = bitmap;
        this.$kind = sampleKind;
        this.$readColor = g0u2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Boolean bool) {
        invoke(num, AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
