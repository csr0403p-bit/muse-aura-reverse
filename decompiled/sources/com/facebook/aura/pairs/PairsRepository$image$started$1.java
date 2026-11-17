package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.B1T;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC2178B0w;
import android.graphics.Bitmap;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository$image$started$1", f = "PairsRepository.kt", l = {1095}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PairsRepository$image$started$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super InterfaceC2178B0w>, Object> {
    public final /* synthetic */ String $cacheKey;
    public final /* synthetic */ PairsImageRef $ref;
    public final /* synthetic */ int $sizePx;
    public int label;
    public final /* synthetic */ PairsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsRepository$image$started$1(PairsRepository pairsRepository, PairsImageRef pairsImageRef, int i, String str, HtJ<? super PairsRepository$image$started$1> htJ) {
        super(2, htJ);
        this.this$0 = pairsRepository;
        this.$ref = pairsImageRef;
        this.$sizePx = i;
        this.$cacheKey = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PairsRepository$image$started$1(this.this$0, this.$ref, this.$sizePx, this.$cacheKey, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws IOException {
        Bitmap bitmapDecodeBounded;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PairsRepository pairsRepository = this.this$0;
            PairsImageRef pairsImageRef = this.$ref;
            this.label = 1;
            obj = pairsRepository.imageBytes(pairsImageRef, this);
            if (obj != enumC10460Hji) {
            }
            return enumC10460Hji;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        byte[] bArr = (byte[]) obj;
        enumC10460Hji = null;
        if (bArr != null && (bitmapDecodeBounded = PairsRepositoryKt.decodeBounded(bArr, this.$sizePx)) != null) {
            B1T b1t = new B1T(bitmapDecodeBounded);
            this.this$0.imageCache.put(this.$cacheKey, b1t);
            return b1t;
        }
        return enumC10460Hji;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super InterfaceC2178B0w> htJ) {
        return ((PairsRepository$image$started$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
