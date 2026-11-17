package com.facebook.aura.email.view;

import X.AbstractC0885AGm;
import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BHP;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailSwipeRowKt$EmailSwipeRow$1$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ boolean $canTrust;
    public final /* synthetic */ Function0<Unit> $onTrust;
    public final /* synthetic */ String $trustLabel;

    /* renamed from: com.facebook.aura.email.view.EmailSwipeRowKt$EmailSwipeRow$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ Function0<Unit> $onTrust;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(0);
            this.$onTrust = function0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$onTrust.invoke();
            return AnonymousClass001.A0i();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A0C(interfaceC0857A6e, AbstractC0885AGm.A0z(this.$canTrust ? new BHP(this.$trustLabel, new AnonymousClass1(this.$onTrust)) : null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSwipeRowKt$EmailSwipeRow$1$1(boolean z, String str, Function0<Unit> function0) {
        super(1);
        this.$canTrust = z;
        this.$trustLabel = str;
        this.$onTrust = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
