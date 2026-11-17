package com.facebook.aura.composer.view;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BHP;
import X.C1518AkS;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$ComposerMicButton$2$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ Function0<Unit> $activate;
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ String $holdActionLabel;
    public final /* synthetic */ boolean $isMic;
    public final /* synthetic */ String $micDescription;
    public final /* synthetic */ Function0<Boolean> $movesFocusOnClick;
    public final /* synthetic */ boolean $offersHold;
    public final /* synthetic */ Function0<Unit> $onMicHold;
    public final /* synthetic */ String $sendDescription;
    public final /* synthetic */ DictationSendStandIn $sendStandIn;

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ Function0<Unit> $activate;
        public final /* synthetic */ C1518AkS $focusRequester;
        public final /* synthetic */ Function0<Boolean> $movesFocusOnClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Boolean> function0, C1518AkS c1518AkS, Function0<Unit> function02) {
            super(0);
            this.$movesFocusOnClick = function0;
            this.$focusRequester = c1518AkS;
            this.$activate = function02;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            if (AnonymousClass003.A1Y(this.$movesFocusOnClick)) {
                C1518AkS.A00(this.$focusRequester);
            }
            this.$activate.invoke();
            return true;
        }
    }

    /* renamed from: com.facebook.aura.composer.view.HatchComposerKt$ComposerMicButton$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ Function0<Unit> $onMicHold;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0) {
            super(0);
            this.$onMicHold = function0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$onMicHold.invoke();
            return AnonymousClass001.A0i();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A08(interfaceC0857A6e, this.$micDescription);
        AbstractC1564Ale.A06(interfaceC0857A6e, 0);
        DictationSendStandIn dictationSendStandIn = this.$sendStandIn;
        if (dictationSendStandIn != null && !dictationSendStandIn.isEnabled) {
            AbstractC1564Ale.A02(interfaceC0857A6e);
        }
        AbstractC1564Ale.A0A(interfaceC0857A6e, this.$isMic ? null : this.$sendDescription, new AnonymousClass1(this.$movesFocusOnClick, this.$focusRequester, this.$activate));
        if (this.$isMic && this.$offersHold) {
            AbstractC1564Ale.A0C(interfaceC0857A6e, Collections.singletonList(new BHP(this.$holdActionLabel, new AnonymousClass2(this.$onMicHold))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$ComposerMicButton$2$1(String str, DictationSendStandIn dictationSendStandIn, boolean z, String str2, boolean z2, String str3, Function0<Boolean> function0, C1518AkS c1518AkS, Function0<Unit> function02, Function0<Unit> function03) {
        super(1);
        this.$micDescription = str;
        this.$sendStandIn = dictationSendStandIn;
        this.$isMic = z;
        this.$sendDescription = str2;
        this.$offersHold = z2;
        this.$holdActionLabel = str3;
        this.$movesFocusOnClick = function0;
        this.$focusRequester = c1518AkS;
        this.$activate = function02;
        this.$onMicHold = function03;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
