package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C9hr;
import X.F0C;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchVoiceNuxSheetKey;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallStarterKt$proceedToVoiceCall$showNux$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Boolean> $isStartWanted;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Boolean> $onNuxDue;
    public final /* synthetic */ VoiceCallStart $start;
    public final /* synthetic */ String $threadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallStarterKt$proceedToVoiceCall$showNux$1(Function0<Boolean> function0, Function0<Boolean> function02, AuraNavigator auraNavigator, String str, VoiceCallStart voiceCallStart) {
        super(0);
        this.$isStartWanted = function0;
        this.$onNuxDue = function02;
        this.$navigator = auraNavigator;
        this.$threadId = str;
        this.$start = voiceCallStart;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (!AnonymousClass003.A1Y(this.$isStartWanted) || AnonymousClass003.A1Y(this.$onNuxDue)) {
            return;
        }
        AuraNavigator auraNavigator = this.$navigator;
        F0C<C9hr<Object>>[] f0cArr = HatchVoiceNuxSheetKey.$childSerializers;
        String str = this.$threadId;
        VoiceCallStart voiceCallStart = this.$start;
        VoiceCallEntryPoint voiceCallEntryPoint = voiceCallStart.entryPoint;
        auraNavigator.navigate((AuraNavKey) new HatchVoiceNuxSheetKey(str, voiceCallEntryPoint != null ? voiceCallEntryPoint.getValue() : null, voiceCallStart.attribution), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
