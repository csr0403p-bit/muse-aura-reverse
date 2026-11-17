package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.conversation.view.FeedbackMode;
import com.facebook.aura.conversation.view.HatchFeedbackSheetKt;
import com.facebook.aura.navigation.key.HatchFeedbackSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$HatchFeedbackSheetEntryProviderKt$lambda$-504411640$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchFeedbackSheetEntryProviderKt$lambda$504411640$1 extends AbstractC7559F3s implements G0W<HatchFeedbackSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchFeedbackSheetEntryProviderKt$lambda$504411640$1 INSTANCE = new ComposableSingletons$HatchFeedbackSheetEntryProviderKt$lambda$504411640$1();

    public ComposableSingletons$HatchFeedbackSheetEntryProviderKt$lambda$504411640$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchFeedbackSheetKey hatchFeedbackSheetKey, BFM bfm, Integer num) {
        invoke(hatchFeedbackSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(HatchFeedbackSheetKey hatchFeedbackSheetKey, BFM bfm, int i) {
        FeedbackMode feedbackMode;
        C7384Etj.A0Y(hatchFeedbackSheetKey, 0);
        if (hatchFeedbackSheetKey.isGood) {
            feedbackMode = FeedbackMode.GOOD;
        } else {
            feedbackMode = FeedbackMode.BAD;
        }
        HatchFeedbackSheetKt.HatchFeedbackSheet(feedbackMode, hatchFeedbackSheetKey.messageId, bfm, 0);
    }
}
