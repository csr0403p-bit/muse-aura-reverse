package com.facebook.aura.onepassword;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BA2;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C78N;
import X.G0U;
import X.G0V;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class OnePasswordErrorDialogKt {

    /* renamed from: com.facebook.aura.onepassword.OnePasswordErrorDialogKt$OnePasswordErrorDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ OnePasswordError $error;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OnePasswordError onePasswordError, Function0<Unit> function0) {
            super(2);
            this.$error = onePasswordError;
            this.$onDismiss = function0;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (this.$error.getOpensPlayStore$fbandroid_express_aura_java_com_facebook_aura_onepassword_onepassword()) {
                bfm.AgE(597285593);
                OnePasswordErrorDialogKt.PlayStoreButtons(this.$onDismiss, bfm, 0);
            } else {
                bfm.AgE(597355467);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120233);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, bfm.A65(strA01));
                Function0<Unit> function0 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new OnePasswordErrorDialogKt$OnePasswordErrorDialog$1$1$1(strA01, function0);
                    bfm.Ai0(objAaT);
                }
                AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(null, null, null, null, null, null, null, false, (G0U) objAaT, bfm, 0, 255);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.onepassword.OnePasswordErrorDialogKt$OnePasswordErrorDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ OnePasswordError $error;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OnePasswordError onePasswordError, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$error = onePasswordError;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            OnePasswordErrorDialogKt.OnePasswordErrorDialog(this.$error, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.onepassword.OnePasswordErrorDialogKt$PlayStoreButtons$2, reason: invalid class name and case insensitive filesystem */
    public final class C128072 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128072(Function0<Unit> function0, int i) {
            super(2);
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            OnePasswordErrorDialogKt.PlayStoreButtons(this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.onepassword.OnePasswordError toOnePasswordError(com.facebook.aura.onepassword.RequestCredentialAuthorization.Result.Failed r1) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r1, r0)
            java.lang.String r1 = r1.error
            int r0 = r1.hashCode()
            switch(r0) {
                case -2094305299: goto L10;
                case -2031695200: goto L13;
                case -1101072811: goto L1e;
                case -665462704: goto L21;
                case -219107058: goto L24;
                case 575566348: goto L2f;
                case 659808462: goto L3a;
                case 778975750: goto L45;
                case 1244556164: goto L50;
                case 1730693472: goto L5b;
                default: goto Ld;
            }
        Ld:
            com.facebook.aura.onepassword.OnePasswordError r0 = com.facebook.aura.onepassword.OnePasswordError.FAILED
            return r0
        L10:
            java.lang.String r0 = "request_failed"
            goto L15
        L13:
            java.lang.String r0 = "request_unavailable"
        L15:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            com.facebook.aura.onepassword.OnePasswordError r0 = com.facebook.aura.onepassword.OnePasswordError.REQUEST_ENDED
            return r0
        L1e:
            java.lang.String r0 = "update_required"
            goto L3c
        L21:
            java.lang.String r0 = "unavailable"
            goto L3c
        L24:
            java.lang.String r0 = "not_installed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            com.facebook.aura.onepassword.OnePasswordError r0 = com.facebook.aura.onepassword.OnePasswordError.INSTALL_REQUIRED
            return r0
        L2f:
            java.lang.String r0 = "feature_not_enabled"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            com.facebook.aura.onepassword.OnePasswordError r0 = com.facebook.aura.onepassword.OnePasswordError.ACCESS_REQUESTS_OFF
            return r0
        L3a:
            java.lang.String r0 = "unsupported_version"
        L3c:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            com.facebook.aura.onepassword.OnePasswordError r0 = com.facebook.aura.onepassword.OnePasswordError.UPDATE_REQUIRED
            return r0
        L45:
            java.lang.String r0 = "internal_error"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            com.facebook.aura.onepassword.OnePasswordError r0 = com.facebook.aura.onepassword.OnePasswordError.TRY_LATER
            return r0
        L50:
            java.lang.String r0 = "account_not_found"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            com.facebook.aura.onepassword.OnePasswordError r0 = com.facebook.aura.onepassword.OnePasswordError.ACCOUNT_NOT_SIGNED_IN
            return r0
        L5b:
            java.lang.String r0 = "launch_blocked"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            com.facebook.aura.onepassword.OnePasswordError r0 = com.facebook.aura.onepassword.OnePasswordError.UNAVAILABLE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onepassword.OnePasswordErrorDialogKt.toOnePasswordError(com.facebook.aura.onepassword.RequestCredentialAuthorization$Result$Failed):com.facebook.aura.onepassword.OnePasswordError");
    }

    public static final void OnePasswordErrorDialog(OnePasswordError onePasswordError, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(onePasswordError, function0);
        bfm.AgG(1091075133);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, onePasswordError) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraAlertDialogKt.AuraAlertDialog(bRg2, AbstractC2271BQs.A01(bfm, onePasswordError.getTitleRes$fbandroid_express_aura_java_com_facebook_aura_onepassword_onepassword()), AbstractC2271BQs.A01(bfm, onePasswordError.getBodyRes$fbandroid_express_aura_java_com_facebook_aura_onepassword_onepassword()), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, B1V.A00(bfm, new AnonymousClass1(onePasswordError, function0), 1068031116), function0, (BA2) null, zA1b, zA1b, (G0U<? super String, Unit>) null, bfm, AnonymousClass001.A05(iA08 << 15, ((iA08 >> 6) & 14) | 196608), zA1b ? 1 : 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(onePasswordError, function0, bRg2, i, i2);
        }
    }

    public static final void PlayStoreButtons(Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(664075818);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12062f);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120705);
            boolean zA1W = AnonymousClass002.A1W(bfm, strA012, AnonymousClass003.A1J(bfm, strA01, contextA0H), (iA0T & 14) == 4);
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new OnePasswordErrorDialogKt$PlayStoreButtons$1$1(strA01, strA012, function0, contextA0H);
                bfm.Ai0(objAaT);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(null, null, null, null, null, null, null, false, (G0U) objAaT, bfm, 0, 255);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128072(function0, i);
        }
    }
}
