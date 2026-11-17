package X;

import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes4.dex */
public abstract class B06 implements B9B {
    public static final int $stable = 0;
    public final int loadingStrategy;
    public final B0H typefaceLoader;
    public final B08 variationSettings;

    @Override // X.B9B
    /* renamed from: getLoadingStrategy-PKNRLFQ, reason: not valid java name */
    public final int mo20getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final B0H getTypefaceLoader() {
        return this.typefaceLoader;
    }

    public final B08 getVariationSettings() {
        return this.variationSettings;
    }

    public B06(int i, B0H b0h, B08 b08) {
        this.loadingStrategy = i;
        this.typefaceLoader = b0h;
        this.variationSettings = b08;
    }

    public B06(int i, B0H b0h) {
        this(i, b0h, new B08(new B0G[0]));
    }

    public /* synthetic */ B06(int i, B0H b0h, B08 b08, C06H c06h) {
        this(i, b0h, b08);
    }

    @Deprecated(message = "Replaced with fontVariation constructor", replaceWith = @ReplaceWith(expression = "AndroidFont(loadingStrategy, typefaceLoader, FontVariation.Settings())", imports = {}))
    public /* synthetic */ B06(int i, B0H b0h, C06H c06h) {
        this(i, b0h);
    }
}
