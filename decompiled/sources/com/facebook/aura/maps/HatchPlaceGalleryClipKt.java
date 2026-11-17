package com.facebook.aura.maps;

import X.AbstractC1462AjV;
import X.AbstractC1798ArH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00r;
import X.C01N;
import X.C1BO;
import X.C2ae;
import X.C31u;
import X.C3cG;
import X.C60O;
import X.C78N;
import X.C7Je;
import X.C8j5;
import X.G0U;
import X.G0V;
import X.InterfaceC7359EnW;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.aura.common.video.HatchVideoPlayerComposableKt;
import com.facebook.aura.common.video.RememberHatchVideoPlayerKt;
import com.facebook.aura.maps.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchPlaceGalleryClipKt {
    public static final String GALLERY_CLIP_SURFACE_TAG = "hatch_place_gallery";
    public static final float MIN_VISIBLE_FRACTION = 0.5f;
    public static final long MOVE_SAMPLE_MS = 100;
    public static final long SETTLE_MS = 300;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(HatchPlaceGalleryClipKt.class, "isGalleryClipAutoplayEnabled", "isGalleryClipAutoplayEnabled()Z", 1);
    public static final C31u isGalleryClipAutoplayEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_maps.enable_gallery_clip_autoplay);

    /* renamed from: com.facebook.aura.maps.HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $playBadge;
        public final /* synthetic */ HatchGalleryClipPlayback $playback;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, HatchGalleryClipPlayback hatchGalleryClipPlayback, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$url = str;
            this.$playback = hatchGalleryClipPlayback;
            this.$playBadge = g0v;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPlaceGalleryClipKt.HatchPlaceGalleryClip(this.$url, this.$playback, this.$playBadge, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $playBadge;
        public final /* synthetic */ HatchGalleryClipPlayback $playback;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(String str, HatchGalleryClipPlayback hatchGalleryClipPlayback, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$url = str;
            this.$playback = hatchGalleryClipPlayback;
            this.$playBadge = g0v;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPlaceGalleryClipKt.HatchPlaceGalleryClip(this.$url, this.$playback, this.$playBadge, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $playBadge;
        public final /* synthetic */ HatchGalleryClipPlayback $playback;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(String str, HatchGalleryClipPlayback hatchGalleryClipPlayback, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$url = str;
            this.$playback = hatchGalleryClipPlayback;
            this.$playBadge = g0v;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPlaceGalleryClipKt.HatchPlaceGalleryClip(this.$url, this.$playback, this.$playBadge, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchPlaceGalleryClip(String str, HatchGalleryClipPlayback hatchGalleryClipPlayback, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass6;
        BRg bRg2 = bRg;
        bfm.AgG(-1806291217);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, hatchGalleryClipPlayback);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
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
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = null;
                try {
                    objAaT = C7Je.A01(str);
                } catch (SecurityException | UnsupportedOperationException unused) {
                }
                bfm.Ai0(objAaT);
            }
            Uri uri = (Uri) objAaT;
            if (uri == null || !isGalleryClipAutoplayEnabled()) {
                bfm.AgE(423896595);
                AnonymousClass003.A13(bfm, g0v, iA0d >> 6);
                AnonymousClass002.A19(bfm);
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    anonymousClass6 = new AnonymousClass1(str, hatchGalleryClipPlayback, g0v, bRg2, i, i2);
                }
            } else {
                bfm.AgE(423927347);
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                Object objAaT2 = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT2 == obj) {
                    objAaT2 = C3cG.A0T();
                    bfm.Ai0(objAaT2);
                }
                int i4 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
                boolean zA1Q = AnonymousClass002.A1Q(i4, 32);
                Object objAaT3 = bfm.AaT();
                if (zA1Q || objAaT3 == obj) {
                    objAaT3 = AbstractC1798ArH.A00(bbi, new HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$isActive$2$1(hatchGalleryClipPlayback, objAaT2));
                }
                C1BO c1bo = (C1BO) objAaT3;
                Object objAaT4 = bfm.AaT();
                if (objAaT4 == obj) {
                    objAaT4 = new C2ae[]{null};
                    BBI.A0O(bbi, objAaT4);
                }
                C2ae[] c2aeArr = (C2ae[]) objAaT4;
                Object objAaT5 = bfm.AaT();
                if (objAaT5 == obj) {
                    objAaT5 = new ParcelableSnapshotMutableIntState(0);
                    BBI.A0O(bbi, objAaT5);
                }
                C00r c00r = (C00r) objAaT5;
                Object objAaT6 = bfm.AaT();
                if (objAaT6 == obj) {
                    objAaT6 = AbstractC1798ArH.A08(false);
                    BBI.A0O(bbi, objAaT6);
                }
                MutableState mutableState = (MutableState) objAaT6;
                Integer numValueOf = Integer.valueOf(c00r.AGd());
                Object objAaT7 = bfm.AaT();
                if (objAaT7 == obj) {
                    objAaT7 = new HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$2$1(mutableState, null);
                    BBI.A0O(bbi, objAaT7);
                }
                AnonymousClass001.A18(bfm, objAaT7, numValueOf);
                boolean zA1T = AnonymousClass001.A1T(bfm, objAaT2, AnonymousClass002.A1Q(i4, 32));
                Object objAaT8 = bfm.AaT();
                if (zA1T || objAaT8 == obj) {
                    objAaT8 = new HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$3$1(hatchGalleryClipPlayback, objAaT2);
                    BBI.A0O(bbi, objAaT8);
                }
                AnonymousClass001.A19(bfm, objAaT8, hatchGalleryClipPlayback, objAaT2);
                boolean zA1V = AnonymousClass002.A1V(bfm, c2aeArr, AnonymousClass002.A1Q(i4, 32), bfm.A67(objAaT2));
                Object objAaT9 = bfm.AaT();
                if (zA1V || objAaT9 == obj) {
                    objAaT9 = new HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$observed$1$1(hatchGalleryClipPlayback, objAaT2, c2aeArr, c00r);
                    BBI.A0O(bbi, objAaT9);
                }
                BRg bRgA00 = AbstractC1462AjV.A00(bRg2, (G0U) objAaT9, 100L, 64L);
                if (C1BO.A0F(c1bo)) {
                    bfm.AgE(424858835);
                    BBI.A0R(bbi, false);
                    MutableState mutableState2 = (MutableState) C8j5.A0U(bfm, bbi, obj, false);
                    HatchVideoPlayer hatchVideoPlayerRememberHatchVideoPlayer = RememberHatchVideoPlayerKt.rememberHatchVideoPlayer(HatchVideoPlayer.RepeatMode.ALL, true, false, bfm, 438, 0);
                    boolean zA0A = MutableState.A0A(mutableState);
                    HatchVideoPlayer.ResizeMode resizeMode = HatchVideoPlayer.ResizeMode.ZOOM;
                    Object objAaT10 = bfm.AaT();
                    if (objAaT10 == obj) {
                        objAaT10 = new HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$5$1(mutableState2);
                        BBI.A0O(bbi, objAaT10);
                    }
                    HatchVideoPlayerComposableKt.HatchVideoPlayerComposable(bRgA00, uri, hatchVideoPlayerRememberHatchVideoPlayer, null, null, null, false, zA0A, false, false, false, false, resizeMode, 0.0f, GALLERY_CLIP_SURFACE_TAG, null, false, false, false, null, false, null, null, null, (Function0) objAaT10, null, null, bfm, 0, 1597830, RuntimeInternals.IOPRIO_BACKGROUND, 117353336);
                    if (MutableState.A0A(mutableState2)) {
                        bfm.AgE(425448083);
                    } else {
                        bfm.AgE(425427902);
                        AnonymousClass003.A13(bfm, g0v, iA0d >> 6);
                    }
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(424807902);
                    C01N.A07(bfm, bRgA00);
                    AnonymousClass004.A1C(bbi, bfm, g0v, iA0d >> 6, false);
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    } else {
                        anonymousClass6 = new AnonymousClass4(str, hatchGalleryClipPlayback, g0v, bRg2, i, i2);
                    }
                }
            }
            C3cG.A1D(bBbAAc, anonymousClass6);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass6 = new AnonymousClass6(str, hatchGalleryClipPlayback, g0v, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass6);
        }
    }

    public static final boolean isGalleryClipAutoplayEnabled() {
        return AnonymousClass001.A1X(C31u.A00(isGalleryClipAutoplayEnabled$delegate, $$delegatedProperties));
    }
}
