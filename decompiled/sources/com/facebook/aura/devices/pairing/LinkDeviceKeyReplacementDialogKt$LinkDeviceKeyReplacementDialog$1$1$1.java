package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import android.graphics.drawable.Drawable;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LinkDeviceKeyReplacementDialogKt$LinkDeviceKeyReplacementDialog$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ String $cancelText;
    public final /* synthetic */ G0U<Boolean, Unit> $onResolve;
    public final /* synthetic */ String $replaceText;

    /* renamed from: com.facebook.aura.devices.pairing.LinkDeviceKeyReplacementDialogKt$LinkDeviceKeyReplacementDialog$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ G0U<Boolean, Unit> $onResolve;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0U<? super Boolean, Unit> g0u) {
            super(0);
            this.$onResolve = g0u;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AnonymousClass001.A1K(true, this.$onResolve);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.LinkDeviceKeyReplacementDialogKt$LinkDeviceKeyReplacementDialog$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ G0U<Boolean, Unit> $onResolve;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0U<? super Boolean, Unit> g0u) {
            super(0);
            this.$onResolve = g0u;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AnonymousClass001.A1K(false, this.$onResolve);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        String str = this.$replaceText;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onResolve);
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.primaryButton(str, (Drawable) null, true, false, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, (Function0<Unit>) anonymousClass1, (String) null, Integer.MAX_VALUE, (BRg) bs0);
        auraButtonGroupScope.secondaryButton(this.$cancelText, null, true, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, new AnonymousClass2(this.$onResolve), null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkDeviceKeyReplacementDialogKt$LinkDeviceKeyReplacementDialog$1$1$1(String str, String str2, G0U<? super Boolean, Unit> g0u) {
        super(1);
        this.$replaceText = str;
        this.$cancelText = str2;
        this.$onResolve = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
