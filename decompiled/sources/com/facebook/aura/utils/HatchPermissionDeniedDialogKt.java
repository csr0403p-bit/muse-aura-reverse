package com.facebook.aura.utils;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C78N;
import X.G0U;
import X.G0V;
import android.content.Context;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchPermissionDeniedDialogKt {

    /* renamed from: com.facebook.aura.utils.HatchPermissionDeniedDialogKt$HatchPermissionDeniedDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onOpenSettings;
        public final /* synthetic */ String $openSettingsText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Context context) {
            super(2);
            this.$openSettingsText = str;
            this.$cancelText = str2;
            this.$onCancel = function0;
            this.$onDismiss = function02;
            this.$onOpenSettings = function03;
            this.$context = context;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                String str = this.$openSettingsText;
                boolean zA1W = AnonymousClass005.A1W(bfm, this.$context, this.$cancelText, this.$onCancel, AnonymousClass001.A1R(bfm, this.$onOpenSettings, AnonymousClass001.A1R(bfm, this.$onDismiss, bfm.A65(str))));
                String str2 = this.$openSettingsText;
                String str3 = this.$cancelText;
                Function0<Unit> function0 = this.$onCancel;
                Function0<Unit> function02 = this.$onDismiss;
                Function0<Unit> function03 = this.$onOpenSettings;
                Context context = this.$context;
                Object objAaT = bfm.AaT();
                if (zA1W || objAaT == C78N.A00) {
                    objAaT = new HatchPermissionDeniedDialogKt$HatchPermissionDeniedDialog$1$1$1(str2, str3, function0, function02, function03, context);
                    bfm.Ai0(objAaT);
                }
                AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(null, null, null, null, null, null, null, false, (G0U) objAaT, bfm, 0, 255);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.utils.HatchPermissionDeniedDialogKt$HatchPermissionDeniedDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $body;
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ Function0<Unit> $onOpenSettings;
        public final /* synthetic */ String $openSettingsText;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, Function0<Unit> function0, BRg bRg, String str3, String str4, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, int i, int i2) {
            super(2);
            this.$title = str;
            this.$body = str2;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$openSettingsText = str3;
            this.$cancelText = str4;
            this.$onOpenSettings = function02;
            this.$onCancel = function03;
            this.$onDismissRequest = function04;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPermissionDeniedDialogKt.HatchPermissionDeniedDialog(this.$title, this.$body, this.$onDismiss, this.$modifier, this.$openSettingsText, this.$cancelText, this.$onOpenSettings, this.$onCancel, this.$onDismissRequest, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchPermissionDeniedDialog(java.lang.String r19, java.lang.String r20, kotlin.jvm.functions.Function0<kotlin.Unit> r21, X.BRg r22, java.lang.String r23, java.lang.String r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25, kotlin.jvm.functions.Function0<kotlin.Unit> r26, kotlin.jvm.functions.Function0<kotlin.Unit> r27, X.BFM r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.utils.HatchPermissionDeniedDialogKt.HatchPermissionDeniedDialog(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, X.BRg, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }
}
