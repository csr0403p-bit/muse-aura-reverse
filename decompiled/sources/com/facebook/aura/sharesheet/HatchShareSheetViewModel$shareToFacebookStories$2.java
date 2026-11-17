package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import android.content.Context;
import com.facebook.aura.model.HatchDanceShare;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToFacebookStories$2", f = "HatchShareSheetViewModel.kt", l = {1146, 1150, 1153, 1186, 1191}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetViewModel$shareToFacebookStories$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchDanceShare $dance;
    public final /* synthetic */ String $facebookPackage;
    public final /* synthetic */ String $mediaUri;
    public final /* synthetic */ String $stickerUri;
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$12;
    public Object L$13;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ HatchShareSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetViewModel$shareToFacebookStories$2(HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str, String str2, String str3, HatchDanceShare hatchDanceShare, HtJ<? super HatchShareSheetViewModel$shareToFacebookStories$2> htJ) {
        super(2, htJ);
        this.this$0 = hatchShareSheetViewModel;
        this.$context = context;
        this.$mediaUri = str;
        this.$stickerUri = str2;
        this.$facebookPackage = str3;
        this.$dance = hatchDanceShare;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchShareSheetViewModel$shareToFacebookStories$2(this.this$0, this.$context, this.$mediaUri, this.$stickerUri, this.$facebookPackage, this.$dance, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089 A[Catch: all -> 0x01db, TRY_LEAVE, TryCatch #0 {all -> 0x01db, blocks: (B:10:0x001c, B:54:0x016c, B:55:0x016f, B:56:0x0171, B:58:0x0175, B:59:0x017b, B:62:0x019b, B:38:0x00b9, B:39:0x00bc, B:40:0x00be, B:43:0x00d0, B:45:0x00e1, B:46:0x0109, B:48:0x0125, B:50:0x0129, B:24:0x0081, B:25:0x0084, B:27:0x0089, B:32:0x009b, B:34:0x009f, B:17:0x0060, B:18:0x0063, B:20:0x0069, B:21:0x006c, B:14:0x0055), top: B:77:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b A[Catch: all -> 0x01db, TRY_ENTER, TryCatch #0 {all -> 0x01db, blocks: (B:10:0x001c, B:54:0x016c, B:55:0x016f, B:56:0x0171, B:58:0x0175, B:59:0x017b, B:62:0x019b, B:38:0x00b9, B:39:0x00bc, B:40:0x00be, B:43:0x00d0, B:45:0x00e1, B:46:0x0109, B:48:0x0125, B:50:0x0129, B:24:0x0081, B:25:0x0084, B:27:0x0089, B:32:0x009b, B:34:0x009f, B:17:0x0060, B:18:0x0063, B:20:0x0069, B:21:0x006c, B:14:0x0055), top: B:77:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1 A[Catch: all -> 0x01db, TryCatch #0 {all -> 0x01db, blocks: (B:10:0x001c, B:54:0x016c, B:55:0x016f, B:56:0x0171, B:58:0x0175, B:59:0x017b, B:62:0x019b, B:38:0x00b9, B:39:0x00bc, B:40:0x00be, B:43:0x00d0, B:45:0x00e1, B:46:0x0109, B:48:0x0125, B:50:0x0129, B:24:0x0081, B:25:0x0084, B:27:0x0089, B:32:0x009b, B:34:0x009f, B:17:0x0060, B:18:0x0063, B:20:0x0069, B:21:0x006c, B:14:0x0055), top: B:77:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109 A[Catch: all -> 0x01db, TryCatch #0 {all -> 0x01db, blocks: (B:10:0x001c, B:54:0x016c, B:55:0x016f, B:56:0x0171, B:58:0x0175, B:59:0x017b, B:62:0x019b, B:38:0x00b9, B:39:0x00bc, B:40:0x00be, B:43:0x00d0, B:45:0x00e1, B:46:0x0109, B:48:0x0125, B:50:0x0129, B:24:0x0081, B:25:0x0084, B:27:0x0089, B:32:0x009b, B:34:0x009f, B:17:0x0060, B:18:0x0063, B:20:0x0069, B:21:0x006c, B:14:0x0055), top: B:77:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0175 A[Catch: all -> 0x01db, TryCatch #0 {all -> 0x01db, blocks: (B:10:0x001c, B:54:0x016c, B:55:0x016f, B:56:0x0171, B:58:0x0175, B:59:0x017b, B:62:0x019b, B:38:0x00b9, B:39:0x00bc, B:40:0x00be, B:43:0x00d0, B:45:0x00e1, B:46:0x0109, B:48:0x0125, B:50:0x0129, B:24:0x0081, B:25:0x0084, B:27:0x0089, B:32:0x009b, B:34:0x009f, B:17:0x0060, B:18:0x0063, B:20:0x0069, B:21:0x006c, B:14:0x0055), top: B:77:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019b A[Catch: all -> 0x01db, TryCatch #0 {all -> 0x01db, blocks: (B:10:0x001c, B:54:0x016c, B:55:0x016f, B:56:0x0171, B:58:0x0175, B:59:0x017b, B:62:0x019b, B:38:0x00b9, B:39:0x00bc, B:40:0x00be, B:43:0x00d0, B:45:0x00e1, B:46:0x0109, B:48:0x0125, B:50:0x0129, B:24:0x0081, B:25:0x0084, B:27:0x0089, B:32:0x009b, B:34:0x009f, B:17:0x0060, B:18:0x0063, B:20:0x0069, B:21:0x006c, B:14:0x0055), top: B:77:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[LOOP:0: B:66:0x01d2->B:79:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[LOOP:1: B:29:0x0094->B:81:?, LOOP_END, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToFacebookStories$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchShareSheetViewModel$shareToFacebookStories$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
