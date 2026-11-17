package com.airbnb.lottie.compose;

import X.AbstractC07127nr;
import X.BAs;
import X.C18m;
import X.C3UX;
import X.C8j3;
import X.G0V;
import X.G0W;
import X.HtJ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", l = {90, AuraWaitlistConfettiKt.StandardParticleCount}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class RememberLottieCompositionKt$rememberLottieComposition$3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $cacheKey;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $fontAssetsFolder;
    public final /* synthetic */ String $fontFileExtension;
    public final /* synthetic */ String $imageAssetsFolder;
    public final /* synthetic */ G0W<Integer, Throwable, HtJ<? super Boolean>, Object> $onRetry;
    public final /* synthetic */ MutableState<BAs> $result$delegate;
    public final /* synthetic */ C18m $spec;
    public int I$0;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/G0W<-Ljava/lang/Integer;-Ljava/lang/Throwable;-LX/HtJ<-Ljava/lang/Boolean;>;+Ljava/lang/Object;>;Landroid/content/Context;LX/18m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState<LX/BAs;>;LX/HtJ<-Lcom/airbnb/lottie/compose/RememberLottieCompositionKt$rememberLottieComposition$3;>;)V */
    public RememberLottieCompositionKt$rememberLottieComposition$3(Context context, MutableState mutableState, C18m c18m, String str, String str2, String str3, String str4, HtJ htJ, G0W g0w) {
        super(2, htJ);
        this.$onRetry = g0w;
        this.$context = context;
        this.$spec = c18m;
        this.$imageAssetsFolder = str;
        this.$fontAssetsFolder = str2;
        this.$fontFileExtension = str3;
        this.$cacheKey = str4;
        this.$result$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        G0W<Integer, Throwable, HtJ<? super Boolean>, Object> g0w = this.$onRetry;
        return new RememberLottieCompositionKt$rememberLottieComposition$3(this.$context, this.$result$delegate, this.$spec, this.$imageAssetsFolder, this.$fontAssetsFolder, this.$fontFileExtension, this.$cacheKey, htJ, g0w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (((java.lang.Boolean) r15).booleanValue() == false) goto L57;
     */
    /* JADX WARN: Path cross not found for [B:34:0x009e, B:30:0x0089], limit reached: 77 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:43:0x00ca, B:44:0x00cd, B:45:0x00d7, B:49:0x00f6, B:19:0x005e, B:21:0x0067, B:23:0x006d, B:25:0x0075, B:26:0x007f, B:28:0x0083, B:30:0x0089, B:32:0x0091, B:35:0x009f, B:37:0x00a7, B:39:0x00b3, B:40:0x00bb, B:53:0x00fb, B:46:0x00d8, B:48:0x00ea), top: B:75:0x00ca, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c7 -> B:44:0x00cd). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((RememberLottieCompositionKt$rememberLottieComposition$3) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
