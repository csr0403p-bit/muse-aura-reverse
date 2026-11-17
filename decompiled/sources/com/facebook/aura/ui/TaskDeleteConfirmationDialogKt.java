package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C78N;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class TaskDeleteConfirmationDialogKt {

    /* renamed from: com.facebook.aura.ui.TaskDeleteConfirmationDialogKt$TaskDeleteConfirmationDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ String $deleteText;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onConfirm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, String str, Function0<Unit> function02, String str2) {
            super(2);
            this.$onCancel = function0;
            this.$deleteText = str;
            this.$onConfirm = function02;
            this.$cancelText = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                Function0<Unit> function0 = this.$onCancel;
                boolean zA65 = bfm.A65(function0) | AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onConfirm, bfm.A65(this.$deleteText)));
                String str = this.$deleteText;
                Function0<Unit> function02 = this.$onConfirm;
                String str2 = this.$cancelText;
                Function0<Unit> function03 = this.$onCancel;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new TaskDeleteConfirmationDialogKt$TaskDeleteConfirmationDialog$1$1$1(str, function02, str2, function03);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.ui.TaskDeleteConfirmationDialogKt$TaskDeleteConfirmationDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, Function0<Unit> function03, int i, int i2) {
            super(2);
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$modifier = bRg;
            this.$onCancel = function03;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            TaskDeleteConfirmationDialogKt.TaskDeleteConfirmationDialog(this.$onConfirm, this.$onDismiss, this.$modifier, this.$onCancel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TaskDeleteConfirmationDialog(kotlin.jvm.functions.Function0<kotlin.Unit> r19, kotlin.jvm.functions.Function0<kotlin.Unit> r20, X.BRg r21, kotlin.jvm.functions.Function0<kotlin.Unit> r22, X.BFM r23, int r24, int r25) {
        /*
            r5 = r19
            r4 = r20
            r3 = r22
            r11 = r21
            boolean r19 = X.AnonymousClass004.A1b(r5, r4)
            r0 = 583309385(0x22c49849, float:5.3287145E-18)
            r6 = r23
            r6.AgG(r0)
            r2 = r24
            r0 = r24 & 6
            if (r0 != 0) goto Ld4
            int r8 = X.AnonymousClass004.A0T(r6, r5)
            r8 = r8 | r24
        L20:
            r0 = r24 & 48
            if (r0 != 0) goto L29
            int r0 = X.AnonymousClass004.A0U(r6, r4)
            r8 = r8 | r0
        L29:
            r1 = r25
            r9 = r25 & 4
            if (r9 == 0) goto Lc9
            r8 = r8 | 384(0x180, float:5.38E-43)
        L31:
            r0 = r2 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L44
            r0 = r25 & 8
            if (r0 != 0) goto L41
            boolean r7 = r6.A67(r3)
            r0 = 2048(0x800, float:2.87E-42)
            if (r7 != 0) goto L43
        L41:
            r0 = 1024(0x400, float:1.435E-42)
        L43:
            r8 = r8 | r0
        L44:
            boolean r0 = X.AnonymousClass004.A1L(r8)
            boolean r0 = X.AnonymousClass001.A1b(r0, r6, r8)
            if (r0 == 0) goto Lc5
            r6.Afy()
            r0 = r24 & 1
            if (r0 == 0) goto Lb9
            boolean r0 = r6.AEk()
            if (r0 != 0) goto Lb9
            int r8 = X.AnonymousClass003.A0A(r1, r6, r8)
        L5f:
            r6.AAb()
            r0 = 2131890265(0x7f121059, float:1.9415217E38)
            java.lang.String r10 = X.AbstractC2271BQs.A01(r6, r0)
            java.lang.String r9 = X.AnonymousClass001.A0r(r6)
            r0 = 2131890268(0x7f12105c, float:1.9415223E38)
            java.lang.String r12 = X.AbstractC2271BQs.A01(r6, r0)
            r0 = 2131890267(0x7f12105b, float:1.941522E38)
            java.lang.String r13 = X.AbstractC2271BQs.A01(r6, r0)
            com.facebook.aura.ui.TaskDeleteConfirmationDialogKt$TaskDeleteConfirmationDialog$1 r7 = new com.facebook.aura.ui.TaskDeleteConfirmationDialogKt$TaskDeleteConfirmationDialog$1
            r7.<init>(r3, r10, r5, r9)
            r0 = 1386824024(0x52a94158, float:3.6347288E11)
            X.B1U r16 = X.B1V.A00(r6, r7, r0)
            int r0 = r8 >> 6
            r7 = r0 & 14
            r0 = 196608(0x30000, float:2.75506E-40)
            int r23 = X.AnonymousClass006.A04(r7, r0, r8)
            r25 = 1944(0x798, float:2.724E-42)
            r14 = 0
            r15 = r14
            r18 = r14
            r20 = r19
            r21 = r14
            r22 = r6
            r24 = r19
            r17 = r4
            com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt.AuraAlertDialog(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        La4:
            X.BBb r6 = r6.AAc()
            if (r6 == 0) goto Lb8
            com.facebook.aura.ui.TaskDeleteConfirmationDialogKt$TaskDeleteConfirmationDialog$2 r0 = new com.facebook.aura.ui.TaskDeleteConfirmationDialogKt$TaskDeleteConfirmationDialog$2
            r7 = r0
            r8 = r5
            r9 = r4
            r10 = r11
            r11 = r3
            r12 = r2
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r6.A06 = r0
        Lb8:
            return
        Lb9:
            if (r9 == 0) goto Lbd
            X.BS0 r11 = X.BRg.A00
        Lbd:
            r0 = r25 & 8
            if (r0 == 0) goto L5f
            r8 = r8 & (-7169(0xffffffffffffe3ff, float:NaN))
            r3 = r4
            goto L5f
        Lc5:
            r6.Afo()
            goto La4
        Lc9:
            r0 = r2 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L31
            int r0 = X.AnonymousClass004.A0f(r6, r11)
            r8 = r8 | r0
            goto L31
        Ld4:
            r8 = r2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.TaskDeleteConfirmationDialogKt.TaskDeleteConfirmationDialog(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }
}
