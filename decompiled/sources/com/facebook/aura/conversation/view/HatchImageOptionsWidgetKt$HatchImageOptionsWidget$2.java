package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.ImageOptionsWidgetData;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchImageOptionsWidgetKt$HatchImageOptionsWidget$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $containerBackgroundColor;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ ImageOptionsWidgetData $data;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<String, List<Integer>, Unit> $onConfirmSelection;
    public final /* synthetic */ G0W<String, String, String, Unit> $onSendSelectionText;
    public final /* synthetic */ G0U<String, Unit> $onSetSelectedPath;
    public final /* synthetic */ HatchWidget $widget;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchImageOptionsWidgetKt$HatchImageOptionsWidget$2(HatchWidget hatchWidget, ImageOptionsWidgetData imageOptionsWidgetData, String str, long j, C1D3 c1d3, BRg bRg, G0W<? super String, ? super String, ? super String, Unit> g0w, G0U<? super String, Unit> g0u, G0V<? super String, ? super List<Integer>, Unit> g0v, int i, int i2) {
        super(2);
        this.$widget = hatchWidget;
        this.$data = imageOptionsWidgetData;
        this.$hostMessageId = str;
        this.$containerBackgroundColor = j;
        this.$containerShape = c1d3;
        this.$modifier = bRg;
        this.$onSendSelectionText = g0w;
        this.$onSetSelectedPath = g0u;
        this.$onConfirmSelection = g0v;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchImageOptionsWidgetKt.m618HatchImageOptionsWidgetgF0flNs(this.$widget, this.$data, this.$hostMessageId, this.$containerBackgroundColor, this.$containerShape, this.$modifier, this.$onSendSelectionText, this.$onSetSelectedPath, this.$onConfirmSelection, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
