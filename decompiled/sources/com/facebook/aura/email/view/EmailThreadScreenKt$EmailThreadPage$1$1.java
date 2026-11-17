package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import com.facebook.aura.email.viewmodel.EmailThreadExit;
import com.facebook.aura.email.viewmodel.EmailThreadSessionViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailThreadScreenKt$EmailThreadPage$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ EmailThreadSessionViewModel $threadSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailThreadScreenKt$EmailThreadPage$1$1(EmailThreadSessionViewModel emailThreadSessionViewModel, AuraNavigator auraNavigator) {
        super(0);
        this.$threadSession = emailThreadSessionViewModel;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$threadSession.exit = EmailThreadExit.CLOSE_BUTTON;
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
