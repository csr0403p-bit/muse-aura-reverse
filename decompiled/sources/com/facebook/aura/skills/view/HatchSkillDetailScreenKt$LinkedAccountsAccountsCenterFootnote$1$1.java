package com.facebook.aura.skills.view;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.ApQ;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchSkillDetailScreenKt$LinkedAccountsAccountsCenterFootnote$1$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ ApQ $annotatedText;
    public final /* synthetic */ Function0<Unit> $onAccountsCenterClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSkillDetailScreenKt$LinkedAccountsAccountsCenterFootnote$1$1(ApQ apQ, Function0<Unit> function0) {
        super(1);
        this.$annotatedText = apQ;
        this.$onAccountsCenterClick = function0;
    }

    public final void invoke(int i) {
        if (AbstractC0878AGe.A0G(this.$annotatedText.A04(i, i)) != null) {
            this.$onAccountsCenterClick.invoke();
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
