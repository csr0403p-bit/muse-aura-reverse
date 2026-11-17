package com.facebook.aura.file.view;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B18;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C06G;
import X.C10G;
import X.C7BY;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchSocialSourceApp;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class SocialSourceIconKt {
    public static final float SocialSourceIconSize = 20.0f;

    /* renamed from: com.facebook.aura.file.view.SocialSourceIconKt$SocialSourceIcon$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $sourceName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3, BRg bRg, int i, int i2) {
            super(2);
            this.$sourceName = str;
            this.$iconUrl = str2;
            this.$contentDescription = str3;
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
            SocialSourceIconKt.SocialSourceIcon(this.$sourceName, this.$iconUrl, this.$contentDescription, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchSocialSourceApp.values().length];
            try {
                AnonymousClass002.A13(HatchSocialSourceApp.FACEBOOK, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchSocialSourceApp.INSTAGRAM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchSocialSourceApp.THREADS, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void SocialSourceIcon(String str, String str2, String str3, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1617243735);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Integer numLocalSocialSourceIconRes = localSocialSourceIconRes(str);
            if (numLocalSocialSourceIconRes != null) {
                bfm.AgE(606939553);
                AuraIconKt.m2567AuraIconFHprtrg(bRg2, BOf.A00(bfm, numLocalSocialSourceIconRes.intValue(), 0), AuraIconSize.X_SMALL, str3, C06G.A09(bfm), null, bfm, ((iA0d >> 9) & 14) | 384 | (AVy.$stable << 3) | ((iA0d << 3) & 7168), 32);
            } else if (str2 == null || C7BY.A0j(str2)) {
                bfm.AgE(1635743289);
            } else {
                bfm.AgE(1635542316);
                AuraImageKt.m2573AuraImageXRP3Ue8(str2, C10G.A07(bRg2, SocialSourceIconSize), B18.A02, str3, null, false, null, 0L, false, false, false, null, null, null, null, bfm, ((iA0d >> 3) & 14) | 384 | ((iA0d << 3) & 7168), 0, 32752);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, str2, str3, bRg2, i, i2);
        }
    }

    public static final Integer localSocialSourceIconRes(String str) {
        int iOrdinal;
        int i;
        HatchSocialSourceApp hatchSocialSourceAppFromSourceName = HatchSocialSourceApp.Companion.fromSourceName(str);
        if (hatchSocialSourceAppFromSourceName == null || (iOrdinal = hatchSocialSourceAppFromSourceName.ordinal()) == -1) {
            return null;
        }
        if (iOrdinal == 0) {
            i = R.drawable.facebook_outline_24_wght400;
        } else if (iOrdinal == 1) {
            i = R.drawable.instagram_outline_24_wght400;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.instagramthreads_outline_24_wght400;
        }
        return Integer.valueOf(i);
    }
}
