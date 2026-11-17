package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C10571Hud;
import X.C3cG;
import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class HatchKatexRenderer$bitmapCacheDelegate$1 extends AbstractC7559F3s implements Function0<AnonymousClass1> {
    public static final HatchKatexRenderer$bitmapCacheDelegate$1 INSTANCE = new HatchKatexRenderer$bitmapCacheDelegate$1();

    public HatchKatexRenderer$bitmapCacheDelegate$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$bitmapCacheDelegate$1$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        return new LruCache<String, Bitmap>(HatchKatexRenderer.INSTANCE.getBitmapCacheMaxBytes()) { // from class: com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$bitmapCacheDelegate$1.1
            @Override // android.util.LruCache
            public int sizeOf(String str, Bitmap bitmap) {
                Object objA0s;
                AnonymousClass003.A0u(str, bitmap);
                try {
                    objA0s = Integer.valueOf(bitmap.getAllocationByteCount());
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                Integer numValueOf = Integer.valueOf(bitmap.getByteCount());
                if (objA0s instanceof C10571Hud) {
                    objA0s = numValueOf;
                }
                long jA0F = AnonymousClass001.A0F(objA0s) + (str.length() * 2);
                if (jA0F > 2147483647L) {
                    jA0F = 2147483647L;
                }
                return (int) jA0F;
            }
        };
    }
}
