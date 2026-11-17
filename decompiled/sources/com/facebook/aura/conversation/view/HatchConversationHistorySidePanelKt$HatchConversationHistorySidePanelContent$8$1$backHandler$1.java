package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import androidx.compose.runtime.MutableState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$8$1$backHandler$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ MutableState<SidePanelMode> $mode$delegate;
    public final /* synthetic */ Function0<Unit> $onSearchBack;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SidePanelMode.values().length];
            try {
                AnonymousClass002.A13(SidePanelMode.SEARCH, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SidePanelMode.ARCHIVED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(SidePanelMode.DEFAULT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$8$1$backHandler$1(Function0<Unit> function0, MutableState<SidePanelMode> mutableState) {
        super(0);
        this.$onSearchBack = function0;
        this.$mode$delegate = mutableState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        MutableState<SidePanelMode> mutableState = this.$mode$delegate;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        int iOrdinal = mutableState.getValue().ordinal();
        if (iOrdinal == 2) {
            this.$onSearchBack.invoke();
        } else if (iOrdinal == 1) {
            this.$mode$delegate.Af8(SidePanelMode.DEFAULT);
        } else if (iOrdinal != 0) {
            throw new NoWhenBranchMatchedException();
        }
        return true;
    }
}
