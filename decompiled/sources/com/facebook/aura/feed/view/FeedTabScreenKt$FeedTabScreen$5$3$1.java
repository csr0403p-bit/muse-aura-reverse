package com.facebook.aura.feed.view;

import X.AGH;
import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import com.facebook.aura.feedback.FeedbackEntityType;
import com.facebook.aura.feedback.FeedbackVerdict;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.FeedbackWriteSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedTabScreen$5$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $unitId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedTabScreen$5$3$1(AuraNavigator auraNavigator, String str) {
        super(0);
        this.$navigator = auraNavigator;
        this.$unitId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavigator auraNavigator = this.$navigator;
        F0C<C9hr<Object>>[] f0cArr = FeedbackWriteSheetKey.$childSerializers;
        auraNavigator.navigate((AuraNavKey) new FeedbackWriteSheetKey(FeedbackEntityType.FEED_UNIT, this.$unitId, FeedbackVerdict.DOWN.getWireValue(), "feed", AGH.A0E()), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
