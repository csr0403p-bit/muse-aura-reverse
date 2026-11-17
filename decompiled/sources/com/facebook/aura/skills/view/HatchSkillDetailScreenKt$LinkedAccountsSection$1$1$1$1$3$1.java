package com.facebook.aura.skills.view;

import X.C7438Evz;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1$3$1 extends C7438Evz implements Function0<Unit> {
    public HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1$3$1(Object obj) {
        super(0, obj, SkillLinkedAccountsViewModel.class, "onAccountMenuOpened", "onAccountMenuOpened()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SkillLinkedAccountsViewModel) this.receiver).onAccountMenuOpened();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
