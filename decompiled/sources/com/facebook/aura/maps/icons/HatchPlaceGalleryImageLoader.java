package com.facebook.aura.maps.icons;

import X.AVy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B15;
import X.B18;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C1SA;
import X.C3cG;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.C9Vm;
import X.C9W5;
import X.Ejq;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchPlaceGalleryImageLoader implements C9W5 {
    public static final int $stable = 0;
    public static final HatchPlaceGalleryImageLoader INSTANCE = new HatchPlaceGalleryImageLoader();
    public static final C7197Ei9 STILL_OPTIONS;

    @Override // X.C9W5
    /* renamed from: SourceIcon-iJQMabo */
    public void mo8SourceIconiJQMabo(final C9Vm c9Vm, final long j, final BRg bRg, BFM bfm, final int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        int i2;
        C7384Etj.A0Y(c9Vm, 0);
        C7384Etj.A0Y(bRg, 2);
        bfm.AgG(-755818683);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, c9Vm) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA08), bfm, iA08)) {
            int iOrdinal = c9Vm.ordinal();
            if (iOrdinal == 0) {
                i2 = R.drawable.instagram_outline_24_wght400;
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw C3cG.A0q();
                    }
                    bBbAAc = bfm.AAc();
                    if (bBbAAc != null) {
                        g0v = new G0V() { // from class: com.facebook.aura.maps.icons.HatchPlaceGalleryImageLoader$$ExternalSyntheticLambda0
                            @Override // X.G0V
                            public final Object invoke(Object obj, Object obj2) {
                                HatchPlaceGalleryImageLoader hatchPlaceGalleryImageLoader = this.f$0;
                                C9Vm c9Vm2 = c9Vm;
                                long j2 = j;
                                BRg bRg2 = bRg;
                                int i3 = i;
                                BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
                                int i4 = HatchPlaceGalleryImageLoader.$stable;
                                hatchPlaceGalleryImageLoader.mo8SourceIconiJQMabo(c9Vm2, j2, bRg2, bfmA0P, AnonymousClass011.A00(i3));
                                return Unit.INSTANCE;
                            }
                        };
                        bBbAAc.A06 = g0v;
                    }
                    return;
                }
                i2 = R.drawable.facebook_outline_24_wght400;
            }
            C1SA.A00(bfm, null, bRg, AnonymousClass002.A0S(j), BOf.A00(bfm, i2, 0), null, null, 0.0f, AVy.$stable | 48 | (iA08 & 896), 56);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            g0v = new G0V() { // from class: com.facebook.aura.maps.icons.HatchPlaceGalleryImageLoader$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    HatchPlaceGalleryImageLoader hatchPlaceGalleryImageLoader = this.f$0;
                    C9Vm c9Vm2 = c9Vm;
                    long j2 = j;
                    BRg bRg2 = bRg;
                    int i3 = i;
                    BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
                    int i4 = HatchPlaceGalleryImageLoader.$stable;
                    hatchPlaceGalleryImageLoader.mo8SourceIconiJQMabo(c9Vm2, j2, bRg2, bfmA0P, AnonymousClass011.A00(i3));
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v;
        }
    }

    @Override // X.C9W5
    public /* bridge */ void VideoThumbnail(String str, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        C7384Etj.A0Y(g0v, 3);
        bfm.AgE(-915453373);
        AnonymousClass003.A13(bfm, g0v, i >> 6);
        AnonymousClass002.A19(bfm);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C9Vm.values().length];
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        C7196Ei8 c7196Ei8A00 = C7197Ei9.A00();
        c7196Ei8A00.A0I = false;
        STILL_OPTIONS = new C7197Ei9(c7196Ei8A00);
    }

    @Override // X.C9W5
    public void GalleryImage(final String str, final BRg bRg, BFM bfm, final int i) {
        boolean zA1b = AnonymousClass004.A1b(str, bRg);
        bfm.AgG(-258373394);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            boolean zA1M = AnonymousClass001.A1M(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = B15.A01(str);
                bfm.Ai0(objAaT);
            }
            AuraImageKt.AuraImage(bRg, (Ejq) objAaT, null, STILL_OPTIONS, zA1b, null, null, zA1b, zA1b, zA1b, B18.A00, null, null, null, zA1b, null, bfm, ((iA0d >> 3) & 14) | 100663296, 6, 64244);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.maps.icons.HatchPlaceGalleryImageLoader$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    HatchPlaceGalleryImageLoader hatchPlaceGalleryImageLoader = this.f$0;
                    String str2 = str;
                    BRg bRg2 = bRg;
                    int i2 = i;
                    int i3 = HatchPlaceGalleryImageLoader.$stable;
                    hatchPlaceGalleryImageLoader.GalleryImage(str2, bRg2, (BFM) obj, AnonymousClass011.A00(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit GalleryImage$lambda$1(HatchPlaceGalleryImageLoader hatchPlaceGalleryImageLoader, String str, BRg bRg, int i, BFM bfm, int i2) {
        hatchPlaceGalleryImageLoader.GalleryImage(str, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit SourceIcon_iJQMabo$lambda$0(HatchPlaceGalleryImageLoader hatchPlaceGalleryImageLoader, C9Vm c9Vm, long j, BRg bRg, int i, BFM bfm, int i2) {
        hatchPlaceGalleryImageLoader.mo8SourceIconiJQMabo(c9Vm, j, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit SourceIcon_iJQMabo$lambda$1(HatchPlaceGalleryImageLoader hatchPlaceGalleryImageLoader, C9Vm c9Vm, long j, BRg bRg, int i, BFM bfm, int i2) {
        hatchPlaceGalleryImageLoader.mo8SourceIconiJQMabo(c9Vm, j, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public /* bridge */ void GalleryImage(String str, BRg bRg, G0U g0u, BFM bfm, int i) {
        AnonymousClass003.A0x(str, bRg);
        bfm.AgE(-1651207619);
        GalleryImage(str, bRg, bfm, (i & 126) | ((i >> 3) & 896));
        AnonymousClass002.A19(bfm);
    }
}
