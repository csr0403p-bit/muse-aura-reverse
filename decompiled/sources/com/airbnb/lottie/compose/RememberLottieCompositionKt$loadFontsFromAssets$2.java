package com.airbnb.lottie.compose;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BV5;
import X.C3UX;
import X.C6837Eap;
import X.C7384Etj;
import X.C7BY;
import X.C8j3;
import X.G0V;
import X.HgT;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.graphics.Typeface;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class RememberLottieCompositionKt$loadFontsFromAssets$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C6837Eap $composition;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $fontAssetsFolder;
    public final /* synthetic */ String $fontFileExtension;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/Eap;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;LX/HtJ<-Lcom/airbnb/lottie/compose/RememberLottieCompositionKt$loadFontsFromAssets$2;>;)V */
    public RememberLottieCompositionKt$loadFontsFromAssets$2(Context context, C6837Eap c6837Eap, String str, String str2, HtJ htJ) {
        super(2, htJ);
        this.$composition = c6837Eap;
        this.$context = context;
        this.$fontAssetsFolder = str;
        this.$fontFileExtension = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new RememberLottieCompositionKt$loadFontsFromAssets$2(this.$context, this.$composition, this.$fontAssetsFolder, this.$fontFileExtension, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        Iterator itA10 = BV5.A10(this.$composition.A0A);
        while (itA10.hasNext()) {
            HgT hgT = (HgT) itA10.next();
            Context context = this.$context;
            C7384Etj.A0S(hgT);
            String str = this.$fontAssetsFolder;
            String str2 = this.$fontFileExtension;
            StringBuilder sbA0q = BV5.A0q(str);
            sbA0q.append((Object) hgT.A01);
            try {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), AnonymousClass001.A0v(str2, sbA0q));
                C7384Etj.A0U(typefaceCreateFromAsset);
                String str3 = hgT.A03;
                C7384Etj.A0U(str3);
                int i = 0;
                boolean zA0q = C7BY.A0q(str3, "Italic", false);
                boolean zA0q2 = C7BY.A0q(str3, "Bold", false);
                if (zA0q) {
                    i = 2;
                    if (zA0q2) {
                        i = 3;
                    }
                } else if (zA0q2) {
                    i = 1;
                }
                if (typefaceCreateFromAsset.getStyle() != i) {
                    typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i);
                }
                hgT.A00 = typefaceCreateFromAsset;
            } catch (Exception unused) {
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((RememberLottieCompositionKt$loadFontsFromAssets$2) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
