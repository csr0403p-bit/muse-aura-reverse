package com.facebook.aura.assist;

import X.AaC;
import X.AbstractC7559F3s;
import X.C1BO;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAssistPresentationKt$AssistIdentityPresentationEffect$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<AaC> $bounds;
    public final /* synthetic */ AssistIdentityState $identityState;
    public final /* synthetic */ boolean $isVoice;
    public final /* synthetic */ Function0<Unit> $onOpenApp;
    public final /* synthetic */ boolean $showingVoice;
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ View $view;
    public final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistPresentationKt$AssistIdentityPresentationEffect$1$1(AssistIdentityState assistIdentityState, boolean z, boolean z2, C1BO<AaC> c1bo, View view, String str, Function0<Unit> function0, boolean z3) {
        super(0);
        this.$identityState = assistIdentityState;
        this.$isVoice = z;
        this.$showingVoice = z2;
        this.$bounds = c1bo;
        this.$view = view;
        this.$threadId = str;
        this.$onOpenApp = function0;
        this.$visible = z3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$identityState.setIdentity(new AssistIdentityPresentation(this.$isVoice, this.$showingVoice, this.$bounds, AssistIdentityStateKt.originOnScreen(this.$view), this.$threadId, this.$onOpenApp, this.$visible));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
