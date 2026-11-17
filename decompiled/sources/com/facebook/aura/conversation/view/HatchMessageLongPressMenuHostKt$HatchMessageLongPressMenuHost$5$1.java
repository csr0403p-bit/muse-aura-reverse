package com.facebook.aura.conversation.view;

import X.AWx;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.G0U;
import android.view.View;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$5$1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
    public final /* synthetic */ G0U<AWx, Unit> $openContextMenu;
    public final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$5$1(View view, G0U<? super AWx, Unit> g0u) {
        super(1);
        this.$view = view;
        this.$openContextMenu = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
        m653invokek4lQ0M(aWx.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m653invokek4lQ0M(long j) {
        this.$view.performHapticFeedback(0);
        AnonymousClass006.A1T(this.$openContextMenu, j);
    }
}
