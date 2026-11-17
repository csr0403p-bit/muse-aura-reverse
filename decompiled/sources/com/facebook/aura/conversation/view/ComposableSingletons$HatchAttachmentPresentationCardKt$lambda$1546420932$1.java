package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.C10G;
import X.G0U;
import X.G2l;
import com.facebook.aura.file.view.FileThumbnailPreviewKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchAttachmentPresentationCardKt$lambda$1546420932$1 extends AbstractC7559F3s implements G2l<String, String, String, G0U<? super String, ? extends Unit>, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchAttachmentPresentationCardKt$lambda$1546420932$1 INSTANCE = new ComposableSingletons$HatchAttachmentPresentationCardKt$lambda$1546420932$1();

    public ComposableSingletons$HatchAttachmentPresentationCardKt$lambda$1546420932$1() {
        super(6);
    }

    public final void invoke(String str, String str2, String str3, G0U<? super String, Unit> g0u, BFM bfm, int i) {
        AnonymousClass005.A0y(str, str2, g0u);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            FileThumbnailPreviewKt.FileThumbnailPreview(str, str2, null, C10G.A01, str3, g0u, null, bfm, AnonymousClass004.A03(iA0d << 6, (iA0d & 14) | 3456 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)), 64);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G2l
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3, G0U<? super String, ? extends Unit> g0u, BFM bfm, Integer num) {
        invoke(str, str2, str3, (G0U<? super String, Unit>) g0u, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
