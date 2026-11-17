package com.facebook.aura.composer.view;

import X.AbstractC1712Aov;
import X.AbstractC7559F3s;
import X.C10384HaO;
import X.C2AA;
import X.C7384Etj;
import X.G0U;
import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchComposerKt$ComposerMicButton$3$1 extends AbstractC7559F3s implements G0U<C2AA, Boolean> {
    public final /* synthetic */ Function0<Unit> $activate;

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m437invokeZmokQxo(KeyEvent keyEvent) {
        boolean z;
        C7384Etj.A0Y(keyEvent, 0);
        if (AbstractC1712Aov.A00(keyEvent) == 1 && ((keyEvent.getKeyCode() << 32) == C10384HaO.A0F || (keyEvent.getKeyCode() << 32) == C10384HaO.A0b)) {
            this.$activate.invoke();
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$ComposerMicButton$3$1(Function0<Unit> function0) {
        super(1);
        this.$activate = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(C2AA c2aa) {
        return m437invokeZmokQxo(c2aa.A00);
    }
}
