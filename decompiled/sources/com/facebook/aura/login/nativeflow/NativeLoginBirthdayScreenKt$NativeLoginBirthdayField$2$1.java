package com.facebook.aura.login.nativeflow;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginBirthdayScreenKt$NativeLoginBirthdayField$2$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ String $action;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnClick;
    public final /* synthetic */ String $label;

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginBirthdayScreenKt$NativeLoginBirthdayField$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ C1BO<Function0<Unit>> $currentOnClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C1BO<? extends Function0<Unit>> c1bo) {
            super(0);
            this.$currentOnClick = c1bo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            C1BO.A0D(this.$currentOnClick);
            return AnonymousClass001.A0i();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A08(interfaceC0857A6e, this.$label);
        AbstractC1564Ale.A06(interfaceC0857A6e, 0);
        AbstractC1564Ale.A0A(interfaceC0857A6e, this.$action, new AnonymousClass1(this.$currentOnClick));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginBirthdayScreenKt$NativeLoginBirthdayField$2$1(String str, String str2, C1BO<? extends Function0<Unit>> c1bo) {
        super(1);
        this.$label = str;
        this.$action = str2;
        this.$currentOnClick = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
