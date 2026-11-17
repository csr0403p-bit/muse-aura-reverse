package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ContentViewerBottomActions;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ContentViewerScreenKt$ContentViewerContent$firstItem$1$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ ContentViewerBottomActions $bottomActions;
    public final /* synthetic */ boolean $forceDarkMode;
    public final /* synthetic */ boolean $fullscreenSingleVideo;
    public final /* synthetic */ boolean $interactiveDismissEnabled;
    public final /* synthetic */ Function0<Unit> $onBack;
    public final /* synthetic */ Function0<Unit> $onSendToConversation;
    public final /* synthetic */ AuraNavKey $screenKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentViewerScreenKt$ContentViewerContent$firstItem$1$2(AuraNavKey auraNavKey, Function0<Unit> function0, Function0<Unit> function02, boolean z, boolean z2, boolean z3, ContentViewerBottomActions contentViewerBottomActions, int i) {
        super(2);
        this.$screenKey = auraNavKey;
        this.$onBack = function0;
        this.$onSendToConversation = function02;
        this.$forceDarkMode = z;
        this.$interactiveDismissEnabled = z2;
        this.$fullscreenSingleVideo = z3;
        this.$bottomActions = contentViewerBottomActions;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        ContentViewerScreenKt.ContentViewerContent(this.$screenKey, this.$onBack, this.$onSendToConversation, this.$forceDarkMode, this.$interactiveDismissEnabled, this.$fullscreenSingleVideo, this.$bottomActions, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
