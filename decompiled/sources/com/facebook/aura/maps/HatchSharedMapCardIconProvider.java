package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.AnonymousClass965;
import X.B15;
import X.B18;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1BN;
import X.C1BO;
import X.C60O;
import X.C7384Etj;
import X.C78N;
import X.C9Ux;
import X.Ejq;
import X.F0C;
import X.G0U;
import X.G0V;
import android.graphics.Bitmap;
import com.facebook.aura.maps.cache.HatchPlaceImageState;
import com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider;
import com.facebook.aura.maps.icons.HatchMapCardIconProvider;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchSharedMapCardIconProvider implements AnonymousClass965 {
    public static final int $stable = 0;
    public final Map<String, String> imageKeysByUrl;
    public final HatchSharedPlaceImageProvider imageProvider;

    /* renamed from: com.facebook.aura.maps.HatchSharedMapCardIconProvider$ExpandIcon$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSharedMapCardIconProvider.this.ExpandIcon(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public void ExpandIcon(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgG(535343251);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            HatchMapCardIconProvider.INSTANCE.ExpandIcon(bRg, bfm, (iA0d & 14) | 48);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg, i);
        }
    }

    @Override // X.AnonymousClass965
    public boolean PlaceImage(String str, BRg bRg, BFM bfm, int i) {
        HatchPlaceImageState.Loaded loaded;
        boolean zA1a = AnonymousClass002.A1a(str, bRg);
        bfm.AgE(52975063);
        String strA0p = C60O.A0p(str, this.imageKeysByUrl);
        if (strA0p != null) {
            boolean zA1K = AnonymousClass003.A1K(bfm, this.imageProvider, strA0p);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = this.imageProvider.observeImage(strA0p);
                bfm.Ai0(objAaT);
            }
            C1BN c1bn = (C1BN) objAaT;
            if (c1bn != null) {
                HatchPlaceImageState hatchPlaceImageState = (HatchPlaceImageState) C1BO.A07(bfm, c1bn);
                if ((hatchPlaceImageState instanceof HatchPlaceImageState.Loaded) && (loaded = (HatchPlaceImageState.Loaded) hatchPlaceImageState) != null) {
                    boolean zA65 = bfm.A65(loaded.bitmap);
                    Object objAaT2 = bfm.AaT();
                    if (zA65 || objAaT2 == C78N.A00) {
                        Bitmap bitmap = loaded.bitmap;
                        F0C f0c = B15.A02;
                        C7384Etj.A0Y(bitmap, 0);
                        objAaT2 = new C9Ux(bitmap);
                        BBI.A0T(bfm, objAaT2);
                    }
                    AuraImageKt.AuraImage(bRg, (Ejq) objAaT2, null, null, false, null, null, false, false, false, B18.A00, null, null, null, false, null, bfm, ((i >> 3) & 14) | 100663296, 6, 64252);
                    AnonymousClass001.A1D(bfm);
                    return zA1a;
                }
            }
        }
        AnonymousClass001.A1D(bfm);
        return false;
    }

    public HatchSharedMapCardIconProvider(HatchSharedPlaceImageProvider hatchSharedPlaceImageProvider, Map<String, String> map) {
        AnonymousClass003.A0u(hatchSharedPlaceImageProvider, map);
        this.imageProvider = hatchSharedPlaceImageProvider;
        this.imageKeysByUrl = map;
    }

    public /* bridge */ boolean PlaceholderIcon(BRg bRg, BFM bfm, int i) {
        return AnonymousClass004.A1P(bfm, -802141285);
    }

    public /* bridge */ boolean PlaceImage(String str, BRg bRg, G0U g0u, BFM bfm, int i) {
        AnonymousClass003.A0x(str, bRg);
        bfm.AgE(60214547);
        boolean zPlaceImage = PlaceImage(str, bRg, bfm, (i & 126) | ((i >> 3) & 896));
        AnonymousClass002.A19(bfm);
        return zPlaceImage;
    }
}
