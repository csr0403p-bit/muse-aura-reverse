package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareAvatarToFacebookStories$2", f = "HatchShareSheetViewModel.kt", l = {1213, 1217, 1220, 1229}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetViewModel$shareAvatarToFacebookStories$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchAvatarStoryCard $avatarStoryCard;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $facebookPackage;
    public final /* synthetic */ String $mediaUri;
    public Object L$0;
    public int label;
    public final /* synthetic */ HatchShareSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetViewModel$shareAvatarToFacebookStories$2(HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str, HatchAvatarStoryCard hatchAvatarStoryCard, String str2, HtJ<? super HatchShareSheetViewModel$shareAvatarToFacebookStories$2> htJ) {
        super(2, htJ);
        this.this$0 = hatchShareSheetViewModel;
        this.$context = context;
        this.$mediaUri = str;
        this.$avatarStoryCard = hatchAvatarStoryCard;
        this.$facebookPackage = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchShareSheetViewModel$shareAvatarToFacebookStories$2(this.this$0, this.$context, this.$mediaUri, this.$avatarStoryCard, this.$facebookPackage, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:38:0x00ac, B:39:0x00af, B:41:0x00b3, B:44:0x0100, B:47:0x0118, B:29:0x007b, B:30:0x007e, B:20:0x004b, B:21:0x004e, B:23:0x0053, B:24:0x005b, B:26:0x0063, B:35:0x008b, B:13:0x002a, B:14:0x002d, B:16:0x0033, B:17:0x0036, B:10:0x001f), top: B:60:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:38:0x00ac, B:39:0x00af, B:41:0x00b3, B:44:0x0100, B:47:0x0118, B:29:0x007b, B:30:0x007e, B:20:0x004b, B:21:0x004e, B:23:0x0053, B:24:0x005b, B:26:0x0063, B:35:0x008b, B:13:0x002a, B:14:0x002d, B:16:0x0033, B:17:0x0036, B:10:0x001f), top: B:60:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3 A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:38:0x00ac, B:39:0x00af, B:41:0x00b3, B:44:0x0100, B:47:0x0118, B:29:0x007b, B:30:0x007e, B:20:0x004b, B:21:0x004e, B:23:0x0053, B:24:0x005b, B:26:0x0063, B:35:0x008b, B:13:0x002a, B:14:0x002d, B:16:0x0033, B:17:0x0036, B:10:0x001f), top: B:60:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118 A[Catch: all -> 0x0132, TRY_LEAVE, TryCatch #0 {all -> 0x0132, blocks: (B:38:0x00ac, B:39:0x00af, B:41:0x00b3, B:44:0x0100, B:47:0x0118, B:29:0x007b, B:30:0x007e, B:20:0x004b, B:21:0x004e, B:23:0x0053, B:24:0x005b, B:26:0x0063, B:35:0x008b, B:13:0x002a, B:14:0x002d, B:16:0x0033, B:17:0x0036, B:10:0x001f), top: B:60:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[LOOP:0: B:49:0x0129->B:62:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[LOOP:1: B:32:0x0084->B:64:?, LOOP_END, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareAvatarToFacebookStories$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchShareSheetViewModel$shareAvatarToFacebookStories$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
