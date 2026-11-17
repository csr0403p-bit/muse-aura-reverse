package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class WhatsAppUpdateNoteKt$rememberWhatsAppUpdateNoteViewLogger$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $isViewLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhatsAppUpdateNoteKt$rememberWhatsAppUpdateNoteViewLogger$1$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$isViewLogged = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0A((MutableState) this.$isViewLogged)) {
            return;
        }
        MutableState.A09(true, this.$isViewLogged);
        HatchClientCvmEventLogger.INSTANCE.logWhatsAppUpdatePromptView();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
