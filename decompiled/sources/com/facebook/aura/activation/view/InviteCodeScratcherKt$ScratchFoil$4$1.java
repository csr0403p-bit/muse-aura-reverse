package com.facebook.aura.activation.view;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class InviteCodeScratcherKt$ScratchFoil$4$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ Function0<Unit> $onReveal;
    public final /* synthetic */ String $revealLabel;

    /* renamed from: com.facebook.aura.activation.view.InviteCodeScratcherKt$ScratchFoil$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ Function0<Unit> $onReveal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(0);
            this.$onReveal = function0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$onReveal.invoke();
            return AnonymousClass001.A0i();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteCodeScratcherKt$ScratchFoil$4$1(String str, Function0<Unit> function0) {
        super(1);
        this.$revealLabel = str;
        this.$onReveal = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass003.A0r(interfaceC0857A6e);
        AbstractC1564Ale.A08(interfaceC0857A6e, this.$revealLabel);
        AbstractC1564Ale.A0A(interfaceC0857A6e, this.$revealLabel, new AnonymousClass1(this.$onReveal));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
