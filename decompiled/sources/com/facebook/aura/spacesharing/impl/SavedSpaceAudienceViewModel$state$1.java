package com.facebook.aura.spacesharing.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spacesharing.impl.SavedSpaceAudienceViewModel$state$1", f = "SavedSpaceAudienceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SavedSpaceAudienceViewModel$state$1 extends AbstractC07127nr implements G0W<SavedSpaceAudienceState, String, HtJ<? super SavedSpaceAudienceState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public SavedSpaceAudienceViewModel$state$1(HtJ<? super SavedSpaceAudienceViewModel$state$1> htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public final Object invoke(SavedSpaceAudienceState savedSpaceAudienceState, String str, HtJ<? super SavedSpaceAudienceState> htJ) {
        SavedSpaceAudienceViewModel$state$1 savedSpaceAudienceViewModel$state$1 = new SavedSpaceAudienceViewModel$state$1(htJ);
        savedSpaceAudienceViewModel$state$1.L$0 = savedSpaceAudienceState;
        savedSpaceAudienceViewModel$state$1.L$1 = str;
        return savedSpaceAudienceViewModel$state$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        SavedSpaceAudienceState savedSpaceAudienceState = (SavedSpaceAudienceState) this.L$0;
        String str = (String) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return SavedSpaceAudienceViewModelKt.withSelfPhoto(savedSpaceAudienceState, str);
    }
}
