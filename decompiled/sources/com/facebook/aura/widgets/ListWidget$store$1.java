package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import androidx.glance.appwidget.GlanceAppWidget;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ListWidget$store$1 extends AbstractC7559F3s implements Function0<GlanceAppWidget> {
    public final /* synthetic */ ListWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListWidget$store$1(ListWidget listWidget) {
        super(0);
        this.this$0 = listWidget;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GlanceAppWidget invoke() {
        return this.this$0.newGlanceWidget();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ GlanceAppWidget invoke() {
        return this.this$0.newGlanceWidget();
    }
}
