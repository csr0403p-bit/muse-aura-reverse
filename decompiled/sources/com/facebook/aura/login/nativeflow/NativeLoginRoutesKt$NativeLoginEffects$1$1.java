package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C7OU;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.activity.result.ActivityResult;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.NativeLoginCheckpointWebScreenKey;
import com.facebook.aura.navigation.key.NativeLoginLandingScreenKey;
import com.facebook.aura.navigation.key.NativeLoginPhoneEntryScreenKey;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginEffects$1$1", f = "NativeLoginRoutes.kt", l = {785}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginEffects$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $profileRemoved;
    public final /* synthetic */ C7OU<Intent, ActivityResult> $smsConsentLauncher;
    public final /* synthetic */ View $view;
    public final /* synthetic */ NativeLoginViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginEffects$1$1(NativeLoginViewModel nativeLoginViewModel, C7OU<Intent, ActivityResult> c7ou, AuraNavigator auraNavigator, Context context, View view, String str, HtJ<? super NativeLoginRoutesKt$NativeLoginEffects$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = nativeLoginViewModel;
        this.$smsConsentLauncher = c7ou;
        this.$navigator = auraNavigator;
        this.$context = context;
        this.$view = view;
        this.$profileRemoved = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NativeLoginRoutesKt$NativeLoginEffects$1$1(this.$viewModel, this.$smsConsentLauncher, this.$navigator, this.$context, this.$view, this.$profileRemoved, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<NativeLoginViewEffect> c20q = this.$viewModel.viewEffect;
            final C7OU<Intent, ActivityResult> c7ou = this.$smsConsentLauncher;
            final AuraNavigator auraNavigator = this.$navigator;
            final Context context = this.$context;
            final View view = this.$view;
            final String str = this.$profileRemoved;
            C20Z<? super NativeLoginViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginEffects$1$1.1

                /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginEffects$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public final class C02181 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
                    public static final C02181 INSTANCE = new C02181();

                    public C02181() {
                        super(1);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
                    @Override // X.G0U
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Boolean invoke(com.facebook.aura.navigation.AuraNavKey r1) {
                        /*
                            r0 = this;
                            r0 = 0
                            X.C7384Etj.A0Y(r1, r0)
                            com.facebook.aura.navigation.key.NativeLoginNameScreenKey r0 = com.facebook.aura.navigation.key.NativeLoginNameScreenKey.INSTANCE
                            boolean r0 = r1.equals(r0)
                            if (r0 != 0) goto L15
                            com.facebook.aura.navigation.key.NativeLoginItemizedConsentScreenKey r0 = com.facebook.aura.navigation.key.NativeLoginItemizedConsentScreenKey.INSTANCE
                            boolean r1 = r1.equals(r0)
                            r0 = 0
                            if (r1 == 0) goto L16
                        L15:
                            r0 = 1
                        L16:
                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginEffects$1$1.AnonymousClass1.C02181.invoke(com.facebook.aura.navigation.AuraNavKey):java.lang.Boolean");
                    }
                }

                /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginEffects$1$1$1$2, reason: invalid class name */
                public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
                    public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

                    public AnonymousClass2() {
                        super(1);
                    }

                    @Override // X.G0U
                    public final Boolean invoke(AuraNavKey auraNavKey) {
                        C7384Etj.A0Y(auraNavKey, 0);
                        return Boolean.valueOf(auraNavKey instanceof NativeLoginCheckpointWebScreenKey);
                    }
                }

                /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginEffects$1$1$1$3, reason: invalid class name */
                public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
                    public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

                    public AnonymousClass3() {
                        super(1);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
                    @Override // X.G0U
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Boolean invoke(com.facebook.aura.navigation.AuraNavKey r1) {
                        /*
                            r0 = this;
                            r0 = 0
                            X.C7384Etj.A0Y(r1, r0)
                            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.NativeLoginMoreAccountsSheetKey
                            if (r0 != 0) goto L41
                            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.NativeLoginOtpScreenKey
                            if (r0 != 0) goto L41
                            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.NativeLoginPasswordScreenKey
                            if (r0 != 0) goto L41
                            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.NativeLoginAccountSelectionScreenKey
                            if (r0 != 0) goto L41
                            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.NativeLoginTwoFactorScreenKey
                            if (r0 != 0) goto L41
                            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.NativeLoginTwoFactorMethodScreenKey
                            if (r0 != 0) goto L41
                            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.NativeLoginNtpUpsellChoiceScreenKey
                            if (r0 != 0) goto L41
                            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.NativeLoginNtpUpsellScreenKey
                            if (r0 != 0) goto L41
                            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.NativeLoginLinkingDisclosureScreenKey
                            if (r0 != 0) goto L41
                            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.NativeLoginItemizedConsentScreenKey
                            if (r0 != 0) goto L41
                            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.NativeLoginNameScreenKey
                            if (r0 != 0) goto L41
                            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.NativeLoginBirthdayScreenKey
                            if (r0 != 0) goto L41
                            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.NativeLoginCheckpointScreenKey
                            if (r0 != 0) goto L41
                            boolean r0 = r1 instanceof com.facebook.aura.navigation.key.NativeLoginReactivationScreenKey
                            if (r0 != 0) goto L41
                            boolean r1 = r1 instanceof com.facebook.aura.navigation.key.NativeLoginCheckpointWebScreenKey
                            r0 = 0
                            if (r1 == 0) goto L42
                        L41:
                            r0 = 1
                        L42:
                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginEffects$1$1.AnonymousClass1.AnonymousClass3.invoke(com.facebook.aura.navigation.AuraNavKey):java.lang.Boolean");
                    }
                }

                /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginEffects$1$1$1$4, reason: invalid class name */
                public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
                    public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

                    public AnonymousClass4() {
                        super(1);
                    }

                    @Override // X.G0U
                    public final Boolean invoke(AuraNavKey auraNavKey) {
                        C7384Etj.A0Y(auraNavKey, 0);
                        return C3cG.A0P(auraNavKey instanceof NativeLoginLandingScreenKey);
                    }
                }

                /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginEffects$1$1$1$5, reason: invalid class name */
                public final class AnonymousClass5 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
                    public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

                    public AnonymousClass5() {
                        super(1);
                    }

                    @Override // X.G0U
                    public final Boolean invoke(AuraNavKey auraNavKey) {
                        C7384Etj.A0Y(auraNavKey, 0);
                        return C3cG.A0P(auraNavKey instanceof NativeLoginPhoneEntryScreenKey);
                    }
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((NativeLoginViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                /* JADX WARN: Removed duplicated region for block: B:113:0x025e  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[PHI: r4 r5
  0x0040: PHI (r4v12 com.facebook.aura.navigation.AuraNavKey) = (r4v5 com.facebook.aura.navigation.AuraNavKey), (r4v13 com.facebook.aura.navigation.AuraNavKey) binds: [B:96:0x0207, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r5v8 com.facebook.aura.navigation.AuraNavigator) = (r5v3 com.facebook.aura.navigation.AuraNavigator), (r5v9 com.facebook.aura.navigation.AuraNavigator) binds: [B:96:0x0207, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:83:0x01b9 A[PHI: r4 r5
  0x01b9: PHI (r4v11 com.facebook.aura.navigation.AuraNavKey) = (r4v8 com.facebook.aura.navigation.AuraNavKey), (r4v12 com.facebook.aura.navigation.AuraNavKey) binds: [B:81:0x01b5, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]
  0x01b9: PHI (r5v7 com.facebook.aura.navigation.AuraNavigator) = (r5v5 com.facebook.aura.navigation.AuraNavigator), (r5v8 com.facebook.aura.navigation.AuraNavigator) binds: [B:81:0x01b5, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(com.facebook.aura.login.nativeflow.NativeLoginViewEffect r21, X.HtJ<? super kotlin.Unit> r22) {
                    /*
                        Method dump skipped, instructions count: 700
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginEffects$1$1.AnonymousClass1.emit(com.facebook.aura.login.nativeflow.NativeLoginViewEffect, X.HtJ):java.lang.Object");
                }
            };
            this.label = 1;
            if (c20q.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((NativeLoginRoutesKt$NativeLoginEffects$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
