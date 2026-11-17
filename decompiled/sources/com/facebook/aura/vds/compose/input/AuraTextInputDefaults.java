package com.facebook.aura.vds.compose.input;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C06G;
import X.C10G;
import X.C1822Arm;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraTextInputDefaults {
    public static final int $stable = 0;
    public static final AuraTextInputDefaults INSTANCE = new AuraTextInputDefaults();

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputDefaults$LabelText$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i) {
            super(2);
            this.$text = str;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraTextInputDefaults.this.LabelText(this.$text, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputDefaults$LeadingSearchIcon$1, reason: invalid class name and case insensitive filesystem */
    public final class C142901 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142901(BRg bRg, int i, int i2) {
            super(2);
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
            AuraTextInputDefaults.this.LeadingSearchIcon(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputDefaults$TrailingIconButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C142911 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $onClickLabel;
        public final /* synthetic */ AVy $painter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142911(AVy aVy, Function0<Unit> function0, boolean z, String str, int i, int i2) {
            super(2);
            this.$painter = aVy;
            this.$onClick = function0;
            this.$enabled = z;
            this.$onClickLabel = str;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraTextInputDefaults.this.TrailingIconButton(this.$painter, this.$onClick, this.$enabled, this.$onClickLabel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public final void LabelText(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-2029082143);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            AuraTextKt.m2639AuraTextUY9GdpU(str, C10G.A04(BRg.A00, 20.0f), AnonymousClass002.A0c(bfm).textInput.placeholderColor, (C1822Arm) bfm.A6v(AuraTypographyKt.LocalAuraTextStyle), null, null, null, false, 1, 0, 0, null, null, null, bfm, (iA0d & 14) | 100663344, 0, 16112);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, i);
        }
    }

    public final void LeadingSearchIcon(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(851202881);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraIconKt.m2567AuraIconFHprtrg(bRg2, BOf.A00(bfm, R.drawable.circle_handle, 0), AuraIconSize.X_SMALL, null, C06G.A06(bfm), null, bfm, (iA0d & 14) | 384 | (AVy.$stable << 3), 40);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142901(bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* renamed from: PlaceholderText-qd-pcsU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2587PlaceholderTextqdpcsU(java.lang.String r29, int r30, X.C1822Arm r31, X.BFM r32, int r33, int r34) {
        /*
            r28 = this;
            r3 = r30
            r13 = r31
            r4 = 0
            r9 = r29
            X.C7384Etj.A0Y(r9, r4)
            r0 = -1556999076(0xffffffffa332145c, float:-9.653711E-18)
            r5 = r32
            r5.AgG(r0)
            r2 = r33
            r0 = r33 & 6
            if (r0 != 0) goto Ld4
            int r7 = X.AnonymousClass004.A0d(r5, r9)
            r7 = r7 | r33
        L1e:
            r0 = r33 & 48
            r1 = r34
            if (r0 != 0) goto L33
            r0 = r34 & 2
            if (r0 != 0) goto L30
            boolean r6 = r5.A63(r3)
            r0 = 32
            if (r6 != 0) goto L32
        L30:
            r0 = 16
        L32:
            r7 = r7 | r0
        L33:
            r0 = r2 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L46
            r0 = r34 & 4
            if (r0 != 0) goto L43
            boolean r6 = r5.A65(r13)
            r0 = 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L45
        L43:
            r0 = 128(0x80, float:1.794E-43)
        L45:
            r7 = r7 | r0
        L46:
            boolean r0 = X.AnonymousClass004.A1J(r7)
            boolean r0 = X.AnonymousClass001.A1b(r0, r5, r7)
            if (r0 == 0) goto Ld0
            r5.Afy()
            r0 = r33 & 1
            r8 = 6
            if (r0 == 0) goto Lbc
            boolean r0 = r5.AEk()
            if (r0 != 0) goto Lbc
            int r7 = X.AnonymousClass003.A0C(r1, r5, r7)
            r0 = r34 & 4
            if (r0 == 0) goto L68
        L66:
            r7 = r7 & (-897(0xfffffffffffffc7f, float:NaN))
        L68:
            r5.AAb()
            X.BS0 r6 = X.BRg.A00
            X.1AC r0 = X.C2VU.A04
            X.BRg r10 = X.C10G.A01(r0, r6, r4)
            com.facebook.aura.vds.compose.theme.AuraTheme r0 = com.facebook.aura.vds.compose.theme.AuraTheme.INSTANCE
            long r11 = r0.getContentColor(r5, r8)
            X.1YL r6 = new X.1YL
            r6.<init>(r3)
            r8 = r7 & 14
            r0 = 100663344(0x6000030, float:2.4074262E-35)
            r8 = r8 | r0
            int r0 = r7 << 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            int r25 = X.AnonymousClass006.A04(r8, r0, r7)
            r27 = 16048(0x3eb0, float:2.2488E-41)
            r14 = 0
            r18 = 1
            r15 = r14
            r19 = r4
            r20 = r4
            r21 = r14
            r22 = r14
            r23 = r14
            r24 = r5
            r26 = r4
            r17 = r4
            r16 = r6
            com.facebook.aura.vds.compose.text.AuraTextKt.m2639AuraTextUY9GdpU(r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        La7:
            X.BBb r0 = r5.AAc()
            if (r0 == 0) goto Lbb
            com.facebook.aura.vds.compose.input.AuraTextInputDefaults$PlaceholderText$1 r4 = new com.facebook.aura.vds.compose.input.AuraTextInputDefaults$PlaceholderText$1
            r5 = r28
            r6 = r9
            r7 = r3
            r8 = r13
            r9 = r2
            r10 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.A06 = r4
        Lbb:
            return
        Lbc:
            r0 = r34 & 2
            if (r0 == 0) goto Lc3
            r3 = 1
            r7 = r7 & (-113(0xffffffffffffff8f, float:NaN))
        Lc3:
            r0 = r34 & 4
            if (r0 == 0) goto L68
            X.AKH<X.Arm> r0 = com.facebook.aura.vds.compose.theme.AuraTypographyKt.LocalAuraTextStyle
            java.lang.Object r13 = r5.A6v(r0)
            X.Arm r13 = (X.C1822Arm) r13
            goto L66
        Ld0:
            r5.Afo()
            goto La7
        Ld4:
            r7 = r2
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.input.AuraTextInputDefaults.m2587PlaceholderTextqdpcsU(java.lang.String, int, X.Arm, X.BFM, int, int):void");
    }

    public final void TrailingIconButton(AVy aVy, Function0<Unit> function0, boolean z, String str, BFM bfm, int i, int i2) {
        boolean z2 = z;
        String str2 = str;
        boolean zA1b = AnonymousClass004.A1b(aVy, function0);
        bfm.AgG(1139864554);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(aVy, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                z2 = true;
            }
            if (i4 != 0) {
                str2 = null;
            }
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, aVy, AuraIconButtonSizeV2.SMALL, AuraIconButtonStyle.PRIMARY, AuraIconButtonBackground.NO_BACKGROUND, null, str2 == null ? "" : str2, function0, str2, z2, null, null, null, null, bfm, AnonymousClass001.A06(iA05 << 21, AnonymousClass001.A09(iA05 << 15, AnonymousClass001.A0C(iA05 << 18, (AVy.$stable << 3) | 28032 | ((iA05 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)))), zA1b ? 1 : 0, 15393);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142911(aVy, function0, z2, str2, i, i2);
        }
    }
}
