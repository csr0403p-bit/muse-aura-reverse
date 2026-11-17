package com.facebook.aura.vds.toast;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.card.AuraCardDefaults;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraToastDefaults {
    public static final int $stable = 0;
    public static final AuraToastDefaults INSTANCE = new AuraToastDefaults();

    /* renamed from: com.facebook.aura.vds.toast.AuraToastDefaults$LeadingIllustration$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraIconSize $illustrationSize;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraDrawableSource $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, AuraDrawableSource auraDrawableSource, AuraIconSize auraIconSize, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$source = auraDrawableSource;
            this.$illustrationSize = auraIconSize;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraToastDefaults.this.LeadingIllustration(this.$modifier, this.$source, this.$illustrationSize, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.toast.AuraToastDefaults$LeadingImage$1, reason: invalid class name and case insensitive filesystem */
    public final class C143081 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ AuraDrawableSource $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143081(AuraDrawableSource auraDrawableSource, String str, int i, int i2) {
            super(2);
            this.$source = auraDrawableSource;
            this.$contentDescription = str;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraToastDefaults.this.LeadingImage(this.$source, this.$contentDescription, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* renamed from: LeadingIcon-FNF3uiM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3119LeadingIconFNF3uiM(X.BRg r15, X.AVy r16, long r17, X.BFM r19, int r20, int r21) {
        /*
            r14 = this;
            r5 = r15
            r11 = r17
            r0 = 1
            r6 = r16
            X.C7384Etj.A0Y(r6, r0)
            r0 = 1727423068(0x66f6625c, float:5.817583E23)
            r8 = r19
            r8.AgG(r0)
            r1 = r21
            r4 = r21 & 1
            r13 = r20
            if (r4 == 0) goto L9b
            r3 = r20 | 6
        L1b:
            r0 = r20 & 48
            if (r0 != 0) goto L28
            boolean r0 = X.AnonymousClass004.A1Y(r6, r8, r13)
            int r0 = X.AnonymousClass002.A06(r0)
            r3 = r3 | r0
        L28:
            r0 = r13 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L3b
            r0 = r21 & 4
            if (r0 != 0) goto L38
            boolean r2 = r8.A64(r11)
            r0 = 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L3a
        L38:
            r0 = 128(0x80, float:1.794E-43)
        L3a:
            r3 = r3 | r0
        L3b:
            boolean r0 = X.AnonymousClass004.A1J(r3)
            boolean r0 = X.AnonymousClass001.A1b(r0, r8, r3)
            if (r0 == 0) goto L97
            r8.Afy()
            r0 = r20 & 1
            if (r0 == 0) goto L85
            boolean r0 = r8.AEk()
            if (r0 != 0) goto L85
            int r3 = X.AnonymousClass003.A0B(r1, r8, r3)
        L56:
            r8.AAb()
            com.facebook.aura.vds.compose.card.AuraCardDefaults r4 = com.facebook.aura.vds.compose.card.AuraCardDefaults.INSTANCE
            X.B6A r7 = new X.B6A
            r7.<init>(r11)
            r0 = r3 & 14
            r2 = r0 | 3072(0xc00, float:4.305E-42)
            int r0 = X.AVy.$stable
            int r0 = r0 << 3
            r2 = r2 | r0
            r0 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r0
            r9 = r3 & 896(0x380, float:1.256E-42)
            r9 = r9 | r2
            r10 = 0
            r4.m2478LeadingIcongKt5lHk(r5, r6, r7, r8, r9, r10)
        L73:
            X.BBb r0 = r8.AAc()
            if (r0 == 0) goto L84
            com.facebook.aura.vds.toast.AuraToastDefaults$LeadingIcon$1 r7 = new com.facebook.aura.vds.toast.AuraToastDefaults$LeadingIcon$1
            r8 = r14
            r9 = r5
            r10 = r6
            r14 = r1
            r7.<init>(r8, r9, r10, r11, r13, r14)
            r0.A06 = r7
        L84:
            return
        L85:
            if (r4 == 0) goto L89
            X.BS0 r5 = X.BRg.A00
        L89:
            r0 = r21 & 4
            if (r0 == 0) goto L56
            com.facebook.aura.vds.compose.card.AuraCardDefaults r2 = com.facebook.aura.vds.compose.card.AuraCardDefaults.INSTANCE
            r0 = 6
            long r11 = r2.m2481tintWaAFU9c(r8, r0)
            r3 = r3 & (-897(0xfffffffffffffc7f, float:NaN))
            goto L56
        L97:
            r8.Afo()
            goto L73
        L9b:
            r0 = r20 & 6
            if (r0 != 0) goto La7
            int r3 = X.AnonymousClass004.A0d(r8, r15)
            r3 = r3 | r20
            goto L1b
        La7:
            r3 = r13
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.toast.AuraToastDefaults.m3119LeadingIconFNF3uiM(X.BRg, X.AVy, long, X.BFM, int, int):void");
    }

    public final void LeadingIllustration(BRg bRg, AuraDrawableSource auraDrawableSource, AuraIconSize auraIconSize, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AuraIconSize auraIconSize2 = auraIconSize;
        C7384Etj.A0Y(auraDrawableSource, 1);
        bfm.AgG(1015056232);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraDrawableSource, bfm, i) ? 1 : 0);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, AnonymousClass003.A0K(auraIconSize2));
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                auraIconSize2 = AuraIconSize.MEDIUM;
            }
            AuraCardDefaults.INSTANCE.LeadingIllustration(bRg2, auraDrawableSource, auraIconSize2, bfm, (iA0d & 896) | (iA0d & 14) | 3072 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg2, auraDrawableSource, auraIconSize2, i, i2);
        }
    }

    public final void LeadingImage(AuraDrawableSource auraDrawableSource, String str, BFM bfm, int i, int i2) {
        String str2 = str;
        bfm.AgG(1020767012);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraDrawableSource, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                str2 = null;
            }
            AuraCardDefaults.INSTANCE.m2480LeadingImagexqIIw2o(auraDrawableSource, str2, null, null, bfm, (iA05 & 14) | RuntimeInternals.IOPRIO_BACKGROUND | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 12);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143081(auraDrawableSource, str2, i, i2);
        }
    }
}
