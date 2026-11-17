package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFM;
import X.BRg;
import X.G2k;
import com.facebook.aura.conversation.view.HatchExternalLinkCardKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.assist.ComposableSingletons$HatchAssistOverlayScreenKt$lambda$-1708040770$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchAssistOverlayScreenKt$lambda$1708040770$1 extends AbstractC7559F3s implements G2k<String, Function0<? extends Unit>, BRg, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchAssistOverlayScreenKt$lambda$1708040770$1 INSTANCE = new ComposableSingletons$HatchAssistOverlayScreenKt$lambda$1708040770$1();

    public ComposableSingletons$HatchAssistOverlayScreenKt$lambda$1708040770$1() {
        super(5);
    }

    public final void invoke(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i) {
        AnonymousClass005.A0x(str, function0, bRg);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            HatchExternalLinkCardKt.m594HatchExternalLinkCardy8DT0do(str, bRg, 0L, null, null, null, function0, null, bfm, AnonymousClass006.A04(iA0d & 14, (iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, iA0d), 188);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G2k
    public /* bridge */ /* synthetic */ Unit invoke(String str, Function0<? extends Unit> function0, BRg bRg, BFM bfm, Integer num) {
        invoke(str, (Function0<Unit>) function0, bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
