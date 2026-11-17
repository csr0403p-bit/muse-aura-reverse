package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$ConversationScreenDecoration$7$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<String> $displayTitle$delegate;
    public final /* synthetic */ G0V<String, G0U<? super Boolean, Unit>, Unit> $onRenameThread;
    public final /* synthetic */ MutableState<String> $renameText$delegate;
    public final /* synthetic */ MutableState<Boolean> $showRenameDialog$delegate;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;
    public final /* synthetic */ HatchScreen $threadScreen;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$ConversationScreenDecoration$7$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
        public final /* synthetic */ MutableState<String> $displayTitle$delegate;
        public final /* synthetic */ String $previousTitle;
        public final /* synthetic */ MutableState<Boolean> $showRenameDialog$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, MutableState<Boolean> mutableState, MutableState<String> mutableState2) {
            super(1);
            this.$previousTitle = str;
            this.$showRenameDialog$delegate = mutableState;
            this.$displayTitle$delegate = mutableState2;
        }

        public final void invoke(boolean z) {
            if (z) {
                MutableState.A09(false, this.$showRenameDialog$delegate);
            } else {
                this.$displayTitle$delegate.Af8(this.$previousTitle);
            }
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(AnonymousClass001.A1X(bool));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationScreenKt$ConversationScreenDecoration$7$1(HatchScreen hatchScreen, Map<String, String> map, G0V<? super String, ? super G0U<? super Boolean, Unit>, Unit> g0v, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<Boolean> mutableState3) {
        super(0);
        this.$threadScreen = hatchScreen;
        this.$threadLogMetadata = map;
        this.$onRenameThread = g0v;
        this.$renameText$delegate = mutableState;
        this.$displayTitle$delegate = mutableState2;
        this.$showRenameDialog$delegate = mutableState3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.HEADER, this.$threadScreen, HatchComponent.RENAME_CONFIRM_BUTTON, null, this.$threadLogMetadata, null);
        String strA06 = MutableState.A06((MutableState) this.$renameText$delegate);
        if (strA06.length() > 0) {
            String strA05 = MutableState.A05(this.$displayTitle$delegate);
            this.$displayTitle$delegate.Af8(strA06);
            G0V<String, G0U<? super Boolean, Unit>, Unit> g0v = this.$onRenameThread;
            if (g0v != null) {
                g0v.invoke(strA06, new AnonymousClass1(strA05, this.$showRenameDialog$delegate, this.$displayTitle$delegate));
            }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
