package com.facebook.aura.partners.voice.screen;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import com.facebook.aura.partners.voice.infra.VoiceNuxRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVoiceNuxSheetKt$HatchVoiceNuxContent$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onContinue;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceNuxSheetKt$HatchVoiceNuxContent$3$1(AbstractC3358CGz abstractC3358CGz, Function0<Unit> function0) {
        super(0);
        this.$userSession = abstractC3358CGz;
        this.$onContinue = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        VoiceNuxRepository.Companion.getInstance(this.$userSession).markSeen();
        this.$onContinue.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
