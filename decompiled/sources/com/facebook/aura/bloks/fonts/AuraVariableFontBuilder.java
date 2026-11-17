package com.facebook.aura.bloks.fonts;

import X.AnonymousClass006;
import X.BeS;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.CMG;
import X.FGI;
import X.FJK;
import android.content.Context;
import android.graphics.Typeface;
import java.io.File;

/* loaded from: classes6.dex */
public final class AuraVariableFontBuilder implements FJK {
    public final String cacheFilename;
    public final int fontResId;
    public boolean italic;
    public final Integer opticalSize;
    public String variationSettings;
    public int weight;

    public AuraVariableFontBuilder(int i, String str, Integer num) {
        C7384Etj.A0Y(str, 1);
        this.fontResId = i;
        this.cacheFilename = str;
        this.opticalSize = num;
        this.weight = 400;
        this.variationSettings = "";
    }

    @Override // X.FJK
    public Typeface build(Context context) {
        Typeface typefaceBuild;
        C7384Etj.A0Y(context, 0);
        File orCreateFontFile = AuraTypefaceCreatorKt.getOrCreateFontFile(context, this.fontResId, this.cacheFilename);
        if (orCreateFontFile != null) {
            try {
                typefaceBuild = new Typeface.Builder(orCreateFontFile).setFontVariationSettings(resolveVariationSettings()).setWeight(this.weight).setItalic(this.italic).build();
            } catch (RuntimeException unused) {
                typefaceBuild = null;
            }
            if (typefaceBuild != null) {
                return typefaceBuild;
            }
        }
        Typeface typefaceA00 = CMG.A00(context, this.fontResId);
        if (typefaceA00 == null) {
            return null;
        }
        int i = this.weight;
        boolean z = this.italic;
        BeS.A04("weight", i, 1, 1000);
        return Typeface.create(typefaceA00, i, z);
    }

    /* renamed from: setFontVariationSettings, reason: collision with other method in class */
    public AuraVariableFontBuilder m287setFontVariationSettings(String str) {
        C7384Etj.A0Y(str, 0);
        this.variationSettings = str;
        return this;
    }

    private final String resolveVariationSettings() {
        String strA0H = this.variationSettings;
        if (strA0H.length() == 0) {
            strA0H = FGI.A0H("'wght' ", this.weight);
        }
        return (this.opticalSize == null || C7BY.A0q(strA0H, AuraTypefaceCreatorKt.OPTICAL_SIZE_AXIS, false)) ? strA0H : AnonymousClass006.A0y(this.opticalSize, ", 'opsz' ", C3cG.A0g(strA0H));
    }

    public /* bridge */ /* synthetic */ FJK setItalic(boolean z) {
        this.italic = z;
        return this;
    }

    public /* bridge */ /* synthetic */ FJK setWeight(int i) {
        this.weight = i;
        return this;
    }

    public /* bridge */ /* synthetic */ FJK setFontVariationSettings(String str) {
        m287setFontVariationSettings(str);
        return this;
    }

    /* renamed from: setItalic, reason: collision with other method in class */
    public AuraVariableFontBuilder m288setItalic(boolean z) {
        this.italic = z;
        return this;
    }

    /* renamed from: setWeight, reason: collision with other method in class */
    public AuraVariableFontBuilder m289setWeight(int i) {
        this.weight = i;
        return this;
    }
}
