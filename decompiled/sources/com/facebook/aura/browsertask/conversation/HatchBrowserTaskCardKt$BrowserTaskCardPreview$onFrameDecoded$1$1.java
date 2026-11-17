package com.facebook.aura.browsertask.conversation;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.graphics.Bitmap;
import com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchBrowserTaskCardKt$BrowserTaskCardPreview$onFrameDecoded$1$1 extends AbstractC7559F3s implements G0U<Bitmap, Unit> {
    public final /* synthetic */ boolean $isPresented;
    public final /* synthetic */ BrowserTaskPresentationStore $presentation;
    public final /* synthetic */ String $screenshotUri;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap bitmap) {
        C7384Etj.A0Y(bitmap, 0);
        if (this.$isPresented) {
            this.$presentation.onPreviewFrameDecoded(this.$screenshotUri, bitmap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchBrowserTaskCardKt$BrowserTaskCardPreview$onFrameDecoded$1$1(boolean z, BrowserTaskPresentationStore browserTaskPresentationStore, String str) {
        super(1);
        this.$isPresented = z;
        this.$presentation = browserTaskPresentationStore;
        this.$screenshotUri = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.INSTANCE;
    }
}
