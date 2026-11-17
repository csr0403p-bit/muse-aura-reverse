package com.facebook.aura.vds.compose.theme.root;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BPD;
import X.C3O5;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraThemeProviderKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class AuraRootKt {

    /* renamed from: com.facebook.aura.vds.compose.theme.root.AuraRootKt$AuraRoot$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraColors $colorsOverride;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ AuraThemeMode $modeOverride;

        /* renamed from: com.facebook.aura.vds.compose.theme.root.AuraRootKt$AuraRoot$1$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AuraThemeMode.values().length];
                try {
                    AnonymousClass002.A13(AuraThemeMode.DEFAULT, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(AuraThemeMode.LIGHT, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(AuraThemeMode.DARK, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AuraThemeMode auraThemeMode, AuraColors auraColors, G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(2);
            this.$modeOverride = auraThemeMode;
            this.$colorsOverride = auraColors;
            this.$content = g0v;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            boolean z = true;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                int iOrdinal = this.$modeOverride.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            AnonymousClass003.A0l(bfm, 1939020840);
                            z = false;
                        } else {
                            throw AnonymousClass005.A0k(bfm, 1725112365);
                        }
                    } else {
                        AnonymousClass003.A0l(bfm, 1938984099);
                    }
                } else {
                    bfm.AgE(1725114046);
                    z = !C3O5.A00(bfm);
                    AnonymousClass001.A1D(bfm);
                }
                AuraThemeProviderKt.AuraThemeProvider(z, 0.0f, this.$colorsOverride, this.$content, bfm, AuraColors.$stable << 6, 2);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.theme.root.AuraRootKt$AuraRoot$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraColors $colorsOverride;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ AuraThemeMode $modeOverride;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AuraThemeMode auraThemeMode, AuraColors auraColors, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$modeOverride = auraThemeMode;
            this.$colorsOverride = auraColors;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraRootKt.AuraRoot(this.$modeOverride, this.$colorsOverride, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AuraRoot(AuraThemeMode auraThemeMode, AuraColors auraColors, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        AuraThemeMode auraThemeMode2 = auraThemeMode;
        AuraColors auraColors2 = auraColors;
        C7384Etj.A0Y(g0v, 2);
        bfm.AgG(74440615);
        int i3 = i2 & 1;
        int iA0D = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0D(bfm, AnonymousClass003.A0K(auraThemeMode2)) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i & 48) == 0) {
            iA0D |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraColors2, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0D |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0D), bfm, iA0D)) {
            if (i3 != 0) {
                auraThemeMode2 = AuraThemeMode.DEFAULT;
            }
            if (i4 != 0) {
                auraColors2 = null;
            }
            BPD.A00(B1V.A00(bfm, new AnonymousClass1(auraThemeMode2, auraColors2, g0v), 502353224), bfm, 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(auraThemeMode2, auraColors2, g0v, i, i2);
        }
    }
}
