package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$render$4$loadedImages$1$1$1", f = "HatchMessageShareImageRenderer.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageShareImageRenderer$render$4$loadedImages$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HxE<? extends String, ? extends Bitmap>>, Object> {
    public final /* synthetic */ G0V<String, HtJ<? super Bitmap>, Object> $imageLoader;
    public final /* synthetic */ String $url;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageShareImageRenderer$render$4$loadedImages$1$1$1(String str, G0V<? super String, ? super HtJ<? super Bitmap>, ? extends Object> g0v, HtJ<? super HatchMessageShareImageRenderer$render$4$loadedImages$1$1$1> htJ) {
        super(2, htJ);
        this.$url = str;
        this.$imageLoader = g0v;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessageShareImageRenderer$render$4$loadedImages$1$1$1(this.$url, this.$imageLoader, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HxE<? extends String, ? extends Bitmap>> htJ) {
        return invoke2(c3ux, (HtJ<? super HxE<String, Bitmap>>) htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            obj2 = this.$url;
            G0V<String, HtJ<? super Bitmap>, Object> g0v = this.$imageLoader;
            this.L$0 = obj2;
            this.label = 1;
            obj = g0v.invoke(obj2, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            obj2 = this.L$0;
            Hwg.A00(obj);
        }
        return new HxE(obj2, obj);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HxE<String, Bitmap>> htJ) {
        return ((HatchMessageShareImageRenderer$render$4$loadedImages$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
