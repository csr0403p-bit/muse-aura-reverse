package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.FGI;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.key.HatchStatusTab;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusScreenKt$HatchStatusScreen$selectedTabId$2$1 extends AbstractC7559F3s implements Function0<MutableState<String>> {
    public final /* synthetic */ HatchStatusTab $defaultTab;
    public final /* synthetic */ String $requestedTabId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusScreenKt$HatchStatusScreen$selectedTabId$2$1(String str, HatchStatusTab hatchStatusTab) {
        super(0);
        this.$requestedTabId = str;
        this.$defaultTab = hatchStatusTab;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MutableState<String> invoke() {
        String strA0M = this.$requestedTabId;
        if (strA0M == null) {
            strA0M = FGI.A0M("core:", this.$defaultTab.name());
        }
        return AnonymousClass002.A0P(strA0M);
    }
}
