package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$activeAvatarTab$1", f = "HatchShareSheetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetViewModel$activeAvatarTab$1 extends AbstractC07127nr implements G0W<AvatarSharePages, AvatarShareTab, HtJ<? super AvatarShareTab>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public HatchShareSheetViewModel$activeAvatarTab$1(HtJ<? super HatchShareSheetViewModel$activeAvatarTab$1> htJ) {
        super(3, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        AvatarSharePages avatarSharePages = (AvatarSharePages) this.L$0;
        AvatarShareTab avatarShareTab = (AvatarShareTab) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (avatarSharePages != null) {
            return avatarSharePages.resolveTab(avatarShareTab);
        }
        return null;
    }

    @Override // X.G0W
    public final Object invoke(AvatarSharePages avatarSharePages, AvatarShareTab avatarShareTab, HtJ<? super AvatarShareTab> htJ) {
        HatchShareSheetViewModel$activeAvatarTab$1 hatchShareSheetViewModel$activeAvatarTab$1 = new HatchShareSheetViewModel$activeAvatarTab$1(htJ);
        hatchShareSheetViewModel$activeAvatarTab$1.L$0 = avatarSharePages;
        hatchShareSheetViewModel$activeAvatarTab$1.L$1 = avatarShareTab;
        return hatchShareSheetViewModel$activeAvatarTab$1.invokeSuspend(Unit.INSTANCE);
    }
}
