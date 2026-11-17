package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareArtifactToInstagramStories$2", f = "HatchShareSheetViewModel.kt", l = {1394, 1407, 1410, 1420}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetViewModel$shareArtifactToInstagramStories$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $backgroundColor;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $previewUri;
    public final /* synthetic */ String $publishLinkUrl;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ int $subtitleColor;
    public final /* synthetic */ String $title;
    public final /* synthetic */ int $titleColor;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ HatchShareSheetViewModel this$0;

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8 A[Catch: all -> 0x010b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x010b, blocks: (B:51:0x00dc, B:52:0x00df, B:54:0x00e5, B:57:0x00f6, B:39:0x00ae, B:40:0x00b1, B:43:0x00b8, B:48:0x00c8, B:34:0x0083, B:35:0x0086, B:36:0x008a, B:15:0x0037, B:16:0x003a, B:19:0x0042, B:21:0x0048, B:22:0x004f, B:23:0x0052, B:25:0x0058, B:27:0x005c, B:29:0x0061, B:31:0x0071, B:28:0x005f, B:12:0x002c), top: B:70:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8 A[Catch: all -> 0x010b, TRY_ENTER, TryCatch #0 {all -> 0x010b, blocks: (B:51:0x00dc, B:52:0x00df, B:54:0x00e5, B:57:0x00f6, B:39:0x00ae, B:40:0x00b1, B:43:0x00b8, B:48:0x00c8, B:34:0x0083, B:35:0x0086, B:36:0x008a, B:15:0x0037, B:16:0x003a, B:19:0x0042, B:21:0x0048, B:22:0x004f, B:23:0x0052, B:25:0x0058, B:27:0x005c, B:29:0x0061, B:31:0x0071, B:28:0x005f, B:12:0x002c), top: B:70:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5 A[Catch: all -> 0x010b, TryCatch #0 {all -> 0x010b, blocks: (B:51:0x00dc, B:52:0x00df, B:54:0x00e5, B:57:0x00f6, B:39:0x00ae, B:40:0x00b1, B:43:0x00b8, B:48:0x00c8, B:34:0x0083, B:35:0x0086, B:36:0x008a, B:15:0x0037, B:16:0x003a, B:19:0x0042, B:21:0x0048, B:22:0x004f, B:23:0x0052, B:25:0x0058, B:27:0x005c, B:29:0x0061, B:31:0x0071, B:28:0x005f, B:12:0x002c), top: B:70:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[LOOP:0: B:59:0x0102->B:72:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[LOOP:1: B:45:0x00c1->B:74:?, LOOP_END, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareArtifactToInstagramStories$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetViewModel$shareArtifactToInstagramStories$2(HatchShareSheetViewModel hatchShareSheetViewModel, String str, Context context, String str2, String str3, String str4, int i, int i2, int i3, HtJ<? super HatchShareSheetViewModel$shareArtifactToInstagramStories$2> htJ) {
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
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchShareSheetViewModel$shareArtifactToInstagramStories$2(this.this$0, this.$publishLinkUrl, this.$context, this.$previewUri, this.$title, this.$subtitle, this.$backgroundColor, this.$titleColor, this.$subtitleColor, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchShareSheetViewModel$shareArtifactToInstagramStories$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
