package com.facebook.aura.conversation.view;

import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BQN;
import X.BRg;
import X.C1BN;
import X.C1BO;
import X.C1er;
import X.C2CK;
import X.C3cG;
import X.C78N;
import X.CFK;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HwU;
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.conversation.repo.HatchPrimarySessionRepository;
import com.facebook.aura.onepassword.OnePasswordError;
import com.facebook.aura.onepassword.OnePasswordErrorDialogKt;
import com.facebook.aura.onepassword.OnePasswordHandoff;
import com.facebook.aura.onepassword.RequestCredentialAuthorization;
import com.facebook.aura.settings.HatchCredentialsViewModel;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchOnePasswordCardButtonKt {
    public static final String TAG = "HatchOnePassword";

    /* renamed from: com.facebook.aura.conversation.view.HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $cardType;
        public final /* synthetic */ OnePasswordHandoff $handoff;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $sourceSessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(OnePasswordHandoff onePasswordHandoff, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$handoff = onePasswordHandoff;
            this.$cardType = str;
            this.$sourceSessionId = str2;
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
            HatchOnePasswordCardButtonKt.HatchOnePasswordCardButton(this.$handoff, this.$cardType, this.$sourceSessionId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchOnePasswordCardButton(OnePasswordHandoff onePasswordHandoff, String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        int iA1b = AnonymousClass004.A1b(onePasswordHandoff, str);
        bfm.AgG(-955256766);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(onePasswordHandoff, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            HatchCredentialsViewModel.Factory factory = new HatchCredentialsViewModel.Factory(abstractC3358CGzA0h);
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchCredentialsViewModel hatchCredentialsViewModel = (HatchCredentialsViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, C3cG.A0x(HatchCredentialsViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, hatchCredentialsViewModel.externalGrantCapturesInFlight);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchPrimarySessionRepository.Companion.getInstance(abstractC3358CGzA0h).primarySessionId;
                bfm.Ai0(objAaT);
            }
            C1BO c1boA022 = C2CK.A02(bfm, (C1BN) objAaT);
            Object[] objArr = new Object[iA1b];
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$errorDialog$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT2, objArr);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new RequestCredentialAuthorization();
                bfm.Ai0(objAaT3);
            }
            RequestCredentialAuthorization requestCredentialAuthorization = (RequestCredentialAuthorization) objAaT3;
            String strA0M = FGI.A0M("onepassword:", onePasswordHandoff.key);
            int i4 = iA05 & 14;
            boolean zA1P = AnonymousClass003.A1P(bfm, c1boA022, mutableStateA0N, AnonymousClass003.A19(iA05 & 896) | (i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(onePasswordHandoff))) | bfm.A67(hatchCredentialsViewModel));
            Object objAaT4 = bfm.AaT();
            if (zA1P || objAaT4 == obj) {
                objAaT4 = new HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$launcher$1$1(hatchCredentialsViewModel, onePasswordHandoff, str2, c1boA022, mutableStateA0N);
                bfm.Ai0(objAaT4);
            }
            MutableState mutableStateA00 = C1er.A00(bfm, rememberOnePasswordLauncher(strA0M, requestCredentialAuthorization, (G0U) objAaT4, bfm, RequestCredentialAuthorization.$stable << 3));
            String str3 = onePasswordHandoff.key;
            boolean zA1X = AnonymousClass005.A1X(bfm, mutableStateA0N, requestCredentialAuthorization, bfm.A67(hatchCredentialsViewModel) | (i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(onePasswordHandoff))), bfm.A65(mutableStateA00));
            Object objAaT5 = bfm.AaT();
            if (zA1X || objAaT5 == obj) {
                objAaT5 = new HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$1$1(hatchCredentialsViewModel, onePasswordHandoff, requestCredentialAuthorization, mutableStateA00, mutableStateA0N, null);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A1A(bfm, objAaT5, hatchCredentialsViewModel, str3);
            String strA0M2 = FGI.A0M(str, "-onepassword");
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c4e);
            boolean z2 = !((Set) c1boA02.getValue()).contains(onePasswordHandoff.key);
            boolean zA1X2 = AnonymousClass005.A1X(bfm, mutableStateA0N, hatchCredentialsViewModel, bfm.A67(requestCredentialAuthorization), bfm.A67(contextA0H));
            if (i4 != 4 && ((iA05 & 8) == 0 || !bfm.A67(onePasswordHandoff))) {
                z = false;
            }
            boolean z3 = zA1X2 | z;
            Object objAaT6 = bfm.AaT();
            if (z3 || objAaT6 == obj) {
                objAaT6 = new HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$2$1(requestCredentialAuthorization, contextA0H, mutableStateA0N, hatchCredentialsViewModel, onePasswordHandoff);
                bfm.Ai0(objAaT6);
            }
            HatchInternalLinkActionCardKt.m628InternalLinkCardButtonPIknLig(strA0M2, strA01, (Function0) objAaT6, bRg2, z2, null, null, bfm, iA05 & 7168, 96);
            OnePasswordError onePasswordError = (OnePasswordError) mutableStateA0N.getValue();
            if (onePasswordError == null) {
                bfm.AgE(402347729);
            } else {
                boolean zA1Y = AnonymousClass001.A1Y(mutableStateA0N, bfm, 402347730);
                Object objAaT7 = bfm.AaT();
                if (zA1Y || objAaT7 == obj) {
                    objAaT7 = new HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$3$1$1(mutableStateA0N);
                    bfm.Ai0(objAaT7);
                }
                OnePasswordErrorDialogKt.OnePasswordErrorDialog(onePasswordError, (Function0) objAaT7, null, bfm, iA1b, 4);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(onePasswordHandoff, str, str2, bRg2, i, i2);
        }
    }

    public static final OnePasswordError onePasswordError(RequestCredentialAuthorization.Result.Failed failed) {
        CFK.A0H(TAG, "1Password authorization failed: %s", failed.error);
        return OnePasswordErrorDialogKt.toOnePasswordError(failed);
    }

    public static final /* synthetic */ HwU access$HatchOnePasswordCardButton$lambda$8(C1BO c1bo) {
        return (HwU) c1bo.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.HwU<java.lang.String> rememberOnePasswordLauncher(java.lang.String r11, com.facebook.aura.onepassword.RequestCredentialAuthorization r12, X.G0U<? super com.facebook.aura.onepassword.RequestCredentialAuthorization.Result, kotlin.Unit> r13, X.BFM r14, int r15) {
        /*
            X.Hsu r0 = X.C7VU.A00(r14)
            if (r0 == 0) goto L6b
            X.Fgi r6 = r0.getActivityResultRegistry()
            androidx.compose.runtime.MutableState r9 = X.C1er.A00(r14, r13)
            java.lang.Object r10 = r14.AaT()
            java.lang.Object r2 = X.C78N.A00
            if (r10 != r2) goto L1b
            r0 = 0
            androidx.compose.runtime.ParcelableSnapshotMutableState r10 = X.AnonymousClass004.A11(r14, r0)
        L1b:
            androidx.compose.runtime.MutableState r10 = (androidx.compose.runtime.MutableState) r10
            boolean r4 = r14.A67(r6)
            r0 = r15 & 14
            r0 = r0 ^ 6
            r3 = 0
            r5 = 4
            r7 = r11
            if (r0 <= r5) goto L30
            boolean r0 = r14.A65(r11)
            if (r0 != 0) goto L35
        L30:
            r1 = r15 & 6
            r0 = 0
            if (r1 != r5) goto L36
        L35:
            r0 = 1
        L36:
            r4 = r4 | r0
            r0 = r15 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            r8 = r12
            if (r0 <= r1) goto L46
            boolean r0 = r14.A67(r12)
            if (r0 != 0) goto L4a
        L46:
            r0 = r15 & 48
            if (r0 != r1) goto L4b
        L4a:
            r3 = 1
        L4b:
            boolean r0 = X.AnonymousClass002.A1W(r14, r9, r4, r3)
            java.lang.Object r5 = r14.AaT()
            if (r0 != 0) goto L57
            if (r5 != r2) goto L5f
        L57:
            com.facebook.aura.conversation.view.HatchOnePasswordCardButtonKt$rememberOnePasswordLauncher$1$1 r5 = new com.facebook.aura.conversation.view.HatchOnePasswordCardButtonKt$rememberOnePasswordLauncher$1$1
            r5.<init>(r6, r7, r8, r9, r10)
            r14.Ai0(r5)
        L5f:
            X.G0U r5 = (X.G0U) r5
            X.C78e.A01(r14, r6, r11, r12, r5)
            java.lang.Object r0 = r10.getValue()
            X.HwU r0 = (X.HwU) r0
            return r0
        L6b:
            java.lang.String r0 = "No ActivityResultRegistryOwner for the 1Password launcher"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchOnePasswordCardButtonKt.rememberOnePasswordLauncher(java.lang.String, com.facebook.aura.onepassword.RequestCredentialAuthorization, X.G0U, X.BFM, int):X.HwU");
    }
}
