package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C00r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchExternalLinkCardKt$HatchExternalLinkCard$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C00r $imageCandidateIndex$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchExternalLinkCardKt$HatchExternalLinkCard$4$1(C00r c00r) {
        super(0);
        this.$imageCandidateIndex$delegate = c00r;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C00r c00r = this.$imageCandidateIndex$delegate;
        float f = HatchExternalLinkCardKt.CardWidthFraction;
        this.$imageCandidateIndex$delegate.AdX(c00r.AGd() + 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
