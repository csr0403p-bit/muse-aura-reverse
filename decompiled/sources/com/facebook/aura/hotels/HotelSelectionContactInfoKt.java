package com.facebook.aura.hotels;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C0v5;
import X.C1515AkP;
import X.C1822Arm;
import X.C1YD;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C7Je;
import X.C7mU;
import X.C90m;
import X.C9m9;
import X.EnumC1820Arj;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.BidiFormatter;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HotelSelectionContactInfoKt {

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContactInfoKt$HotelContactConfirmation$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ String $confirmText;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$confirmText = str;
            this.$onConfirm = function0;
            this.$cancelText = str2;
            this.$onDismiss = function02;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onConfirm, bfm.A65(this.$confirmText))));
            String str = this.$confirmText;
            Function0<Unit> function0 = this.$onConfirm;
            String str2 = this.$cancelText;
            Function0<Unit> function02 = this.$onDismiss;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HotelSelectionContactInfoKt$HotelContactConfirmation$1$1$1(str, function0, str2, function02);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A14(bfm, objAaT);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContactInfoKt$HotelContactConfirmation$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $body;
        public final /* synthetic */ String $confirmText;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, String str3, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$body = str2;
            this.$confirmText = str3;
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContactInfoKt.HotelContactConfirmation(this.$title, this.$body, this.$confirmText, this.$onConfirm, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContactInfoKt$HotelContactRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ int $icon;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, int i, boolean z, BRg bRg, boolean z2, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.$text = str;
            this.$icon = i;
            this.$enabled = z;
            this.$modifier = bRg;
            this.$singleLine = z2;
            this.$onClick = function0;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContactInfoKt.HotelContactRow(this.$text, this.$icon, this.$enabled, this.$modifier, this.$singleLine, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContactInfoKt$HotelSelectionContactInfo$1, reason: invalid class name and case insensitive filesystem */
    public final class C122031 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $linksEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HotelSelection $selection;
        public final /* synthetic */ String $sourceSessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122031(HotelSelection hotelSelection, boolean z, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$linksEnabled = z;
            this.$sourceSessionId = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContactInfoKt.HotelSelectionContactInfo(this.$selection, this.$linksEnabled, this.$sourceSessionId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContactInfoKt$HotelSelectionContactInfo$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $linksEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HotelSelection $selection;
        public final /* synthetic */ String $sourceSessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HotelSelection hotelSelection, boolean z, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$selection = hotelSelection;
            this.$linksEnabled = z;
            this.$sourceSessionId = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelSelectionContactInfoKt.HotelSelectionContactInfo(this.$selection, this.$linksEnabled, this.$sourceSessionId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.net.Uri hotelDialUri(java.lang.String r8) {
        /*
            r7 = 0
            if (r8 == 0) goto L74
            int r4 = r8.length()
            r3 = 0
            r2 = 0
        L9:
            if (r2 >= r4) goto L24
            char r1 = r8.charAt(r2)
            boolean r0 = java.lang.Character.isLetter(r1)
            if (r0 != 0) goto L20
            java.lang.String r0 = "#,;"
            boolean r0 = X.C7BY.A0k(r0, r1)
            if (r0 != 0) goto L20
            int r2 = r2 + 1
            goto L9
        L20:
            java.lang.String r8 = r8.substring(r3, r2)
        L24:
            java.lang.StringBuilder r6 = X.C60O.A0w()
            int r2 = r8.length()
            r1 = 0
        L2d:
            r5 = 43
            r4 = 58
            r3 = 48
            if (r1 >= r2) goto L46
            char r0 = r8.charAt(r1)
            if (r3 > r0) goto L43
            if (r0 >= r4) goto L40
        L3d:
            r6.append(r0)
        L40:
            int r1 = r1 + 1
            goto L2d
        L43:
            if (r0 != r5) goto L40
            goto L3d
        L46:
            java.lang.String r2 = r6.toString()
            r1 = 0
        L4b:
            int r0 = r2.length()
            if (r1 >= r0) goto L74
            char r0 = r2.charAt(r1)
            if (r3 > r0) goto L6c
            if (r0 >= r4) goto L6c
            r0 = 1
            java.lang.String r0 = X.BQG.A16(r2, r0)
            boolean r0 = X.C7BY.A0k(r0, r5)
            if (r0 != 0) goto L74
            java.lang.String r0 = "tel:"
            java.lang.String r1 = X.FGI.A0M(r0, r2)
            r0 = 0
            goto L6f
        L6c:
            int r1 = r1 + 1
            goto L4b
        L6f:
            android.net.Uri r0 = X.C7Je.A01(r1)     // Catch: java.lang.Throwable -> L73
        L73:
            return r0
        L74:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelSelectionContactInfoKt.hotelDialUri(java.lang.String):android.net.Uri");
    }

    public static final void HotelContactConfirmation(String str, String str2, String str3, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-355760202);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function02);
        }
        int i3 = i2 & 32;
        if (i3 != 0) {
            iA0d |= 196608;
        } else if ((i & 196608) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraAlertDialogKt.AuraAlertDialog(bRg2, str, str2, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new AnonymousClass1(str3, function0, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120329), function02), -738610747), function02, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, AnonymousClass002.A07(iA0d << 3, ((iA0d >> 15) & 14) | 196608) | ((iA0d << 6) & 3670016), 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, str3, function0, function02, bRg2, i, i2);
        }
    }

    public static final void HotelContactRow(String str, int i, boolean z, BRg bRg, boolean z2, Function0<Unit> function0, BFM bfm, int i2, int i3) {
        BBI bbiA0M;
        BRg bRgA04;
        BRg bRg2;
        BRg bRg3 = bRg;
        boolean zA1K = z2;
        Function0<Unit> function02 = function0;
        bfm.AgG(1135754728);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg3);
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, zA1K);
        }
        int i6 = i3 & 32;
        int iA0Y = 196608;
        if (i6 != 0) {
            iA0d |= iA0Y;
        } else if ((196608 & i2) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, function02);
            iA0d |= iA0Y;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i4 != 0) {
                bRg3 = BRg.A00;
            }
            zA1K = C3cG.A1K(i5, zA1K);
            Function0<Unit> function03 = i6 == 0 ? function02 : null;
            BRg bRgA0U = AnonymousClass001.A0U(AnonymousClass001.A0R(bRg3), 44.0f);
            if (function03 != null) {
                BS0 bs0A09 = C3cG.A09(bfm, 538613236);
                bRg2 = bs0A09;
                C1YD c1ydA0A = C3cG.A0A(0);
                boolean zA1H = AnonymousClass007.A1H(iA0d);
                Object objAaT = bfm.AaT();
                if (zA1H || objAaT == C78N.A00) {
                    objAaT = new HotelSelectionContactInfoKt$HotelContactRow$1$1(function03);
                    bfm.Ai0(objAaT);
                }
                bRgA04 = C0v5.A04(bs0A09, c1ydA0A, null, (Function0) objAaT, z);
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 538617360);
                bRgA04 = BRg.A00;
                bRg2 = bRgA04;
            }
            BRg bRgThen = bRgA0U.then(bRgA04);
            float f = AuraDimensKt.SpacingMicroPlusNano;
            BRg bRgA0B = C3U4.A0B(bRgThen, f, f);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingXsmall);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            AVy aVyA00 = BOf.A00(bfm, i, (iA0d >> 3) & 14);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, auraIconSize, null, C3cH.A07(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 33);
            AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(bRg2, 1.0f, true), C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, zA1K ? 1 : Integer.MAX_VALUE, 2, null, null, null, bfm, iA0d & 14, 6, 14832);
            BBI.A0R(bbiA0M, true);
            function02 = function03;
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, i, z, bRg3, zA1K, function02, i2, i3);
        }
    }

    public static final void HotelSelectionContactInfo(HotelSelection hotelSelection, boolean z, String str, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass4;
        Function0 function0;
        String strA0s;
        int i3;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(hotelSelection, 0);
        bfm.AgG(1231401231);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hotelSelection) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            String str2 = hotelSelection.propertyPageUrl;
            if (str2 == null) {
                str2 = hotelSelection.websiteUrl;
            }
            if (hotelSelection.address == null && hotelSelection.phoneNumber == null && str2 == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass4 = new C122031(hotelSelection, z, str, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass4);
                }
                return;
            }
            Context contextA0O = AnonymousClass003.A0O(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AbstractC3358CGz abstractC3358CGz = (AbstractC3358CGz) bfm.A6v(LocalUserSessionKt.LocalUserSession);
            boolean zA65 = bfm.A65(hotelSelection.phoneNumber);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = hotelDialUri(hotelSelection.phoneNumber);
                bfm.Ai0(objAaT);
            }
            Uri uri = (Uri) objAaT;
            String str3 = hotelSelection.selectionRef;
            int i5 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1R = AnonymousClass001.A1R(bfm, str3, AnonymousClass002.A1Q(i5, 32));
            Object objAaT2 = bfm.AaT();
            if (zA1R || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT2;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingXsmall);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12032a);
            C1822Arm c1822Arm = AuraTheme.INSTANCE.getTypography(bfm, 6).title3Medium;
            BS0 bs0 = BRg.A00;
            Object objAaT3 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT3 == obj) {
                objAaT3 = HotelSelectionContactInfoKt$HotelSelectionContactInfo$2$1$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            String str4 = null;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT3, false), 0L, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16372);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(AcQ.A06, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str5 = hotelSelection.address;
            if (str5 == null) {
                bfm.AgE(-543221598);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-543221597);
                boolean zA652 = bfm.A65(mutableState);
                Object objAaT4 = bfm.AaT();
                if (zA652 || objAaT4 == obj) {
                    objAaT4 = new HotelSelectionContactInfoKt$HotelSelectionContactInfo$2$2$1$1$1(mutableState);
                    bfm.Ai0(objAaT4);
                }
                HotelContactRow(str5, R.drawable.map_outline_24_wght400, z, null, true, (Function0) objAaT4, bfm, ((iA0d << 3) & 896) | RuntimeInternals.IOPRIO_BACKGROUND, 8);
                BBI.A0R(bbi, false);
            }
            String str6 = hotelSelection.phoneNumber;
            if (str6 == null) {
                bfm.AgE(-542937452);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-542937451);
                String strUnicodeWrap = BidiFormatter.getInstance(bfm.A6v(Am0.A0A) == EnumC1820Arj.A03).unicodeWrap(str6);
                C7384Etj.A0U(strUnicodeWrap);
                if (uri != null) {
                    boolean zA1Y = AnonymousClass001.A1Y(mutableState, bfm, -627745901);
                    Object objAaT5 = bfm.AaT();
                    if (zA1Y || objAaT5 == obj) {
                        objAaT5 = new HotelSelectionContactInfoKt$HotelSelectionContactInfo$2$2$2$1$1(mutableState);
                        bfm.Ai0(objAaT5);
                    }
                    function0 = (Function0) objAaT5;
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(-627703277);
                    BBI.A0R(bbi, false);
                    function0 = null;
                }
                HotelContactRow(strUnicodeWrap, R.drawable.phone_handset_wght400_outline_24, z, null, false, function0, bfm, (iA0d << 3) & 896, 24);
                BBI.A0R(bbi, false);
            }
            if (str2 == null) {
                bfm.AgE(-542525617);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-542525616);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12035f);
                boolean zA1Y2 = AnonymousClass005.A1Y(bfm, contextA0O, auraNavigatorA0b, bfm.A67(abstractC3358CGz), bfm.A65(str2)) | AnonymousClass004.A1K(iA0d);
                Object objAaT6 = bfm.AaT();
                if (zA1Y2 || objAaT6 == obj) {
                    objAaT6 = new HotelSelectionContactInfoKt$HotelSelectionContactInfo$2$2$3$1$1(abstractC3358CGz, str2, contextA0O, auraNavigatorA0b, str);
                    bfm.Ai0(objAaT6);
                }
                HotelContactRow(strA012, R.drawable.globe_wght400_outline_24, z, null, false, (Function0) objAaT6, bfm, (iA0d << 3) & 896, 24);
                BBI.A0R(bbi, false);
            }
            AnonymousClass002.A0y(bbi);
            HotelContactAction hotelContactAction = (HotelContactAction) mutableState.getValue();
            if (hotelContactAction == null) {
                bfm.AgE(1360603856);
            } else {
                bfm.AgE(1360603857);
                HotelContactAction hotelContactAction2 = HotelContactAction.MAPS;
                if (hotelContactAction == hotelContactAction2) {
                    bfm.AgE(-1625954957);
                    strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f12033d);
                } else {
                    bfm.AgE(-1625951963);
                    BBI.A0R(bbi, false);
                    strA0s = hotelSelection.phoneNumber;
                    if (strA0s == null) {
                        strA0s = "";
                    }
                }
                if (hotelContactAction == hotelContactAction2) {
                    str4 = hotelSelection.address;
                    i3 = R.string._name_removed__res_0x7f12033c;
                } else {
                    i3 = R.string._name_removed__res_0x7f120325;
                }
                String strA013 = AbstractC2271BQs.A01(bfm, i3);
                boolean zA1V = AnonymousClass002.A1V(bfm, uri, AnonymousClass002.A1V(bfm, contextA0O, bfm.A65(mutableState) | AnonymousClass002.A1Q(i5, 32), AnonymousClass002.A1U(bfm, hotelContactAction)), AnonymousClass004.A1F(iA0d));
                Object objAaT7 = bfm.AaT();
                if (zA1V || objAaT7 == obj) {
                    objAaT7 = new HotelSelectionContactInfoKt$HotelSelectionContactInfo$3$1$1(z, hotelContactAction, contextA0O, hotelSelection, uri, mutableState);
                    bfm.Ai0(objAaT7);
                }
                Function0 function03 = (Function0) objAaT7;
                boolean zA653 = bfm.A65(mutableState);
                Object objAaT8 = bfm.AaT();
                if (zA653 || objAaT8 == obj) {
                    objAaT8 = new HotelSelectionContactInfoKt$HotelSelectionContactInfo$3$2$1(mutableState);
                    bfm.Ai0(objAaT8);
                }
                HotelContactConfirmation(strA0s, str4, strA013, function03, (Function0) objAaT8, null, bfm, 0, 32);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(hotelSelection, z, str, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
    }

    public static final void openHotelMaps(Context context, HotelSelection hotelSelection) {
        String strA0U = hotelSelection.address;
        if (strA0U != null) {
            if (!C7BY.A0q(strA0U, hotelSelection.hotelName, true)) {
                strA0U = FGI.A0U(hotelSelection.hotelName, ", ", strA0U);
            }
            Uri uriA01 = null;
            try {
                uriA01 = C7Je.A01(FGI.A0M("geo:0,0?q=", Uri.encode(strA0U)));
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
            if (uriA01 == null || !launchHotelContact(context, new Intent("android.intent.action.VIEW", uriA01))) {
                Uri uriA012 = null;
                try {
                    uriA012 = C7Je.A01(FGI.A0M("https://www.google.com/maps/search/?api=1&query=", Uri.encode(strA0U)));
                } catch (SecurityException | UnsupportedOperationException unused2) {
                }
                if (uriA012 != null) {
                    launchHotelContact(context, new Intent("android.intent.action.VIEW", uriA012));
                }
            }
        }
    }

    public static final boolean launchHotelContact(Context context, Intent intent) {
        try {
            return C7mU.A00().A04().A05(context, intent);
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
