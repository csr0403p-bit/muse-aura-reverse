package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.G0W;
import com.facebook.aura.file.view.api.ContentViewerBottomActionsRenderer;
import com.facebook.aura.navigation.key.ContentViewerBottomActions;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ContentViewerScreenKt$ContentViewerContent$bottomAction$1$1$1$1 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ ContentViewerBottomActions $actions;
    public final /* synthetic */ Function0<Unit> $onDone;
    public final /* synthetic */ ContentViewerBottomActionsRenderer $renderer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentViewerScreenKt$ContentViewerContent$bottomAction$1$1$1$1(ContentViewerBottomActionsRenderer contentViewerBottomActionsRenderer, ContentViewerBottomActions contentViewerBottomActions, Function0<Unit> function0) {
        super(3);
        this.$renderer = contentViewerBottomActionsRenderer;
        this.$actions = contentViewerBottomActions;
        this.$onDone = function0;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BRg bRg, BFM bfm, int i) {
        if (AnonymousClass002.A0B(bRg, i) == 0) {
            i |= AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            this.$renderer.Content(this.$actions, this.$onDone, bRg, bfm, (i << 6) & 896);
        } else {
            bfm.Afo();
        }
    }
}
