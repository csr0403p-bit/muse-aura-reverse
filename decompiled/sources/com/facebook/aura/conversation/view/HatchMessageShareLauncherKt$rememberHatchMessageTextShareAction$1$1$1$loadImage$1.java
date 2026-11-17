package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.graphics.Bitmap;
import com.facebook.aura.sharesheet.HatchShareImageLoader;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1$loadImage$1", f = "HatchMessageShareLauncher.kt", l = {121}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1$loadImage$1 extends AbstractC07127nr implements G0V<String, HtJ<? super Bitmap>, Object> {
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1$loadImage$1(AbstractC3358CGz abstractC3358CGz, HtJ<? super HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1$loadImage$1> htJ) {
        super(2, htJ);
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1$loadImage$1 hatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1$loadImage$1 = new HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1$loadImage$1(this.$userSession, htJ);
        hatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1$loadImage$1.L$0 = obj;
        return hatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1$loadImage$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchShareImageLoader hatchShareImageLoader = HatchShareImageLoader.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            this.L$0 = null;
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
    public final Object invoke(String str, HtJ<? super Bitmap> htJ) {
        return ((HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1$loadImage$1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
