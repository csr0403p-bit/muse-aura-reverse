package com.facebook.aura.maps.icons;

import X.AVy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C06G;
import X.C1SA;
import X.C9WZ;
import com.facebook.aura.R;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class HatchPlaceRowIconProvider {
    public static final int $stable = 0;
    public static final HatchPlaceRowIconProvider INSTANCE = new HatchPlaceRowIconProvider();

    public boolean RowIcon(C9WZ c9wz, BRg bRg, BFM bfm, int i) {
        boolean zA1a = AnonymousClass002.A1a(c9wz, bRg);
        bfm.AgE(714503871);
        C1SA.A00(bfm, null, bRg, AnonymousClass002.A0S(C06G.A06(bfm)), BOf.A00(bfm, drawableRes(c9wz), 0), null, null, 0.0f, AVy.$stable | 48 | ((i << 3) & 896), 56);
        AnonymousClass001.A1D(bfm);
        return zA1a;
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C9WZ.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final int drawableRes(C9WZ c9wz) {
        switch (c9wz.ordinal()) {
            case 0:
                return R.drawable.clock_wght400_outline_24;
            case 1:
                return R.drawable.meta_ai_icons_map_medium_cropped;
            case 2:
                return R.drawable.phone_handset_wght400_outline_24;
            case 3:
                return R.drawable.globe_wght400_outline_24;
            case 4:
                return R.drawable.instagram_outline_24_wght400;
            case 5:
                return R.drawable.facebook_outline_24_wght400;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
