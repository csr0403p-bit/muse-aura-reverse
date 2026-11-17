package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AssistVoicePrerequisiteSheetKt$AssistVoicePrerequisiteSheet$sheet$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AssistVoiceNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onContinue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistVoicePrerequisiteSheetKt$AssistVoicePrerequisiteSheet$sheet$1(AssistVoiceNavigator assistVoiceNavigator, Function0<Unit> function0, BRg bRg, int i, int i2) {
        super(2);
        this.$navigator = assistVoiceNavigator;
        this.$onContinue = function0;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AssistVoicePrerequisiteSheetKt.AssistVoicePrerequisiteSheet(this.$navigator, this.$onContinue, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
