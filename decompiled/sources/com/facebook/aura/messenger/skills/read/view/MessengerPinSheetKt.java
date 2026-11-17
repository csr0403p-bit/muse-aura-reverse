package com.facebook.aura.messenger.skills.read.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.B1V;
import X.BA2;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.messenger.skills.read.model.PinError;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class MessengerPinSheetKt {
    public static final int PIN_LENGTH = 6;

    /* renamed from: com.facebook.aura.messenger.skills.read.view.MessengerPinSheetKt$MessengerPinSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ boolean $isConnectivityError;
        public final /* synthetic */ boolean $isVerifying;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onNeedHelp;
        public final /* synthetic */ G0U<String, Unit> $onPinComplete;
        public final /* synthetic */ PinError $pinError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(G0U<? super String, Unit> g0u, Function0<Unit> function0, BRg bRg, boolean z, PinError pinError, boolean z2, String str, int i, int i2) {
            super(2);
            this.$onPinComplete = g0u;
            this.$onNeedHelp = function0;
            this.$modifier = bRg;
            this.$isVerifying = z;
            this.$pinError = pinError;
            this.$isConnectivityError = z2;
            this.$iconUrl = str;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MessengerPinSheetKt.MessengerPinSheet(this.$onPinComplete, this.$onNeedHelp, this.$modifier, this.$isVerifying, this.$pinError, this.$isConnectivityError, this.$iconUrl, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.messenger.skills.read.view.MessengerPinSheetKt$MessengerPinTroubleshootingDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onOpen;
        public final /* synthetic */ String $openText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$openText = str;
            this.$onOpen = function0;
            this.$cancelText = str2;
            this.$onCancel = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onCancel, AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onOpen, bfm.A65(this.$openText))));
                String str = this.$openText;
                Function0<Unit> function0 = this.$onOpen;
                String str2 = this.$cancelText;
                Function0<Unit> function02 = this.$onCancel;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new MessengerPinSheetKt$MessengerPinTroubleshootingDialog$1$1$1(str, function0, str2, function02);
                    bfm.Ai0(objAaT);
                }
                AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(null, null, null, null, null, null, null, false, (G0U) objAaT, bfm, 0, 255);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.messenger.skills.read.view.MessengerPinSheetKt$MessengerPinTroubleshootingDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onOpen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
            super(2);
            this.$onOpen = function0;
            this.$onCancel = function02;
            this.$onDismiss = function03;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MessengerPinSheetKt.MessengerPinTroubleshootingDialog(this.$onOpen, this.$onCancel, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.messenger.skills.read.view.MessengerPinSheetKt$PinStatusArea$2, reason: invalid class name and case insensitive filesystem */
    public final class C126892 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isConnectivityError;
        public final /* synthetic */ boolean $isPinEmpty;
        public final /* synthetic */ boolean $isVerifying;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ PinError $pinError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126892(boolean z, PinError pinError, boolean z2, boolean z3, BRg bRg, int i, int i2) {
            super(2);
            this.$isVerifying = z;
            this.$pinError = pinError;
            this.$isConnectivityError = z2;
            this.$isPinEmpty = z3;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MessengerPinSheetKt.PinStatusArea(this.$isVerifying, this.$pinError, this.$isConnectivityError, this.$isPinEmpty, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x029d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MessengerPinSheet(X.G0U<? super java.lang.String, kotlin.Unit> r69, kotlin.jvm.functions.Function0<kotlin.Unit> r70, X.BRg r71, boolean r72, com.facebook.aura.messenger.skills.read.model.PinError r73, boolean r74, java.lang.String r75, X.BFM r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.messenger.skills.read.view.MessengerPinSheetKt.MessengerPinSheet(X.G0U, kotlin.jvm.functions.Function0, X.BRg, boolean, com.facebook.aura.messenger.skills.read.model.PinError, boolean, java.lang.String, X.BFM, int, int):void");
    }

    public static final void MessengerPinTroubleshootingDialog(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BFM bfm, int i) {
        AnonymousClass005.A10(function0, function02, function03);
        bfm.AgG(1072935701);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function03);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f9e), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f9b), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new AnonymousClass1(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f9d), function0, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f9c), function02), 2089470694), function03, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, AnonymousClass006.A02(iA0T << 12), 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, function02, function03, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PinStatusArea(boolean r28, com.facebook.aura.messenger.skills.read.model.PinError r29, boolean r30, boolean r31, X.BRg r32, X.BFM r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.messenger.skills.read.view.MessengerPinSheetKt.PinStatusArea(boolean, com.facebook.aura.messenger.skills.read.model.PinError, boolean, boolean, X.BRg, X.BFM, int, int):void");
    }
}
