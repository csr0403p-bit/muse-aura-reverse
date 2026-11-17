package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C9286GCn;
import X.G0V;
import X.HtJ;
import X.HwN;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$activeAvatarTab$2", f = "HatchShareSheetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetViewModel$activeAvatarTab$2 extends AbstractC07127nr implements G0V<AvatarShareTab, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ HatchShareSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetViewModel$activeAvatarTab$2(HatchShareSheetViewModel hatchShareSheetViewModel, HtJ<? super HatchShareSheetViewModel$activeAvatarTab$2> htJ) {
        super(2, htJ);
        this.this$0 = hatchShareSheetViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchShareSheetViewModel$activeAvatarTab$2 hatchShareSheetViewModel$activeAvatarTab$2 = new HatchShareSheetViewModel$activeAvatarTab$2(this.this$0, htJ);
        hatchShareSheetViewModel$activeAvatarTab$2.L$0 = obj;
        return hatchShareSheetViewModel$activeAvatarTab$2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (obj2 != null) {
            C9286GCn.A00(HwN.A01, obj2, (C9286GCn) this.this$0.selectedAvatarTab);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(AvatarShareTab avatarShareTab, HtJ<? super Unit> htJ) {
        return ((HatchShareSheetViewModel$activeAvatarTab$2) create(avatarShareTab, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
