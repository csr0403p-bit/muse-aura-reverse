package com.facebook.aura.maps;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchFullscreenMapScreenKt$FullscreenMapCloseButton$2$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ String $closeDescription;
    public final /* synthetic */ Function0<Unit> $onDismiss;

    /* renamed from: com.facebook.aura.maps.HatchFullscreenMapScreenKt$FullscreenMapCloseButton$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(0);
            this.$onDismiss = function0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$onDismiss.invoke();
            return AnonymousClass001.A0i();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A08(interfaceC0857A6e, this.$closeDescription);
        AbstractC1564Ale.A06(interfaceC0857A6e, 0);
        AbstractC1564Ale.A0A(interfaceC0857A6e, null, new AnonymousClass1(this.$onDismiss));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFullscreenMapScreenKt$FullscreenMapCloseButton$2$1(String str, Function0<Unit> function0) {
        super(1);
        this.$closeDescription = str;
        this.$onDismiss = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
