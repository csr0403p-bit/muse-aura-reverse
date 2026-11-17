package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AYD;
import X.AbstractC05192Wm;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C06H;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D8;
import X.C1DM;
import X.C1YD;
import X.C1b8;
import X.C1er;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.pairs.PairsInvitePreviewKt;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bouncy.AuraBouncyIndication;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceResource;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.profilepicture.AuraBadgedProfilePictureKt;
import com.facebook.aura.vds.compose.profilepicture.AuraProfilePictureKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginAccountRowKt {
    public static final float FACEPILE_AVATAR_STYLE = 44.0f;
    public static final float FACEPILE_BADGE_DISC_SIZE = 22.0f;
    public static final float FACEPILE_BADGE_RING_WIDTH = 2.0f;
    public static final float FACEPILE_BORDER_WIDTH = 3.0f;
    public static final float FACEPILE_HEIGHT = 48.0f;
    public static final float FACEPILE_STEP = 33.0f;
    public static final float ROW_VERTICAL_PADDING = AuraDimensKt.SpacingSmall;
    public static final float SQUIRCLE_BADGE_INSET = 2.0f;

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountRowKt$NativeLoginAccountFace$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginLinkedAccountUiModel $face;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NativeLoginLinkedAccountUiModel nativeLoginLinkedAccountUiModel, BRg bRg, int i, int i2) {
            super(2);
            this.$face = nativeLoginLinkedAccountUiModel;
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
            NativeLoginAccountRowKt.NativeLoginAccountFace(this.$face, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountRowKt$NativeLoginAccountFace$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginLinkedAccountUiModel $face;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(NativeLoginLinkedAccountUiModel nativeLoginLinkedAccountUiModel, BRg bRg, int i, int i2) {
            super(2);
            this.$face = nativeLoginLinkedAccountUiModel;
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
            NativeLoginAccountRowKt.NativeLoginAccountFace(this.$face, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountRowKt$NativeLoginAccountFacepile$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $accountCount;
        public final /* synthetic */ AHD<NativeLoginLinkedAccountUiModel> $faces;
        public final /* synthetic */ AuraDrawableSource $fallbackGlyph;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AHD<NativeLoginLinkedAccountUiModel> ahd, int i, BRg bRg, AuraDrawableSource auraDrawableSource, int i2, int i3) {
            super(2);
            this.$faces = ahd;
            this.$accountCount = i;
            this.$modifier = bRg;
            this.$fallbackGlyph = auraDrawableSource;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginAccountRowKt.NativeLoginAccountFacepile(this.$faces, this.$accountCount, this.$modifier, this.$fallbackGlyph, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountRowKt$NativeLoginAccountFacepile$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $accountCount;
        public final /* synthetic */ AHD<NativeLoginLinkedAccountUiModel> $faces;
        public final /* synthetic */ AuraDrawableSource $fallbackGlyph;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(AHD<NativeLoginLinkedAccountUiModel> ahd, int i, BRg bRg, AuraDrawableSource auraDrawableSource, int i2, int i3) {
            super(2);
            this.$faces = ahd;
            this.$accountCount = i;
            this.$modifier = bRg;
            this.$fallbackGlyph = auraDrawableSource;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginAccountRowKt.NativeLoginAccountFacepile(this.$faces, this.$accountCount, this.$modifier, this.$fallbackGlyph, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountRowKt$NativeLoginAccountFacepileOverflow$2, reason: invalid class name and case insensitive filesystem */
    public final class C125192 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $count;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125192(int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$count = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginAccountRowKt.NativeLoginAccountFacepileOverflow(this.$count, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountRowKt$NativeLoginAccountRow$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ boolean $clickable;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $onClickLabel;
        public final /* synthetic */ C1DM $shape;
        public final /* synthetic */ boolean $showChevron;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(NativeLoginAccountUiModel nativeLoginAccountUiModel, Function0<Unit> function0, BRg bRg, boolean z, boolean z2, C1DM c1dm, String str, boolean z3, int i, int i2) {
            super(2);
            this.$account = nativeLoginAccountUiModel;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$loading = z;
            this.$clickable = z2;
            this.$shape = c1dm;
            this.$onClickLabel = str;
            this.$showChevron = z3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginAccountRowKt.NativeLoginAccountRow(this.$account, this.$onClick, this.$modifier, this.$loading, this.$clickable, this.$shape, this.$onClickLabel, this.$showChevron, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void NativeLoginAccountFace(NativeLoginLinkedAccountUiModel nativeLoginLinkedAccountUiModel, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass5;
        BRg bRg2 = bRg;
        bfm.AgG(2140391273);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeLoginLinkedAccountUiModel, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            MutableState mutableStateA00 = C1er.A00(bfm, new B6A(AnonymousClass002.A0c(bfm).secondaryElevated));
            AuraDrawableSource auraDrawableSourceLinkedAccountBadge = linkedAccountBadge(nativeLoginLinkedAccountUiModel.platform);
            String str = nativeLoginLinkedAccountUiModel.photoUrl;
            if (str == null) {
                bfm.AgE(1312231967);
                if (auraDrawableSourceLinkedAccountBadge != null) {
                    bfm.AgE(1312255527);
                    BRg bRgA07 = C10G.A07(bRg2, FACEPILE_AVATAR_STYLE);
                    Object objAaT = bfm.AaT();
                    if (objAaT == C78N.A00) {
                        objAaT = NativeLoginAccountRowKt$NativeLoginAccountFace$1$1.INSTANCE;
                        bfm.Ai0(objAaT);
                    }
                    AuraImageKt.AuraImage(auraDrawableSourceLinkedAccountBadge, AnonymousClass001.A0X(bRgA07, objAaT), null, null, false, false, null, false, null, bfm, 0, 508);
                } else {
                    bfm.AgE(1312395833);
                }
                AnonymousClass006.A1N(bfm);
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass5 = new AnonymousClass2(nativeLoginLinkedAccountUiModel, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass5;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 1312410713);
            if (auraDrawableSourceLinkedAccountBadge == null) {
                bfm.AgE(1312445340);
                float f = FACEPILE_AVATAR_STYLE;
                float f2 = FACEPILE_BORDER_WIDTH;
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = NativeLoginAccountRowKt$NativeLoginAccountFace$3$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraProfilePictureKt.m2594AuraProfilePictured7e1vww(str, f, AnonymousClass001.A0X(bRg2, objAaT2), mutableStateA00, null, null, null, null, null, null, f2, bfm, 48, 6, 1008);
            } else {
                bfm.AgE(1312681064);
                float fBadgeInset = FACEPILE_BADGE_RING_WIDTH + badgeInset(nativeLoginLinkedAccountUiModel.platform);
                float f3 = FACEPILE_AVATAR_STYLE;
                float f4 = FACEPILE_BADGE_DISC_SIZE - (2.0f * fBadgeInset);
                float f5 = FACEPILE_BORDER_WIDTH;
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == C78N.A00) {
                    objAaT3 = NativeLoginAccountRowKt$NativeLoginAccountFace$4$1.INSTANCE;
                    bfm.Ai0(objAaT3);
                }
                AuraBadgedProfilePictureKt.m2593AuraBadgedProfilePicture7lJwU(str, auraDrawableSourceLinkedAccountBadge, AnonymousClass001.A0X(bRg2, objAaT3), f3, f4, mutableStateA00, f5, fBadgeInset, bfm, 1575936, 0);
            }
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(nativeLoginLinkedAccountUiModel, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass5;
        }
    }

    public static final void NativeLoginAccountFacepile(AHD<NativeLoginLinkedAccountUiModel> ahd, int i, BRg bRg, AuraDrawableSource auraDrawableSource, BFM bfm, int i2, int i3) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass6;
        BRg bRg2;
        int i4;
        BRg bRgA0P = bRg;
        AuraDrawableSource auraDrawableSource2 = auraDrawableSource;
        bfm.AgG(1199076367);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ahd, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass004.A0E(bfm, i);
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            iA05 |= 384;
        } else if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRgA0P);
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            iA05 |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA05 |= AnonymousClass002.A00(AnonymousClass004.A1a(auraDrawableSource2, bfm, i2) ? 1 : 0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i5 != 0) {
                bRgA0P = BRg.A00;
            }
            if (i6 != 0) {
                auraDrawableSource2 = null;
            }
            NativeLoginLinkedAccountUiModel nativeLoginLinkedAccountUiModel = (NativeLoginLinkedAccountUiModel) AbstractC0878AGe.A0G(ahd);
            if (nativeLoginLinkedAccountUiModel == null) {
                bfm.AgE(441315005);
                if (auraDrawableSource2 != null) {
                    bfm.AgE(441346253);
                    float f = FACEPILE_AVATAR_STYLE;
                    BRg bRgA04 = C10G.A04(C10G.A08(bRgA0P, f), FACEPILE_HEIGHT);
                    Object objAaT = bfm.AaT();
                    if (objAaT == C78N.A00) {
                        objAaT = NativeLoginAccountRowKt$NativeLoginAccountFacepile$1$1.INSTANCE;
                        bfm.Ai0(objAaT);
                    }
                    BRg bRgA0X = AnonymousClass001.A0X(bRgA04, objAaT);
                    InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0E, false);
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgA0X);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V != null) {
                        AnonymousClass005.A0n(bfm, bbi, function0);
                        AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
                        AuraImageKt.AuraImage(auraDrawableSource2, C10G.A07(BRg.A00, f), null, null, false, false, null, false, null, bfm, ((iA05 >> 9) & 14) | 384, 504);
                        BBI.A0R(bbi, true);
                    }
                } else {
                    bfm.AgE(441721043);
                }
                AnonymousClass006.A1M(bfm);
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass6 = new AnonymousClass3(ahd, i, bRgA0P, auraDrawableSource2, i2, i3);
                    bBbAAc.A06 = anonymousClass6;
                }
                return;
            }
            bfm.AgE(441735923);
            BBI bbi2 = (BBI) bfm;
            BBI.A0R(bbi2, false);
            int i7 = 1;
            NativeLoginLinkedAccountUiModel nativeLoginLinkedAccountUiModel2 = (NativeLoginLinkedAccountUiModel) AbstractC0878AGe.A0A(1, ahd);
            if (nativeLoginLinkedAccountUiModel2 == null || i != 2) {
                nativeLoginLinkedAccountUiModel2 = null;
            } else {
                i7 = 2;
            }
            int i8 = i - i7;
            if (i8 < 0) {
                i8 = 0;
            }
            BRg bRgA042 = C10G.A04(C10G.A08(bRgA0P, (nativeLoginLinkedAccountUiModel2 != null || i8 > 0) ? FACEPILE_STEP + FACEPILE_AVATAR_STYLE : FACEPILE_AVATAR_STYLE), FACEPILE_HEIGHT);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = NativeLoginAccountRowKt$NativeLoginAccountFacepile$4$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0X2 = AnonymousClass001.A0X(bRgA042, objAaT2);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0J2 = AnonymousClass003.A0J(bbi2);
            AKQ akqA042 = BBI.A04(bbi2);
            BRg bRgA012 = AxM.A01(bfm, bRgA0X2);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi2.A0V != null) {
                AnonymousClass005.A0n(bfm, bbi2, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA042, bRgA012, iA0J2);
                if (nativeLoginLinkedAccountUiModel2 != null) {
                    bfm.AgE(-97012067);
                    bRg2 = null;
                    i4 = 2;
                    NativeLoginAccountFace(nativeLoginLinkedAccountUiModel2, AYD.A01(BRg.A00, FACEPILE_STEP, 0.0f), bfm, NativeLoginLinkedAccountUiModel.$stable | 48, 0);
                } else if (i8 > 0) {
                    bfm.AgE(-97008102);
                    bRg2 = null;
                    i4 = 2;
                    NativeLoginAccountFacepileOverflow(i8, AYD.A01(BRg.A00, FACEPILE_STEP, 0.0f), bfm, 48, 0);
                } else {
                    bRg2 = null;
                    i4 = 2;
                    bfm.AgE(1287861433);
                }
                BBI.A0R(bbi2, false);
                NativeLoginAccountFace(nativeLoginLinkedAccountUiModel, bRg2, bfm, NativeLoginLinkedAccountUiModel.$stable, i4);
                bRgA0P = AnonymousClass001.A0P(bbi2, bRgA0P);
            }
            C00x.A00();
            throw F60.createAndThrow();
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass6 = new AnonymousClass6(ahd, i, bRgA0P, auraDrawableSource2, i2, i3);
            bBbAAc.A06 = anonymousClass6;
        }
    }

    public static final void NativeLoginAccountFacepileOverflow(int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-1506303655);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        int i4 = i3 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 19, 18), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA03 = C1b8.A03(C10G.A07(bRg2, FACEPILE_AVATAR_STYLE), C1D8.A00, AnonymousClass002.A0c(bfm).avatarBorder);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, Integer.valueOf(i), R.string._name_removed__res_0x7f1204ce), null, C06G.A08(bfm), AnonymousClass002.A0f(bfm).footnoteMedium, null, null, null, false, 0, 1, 0, null, null, null, bfm, 805306368, 0, 15858);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125192(i, bRg2, i2, i3);
        }
    }

    public static final void NativeLoginAccountRow(NativeLoginAccountUiModel nativeLoginAccountUiModel, Function0<Unit> function0, BRg bRg, boolean z, boolean z2, C1DM c1dm, String str, boolean z3, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        C1DM c1dmA0R;
        BRg bRgA0Y;
        BRg bRg2;
        BRg bRg3 = bRg;
        boolean z4 = z;
        boolean z5 = z2;
        C1DM c1dm2 = c1dm;
        String str2 = str;
        boolean z6 = z3;
        boolean zA1a = AnonymousClass002.A1a(nativeLoginAccountUiModel, function0);
        bfm.AgG(-1415768273);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeLoginAccountUiModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg3);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z4);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, z5);
        }
        int i6 = i2 & 32;
        int iA0i = 196608;
        if (i6 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, c1dm2);
            iA05 |= iA0i;
        }
        int i7 = i2 & 64;
        int iA0j = 1572864;
        if (i7 != 0) {
            iA05 |= iA0j;
        } else if ((i & 1572864) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, str2);
            iA05 |= iA0j;
        }
        int i8 = i2 & 128;
        int iA0u = 12582912;
        if (i8 != 0) {
            iA05 |= iA0u;
        } else if ((i & 12582912) == 0) {
            i8 = 0;
            iA0u = AnonymousClass004.A0u(bfm, z6);
            iA05 |= iA0u;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            if (i4 != 0) {
                z4 = false;
            }
            if (i5 != 0) {
                z5 = true;
            }
            C06H c06h = null;
            if (i6 != 0) {
                c1dm2 = null;
            }
            if (i7 != 0) {
                str2 = null;
            }
            if (i8 != 0) {
                z6 = true;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204d7);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12051b);
            BRg bRgA00 = AbstractC05192Wm.A00(AnonymousClass005.A0O(), bRg3);
            float f = 0.0f;
            AuraBouncyIndication auraBouncyIndication = new AuraBouncyIndication(f, f, f, f, f, 31, c06h);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            BRg bRgA01 = C0v5.A01(auraBouncyIndication, (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT, obj), bRgA00, new C1YD(0), str2, function0, z5);
            if (c1dm2 == null) {
                bfm.AgE(951351475);
                c1dmA0R = C06G.A0R(bfm);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 951350669);
                c1dmA0R = c1dm2;
            }
            BRg bRgA012 = C1b8.A01(C11U.A03(bRgA01, c1dmA0R), AnonymousClass002.A0c(bfm).secondaryElevated);
            if (z4) {
                bfm.AgE(-572750477);
                bRg2 = BRg.A00;
                boolean zA65 = bfm.A65(strA012);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == obj) {
                    objAaT2 = new NativeLoginAccountRowKt$NativeLoginAccountRow$2$1(strA012);
                    bfm.Ai0(objAaT2);
                }
                bRgA0Y = AnonymousClass001.A0Y(bRg2, objAaT2, false);
                BBI.A0R(bbiA0M, false);
            } else {
                bfm.AgE(-572558463);
                BBI.A0R(bbiA0M, false);
                bRgA0Y = BRg.A00;
                bRg2 = bRgA0Y;
            }
            BRg bRgThen = bRgA012.then(bRgA0Y);
            float f2 = AuraDimensKt.SpacingLarge;
            float f3 = AuraDimensKt.SpacingMedium;
            float f4 = ROW_VERTICAL_PADDING;
            BRg bRgA0C = C3U4.A0C(bRgThen, f2, f4, f3, f4);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingXsmall);
            long j = bbiA0M.A06;
            int i9 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA013 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0K, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i9);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA013, g0u);
            BRg bRgA0O = AnonymousClass001.A0O(C90m.A00, bRg2, zA1a);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMicro, 0);
            int iA0D = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA042 = BBI.A04(bbiA0M);
            BRg bRgA014 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA014, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(nativeLoginAccountUiModel.displayName, null, C06G.A0C(bfm), C06G.A0W(bfm), null, null, null, false, 0, zA1a ? 1 : 0, 2, null, null, null, bfm, 805306368, 6, 14834);
            C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C06G.A0I(bfm, akh), c1822ArmA0Y, null, null, null, false, 0, zA1a ? 1 : 0, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbiA0M, zA1a);
            NativeLoginAccountFacepile(nativeLoginAccountUiModel.linkedAccounts, nativeLoginAccountUiModel.getProfileCount$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow(), null, linkedAccountBadge(nativeLoginAccountUiModel.fallbackGlyphPlatform), bfm, NativeLoginLinkedAccountUiModel.$stable, 4);
            if (z4) {
                bfm.AgE(-2077219013);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(bRg2, AuraIconKt.auraIconSize(AuraIconSize.TINY, bfm, 6)), null, 0L, bfm, 0, 6);
            } else if (z6) {
                bfm.AgE(-2077106979);
                AuraIconKt.m2567AuraIconFHprtrg(null, AbstractC8407FdO.A00(bfm, R.drawable.meta_brand_design_system_icons_vector_caret_right_outline_24), AuraIconSize.TINY, null, AnonymousClass001.A0f(bfm, akh).tertiaryText, null, bfm, (AVy.$stable << 3) | 384, 41);
            } else {
                bfm.AgE(-2076843665);
            }
            BBI.A0R(bbiA0M, false);
            BBI.A0R(bbiA0M, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(nativeLoginAccountUiModel, function0, bRg3, z4, z5, c1dm2, str2, z6, i, i2);
        }
    }

    public static final float badgeInset(String str) {
        if (MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM.equals(str)) {
            return SQUIRCLE_BADGE_INSET;
        }
        return 0.0f;
    }

    public static final AuraDrawableSource linkedAccountBadge(String str) {
        int i;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1337936983:
                if (!str.equals(MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_THREADS)) {
                    return null;
                }
                i = R.drawable.aura_login_threads_badge;
                break;
            case 101664:
                if (!str.equals("frl")) {
                    return null;
                }
                i = R.drawable.aura_login_horizon_filled_24;
                break;
            case 2987536:
                if (!str.equals(NativeLoginRememberedRowsKt.REMEMBERED_ROW_GLYPH_PLATFORM)) {
                    return null;
                }
                i = R.drawable.meta_ai_icon;
                break;
            case 3363322:
                if (!str.equals(PairsInvitePreviewKt.MUSE_ID_PREFIX)) {
                    return null;
                }
                i = R.drawable.hatch_logo;
                break;
            case 28903346:
                if (!str.equals(MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM)) {
                    return null;
                }
                i = R.drawable.instagram_logo_round;
                break;
            case 497130182:
                if (!str.equals(MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK)) {
                    return null;
                }
                i = R.drawable.facebook_logo_round;
                break;
            case 1934780818:
                if (!str.equals(NativeLoginAccountResolverKt.WHATSAPP_USER_ID)) {
                    return null;
                }
                i = R.drawable.whatsapp_logo_round;
                break;
            default:
                return null;
        }
        return new AuraDrawableSourceResource(i);
    }
}
