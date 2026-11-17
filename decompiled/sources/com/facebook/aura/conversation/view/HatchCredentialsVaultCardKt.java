package com.facebook.aura.conversation.view;

import X.AOe;
import X.ARD;
import X.ASk;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C10G;
import X.C1D3;
import X.C1Dt;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.conversation.view.SavedCredential;
import com.facebook.aura.deeplink.BrowserCredentialsDeeplink;
import com.facebook.aura.model.InternalLinkActionCardPresentation;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.onepassword.OnePasswordHandoff;
import com.facebook.aura.settings.CredentialCandidate;
import com.facebook.aura.settings.HatchSecureStorageScreenKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.view.common.HatchConnectorIconKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchCredentialsVaultCardKt {
    public static final int SettleDurationMs = 300;

    /* renamed from: com.facebook.aura.conversation.view.HatchCredentialsVaultCardKt$CredentialsVaultButton$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<CredentialCandidate, BFM, Integer, Unit> {
        public final /* synthetic */ InternalLinkActionCardPresentation $card;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $enterLabel;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ long $settledContentColor;
        public final /* synthetic */ String $signedInClickLabel;
        public final /* synthetic */ String $signedInLabel;
        public final /* synthetic */ String $sourceSessionId;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InternalLinkActionCardPresentation internalLinkActionCardPresentation, String str, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, Context context, String str2, String str3, String str4, long j) {
            super(3);
            this.$card = internalLinkActionCardPresentation;
            this.$enterLabel = str;
            this.$navigator = auraNavigator;
            this.$userSession = abstractC3358CGz;
            this.$context = context;
            this.$sourceSessionId = str2;
            this.$signedInLabel = str3;
            this.$signedInClickLabel = str4;
            this.$settledContentColor = j;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(CredentialCandidate credentialCandidate, BFM bfm, Integer num) {
            invoke(credentialCandidate, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(CredentialCandidate credentialCandidate, BFM bfm, int i) {
            int iA0d = i;
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, credentialCandidate);
            }
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
                if (credentialCandidate == null) {
                    bfm.AgE(-2126502732);
                    InternalLinkActionCardPresentation internalLinkActionCardPresentation = this.$card;
                    String str = internalLinkActionCardPresentation.type;
                    String str2 = this.$enterLabel;
                    boolean zA1R = AnonymousClass001.A1R(bfm, this.$sourceSessionId, AnonymousClass001.A1T(bfm, this.$context, AnonymousClass001.A1T(bfm, this.$userSession, AnonymousClass001.A1T(bfm, this.$navigator, bfm.A67(internalLinkActionCardPresentation)))));
                    InternalLinkActionCardPresentation internalLinkActionCardPresentation2 = this.$card;
                    AuraNavigator auraNavigator = this.$navigator;
                    AbstractC3358CGz abstractC3358CGz = this.$userSession;
                    Context context = this.$context;
                    String str3 = this.$sourceSessionId;
                    Object objAaT = bfm.AaT();
                    if (zA1R || objAaT == C78N.A00) {
                        objAaT = new HatchCredentialsVaultCardKt$CredentialsVaultButton$1$1$1(internalLinkActionCardPresentation2, auraNavigator, abstractC3358CGz, context, str3);
                        bfm.Ai0(objAaT);
                    }
                    HatchInternalLinkActionCardKt.m628InternalLinkCardButtonPIknLig(str, str2, (Function0) objAaT, null, false, null, null, bfm, 0, 120);
                } else {
                    bfm.AgE(-2125938594);
                    String str4 = this.$card.type;
                    BS0 bs0 = BRg.A00;
                    Object objAaT2 = bfm.AaT();
                    Object obj = C78N.A00;
                    if (objAaT2 == obj) {
                        objAaT2 = HatchCredentialsVaultCardKt$CredentialsVaultButton$1$2$1.INSTANCE;
                        bfm.Ai0(objAaT2);
                    }
                    BRg bRgA01 = ARD.A01(bs0, (G0U) objAaT2, false);
                    String str5 = this.$signedInLabel;
                    boolean zA67 = bfm.A67(this.$navigator) | AnonymousClass001.A1M(iA0d);
                    AuraNavigator auraNavigator2 = this.$navigator;
                    Object objAaT3 = bfm.AaT();
                    if (zA67 || objAaT3 == obj) {
                        objAaT3 = new HatchCredentialsVaultCardKt$CredentialsVaultButton$1$3$1(auraNavigator2, credentialCandidate);
                        bfm.Ai0(objAaT3);
                    }
                    HatchInternalLinkActionCardKt.m628InternalLinkCardButtonPIknLig(str4, str5, (Function0) objAaT3, bRgA01, false, this.$signedInClickLabel, new B6A(this.$settledContentColor), bfm, 0, 16);
                }
                AnonymousClass002.A19(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchCredentialsVaultCardKt$CredentialsVaultButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ InternalLinkActionCardPresentation $card;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $offersOnePassword;
        public final /* synthetic */ SavedCredential $saved;
        public final /* synthetic */ AOe<Float> $settleSpec;
        public final /* synthetic */ String $sourceSessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InternalLinkActionCardPresentation internalLinkActionCardPresentation, SavedCredential savedCredential, AOe<Float> aOe, String str, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$card = internalLinkActionCardPresentation;
            this.$saved = savedCredential;
            this.$settleSpec = aOe;
            this.$sourceSessionId = str;
            this.$offersOnePassword = z;
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
            HatchCredentialsVaultCardKt.CredentialsVaultButton(this.$card, this.$saved, this.$settleSpec, this.$sourceSessionId, this.$offersOnePassword, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchCredentialsVaultCardKt$CredentialsVaultIcon$1, reason: invalid class name and case insensitive filesystem */
    public final class C114621 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $animateSettle;
        public final /* synthetic */ boolean $settled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114621(boolean z, boolean z2) {
            super(2);
            this.$settled = z;
            this.$animateSettle = z2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                HatchCredentialsVaultMorphIconKt.HatchCredentialsVaultMorphIcon(this.$settled, this.$animateSettle, C10G.A07(BRg.A00, HatchInternalLinkActionCardKt.CardFallbackGlyphSize), bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchCredentialsVaultCardKt$CredentialsVaultIcon$2, reason: invalid class name and case insensitive filesystem */
    public final class C114632 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $animateSettle;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AOe<Float> $settleSpec;
        public final /* synthetic */ boolean $settled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114632(String str, boolean z, boolean z2, AOe<Float> aOe, BRg bRg, int i, int i2) {
            super(2);
            this.$imageUrl = str;
            this.$settled = z;
            this.$animateSettle = z2;
            this.$settleSpec = aOe;
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
            HatchCredentialsVaultCardKt.CredentialsVaultIcon(this.$imageUrl, this.$settled, this.$animateSettle, this.$settleSpec, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchCredentialsVaultCardKt$CredentialsVaultIcon$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<Boolean, BFM, Integer, Unit> {
        public final /* synthetic */ String $imageUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(3);
            this.$imageUrl = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, BFM bfm, Integer num) {
            invoke(AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(boolean z, BFM bfm, int i) {
            String str;
            int i2;
            int iA1P;
            if ((i & 6) == 0) {
                i |= AnonymousClass004.A0n(bfm, z);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                B6A b6a = null;
                if (z) {
                    str = null;
                    i2 = R.drawable.circle_check_wght400_outline_24;
                    long j = AnonymousClass003.A0c(bfm, -624681425).iconSuccess;
                    boolean zA1V = AnonymousClass001.A1V(bfm);
                    b6a = new B6A(j);
                    iA1P = zA1V;
                } else {
                    str = this.$imageUrl;
                    i2 = R.drawable.ic_secure_lock;
                    iA1P = AnonymousClass004.A1P(bfm, 2109728953);
                }
                HatchInternalLinkActionCardKt.m630InternalLinkCardIconxqIIw2o(str, i2, null, b6a, bfm, iA1P, 4);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchCredentialsVaultCardKt$CredentialsVaultIcon$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $animateSettle;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AOe<Float> $settleSpec;
        public final /* synthetic */ boolean $settled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, boolean z, boolean z2, AOe<Float> aOe, BRg bRg, int i, int i2) {
            super(2);
            this.$imageUrl = str;
            this.$settled = z;
            this.$animateSettle = z2;
            this.$settleSpec = aOe;
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
            HatchCredentialsVaultCardKt.CredentialsVaultIcon(this.$imageUrl, this.$settled, this.$animateSettle, this.$settleSpec, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void CredentialsVaultButton(InternalLinkActionCardPresentation internalLinkActionCardPresentation, SavedCredential savedCredential, AOe<Float> aOe, String str, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        SavedCredential.Saved saved;
        BRg bRg2 = bRg;
        bfm.AgG(1515883975);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(internalLinkActionCardPresentation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(savedCredential, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(aOe, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, str);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, z);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA05, 74898), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            long jMo2428contentColorwmQWz5c = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1).mo2428contentColorwmQWz5c(false, false, bfm, 54);
            int i4 = R.string._name_removed__res_0x7f120c3c;
            if (z) {
                i4 = R.string._name_removed__res_0x7f120c3d;
            }
            C1Dt.A01(aOe, bfm, bRg2, (!(savedCredential instanceof SavedCredential.Saved) || (saved = (SavedCredential.Saved) savedCredential) == null) ? null : saved.candidate, "credentialsVaultCardCta", B1V.A00(bfm, new AnonymousClass1(internalLinkActionCardPresentation, AbstractC2271BQs.A01(bfm, i4), auraNavigatorA0b, abstractC3358CGzA0h, contextA0H, str, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c3e), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c39), jMo2428contentColorwmQWz5c), 1224940772), ((iA05 >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 27648 | (iA05 & 896), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(internalLinkActionCardPresentation, savedCredential, aOe, str, z, bRg2, i, i2);
        }
    }

    public static final void CredentialsVaultIcon(String str, boolean z, boolean z2, AOe<Float> aOe, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass4;
        BRg bRg2 = bRg;
        bfm.AgG(1971059589);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(AnonymousClass004.A1a(aOe, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (str == null) {
                bfm.AgE(-956438848);
                HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(null, null, bRg2, HatchInternalLinkActionCardKt.CardIconSize, 0.0f, 0, 0.0f, null, B1V.A00(bfm, new C114621(z, z2), -1766499181), bfm, ((iA0d >> 6) & 896) | 100663350, 240);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass4 = new C114632(str, z, z2, aOe, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass4;
                }
                return;
            }
            int i4 = iA0d >> 3;
            C1Dt.A01(aOe, bfm, bRg2, Boolean.valueOf(z), "credentialsVaultCardIcon", B1V.A00(bfm, new AnonymousClass3(str), 343483652), (i4 & 14) | 27648 | ((iA0d >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i4 & 896), AnonymousClass004.A1P(bfm, -956072707) ? 1 : 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(str, z, z2, aOe, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass4;
        }
    }

    /* renamed from: HatchCredentialsVaultCard-8V94_ZQ, reason: not valid java name */
    public static final void m581HatchCredentialsVaultCard8V94_ZQ(InternalLinkActionCardPresentation internalLinkActionCardPresentation, long j, C1D3 c1d3, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(internalLinkActionCardPresentation, 0);
        bfm.AgG(-677297443);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(internalLinkActionCardPresentation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, c1d3);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, str);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA65 = bfm.A65(internalLinkActionCardPresentation.url);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                String str2 = internalLinkActionCardPresentation.url;
                objAaT = str2 != null ? BrowserCredentialsDeeplink.INSTANCE.savedCredentialPageUrl(str2) : null;
                bfm.Ai0(objAaT);
            }
            String str3 = (String) objAaT;
            SavedCredential savedCredentialRememberSavedCredential = rememberSavedCredential(str3, bfm, 0);
            boolean z = savedCredentialRememberSavedCredential instanceof SavedCredential.Saved;
            boolean z2 = (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A65(internalLinkActionCardPresentation));
            Object objAaT2 = bfm.AaT();
            if (z2 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT2;
            boolean zA1N = AnonymousClass003.A1N(bfm, savedCredentialRememberSavedCredential, mutableState);
            Object objAaT3 = bfm.AaT();
            if (zA1N || objAaT3 == C78N.A00) {
                objAaT3 = new HatchCredentialsVaultCardKt$HatchCredentialsVaultCard$1$1(savedCredentialRememberSavedCredential, mutableState);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, savedCredentialRememberSavedCredential);
            B1U b1uA00 = B1V.A00(bfm, new HatchCredentialsVaultCardKt$HatchCredentialsVaultCard$2(internalLinkActionCardPresentation, str3, z, str, savedCredentialRememberSavedCredential, MutableState.A0A(mutableState) ? AnonymousClass001.A0K(300, 0) : new ASk(), mutableState), 256416833);
            int i4 = iA05 >> 3;
            HatchInternalLinkActionCardKt.m629InternalLinkCardContainereuL9pac(j, c1d3, bRg2, b1uA00, bfm, (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i4 & 14) | 3072 | ((iA05 >> 6) & 896), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchCredentialsVaultCardKt$HatchCredentialsVaultCard$3(internalLinkActionCardPresentation, j, c1d3, str, bRg2, i, i2);
        }
    }

    public static final String credentialsVaultSubtitle(InternalLinkActionCardPresentation internalLinkActionCardPresentation, String str, BFM bfm, int i) {
        if (str == null) {
            AnonymousClass004.A1A(bfm, -1344600755);
        } else {
            bfm.AgE(-1344600754);
            String strA0t = AnonymousClass001.A0t(bfm, HatchSecureStorageScreenKt.secureStorageDisplayHost(str), R.string._name_removed__res_0x7f120e8b);
            AnonymousClass001.A1D(bfm);
            if (strA0t != null) {
                return strA0t;
            }
        }
        return internalLinkActionCardPresentation.subtitle;
    }

    public static final String credentialsVaultTitle(InternalLinkActionCardPresentation internalLinkActionCardPresentation, String str, BFM bfm, int i) {
        if (internalLinkActionCardPresentation.url == null || str != null) {
            bfm.AgE(-1293513301);
            return AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f120e8c);
        }
        AnonymousClass004.A1A(bfm, -1293433569);
        return internalLinkActionCardPresentation.title;
    }

    public static final OnePasswordHandoff onePasswordHandoffFor(InternalLinkActionCardPresentation internalLinkActionCardPresentation) {
        String str = internalLinkActionCardPresentation.url;
        if (str != null) {
            return OnePasswordHandoff.Companion.from(str, internalLinkActionCardPresentation.authProviders);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean rememberCatalogLoaded(com.facebook.aura.settings.HatchCredentialsViewModel r7, boolean r8, X.BFM r9, int r10) {
        /*
            r0 = r10 & 14
            r6 = r0 ^ 6
            r5 = 1
            r4 = 4
            r2 = 0
            if (r6 <= r4) goto Lf
            boolean r0 = r9.A65(r7)
            if (r0 != 0) goto L14
        Lf:
            r1 = r10 & 6
            r0 = 0
            if (r1 != r4) goto L15
        L14:
            r0 = 1
        L15:
            java.lang.Object r3 = r9.AaT()
            if (r0 != 0) goto L1f
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L23
        L1f:
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = X.AnonymousClass005.A0S(r9, r2)
        L23:
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            if (r6 <= r4) goto L2d
            boolean r0 = r9.A65(r7)
            if (r0 != 0) goto L32
        L2d:
            r1 = r10 & 6
            r0 = 0
            if (r1 != r4) goto L33
        L32:
            r0 = 1
        L33:
            java.lang.Object r4 = r9.AaT()
            if (r0 != 0) goto L3d
            java.lang.Object r0 = X.C78N.A00
            if (r4 != r0) goto L41
        L3d:
            androidx.compose.runtime.ParcelableSnapshotMutableState r4 = X.AnonymousClass005.A0S(r9, r2)
        L41:
            androidx.compose.runtime.MutableState r4 = (androidx.compose.runtime.MutableState) r4
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            r0 = r10 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L55
            boolean r0 = r9.A66(r8)
            if (r0 != 0) goto L5a
        L55:
            r0 = r10 & 48
            if (r0 == r1) goto L5a
            r5 = 0
        L5a:
            boolean r0 = r9.A65(r3)
            boolean r1 = X.AnonymousClass002.A1W(r9, r4, r0, r5)
            java.lang.Object r0 = r9.AaT()
            if (r1 != 0) goto L6c
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L74
        L6c:
            com.facebook.aura.conversation.view.HatchCredentialsVaultCardKt$rememberCatalogLoaded$1$1 r0 = new com.facebook.aura.conversation.view.HatchCredentialsVaultCardKt$rememberCatalogLoaded$1$1
            r0.<init>(r8, r3, r4)
            r9.Ai0(r0)
        L74:
            X.AnonymousClass001.A17(r9, r0, r2)
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchCredentialsVaultCardKt.rememberCatalogLoaded(com.facebook.aura.settings.HatchCredentialsViewModel, boolean, X.BFM, int):boolean");
    }

    public static final String originOf(String str) {
        String host;
        Uri uri = Uri.parse(AnonymousClass002.A0l(str));
        String scheme = uri.getScheme();
        if (scheme == null || C7BY.A0j(scheme) || (host = uri.getHost()) == null || C7BY.A0j(host)) {
            return null;
        }
        int port = uri.getPort();
        return AnonymousClass001.A0u(FGI.A0d(scheme, "://", host, port != -1 ? FGI.A0H(":", port) : ""));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.conversation.view.SavedCredential rememberSavedCredential(java.lang.String r8, X.BFM r9, int r10) {
        /*
            r0 = -1933794642(0xffffffff8cbca2ae, float:-2.9063896E-31)
            r9.AgE(r0)
            r0 = r10 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L13
            boolean r0 = r9.A65(r8)
            if (r0 != 0) goto L18
        L13:
            r1 = r10 & 6
            r0 = 0
            if (r1 != r2) goto L19
        L18:
            r0 = 1
        L19:
            java.lang.Object r4 = r9.AaT()
            if (r0 != 0) goto L23
            java.lang.Object r0 = X.C78N.A00
            if (r4 != r0) goto L2c
        L23:
            if (r8 == 0) goto L34
            java.lang.String r4 = originOf(r8)
        L29:
            r9.Ai0(r4)
        L2c:
            if (r4 != 0) goto L36
            com.facebook.aura.conversation.view.SavedCredential$Unresolved r0 = com.facebook.aura.conversation.view.SavedCredential.Unresolved.INSTANCE
            X.AnonymousClass002.A19(r9)
            return r0
        L34:
            r4 = 0
            goto L29
        L36:
            X.CGz r0 = X.AnonymousClass002.A0h(r9)
            com.facebook.aura.settings.HatchCredentialsViewModel$Factory r5 = new com.facebook.aura.settings.HatchCredentialsViewModel$Factory
            r5.<init>(r0)
            androidx.activity.ComponentActivity r3 = X.AnonymousClass004.A0y(r9)
            X.A6J r2 = X.AnonymousClass003.A0Z(r3)
            java.lang.Class<com.facebook.aura.settings.HatchCredentialsViewModel> r0 = com.facebook.aura.settings.HatchCredentialsViewModel.class
            X.A6i r1 = new X.A6i
            r1.<init>(r0)
            r0 = 0
            X.AEs r6 = X.BQN.A00(r5, r3, r2, r0, r1)
            com.facebook.aura.settings.HatchCredentialsViewModel r6 = (com.facebook.aura.settings.HatchCredentialsViewModel) r6
            boolean r1 = r9.A67(r6)
            java.lang.Object r0 = r9.AaT()
            if (r1 != 0) goto L63
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L6b
        L63:
            com.facebook.aura.conversation.view.HatchCredentialsVaultCardKt$rememberSavedCredential$1$1 r0 = new com.facebook.aura.conversation.view.HatchCredentialsVaultCardKt$rememberSavedCredential$1$1
            r0.<init>(r6)
            r9.Ai0(r0)
        L6b:
            X.G0U r0 = (X.G0U) r0
            int r5 = com.facebook.aura.settings.HatchCredentialsViewModel.$stable
            X.C78e.A05(r9, r6, r0)
            X.1BN<com.facebook.aura.settings.SecureStorageCatalogUiState> r0 = r6.catalogState
            X.1BO r8 = X.C2CK.A02(r9, r0)
            java.lang.Object r0 = r8.getValue()
            com.facebook.aura.settings.SecureStorageCatalogUiState r0 = (com.facebook.aura.settings.SecureStorageCatalogUiState) r0
            X.AHD<com.facebook.aura.settings.CredentialCandidate> r0 = r0.candidates
            boolean r0 = r9.A65(r0)
            java.lang.Object r1 = r9.AaT()
            if (r0 != 0) goto L8e
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto Lcc
        L8e:
            X.AIa r7 = new X.AIa
            r7.<init>()
            java.lang.Object r0 = r8.getValue()
            com.facebook.aura.settings.SecureStorageCatalogUiState r0 = (com.facebook.aura.settings.SecureStorageCatalogUiState) r0
            X.AHD<com.facebook.aura.settings.CredentialCandidate> r0 = r0.candidates
            java.util.Iterator r3 = r0.iterator()
        L9f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lc5
            java.lang.Object r2 = r3.next()
            com.facebook.aura.settings.CredentialCandidate r2 = (com.facebook.aura.settings.CredentialCandidate) r2
            X.AHD<java.lang.String> r0 = r2.origins
            java.util.Iterator r1 = r0.iterator()
        Lb1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9f
            java.lang.String r0 = X.AnonymousClass005.A0j(r1)
            java.lang.String r0 = originOf(r0)
            if (r0 == 0) goto Lb1
            r7.putIfAbsent(r0, r2)
            goto Lb1
        Lc5:
            X.AIa r1 = X.AIW.A0K(r7)
            r9.Ai0(r1)
        Lcc:
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r8.getValue()
            com.facebook.aura.settings.SecureStorageCatalogUiState r0 = (com.facebook.aura.settings.SecureStorageCatalogUiState) r0
            boolean r0 = r0.isLoading
            boolean r0 = rememberCatalogLoaded(r6, r0, r9, r5)
            java.lang.Object r1 = r1.get(r4)
            com.facebook.aura.settings.CredentialCandidate r1 = (com.facebook.aura.settings.CredentialCandidate) r1
            if (r1 == 0) goto Led
            com.facebook.aura.conversation.view.SavedCredential$Saved r0 = new com.facebook.aura.conversation.view.SavedCredential$Saved
            r0.<init>(r1)
        Le7:
            com.facebook.aura.conversation.view.SavedCredential r0 = (com.facebook.aura.conversation.view.SavedCredential) r0
            X.AnonymousClass001.A1D(r9)
            return r0
        Led:
            if (r0 == 0) goto Lf2
            com.facebook.aura.conversation.view.SavedCredential$NotSaved r0 = com.facebook.aura.conversation.view.SavedCredential.NotSaved.INSTANCE
            goto Le7
        Lf2:
            com.facebook.aura.conversation.view.SavedCredential$Unresolved r0 = com.facebook.aura.conversation.view.SavedCredential.Unresolved.INSTANCE
            goto Le7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchCredentialsVaultCardKt.rememberSavedCredential(java.lang.String, X.BFM, int):com.facebook.aura.conversation.view.SavedCredential");
    }
}
