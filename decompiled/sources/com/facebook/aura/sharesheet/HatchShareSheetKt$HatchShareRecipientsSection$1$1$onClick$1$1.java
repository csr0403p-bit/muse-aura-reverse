package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchShareSheetKt$HatchShareRecipientsSection$1$1$onClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<HatchShareRecipient, Unit> $onRecipientClick;
    public final /* synthetic */ HatchShareRecipient $recipient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchShareSheetKt$HatchShareRecipientsSection$1$1$onClick$1$1(G0U<? super HatchShareRecipient, Unit> g0u, HatchShareRecipient hatchShareRecipient) {
        super(0);
        this.$onRecipientClick = g0u;
        this.$recipient = hatchShareRecipient;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onRecipientClick.invoke(this.$recipient);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
