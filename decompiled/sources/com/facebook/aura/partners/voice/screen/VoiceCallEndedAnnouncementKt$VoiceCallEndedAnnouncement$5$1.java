package com.facebook.aura.partners.voice.screen;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.G0U;
import X.InterfaceC0857A6e;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$5$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ String $announcement;
    public final /* synthetic */ MutableState<CallEndedPhase> $phase$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$5$1(String str, MutableState<CallEndedPhase> mutableState) {
        super(1);
        this.$announcement = str;
        this.$phase$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        if (this.$phase$delegate.getValue() == CallEndedPhase.ANNOUNCING) {
            AbstractC1564Ale.A08(interfaceC0857A6e, this.$announcement);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
