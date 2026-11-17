package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C9Vm;
import X.C9W5;
import X.G0U;
import X.G0V;
import com.facebook.aura.maps.icons.HatchPlaceGalleryImageLoader;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchPlaceGalleryLoader implements C9W5 {
    public static final int $stable = 0;
    public final /* synthetic */ HatchPlaceGalleryImageLoader $$delegate_0 = HatchPlaceGalleryImageLoader.INSTANCE;
    public final HatchGalleryClipPlayback playback = new HatchGalleryClipPlayback();

    /* renamed from: com.facebook.aura.maps.HatchPlaceGalleryLoader$GalleryImage$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i) {
            super(2);
            this.$url = str;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPlaceGalleryLoader.this.GalleryImage(this.$url, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchPlaceGalleryLoader$GalleryImage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U $onLoadStatus;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BRg bRg, G0U g0u, int i) {
            super(2);
            this.$url = str;
            this.$modifier = bRg;
            this.$onLoadStatus = g0u;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPlaceGalleryLoader.this.GalleryImage(this.$url, this.$modifier, this.$onLoadStatus, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchPlaceGalleryLoader$VideoThumbnail$1, reason: invalid class name and case insensitive filesystem */
    public final class C126801 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $frameUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $playBadge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C126801(String str, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$frameUrl = str;
            this.$modifier = bRg;
            this.$playBadge = g0v;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPlaceGalleryLoader.this.VideoThumbnail(this.$frameUrl, this.$modifier, this.$playBadge, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @Override // X.C9W5
    /* renamed from: SourceIcon-iJQMabo */
    public void mo8SourceIconiJQMabo(C9Vm c9Vm, long j, BRg bRg, BFM bfm, int i) {
        AnonymousClass003.A0v(c9Vm, bRg);
        bfm.AgG(-399335130);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, c9Vm) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0g(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA08), bfm, iA08)) {
            this.$$delegate_0.mo8SourceIconiJQMabo(c9Vm, j, bRg, bfm, iA08 & 1022);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchPlaceGalleryLoader$SourceIcon$1(this, c9Vm, j, bRg, i);
        }
    }

    @Override // X.C9W5
    public void VideoThumbnail(String str, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        AnonymousClass005.A10(str, bRg, g0v);
        bfm.AgG(746628182);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            HatchPlaceGalleryClipKt.HatchPlaceGalleryClip(str, this.playback, g0v, bRg, bfm, ((iA0d << 6) & 7168) | (iA0d & 910), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126801(str, bRg, g0v, i);
        }
    }

    @Override // X.C9W5
    public void GalleryImage(String str, BRg bRg, BFM bfm, int i) {
        AnonymousClass003.A0u(str, bRg);
        bfm.AgG(-1338802097);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            this.$$delegate_0.GalleryImage(str, bRg, bfm, iA0d & 126);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg, i);
        }
    }

    public void GalleryImage(String str, BRg bRg, G0U g0u, BFM bfm, int i) {
        int iA0g;
        AnonymousClass005.A0x(str, bRg, g0u);
        bfm.AgG(-582750692);
        if ((i & 6) == 0) {
            iA0g = AnonymousClass004.A0d(bfm, str) | i;
        } else {
            iA0g = i;
        }
        if ((i & 48) == 0) {
            iA0g |= AnonymousClass004.A0e(bfm, bRg);
        }
        if ((i & 384) == 0) {
            iA0g |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA0g |= AnonymousClass004.A0g(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0g), bfm, iA0g)) {
            this.$$delegate_0.GalleryImage(str, bRg, g0u, bfm, iA0g & 1022);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, bRg, g0u, i);
        }
    }
}
