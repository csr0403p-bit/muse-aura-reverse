package com.facebook.aura.browsertask.conversation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C10G;
import X.G0V;
import com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore;
import com.facebook.aura.browsertask.view.BrowserTaskCardContentKt;
import com.facebook.aura.localbrowser.LocalBrowserTaskViewerKt;
import com.facebook.aura.model.BrowserTaskPresentation;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchBrowserTaskCardKt$HatchBrowserTaskCard$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ BrowserTaskPresentation $browserTask;
    public final /* synthetic */ boolean $isPresented;
    public final /* synthetic */ boolean $localTask;
    public final /* synthetic */ boolean $otherDeviceTask;
    public final /* synthetic */ BrowserTaskPresentationStore $presentation;
    public final /* synthetic */ String $screenshotUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchBrowserTaskCardKt$HatchBrowserTaskCard$1(BrowserTaskPresentation browserTaskPresentation, BrowserTaskPresentationStore browserTaskPresentationStore, String str, boolean z, boolean z2, boolean z3) {
        super(2);
        this.$browserTask = browserTaskPresentation;
        this.$presentation = browserTaskPresentationStore;
        this.$screenshotUrl = str;
        this.$isPresented = z;
        this.$localTask = z2;
        this.$otherDeviceTask = z3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            if (this.$browserTask.execution.isVm()) {
                bfm.AgE(-96872044);
                HatchBrowserTaskCardKt.BrowserTaskCardPreview(this.$presentation, this.$screenshotUrl, this.$isPresented, C10G.A01, null, bfm, BrowserTaskPresentationStore.$stable | 3072, 16);
            } else if (this.$localTask) {
                bfm.AgE(1292161319);
                LocalBrowserTaskViewerKt.LocalBrowserTaskPreview(this.$browserTask.browserTaskId, C10G.A01, bfm, 48, 0);
            } else if (this.$otherDeviceTask) {
                bfm.AgE(-96860976);
                HatchBrowserTaskCardKt.OtherDeviceTaskPreview(this.$browserTask, this.$presentation, null, bfm, (BrowserTaskPresentationStore.$stable << 3) | BrowserTaskPresentation.$stable, 4);
            } else {
                bfm.AgE(-96858916);
                BrowserTaskCardContentKt.BrowserTaskCardPlaceholder(C10G.A01, bfm, 6, 0);
            }
            AnonymousClass001.A1D(bfm);
            return;
        }
        bfm.Afo();
    }
}
