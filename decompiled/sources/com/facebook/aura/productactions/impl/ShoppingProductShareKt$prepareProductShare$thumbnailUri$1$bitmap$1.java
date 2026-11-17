package com.facebook.aura.productactions.impl;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.graphics.Bitmap;
import com.facebook.aura.sharesheet.HatchShareImageLoader;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.productactions.impl.ShoppingProductShareKt$prepareProductShare$thumbnailUri$1$bitmap$1", f = "ShoppingProductShare.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ShoppingProductShareKt$prepareProductShare$thumbnailUri$1$bitmap$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Bitmap>, Object> {
    public final /* synthetic */ String $imageUrl;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductShareKt$prepareProductShare$thumbnailUri$1$bitmap$1(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super ShoppingProductShareKt$prepareProductShare$thumbnailUri$1$bitmap$1> htJ) {
        super(2, htJ);
        this.$imageUrl = str;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ShoppingProductShareKt$prepareProductShare$thumbnailUri$1$bitmap$1(this.$imageUrl, this.$userSession, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchShareImageLoader hatchShareImageLoader = HatchShareImageLoader.INSTANCE;
            String str = this.$imageUrl;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            this.label = 1;
            obj = hatchShareImageLoader.load(str, abstractC3358CGz, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Bitmap> htJ) {
        return ((ShoppingProductShareKt$prepareProductShare$thumbnailUri$1$bitmap$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
