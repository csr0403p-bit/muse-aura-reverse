package com.facebook.aura.hotels;

import X.AGI;
import X.AKQ;
import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1DG;
import X.C1DM;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.C9m9;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HotelResultsCardKt {

    /* renamed from: com.facebook.aura.hotels.HotelResultsCardKt$HotelResultImage$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HotelImage $image;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HotelImage hotelImage) {
            super(2);
            this.$image = hotelImage;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                BRg bRgA01 = C1b8.A01(C10G.A01, AnonymousClass002.A0c(bfm).elevated);
                if (this.$image == null) {
                    bfm.AgE(-1201959258);
                    C01N.A07(bfm, bRgA01);
                } else {
                    bfm.AgE(-1201894158);
                    AuraImageKt.m2573AuraImageXRP3Ue8(this.$image.url, bRgA01, B18.A00, null, null, false, new C1DG(220.0f), 0L, false, false, false, null, null, null, null, bfm, 1576320, 48, 30640);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelResultsCardKt$HotelResultImage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $compact;
        public final /* synthetic */ HotelImage $image;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $sharedKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HotelImage hotelImage, String str, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$image = hotelImage;
            this.$sharedKey = str;
            this.$modifier = bRg;
            this.$compact = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelResultsCardKt.HotelResultImage(this.$image, this.$sharedKey, this.$modifier, this.$compact, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelResultsCardKt$HotelResultRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HotelResult $hotel;
        public final /* synthetic */ String $imageSharedKey;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HotelResult hotelResult, String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$hotel = hotelResult;
            this.$imageSharedKey = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelResultsCardKt.HotelResultRow(this.$hotel, this.$imageSharedKey, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelResultsCardKt$HotelResultText$2, reason: invalid class name and case insensitive filesystem */
    public final class C121972 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $compact;
        public final /* synthetic */ HotelResult $hotel;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121972(HotelResult hotelResult, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$hotel = hotelResult;
            this.$compact = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelResultsCardKt.HotelResultText(this.$hotel, this.$compact, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelResultsCardKt$HotelResultTile$3, reason: invalid class name and case insensitive filesystem */
    public final class C121983 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HotelResult $hotel;
        public final /* synthetic */ String $imageSharedKey;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121983(HotelResult hotelResult, String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$hotel = hotelResult;
            this.$imageSharedKey = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelResultsCardKt.HotelResultTile(this.$hotel, this.$imageSharedKey, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelResultsCardKt$HotelResultsHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C121992 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HotelResults $results;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121992(HotelResults hotelResults, BRg bRg, int i, int i2) {
            super(2);
            this.$results = hotelResults;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelResultsCardKt.HotelResultsHeader(this.$results, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final String hotelBedSummary(List<String> list, Integer num, BFM bfm, int i) {
        String strA0t;
        BBI bbiA07;
        C7384Etj.A0Y(list, 0);
        String strA01 = null;
        if (num == null) {
            bbiA07 = AnonymousClass002.A0M(bfm, -1087797824);
            strA0t = null;
        } else {
            bfm.AgE(-1087797823);
            strA0t = AnonymousClass001.A0t(bfm, Integer.valueOf(num.intValue()), R.string._name_removed__res_0x7f120354);
            bbiA07 = C3cG.A07(bfm);
        }
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(AbstractC0885AGm.A0z(strA0t), list);
        if (arrayListA0P.isEmpty()) {
            bfm.AgE(-1087674878);
        } else {
            bfm.AgE(1488934367);
            strA01 = AbstractC06907md.A01(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120358), arrayListA0P, null);
        }
        BBI.A0R(bbiA07, false);
        return strA01;
    }

    public static final String hotelImageSharedKey(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        return FGI.A0j("hotel/", z ? "list" : "card", CustomConnectorRegisterRepositoryKt.ROOT_PATH, str, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str2);
    }

    public static final HotelSelectionSheetKey selectionKey(HotelResult hotelResult, String str, String str2, boolean z) {
        AnonymousClass003.A0u(hotelResult, str);
        String str3 = hotelResult.resultRef;
        String str4 = hotelResult.hotelId;
        String str5 = hotelResult.offerId;
        String str6 = hotelResult.rateId;
        HotelImage hotelImage = hotelResult.image;
        return new HotelSelectionSheetKey(str, str3, str4, str5, str6, str2, hotelImage != null ? hotelImage.url : null, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[PHI: r17
  0x004a: PHI (r17v4 boolean) = (r17v3 boolean), (r17v6 boolean) binds: [B:19:0x0042, B:21:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HotelResultImage(com.facebook.aura.hotels.HotelImage r15, java.lang.String r16, X.BRg r17, boolean r18, X.BFM r19, int r20, int r21) {
        /*
            r9 = r17
            r0 = -1520987208(0xffffffffa55793b8, float:-1.8698326E-16)
            r14 = r19
            r14.AgG(r0)
            r1 = r20
            r0 = r20 & 6
            r2 = r15
            if (r0 != 0) goto La2
            int r3 = X.AnonymousClass004.A0d(r14, r15)
            r3 = r3 | r20
        L17:
            r0 = r20 & 48
            r7 = r16
            if (r0 != 0) goto L22
            int r0 = X.AnonymousClass004.A0e(r14, r7)
            r3 = r3 | r0
        L22:
            r19 = r21
            r5 = r21 & 4
            if (r5 == 0) goto L98
            r3 = r3 | 384(0x180, float:5.38E-43)
        L2a:
            r4 = r21 & 8
            r6 = r18
            if (r4 == 0) goto L8e
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L32:
            boolean r0 = X.AnonymousClass004.A1L(r3)
            boolean r0 = X.AnonymousClass001.A1b(r0, r14, r3)
            if (r0 == 0) goto L88
            if (r5 == 0) goto L40
            X.BS0 r9 = X.BRg.A00
        L40:
            r17 = 0
            if (r4 != 0) goto L4a
            r17 = r6
            r0 = 12
            if (r18 != 0) goto L4c
        L4a:
            r0 = 8
        L4c:
            float r0 = (float) r0
            X.1D3 r8 = X.C1D8.A00(r0)
            r0 = 350(0x15e, float:4.9E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            com.facebook.aura.hotels.HotelResultsCardKt$HotelResultImage$1 r4 = new com.facebook.aura.hotels.HotelResultsCardKt$HotelResultImage$1
            r4.<init>(r15)
            r0 = 102031982(0x614e26e, float:2.800206E-35)
            X.B1U r13 = X.B1V.A00(r14, r4, r0)
            int r0 = r3 >> 3
            r15 = r0 & 14
            r0 = 1769472(0x1b0000, float:2.479558E-39)
            r15 = r15 | r0
            r0 = r3 & 896(0x380, float:1.256E-42)
            r15 = r15 | r0
            r16 = 24
            r10 = 0
            r11 = r10
            com.facebook.aura.ui.sharedelement.HatchSharedElementKt.HatchSharedElement(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L74:
            X.BBb r0 = r14.AAc()
            if (r0 == 0) goto L87
            com.facebook.aura.hotels.HotelResultsCardKt$HotelResultImage$2 r13 = new com.facebook.aura.hotels.HotelResultsCardKt$HotelResultImage$2
            r15 = r7
            r16 = r9
            r18 = r1
            r14 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.A06 = r13
        L87:
            return
        L88:
            r14.Afo()
            r17 = r6
            goto L74
        L8e:
            r0 = r1 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L32
            int r0 = X.AnonymousClass004.A0q(r14, r6)
            r3 = r3 | r0
            goto L32
        L98:
            r0 = r1 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L2a
            int r0 = X.AnonymousClass004.A0f(r14, r9)
            r3 = r3 | r0
            goto L2a
        La2:
            r3 = r1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelResultsCardKt.HotelResultImage(com.facebook.aura.hotels.HotelImage, java.lang.String, X.BRg, boolean, X.BFM, int, int):void");
    }

    public static final void HotelResultRow(HotelResult hotelResult, String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(hotelResult, str, function0);
        bfm.AgG(-222324105);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hotelResult) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA05 = C0v5.A05(AnonymousClass001.A0R(bRg2), null, function0, zA1Z);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HotelResultsCardKt$HotelResultRow$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA05, objAaT, zA1Z);
            InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, 12.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0L, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            HotelImage hotelImage = hotelResult.image;
            BS0 bs0 = BRg.A00;
            HotelResultImage(hotelImage, str, C10G.A07(bs0, 80.0f), false, bfm, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384, 8);
            HotelResultText(hotelResult, false, AnonymousClass001.A0O(c90m, bs0, zA1Z), bfm, (iA0d & 14) | 48, 0);
            BBI.A0R(bbi, zA1Z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(hotelResult, str, function0, bRg2, i, i2);
        }
    }

    public static final void HotelResultText(HotelResult hotelResult, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        AuraTheme auraTheme;
        C1822Arm c1822Arm;
        C1822Arm c1822Arm2;
        BRg bRg2 = bRg;
        bfm.AgG(-1748989533);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hotelResult) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMicro, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String str = hotelResult.name;
            if (z) {
                bfm.AgE(-501945209);
                auraTheme = AuraTheme.INSTANCE;
                c1822Arm = auraTheme.getTypography(bfm, 6).footnoteMedium;
            } else {
                bfm.AgE(-501943510);
                auraTheme = AuraTheme.INSTANCE;
                c1822Arm = auraTheme.getTypography(bfm, 6).subheadlineMedium;
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), c1822Arm, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            HotelMoney hotelMoney = hotelResult.totalPrice;
            if (hotelMoney == null) {
                bfm.AgE(1619781451);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1619781452);
                AuraTextKt.m2639AuraTextUY9GdpU(HotelResultsTextKt.hotelTotalPrice(hotelMoney, bfm, 0), null, C3cH.A06(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, false);
            }
            String strRoomSummary = HotelBookingFormattingKt.roomSummary(hotelResult);
            if (strRoomSummary == null) {
                bfm.AgE(1619996467);
            } else {
                bfm.AgE(1619996468);
                if (z) {
                    c1822Arm2 = C3cH.A0X(bfm, auraTheme, 1838207681).caption1Regular;
                    BBI.A0R(bbi, false);
                } else {
                    c1822Arm2 = C3cH.A0X(bfm, auraTheme, 1838209473).footnoteRegular;
                    BBI.A0R(bbi, false);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strRoomSummary, null, C3cH.A07(bfm, auraTheme), c1822Arm2, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121972(hotelResult, z, bRg2, i, i2);
        }
    }

    public static final void HotelResultTile(HotelResult hotelResult, String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(hotelResult, str, function0);
        bfm.AgG(-1155472323);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hotelResult) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C0v5.A04(bRg2, C3cG.A0A(0), null, function0, zA1Z);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HotelResultsCardKt$HotelResultTile$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, zA1Z);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(8.0f), bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            HotelImage hotelImage = hotelResult.image;
            BS0 bs0 = BRg.A00;
            HotelResultImage(hotelImage, str, BJe.A00(C10G.A02, 0.8f, false), zA1Z, bfm, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 3456, 0);
            HotelResultText(hotelResult, zA1Z, C3U4.A07(bs0, 2.0f), bfm, (iA0d & 14) | 432, 0);
            BBI.A0R(bbi, zA1Z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121983(hotelResult, str, function0, bRg2, i, i2);
        }
    }

    /* renamed from: HotelResultsCard-T042LqI, reason: not valid java name */
    public static final void m1080HotelResultsCardT042LqI(HotelResults hotelResults, String str, long j, C1DM c1dm, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1B(hotelResults, 0, c1dm);
        bfm.AgG(1966760621);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hotelResults) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, c1dm);
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
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            List listA0a = AbstractC0878AGe.A0a(hotelResults.hotels, 4);
            ArrayList arrayListA0i = AnonymousClass003.A0i(listA0a);
            Iterator it = listA0a.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(new HotelReviewSource(hotelResults.searchRef, ((HotelResult) it.next()).resultRef));
            }
            BRg bRgPrefetchHotelDetailsOnImpression = HotelDetailsPrefetchModifierKt.prefetchHotelDetailsOnImpression(bRg2, AGI.A07(arrayListA0i), bfm, ((iA0d >> 12) & 14) | (HotelReviewSource.$stable << 3));
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA09 = C3U4.A09(C1b8.A01(C11U.A03(bRgPrefetchHotelDetailsOnImpression.then(c1062ATq), c1dm), j), 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(16.0f), bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA02);
            int i4 = iA0d & 14;
            HotelResultsHeader(hotelResults, null, bfm, i4, 2);
            bfm.AgE(1199076798);
            for (HotelResult hotelResult : AbstractC0878AGe.A0a(hotelResults.hotels, 4)) {
                bfm.Ag8(1147698181, hotelResult.resultRef);
                String strHotelImageSharedKey = hotelImageSharedKey(hotelResults.searchRef, hotelResult.resultRef, false);
                boolean zA1C = AnonymousClass003.A1C(iA0d) | AnonymousClass003.A1N(bfm, auraNavigatorA0b, hotelResult) | AnonymousClass002.A1Q(i4, 4);
                Object objAaT = bfm.AaT();
                if (zA1C || objAaT == C78N.A00) {
                    objAaT = new HotelResultsCardKt$HotelResultsCard$2$1$1$1(auraNavigatorA0b, hotelResult, hotelResults, str);
                    bfm.Ai0(objAaT);
                }
                HotelResultRow(hotelResult, strHotelImageSharedKey, (Function0) objAaT, null, bfm, 0, 8);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, false);
            if (hotelResults.canSeeAll) {
                bfm.AgE(-1482868666);
                String strA01 = hotelResults.seeAllLabel;
                if (strA01 == null) {
                    bfm.AgE(1199092782);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12034c);
                } else {
                    bfm.AgE(1199092069);
                }
                BBI.A0R(bbi, false);
                AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, AnonymousClass002.A1Q(i4, 4), bfm.A67(abstractC3358CGzA0h)) | AnonymousClass003.A1C(iA0d);
                Object objAaT2 = bfm.AaT();
                if (zA1V || objAaT2 == C78N.A00) {
                    objAaT2 = new HotelResultsCardKt$HotelResultsCard$2$2$1(abstractC3358CGzA0h, hotelResults, auraNavigatorA0b, str);
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
            } else {
                bfm.AgE(-1482427381);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HotelResultsCardKt$HotelResultsCard$3(hotelResults, str, j, c1dm, bRg2, i, i2);
        }
    }

    public static final void HotelResultsHeader(HotelResults hotelResults, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(hotelResults, 0);
        bfm.AgG(-1798451621);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hotelResults) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingMicro);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String str = hotelResults.providerName;
            if (str == null) {
                bfm.AgE(-137029204);
            } else {
                bfm.AgE(-137029203);
                HotelSelectionContentKt.HotelProviderRow(str, hotelResults.providerIconUrl, null, hotelResults.providerSubtitle, bfm, 0, 4);
            }
            BBI.A0R(bbi, false);
            C9m9 c9m9A002 = AcQ.A00(2.0f);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(c9m9A002, bfm, c3th, 6);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(HotelResultsTextKt.hotelResultsTitle(hotelResults, bfm, iA0d & 14), null, 0L, AuraTheme.INSTANCE.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
            HotelTrip hotelTrip = hotelResults.trip;
            if (hotelTrip == null) {
                bfm.AgE(808159649);
            } else {
                bfm.AgE(808159650);
                HotelBookingTextKt.SecondaryLine(HotelResultsTextKt.hotelResultsTripSummary(hotelTrip, bfm, 0), null, bfm, 0, 2);
            }
            BBI.A0R(bbi, false);
            AnonymousClass002.A0y(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121992(hotelResults, bRg2, i, i2);
        }
    }
}
