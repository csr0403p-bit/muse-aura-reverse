package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.feedback.view.FeedbackWriteSheetKt;
import com.facebook.aura.navigation.key.FeedbackWriteSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$FeedbackWriteEntryProviderKt$lambda$-27926667$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$FeedbackWriteEntryProviderKt$lambda$27926667$1 extends AbstractC7559F3s implements G0W<FeedbackWriteSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$FeedbackWriteEntryProviderKt$lambda$27926667$1 INSTANCE = new ComposableSingletons$FeedbackWriteEntryProviderKt$lambda$27926667$1();

    public ComposableSingletons$FeedbackWriteEntryProviderKt$lambda$27926667$1() {
        super(3);
    }

    public final void invoke(FeedbackWriteSheetKey feedbackWriteSheetKey, BFM bfm, int i) {
        FeedbackWriteSheetKt.FeedbackWriteSheet(feedbackWriteSheetKey, bfm, AnonymousClass006.A0E(feedbackWriteSheetKey, i));
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(FeedbackWriteSheetKey feedbackWriteSheetKey, BFM bfm, Integer num) {
        invoke(feedbackWriteSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
