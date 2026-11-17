package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareArtifactToFacebookStories$2", f = "HatchShareSheetViewModel.kt", l = {1454, 1462, 1465}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetViewModel$shareArtifactToFacebookStories$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $backgroundColor;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $facebookPackage;
    public final /* synthetic */ String $previewUri;
    public final /* synthetic */ String $publishLinkUrl;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ int $subtitleColor;
    public final /* synthetic */ String $title;
    public final /* synthetic */ int $titleColor;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ HatchShareSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetViewModel$shareArtifactToFacebookStories$2(HatchShareSheetViewModel hatchShareSheetViewModel, String str, Context context, String str2, String str3, String str4, int i, int i2, int i3, String str5, HtJ<? super HatchShareSheetViewModel$shareArtifactToFacebookStories$2> htJ) {
        super(2, htJ);
        this.this$0 = hatchShareSheetViewModel;
        this.$publishLinkUrl = str;
        this.$context = context;
        this.$previewUri = str2;
        this.$title = str3;
        this.$subtitle = str4;
        this.$backgroundColor = i;
        this.$titleColor = i2;
        this.$subtitleColor = i3;
        this.$facebookPackage = str5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchShareSheetViewModel$shareArtifactToFacebookStories$2(this.this$0, this.$publishLinkUrl, this.$context, this.$previewUri, this.$title, this.$subtitle, this.$backgroundColor, this.$titleColor, this.$subtitleColor, this.$facebookPackage, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[Catch: all -> 0x011d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x011d, blocks: (B:26:0x007d, B:27:0x0080, B:30:0x0086, B:35:0x0096, B:38:0x00ad, B:40:0x00e2, B:21:0x0052, B:22:0x0055, B:23:0x0059, B:12:0x0022, B:13:0x0025, B:15:0x002b, B:16:0x002e, B:18:0x0040, B:9:0x0017), top: B:53:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: all -> 0x011d, TRY_ENTER, TryCatch #0 {all -> 0x011d, blocks: (B:26:0x007d, B:27:0x0080, B:30:0x0086, B:35:0x0096, B:38:0x00ad, B:40:0x00e2, B:21:0x0052, B:22:0x0055, B:23:0x0059, B:12:0x0022, B:13:0x0025, B:15:0x002b, B:16:0x002e, B:18:0x0040, B:9:0x0017), top: B:53:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[LOOP:0: B:32:0x008f->B:55:?, LOOP_END, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareArtifactToFacebookStories$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchShareSheetViewModel$shareArtifactToFacebookStories$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
