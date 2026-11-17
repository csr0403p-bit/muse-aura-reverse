package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SharedGoalEditorKt$SharedGoalEditor$title$2$1 extends AbstractC7559F3s implements Function0<MutableState<String>> {
    public final /* synthetic */ SharedGoal $goal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedGoalEditorKt$SharedGoalEditor$title$2$1(SharedGoal sharedGoal) {
        super(0);
        this.$goal = sharedGoal;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MutableState<String> invoke() {
        return AnonymousClass002.A0P(this.$goal.title);
    }
}
