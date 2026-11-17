package com.facebook.aura.maps;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.maps.HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$2$1", f = "HatchPlaceGalleryClip.kt", l = {84}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $settled$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$2$1(MutableState<Boolean> mutableState, HtJ<? super HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$2$1> htJ) {
        super(2, htJ);
        this.$settled$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$2$1(this.$settled$delegate, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HatchPlaceGalleryClipKt$HatchPlaceGalleryClip$2$1(this.$settled$delegate, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            MutableState.A09(false, this.$settled$delegate);
            this.label = 1;
            if (C7Bq.A01(300L, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        MutableState.A09(true, this.$settled$delegate);
        return Unit.INSTANCE;
    }
}
