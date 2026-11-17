package com.facebook.aura.vds.compose.card;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C7177Ehm;
import X.C7195Ei7;
import X.C7196Ei8;
import X.C7197Ei9;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC8647Fhz;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.typegroup.AuraIllustrationSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraCardDefaultsKt {

    /* renamed from: com.facebook.aura.vds.compose.card.AuraCardDefaultsKt$LeadingContainer$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $isIcon;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(BRg bRg, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$isIcon = z;
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
            AuraCardDefaultsKt.LeadingContainer(this.$modifier, this.$isIcon, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void LeadingContainer(BRg bRg, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z2 = z;
        bfm.AgG(930558231);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 131, 130), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            AnonymousClass005.A0q(bbi, bfm, g0v, iA0d >> 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, z2, g0v, i, i2);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraIconSize.values().length];
            try {
                AnonymousClass002.A13(AuraIconSize.SMALL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraIconSize.MEDIUM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraIconSize.ILLUSTRATION_SMALL, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraIconSize.ILLUSTRATION, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float innerPaddingForIcon() {
        return AuraDimensKt.SpacingMicro;
    }

    /* renamed from: createDefaultOptions-oJZG2nU, reason: not valid java name */
    public static final C7197Ei9 m2483createDefaultOptionsoJZG2nU(B6A b6a, BFM bfm, int i) {
        float fAh4 = AnonymousClass002.A0Y(bfm).Ah4(4.0f);
        C7196Ei8 c7196Ei8 = new C7196Ei8(C7197Ei9.A0P);
        c7196Ei8.A0I = true;
        c7196Ei8.A00(InterfaceC8647Fhz.A01);
        ((C7195Ei7) c7196Ei8).A04 = new C7177Ehm(fAh4);
        if (b6a != null) {
            AuraImageKt.m2576auraTintColor4WTKRHQ(c7196Ei8, b6a.A00);
        }
        return new C7197Ei9(c7196Ei8);
    }

    public static final AuraIllustrationSize toIllustrationSize(AuraIconSize auraIconSize) {
        int iOrdinal = auraIconSize.ordinal();
        return iOrdinal != 4 ? iOrdinal != 6 ? iOrdinal != 9 ? AuraIllustrationSize.SIZE_56 : AuraIllustrationSize.SIZE_44 : AuraIllustrationSize.SIZE_32 : AuraIllustrationSize.SIZE_24;
    }
}
