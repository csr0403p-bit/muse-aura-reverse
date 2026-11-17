package com.facebook.aura.browsertask.view;

import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class StopTaskConfirmationDialogKt {
    public static final Unit StopTaskConfirmationDialog$lambda$0$0$0(String str, Function0 function0, String str2, Function0 function02, AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 4);
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.destructiveButton(str, null, true, false, AuraButtonGroupsKt.DEFAULT_DESTRUCTIVE_BUTTON_ID, function0, null, bs0);
        auraButtonGroupScope.secondaryButton(str2, null, true, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, function02, null, bs0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void StopTaskConfirmationDialog(final kotlin.jvm.functions.Function0<kotlin.Unit> r17, final kotlin.jvm.functions.Function0<kotlin.Unit> r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19, X.BFM r20, final int r21, final int r22) {
        /*
            r4 = r17
            r13 = r18
            r2 = r19
            boolean r15 = X.AnonymousClass004.A1b(r4, r13)
            r0 = -767206434(0xffffffffd2455bde, float:-2.11912458E11)
            r1 = r20
            r1.AgG(r0)
            r3 = r21
            r0 = r21 & 6
            if (r0 != 0) goto Lc4
            int r6 = X.AnonymousClass004.A0T(r1, r4)
            r6 = r6 | r21
        L1e:
            r0 = r21 & 48
            if (r0 != 0) goto L27
            int r0 = X.AnonymousClass004.A0U(r1, r13)
            r6 = r6 | r0
        L27:
            r0 = r3 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L3a
            r0 = r22 & 4
            if (r0 != 0) goto L37
            boolean r5 = r1.A67(r2)
            r0 = 256(0x100, float:3.59E-43)
            if (r5 != 0) goto L39
        L37:
            r0 = 128(0x80, float:1.794E-43)
        L39:
            r6 = r6 | r0
        L3a:
            boolean r0 = X.AnonymousClass004.A1J(r6)
            boolean r0 = X.AnonymousClass001.A1b(r0, r1, r6)
            if (r0 == 0) goto Lc0
            r1.Afy()
            r0 = r21 & 1
            if (r0 == 0) goto Lb8
            boolean r0 = r1.AEk()
            if (r0 != 0) goto Lb8
            r1.Afo()
            r0 = r22 & 4
            if (r0 == 0) goto L5a
            r6 = r6 & (-897(0xfffffffffffffc7f, float:NaN))
        L5a:
            r1.AAb()
            r0 = 2131886514(0x7f1201b2, float:1.940761E38)
            java.lang.String r8 = X.AbstractC2271BQs.A01(r1, r0)
            r0 = 2131886512(0x7f1201b0, float:1.9407605E38)
            java.lang.String r9 = X.AnonymousClass006.A0v(r1, r0)
            r0 = 2131886513(0x7f1201b1, float:1.9407607E38)
            java.lang.String r7 = X.AbstractC2271BQs.A01(r1, r0)
            r0 = 2131887856(0x7f1206f0, float:1.941033E38)
            java.lang.String r0 = X.AbstractC2271BQs.A01(r1, r0)
            com.facebook.aura.browsertask.view.StopTaskConfirmationDialogKt$$ExternalSyntheticLambda0 r5 = new com.facebook.aura.browsertask.view.StopTaskConfirmationDialogKt$$ExternalSyntheticLambda0
            r5.<init>()
            r0 = -1628056401(0xffffffff9ef5d4af, float:-2.6028348E-20)
            X.B1U r12 = X.B1V.A00(r1, r5, r0)
            int r19 = r6 << 15
            r0 = 3670016(0x380000, float:5.142788E-39)
            r19 = r19 & r0
            r0 = 196608(0x30000, float:2.75506E-40)
            r19 = r19 | r0
            r21 = 1945(0x799, float:2.726E-42)
            r7 = 0
            r10 = r7
            r11 = r7
            r14 = r7
            r16 = r15
            r17 = r7
            r20 = r15
            r18 = r1
            com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt.AuraAlertDialog(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        La0:
            X.BBb r1 = r1.AAc()
            if (r1 == 0) goto Lb7
            com.facebook.aura.browsertask.view.StopTaskConfirmationDialogKt$$ExternalSyntheticLambda1 r0 = new com.facebook.aura.browsertask.view.StopTaskConfirmationDialogKt$$ExternalSyntheticLambda1
            r17 = r0
            r18 = r4
            r19 = r13
            r20 = r2
            r21 = r3
            r17.<init>()
            r1.A06 = r0
        Lb7:
            return
        Lb8:
            r0 = r22 & 4
            if (r0 == 0) goto L5a
            r6 = r6 & (-897(0xfffffffffffffc7f, float:NaN))
            r2 = r13
            goto L5a
        Lc0:
            r1.Afo()
            goto La0
        Lc4:
            r6 = r3
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.view.StopTaskConfirmationDialogKt.StopTaskConfirmationDialog(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final Unit StopTaskConfirmationDialog$lambda$0(final Function0 function0, final String str, final Function0 function02, final String str2, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            boolean zA1T = AnonymousClass005.A1T(bfm, function02, str2, function0, bfm.A65(str));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.browsertask.view.StopTaskConfirmationDialogKt$$ExternalSyntheticLambda2
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return StopTaskConfirmationDialogKt.StopTaskConfirmationDialog$lambda$0$0$0(str, function02, str2, function0, (AuraButtonGroupScope) obj);
                    }
                };
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A14(bfm, objAaT);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit StopTaskConfirmationDialog$lambda$1(Function0 function0, Function0 function02, Function0 function03, int i, int i2, BFM bfm, int i3) {
        StopTaskConfirmationDialog(function0, function02, function03, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
