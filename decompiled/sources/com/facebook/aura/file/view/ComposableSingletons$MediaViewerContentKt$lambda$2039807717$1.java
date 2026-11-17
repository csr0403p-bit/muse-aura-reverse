package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C06c;
import X.C10G;
import X.C78N;
import X.G2j;
import com.facebook.aura.file.view.api.ContentViewerPageAccessory;
import com.facebook.aura.file.view.api.ContentViewerPageAccessoryRenderer;
import com.facebook.aura.file.view.api.ContentViewerPageAccessoryRenderers;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import kotlin.Unit;

/* renamed from: com.facebook.aura.file.view.ComposableSingletons$MediaViewerContentKt$lambda$-2039807717$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$MediaViewerContentKt$lambda$2039807717$1 extends AbstractC7559F3s implements G2j<C06c, ContentViewerPageAccessory, BFM, Integer, Unit> {
    public static final ComposableSingletons$MediaViewerContentKt$lambda$2039807717$1 INSTANCE = new ComposableSingletons$MediaViewerContentKt$lambda$2039807717$1();

    public ComposableSingletons$MediaViewerContentKt$lambda$2039807717$1() {
        super(4);
    }

    public final void invoke(C06c c06c, ContentViewerPageAccessory contentViewerPageAccessory, BFM bfm, int i) {
        if ((i & 48) == 0) {
            i |= AnonymousClass004.A0e(bfm, contentViewerPageAccessory);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, i)) {
            bfm.Afo();
            return;
        }
        boolean zA1O = AnonymousClass001.A1O(i);
        Object objAaT = bfm.AaT();
        if (zA1O || objAaT == C78N.A00) {
            objAaT = contentViewerPageAccessory != null ? ContentViewerPageAccessoryRenderers.INSTANCE.rendererFor(contentViewerPageAccessory) : null;
            bfm.Ai0(objAaT);
        }
        ContentViewerPageAccessoryRenderer contentViewerPageAccessoryRenderer = (ContentViewerPageAccessoryRenderer) objAaT;
        if (contentViewerPageAccessory == null || contentViewerPageAccessoryRenderer == null) {
            bfm.AgE(1580801127);
        } else {
            bfm.AgE(1580740584);
            contentViewerPageAccessoryRenderer.Content(contentViewerPageAccessory, C10G.A02, bfm, ((i >> 3) & 14) | 48);
        }
        AnonymousClass002.A19(bfm);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C06c c06c, ContentViewerPageAccessory contentViewerPageAccessory, BFM bfm, Integer num) {
        invoke(c06c, contentViewerPageAccessory, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
