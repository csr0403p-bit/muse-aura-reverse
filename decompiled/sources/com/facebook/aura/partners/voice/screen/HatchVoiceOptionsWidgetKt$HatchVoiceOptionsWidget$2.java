package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.G0U;
import X.G0V;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.VoiceOptionsWidgetData;
import com.facebook.aura.model.WidgetStateMutationHost;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchVoiceOptionsWidgetKt$HatchVoiceOptionsWidget$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $containerBackgroundColor;
    public final /* synthetic */ C1DM $containerShape;
    public final /* synthetic */ VoiceOptionsWidgetData $data;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ boolean $isSuperseded;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onSendSwitchVoiceMessage;
    public final /* synthetic */ HatchWidget $widget;
    public final /* synthetic */ WidgetStateMutationHost $widgetStateMutationHost;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchVoiceOptionsWidgetKt$HatchVoiceOptionsWidget$2(HatchWidget hatchWidget, VoiceOptionsWidgetData voiceOptionsWidgetData, long j, C1DM c1dm, String str, WidgetStateMutationHost widgetStateMutationHost, boolean z, BRg bRg, G0U<? super String, Unit> g0u, int i, int i2) {
        super(2);
        this.$widget = hatchWidget;
        this.$data = voiceOptionsWidgetData;
        this.$containerBackgroundColor = j;
        this.$containerShape = c1dm;
        this.$hostMessageId = str;
        this.$widgetStateMutationHost = widgetStateMutationHost;
        this.$isSuperseded = z;
        this.$modifier = bRg;
        this.$onSendSwitchVoiceMessage = g0u;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        HatchVoiceOptionsWidgetKt.m1740HatchVoiceOptionsWidgetIkByU14(this.$widget, this.$data, this.$containerBackgroundColor, this.$containerShape, this.$hostMessageId, this.$widgetStateMutationHost, this.$isSuperseded, this.$modifier, this.$onSendSwitchVoiceMessage, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
